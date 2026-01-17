package me.alegian.thavma.impl.init.data.providers.aspects

import me.alegian.thavma.impl.common.aspect.AspectMap
import me.alegian.thavma.impl.init.data.T7BlockFamilies
import me.alegian.thavma.impl.init.data.providers.T7DataMapProvider
import me.alegian.thavma.impl.init.registries.T7DataMaps
import me.alegian.thavma.impl.init.registries.deferred.Aspects
import net.minecraft.core.HolderLookup
import net.minecraft.data.BlockFamilies
import net.minecraft.data.BlockFamily
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.neoforged.neoforge.common.data.DataMapProvider.Builder

object BlockFamilyAspects {
  val acaciaPlanks = AspectGen().mutate { it.add(Aspects.HERBA, 2) }
  val cherryPlanks = AspectGen().mutate { it.add(Aspects.HERBA, 2) }
  val birchPlanks = AspectGen().mutate { it.add(Aspects.HERBA, 2) }
  val crimsonPlanks = AspectGen().mutate { it.add(Aspects.HERBA, 2).add(Aspects.IGNIS, 2) }
  val junglePlanks = AspectGen().mutate { it.add(Aspects.HERBA, 2) }
  val oakPlanks = AspectGen().mutate { it.add(Aspects.HERBA, 2) }
  val darkOakPlanks = AspectGen().mutate { it.add(Aspects.HERBA, 2) }
  val sprucePlanks = AspectGen().mutate { it.add(Aspects.HERBA, 2) }
  val warpedPlanks = AspectGen().mutate { it.add(Aspects.HERBA, 2).add(Aspects.IGNIS, 2) }
  val mangrovePlanks = AspectGen().mutate { it.add(Aspects.HERBA, 2) }
  val bambooPlanks = AspectGen().mutate { it.add(Aspects.HERBA, 2) }
  val bambooMosaic = AspectGen().mutate { it.add(Aspects.HERBA, 2) }
  val mudBricks = AspectGen().mutate { it.add(Aspects.TERRA, 2).add(Aspects.HERBA, 2) }
  val andesite = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val polishedAndesite = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val blackstone = AspectGen().mutate { it.add(Aspects.TERRA, 2).add(Aspects.IGNIS, 2) }
  val polishedBlackstone = AspectGen().mutate { it.add(Aspects.TERRA, 2).add(Aspects.IGNIS, 2) }
  val polishedBlackstoneBricks = AspectGen().mutate { it.add(Aspects.TERRA, 2).add(Aspects.IGNIS, 2) }
  val bricks = AspectGen().mutate { it.add(Aspects.TERRA, 4).add(Aspects.IGNIS, 4) }
  val endStoneBricks = AspectGen().mutate { it.add(Aspects.TERRA, 2).add(Aspects.TENEBRAE, 2) }
  val mossyStoneBricks = AspectGen().mutate { it.add(Aspects.TERRA, 2).add(Aspects.HERBA, 2) }
  val copperBlock = AspectGen().mutate { it.add(Aspects.METALLUM, 36) }
  val cutCopper = AspectGen().mutate { it.add(Aspects.METALLUM, 36) }
  val waxedCopperBlock = AspectGen().mutate { it.add(Aspects.METALLUM, 36) }
  val waxedCutCopper = AspectGen().mutate { it.add(Aspects.METALLUM, 36) }
  val exposedCopper = AspectGen().mutate { it.add(Aspects.METALLUM, 36) }
  val exposedCutCopper = AspectGen().mutate { it.add(Aspects.METALLUM, 36) }
  val waxedExposedCopper = AspectGen().mutate { it.add(Aspects.METALLUM, 36) }
  val waxedExposedCutCopper = AspectGen().mutate { it.add(Aspects.METALLUM, 36) }
  val weatheredCopper = AspectGen().mutate { it.add(Aspects.METALLUM, 36) }
  val weatheredCutCopper = AspectGen().mutate { it.add(Aspects.METALLUM, 36) }
  val waxedWeatheredCopper = AspectGen().mutate { it.add(Aspects.METALLUM, 36) }
  val waxedWeatheredCutCopper = AspectGen().mutate { it.add(Aspects.METALLUM, 36) }
  val oxidizedCopper = AspectGen().mutate { it.add(Aspects.METALLUM, 36) }
  val oxidizedCutCopper = AspectGen().mutate { it.add(Aspects.METALLUM, 36) }
  val waxedOxidizedCopper = AspectGen().mutate { it.add(Aspects.METALLUM, 36) }
  val waxedOxidizedCutCopper = AspectGen().mutate { it.add(Aspects.METALLUM, 36) }
  val cobblestone = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val mossyCobblestone = AspectGen().mutate { it.add(Aspects.TERRA, 2).add(Aspects.HERBA, 2) }
  val diorite = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val polishedDiorite = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val granite = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val polishedGranite = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val tuff = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val polishedTuff = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val tuffBricks = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val netherBricks = AspectGen().mutate { it.add(Aspects.TERRA, 4).add(Aspects.IGNIS, 4) }
  val redNetherBricks = AspectGen().mutate { it.add(Aspects.TERRA, 2).add(Aspects.IGNIS, 2).add(Aspects.HERBA, 2) }
  val prismarine = AspectGen().mutate { it.add(Aspects.AQUA, 4).add(Aspects.TERRA, 4) }
  val purpur = AspectGen().mutate { it.add(Aspects.TENEBRAE, 2).add(Aspects.HERBA, 2) }
  val prismarineBricks = AspectGen().mutate { it.add(Aspects.AQUA, 8).add(Aspects.TERRA, 8) }
  val darkPrismarine = AspectGen().mutate { it.add(Aspects.AQUA, 4).add(Aspects.TERRA, 4) }
  val quartz = AspectGen().mutate { it.add(Aspects.VITREUS, 16).add(Aspects.IGNIS, 4) }
  val smoothQuartz = AspectGen().mutate { it.add(Aspects.VITREUS, 16).add(Aspects.IGNIS, 4) }
  val sandstone = AspectGen().mutate { it.add(Aspects.TERRA, 4) }
  val cutSandstone = AspectGen().mutate { it.add(Aspects.TERRA, 4) }
  val smoothSandstone = AspectGen().mutate { it.add(Aspects.TERRA, 4) }
  val redSandstone = AspectGen().mutate { it.add(Aspects.TERRA, 4) }
  val cutRedSandstone = AspectGen().mutate { it.add(Aspects.TERRA, 4) }
  val smoothRedSandstone = AspectGen().mutate { it.add(Aspects.TERRA, 4) }
  val stone = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val stoneBrick = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val deepslate = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val cobbledDeepslate = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val polishedDeepslate = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val deepslateBricks = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val deepslateTiles = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val greatwoodPlanks = AspectGen().mutate { it.add(Aspects.HERBA, 2) }
  val elementalStone = AspectGen().mutate { it.add(Aspects.TERRA, 4).add(Aspects.AETHER, 1) }

