package com.krithenmc.unnamedmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.PaintingVariantTags;
import net.minecraft.tags.TagEntry;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;

import java.util.concurrent.CompletableFuture;

public class ModPaintingsTagsProviders extends FabricTagsProvider<PaintingVariant> {


    public ModPaintingsTagsProviders(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, Registries.PAINTING_VARIANT, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        getOrCreateRawBuilder(PaintingVariantTags.PLACEABLE)
                .add(TagEntry.element(ModPaintings.SKELETON_HAND_KEY.identifier()))
                .add(TagEntry.element(ModPaintings.LAND_OF_DECEIVING_LOOKS.identifier()))
                .add(TagEntry.element(ModPaintings.DEADLAND_COMES_ALIVE.identifier()))
                .add(TagEntry.element(ModPaintings.CRYSTALLIZE.identifier()));

    }
}
