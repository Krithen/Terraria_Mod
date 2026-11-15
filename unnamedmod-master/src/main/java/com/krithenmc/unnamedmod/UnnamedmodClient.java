package com.krithenmc.unnamedmod;

import com.krithenmc.unnamedmod.block.entity.ModBlockEntites;
import com.krithenmc.unnamedmod.block.entity.renderer.HellstoneForgeBlockEntityRenderer;
import com.krithenmc.unnamedmod.entities.ModEntities;
import com.krithenmc.unnamedmod.entities.client.*;
import com.krithenmc.unnamedmod.keymapping.ModKeyMappings;
import com.krithenmc.unnamedmod.menu.ModMenuTypes;
import com.krithenmc.unnamedmod.menu.custom.HellstoneForgeScreen;
import com.krithenmc.unnamedmod.networking.packet.TestPayloadC2S;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.network.chat.Component;

public class UnnamedmodClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {

        BlockEntityRenderers.register(ModBlockEntites.HELLSTONE_BE, HellstoneForgeBlockEntityRenderer::new);

        ModKeyMappings.register();

        ClientTickEvents.END_CLIENT_TICK.register(UnnamedmodClient::onEndTick);

        MenuScreens.register(ModMenuTypes.HELLSTONE_FORGE_MENU, HellstoneForgeScreen::new);

        ModelLayerRegistry.registerModelLayer(ModModelLayerLocations.ANTLION, AntlionModel::createBodyLayer);
        EntityRenderers.register(ModEntities.ANTLION, AntlionRenderer::new);
        ModelLayerRegistry.registerModelLayer(ModModelLayerLocations.SWARMER, SwarmerModel::createBodyLayer);
        EntityRenderers.register(ModEntities.SWARMER, SwarmerRenderer::new);
        EntityRenderers.register(ModEntities.BLOOD_CRAWLER, (context) -> {
            return new BloodCrawlerRenderer(context);
        });
        EntityRenderers.register(ModEntities.DEMON_EYE, DemonEyeRenderer::new);
        EntityRenderers.register(ModEntities.GREEN_EYE, GreenEyeRenderer::new);
        EntityRenderers.register(ModEntities.LARGE_DEMON_EYE, LargeDemonEyeRenderer::new);
        EntityRenderers.register(ModEntities.PURPLE_EYE, PurpleEyeRenderer::new);
        EntityRenderers.register(ModEntities.CRIMERA, CrimeraRenderer::new);
        ModelLayerRegistry.registerModelLayer(ModModelLayerLocations.FLAMING_ARROW, FlamingArrowEntityModel::createBodyLayer);
        EntityRenderers.register(ModEntities.FLAMING_ARROW, FlamingArrowEntityRenderer::new);




    }


    public static void onEndTick(Minecraft client) {
        while(ModKeyMappings.KEYBIND.consumeClick()) {
            client.player.sendSystemMessage(Component.literal("L"));
            ClientPlayNetworking.send(new TestPayloadC2S("Krithen", 67));
        }
    }
}
