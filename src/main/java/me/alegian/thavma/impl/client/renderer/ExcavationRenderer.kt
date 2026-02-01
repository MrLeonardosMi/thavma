package me.alegian.thavma.impl.client.renderer

import com.mojang.blaze3d.vertex.PoseStack
import com.mojang.math.Axis
import me.alegian.thavma.impl.client.util.transformOrigin
import me.alegian.thavma.impl.common.level.Excavation
import me.alegian.thavma.impl.common.util.minus
import me.alegian.thavma.impl.common.util.use
import me.alegian.thavma.impl.init.registries.deferred.Aspects
import net.minecraft.client.Minecraft
import net.minecraft.client.renderer.MultiBufferSource
import net.minecraft.client.renderer.blockentity.BeaconRenderer
import net.minecraft.world.entity.Entity
import net.minecraft.world.level.ClipContext
import net.minecraft.world.phys.BlockHitResult
import net.neoforged.neoforge.client.event.RenderPlayerEvent
import org.joml.Matrix4f
import org.joml.Quaternionf
import org.joml.Vector3f

object ExcavationRenderer {
  val renderers = mutableSetOf<Int>()

  fun renderPlayerPre(event: RenderPlayerEvent.Pre) {
    if (!renderers.contains(event.entity.id)) return
    val hitPos = CachedHitResult.get(event.entity).hitResult.location.toVector3f()

    val poseStack = event.poseStack
    poseStack.use {
      mulPose(Axis.YP.rotationDegrees(-event.entity.yBodyRot))
      // go to arm pivot point (hours of reverse engineering led to this constant)
      translate(0.0, 19 / 16.0, 0.0)
      event.renderer.model.translateToHand(event.entity.mainArm, poseStack)

      render(event.poseStack, event.multiBufferSource, event.partialTick, event.entity.level().gameTime, hitPos)
    }
  }

  fun render(handPose: PoseStack, bufferSource: MultiBufferSource, partialTick: Float, gameTime: Long, hitPos: Vector3f) {
    handPose.use {
      // go to the tip of the wand
      translate(0.0, -0.6, 0.8)

      // rotate towards target block
      val targetPos = hitPos - Minecraft.getInstance().gameRenderer.mainCamera.position.toVector3f()
      val wandTipPos = transformOrigin()
      val currentUp = Vector3f(0f, 1f, 0f)
      val localDiff = (targetPos - wandTipPos).mulDirection(handPose.last().pose().invert(Matrix4f()))
      val correctUp = localDiff.normalize(Vector3f())
      mulPose(Quaternionf().rotationTo(currentUp, correctUp))

      // undo built-in translation of beacon
      translate(-0.5, 0.0, -0.5)
      BeaconRenderer.renderBeaconBeam(
        handPose,
        bufferSource,
        BeaconRenderer.BEAM_LOCATION,
        partialTick,
        1f,
        gameTime,
        0,
        localDiff.length().toInt(),
        Aspects.TERRA.get().color,
        0.3f,
        0.3f
      )
    }
  }

  private data class CachedHitResult(val tick: Long, val hitResult: BlockHitResult) {
    companion object {
      private val hitResults = mutableMapOf<Int, CachedHitResult>()

      fun get(entity: Entity): CachedHitResult {
        val level = entity.level()
        val old = hitResults[entity.id]
        if (old == null || old.tick != level.gameTime) {
          val from = entity.eyePosition
          val to = from.add(entity.getViewVector(0f).scale(Excavation.RANGE))
          val hitresult = level.clip(ClipContext(from, to, ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
          val newCache = CachedHitResult(level.gameTime, hitresult)
          hitResults[entity.id] = newCache
          return newCache
        } else
          return old
      }
    }
  }
}