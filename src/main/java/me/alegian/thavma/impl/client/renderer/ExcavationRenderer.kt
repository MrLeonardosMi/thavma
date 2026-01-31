package me.alegian.thavma.impl.client.renderer

import com.mojang.blaze3d.vertex.PoseStack
import me.alegian.thavma.impl.client.util.rotateX
import me.alegian.thavma.impl.common.level.Excavation
import me.alegian.thavma.impl.common.util.use
import me.alegian.thavma.impl.init.registries.deferred.Aspects
import net.minecraft.client.renderer.MultiBufferSource
import net.minecraft.client.renderer.blockentity.BeaconRenderer

object ExcavationRenderer {
  fun render(handPose: PoseStack, bufferSource: MultiBufferSource,partialTick: Float, gameTime: Long) {
    handPose.use {
      translate(-0.5, 0.0, -0.5)
      rotateX(90)
      translate(0.0, 1.3, 0.1)
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