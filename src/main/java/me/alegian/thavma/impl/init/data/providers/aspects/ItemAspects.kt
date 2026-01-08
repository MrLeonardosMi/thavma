package me.alegian.thavma.impl.init.data.providers.aspects

import me.alegian.thavma.impl.init.data.providers.T7DataMapProvider
import me.alegian.thavma.impl.init.data.providers.item
import me.alegian.thavma.impl.init.registries.T7DataMaps
import me.alegian.thavma.impl.init.registries.deferred.Aspects
import me.alegian.thavma.impl.init.registries.deferred.T7Blocks
import me.alegian.thavma.impl.init.registries.deferred.T7Items
import net.minecraft.core.HolderLookup
import net.minecraft.tags.ItemTags
import net.minecraft.world.item.Items
import net.minecraft.world.level.block.Blocks
import net.neoforged.neoforge.common.Tags

object ItemAspects {
  val leather = AspectGen().mutate { it.add(Aspects.CORPUS, 3) }
  val fabric = AspectGen().mutate { it.add(Aspects.FABRICO, 4).add(Aspects.AETHER, 1) }
  val arcaneLens = AspectGen().mutate { it.add(Aspects.METALLUM, 16).add(Aspects.AETHER, 2).add(Aspects.VITREUS, 2) }
  val armadilloScute = AspectGen().mutate { it.add(Aspects.CORPUS, 2).add(Aspects.PRAEMUNIO, 1) }
  val turtleScute = AspectGen().mutate { it.add(Aspects.CORPUS, 2).add(Aspects.PRAEMUNIO, 1).add(Aspects.AQUA, 1) }

