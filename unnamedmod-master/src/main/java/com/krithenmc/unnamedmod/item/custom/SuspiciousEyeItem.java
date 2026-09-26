package com.krithenmc.unnamedmod.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class SuspiciousEyeItem extends Item {
    public SuspiciousEyeItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        //summon eye of cthulhu
        return super.use(level, player, hand);
    }
}
