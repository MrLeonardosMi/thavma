package me.alegian.thavma.impl.common.payload

import me.alegian.thavma.impl.client.renderer.ExcavationRenderer
import me.alegian.thavma.impl.common.codec.nullable
import me.alegian.thavma.impl.common.util.T7StreamCodecs
import me.alegian.thavma.impl.rl
import net.minecraft.core.BlockPos
import net.minecraft.network.codec.ByteBufCodecs
import net.minecraft.network.codec.StreamCodec
import net.minecraft.network.protocol.common.custom.CustomPacketPayload
import net.minecraft.world.phys.Vec3
import net.neoforged.neoforge.network.handling.IPayloadContext

// S2C
class ExcavationPayload(
  private val entityId: Int,
  private val blockPos: BlockPos?,
  private val hitPos: Vec3?,
  private val progress: Int,
) : CustomPacketPayload {
  override fun type() = TYPE

  companion object {
    val TYPE = CustomPacketPayload.Type<ExcavationPayload>(rl("excavation"))

    val STREAM_CODEC = StreamCodec.composite(
      ByteBufCodecs.INT,
      ExcavationPayload::entityId,
      BlockPos.STREAM_CODEC.nullable(),
      ExcavationPayload::blockPos,
      T7StreamCodecs.VEC3.nullable(),
      ExcavationPayload::hitPos,
      ByteBufCodecs.INT,
      ExcavationPayload::progress,
      ::ExcavationPayload
    )

    fun handle(payload: ExcavationPayload, context: IPayloadContext) {
      ExcavationRenderer.renderers.compute(payload.entityId) { _, _ -> payload.hitPos }
      if (payload.blockPos != null)
        context.player().level().destroyBlockProgress(-payload.entityId, payload.blockPos, payload.progress)
    }
  }
}