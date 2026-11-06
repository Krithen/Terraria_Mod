package com.krithenmc.unnamedmod.worldgen;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.block.ModBlocks;
import com.krithenmc.unnamedmod.block.custom.BloodOrangeBushBlock;
import com.krithenmc.unnamedmod.tags.ModTags;
import io.netty.bootstrap.Bootstrap;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.DarkOakFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.UpwardsBranchingTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.RandomOffsetPlacement;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;
import java.util.Optional;

public class ModConfiguredFeatures {
    //feature with configuration
    //things can be different, so its not exactly the same
    //how something looks like
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAD_ORE_KEY = registerKey("lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRIMTANE_ORE_KEY = registerKey("crimtane_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHADEWOOD_KEY = registerKey("shadewood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_KEY = registerKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TUNGSTEN_KEY = registerKey("tungsten_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_KEY = registerKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PLATINUM_KEY = registerKey("platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEMONITE_KEY = registerKey("demonite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HELLSTONE_KEY = registerKey("hellstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COBALT_KEY = registerKey("cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PALLADIUM_KEY = registerKey("palladium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORICHALCUM_KEY = registerKey("orichalcum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MYTHRIL_KEY = registerKey("mythril_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ADAMANTITE_KEY = registerKey("adamantite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TITANIUM_KEY = registerKey("titanium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHLOROPHYTE_KEY = registerKey("chlorophyte_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MUD = registerKey("mud");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BOREAL = registerKey("boreal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ASHWOOD = registerKey("ashwood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAHOGANY = registerKey("mahogany");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EBON = registerKey("ebon");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PALM = registerKey("palm");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEARL = registerKey("pearl");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLOOD_ORANGE_BUSH = registerKey("blood_orange_bush");



    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest underworldReplaceables = new TagMatchTest(ModTags.Blocks.UNDERWORLD_ORE_REPLACEABLES);
        RuleTest jungleReplaceables = new TagMatchTest(ModTags.Blocks.JUNGLE_ORE_REPLACEABLES);

        register(context, LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(
                List.of(
                        OreConfiguration.target(stoneReplaceables, ModBlocks.LEAD_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.LEAD_DEEPSLATE_ORE.defaultBlockState())),
                11));
        register(context, CRIMTANE_ORE_KEY, Feature.ORE, new OreConfiguration(
                List.of(
                        OreConfiguration.target(stoneReplaceables, ModBlocks.CRIMTANE_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.CRIMTANE_DEEPSLATE_ORE.defaultBlockState())),
                5));
        register(context, TIN_KEY, Feature.ORE, new OreConfiguration(
                List.of(
                        OreConfiguration.target(stoneReplaceables, ModBlocks.TIN_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.TIN_DEEPSLATE_ORE.defaultBlockState())),
                11));
        register(context, SILVER_KEY, Feature.ORE, new OreConfiguration(
                List.of(
                        OreConfiguration.target(stoneReplaceables, ModBlocks.SILVER_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.SILVER_DEEPSLATE_ORE.defaultBlockState())),
                9));
        register(context, TUNGSTEN_KEY, Feature.ORE, new OreConfiguration(
                List.of(
                        OreConfiguration.target(stoneReplaceables, ModBlocks.TUNGSTEN_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_TUNGSTEN_ORE.defaultBlockState())),
                9));
        register(context, DEMONITE_KEY, Feature.ORE, new OreConfiguration(
                List.of(
                        OreConfiguration.target(stoneReplaceables, ModBlocks.DEMONITE_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEMONITE_DEEPSLATE_ORE.defaultBlockState())),
                5));
        register(context, HELLSTONE_KEY, Feature.ORE, new OreConfiguration(underworldReplaceables, ModBlocks.HELLSTONE_ORE.defaultBlockState(), 9));

        register(context, COBALT_KEY, Feature.ORE, new OreConfiguration(
                List.of(
                        OreConfiguration.target(stoneReplaceables, ModBlocks.COBALT_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.COBALT_DEEPSLATE_ORE.defaultBlockState())),
                11));

        register(context, PALLADIUM_KEY, Feature.ORE, new OreConfiguration(
                List.of(
                        OreConfiguration.target(stoneReplaceables, ModBlocks.PALLADIUM_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.PALLADIUM_DEEPSLATE_ORE.defaultBlockState())),
                11));

        register(context, MYTHRIL_KEY, Feature.ORE, new OreConfiguration(
                List.of(
                        OreConfiguration.target(stoneReplaceables, ModBlocks.MYTHRIL_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.MYTHRIL_DEEPSLATE_ORE.defaultBlockState())),
                9));

        register(context, ORICHALCUM_KEY, Feature.ORE, new OreConfiguration(
                List.of(
                        OreConfiguration.target(stoneReplaceables, ModBlocks.ORICHALCUM_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.ORICHALCUM_DEEPSLATE_ORE.defaultBlockState())),
                9));

        register(context, ADAMANTITE_KEY, Feature.ORE, new OreConfiguration(
                List.of(
                        OreConfiguration.target(stoneReplaceables, ModBlocks.ADAMANTITE_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.ADAMANTITE_DEEPSLATE_ORE.defaultBlockState())),
                7));

        register(context, TITANIUM_KEY, Feature.ORE, new OreConfiguration(
                List.of(
                        OreConfiguration.target(stoneReplaceables, ModBlocks.TITANIUM_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.TITANIUM_DEEPSLATE_ORE.defaultBlockState())),
                7));

        register(context, CHLOROPHYTE_KEY, Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(jungleReplaceables, ModBlocks.CHLOROPHYTE_ORE.defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.CHLOROPHYTE_DEEPSLATE_ORE.defaultBlockState())),
                11));

        register(context, MUD, Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(stoneReplaceables, Blocks.MUD.defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, Blocks.MUD.defaultBlockState())),
                30));




//tress

        register(context, SHADEWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.SHADEWOOD_LOG),
                new FancyTrunkPlacer(3, 3, 8),

                BlockStateProvider.simple(ModBlocks.SHADEWOOD_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(4), ConstantInt.of(4), 3),

                new TwoLayersFeatureSize(1, 0, 2),
                BlockStateProvider.simple(ModBlocks.CRIMSON_DIRT)).build());

        register(context, BOREAL, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.BOREAL_WOOD_LOG),
                new FancyTrunkPlacer(4, 4, 9),

                BlockStateProvider.simple(Blocks.AIR),
                new BlobFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), 0),

                new TwoLayersFeatureSize(1, 0, 2),
                BlockStateProvider.simple(Blocks.DIRT)).build());



        register(context, BLOOD_ORANGE_BUSH, Feature.SIMPLE_RANDOM_SELECTOR,
                new CompositeFeatureConfiguration(
                        HolderSet.direct(PlacementUtils.inlinePlaced(
                                Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BLOOD_ORANGE_BUSH
                                        .defaultBlockState().setValue(BloodOrangeBushBlock.AGE, 3))),
                                CountPlacement.of(32),
                                RandomOffsetPlacement.ofTriangle(6, 3),
                                BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE)))));




    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
