package me.alegian.thavma.impl.init.data.providers.aspects

import me.alegian.thavma.impl.init.data.providers.T7DataMapProvider
import me.alegian.thavma.impl.init.data.providers.item
import me.alegian.thavma.impl.init.registries.T7DataMaps
import me.alegian.thavma.impl.init.registries.T7Tags
import me.alegian.thavma.impl.init.registries.deferred.Aspects
import me.alegian.thavma.impl.init.registries.deferred.T7Items
import net.minecraft.core.HolderLookup
import net.minecraft.world.item.Items

object ArmorAspects {
  val ironHelmet = MineralAspects.iron.mutate(Mutations.helmet(4))
  val ironChestplate = MineralAspects.iron.mutate(Mutations.chestplate(12))
  val ironLeggings = MineralAspects.iron.mutate(Mutations.leggings(10))
  val ironBoots = MineralAspects.iron.mutate(Mutations.boots(4))
  val ironHorseArmor = MineralAspects.iron.mutate(Mutations.horseArmor(6))

  private val chainBase = MineralAspects.iron.mutate { it.scale(0.5) }
  val chainHelmet = chainBase.mutate(Mutations.helmet(4))
  val chainChestplate = chainBase.mutate(Mutations.chestplate(10))
  val chainLeggings = chainBase.mutate(Mutations.leggings(8))
  val chainBoots = chainBase.mutate(Mutations.boots(2))

  val leatherHelmet = ItemAspects.leather.mutate(Mutations.helmet(2))
  val leatherChestplate = ItemAspects.leather.mutate(Mutations.chestplate(6))
  val leatherLeggings = ItemAspects.leather.mutate(Mutations.leggings(4))
  val leatherBoots = ItemAspects.leather.mutate(Mutations.boots(2))
  val leatherHorseArmor = ItemAspects.leather.mutate(Mutations.horseArmor(4))

  val goggles = ItemAspects.arcaneLens.mutate { it.scale(2) }.add(MineralAspects.orichalcum.mutate { it.scale(2) })
  val apprenticeChestplate = ItemAspects.fabric.mutate(Mutations.chestplate(2))
  val apprenticeLeggings = ItemAspects.fabric.mutate(Mutations.leggings(2))
  val apprenticeBoots = ItemAspects.fabric.mutate(Mutations.boots(2))

