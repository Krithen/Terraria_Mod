package com.krithenmc.unnamedmod;

import com.krithenmc.unnamedmod.datagen.*;
import com.krithenmc.unnamedmod.datagen.villager.ModVillagerTrades;
import com.krithenmc.unnamedmod.datagen.villager.ModVillagerTradesTags;
import com.krithenmc.unnamedmod.worldgen.ModConfiguredFeatures;
import com.krithenmc.unnamedmod.worldgen.ModPlacedFeatures;
import com.krithenmc.unnamedmod.worldgen.dimension.ModDimensions;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class UnnamedmodDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModItemTagsProvider::new);
		pack.addProvider(ModRegistryDataGenerator::new	);
		pack.addProvider(ModPaintingsTagsProviders::new);
		pack.addProvider(ModSoundsProvider::new);
		pack.addProvider(ModAdvancementsProvider::new);
		pack.addProvider(ModVillagerTradesTags::new);
		pack.addProvider(ModEntitiesLootTableProvider::new);

	}

	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {
		registryBuilder.add(Registries.PAINTING_VARIANT, ModPaintings::bootstrap);
		registryBuilder.add(Registries.DAMAGE_TYPE, ModDamageTypes::bootstrap);
		registryBuilder.add(Registries.VILLAGER_TRADE, ModVillagerTrades::bootstrap);
		registryBuilder.add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
		registryBuilder.add(Registries.LEVEL_STEM, ModDimensions::bootstrapStem);
		registryBuilder.add(Registries.DIMENSION_TYPE, ModDimensions::bootstrapType);
	}
}
