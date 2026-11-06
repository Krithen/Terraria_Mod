package com.krithenmc.unnamedmod.networking;

import com.krithenmc.unnamedmod.networking.packet.TestPayloadC2S;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.RegistryFriendlyByteBuf;

public class ModPackets {

    private static void registerClientbound(PayloadTypeRegistry<RegistryFriendlyByteBuf> registry) {
        //sent from server to client -> CLIENTBOND
    }

    private static void registerServerbound(PayloadTypeRegistry<RegistryFriendlyByteBuf> registry) {
        //sent from client to server
        registry.register(TestPayloadC2S.TYPE, TestPayloadC2S.STREAM_CODEC);

        ServerPlayNetworking.registerGlobalReceiver(TestPayloadC2S.TYPE, ServerboundPackets::handleTestPayload);
    }

    public static void registerPackets() {
        registerClientbound(PayloadTypeRegistry.clientboundPlay());
        registerServerbound(PayloadTypeRegistry.serverboundPlay());
    }
}
