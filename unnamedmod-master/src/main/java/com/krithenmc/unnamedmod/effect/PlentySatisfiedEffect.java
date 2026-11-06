package com.krithenmc.unnamedmod.effect;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class PlentySatisfiedEffect extends MobEffect {
    public PlentySatisfiedEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyEffectTick(ServerLevel serverLevel, LivingEntity mob, int amplification) {
        if (mob.getHealth() < mob.getMaxHealth()) {
            mob.heal(0.2f);
            mob.setAbsorptionAmount(0);
        }

        return super.applyEffectTick(serverLevel, mob, amplification);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int tickCount, int amplification) {
        return true;
    }

    @Override
    public void onEffectStarted(final LivingEntity mob, final int amplifier) {
        super.onEffectStarted(mob, amplifier);
        mob.setAbsorptionAmount(Math.max(mob.getAbsorptionAmount(), (float) (2 * (1 + amplifier))));

    }
}

