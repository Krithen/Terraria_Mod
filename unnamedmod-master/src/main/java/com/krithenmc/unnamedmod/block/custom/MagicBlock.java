package com.krithenmc.unnamedmod.block.custom;

import com.krithenmc.unnamedmod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.datafix.fixes.ItemStackEnchantmentNamesFix;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class MagicBlock extends Block {
    public MagicBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        level.addParticle(ParticleTypes.GLOW, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, 0, 1 , 0);
        level.playSound(player, pos, SoundEvents.ALLAY_DEATH, SoundSource.BLOCKS, 2f, 1f);

        return InteractionResult.SUCCESS;
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState onState, Entity entity) {
        if (entity instanceof Player player) {
            player.addEffect(new MobEffectInstance(MobEffects.WITHER, 40, 255));
        }
        if(entity instanceof ItemEntity itemEntity){
            if (IsValidItem(itemEntity.getItem())) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));

            } else if (IsRawLead(itemEntity.getItem())) {
                itemEntity.setItem(new ItemStack(Items.RAW_IRON, itemEntity.getItem().getCount()));
            }
        }

        super.stepOn(level, pos, onState, entity);
    }

    private boolean IsRawLead(ItemStack item) {
        return item.is(ModItems.RAW_LEAD);
    }

    private boolean IsValidItem(ItemStack item) {

        return  item.is(ModItems.LEAD_BAR);
    }
}
