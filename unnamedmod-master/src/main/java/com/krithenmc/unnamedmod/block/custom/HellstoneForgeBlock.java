package com.krithenmc.unnamedmod.block.custom;

import com.krithenmc.unnamedmod.block.entity.custom.HellstoneForgeBlockEntity;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jspecify.annotations.Nullable;

public class HellstoneForgeBlock extends BaseEntityBlock {
    public static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 15, 16);
    private static MapCodec<HellstoneForgeBlock> CODEC = simpleCodec(HellstoneForgeBlock::new);
    public HellstoneForgeBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos worldPosition, BlockState blockState) {
        return new HellstoneForgeBlockEntity(worldPosition, blockState);
    }

    @Override
    public void playerDestroy(Level level, Player player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack destroyedWith) {
        if (level.getBlockEntity(pos) instanceof HellstoneForgeBlockEntity hellstoneForgeBlockEntity) {
            hellstoneForgeBlockEntity.drops();
            level.updateNeighbourForOutputSignal(pos, this);
        }
    }

    @Override
    protected InteractionResult useItemOn(ItemStack itemStack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (level.getBlockEntity(pos) instanceof HellstoneForgeBlockEntity hellstoneForgeBlockEntity) {

            if (player.isCrouching()) {
                player.openMenu(hellstoneForgeBlockEntity);
                return InteractionResult.SUCCESS;
            }

            boolean isForgeEmpty = hellstoneForgeBlockEntity.isEmpty();

            //insert
            if (isForgeEmpty && !itemStack.isEmpty()) {
                hellstoneForgeBlockEntity.setTheItem(itemStack);
                itemStack.shrink(1);
                level.playSound(player, pos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1f, 2f);
            }

            //extract
            else if(!isForgeEmpty) {
                ItemStack stackOnForge = hellstoneForgeBlockEntity.getTheItem();
                hellstoneForgeBlockEntity.clearContent();
                if (!player.getInventory().add(stackOnForge)) {
                    player.drop(stackOnForge, false);
                }
                level.playSound(player, pos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1f, 1f);
            }

        }

        return InteractionResult.SUCCESS;
    }
}