  fun gather(datamapProvider: T7DataMapProvider, lookupProvider: HolderLookup.Provider) {
    datamapProvider.builder(T7DataMaps.AspectContent.ITEM).run {
      leatherHelmet.save(this, Items.LEATHER_HELMET)
      leatherChestplate.save(this, Items.LEATHER_CHESTPLATE)
      leatherLeggings.save(this, Items.LEATHER_LEGGINGS)
      leatherBoots.save(this, Items.LEATHER_BOOTS)
      leatherHorseArmor.save(this, Items.LEATHER_HORSE_ARMOR)

      goggles.save(this, T7Tags.Items.GOGGLES)
      apprenticeChestplate.save(this, T7Items.APPRENTICE_CHESTPLATE)
      apprenticeLeggings.save(this, T7Items.APPRENTICE_LEGGINGS)
      apprenticeBoots.save(this, T7Items.APPRENTICE_BOOTS)

      chainHelmet.save(this, Items.CHAINMAIL_HELMET)
      chainChestplate.save(this, Items.CHAINMAIL_CHESTPLATE)
      chainLeggings.save(this, Items.CHAINMAIL_LEGGINGS)
      chainBoots.save(this, Items.CHAINMAIL_BOOTS)

      ironHelmet.save(this, Items.IRON_HELMET)
      ironChestplate.save(this, Items.IRON_CHESTPLATE)
      ironLeggings.save(this, Items.IRON_LEGGINGS)
      ironBoots.save(this, Items.IRON_BOOTS)
      ironHorseArmor.save(this, Items.IRON_HORSE_ARMOR)

      item(T7Items.THAVMITE_HELMET) {
        it.add(Aspects.METALLUM, 40)
          .add(Aspects.AETHER, 20)
          .add(Aspects.PRAEMUNIO, 7)
      }
      item(T7Items.THAVMITE_CHESTPLATE) {
        it.add(Aspects.METALLUM, 64)
          .add(Aspects.AETHER, 32)
          .add(Aspects.PRAEMUNIO, 13)
      }
      item(T7Items.THAVMITE_LEGGINGS) {
        it.add(Aspects.METALLUM, 56)
          .add(Aspects.AETHER, 28)
          .add(Aspects.PRAEMUNIO, 11)
      }
      item(T7Items.THAVMITE_BOOTS) {
        it.add(Aspects.METALLUM, 32)
          .add(Aspects.AETHER, 16)
          .add(Aspects.PRAEMUNIO, 5)
      }

      item(Items.GOLDEN_HELMET) {
        it.add(Aspects.METALLUM, 20)
          .add(Aspects.PRAEMUNIO, 4)
      }
      item(Items.GOLDEN_CHESTPLATE) {
        it.add(Aspects.METALLUM, 32)
          .add(Aspects.PRAEMUNIO, 10)
      }
      item(Items.GOLDEN_LEGGINGS) {
        it.add(Aspects.METALLUM, 28)
          .add(Aspects.PRAEMUNIO, 6)
      }
      item(Items.GOLDEN_BOOTS) {
        it.add(Aspects.METALLUM, 16)
          .add(Aspects.PRAEMUNIO, 2)
      }

      item(Items.DIAMOND_HELMET) {
        it.add(Aspects.VITREUS, 40)
          .add(Aspects.PRAEMUNIO, 8)
      }
      item(Items.DIAMOND_CHESTPLATE) {
        it.add(Aspects.VITREUS, 64)
          .add(Aspects.PRAEMUNIO, 18)
      }
      item(Items.DIAMOND_LEGGINGS) {
        it.add(Aspects.VITREUS, 56)
          .add(Aspects.PRAEMUNIO, 14)
      }
      item(Items.DIAMOND_BOOTS) {
        it.add(Aspects.VITREUS, 32)
          .add(Aspects.PRAEMUNIO, 8)
      }

      item(Items.NETHERITE_HELMET) {
        it.add(Aspects.METALLUM, 40)
          .add(Aspects.PRAEMUNIO, 9)
          .add(Aspects.TENEBRAE, 4)
      }
      item(Items.NETHERITE_CHESTPLATE) {
        it.add(Aspects.METALLUM, 64)
          .add(Aspects.PRAEMUNIO, 19)
          .add(Aspects.TENEBRAE, 4)
      }
      item(Items.NETHERITE_LEGGINGS) {
        it.add(Aspects.METALLUM, 56)
          .add(Aspects.PRAEMUNIO, 15)
          .add(Aspects.TENEBRAE, 4)
      }
      item(Items.NETHERITE_BOOTS) {
        it.add(Aspects.METALLUM, 32)
          .add(Aspects.PRAEMUNIO, 9)
          .add(Aspects.TENEBRAE, 4)
      }

      item(Items.WOLF_ARMOR) {
        it.add(Aspects.CORPUS, 8)
          .add(Aspects.PRAEMUNIO, 6)
      }
      item(Items.GOLDEN_HORSE_ARMOR) {
        it.add(Aspects.METALLUM, 8)
          .add(Aspects.PRAEMUNIO, 8)
      }
      item(Items.DIAMOND_HORSE_ARMOR) {
        it.add(Aspects.VITREUS, 16)
          .add(Aspects.PRAEMUNIO, 12)
      }

      item(Items.TURTLE_HELMET) {
        it.add(Aspects.CORPUS, 10)
          .add(Aspects.PRAEMUNIO, 4)
          .add(Aspects.AQUA, 5)
      }
    }
  }
}