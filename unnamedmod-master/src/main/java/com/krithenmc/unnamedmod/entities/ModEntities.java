package com.krithenmc.unnamedmod.entities;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.entities.custom.*;
import net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.block.Block;

public class ModEntities {
    public static final ResourceKey<EntityType<?>> ANTLION_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "antlion"));

    public static final EntityType<AntlionEntity> ANTLION = Registry.register(BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "antlion"),
            EntityType.Builder.of(AntlionEntity::new, MobCategory.MONSTER).sized(1f, 1f).build(ANTLION_KEY));

    public static final ResourceKey<EntityType<?>> SWARMER_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "swarmer"));

    public static final EntityType<SwarmerEntity> SWARMER = Registry.register(BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "swarmer"),
            EntityType.Builder.of(SwarmerEntity::new, MobCategory.MONSTER).sized(1f, 1f).build(SWARMER_KEY));

    public static final ResourceKey<EntityType<?>> BLOOD_CRAWLER_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "blood_crawler"));

    public static final EntityType<BloodCrawlerEntity> BLOOD_CRAWLER = Registry.register(BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "blood_crawler"),
            EntityType.Builder.of(BloodCrawlerEntity::new, MobCategory.MONSTER).sized(1.5f, 1.5f).build(BLOOD_CRAWLER_KEY ));

    public static final ResourceKey<EntityType<?>> DEMON_EYE_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "demon_eye"));

    public static final EntityType<DemonEyeEntity> DEMON_EYE = Registry.register(BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "demon_eye"),
            EntityType.Builder.of(DemonEyeEntity::new, MobCategory.MONSTER).sized(0.5f, 0.5f).build(DEMON_EYE_KEY));

    public static final ResourceKey<EntityType<?>> GREEN_EYE_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "green_eye"));

    public static final EntityType<GreenEyeEntity> GREEN_EYE = Registry.register(BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "green_eye"),
            EntityType.Builder.of(GreenEyeEntity::new, MobCategory.MONSTER).sized(0.5f, 0.5f).build(GREEN_EYE_KEY));

    public static final ResourceKey<EntityType<?>> LARGE_DEMON_EYE_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "large_demon_eye"));

    public static final EntityType<LargeDemonEyeEntity> LARGE_DEMON_EYE = Registry.register(BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "large_demon_eye"),
            EntityType.Builder.of(LargeDemonEyeEntity::new, MobCategory.MONSTER).sized(1, 1).build(LARGE_DEMON_EYE_KEY));

    public static void registerModEntities() {
        Unnamedmod.LOGGER.info("Registering Mod Entities for " + Unnamedmod.MOD_ID);
    }

}
