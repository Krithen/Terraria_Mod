package com.krithenmc.unnamedmod.datagen;

import com.krithenmc.unnamedmod.Unnamedmod;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;

import java.util.Optional;

public class ModPaintings {
    public static final ResourceKey<PaintingVariant> SKELETON_HAND_KEY = create("skeleton_hand");

    public static void bootstrap(BootstrapContext<PaintingVariant> context) {
        register(context, SKELETON_HAND_KEY, 1, 1, true);
    }

    private static ResourceKey<PaintingVariant> create(final String id) {
        return ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, id));
    }

    private static void register(final BootstrapContext<PaintingVariant> context, final ResourceKey<PaintingVariant> key, final int width,
                                 final int height, final boolean hasAuthor) {
        context.register(key, new PaintingVariant(width, height, key.identifier(),
                Optional.of(Component.translatable(key.identifier().toLanguageKey("painting", "title")).withStyle(ChatFormatting.DARK_GREEN)), hasAuthor ? Optional.of(Component.translatable(key.identifier().toLanguageKey("painting", "author")).withStyle(ChatFormatting.DARK_GREEN)) : Optional.empty()));
    }
}
