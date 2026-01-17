package me.alegian.thavma.impl.init.data.providers.aspects

import me.alegian.thavma.impl.init.data.providers.T7DataMapProvider
import me.alegian.thavma.impl.init.data.providers.item
import me.alegian.thavma.impl.init.registries.T7DataMaps
import me.alegian.thavma.impl.init.registries.deferred.Aspects
import me.alegian.thavma.impl.init.registries.deferred.T7Items
import net.minecraft.core.HolderLookup
import net.minecraft.tags.ItemTags
import net.minecraft.world.item.Items
import net.neoforged.neoforge.common.Tags

object ToolAspects {
  val ironSword = MineralAspects.iron.mutate(Mutations.sword(ItemAspects.rodsWooden, 3))
  val ironPickaxe = MineralAspects.iron.mutate(Mutations.pickaxe(ItemAspects.rodsWooden, 3))
  val ironAxe = MineralAspects.iron.mutate(Mutations.axe(ItemAspects.rodsWooden, 3))
  val ironShovel = MineralAspects.iron.mutate(Mutations.shovel(ItemAspects.rodsWooden, 3))
  val ironHoe = MineralAspects.iron.mutate(Mutations.hoe(ItemAspects.rodsWooden, 3))

  val thavmiteSword = MineralAspects.thavmite.mutate(Mutations.sword(ItemAspects.rodsWooden, 4))
  val thavmitePickaxe = MineralAspects.thavmite.mutate(Mutations.pickaxe(ItemAspects.rodsWooden, 4))
  val thavmiteAxe = MineralAspects.thavmite.mutate(Mutations.axe(ItemAspects.rodsWooden, 4))
  val thavmiteShovel = MineralAspects.thavmite.mutate(Mutations.shovel(ItemAspects.rodsWooden, 4))
  val thavmiteHoe = MineralAspects.thavmite.mutate(Mutations.hoe(ItemAspects.rodsWooden, 4))
  val thavmiteHammer = MineralAspects.thavmite.mutate(Mutations.hammer(ItemAspects.rodsWooden, 4))

  val goldenSword = MineralAspects.gold.mutate(Mutations.sword(ItemAspects.rodsWooden, 2))
  val goldenPickaxe = MineralAspects.gold.mutate(Mutations.pickaxe(ItemAspects.rodsWooden, 2))
  val goldenAxe = MineralAspects.gold.mutate(Mutations.axe(ItemAspects.rodsWooden, 2))
  val goldenShovel = MineralAspects.gold.mutate(Mutations.shovel(ItemAspects.rodsWooden, 2))
  val goldenHoe = MineralAspects.gold.mutate(Mutations.hoe(ItemAspects.rodsWooden, 2))

  val diamondSword = MineralAspects.diamond.mutate(Mutations.sword(ItemAspects.rodsWooden, 4))
  val diamondPickaxe = MineralAspects.diamond.mutate(Mutations.pickaxe(ItemAspects.rodsWooden, 4))
  val diamondAxe = MineralAspects.diamond.mutate(Mutations.axe(ItemAspects.rodsWooden, 4))
  val diamondShovel = MineralAspects.diamond.mutate(Mutations.shovel(ItemAspects.rodsWooden, 4))
  val diamondHoe = MineralAspects.diamond.mutate(Mutations.hoe(ItemAspects.rodsWooden, 4))

  val netheriteSword = MineralAspects.netherite.mutate(Mutations.sword(ItemAspects.rodsWooden, 6))
  val netheritePickaxe = MineralAspects.netherite.mutate(Mutations.pickaxe(ItemAspects.rodsWooden, 6))
  val netheriteAxe = MineralAspects.netherite.mutate(Mutations.axe(ItemAspects.rodsWooden, 6))
  val netheriteShovel = MineralAspects.netherite.mutate(Mutations.shovel(ItemAspects.rodsWooden, 6))
  val netheriteHoe = MineralAspects.netherite.mutate(Mutations.hoe(ItemAspects.rodsWooden, 6))

  val ironPlating = MineralAspects.iron.mutate(Mutations.PLATING)
  val goldPlating = MineralAspects.gold.mutate(Mutations.PLATING)
  val orichalcumPlating = MineralAspects.orichalcum.mutate(Mutations.PLATING)
  val thavmitePlating = MineralAspects.thavmite.mutate(Mutations.PLATING)

  val arrows = AspectGen().mutate { it.add(Aspects.INSTRUMENTUM, 2) }
  val mace = AspectGen().mutate { it.add(Aspects.METALLUM, 16).add(Aspects.AETHER, 8) }
  val trident = AspectGen().mutate { it.add(Aspects.METALLUM, 12).add(Aspects.AQUA, 8) }
  val bow = AspectGen().mutate { it.add(Aspects.INSTRUMENTUM, 8).add(Aspects.HERBA, 2).add(Aspects.FABRICO, 2) }
  val crossbow = AspectGen().mutate { it.add(Aspects.INSTRUMENTUM, 8).add(Aspects.METALLUM, 4).add(Aspects.FABRICO, 2) }
  val totemOfUndying = AspectGen().mutate { it.add(Aspects.VICTUS, 16).add(Aspects.AETHER, 8) }

