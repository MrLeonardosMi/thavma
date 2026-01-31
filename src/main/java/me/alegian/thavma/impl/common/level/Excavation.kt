package me.alegian.thavma.impl.common.level

import com.mojang.math.Axis
import me.alegian.thavma.impl.client.renderer.ExcavationRenderer
import me.alegian.thavma.impl.client.util.transformOrigin
import me.alegian.thavma.impl.common.util.plus
import me.alegian.thavma.impl.common.util.toVec3
import me.alegian.thavma.impl.common.util.use
import net.minecraft.client.Minecraft
import net.minecraft.core.BlockPos
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket
import net.minecraft.server.level.ServerPlayer
import net.minecraft.world.entity.player.Player
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.LevelEvent
import net.minecraft.world.level.block.state.BlockState
import net.neoforged.neoforge.client.event.RenderPlayerEvent

object Excavation {
  const val RANGE = 10.0
  private val instances = mutableMapOf<Int, ExcavationProgress>()

  fun excavate(level: Level, player: Player, blockPos: BlockPos, speed: Int) {
    if (level.isClientSide || player !is ServerPlayer) return
    val blockState = level.getBlockState(blockPos)

    val progressObject = instances.compute(player.id) { _, v ->
      if (v == null || v.blockPos != blockPos || v.blockState != blockState)
        ExcavationProgress(blockPos, blockState, speed)
      else
        ExcavationProgress(blockPos, blockState, (v.progress + speed).coerceIn(0, 10))
    } ?: return

    level.destroyBlockProgress(-player.id, blockPos, progressObject.progress)

    if (progressObject.progress < 10) return
    player.gameMode.destroyBlock(blockPos)
    // due to the internals of the previous function, we need to separately send sound to the breaking player
    player.connection.send(ClientboundLevelEventPacket(LevelEvent.PARTICLES_DESTROY_BLOCK, blockPos, Block.getId(blockState), false))
  }

  fun renderPlayerPre(event: RenderPlayerEvent.Pre) {
    val poseStack = event.poseStack
    poseStack.use {
      mulPose(Axis.YP.rotationDegrees(-event.entity.yBodyRot))
      // hours of reverse engineering led to this constant
      translate(0.0, 19 / 16.0, 0.0)
      event.renderer.model.translateToHand(event.entity.mainArm, poseStack)

      val targetPos = instances[event.entity.id]?.blockPos?.toVec3()?.toVector3f() ?: return@use
      val cameraPos = Minecraft.getInstance().gameRenderer.mainCamera.position.toVector3f()
      val handPos = transformOrigin() + cameraPos
      ExcavationRenderer.render(event.poseStack, event.multiBufferSource, event.partialTick, event.entity.level().gameTime, targetPos, handPos)
    }
  }
}

data class ExcavationProgress(
  val blockPos: BlockPos,
  val blockState: BlockState,
  val progress: Int
)