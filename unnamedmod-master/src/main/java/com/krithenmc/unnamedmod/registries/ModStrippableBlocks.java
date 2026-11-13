package com.krithenmc.unnamedmod.registries;

import com.krithenmc.unnamedmod.block.ModBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModStrippableBlocks {
    public static void registerStrippableBlocks() {
        StrippableBlockRegistry.register(ModBlocks.SHADEWOOD_LOG, ModBlocks.STRIPPED_SHADEWOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.SHADEWOOD, ModBlocks.STRIPPED_SHADEWOOD);
        StrippableBlockRegistry.register(ModBlocks.BOREAL_WOOD_LOG, ModBlocks.STRIPPED_BOREAL_LOG);
        StrippableBlockRegistry.register(ModBlocks.BOREAL_WOOD, ModBlocks.STRIPPED_BOREAL_WOOD);
    }
}
