package com.krithenmc.unnamedmod.worldgen.generation;

import com.krithenmc.unnamedmod.entities.ModEntities;
import com.krithenmc.unnamedmod.worldgen.ModPlacedFeatures;
import com.krithenmc.unnamedmod.worldgen.tree.ModTreeGrowers;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModWorldGeneration {
    public static void registerModWorldGen() {
        //UNDERGROUND ORES
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES,
                ModPlacedFeatures.LEAD_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES,
                ModPlacedFeatures.CRIMTANE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES,
                ModPlacedFeatures.TIN_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES,
                ModPlacedFeatures.SILVER_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES,
                ModPlacedFeatures.TUNGSTEN_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES,
                ModPlacedFeatures.DEMONITE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES,
                ModPlacedFeatures.HELLSTONE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES,
                ModPlacedFeatures.COBALT);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES,
                ModPlacedFeatures.PALLADIUM);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES,
                ModPlacedFeatures.MYTHRIL);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES,
                ModPlacedFeatures.ORICHALCUM);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES,
                ModPlacedFeatures.ADAMANTITE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES,
                ModPlacedFeatures.TITANIUM);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.MANGROVE_SWAMP, Biomes.JUNGLE, Biomes.BAMBOO_JUNGLE, Biomes.SPARSE_JUNGLE), GenerationStep.Decoration.UNDERGROUND_ORES,
                ModPlacedFeatures.CHLOROPHYTE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.MANGROVE_SWAMP, Biomes.JUNGLE, Biomes.SPARSE_JUNGLE, Biomes.BAMBOO_JUNGLE), GenerationStep.Decoration.UNDERGROUND_ORES,
                ModPlacedFeatures.MUD);

        //example for only specific biomes
        //BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.biome, Biomes.biome), GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.FEATURE);

        //trees
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.PLAINS, Biomes.DESERT),
                GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.SHADEWOOD_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.FROZEN_PEAKS, Biomes.SNOWY_BEACH, Biomes.SNOWY_PLAINS, Biomes.SNOWY_SLOPES, Biomes.SNOWY_TAIGA),
                GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.BOREAL_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.PLAINS),
                GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.BLOOD_ORANGE);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(Biomes.DESERT), MobCategory.MONSTER,
                ModEntities.ANTLION, 19, 1, 3);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(Biomes.DESERT), MobCategory.MONSTER,
                ModEntities.SWARMER, 19, 2, 8);

        BiomeModifications.addSpawn(BiomeSelectors.foundInOverworld(), MobCategory.MONSTER,
                ModEntities.DEMON_EYE, 20, 1, 5);
        BiomeModifications.addSpawn(BiomeSelectors.foundInOverworld(), MobCategory.MONSTER,
                ModEntities.GREEN_EYE, 5, 1, 2);
        BiomeModifications.addSpawn(BiomeSelectors.foundInOverworld(), MobCategory.MONSTER,
                ModEntities.LARGE_DEMON_EYE, 5, 1, 1);
        BiomeModifications.addSpawn(BiomeSelectors.foundInOverworld(), MobCategory.MONSTER,
                ModEntities.PURPLE_EYE, 5, 1, 2);


    }
}
