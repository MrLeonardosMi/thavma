package me.alegian.thavma.impl.client.renderer

import com.mojang.blaze3d.vertex.PoseStack
import me.alegian.thavma.impl.common.level.Excavation
import me.alegian.thavma.impl.common.util.toVec3
import me.alegian.thavma.impl.common.util.use
import me.alegian.thavma.impl.init.registries.deferred.Aspects
import net.minecraft.client.renderer.MultiBufferSource
import net.minecraft.client.renderer.blockentity.BeaconRenderer
import net.minecraft.core.BlockPos
import org.joml.Quaternionf
import org.joml.Vector3f

object ExcavationRenderer {
  fun render(handPose: PoseStack, bufferSource: MultiBufferSource,partialTick: Float, gameTime: Long, targetBlockPos: BlockPos) {
    handPose.use {
      translate(-0.5, 0.0, -0.5)

      val currentUp = Vector3f(0f, 1f, 0f)
      val targetDir = Vector3f(targetBlockPos.toVec3().toVector3f()).normalize()
      mulPose(Quaternionf().rotationTo(currentUp, targetDir))

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