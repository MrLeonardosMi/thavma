package me.alegian.thavma.impl.init.data.providers.aspects

import me.alegian.thavma.impl.init.data.providers.T7DataMapProvider
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
  val blazePowder = AspectGen().mutate { it.add(Aspects.IGNIS, 2).add(Aspects.ALKIMIA, 1) }
  val gunpowders = AspectGen().mutate { it.add(Aspects.IGNIS, 4).add(Aspects.ALKIMIA, 2).add(Aspects.TERRA, 1) }
  val rodsBlaze = AspectGen().mutate { it.add(Aspects.IGNIS, 4).add(Aspects.ALKIMIA, 2).add(Aspects.CORPUS, 2) }
  val rodsBreeze = AspectGen().mutate { it.add(Aspects.AETHER, 6).add(Aspects.CORPUS, 2) }
  val windCharge = AspectGen().mutate { it.add(Aspects.ALKIMIA, 4).add(Aspects.AETHER, 4).add(Aspects.INSTRUMENTUM, 2) }
  val fireCharge = AspectGen().mutate { it.add(Aspects.ALKIMIA, 4).add(Aspects.IGNIS, 4).add(Aspects.INSTRUMENTUM, 2) }
  val rottenBrain = AspectGen().mutate { it.add(Aspects.COGNITIO, 12).add(Aspects.HOSTILIS, 2).add(Aspects.CORPUS, 2) }
  val rottenFlesh = AspectGen().mutate { it.add(Aspects.HOSTILIS, 2).add(Aspects.CORPUS, 2) }
  val flint = AspectGen().mutate { it.add(Aspects.TERRA, 4).add(Aspects.INSTRUMENTUM, 2) }
  val feathers = AspectGen().mutate { it.add(Aspects.INSTRUMENTUM, 1).add(Aspects.CORPUS, 2) }
  val enderPearls = AspectGen().mutate { it.add(Aspects.INSTRUMENTUM, 4).add(Aspects.TENEBRAE, 4).add(Aspects.CORPUS, 2) }
  val enderEye = AspectGen().mutate { it.add(Aspects.INSTRUMENTUM, 4).add(Aspects.TENEBRAE, 4).add(Aspects.AETHER, 2) }
  val strings = AspectGen().mutate { it.add(Aspects.CORPUS, 1).add(Aspects.FABRICO, 1) }
  val ghastTear = AspectGen().mutate { it.add(Aspects.HOSTILIS, 4).add(Aspects.ALKIMIA, 4) }
  val sugar = AspectGen().mutate { it.add(Aspects.HERBA, 2).add(Aspects.VICTUS, 1) }
  val paper = AspectGen().mutate { it.add(Aspects.COGNITIO, 1).add(Aspects.HERBA, 1) }
  val fireworkRocket = AspectGen().mutate { it.add(Aspects.IGNIS, 1).add(Aspects.ORNATUS, 1) }
  val fireworkStar = AspectGen().mutate { it.add(Aspects.IGNIS, 1).add(Aspects.ORNATUS, 2) }
  val snowball = AspectGen().mutate { it.add(Aspects.AQUA, 1) }
  val netherBrick = AspectGen().mutate { it.add(Aspects.TERRA, 1).add(Aspects.IGNIS, 1) }
  val prismarineCrystals = AspectGen().mutate { it.add(Aspects.VITREUS, 4).add(Aspects.AQUA, 4).add(Aspects.LUX, 2) }
  val prismarineShard = AspectGen().mutate { it.add(Aspects.AQUA, 2).add(Aspects.TERRA, 2) }
  val chorusFruit = AspectGen().mutate { it.add(Aspects.HERBA, 2).add(Aspects.TENEBRAE, 2) }
  val poppedChorusFruit = AspectGen().mutate { it.add(Aspects.HERBA, 2).add(Aspects.TENEBRAE, 2) }
  val clayBall = AspectGen().mutate { it.add(Aspects.TERRA, 1).add(Aspects.AQUA, 1) }
  val brick = AspectGen().mutate { it.add(Aspects.TERRA, 1).add(Aspects.IGNIS, 1) }
  val rodsWooden = AspectGen().mutate { it.add(Aspects.HERBA, 2) }
  val eggs = AspectGen().mutate { it.add(Aspects.VICTUS, 4).add(Aspects.CORPUS, 2) }
  val cropsWheat = AspectGen().mutate { it.add(Aspects.VICTUS, 2).add(Aspects.HERBA, 2) }
  val endCrystal = AspectGen().mutate { it.add(Aspects.VITREUS, 14).add(Aspects.IGNIS, 8).add(Aspects.TENEBRAE, 4).add(Aspects.AETHER, 4) }
  val netherWart = AspectGen().mutate { it.add(Aspects.HERBA, 2).add(Aspects.IGNIS, 2) }
  val chorusPlant = AspectGen().mutate { it.add(Aspects.HERBA, 2).add(Aspects.TENEBRAE, 2) }
  val chorusFlower = AspectGen().mutate { it.add(Aspects.HERBA, 4).add(Aspects.TENEBRAE, 4) }
  val netherracks = AspectGen().mutate { it.add(Aspects.TERRA, 1).add(Aspects.IGNIS, 1) }
  val mud = AspectGen().mutate { it.add(Aspects.TERRA, 1).add(Aspects.AQUA, 1) }
  val packedMud = AspectGen().mutate { it.add(Aspects.TERRA, 2).add(Aspects.HERBA, 2) }
  val dirt = AspectGen().mutate { it.add(Aspects.TERRA, 1) }
  val coarseDirt = AspectGen().mutate { it.add(Aspects.TERRA, 1) }
  val gravels = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val stones = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val cobblestones = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val sands = AspectGen().mutate { it.add(Aspects.TERRA, 2) }
  val clay = AspectGen().mutate { it.add(Aspects.TERRA, 4).add(Aspects.AQUA, 4) }
  val grassBlock = AspectGen().mutate { it.add(Aspects.TERRA, 1).add(Aspects.HERBA, 1) }
  val podzol = AspectGen().mutate { it.add(Aspects.TERRA, 1).add(Aspects.HERBA, 1) }
  val shortGrass = AspectGen().mutate { it.add(Aspects.HERBA, 1) }
  val tallGrass = AspectGen().mutate { it.add(Aspects.HERBA, 1) }
  val terracotta = AspectGen().mutate { it.add(Aspects.TERRA, 4).add(Aspects.IGNIS, 4).add(Aspects.ORNATUS, 1) }
  val concretePowders = AspectGen().mutate { it.add(Aspects.TERRA, 3) }
  val concretes = AspectGen().mutate { it.add(Aspects.TERRA, 3).add(Aspects.AQUA, 1).add(Aspects.AETHER, 1) }
  val leaves = AspectGen().mutate { it.add(Aspects.HERBA, 2) }
  val saplings = AspectGen().mutate { it.add(Aspects.HERBA, 4).add(Aspects.VICTUS, 4) }
  val logs = AspectGen().mutate { it.add(Aspects.HERBA, 8) }
  val flowers = AspectGen().mutate { it.add(Aspects.HERBA, 4).add(Aspects.VICTUS, 1) }
  val sugarCane = AspectGen().mutate { it.add(Aspects.HERBA, 2).add(Aspects.AQUA, 1) }
  val table = AspectGen().mutate { it.add(Aspects.HERBA, 12) }
  val researchTable = AspectGen().mutate { it.add(Aspects.HERBA, 12).add(Aspects.AETHER, 2) }
  val wool1 = AspectGen().mutate { it.add(Aspects.CORPUS, 4).add(Aspects.ORNATUS, 2).add(Aspects.FABRICO, 4) }
  val glassBlocksCheap = AspectGen().mutate { it.add(Aspects.VITREUS, 2) }
  val glassPanes = AspectGen().mutate { it.add(Aspects.VITREUS, 1) }
  val wool2 = AspectGen().mutate { it.add(Aspects.CORPUS, 2).add(Aspects.FABRICO, 4) }
  val torch = AspectGen().mutate { it.add(Aspects.LUX, 4) }
  val snow = AspectGen().mutate { it.add(Aspects.AQUA, 1) }
  val snowBlock = AspectGen().mutate { it.add(Aspects.AQUA, 4) }
  val powderSnow = AspectGen().mutate { it.add(Aspects.AQUA, 2) }
  val bedrock = AspectGen().mutate { it.add(Aspects.TERRA, 25).add(Aspects.TENEBRAE, 25) }
  val eternalFlame = AspectGen().mutate { it.add(Aspects.LUX, 12).add(Aspects.IGNIS, 8) }
  val crackedElementalStone = AspectGen().mutate { it.add(Aspects.TERRA, 4).add(Aspects.AETHER, 1) }
  val elementalStoneBricks = AspectGen().mutate { it.add(Aspects.TERRA, 4).add(Aspects.AETHER, 1) }
  val elementalCore = AspectGen().mutate { it.add(Aspects.TERRA, 6).add(Aspects.AETHER, 2) }
  val craftingTable = AspectGen().mutate { it.add(Aspects.FABRICO, 8).add(Aspects.HERBA, 4) }
  val arcaneWorkbench = AspectGen().mutate { it.add(Aspects.FABRICO, 12).add(Aspects.HERBA, 4).add(Aspects.AETHER, 2) }
  val cauldron = AspectGen().mutate { it.add(Aspects.METALLUM, 56).add(Aspects.ALKIMIA, 8) }
  val crucible = AspectGen().mutate { it.add(Aspects.METALLUM, 56).add(Aspects.ALKIMIA, 8).add(Aspects.AETHER, 2) }
  val sealingJar = AspectGen().mutate { it.add(Aspects.VITREUS, 4).add(Aspects.ALKIMIA, 2).add(Aspects.AETHER, 2) }
  val tnt = AspectGen().mutate { it.add(Aspects.ALKIMIA, 8).add(Aspects.IGNIS, 8).add(Aspects.TERRA, 1) }
  val tripwireHook = AspectGen().mutate { it.add(Aspects.MACHINA, 2).add(Aspects.METALLUM, 1) }
  val heavyCore = AspectGen().mutate { it.add(Aspects.METALLUM, 16).add(Aspects.INSTRUMENTUM, 6) }
  val bamboo = AspectGen().mutate { it.add(Aspects.HERBA, 1) }
  val bambooBlocks = AspectGen().mutate { it.add(Aspects.HERBA, 4) }

  fun gather(datamapProvider: T7DataMapProvider, lookupProvider: HolderLookup.Provider) {
    datamapProvider.builder(T7DataMaps.AspectContent.ITEM).run {
      leather.save(this, Tags.Items.LEATHERS)
      fabric.save(this, T7Items.FABRIC)
      arcaneLens.save(this, T7Items.ARCANE_LENS)
      armadilloScute.save(this, Items.ARMADILLO_SCUTE)
      turtleScute.save(this, Items.TURTLE_SCUTE)
      blazePowder.save(this, Items.BLAZE_POWDER)
      gunpowders.save(this, Tags.Items.GUNPOWDERS)
      rodsBlaze.save(this, Tags.Items.RODS_BLAZE)
      rodsBreeze.save(this, Tags.Items.RODS_BREEZE)
      windCharge.save(this, Items.WIND_CHARGE)
      fireCharge.save(this, Items.FIRE_CHARGE)
      rottenBrain.save(this, T7Items.ROTTEN_BRAIN)
      rottenFlesh.save(this, Items.ROTTEN_FLESH)
      flint.save(this, Items.FLINT)
      feathers.save(this, Tags.Items.FEATHERS)
      enderPearls.save(this, Tags.Items.ENDER_PEARLS)
      enderEye.save(this, Items.ENDER_EYE)
      strings.save(this, Tags.Items.STRINGS)
      ghastTear.save(this, Items.GHAST_TEAR)
      sugar.save(this, Items.SUGAR)
      paper.save(this, Items.PAPER)
      fireworkRocket.save(this, Items.FIREWORK_ROCKET)
      fireworkStar.save(this, Items.FIREWORK_STAR)
      snowball.save(this, Items.SNOWBALL)
      netherBrick.save(this, Items.NETHER_BRICK)
      prismarineCrystals.save(this, Items.PRISMARINE_CRYSTALS)
      prismarineShard.save(this, Items.PRISMARINE_SHARD)
      chorusFruit.save(this, Items.CHORUS_FRUIT)
      poppedChorusFruit.save(this, Items.POPPED_CHORUS_FRUIT)
      clayBall.save(this, Items.CLAY_BALL)
      brick.save(this, Items.BRICK)
      rodsWooden.save(this, Tags.Items.RODS_WOODEN)
      eggs.save(this, Tags.Items.EGGS)
      cropsWheat.save(this, Tags.Items.CROPS_WHEAT)
      endCrystal.save(this, Items.END_CRYSTAL)
      netherWart.save(this, Blocks.NETHER_WART)
      chorusPlant.save(this, Blocks.CHORUS_PLANT)
      chorusFlower.save(this, Blocks.CHORUS_FLOWER)
      netherracks.save(this, Tags.Items.NETHERRACKS)
      mud.save(this, Blocks.MUD)
      packedMud.save(this, Blocks.PACKED_MUD)
      dirt.save(this, ItemTags.DIRT)
      coarseDirt.save(this, Blocks.COARSE_DIRT)
      gravels.save(this, Tags.Items.GRAVELS)
      stones.save(this, Tags.Items.STONES)
      cobblestones.save(this, Tags.Items.COBBLESTONES)
      sands.save(this, Tags.Items.SANDS)
      clay.save(this, Blocks.CLAY)
      grassBlock.save(this, Blocks.GRASS_BLOCK)
      podzol.save(this, Blocks.PODZOL)
      shortGrass.save(this, Blocks.SHORT_GRASS)
      tallGrass.save(this, Blocks.TALL_GRASS)
      terracotta.save(this, ItemTags.TERRACOTTA)
      concretePowders.save(this, Tags.Items.CONCRETE_POWDERS)
      concretes.save(this, Tags.Items.CONCRETES)
      leaves.save(this, ItemTags.LEAVES)
      saplings.save(this, ItemTags.SAPLINGS)
      logs.save(this, ItemTags.LOGS)
      flowers.save(this, ItemTags.FLOWERS)
      sugarCane.save(this, Blocks.SUGAR_CANE)
      table.save(this, T7Blocks.TABLE)
      researchTable.save(this, T7Blocks.RESEARCH_TABLE)
      wool1.save(this, ItemTags.WOOL)
      glassBlocksCheap.save(this, Tags.Items.GLASS_BLOCKS_CHEAP)
      glassPanes.save(this, Tags.Items.GLASS_PANES)
      wool2.save(this, ItemTags.WOOL)
      torch.save(this, Blocks.TORCH)
      snow.save(this, Blocks.SNOW)
      snowBlock.save(this, Blocks.SNOW_BLOCK)
      powderSnow.save(this, Blocks.POWDER_SNOW)
      bedrock.save(this, Blocks.BEDROCK)
      eternalFlame.save(this, T7Blocks.ETERNAL_FLAME)
      crackedElementalStone.save(this, T7Blocks.CRACKED_ELEMENTAL_STONE)
      elementalStoneBricks.save(this, T7Blocks.ELEMENTAL_STONE_BRICKS)
      elementalCore.save(this, T7Blocks.ELEMENTAL_CORE)
      craftingTable.save(this, Blocks.CRAFTING_TABLE)
      arcaneWorkbench.save(this, T7Blocks.ARCANE_WORKBENCH)
      cauldron.save(this, Items.CAULDRON)
      crucible.save(this, T7Blocks.CRUCIBLE)
      sealingJar.save(this, T7Blocks.SEALING_JAR)
      tnt.save(this, Blocks.TNT)
      tripwireHook.save(this, Blocks.TRIPWIRE_HOOK)
      heavyCore.save(this, Blocks.HEAVY_CORE)
      bamboo.save(this, Blocks.BAMBOO)
      bambooBlocks.save(this, ItemTags.BAMBOO_BLOCKS)
    }
  }
}