  fun gather(datamapProvider: T7DataMapProvider, lookupProvider: HolderLookup.Provider) {
    datamapProvider.builder(T7DataMaps.AspectContent.ITEM).run {
      leather.save(this, Tags.Items.LEATHERS)
      fabric.save(this, T7Items.FABRIC)
      arcaneLens.save(this, T7Items.ARCANE_LENS)
      armadilloScute.save(this, Items.ARMADILLO_SCUTE)
      turtleScute.save(this, Items.TURTLE_SCUTE)

      item(Items.BLAZE_POWDER) {
        it.add(Aspects.IGNIS, 2)
          .add(Aspects.ALKIMIA, 1)
      }
      item(Tags.Items.GUNPOWDERS) {
        it.add(Aspects.IGNIS, 4)
          .add(Aspects.ALKIMIA, 2)
          .add(Aspects.TERRA, 1)
      }
      item(Tags.Items.RODS_BLAZE) {
        it.add(Aspects.IGNIS, 4)
          .add(Aspects.ALKIMIA, 2)
          .add(Aspects.CORPUS, 2)
      }
      item(Tags.Items.RODS_BREEZE) {
        it.add(Aspects.AETHER, 6)
          .add(Aspects.CORPUS, 2)
      }
      item(Items.WIND_CHARGE) {
        it.add(Aspects.ALKIMIA, 4)
          .add(Aspects.AETHER, 4)
          .add(Aspects.INSTRUMENTUM, 2)
      }
      item(Items.FIRE_CHARGE) {
        it.add(Aspects.ALKIMIA, 4)
          .add(Aspects.IGNIS, 4)
          .add(Aspects.INSTRUMENTUM, 2)
      }
      item(T7Items.ROTTEN_BRAIN) {
        it.add(Aspects.COGNITIO, 12)
          .add(Aspects.HOSTILIS, 2)
          .add(Aspects.CORPUS, 2)
      }
      item(Items.ROTTEN_FLESH) {
        it.add(Aspects.HOSTILIS, 2)
          .add(Aspects.CORPUS, 2)
      }
      item(Items.FLINT) {
        it.add(Aspects.TERRA, 4)
          .add(Aspects.INSTRUMENTUM, 2)
      }
      item(Tags.Items.FEATHERS) {
        it.add(Aspects.INSTRUMENTUM, 1)
          .add(Aspects.CORPUS, 2)
      }
      item(Tags.Items.ENDER_PEARLS) {
        it.add(Aspects.INSTRUMENTUM, 4)
          .add(Aspects.TENEBRAE, 4)
          .add(Aspects.CORPUS, 2)
      }
      item(Items.ENDER_EYE) {
        it.add(Aspects.INSTRUMENTUM, 4)
          .add(Aspects.TENEBRAE, 4)
          .add(Aspects.AETHER, 2)
      }
      item(Tags.Items.STRINGS) {
        it.add(Aspects.CORPUS, 1)
          .add(Aspects.FABRICO, 1)
      }
      item(Items.GHAST_TEAR) {
        it.add(Aspects.HOSTILIS, 4)
          .add(Aspects.ALKIMIA, 4)
      }
      item(Items.SUGAR) {
        it.add(Aspects.HERBA, 2)
          .add(Aspects.VICTUS, 1)
      }
      item(Items.PAPER) {
        it.add(Aspects.COGNITIO, 1)
          .add(Aspects.HERBA, 1)
      }
      item(Items.FIREWORK_ROCKET) {
        it.add(Aspects.IGNIS, 1)
          .add(Aspects.ORNATUS, 1)
      }
      item(Items.FIREWORK_STAR) {
        it.add(Aspects.IGNIS, 1)
          .add(Aspects.ORNATUS, 2)
      }
      item(Items.SNOWBALL) { it.add(Aspects.AQUA, 1) }
      item(Items.NETHER_BRICK) { it.add(Aspects.TERRA, 1).add(Aspects.IGNIS, 1) }
      item(Items.PRISMARINE_CRYSTALS) { it.add(Aspects.VITREUS, 4).add(Aspects.AQUA, 4).add(Aspects.LUX, 2) }
      item(Items.PRISMARINE_SHARD) { it.add(Aspects.AQUA, 2).add(Aspects.TERRA, 2) }
      item(Items.CHORUS_FRUIT) { it.add(Aspects.HERBA, 2).add(Aspects.TENEBRAE, 2) }
      item(Items.POPPED_CHORUS_FRUIT) { it.add(Aspects.HERBA, 2).add(Aspects.TENEBRAE, 2) }
      item(Items.CLAY_BALL) { it.add(Aspects.TERRA, 1).add(Aspects.AQUA, 1) }
      item(Items.BRICK) { it.add(Aspects.TERRA, 1).add(Aspects.IGNIS, 1) }

      item(Tags.Items.RODS_WOODEN) { it.add(Aspects.HERBA, 2) }

      item(Tags.Items.EGGS) { it.add(Aspects.VICTUS, 4).add(Aspects.CORPUS, 2) }

      item(Tags.Items.CROPS_WHEAT) { it.add(Aspects.VICTUS, 2).add(Aspects.HERBA, 2) }

      item(Items.END_CRYSTAL) {
        it.add(Aspects.VITREUS, 14)
          .add(Aspects.IGNIS, 8)
          .add(Aspects.TENEBRAE, 4)
          .add(Aspects.AETHER, 4)
      }

      item(Blocks.NETHER_WART) { it.add(Aspects.HERBA, 2).add(Aspects.IGNIS, 2) }
      item(Blocks.CHORUS_PLANT) { it.add(Aspects.HERBA, 2).add(Aspects.TENEBRAE, 2) }
      item(Blocks.CHORUS_FLOWER) { it.add(Aspects.HERBA, 4).add(Aspects.TENEBRAE, 4) }
      item(Tags.Items.NETHERRACKS) { it.add(Aspects.TERRA, 1).add(Aspects.IGNIS, 1) }
      item(Blocks.MUD) { it.add(Aspects.TERRA, 1).add(Aspects.AQUA, 1) }
      item(Blocks.PACKED_MUD) { it.add(Aspects.TERRA, 2).add(Aspects.HERBA, 2) }
      item(ItemTags.DIRT) { it.add(Aspects.TERRA, 1) }
      item(Blocks.COARSE_DIRT) { it.add(Aspects.TERRA, 1) }
      item(Tags.Items.GRAVELS) { it.add(Aspects.TERRA, 2) }
      item(Tags.Items.STONES) { it.add(Aspects.TERRA, 2) }
      item(Tags.Items.COBBLESTONES) { it.add(Aspects.TERRA, 2) }
      item(Tags.Items.SANDS) { it.add(Aspects.TERRA, 2) }
      item(Blocks.CLAY) { it.add(Aspects.TERRA, 4).add(Aspects.AQUA, 4) }

      item(Blocks.GRASS_BLOCK) {
        it.add(Aspects.TERRA, 1).add(Aspects.HERBA, 1)
      }
      item(Blocks.PODZOL) {
        it.add(Aspects.TERRA, 1).add(Aspects.HERBA, 1)
      }
      item(Blocks.SHORT_GRASS) {
        it.add(Aspects.HERBA, 1)
      }
      item(Blocks.TALL_GRASS) {
        it.add(Aspects.HERBA, 1)
      }

      item(ItemTags.TERRACOTTA) {
        it.add(Aspects.TERRA, 4)
          .add(Aspects.IGNIS, 4)
          .add(Aspects.ORNATUS, 1)
      }
      item(Tags.Items.CONCRETE_POWDERS) {
        it.add(Aspects.TERRA, 3)
      }
      item(Tags.Items.CONCRETES) {
        it.add(Aspects.TERRA, 3)
          .add(Aspects.AQUA, 1)
          .add(Aspects.AETHER, 1)
      }

      item(ItemTags.LEAVES) { it.add(Aspects.HERBA, 2) }
      item(ItemTags.SAPLINGS) { it.add(Aspects.HERBA, 4).add(Aspects.VICTUS, 4) }
      item(ItemTags.LOGS) { it.add(Aspects.HERBA, 8) }
      item(ItemTags.FLOWERS) { it.add(Aspects.HERBA, 4).add(Aspects.VICTUS, 1) }

      item(Blocks.SUGAR_CANE) {
        it.add(Aspects.HERBA, 2)
          .add(Aspects.AQUA, 1)
      }

      item(T7Blocks.TABLE) { it.add(Aspects.HERBA, 12) }
      item(T7Blocks.RESEARCH_TABLE) {
        it.add(Aspects.HERBA, 12)
          .add(Aspects.AETHER, 2)
      }

      item(ItemTags.WOOL) {
        it.add(Aspects.CORPUS, 4).add(Aspects.ORNATUS, 2).add(Aspects.FABRICO, 4)
      }

      item(Tags.Items.GLASS_BLOCKS_CHEAP) { it.add(Aspects.VITREUS, 2) }
      item(Tags.Items.GLASS_PANES) { it.add(Aspects.VITREUS, 1) }

      item(ItemTags.WOOL) { it.add(Aspects.CORPUS, 2).add(Aspects.FABRICO, 4) }

      item(Blocks.TORCH) { it.add(Aspects.LUX, 4) }

      item(Blocks.SNOW) { it.add(Aspects.AQUA, 1) }
      item(Blocks.SNOW_BLOCK) { it.add(Aspects.AQUA, 4) }
      item(Blocks.POWDER_SNOW) { it.add(Aspects.AQUA, 2) }

      item(Blocks.BEDROCK) {
        it.add(Aspects.TERRA, 25)
          .add(Aspects.TENEBRAE, 25)
      }
      item(T7Blocks.ETERNAL_FLAME) {
        it.add(Aspects.LUX, 12)
          .add(Aspects.IGNIS, 8)
      }
      item(T7Blocks.CRACKED_ELEMENTAL_STONE) {
        it.add(Aspects.TERRA, 4)
          .add(Aspects.AETHER, 1)
      }
      item(T7Blocks.ELEMENTAL_STONE_BRICKS) {
        it.add(Aspects.TERRA, 4)
          .add(Aspects.AETHER, 1)
      }
      item(T7Blocks.ELEMENTAL_CORE) {
        it.add(Aspects.TERRA, 6)
          .add(Aspects.AETHER, 2)
      }
      item(Blocks.CRAFTING_TABLE) {
        it.add(Aspects.FABRICO, 8)
          .add(Aspects.HERBA, 4)
      }
      item(T7Blocks.ARCANE_WORKBENCH) {
        it.add(Aspects.FABRICO, 12)
          .add(Aspects.HERBA, 4)
          .add(Aspects.AETHER, 2)
      }
      item(Items.CAULDRON) {
        it.add(Aspects.METALLUM, 56)
          .add(Aspects.ALKIMIA, 8)
      }
      item(T7Blocks.CRUCIBLE) {
        it.add(Aspects.METALLUM, 56)
          .add(Aspects.ALKIMIA, 8)
          .add(Aspects.AETHER, 2)
      }
      item(T7Blocks.SEALING_JAR) {
        it.add(Aspects.VITREUS, 4)
          .add(Aspects.ALKIMIA, 2)
          .add(Aspects.AETHER, 2)
      }
      item(Blocks.TNT) {
        it.add(Aspects.ALKIMIA, 8)
          .add(Aspects.IGNIS, 8)
          .add(Aspects.TERRA, 1)
      }
      item(Blocks.TRIPWIRE_HOOK) {
        it.add(Aspects.MACHINA, 2)
          .add(Aspects.METALLUM, 1)
      }
      item(Blocks.HEAVY_CORE) {
        it.add(Aspects.METALLUM, 16)
          .add(Aspects.INSTRUMENTUM, 6)
      }
      item(Blocks.BAMBOO) { it.add(Aspects.HERBA, 1) }
      item(ItemTags.BAMBOO_BLOCKS) { it.add(Aspects.HERBA, 4) }
    }
  }
}