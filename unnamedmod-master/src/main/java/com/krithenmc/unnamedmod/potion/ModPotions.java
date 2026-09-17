package com.krithenmc.unnamedmod.potion;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.effect.ModEffects;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;

public class ModPotions {

    public static final Holder<Potion> WELLFED_POTION = registerPotion("wellfed_potion",
            new Potion("wellfed_potion", new MobEffectInstance(ModEffects.WELLFED, 1200, 0, false, false)));

    private static Holder<net.minecraft.world.item.alchemy.Potion> registerPotion(String name, Potion potion) {
        return Registry.registerForHolder(BuiltInRegistries.POTION, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name),potion);
    }

    public static void registerPotions() {
        Unnamedmod.LOGGER.info("registering potions for" + Unnamedmod.MOD_ID);
    }
}
