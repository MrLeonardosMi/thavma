package me.alegian.thavma.impl.init.data.providers.aspects

import me.alegian.thavma.impl.common.aspect.AspectMap
import me.alegian.thavma.impl.init.data.providers.T7DataMapProvider
import me.alegian.thavma.impl.init.data.providers.item
import me.alegian.thavma.impl.init.registries.T7DataMaps
import me.alegian.thavma.impl.init.registries.deferred.Aspects
import me.alegian.thavma.impl.init.registries.deferred.T7Blocks
import me.alegian.thavma.impl.init.registries.deferred.T7Blocks.INFUSED_DEEPSLATES
import me.alegian.thavma.impl.init.registries.deferred.T7Blocks.INFUSED_STONES
import me.alegian.thavma.impl.init.registries.deferred.T7Items
import me.alegian.thavma.impl.init.registries.deferred.T7Items.SHARDS
import net.minecraft.core.HolderLookup
import net.minecraft.resources.ResourceKey
import net.minecraft.tags.ItemTags
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Items
import net.minecraft.world.level.block.Blocks
import net.neoforged.neoforge.common.Tags
import net.neoforged.neoforge.common.data.DataMapProvider
import java.util.function.UnaryOperator

object MineralAspects {
  val coal = AspectGen().mutate {
    it.add(Aspects.IGNIS, 2)
      .add(Aspects.TERRA, 2)
  }
  val coalOre = coal.mutate(Mutations.ORE)
  val coalBlock = coal.mutate(Mutations.STORAGE_BLOCK_9)

  val copper = AspectGen().mutate {
    it.add(Aspects.METALLUM, 4)
  }
  val rawCopper = copper.mutate(Mutations.RAW)
  val copperOre = copper.mutate(Mutations.ORE)
  val copperBlock = copper.mutate(Mutations.STORAGE_BLOCK_9)
  val rawCopperBlock = rawCopper.mutate(Mutations.STORAGE_BLOCK_9)

  val iron = AspectGen().mutate {
    it.add(Aspects.METALLUM, 8)
  }
  val rawIron = iron.mutate(Mutations.RAW)
  val ironOre = iron.mutate(Mutations.ORE)
  val ironBlock = iron.mutate(Mutations.STORAGE_BLOCK_9)
  val rawIronBlock = rawIron.mutate(Mutations.STORAGE_BLOCK_9)

  val gold = AspectGen().mutate {
    it.add(Aspects.METALLUM, 4)
  }
  val rawGold = gold.mutate(Mutations.RAW)
  val goldOre = gold.mutate(Mutations.ORE)
  val goldBlock = gold.mutate(Mutations.STORAGE_BLOCK_9)
  val rawGoldBlock = rawGold.mutate(Mutations.STORAGE_BLOCK_9)

