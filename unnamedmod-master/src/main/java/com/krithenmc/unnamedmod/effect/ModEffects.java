package com.krithenmc.unnamedmod.effect;

import com.krithenmc.unnamedmod.Unnamedmod;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class ModEffects {

    public static final Holder<MobEffect> WELLFED = registerMobEffect("wellfed",
            new WellFedEffect(MobEffectCategory.BENEFICIAL, 264863866));

    private static Holder<MobEffect> registerMobEffect(String name, MobEffect effect) {
        return Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name), effect);
    }

    public static void registerEffects() {
        Unnamedmod.LOGGER.info("registering custom effects" + Unnamedmod.MOD_ID);
    }
}
