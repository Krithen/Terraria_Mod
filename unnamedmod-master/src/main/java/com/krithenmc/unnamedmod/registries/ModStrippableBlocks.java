package com.krithenmc.unnamedmod.registries;

import com.krithenmc.unnamedmod.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.BlockTransformerHelper;

public class ModStrippableBlocks {
    public static void registerStrippableBlocks() {
        BlockTransformerHelper.registerStripping(ModBlocks.SHADEWOOD_LOG, ModBlocks.STRIPPED_SHADEWOOD_LOG);
        BlockTransformerHelper.registerStripping(ModBlocks.SHADEWOOD, ModBlocks.STRIPPED_SHADEWOOD);
        BlockTransformerHelper.registerStripping(ModBlocks.BOREAL_WOOD_LOG, ModBlocks.STRIPPED_BOREAL_LOG);
        BlockTransformerHelper.registerStripping(ModBlocks.BOREAL_WOOD, ModBlocks.STRIPPED_BOREAL_WOOD);
    }
}
