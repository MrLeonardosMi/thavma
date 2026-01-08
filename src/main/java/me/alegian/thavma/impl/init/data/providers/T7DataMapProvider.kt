package me.alegian.thavma.impl.init.data.providers

import me.alegian.thavma.impl.common.aspect.AspectMap
import me.alegian.thavma.impl.common.item.itemResourceKey
import me.alegian.thavma.impl.init.data.providers.aspects.*
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.data.BlockFamily
import net.minecraft.data.PackOutput
import net.minecraft.resources.ResourceKey
import net.minecraft.tags.TagKey
import net.minecraft.world.entity.EntityType
import net.minecraft.world.item.Item
import net.minecraft.world.level.ItemLike
import net.minecraft.world.level.block.Block
import net.neoforged.neoforge.common.data.DataMapProvider
import net.neoforged.neoforge.common.data.DataMapProvider.Builder
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import java.util.function.Supplier

class T7DataMapProvider(packOutput: PackOutput, lookupProvider: CompletableFuture<HolderLookup.Provider>) :
  DataMapProvider(packOutput, lookupProvider) {
  override fun gather(lookupProvider: HolderLookup.Provider) {
    AspectRelations.gather(this)

    ItemAspects.gather(this, lookupProvider)
    EntityAspects.gather(this, lookupProvider)
    MineralAspects.gather(this, lookupProvider)
    ToolAspects.gather(this, lookupProvider)
    ArmorAspects.gather(this, lookupProvider)
    BlockFamilyAspects.gather(this, lookupProvider)
  }
}

fun Builder<AspectMap, Item>.blockFamily(blockFamily: BlockFamily, builderConsumer: Consumer<AspectMap.Builder>) {
  val aspectBuilder = AspectMap.builder()
  builderConsumer.accept(aspectBuilder)
  val aspects = aspectBuilder.build()

  fun addFamilyVariant(block: Block?, multiplier: Number) {
    if (block == null) return
    add(block.itemResourceKey, aspects.scale(multiplier), false)
  }

  addFamilyVariant(blockFamily.baseBlock, 1)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.BUTTON), 1)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.CHISELED), 1)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.CRACKED), 1)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.CUT), 1)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.DOOR), 2)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.CUSTOM_FENCE), 1.5)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.FENCE), 1.5)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.CUSTOM_FENCE_GATE), 4)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.FENCE_GATE), 4)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.MOSAIC), 1)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.SIGN), 2)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.SLAB), 0.5)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.STAIRS), 1)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.PRESSURE_PLATE), 2)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.POLISHED), 1)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.TRAPDOOR), 3)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.WALL), 1)
  addFamilyVariant(blockFamily.get(BlockFamily.Variant.WALL_SIGN), 2)
}

fun Builder<AspectMap, Item>.item(item: ItemLike, builderConsumer: Consumer<AspectMap.Builder>) {
  val aspectBuilder = AspectMap.builder()
  builderConsumer.accept(aspectBuilder)
  add(item.itemResourceKey, aspectBuilder.build(), false)
}

fun <T : Item> Builder<AspectMap, Item>.item(sup: Supplier<T>, builderConsumer: Consumer<AspectMap.Builder>) =
  item(sup.get(), builderConsumer)

fun Builder<AspectMap, Item>.item(tag: TagKey<Item>, builderConsumer: Consumer<AspectMap.Builder>) {
  val aspectBuilder = AspectMap.builder()
  builderConsumer.accept(aspectBuilder)
  add(tag, aspectBuilder.build(), false)
}

fun Builder<AspectMap, EntityType<*>>.entity(entityType: EntityType<*>, builderConsumer: Consumer<AspectMap.Builder>) {
  val aspectBuilder = AspectMap.builder()
  builderConsumer.accept(aspectBuilder)
  add(key(entityType), aspectBuilder.build(), false)
}

fun <T : EntityType<*>> Builder<AspectMap, EntityType<*>>.entity(sup: Supplier<T>, builderConsumer: Consumer<AspectMap.Builder>) =
  entity(sup.get(), builderConsumer)

fun Builder<AspectMap, EntityType<*>>.entity(tag: TagKey<EntityType<*>>, builderConsumer: Consumer<AspectMap.Builder>) {
  val aspectBuilder = AspectMap.builder()
  builderConsumer.accept(aspectBuilder)
  add(tag, aspectBuilder.build(), false)
}

private fun key(entityType: EntityType<*>): ResourceKey<EntityType<*>> {
  return BuiltInRegistries.ENTITY_TYPE.getResourceKey(entityType).orElseThrow()
}
