Here are the remaining cases I see where there’s an in‑game relation but the aspect entry is still defined independently (not derived via `mutate`/`add` from related entries).

**BlockAndItemAspects**
- `src/main/java/me/alegian/thavma/impl/init/data/providers/aspects/BlockAndItemAspects.kt:20` brick is smelted from clay ball but isn’t derived from `clayBall` (`...:97`).
- `src/main/java/me/alegian/thavma/impl/init/data/providers/aspects/BlockAndItemAspects.kt:27` mudBricks are crafted/stonecut from packed mud but aren’t derived from `packedMud` (`...:104`) or `mud` (`...:103`).
- `src/main/java/me/alegian/thavma/impl/init/data/providers/aspects/BlockAndItemAspects.kt:62` cutSandstone is crafted/stonecut from sandstone (`...:61`) but isn’t derived from it.
- `src/main/java/me/alegian/thavma/impl/init/data/providers/aspects/BlockAndItemAspects.kt:63` smoothSandstone is smelted/crafted from sandstone (`...:61`) but isn’t derived from it.
- `src/main/java/me/alegian/thavma/impl/init/data/providers/aspects/BlockAndItemAspects.kt:90` enderEye is crafted from enderPearl + blazePowder, but isn’t derived from `enderPearls` (`...:89`) / `blazePowder` (`...:79`).
- `src/main/java/me/alegian/thavma/impl/init/data/providers/aspects/BlockAndItemAspects.kt:93` paper is crafted from sugar cane but isn’t derived from `sugarCane` (`...:117`).
- `src/main/java/me/alegian/thavma/impl/init/data/providers/aspects/BlockAndItemAspects.kt:94` fireworkRocket uses paper + gunpowder but isn’t derived from `paper` (`...:93`) / `gunpowders` (`...:80`).
- `src/main/java/me/alegian/thavma/impl/init/data/providers/aspects/BlockAndItemAspects.kt:95` fireworkStar uses gunpowder but isn’t derived from `gunpowders` (`...:80`).
- `src/main/java/me/alegian/thavma/impl/init/data/providers/aspects/BlockAndItemAspects.kt:110` terracotta is smelted from clay but isn’t derived from `clay` (`...:106`) / `clayBall` (`...:97`).
- `src/main/java/me/alegian/thavma/impl/init/data/providers/aspects/BlockAndItemAspects.kt:112` concretes are smelted from concretePowders but aren’t derived from `concretePowders` (`...:111`).

**MineralAspects**
- `src/main/java/me/alegian/thavma/impl/init/data/providers/aspects/MineralAspects.kt:115` netherite ingot uses netherite scrap + gold, but isn’t derived from `netheriteScrap` (`...:109`) (only from `gold`).

**ToolAspects**
- `src/main/java/me/alegian/thavma/impl/init/data/providers/aspects/ToolAspects.kt:61` arrows are crafted from flint + stick + feather but aren’t derived from `flint` / `rodsWooden` / `feathers`.
- `src/main/java/me/alegian/thavma/impl/init/data/providers/aspects/ToolAspects.kt:64` bow is crafted from string + sticks but isn’t derived from `string` / `rodsWooden`.
- `src/main/java/me/alegian/thavma/impl/init/data/providers/aspects/ToolAspects.kt:65` crossbow is crafted from bow/iron/stick/tripwire hook but isn’t derived from any of those.
- `src/main/java/me/alegian/thavma/impl/init/data/providers/aspects/ToolAspects.kt:62` mace is crafted from heavy core + breeze rod but isn’t derived from `heavyCore` / `rodsBreeze`.
