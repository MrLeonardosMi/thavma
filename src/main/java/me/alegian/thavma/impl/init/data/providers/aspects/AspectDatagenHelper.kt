package me.alegian.thavma.impl.init.data.providers.aspects

import me.alegian.thavma.impl.common.aspect.AspectMap
import me.alegian.thavma.impl.common.item.itemResourceKey
import me.alegian.thavma.impl.init.registries.deferred.Aspects
import net.minecraft.resources.ResourceKey
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item
import net.minecraft.world.level.ItemLike
import net.neoforged.neoforge.common.data.DataMapProvider
import java.util.function.UnaryOperator

class AspectGen(private var aspects: AspectMap) {
  constructor() : this(AspectMap())

  fun mutate(mutation: UnaryOperator<AspectMap>) =
    AspectGen(mutation.apply(aspects))

  fun <T> save(builder: DataMapProvider.Builder<AspectMap, T>, tag: TagKey<T>) {
    builder.add(tag, aspects, false)
  }

  fun <T> save(builder: DataMapProvider.Builder<AspectMap, T>, key: ResourceKey<T>) {
    builder.add(key, aspects, false)
  }

  fun save(builder: DataMapProvider.Builder<AspectMap, Item>, itemLike: ItemLike) =
    save(builder, itemLike.itemResourceKey)
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
