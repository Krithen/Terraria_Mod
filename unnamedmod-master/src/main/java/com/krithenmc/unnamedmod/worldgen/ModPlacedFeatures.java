package com.krithenmc.unnamedmod.worldgen;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    // PF has CF
    //placed in the world, places a CF
    // where is this going to be placed and how
    //biome modifications
    public static final ResourceKey<PlacedFeature> LEAD_ORE_PLACED_KEY = registerKey("lead_ore_placed");
    public static final ResourceKey<PlacedFeature> CRIMTANE_ORE_PLACED_KEY = registerKey("crimtane_ore_placed");
    public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
    public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
    public static final ResourceKey<PlacedFeature> TUNGSTEN_ORE_PLACED_KEY = registerKey("tungsten_ore_placed");
    public static final ResourceKey<PlacedFeature> PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
    public static final ResourceKey<PlacedFeature> DEMONITE = registerKey("demonite");
    public static final ResourceKey<PlacedFeature> HELLSTONE = registerKey("hellstone");
    public static final ResourceKey<PlacedFeature> COBALT = registerKey("cobalt");
    public static final ResourceKey<PlacedFeature> PALLADIUM = registerKey("palladium");
    public static final ResourceKey<PlacedFeature> MYTHRIL = registerKey("mythril");
    public static final ResourceKey<PlacedFeature> ORICHALCUM = registerKey("orichalcum");
    public static final ResourceKey<PlacedFeature> ADAMANTITE = registerKey("adamantite");
    public static final ResourceKey<PlacedFeature> TITANIUM = registerKey("titanium");
    public static final ResourceKey<PlacedFeature> CHLOROPHYTE = registerKey("chlorophyte");
    public static final ResourceKey<PlacedFeature> MUD = registerKey("mud");
    public static final ResourceKey<PlacedFeature> SHADEWOOD_PLACED_KEY = registerKey("shadewood_placed");
    public static final ResourceKey<PlacedFeature> BOREAL_PLACED = registerKey("boreal_placed");
    public static final ResourceKey<PlacedFeature> BLOOD_ORANGE = registerKey("blood_orange");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, LEAD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LEAD_ORE_KEY),
                OrePlacements.commonOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.absolute(-10), VerticalAnchor.absolute(100))));
        register(context, CRIMTANE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRIMTANE_ORE_KEY),
                OrePlacements.commonOrePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(20))));
        register(context, TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TIN_KEY),
                OrePlacements.commonOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.absolute(-10), VerticalAnchor.absolute(100))));
        register(context, SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SILVER_KEY),
                OrePlacements.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(100))));
        register(context, TUNGSTEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TUNGSTEN_KEY),
                OrePlacements.commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(100))));
        register(context, DEMONITE, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEMONITE_KEY),
                OrePlacements.commonOrePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(20))));
        register(context, HELLSTONE, configuredFeatures.getOrThrow(ModConfiguredFeatures.HELLSTONE_KEY),
                OrePlacements.commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(-30))));
        register(context, COBALT, configuredFeatures.getOrThrow(ModConfiguredFeatures.COBALT_KEY),
                OrePlacements.commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(20))));
        register(context, PALLADIUM, configuredFeatures.getOrThrow(ModConfiguredFeatures.PALLADIUM_KEY),
                OrePlacements.commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(20))));
        register(context, MYTHRIL, configuredFeatures.getOrThrow(ModConfiguredFeatures.MYTHRIL_KEY),
                OrePlacements.commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(20))));
        register(context, ORICHALCUM, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORICHALCUM_KEY),
                OrePlacements.commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(20))));
        register(context, ADAMANTITE, configuredFeatures.getOrThrow(ModConfiguredFeatures.ADAMANTITE_KEY),
                OrePlacements.commonOrePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(20))));
        register(context, TITANIUM, configuredFeatures.getOrThrow(ModConfiguredFeatures.TITANIUM_KEY),
                OrePlacements.commonOrePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(20))));
        register(context, CHLOROPHYTE, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHLOROPHYTE_KEY),
                OrePlacements.commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(100))));
        register(context, MUD, configuredFeatures.getOrThrow(ModConfiguredFeatures.MUD),
                OrePlacements.commonOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(100))));

        register(context, SHADEWOOD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SHADEWOOD_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.SHADEWOOD_SAPLING));

        register(context, BOREAL_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.BOREAL),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.01f, 1),
                        ModBlocks.BOREAL_SAPLING));

        register(context, BLOOD_ORANGE, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLOOD_ORANGE_BUSH),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

}
