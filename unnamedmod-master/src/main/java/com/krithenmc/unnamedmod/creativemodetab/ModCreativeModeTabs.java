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
                        output.accept(ModBlocks.CRIMTANE_BRICKS);
                        output.accept(ModBlocks.CRYOCORE_BRICKS);
                        output.accept(ModBlocks.DARK_CELESTIAL_BRICKS);
                        output.accept(ModBlocks.DEMONITE_BRICKS);
                        output.accept(ModBlocks.EBONSTONE_BRICKS);
                        output.accept(ModBlocks.HALLOWED_BRICKS);
                        output.accept(ModBlocks.RAINBOW_BRICKS);
                        output.accept(ModBlocks.RAINBOW_BRICK_SLABS);
                        output.accept(ModBlocks.RAINBOW_BRICK_STAIRS);
                        output.accept(ModBlocks.RAINBOW_BRICK_WALLS);
                        output.accept(ModBlocks.RAINBOW_BRICK_BUTTON);
                        output.accept(ModBlocks.ICE_BRICKS);
                        output.accept(ModBlocks.IRIDESCENT_BRICKS);
                        output.accept(ModBlocks.METEORITE_BRICKS);
                        output.accept(ModBlocks.MUDSTONE_BRICKS);
                        output.accept(ModBlocks.MYTHRIL_BRICKS);
                        output.accept(ModBlocks.OBSIDIAN_BRICKS);
                        output.accept(ModBlocks.BLUE_DUNGEON_BRICKS);
                        output.accept(ModBlocks.GREEN_DUNGEON_BRICKS);
                        output.accept(ModBlocks.PINK_DUNGEON_BRICKS);
                        output.accept(ModBlocks.LIZAHARD_BRICKS);
                        output.accept(ModBlocks.PEARLSTONE_BRICKS);
                        output.accept(ModBlocks.RED_BRICK);
                        output.accept(ModBlocks.EMERALD_GEMSPARK_BLOCK);
                        output.accept(ModBlocks.SNOW_BRICKS);
                        output.accept(ModBlocks.SUNPLATE_BLOCK);
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
                        output.accept(ModBlocks.BLUE_GRANITE);
                        output.accept(ModBlocks.BLUE_GRANITE_SLAB);
                        output.accept(ModBlocks.BLUE_GRANITE_WALL);
                        output.accept(ModBlocks.BLUE_GRANITE_STAIRS);
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
                        //functuinal
                        output.accept(ModBlocks.BOTTLE_TERRARIA);
                        output.accept(ModBlocks.LEAD_ANVIL);
                    }).build());



    public static final CreativeModeTab TERRARIA_TOOLS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "terraria_tools"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WOODEN_HAMMER))
                    .title(Component.translatable("creativemodetab.unnamedmod.terraria_tools"))
                    .displayItems((parameters, output) -> {
                        //hammers
                        output.accept(ModItems.WOODEN_HAMMER);
                        output.accept(ModItems.THE_BREAKER);
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
                        //bows
                        output.accept(ModItems.DEMON_BOW);
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
                        //spears
                        output.accept(ModItems.GUNGNIR);
                        output.accept(ModItems.AREADBHAR);
                        output.accept(ModItems.ADAMANTITE_GLAIVE);
                        output.accept(ModItems.CHLOROPHYTE_PARTISAN);
                        output.accept(ModItems.COBALT_NAGINATA);
                        output.accept(ModItems.DARK_LANCE);
                        output.accept(ModItems.GHASTLY_GLAIVE);


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


    public static void registerModCreativeModeTabs() {
        Unnamedmod.LOGGER.info("Registering Creative Mode Tabs for" + Unnamedmod.MOD_ID);
    }
}