  fun gather(datamapProvider: T7DataMapProvider, lookupProvider: HolderLookup.Provider) =
    datamapProvider.builder(T7DataMaps.AspectContent.ITEM).run {
      blockFamily(BlockFamilies.ACACIA_PLANKS, acaciaPlanks)
      blockFamily(BlockFamilies.CHERRY_PLANKS, cherryPlanks)
      blockFamily(BlockFamilies.BIRCH_PLANKS, birchPlanks)
      blockFamily(BlockFamilies.CRIMSON_PLANKS, crimsonPlanks)
      blockFamily(BlockFamilies.JUNGLE_PLANKS, junglePlanks)
      blockFamily(BlockFamilies.OAK_PLANKS, oakPlanks)
      blockFamily(BlockFamilies.DARK_OAK_PLANKS, darkOakPlanks)
      blockFamily(BlockFamilies.SPRUCE_PLANKS, sprucePlanks)
      blockFamily(BlockFamilies.WARPED_PLANKS, warpedPlanks)
      blockFamily(BlockFamilies.MANGROVE_PLANKS, mangrovePlanks)
      blockFamily(BlockFamilies.BAMBOO_PLANKS, bambooPlanks)
      blockFamily(BlockFamilies.BAMBOO_MOSAIC, bambooMosaic)
      blockFamily(BlockFamilies.MUD_BRICKS, mudBricks)
      blockFamily(BlockFamilies.ANDESITE, andesite)
      blockFamily(BlockFamilies.POLISHED_ANDESITE, polishedAndesite)
      blockFamily(BlockFamilies.BLACKSTONE, blackstone)
      blockFamily(BlockFamilies.POLISHED_BLACKSTONE, polishedBlackstone)
      blockFamily(BlockFamilies.POLISHED_BLACKSTONE_BRICKS, polishedBlackstoneBricks)
      blockFamily(BlockFamilies.BRICKS, bricks)
      blockFamily(BlockFamilies.END_STONE_BRICKS, endStoneBricks)
      blockFamily(BlockFamilies.MOSSY_STONE_BRICKS, mossyStoneBricks)
      blockFamily(BlockFamilies.COPPER_BLOCK, copperBlock)
      blockFamily(BlockFamilies.CUT_COPPER, cutCopper)
      blockFamily(BlockFamilies.WAXED_COPPER_BLOCK, waxedCopperBlock)
      blockFamily(BlockFamilies.WAXED_CUT_COPPER, waxedCutCopper)
      blockFamily(BlockFamilies.EXPOSED_COPPER, exposedCopper)
      blockFamily(BlockFamilies.EXPOSED_CUT_COPPER, exposedCutCopper)
      blockFamily(BlockFamilies.WAXED_EXPOSED_COPPER, waxedExposedCopper)
      blockFamily(BlockFamilies.WAXED_EXPOSED_CUT_COPPER, waxedExposedCutCopper)
      blockFamily(BlockFamilies.WEATHERED_COPPER, weatheredCopper)
      blockFamily(BlockFamilies.WEATHERED_CUT_COPPER, weatheredCutCopper)
      blockFamily(BlockFamilies.WAXED_WEATHERED_COPPER, waxedWeatheredCopper)
      blockFamily(BlockFamilies.WAXED_WEATHERED_CUT_COPPER, waxedWeatheredCutCopper)
      blockFamily(BlockFamilies.OXIDIZED_COPPER, oxidizedCopper)
      blockFamily(BlockFamilies.OXIDIZED_CUT_COPPER, oxidizedCutCopper)
      blockFamily(BlockFamilies.WAXED_OXIDIZED_COPPER, waxedOxidizedCopper)
      blockFamily(BlockFamilies.WAXED_OXIDIZED_CUT_COPPER, waxedOxidizedCutCopper)
      blockFamily(BlockFamilies.COBBLESTONE, cobblestone)
      blockFamily(BlockFamilies.MOSSY_COBBLESTONE, mossyCobblestone)
      blockFamily(BlockFamilies.DIORITE, diorite)
      blockFamily(BlockFamilies.POLISHED_DIORITE, polishedDiorite)
      blockFamily(BlockFamilies.GRANITE, granite)
      blockFamily(BlockFamilies.POLISHED_GRANITE, polishedGranite)
      blockFamily(BlockFamilies.TUFF, tuff)
      blockFamily(BlockFamilies.POLISHED_TUFF, polishedTuff)
      blockFamily(BlockFamilies.TUFF_BRICKS, tuffBricks)
      blockFamily(BlockFamilies.NETHER_BRICKS, netherBricks)
      blockFamily(BlockFamilies.RED_NETHER_BRICKS, redNetherBricks)
      blockFamily(BlockFamilies.PRISMARINE, prismarine)
      blockFamily(BlockFamilies.PURPUR, purpur)
      blockFamily(BlockFamilies.PRISMARINE_BRICKS, prismarineBricks)
      blockFamily(BlockFamilies.DARK_PRISMARINE, darkPrismarine)
      blockFamily(BlockFamilies.QUARTZ, quartz)
      blockFamily(BlockFamilies.SMOOTH_QUARTZ, smoothQuartz)
      blockFamily(BlockFamilies.SANDSTONE, sandstone)
      blockFamily(BlockFamilies.CUT_SANDSTONE, cutSandstone)
      blockFamily(BlockFamilies.SMOOTH_SANDSTONE, smoothSandstone)
      blockFamily(BlockFamilies.RED_SANDSTONE, redSandstone)
      blockFamily(BlockFamilies.CUT_RED_SANDSTONE, cutRedSandstone)
      blockFamily(BlockFamilies.SMOOTH_RED_SANDSTONE, smoothRedSandstone)
      blockFamily(BlockFamilies.STONE, stone)
      blockFamily(BlockFamilies.STONE_BRICK, stoneBrick)
      blockFamily(BlockFamilies.DEEPSLATE, deepslate)
      blockFamily(BlockFamilies.COBBLED_DEEPSLATE, cobbledDeepslate)
      blockFamily(BlockFamilies.POLISHED_DEEPSLATE, polishedDeepslate)
      blockFamily(BlockFamilies.DEEPSLATE_BRICKS, deepslateBricks)
      blockFamily(BlockFamilies.DEEPSLATE_TILES, deepslateTiles)
      blockFamily(T7BlockFamilies.GREATWOOD_PLANKS, greatwoodPlanks)
      blockFamily(T7BlockFamilies.ELEMENTAL_STONE, elementalStone)
    }
}