  fun gather(datamapProvider: T7DataMapProvider, lookupProvider: HolderLookup.Provider) {
    datamapProvider.builder(T7DataMaps.AspectContent.ITEM).run {
      item(Items.WOODEN_SWORD) {
        it.add(Aspects.HERBA, 8)
          .add(Aspects.INSTRUMENTUM, 1)
      }
      item(Items.WOODEN_PICKAXE) {
        it.add(Aspects.HERBA, 12)
          .add(Aspects.INSTRUMENTUM, 1)
      }
      item(Items.WOODEN_AXE) {
        it.add(Aspects.HERBA, 12)
          .add(Aspects.INSTRUMENTUM, 1)
      }
      item(Items.WOODEN_SHOVEL) {
        it.add(Aspects.HERBA, 4)
          .add(Aspects.INSTRUMENTUM, 1)
      }
      item(Items.WOODEN_HOE) {
        it.add(Aspects.HERBA, 8)
          .add(Aspects.INSTRUMENTUM, 1)
      }

      item(Items.STONE_SWORD) {
        it.add(Aspects.TERRA, 8)
          .add(Aspects.INSTRUMENTUM, 2)
      }
      item(Items.STONE_PICKAXE) {
        it.add(Aspects.TERRA, 12)
          .add(Aspects.INSTRUMENTUM, 2)
      }
      item(Items.STONE_AXE) {
        it.add(Aspects.TERRA, 12)
          .add(Aspects.INSTRUMENTUM, 2)
      }
      item(Items.STONE_SHOVEL) {
        it.add(Aspects.TERRA, 4)
          .add(Aspects.INSTRUMENTUM, 2)
      }
      item(Items.STONE_HOE) {
        it.add(Aspects.TERRA, 8)
          .add(Aspects.INSTRUMENTUM, 2)
      }

      ironSword.save(this, Items.IRON_SWORD)
      ironPickaxe.save(this, Items.IRON_PICKAXE)
      ironAxe.save(this, Items.IRON_AXE)
      ironShovel.save(this, Items.IRON_SHOVEL)
      ironHoe.save(this, Items.IRON_HOE)

      thavmiteSword.save(this, T7Items.THAVMITE_SWORD)
      thavmitePickaxe.save(this, T7Items.THAVMITE_PICKAXE)
      thavmiteAxe.save(this, T7Items.THAVMITE_AXE)
      thavmiteShovel.save(this, T7Items.THAVMITE_SHOVEL)
      thavmiteHoe.save(this, T7Items.THAVMITE_HOE)
      thavmiteHammer.save(this, T7Items.THAVMITE_HAMMER)

      goldenSword.save(this, Items.GOLDEN_SWORD)
      goldenPickaxe.save(this, Items.GOLDEN_PICKAXE)
      goldenAxe.save(this, Items.GOLDEN_AXE)
      goldenShovel.save(this, Items.GOLDEN_SHOVEL)
      goldenHoe.save(this, Items.GOLDEN_HOE)

      diamondSword.save(this, Items.DIAMOND_SWORD)
      diamondPickaxe.save(this, Items.DIAMOND_PICKAXE)
      diamondAxe.save(this, Items.DIAMOND_AXE)
      diamondShovel.save(this, Items.DIAMOND_SHOVEL)
      diamondHoe.save(this, Items.DIAMOND_HOE)

      netheriteSword.save(this, Items.NETHERITE_SWORD)
      netheritePickaxe.save(this, Items.NETHERITE_PICKAXE)
      netheriteAxe.save(this, Items.NETHERITE_AXE)
      netheriteShovel.save(this, Items.NETHERITE_SHOVEL)
      netheriteHoe.save(this, Items.NETHERITE_HOE)

      ironPlating.save(this, T7Items.IRON_PLATING)
      goldPlating.save(this, T7Items.GOLD_PLATING)
      orichalcumPlating.save(this, T7Items.ORICHALCUM_PLATING)
      thavmitePlating.save(this, T7Items.THAVMITE_PLATING)

      arrows.save(this, ItemTags.ARROWS)
      mace.save(this, Items.MACE)
      trident.save(this, Items.TRIDENT)
      bow.save(this, Tags.Items.TOOLS_BOW)
      crossbow.save(this, Tags.Items.TOOLS_CROSSBOW)
      totemOfUndying.save(this, Items.TOTEM_OF_UNDYING)
    }
  }
}
