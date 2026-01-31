package me.alegian.thavma.impl.client.renderer

import com.mojang.blaze3d.vertex.PoseStack
import me.alegian.thavma.impl.common.level.Excavation
import me.alegian.thavma.impl.common.util.minus
import me.alegian.thavma.impl.common.util.use
import me.alegian.thavma.impl.init.registries.deferred.Aspects
import net.minecraft.client.renderer.MultiBufferSource
import net.minecraft.client.renderer.blockentity.BeaconRenderer
import org.joml.Matrix4f
import org.joml.Quaternionf
import org.joml.Vector3f

object ExcavationRenderer {
  fun render(handPose: PoseStack, bufferSource: MultiBufferSource,partialTick: Float, gameTime: Long, targetPos: Vector3f, handPos: Vector3f) {
    handPose.use {
      val currentUp = Vector3f(0f, 1f, 0f)
      val correctUp = handPose.last().pose().invert(Matrix4f()).transformDirection(targetPos-handPos).normalize()
      mulPose(Quaternionf().rotationTo(currentUp, correctUp))

      translate(-0.5, 0.0, -0.5)
      translate(0.0, 0.0, 0.0)
      BeaconRenderer.renderBeaconBeam(
        handPose,
        bufferSource,
        BeaconRenderer.BEAM_LOCATION,
        partialTick,
        1f,
        gameTime,
        0,
        Excavation.RANGE.toInt(),
        Aspects.TERRA.get().color,
        0.3f,
        0.3f
      )
    }
  }
}