package me.alegian.thavma.impl.client.renderer

import com.mojang.blaze3d.vertex.PoseStack
import me.alegian.thavma.impl.client.util.transformOrigin
import me.alegian.thavma.impl.common.util.minus
import me.alegian.thavma.impl.common.util.use
import me.alegian.thavma.impl.init.registries.deferred.Aspects
import net.minecraft.client.Minecraft
import net.minecraft.client.renderer.MultiBufferSource
import net.minecraft.client.renderer.blockentity.BeaconRenderer
import net.minecraft.core.BlockPos
import org.joml.Matrix4f
import org.joml.Quaternionf
import org.joml.Vector3f

object ExcavationRenderer {
  fun render(handPose: PoseStack, bufferSource: MultiBufferSource,partialTick: Float, gameTime: Long, blockPos: BlockPos) {
    handPose.use {
      // go to the tip of the wand
      translate(0.0, -0.6, 0.8)

      // rotate towards target block
      var targetPos = blockPos.center.toVector3f()
      targetPos -= Minecraft.getInstance().gameRenderer.mainCamera.position.toVector3f()
      val wandTipPos = transformOrigin()
      val currentUp = Vector3f(0f, 1f, 0f)
      val localDiff = (targetPos-wandTipPos).mulDirection(handPose.last().pose().invert(Matrix4f()))
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
}