  fun gather(datamapProvider: T7DataMapProvider, lookupProvider: HolderLookup.Provider) {
    datamapProvider.builder(T7DataMaps.AspectContent.ITEM).run {
      coal.save(this, ItemTags.COALS)
      coalOre.save(this, Tags.Items.ORES_COAL)
      coalBlock.save(this, Tags.Items.STORAGE_BLOCKS_COAL)

      copper.save(this, Tags.Items.INGOTS_COPPER)
      rawCopper.save(this, Tags.Items.RAW_MATERIALS_COPPER)
      copperOre.save(this, Tags.Items.ORES_COPPER)
      copperBlock.save(this, Tags.Items.STORAGE_BLOCKS_COPPER)
      rawCopperBlock.save(this, Tags.Items.STORAGE_BLOCKS_RAW_COPPER)

      iron.save(this, Tags.Items.INGOTS_IRON)
      rawIron.save(this, Tags.Items.RAW_MATERIALS_IRON)
      ironOre.save(this, Tags.Items.ORES_IRON)
      ironBlock.save(this, Tags.Items.STORAGE_BLOCKS_IRON)
      rawIronBlock.save(this, Tags.Items.STORAGE_BLOCKS_RAW_IRON)

      gold.save(this, Tags.Items.INGOTS_GOLD)
      rawGold.save(this, Tags.Items.RAW_MATERIALS_GOLD)
      goldOre.save(this, Tags.Items.ORES_GOLD)
      goldBlock.save(this, Tags.Items.STORAGE_BLOCKS_GOLD)
      rawGoldBlock.save(this, Tags.Items.STORAGE_BLOCKS_RAW_GOLD)

      item(T7Blocks.THAVMITE_BLOCK) {
        it.add(Aspects.METALLUM, 72)
          .add(Aspects.AETHER, 36)
      }
      item(T7Blocks.ORICHALCUM_BLOCK) {
        it.add(Aspects.METALLUM, 36)
          .add(Aspects.AETHER, 36)
      }
      item(Tags.Items.ORES_DIAMOND) {
        it.add(Aspects.VITREUS, 8)
          .add(Aspects.TERRA, 4)
      }
      item(Tags.Items.STORAGE_BLOCKS_DIAMOND) {
        it.add(Aspects.VITREUS, 72)
      }
      item(Tags.Items.ORES_EMERALD) {
        it.add(Aspects.VITREUS, 8)
          .add(Aspects.TERRA, 4)
      }
      item(Tags.Items.STORAGE_BLOCKS_EMERALD) {
        it.add(Aspects.VITREUS, 72)
      }
      item(Tags.Items.ORES_NETHERITE_SCRAP) {
        it.add(Aspects.METALLUM, 2)
          .add(Aspects.TERRA, 6)
          .add(Aspects.TENEBRAE, 1)
      }
      item(Tags.Items.STORAGE_BLOCKS_NETHERITE) {
        it.add(Aspects.METALLUM, 144)
          .add(Aspects.TENEBRAE, 36)
      }
      item(Blocks.GLOWSTONE) {
        it.add(Aspects.LUX, 16)
          .add(Aspects.TERRA, 4)
      }
      item(Tags.Items.ORES_QUARTZ) {
        it.add(Aspects.VITREUS, 4)
          .add(Aspects.TERRA, 4)
          .add(Aspects.IGNIS, 1)
      }
      item(Blocks.QUARTZ_BLOCK) {
        it.add(Aspects.VITREUS, 16)
          .add(Aspects.IGNIS, 4)
      }
      item(Tags.Items.ORES_LAPIS) {
        it.add(Aspects.VITREUS, 4)
          .add(Aspects.TERRA, 4)
          .add(Aspects.COGNITIO, 1)
      }
      item(Tags.Items.STORAGE_BLOCKS_LAPIS) {
        it.add(Aspects.VITREUS, 36)
          .add(Aspects.COGNITIO, 9)
      }
      item(Tags.Items.ORES_REDSTONE) {
        it.add(Aspects.MACHINA, 1)
          .add(Aspects.TERRA, 1)
      }
      item(Tags.Items.STORAGE_BLOCKS_REDSTONE) {
        it.add(Aspects.MACHINA, 9)
          .add(Aspects.TERRA, 9)
      }
      item(Blocks.AMETHYST_BLOCK) {
        it.add(Aspects.VITREUS, 16)
      }

      for (infusedBlock in (INFUSED_STONES.values + INFUSED_DEEPSLATES.values)) {
        item(infusedBlock) {
          it.add(infusedBlock.get().getAspect(), 4)
        }
      }

      item(T7Items.THAVMITE_INGOT) {
        it.add(Aspects.METALLUM, 8)
          .add(Aspects.AETHER, 4)
      }
      item(T7Items.ORICHALCUM_INGOT) {
        it.add(Aspects.METALLUM, 4)
          .add(Aspects.INSTRUMENTUM, 4)
      }
      item(Tags.Items.GEMS_DIAMOND) {
        it.add(Aspects.VITREUS, 8)
      }
      item(Tags.Items.GEMS_EMERALD) {
        it.add(Aspects.VITREUS, 8)
      }
      item(Items.NETHERITE_SCRAP) {
        it.add(Aspects.METALLUM, 2)
          .add(Aspects.TERRA, 2)
          .add(Aspects.TENEBRAE, 1)
      }
      item(Tags.Items.INGOTS_NETHERITE) {
        it.add(Aspects.METALLUM, 16)
          .add(Aspects.TENEBRAE, 4)
      }
      item(Tags.Items.DUSTS_GLOWSTONE) {
        it.add(Aspects.LUX, 4)
          .add(Aspects.TERRA, 1)
      }
      item(Tags.Items.GEMS_QUARTZ) {
        it.add(Aspects.VITREUS, 4)
          .add(Aspects.IGNIS, 1)
      }
      item(Tags.Items.GEMS_LAPIS) {
        it.add(Aspects.VITREUS, 4)
          .add(Aspects.COGNITIO, 1)
      }
      item(Tags.Items.DUSTS_REDSTONE) {
        it.add(Aspects.MACHINA, 1)
          .add(Aspects.TERRA, 1)
      }
      item(Tags.Items.GEMS_AMETHYST) {
        it.add(Aspects.VITREUS, 4)
      }

      for (shard in SHARDS.values) {
        item(shard) {
          it.add(shard.get().aspect, 4)
        }
      }

      item(Tags.Items.NUGGETS) {
        it.add(Aspects.TERRA, 1)
      }
    }
  }

  class AspectGen(private var aspects: AspectMap) {
    constructor() : this(AspectMap())

    fun mutate(mutation: UnaryOperator<AspectMap>) =
      AspectGen(mutation.apply(aspects))

    fun <T> save(builder: DataMapProvider.Builder<AspectMap, T>, tag: TagKey<T>){
      builder.add(tag, aspects, false)
    }

    fun <T> save(builder: DataMapProvider.Builder<AspectMap, T>, key: ResourceKey<T>){
      builder.add(key, aspects, false)
    }
  }

  object Mutations {
    val ORE = { it: AspectMap ->
      it.add(Aspects.TERRA, 2)
    }
    val RAW = { it: AspectMap ->
      it.scale(0.5).add(Aspects.TERRA, 2)
    }
    val STORAGE_BLOCK_4 = { it: AspectMap ->
      it.scale(4)
    }
    val STORAGE_BLOCK_9 = { it: AspectMap ->
      it.scale(9)
    }
  }
}