private fun Builder<AspectMap, Item>.blockFamily(blockFamily: BlockFamily, baseGen: AspectGen) {
  fun saveVariant(block: Block?, mutation: (AspectMap) -> AspectMap) {
    if (block == null) return
    baseGen.mutate(mutation).save(this, block)
  }

  baseGen.save(this, blockFamily.baseBlock)
  saveVariant(blockFamily.get(BlockFamily.Variant.BUTTON), Mutations.BUTTON)
  saveVariant(blockFamily.get(BlockFamily.Variant.CHISELED), Mutations.CHISELED)
  saveVariant(blockFamily.get(BlockFamily.Variant.CRACKED), Mutations.CRACKED)
  saveVariant(blockFamily.get(BlockFamily.Variant.CUT), Mutations.CUT)
  saveVariant(blockFamily.get(BlockFamily.Variant.DOOR), Mutations.DOOR)
  saveVariant(blockFamily.get(BlockFamily.Variant.CUSTOM_FENCE), Mutations.FENCE)
  saveVariant(blockFamily.get(BlockFamily.Variant.FENCE), Mutations.FENCE)
  saveVariant(blockFamily.get(BlockFamily.Variant.CUSTOM_FENCE_GATE), Mutations.FENCE_GATE)
  saveVariant(blockFamily.get(BlockFamily.Variant.FENCE_GATE), Mutations.FENCE_GATE)
  saveVariant(blockFamily.get(BlockFamily.Variant.MOSAIC), Mutations.MOSAIC)
  saveVariant(blockFamily.get(BlockFamily.Variant.SIGN), Mutations.SIGN)
  saveVariant(blockFamily.get(BlockFamily.Variant.SLAB), Mutations.SLAB)
  saveVariant(blockFamily.get(BlockFamily.Variant.STAIRS), Mutations.STAIRS)
  saveVariant(blockFamily.get(BlockFamily.Variant.PRESSURE_PLATE), Mutations.PRESSURE_PLATE)
  saveVariant(blockFamily.get(BlockFamily.Variant.POLISHED), Mutations.POLISHED)
  saveVariant(blockFamily.get(BlockFamily.Variant.TRAPDOOR), Mutations.TRAPDOOR)
  saveVariant(blockFamily.get(BlockFamily.Variant.WALL), Mutations.WALL)
  saveVariant(blockFamily.get(BlockFamily.Variant.WALL_SIGN), Mutations.WALL_SIGN)
}
