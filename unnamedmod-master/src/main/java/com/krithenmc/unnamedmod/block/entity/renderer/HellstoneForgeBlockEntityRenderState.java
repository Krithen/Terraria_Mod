package com.krithenmc.unnamedmod.block.entity.renderer;

import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class HellstoneForgeBlockEntityRenderState extends BlockEntityRenderState {
    public Level level;
    public float rotation;

    final ItemStackRenderState itemStackRenderState = new ItemStackRenderState();

}
