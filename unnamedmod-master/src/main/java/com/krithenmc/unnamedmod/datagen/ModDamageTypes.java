package com.krithenmc.unnamedmod.datagen;

import com.krithenmc.unnamedmod.Unnamedmod;
import net.minecraft.client.renderer.item.properties.numeric.Damage;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageEffects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.level.Level;

public class ModDamageTypes {
    public static final ResourceKey<DamageType> AREADBHAR = ResourceKey.create(Registries.DAMAGE_TYPE, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "areadbhar"));

    public static void bootstrap(BootstrapContext<DamageType> context) {
        context.register(AREADBHAR, new DamageType("areadbhar", 0.3f, DamageEffects.HURT));
    }

    public static DamageSource create(Level level, ResourceKey<DamageType> key) {
        return new DamageSource(level.registryAccess().lookupOrThrow(Registries.DAMAGE_TYPE).getOrThrow(key));
    }
}
