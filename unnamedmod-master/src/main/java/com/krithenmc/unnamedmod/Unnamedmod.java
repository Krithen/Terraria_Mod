package com.krithenmc.unnamedmod;

import com.krithenmc.unnamedmod.block.ModBlocks;
import com.krithenmc.unnamedmod.block.entity.ModBlockEntites;
import com.krithenmc.unnamedmod.creativemodetab.ModCreativeModeTabs;
import com.krithenmc.unnamedmod.data.ModDataComponents;
import com.krithenmc.unnamedmod.effect.ModEffects;
import com.krithenmc.unnamedmod.entities.ModEntities;
import com.krithenmc.unnamedmod.entities.custom.*;
import com.krithenmc.unnamedmod.item.ModItems;
import com.krithenmc.unnamedmod.loot.ModLootTablesModifier;
import com.krithenmc.unnamedmod.menu.ModMenuTypes;
import com.krithenmc.unnamedmod.networking.ModPackets;
import com.krithenmc.unnamedmod.potion.ModPotions;
import com.krithenmc.unnamedmod.registries.*;
import com.krithenmc.unnamedmod.sounds.ModSounds;
import com.krithenmc.unnamedmod.stat.ModStats;
import com.krithenmc.unnamedmod.worldgen.generation.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;
import net.rpg_foundation.armor_api.client.ArmorRenderers;
import net.rpg_foundation.armor_api.client.GeoArmorRenderer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Unnamedmod implements ModInitializer {
	public static final String MOD_ID = "unnamedmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();
		ModDataComponents.registerDataComponents();
		ModItems.registerModItems();
		ModStats.registerStats();
		ModBlocks.registerModBlocks();
		ModFuels.registerFuels();
		ModCompostables.registerCompostables();
		ModSounds.registerSounds();
		ModEffects.registerEffects();
		ModPotions.registerPotions();
		ModPotionRecipes.registerPotionRecipes();
		ModPackets.registerPackets();
		ModBlockEntites.registerBlockEntities();
		ModMenuTypes.registerModMenuTypes();
		ModWorldGeneration.registerModWorldGen();
		ModFlammableBlocks.registerFlammableBlocks();
		ModStrippableBlocks.registerStrippableBlocks();
		ModEntities.registerModEntities();

		FabricDefaultAttributeRegistry.register(ModEntities.ANTLION, AntlionEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.SWARMER, SwarmerEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.BLOOD_CRAWLER, BloodCrawlerEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.DEMON_EYE, DemonEyeEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.GREEN_EYE, GreenEyeEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.LARGE_DEMON_EYE, LargeDemonEyeEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.PURPLE_EYE, PurpleEyeEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.CRIMERA, CrimeraEntity.createAttributes());

		LootTableEvents.MODIFY.register(ModLootTablesModifier::modifyLootTables);

		SpawnPlacements.register(ModEntities.ANTLION, SpawnPlacementTypes.ON_GROUND,
				Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);

		SpawnPlacements.register(ModEntities.DEMON_EYE, SpawnPlacementTypes.NO_RESTRICTIONS,
				Heightmap.Types.MOTION_BLOCKING, Monster::checkSurfaceMonstersSpawnRules);
		SpawnPlacements.register(ModEntities.GREEN_EYE, SpawnPlacementTypes.NO_RESTRICTIONS,
				Heightmap.Types.MOTION_BLOCKING, Monster::checkSurfaceMonstersSpawnRules);
		SpawnPlacements.register(ModEntities.LARGE_DEMON_EYE, SpawnPlacementTypes.NO_RESTRICTIONS,
				Heightmap.Types.MOTION_BLOCKING, Monster::checkSurfaceMonstersSpawnRules);
		SpawnPlacements.register(ModEntities.PURPLE_EYE, SpawnPlacementTypes.NO_RESTRICTIONS,
				Heightmap.Types.MOTION_BLOCKING, Monster::checkSurfaceMonstersSpawnRules);
	}
}

