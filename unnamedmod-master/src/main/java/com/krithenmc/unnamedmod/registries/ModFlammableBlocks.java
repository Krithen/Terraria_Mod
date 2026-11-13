package com.krithenmc.unnamedmod.registries;

import com.krithenmc.unnamedmod.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SHADEWOOD_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SHADEWOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SHADEWOOD_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SHADEWOOD, 5, 5);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SHADEWOOD_PLANK, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PEARLWOOD_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SHADEWOOD_LEAVES, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALMWOOD_LEAVES, 30, 60);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BOREAL_WOOD_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BOREAL_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BOREAL_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BOREAL_LOG, 5, 5);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PEARLWOOD_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PEARLWOOD, 5, 5);
    }
}
