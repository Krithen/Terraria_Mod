package com.krithenmc.unnamedmod.creativemodetab;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.block.ModBlocks;
import com.krithenmc.unnamedmod.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab TERRARIA_ITEMS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "terraria_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ADAMANTITE_BAR))
                    .title(Component.translatable("creativemodetab.unnamedmod.terraria_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.RAW_ADAMANTITE);
                        output.accept(ModItems.ADAMANTITE_BAR);
                        output.accept(ModItems.AMBER);
                        output.accept(ModItems.CHLOROPHYTE_BAR);
                        output.accept(ModItems.COBALT_BAR);
                        output.accept(ModItems.CRIMTANE_BAR);
                        output.accept(ModItems.DEMONITE_BAR);
                        output.accept(ModItems.HALLOWED_BAR);
                        output.accept(ModItems.HELLSTONE);
                        output.accept(ModItems.HELLSTONE_BAR);
                        output.accept(ModItems.LEAD_BAR);
                        output.accept(ModItems.LUMINITE_BAR);
                        output.accept(ModItems.METEORITE);
                        output.accept(ModItems.METEORITE_BAR);
                        output.accept(ModItems.MYTHRIL_BAR);
                        output.accept(ModItems.ORICHALCUM_BAR);
                        output.accept(ModItems.PALLADIUM_BAR);
                        output.accept(ModItems.PLATINUM_BAR);
                        output.accept(ModItems.RAW_CHLOROPHYTE);
                        output.accept(ModItems.RAW_COBALT);
                        output.accept(ModItems.RAW_CRIMTANE);
                        output.accept(ModItems.RAW_DEMONITE);
                        output.accept(ModItems.RAW_LEAD);
                        output.accept(ModItems.RAW_LUMINITE);
                        output.accept(ModItems.RAW_MYTHRIL);
                        output.accept(ModItems.RAW_ORICHALCUM);
                        output.accept(ModItems.RAW_PALLADIUM);
                        output.accept(ModItems.RAW_SILVER);
                        output.accept(ModItems.RUBY);
                        output.accept(ModItems.SAPPHIRE);
                        output.accept(ModItems.SHROOMITE_BAR);
                        output.accept(ModItems.SILVER_BAR);
                        output.accept(ModItems.SPECTRE_BAR);
                        output.accept(ModItems.TIN_BAR);
                        output.accept(ModItems.TITANIUM_BAR);
                        output.accept(ModItems.TOPAZ);
                        output.accept(ModItems.TUNGSTEN_BAR);
                        output.accept(ModItems.ECTOPLASM);
                        output.accept(ModItems.GLOWING_MUSHROOM);
                        output.accept(ModItems.GEL);
                        output.accept(ModItems.ACORN);
                        output.accept(ModItems.UMBRAL_CRYSTAL);
                        output.accept(ModItems.UMBRAL_PLATE);
                        output.accept(ModItems.CORRUPTED_STICK);
                        output.accept(ModItems.SOUL_OF_NIGHT);
                        output.accept(ModItems.BLEEDING_STICK);
                        output.accept(ModItems.JUNGLE_SPORES);
                        output.accept(ModItems.STINGER);
                        output.accept(ModItems.SHADOW_SCALE);
                        output.accept(ModItems.DEMONITE_PLATING);
                        output.accept(ModItems.SOUL_OF_MIGHT);
                        output.accept(ModItems.SOUL_OF_SIGHT);
                        output.accept(ModItems.RAW_TUNGSTEN);
                        output.accept(ModItems.CORRUPT_SEEDS);
                        output.accept(ModItems.RAW_TITANUM);
                        output.accept(ModItems.RAW_TIN);
                        output.accept(ModItems.MAGIC_MIRROR);
                        output.accept(ModItems.FUSED_VERTEBRA);
                        output.accept(ModItems.LENS);
                        output.accept(ModItems.MUSHROOM);
                        output.accept(ModItems.DEATHWEED_SEEDS);
                        output.accept(ModItems.DEATHWEED);
                        output.accept(ModItems.SUSPICIOUS_LOOKING_EYE);
                        output.accept(ModItems.TISSUE_SAMPLE);
                        output.accept(ModItems.ANCIENT_CLOTH);
                        output.accept(ModItems.BLACK_LENS);
                        output.accept(ModItems.CRIMSON_CRATE);
                        output.accept(ModItems.CURSED_FLAMES);
                        output.accept(ModItems.DIVINE_CRATE);
                        output.accept(ModItems.ANTLION_MANDIBLE);
                        output.accept(ModItems.GELATIN_CRYSTAL);
                        output.accept(ModItems.GREEN_MUSHROOM);
                        output.accept(ModItems.HALLOWED_CRATE);
                        output.accept(ModItems.FLAMING_ARROW);



                    }).build());

    public static final CreativeModeTab TERRARIA_BLOCKS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "terraria_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CYAN_MOSS))
                    .title(Component.translatable("creativemodetab.unnamedmod.terraria_blocks"))
                    .displayItems((parameters, output) -> {

                        //ore
                        output.accept(ModBlocks.ADAMANTITE_ORE);
                        output.accept(ModBlocks.ADAMANTITE_DEEPSLATE_ORE);
                        output.accept(ModBlocks.CHLOROPHYTE_ORE);
                        output.accept(ModBlocks.CHLOROPHYTE_DEEPSLATE_ORE);
                        output.accept(ModBlocks.COBALT_ORE);
                        output.accept(ModBlocks.COBALT_DEEPSLATE_ORE);
                        output.accept(ModBlocks.CRIMTANE_ORE);
                        output.accept(ModBlocks.CRIMTANE_DEEPSLATE_ORE);
                        output.accept(ModBlocks.DEMONITE_ORE);
                        output.accept(ModBlocks.DEMONITE_EBONSTONE_ORE);
                        output.accept(ModBlocks.DEMONITE_DEEPSLATE_ORE);
                        output.accept(ModBlocks.LEAD_ORE);
                        output.accept(ModBlocks.LEAD_DEEPSLATE_ORE);
                        output.accept(ModBlocks.MYTHRIL_ORE);
                        output.accept(ModBlocks.MYTHRIL_DEEPSLATE_ORE);
                        output.accept(ModBlocks.METEORITE_ORE);
                        output.accept(ModBlocks.ORICHALCUM_ORE);
                        output.accept(ModBlocks.ORICHALCUM_DEEPSLATE_ORE);
                        output.accept(ModBlocks.PALLADIUM_ORE);
                        output.accept(ModBlocks.PALLADIUM_DEEPSLATE_ORE);
                        output.accept(ModBlocks.TUNGSTEN_ORE);
                        output.accept(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
                        output.accept(ModBlocks.TITANIUM_ORE);
                        output.accept(ModBlocks.TITANIUM_DEEPSLATE_ORE);
                        output.accept(ModBlocks.TIN_ORE);
                        output.accept(ModBlocks.TIN_DEEPSLATE_ORE);
                        output.accept(ModBlocks.SILVER_ORE);
                        output.accept(ModBlocks.SILVER_DEEPSLATE_ORE);
                        output.accept(ModBlocks.HELLSTONE_ORE);
                        output.accept(ModBlocks.LUMINITE_ORE);
                        output.accept(ModBlocks.AMBER_STONE);
                        //moss
                        output.accept(ModBlocks.CYAN_MOSS);
                        output.accept(ModBlocks.RED_MOSS);
                        output.accept(ModBlocks.BLUE_MOSS);
                        output.accept(ModBlocks.PURPLE_MOSS);
                        output.accept(ModBlocks.HELIUM_MOSS);
                        output.accept(ModBlocks.HELIUM_MOSS_CARPET);
                        output.accept(ModBlocks.ARGON_MOSS);
                        output.accept(ModBlocks.ARGON_MOSS_CARPET);
                        output.accept(ModBlocks.KRYPTON_MOSS);
                        output.accept(ModBlocks.KRYPTON_MOSS_CARPET);
                        output.accept(ModBlocks.LAVA_MOSS);
                        output.accept(ModBlocks.LAVA_MOSS_CARPET);
                        //wood
                        output.accept(ModBlocks.SHADEWOOD_LOG);
                        output.accept(ModBlocks.STRIPPED_SHADEWOOD_LOG);
                        output.accept(ModBlocks.STRIPPED_SHADEWOOD);
                        output.accept(ModBlocks.SHADEWOOD_PLANK);
                        output.accept(ModBlocks.SHADEWOOD_STAIRS);
                        output.accept(ModBlocks.SHADEWOOD_SLAB);
                        output.accept(ModBlocks.SHADEWOOD_BUTTON);
                        output.accept(ModBlocks.SHADEWOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.SHADEWOOD_FENCE);
                        output.accept(ModBlocks.SHADEWOOD_FENCE_GATE);
                        output.accept(ModBlocks.SHADEWOOD_DOOR);
                        output.accept(ModBlocks.SHADEWOOD_TRAPDOOR);
                        output.accept(ModBlocks.BOREAL_WOOD_LOG);
                        output.accept(ModBlocks.STRIPPED_BOREAL_LOG);
                        output.accept(ModBlocks.STRIPPED_BOREAL_WOOD);
                        output.accept(ModBlocks.Boreal_Planks);
                        output.accept(ModBlocks.BOREAL_STAIRS);
                        output.accept(ModBlocks.BOREAL_SLAB);
                        output.accept(ModBlocks.BOREAL_BUTTON);
                        output.accept(ModBlocks.BOREAL_PRESSURE_PLATE);
                        output.accept(ModBlocks.BOREAL_FENCE);
                        output.accept(ModBlocks.BOREAL_FENCE_GATE);
                        output.accept(ModBlocks.BOREAL_DOOR);
                        output.accept(ModBlocks.BOREAL_TRAPDOOR);
                        output.accept(ModBlocks.PALMWOOD_LOG);
                        output.accept(ModBlocks.PALMWOOD_PLANKS);
                        output.accept(ModBlocks.PALMWOOD_STAIRS);
                        output.accept(ModBlocks.PALMWOOD_SLABS);
                        output.accept(ModBlocks.PALMWOOD_BUTTON);
                        output.accept(ModBlocks.PALMWOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.PALMWOOD_FENCE);
                        output.accept(ModBlocks.PALMWOOD_FENCE_GATE);
                        output.accept(ModBlocks.PALMWOOD_TRAPDOOR);
                        output.accept(ModBlocks.PALMWOOD_DOOR);
                        output.accept(ModBlocks.RICH_MAHOGANY_LOG);
                        output.accept(ModBlocks.RICH_MAHOGANY_PLANKS);
                        output.accept(ModBlocks.RICH_MAHOGANY_STAIRS);
                        output.accept(ModBlocks.RICH_MAHOGANY_SLAB);
                        output.accept(ModBlocks.RICH_MAHOGANY_BUTTON);
                        output.accept(ModBlocks.RICH_MAHOGANY_PRESSURE_PLATE);
                        output.accept(ModBlocks.RICH_MAHOGANY_FENCE);
                        output.accept(ModBlocks.RICH_MAHOGANY_FENCE_GATE);
                        output.accept(ModBlocks.RICH_MAHOGANY_DOOR);
                        output.accept(ModBlocks.RICH_MAHOGANY_TRAPDOOR);
                        output.accept(ModBlocks.ASH_WOOD);
                        output.accept(ModBlocks.ASH_WOOD_PLANKS);
                        output.accept(ModBlocks.ASH_STAIRS);
                        output.accept(ModBlocks.ASH_SLAB);
                        output.accept(ModBlocks.ASH_BUTTON);
                        output.accept(ModBlocks.ASH_PRESSURE_PLATE);
                        output.accept(ModBlocks.ASH_FENCE);
                        output.accept(ModBlocks.ASH_FENCE_GATE);
                        output.accept(ModBlocks.ASH_DOOR);
                        output.accept(ModBlocks.ASH_TRAPDOOR);
                        output.accept(ModBlocks.EBONWOOD_LOG);
                        output.accept(ModBlocks.EBONWOOD_PLANKS);
                        output.accept(ModBlocks.EBONWOOD_STAIRS);
                        output.accept(ModBlocks.EBONWOOD_SLAB);
                        output.accept(ModBlocks.EBONWOOD_BUTTON);
                        output.accept(ModBlocks.EBONWOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.EBONWOOD_FENCE);
                        output.accept(ModBlocks.EBONWOOD_FENCE_GATE);
                        output.accept(ModBlocks.EBONWOOD_DOOR);
                        output.accept(ModBlocks.EBONWOOD_TRAPDOOR);
                        output.accept(ModBlocks.PEARLWOOD_LOG);
                        output.accept(ModBlocks.PEARLWOOD);
                        output.accept(ModBlocks.PEARLWOOD_PLANKS);
                        output.accept(ModBlocks.PEARLWOOD_STAIRS);
                        output.accept(ModBlocks.PEARLWOOD_SLAB);
                        output.accept(ModBlocks.PEARLWOOD_BUTTON);
                        output.accept(ModBlocks.PEARLWOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.PEARLWOOD_FENCE);
                        output.accept(ModBlocks.PEARLWOOD_FENCE_GATE);

                        //bricks
                        output.accept(ModBlocks.ASTRA_BRICKS);
                        output.accept(ModBlocks.CHLOROPHYTE_BRICKS);
                        output.accept(ModBlocks.CHLOROPHYTE_BRICK_STAIRS);
                        output.accept(ModBlocks.CHLOROPHYTE_BRICK_SLAB);
                        output.accept(ModBlocks.CHLOROPHYTE_BRICK_WALL);
                        output.accept(ModBlocks.COBALT_BRICKS);
                        output.accept(ModBlocks.COBALT_BRICK_SLAB);
                        output.accept(ModBlocks.COBALT_BRICK_STAIRS);
                        output.accept(ModBlocks.COBALT_BRICK_WALL);
                        output.accept(ModBlocks.COSMIC_EMBER_BRICKS);
                        output.accept(ModBlocks.CRIMSTONE_BRICKS);
                        output.accept(ModBlocks.CRIMSTONE_BRICK_STAIRS);
                        output.accept(ModBlocks.CRIMSTONE_BRICK_SLAB);
                        output.accept(ModBlocks.CRIMSTONE_BRICK_WALL);
                        output.accept(ModBlocks.CRIMTANE_BRICKS);
                        output.accept(ModBlocks.CRIMTANE_BRICK_STAIRS);
                        output.accept(ModBlocks.CRIMTANE_BRICK_SLAB);
                        output.accept(ModBlocks.CRIMTANE_BRICK_WALL);
                        output.accept(ModBlocks.CRYOCORE_BRICKS);
                        output.accept(ModBlocks.DARK_CELESTIAL_BRICKS);
                        output.accept(ModBlocks.HEAVENFORGED_BRICKS);
                        output.accept(ModBlocks.LUNAR_RUST_BRICKS);
                        output.accept(ModBlocks.MERCURY_BRICKS);
                        output.accept(ModBlocks.LUMINITE_BRICKS);
                        output.accept(ModBlocks.DEMONITE_BRICKS);
                        output.accept(ModBlocks.DEMONITE_BRICK_STAIRS);
                        output.accept(ModBlocks.DEMONITE_BRICK_SLAB);
                        output.accept(ModBlocks.DEMONITE_BRICK_WALL);
                        output.accept(ModBlocks.EBONSTONE_BRICKS);
                        output.accept(ModBlocks.EBONSTONE_BRICK_STAIRS);
                        output.accept(ModBlocks.EBONSTONE_BRICK_SLAB);
                        output.accept(ModBlocks.EBONSTONE_BRICK_WALL);
                        output.accept(ModBlocks.HALLOWED_BRICKS);
                        output.accept(ModBlocks.HALLOWED_BRICK_STAIRS);
                        output.accept(ModBlocks.HALLOWED_BRICK_SLAB);
                        output.accept(ModBlocks.HALLOWED_BRICK_WALL);
                        output.accept(ModBlocks.RAINBOW_BRICKS);
                        output.accept(ModBlocks.RAINBOW_BRICK_SLABS);
                        output.accept(ModBlocks.RAINBOW_BRICK_STAIRS);
                        output.accept(ModBlocks.RAINBOW_BRICK_WALLS);
                        output.accept(ModBlocks.RAINBOW_BRICK_BUTTON);
                        output.accept(ModBlocks.ICE_BRICKS);
                        output.accept(ModBlocks.ICE_BRICK_STAIRS);
                        output.accept(ModBlocks.ICE_BRICK_SLAB);
                        output.accept(ModBlocks.ICE_BRICK_WALL);
                        output.accept(ModBlocks.IRIDESCENT_BRICKS);
                        output.accept(ModBlocks.IRIDESCENT_BRICK_STAIRS);
                        output.accept(ModBlocks.IRIDESCENT_BRICK_SLAB);
                        output.accept(ModBlocks.IRIDESCENT_BRICK_WALL);
                        output.accept(ModBlocks.METEORITE_BRICKS);
                        output.accept(ModBlocks.METEORITE_BRICK_STAIRS);
                        output.accept(ModBlocks.METEORITE_BRICK_SLAB);
                        output.accept(ModBlocks.METEORITE_BRICK_WALL);
                        output.accept(ModBlocks.MUDSTONE_BRICKS);
                        output.accept(ModBlocks.MUDSTONE_BRICK_STAIRS);
                        output.accept(ModBlocks.MUDSTONE_BRICK_SLAB);
                        output.accept(ModBlocks.MUDSTONE_BRICK_WALL);
                        output.accept(ModBlocks.MYTHRIL_BRICKS);
                        output.accept(ModBlocks.MYTHRIL_BRICK_STAIRS);
                        output.accept(ModBlocks.MYTHRIL_BRICK_SLAB);
                        output.accept(ModBlocks.MYTHRIL_BRICK_WALL);
                        output.accept(ModBlocks.OBSIDIAN_BRICKS);
                        output.accept(ModBlocks.OBSIDIAN_BRICK_STAIRS);
                        output.accept(ModBlocks.OBSIDIAN_BRICK_SLAB);
                        output.accept(ModBlocks.OBSIDIAN_BRICK_WALL);
                        output.accept(ModBlocks.BLUE_DUNGEON_BRICKS);
                        output.accept(ModBlocks.BLUE_DUNGEON_BRICK_STAIRS);
                        output.accept(ModBlocks.BLUE_DUNGEON_BRICK_SLAB);
                        output.accept(ModBlocks.BLUE_DUNGEON_BRICK_WALL);
                        output.accept(ModBlocks.GREEN_DUNGEON_BRICKS);
                        output.accept(ModBlocks.GREEN_DUNGEON_BRICK_STAIRS);
                        output.accept(ModBlocks.GREEN_DUNGEON_BRICK_SLAB);
                        output.accept(ModBlocks.GREEN_DUNGEON_BRICK_WALL);
                        output.accept(ModBlocks.PINK_DUNGEON_BRICKS);
                        output.accept(ModBlocks.PINK_DUNGEON_BRICK_STAIRS);
                        output.accept(ModBlocks.PINK_DUNGEON_BRICK_SLAB);
                        output.accept(ModBlocks.PINK_DUNGEON_BRICK_WALL);
                        output.accept(ModBlocks.LIZAHARD_BRICKS);
                        output.accept(ModBlocks.LIZAHARD_BRICK_STAIRS);
                        output.accept(ModBlocks.LIZAHARD_BRICK_SLAB);
                        output.accept(ModBlocks.LIZAHARD_BRICK_WALL);
                        output.accept(ModBlocks.PEARLSTONE_BRICKS);
                        output.accept(ModBlocks.PEARLSTONE_BRICK_STAIRS);
                        output.accept(ModBlocks.PEARLSTONE_BRICK_SLAB);
                        output.accept(ModBlocks.PEARLSTONE_BRICK_WALL);
                        output.accept(ModBlocks.RED_BRICK);
                        output.accept(ModBlocks.EMERALD_GEMSPARK_BLOCK);
                        output.accept(ModBlocks.SNOW_BRICKS);
                        output.accept(ModBlocks.SUNPLATE_BLOCK);
                        output.accept(ModBlocks.ADAMANTITE_BEAM);
                        output.accept(ModBlocks.AMBER_GEMSPARK_BLOCK);
                        output.accept(ModBlocks.AMETHYST_GEMSPARK_BLOCK);
                        output.accept(ModBlocks.ANCIENT_BLUE_BRICKS);
                        output.accept(ModBlocks.ANCIENT_COPPER_BRICKS);
                        output.accept(ModBlocks.ANCIENT_COBALT_BRICKS);
                        output.accept(ModBlocks.ANCIENT_GOLD_BRICKS);
                        output.accept(ModBlocks.ANCIENT_GREEN_BRICKS);
                        output.accept(ModBlocks.ANCIENT_HELLSTONE_BRICKS);
                        output.accept(ModBlocks.ANCIENT_PINK_BRICKS);
                        output.accept(ModBlocks.ANCIENT_MYTHRIL_BRICKS);
                        output.accept(ModBlocks.ANCIENT_OBSIDIAN_BRICKS);
                        output.accept(ModBlocks.ARGON_MOSS_BRICK);
                        output.accept(ModBlocks.ASPHALT);
                        output.accept(ModBlocks.COPPER_BRICKS);
                        output.accept(ModBlocks.CRACKED_BLUE_DUNGEON_BRICKS);
                        output.accept(ModBlocks.CRACKED_GREEN_DUNGEON_BRICKS);
                        output.accept(ModBlocks.CRACKED_PINK_DUNGEON_BRICKS);
                        output.accept(ModBlocks.GOLD_BRICKS);
                        output.accept(ModBlocks.GOTHIC_BRICKS);
                        output.accept(ModBlocks.HELIUM_MOSS_BRICK);
                        output.accept(ModBlocks.IRON_BRICKS);
                        output.accept(ModBlocks.KRYPTON_MOSS_BRICK);
                        output.accept(ModBlocks.LAVA_MOSS_BRICK);
                        output.accept(ModBlocks.LEAD_BRICKS);
                        output.accept(ModBlocks.MIDNIGHT_CONFETTI_BLOCK);
                        output.accept(ModBlocks.PLATINUM_BRICKS);
                        output.accept(ModBlocks.SILVER_BRICKS);
                        output.accept(ModBlocks.TIN_BRICKS);
                        output.accept(ModBlocks.TUNGSTEN_BRICKS);
                        //natural blocks

                        output.accept(ModBlocks.SHADEWOOD_LEAVES);
                        output.accept(ModBlocks.CRIMSTONE);
                        output.accept(ModBlocks.CRIMSTONE_SLAB);
                        output.accept(ModBlocks.CRIMSTONE_STAIRS);
                        output.accept(ModBlocks.CRIMSTONE_WALL);
                        output.accept(ModBlocks.EBONSTONE);
                        output.accept(ModBlocks.EBONSTONE_STAIRS);
                        output.accept(ModBlocks.EBONSTONE_SLAB);
                        output.accept(ModBlocks.EBONSTONE_WALL);
                        output.accept(ModBlocks.PEARLSTONE);
                        output.accept(ModBlocks.PEARLSTONE_STAIRS);
                        output.accept(ModBlocks.PEARLSTONE_SLAB);
                        output.accept(ModBlocks.PEARLSTONE_WALL);
                        output.accept(ModBlocks.BLUE_GRANITE);
                        output.accept(ModBlocks.BLUE_GRANITE_SLAB);
                        output.accept(ModBlocks.BLUE_GRANITE_WALL);
                        output.accept(ModBlocks.BLUE_GRANITE_STAIRS);
                        output.accept(ModBlocks.BLOODY_ANDESITE);
                        output.accept(ModBlocks.BLOODY_ANDESITE_SLAB);
                        output.accept(ModBlocks.BLOODY_ANDESITE_STAIRS);
                        output.accept(ModBlocks.BLOODY_ANDESITE_WALL);
                        output.accept(ModBlocks.CRIMSON_GRANITE);
                        output.accept(ModBlocks.CRIMSON_GRANITE_SLAB);
                        output.accept(ModBlocks.CRIMSON_GRANITE_STAIRS);
                        output.accept(ModBlocks.CRIMSON_GRANITE_WALL);
                        output.accept(ModBlocks.DEEPCRIMSTONE);
                        output.accept(ModBlocks.DEEPCRIMSTONE_SLAB);
                        output.accept(ModBlocks.DEEPCRIMSTONE_STAIRS);
                        output.accept(ModBlocks.DEEPCRIMSTONE_WALL);
                        output.accept(ModBlocks.EBONSAND);
                        output.accept(ModBlocks.CRIMSAND);
                        output.accept(ModBlocks.SHIMMER_BLOCK);
                        output.accept(ModBlocks.MARBLE);
                        output.accept(ModBlocks.MARBLE_STAIRS);
                        output.accept(ModBlocks.MARBLE_SLAB);
                        output.accept(ModBlocks.MARBLE_WALL);
                        output.accept(ModBlocks.ANCIENT_FOSSIL);
                        output.accept(ModBlocks.BLUE_MUSHROOM_STEM);
                        output.accept(ModBlocks.BLUE_MUSHROOM_BLOCK);
                        output.accept(ModBlocks.CLOUD);
                        output.accept(ModBlocks.CRISPY_HONEY_BLOCK);
                        output.accept(ModBlocks.HARDENED_SAND);
                        output.accept(ModBlocks.HARDENED_CRIMSAND);
                        output.accept(ModBlocks.HARDENED_EBONSAND);
                        output.accept(ModBlocks.HIVE);
                        output.accept(ModBlocks.LIFE_CRYSTAL);
                        output.accept(ModBlocks.LIVING_LEAF_BLOCK);
                        output.accept(ModBlocks.LIVING_MAHOGANY);
                        output.accept(ModBlocks.LIVING_MAHOGANY_LEAVES);
                        output.accept(ModBlocks.LIVING_WOOD);
                        output.accept(ModBlocks.ASH);
                        output.accept(ModBlocks.PALMWOOD);
                        output.accept(ModBlocks.SHADEWOOD);
                        output.accept(ModBlocks.BOREAL_WOOD);
                        output.accept(ModBlocks.PEARLSAND);
                        output.accept(ModBlocks.RED_ICE);
                        output.accept(ModBlocks.RAINCLOUD);
                        output.accept(ModBlocks.PALMWOOD_LEAVES);
                        output.accept(ModBlocks.BLINKROOT);
                        output.accept(ModBlocks.CRIMSON_CACTUS);
                        output.accept(ModBlocks.CRIMSANDSTONE);
                        output.accept(ModBlocks.CRIMSON_DIRT);
                        output.accept(ModBlocks.CRIMSON_GRASS);
                        output.accept(ModBlocks.EBONSANDSTONE);
                        output.accept(ModBlocks.CRIMSON_TALL_GRASS);
                        output.accept(ModBlocks.EYE_FLOWER);
                        output.accept(ModBlocks.SHADEWOOD_SAPLING);
                        output.accept(ModBlocks.BOREAL_SAPLING);
                        output.accept(ModBlocks.PEARLSANDSTONE);
                        output.accept(ModBlocks.PINK_ICE);
                        //functuinal
                        output.accept(ModBlocks.BOTTLE_TERRARIA);
                        output.accept(ModBlocks.LEAD_ANVIL);
                        output.accept(ModBlocks.HELLSTONE_FORGE);
                        output.accept(ModBlocks.XENON_MOSS_BRICKS);
                        output.accept(ModBlocks.OBSIDIAN_BED);
                    }).build());



    public static final CreativeModeTab TERRARIA_TOOLS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "terraria_tools"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WOODEN_HAMMER))
                    .title(Component.translatable("creativemodetab.unnamedmod.terraria_tools"))
                    .displayItems((parameters, output) -> {
                        //hammers
                        output.accept(ModItems.WOODEN_HAMMER);
                        output.accept(ModItems.THE_BREAKER);
                        output.accept(ModItems.COPPER_HAMMER);
                        output.accept(ModItems.CHLOROPHYTE_GREATHAMMER);
                        output.accept(ModItems.FLESH_GRINDER);
                        output.accept(ModItems.GOLDEN_HAMMER);
                        output.accept(ModItems.HAEMORRHAXE);
                        output.accept(ModItems.HAMMUSH);
                        output.accept(ModItems.IRON_HAMMER);
                        output.accept(ModItems.LEAD_HAMMER);
                        output.accept(ModItems.METEOR_HAMAXE);
                        output.accept(ModItems.MOLTEN_HAMAXE);
                        output.accept(ModItems.SILVER_HAMMER);
                        output.accept(ModItems.PLATINUM_HAMMER);
                        output.accept(ModItems.PWNHAMMER);
                        output.accept(ModItems.TIN_HAMMER);
                        output.accept(ModItems.TUNGSTEN_HAMMER);
                        //shortswords
                        output.accept(ModItems.GOLD_SHORTSWORD);
                        output.accept(ModItems.IRON_SHORTSWORD);
                        output.accept(ModItems.LEAD_SHORTSWORD);
                        output.accept(ModItems.SILVER_SHORTSWORD);
                        output.accept(ModItems.TIN_SHORTSWORD);
                        output.accept(ModItems.TUNGSTEN_SHORTSWORD);
                        output.accept(ModItems.GLADIUS);
                        output.accept(ModItems.RULER);
                        //broadswords
                        output.accept(ModItems.LIGHTS_BANE);
                        output.accept(ModItems.BLOOD_BUTCHERER);
                        output.accept(ModItems.NIGHTS_EDGE);
                        output.accept(ModItems.THE_VOLCANO);
                        output.accept(ModItems.ADVANCED_HELLSTONE_SWORD);
                        output.accept(ModItems.BASIC_HELLSTONE_SWORD);
                        output.accept(ModItems.BLADE_OF_GRASS);
                        output.accept(ModItems.MURAMASA);
                        output.accept(ModItems.BEE_KEEPER);
                        output.accept(ModItems.CANDY_CANE_SWORD);
                        output.accept(ModItems.EXOTIC_SCIMITAR);
                        output.accept(ModItems.ICE_BLADE);
                        output.accept(ModItems.TERRARIA_KATANA);
                        output.accept(ModItems.PURPLE_CLUBBERFISH);
                        output.accept(ModItems.TENTACLE_SPIKE);
                        output.accept(ModItems.STARFURY);
                        output.accept(ModItems.PALLADIUM_SWORD);
                        output.accept(ModItems.ICE_SICKLE);
                        output.accept(ModItems.BONE_SWORD);
                        output.accept(ModItems.BRAND_OF_THE_INFERNO);
                        output.accept(ModItems.COBALT_SWORD);
                        output.accept(ModItems.FROSTBRAND);
                        output.accept(ModItems.MYTHRIL_SWORD);
                        output.accept(ModItems.ORICHALCUM_SWORD);
                        output.accept(ModItems.ADAMANTITE_SWORD);
                        output.accept(ModItems.BEAM_SWORD);
                        output.accept(ModItems.CACTUS_BROADSWORD);
                        output.accept(ModItems.GOLD_BROADSWORD);
                        output.accept(ModItems.COPPER_BROADSWORD);
                        output.accept(ModItems.CUTLASS);
                        output.accept(ModItems.IRON_BROADSWORD);
                        output.accept(ModItems.LEAD_BROADSWORD);
                        output.accept(ModItems.PLATINUM_BROADSWORD);
                        output.accept(ModItems.SILVER_BROADSWORD);
                        output.accept(ModItems.TIN_BROADSWORD);
                        output.accept(ModItems.TITANIUM_SWORD);
                        output.accept(ModItems.TUNGSTEN_BROADSWORD);
                        output.accept(ModItems.TRUE_EXCALIBUR);
                        output.accept(ModItems.TRUE_NIGHTS_EDGE);
                        output.accept(ModItems.CHLOROPHYTE_CLAYMORE);
                        //bows
                        output.accept(ModItems.DEMON_BOW);
                        output.accept(ModItems.AERIAL_BANE);
                        //pickaxes
                        output.accept(ModItems.NIGHTMARE_PICKAXE);
                        output.accept(ModItems.BONE_PICKAXE);
                        output.accept(ModItems.CACTUS_PICKAXE);
                        output.accept(ModItems.FOSSIL_PICKAXE);
                        output.accept(ModItems.LEAD_PICKAXE);
                        output.accept(ModItems.COBALT_PICKAXE);
                        output.accept(ModItems.DEATHBRINGER_PICKAXE);
                        output.accept(ModItems.MOLTEN_PICKAXE);
                        output.accept(ModItems.PLATINUM_PICKAXE);
                        output.accept(ModItems.SILVER_PICKAXE);
                        output.accept(ModItems.TIN_PICKAXE);
                        output.accept(ModItems.TUNGSTEN_PICKAXE);
                        output.accept(ModItems.PICKAXE_AXE);
                        output.accept(ModItems.PICKSAW);
                        output.accept(ModItems.ADAMANTITE_PICKAXE);
                        output.accept(ModItems.NEBULA_PICKAXE);
                        output.accept(ModItems.ORICHALCUM_PICKAXE);
                        output.accept(ModItems.PALLADIUM_PICKAXE);
                        //shovels
                        output.accept(ModItems.NIGHTMARE_SHOVEL);
                        //axes
                        output.accept(ModItems.WAR_AXE_OF_THE_NIGHT);
                        output.accept(ModItems.TIN_AXE);
                        output.accept(ModItems.LEAD_AXE);
                        output.accept(ModItems.SILVER_AXE);
                        output.accept(ModItems.TUNGSTEN_AXE);
                        output.accept(ModItems.PLATINUM_AXE);
                        output.accept(ModItems.STARDUST_HAMAXE);
                        output.accept(ModItems.VORTEX_HAMAXE);
                        output.accept(ModItems.NEBULA_HAMAXE);
                        output.accept(ModItems.SOLAR_HAMAXE);
                        output.accept(ModItems.ADAMANTITE_WARAXE);
                        output.accept(ModItems.CHLOROPHYTE_GREATAXE);
                        output.accept(ModItems.ORICHALCUM_WARAXE);
                        output.accept(ModItems.MYTHRIL_WARAXE);
                        output.accept(ModItems.PALLADIUM_WARAXE);
                        output.accept(ModItems.TITANIUM_WARAXE);
                        //spears
                        output.accept(ModItems.GUNGNIR);
                        output.accept(ModItems.AREADBHAR);
                        output.accept(ModItems.ADAMANTITE_GLAIVE);
                        output.accept(ModItems.CHLOROPHYTE_PARTISAN);
                        output.accept(ModItems.COBALT_NAGINATA);
                        output.accept(ModItems.DARK_LANCE);
                        output.accept(ModItems.GHASTLY_GLAIVE);
                        output.accept(ModItems.BOTANICAL_PIERCER);


                    }).build());

    public static final CreativeModeTab TERRARIA_FOOD_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "terraria_food"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.APRICOT))
                    .title(Component.translatable("creativemodetab.unnamedmod.terraria_food"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.APRICOT);
                        output.accept(ModItems.BANANUH);
                        output.accept(ModItems.JOJA_COLA);
                        output.accept(ModItems.BLOOD_ORANGE);
                        output.accept(ModItems.BLACKCURRANT);
                        output.accept(ModItems.CRIMSON_TIGERFISH);
                        output.accept(ModItems.COCONUT);
                        output.accept(ModItems.CHERRY);
                        output.accept(ModItems.ELDERBERRY);
                        output.accept(ModItems.GRAPEFRUIT);
                        output.accept(ModItems.HAMBURGER);
                        output.accept(ModItems.LEMON);
                        output.accept(ModItems.MANGO);
                        output.accept(ModItems.MARSHMALLOW);
                        output.accept(ModItems.APPLE_PIE);
                        output.accept(ModItems.BACON);
                        output.accept(ModItems.BARBEQUE_RIBS);
                        output.accept(ModItems.BUCKET_OF_MILKSHAKE);
                        output.accept(ModItems.CREAM_SODA);
                        output.accept(ModItems.FRUIT_SALAD);
                        output.accept(ModItems.GOLDEN_DELIGHT);
                        output.accept(ModItems.GRAPE_JUICE);
                        output.accept(ModItems.GRAPES);



                    }).build());

    public static final CreativeModeTab TERRARIA_ARMOR_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "terraria_armor"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.APRICOT))
                    .title(Component.translatable("creativemodetab.unnamedmod.terraria_armor"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.SHADOW_GREAVES);
                        output.accept(ModItems.SHADOW_HELMET);
                        output.accept(ModItems.SHADOW_SCALEMAIL);
                        output.accept(ModItems.SHADOW_SABATONS);

                    }).build());


    public static final CreativeModeTab TERRARIA_SPAWN_EGGS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "terraria_spawn_eggs"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ANTLION_SPAWN_EGG))
                    .title(Component.translatable("creativemodetab.unnamedmod.terraria_spawn_eggs"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.ANTLION_SPAWN_EGG);
                        output.accept(ModItems.SWARMER_SPAWN_EGG);
                        output.accept(ModItems.DEMON_EYE_SPAWN_EGG);
                        output.accept(ModItems.GREEN_EYE_SPAWN_EGG);
                        output.accept(ModItems.PURPLE_EYE_SPAWN_EGG);

                    }).build());



    public static void registerModCreativeModeTabs() {
        Unnamedmod.LOGGER.info("Registering Creative Mode Tabs for" + Unnamedmod.MOD_ID);
    }
}
