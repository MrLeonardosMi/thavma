package me.alegian.thavma.impl.common.level

import net.minecraft.core.BlockPos
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.state.BlockState

object Excavation {
  private val instances = mutableMapOf<Int, MutableMap<BlockPos, BlockStateProgress>>()

  fun excavate(level: Level, entity: LivingEntity, blockPos: BlockPos, speed: Int) {
    if (level.isClientSide) return
    val blockState = level.getBlockState(blockPos)

    val locations = instances.compute(entity.id) { _, v -> v ?: mutableMapOf() } ?: return
    val stateProgress = locations.compute(blockPos) { _, v ->
      if (v == null || v.blockState != blockState) BlockStateProgress(blockState, speed)
      else BlockStateProgress(blockState, (v.progress + speed).coerceIn(0, 10))
    } ?: return

    level.destroyBlockProgress(-entity.id, blockPos, stateProgress.progress)
  }
}

data class BlockStateProgress(val blockState: BlockState, val progress: Int)