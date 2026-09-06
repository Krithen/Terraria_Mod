package com.krithenmc.unnamedmod.block.custom;

import com.krithenmc.unnamedmod.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;



import java.util.Map;

public class CrimsonBlock extends Block {


    public CrimsonBlock(Properties properties) {super(properties);}
    private static final Map<Block, Block> CRIMSON_MAP =
            Map.of(
                    Blocks.STONE, ModBlocks.CRIMSTONE,
                    Blocks.SAND, ModBlocks.CRIMSAND
            );


    }

