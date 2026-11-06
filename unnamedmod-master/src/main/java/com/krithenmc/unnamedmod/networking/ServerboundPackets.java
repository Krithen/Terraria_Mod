package com.krithenmc.unnamedmod.networking;

import com.krithenmc.unnamedmod.networking.packet.TestPayloadC2S;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.level.block.BlockTypes;

//server
public class ServerboundPackets {
    public static void handleTestPayload(TestPayloadC2S testPayloadC2S, ServerPlayNetworking.Context context) {
        EntityTypes.ARMOR_STAND.spawn(context.player().level(), context.player().getOnPos(), EntitySpawnReason.TRIGGERED);

    }
}
