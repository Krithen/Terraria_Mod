package com.krithenmc.unnamedmod.worldgen;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.block.ModBlocks;
import com.krithenmc.unnamedmod.block.custom.BloodOrangeBushBlock;
import com.krithenmc.unnamedmod.tags.ModTags;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.OffsetPlacement;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModFeatures {
    //feature with configuration
    //things can be different, so its not exactly the same
    //how something looks like
    public static final ResourceKey<Feature> LEAD_ORE_KEY = registerKey("lead_ore");
    public static final ResourceKey<Feature> CRIMTANE_ORE_KEY = registerKey("crimtane_ore");
    public static final ResourceKey<Feature> SHADEWOOD_KEY = registerKey("shadewood");
    public static final ResourceKey<Feature> TIN_KEY = registerKey("tin_ore");
    public static final ResourceKey<Feature> TUNGSTEN_KEY = registerKey("tungsten_ore");
    public static final ResourceKey<Feature> SILVER_KEY = registerKey("silver_ore");
    public static final ResourceKey<Feature> PLATINUM_KEY = registerKey("platinum_ore");
    public static final ResourceKey<Feature> DEMONITE_KEY = registerKey("demonite_ore");
    public static final ResourceKey<Feature> HELLSTONE_KEY = registerKey("hellstone_ore");
    public static final ResourceKey<Feature> COBALT_KEY = registerKey("cobalt_ore");
    public static final ResourceKey<Feature> PALLADIUM_KEY = registerKey("palladium_ore");
    public static final ResourceKey<Feature> ORICHALCUM_KEY = registerKey("orichalcum_ore");
    public static final ResourceKey<Feature> MYTHRIL_KEY = registerKey("mythril_ore");
    public static final ResourceKey<Feature> ADAMANTITE_KEY = registerKey("adamantite_ore");
    public static final ResourceKey<Feature> TITANIUM_KEY = registerKey("titanium_ore");
    public static final ResourceKey<Feature> CHLOROPHYTE_KEY = registerKey("chlorophyte_ore");
    public static final ResourceKey<Feature> MUD = registerKey("mud");

    public static final ResourceKey<Feature> BOREAL = registerKey("boreal");
    public static final ResourceKey<Feature> ASHWOOD = registerKey("ashwood");
    public static final ResourceKey<Feature> MAHOGANY = registerKey("mahogany");
    public static final ResourceKey<Feature> EBON = registerKey("ebon");
    public static final ResourceKey<Feature> PALM = registerKey("palm");
    public static final ResourceKey<Feature> PEARL = registerKey("pearl");

    public static final ResourceKey<Feature> BLOOD_ORANGE_BUSH = registerKey("blood_orange_bush");



    public static void bootstrap(BootstrapContext<Feature> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest underworldReplaceables = new TagMatchTest(ModTags.Blocks.UNDERWORLD_ORE_REPLACEABLES);
        RuleTest jungleReplaceables = new TagMatchTest(ModTags.Blocks.JUNGLE_ORE_REPLACEABLES);

        context.register(LEAD_ORE_KEY, new OreFeature(
                List.of(
                        BlockReplacement.replace(stoneReplaceables, ModBlocks.LEAD_ORE.defaultBlockState()),
                        BlockReplacement.replace(deepslateReplaceables, ModBlocks.LEAD_DEEPSLATE_ORE.defaultBlockState())),
                11));
        context.register(CRIMTANE_ORE_KEY, new OreFeature(
                List.of(
                        BlockReplacement.replace(stoneReplaceables, ModBlocks.CRIMTANE_ORE.defaultBlockState()),
                        BlockReplacement.replace(deepslateReplaceables, ModBlocks.CRIMTANE_DEEPSLATE_ORE.defaultBlockState())),
                5));
        context.register(TIN_KEY, new OreFeature(
                List.of(
                        BlockReplacement.replace(stoneReplaceables, ModBlocks.TIN_ORE.defaultBlockState()),
                        BlockReplacement.replace(deepslateReplaceables, ModBlocks.TIN_DEEPSLATE_ORE.defaultBlockState())),
                11));
        context.register(SILVER_KEY, new OreFeature(
                List.of(
                        BlockReplacement.replace(stoneReplaceables, ModBlocks.SILVER_ORE.defaultBlockState()),
                        BlockReplacement.replace(deepslateReplaceables, ModBlocks.SILVER_DEEPSLATE_ORE.defaultBlockState())),
                9));
        context.register(TUNGSTEN_KEY, new OreFeature(
                List.of(
                        BlockReplacement.replace(stoneReplaceables, ModBlocks.TUNGSTEN_ORE.defaultBlockState()),
                        BlockReplacement.replace(deepslateReplaceables, ModBlocks.DEEPSLATE_TUNGSTEN_ORE.defaultBlockState())),
                9));
        context.register(DEMONITE_KEY, new OreFeature(
                List.of(
                        BlockReplacement.replace(stoneReplaceables, ModBlocks.DEMONITE_ORE.defaultBlockState()),
                        BlockReplacement.replace(deepslateReplaceables, ModBlocks.DEMONITE_DEEPSLATE_ORE.defaultBlockState())),
                5));
        context.register(HELLSTONE_KEY, new OreFeature(underworldReplaceables, ModBlocks.HELLSTONE_ORE.defaultBlockState(), 9));

        context.register(COBALT_KEY, new OreFeature(
                List.of(
                        BlockReplacement.replace(stoneReplaceables, ModBlocks.COBALT_ORE.defaultBlockState()),
                        BlockReplacement.replace(deepslateReplaceables, ModBlocks.COBALT_DEEPSLATE_ORE.defaultBlockState())),
                11));

        context.register(PALLADIUM_KEY, new OreFeature(
                List.of(
                        BlockReplacement.replace(stoneReplaceables, ModBlocks.PALLADIUM_ORE.defaultBlockState()),
                        BlockReplacement.replace(deepslateReplaceables, ModBlocks.PALLADIUM_DEEPSLATE_ORE.defaultBlockState())),
                11));

        context.register(MYTHRIL_KEY,  new OreFeature(
                List.of(
                        BlockReplacement.replace(stoneReplaceables, ModBlocks.MYTHRIL_ORE.defaultBlockState()),
                        BlockReplacement.replace(deepslateReplaceables, ModBlocks.MYTHRIL_DEEPSLATE_ORE.defaultBlockState())),
                9));

        context.register(ORICHALCUM_KEY, new OreFeature(
                List.of(
                        BlockReplacement.replace(stoneReplaceables, ModBlocks.ORICHALCUM_ORE.defaultBlockState()),
                        BlockReplacement.replace(deepslateReplaceables, ModBlocks.ORICHALCUM_DEEPSLATE_ORE.defaultBlockState())),
                9));

        context.register(ADAMANTITE_KEY, new OreFeature(
                List.of(
                        BlockReplacement.replace(stoneReplaceables, ModBlocks.ADAMANTITE_ORE.defaultBlockState()),
                        BlockReplacement.replace(deepslateReplaceables, ModBlocks.ADAMANTITE_DEEPSLATE_ORE.defaultBlockState())),
                7));

        context.register(TITANIUM_KEY, new OreFeature(
                List.of(
                        BlockReplacement.replace(stoneReplaceables, ModBlocks.TITANIUM_ORE.defaultBlockState()),
                        BlockReplacement.replace(deepslateReplaceables, ModBlocks.TITANIUM_DEEPSLATE_ORE.defaultBlockState())),
                7));

        context.register(CHLOROPHYTE_KEY,  new OreFeature(List.of(
                BlockReplacement.replace(jungleReplaceables, ModBlocks.CHLOROPHYTE_ORE.defaultBlockState()),
                BlockReplacement.replace(deepslateReplaceables, ModBlocks.CHLOROPHYTE_DEEPSLATE_ORE.defaultBlockState())),
                11));

        context.register(MUD, new OreFeature(List.of(
                BlockReplacement.replace(stoneReplaceables, Blocks.MUD.defaultBlockState()),
                BlockReplacement.replace(deepslateReplaceables, Blocks.MUD.defaultBlockState())),
                30));




//tress

        context.register(SHADEWOOD_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(ModBlocks.SHADEWOOD_LOG),
                new FancyTrunkPlacer(3, 3, 8),

                BlockStateProvider.of(ModBlocks.SHADEWOOD_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(4), ConstantInt.of(4), 3),

                new TwoLayersFeatureSize(1, 0, 2),
                BlockStateProvider.holderOf(ModBlocks.CRIMSON_DIRT)).build());

        context.register(BOREAL, new TreeFeature.Builder(
                BlockStateProvider.of(ModBlocks.BOREAL_WOOD_LOG),
                new FancyTrunkPlacer(4, 4, 9),

                BlockStateProvider.of(Blocks.AIR),
                new BlobFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), 0),

                new TwoLayersFeatureSize(1, 0, 2),
                BlockStateProvider.holderOf(Blocks.DIRT)).build());



        context.register(BLOOD_ORANGE_BUSH, new SimpleRandomSelectorFeature(
                        HolderSet.direct(PlacementUtils.inlinePlaced(
                                new SimpleBlockFeature(BlockStateProvider.of(ModBlocks.BLOOD_ORANGE_BUSH
                                        .defaultBlockState().setValue(BloodOrangeBushBlock.AGE, 3))),
                                CountPlacement.of(32),
                                OffsetPlacement.ofTriangle(6, 3),
                                BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE)))));




    }

    public static ResourceKey<Feature> registerKey(String name) {
        return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name));
    }
}
