package com.krithenmc.unnamedmod.block.custom;

import com.krithenmc.unnamedmod.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SideChainPartBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import java.util.Map;

public class CrimsonBlock extends Block {


    public CrimsonBlock(Properties properties) {super(properties);}
    private static final Map<Block, Block> CRIMSON_MAP =
            Map.of(
                    Blocks.STONE, ModBlocks.CRIMSTONE,
                    Blocks.SAND, ModBlocks.CRIMSAND
            );

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        level.getBlockState(pos).getBlock();
        Block foundBlock = level.getBlockState(pos.relative(Direction.NORTH)).getBlock();

        if (CRIMSON_MAP.containsKey(foundBlock)) {
            level.setBlock(pos, CRIMSON_MAP.get(foundBlock).defaultBlockState(), 1);
        }
        return InteractionResult.SUCCESS;
    }
}
