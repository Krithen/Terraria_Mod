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


                    }).build());

    public static final CreativeModeTab TERRARIA_BLOCKS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "terraria_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CYAN_MOSS))
                    .title(Component.translatable("creativemodetab.unnamedmod.terraria_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.CYAN_MOSS);
                        output.accept(ModBlocks.RED_MOSS);
                        output.accept(ModBlocks.BLUE_MOSS);
                        output.accept(ModBlocks.PURPLE_MOSS);
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
                        output.accept(ModBlocks.SHADEWOOD_LEAVES);
                        output.accept(ModBlocks.CRIMSTONE);
                        output.accept(ModBlocks.EBONSTONE);
                        output.accept(ModBlocks.MYTHRIL_ORE);
                        output.accept(ModBlocks.MYTHRIL_DEEPSLATE_ORE);
                        output.accept(ModBlocks.METEORITE_ORE);
                        output.accept(ModBlocks.ORICHALCUM_ORE);
                        output.accept(ModBlocks.ORICHALCUM_DEEPSLATE_ORE);
                        output.accept(ModBlocks.SHADEWOOD_LOG);
                        output.accept(ModBlocks.LUMINITE_ORE);
                        output.accept(ModBlocks.SHADEWOOD_PLANK);
                        output.accept(ModBlocks.BLUE_GRANITE);
                        output.accept(ModBlocks.EBONSAND);
                        output.accept(ModBlocks.CRIMSAND);
                        output.accept(ModBlocks.SHIMMER_BLOCK);
                        output.accept(ModBlocks.MARBLE);
                        output.accept(ModBlocks.PALLADIUM_DEEPSLATE_ORE);
                        output.accept(ModBlocks.PALLADIUM_ORE);
                        output.accept(ModBlocks.SHADEWOOD_STAIRS);
                        output.accept(ModBlocks.SHADEWOOD_SLAB);
                        output.accept(ModBlocks.SHADEWOOD_BUTTON);
                        output.accept(ModBlocks.SHADEWOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.SHADEWOOD_FENCE);
                        output.accept(ModBlocks.SHADEWOOD_FENCE_GATE);
                        output.accept(ModBlocks.EBONSTONE_WALL);
                        output.accept(ModBlocks.SHADEWOOD_DOOR);
                        output.accept(ModBlocks.SHADEWOOD_TRAPDOOR);
                        output.accept(ModBlocks.EMERALD_GEMSPARK_BLOCK);
                        output.accept(ModBlocks.Boreal_Planks);
                        output.accept(ModBlocks.BOREAL_SLAB);
                        output.accept(ModBlocks.BOREAL_STAIRS);
                        output.accept(ModBlocks.BOREAL_WOOD_LOG);
                        output.accept(ModBlocks.BOREAL_BUTTON);
                        output.accept(ModBlocks.BOREAL_PRESSURE_PLATE);
                        output.accept(ModBlocks.BOREAL_FENCE);
                        output.accept(ModBlocks.BOREAL_FENCE_GATE);
                        output.accept(ModBlocks.BOREAL_DOOR);
                        output.accept(ModBlocks.BOREAL_TRAPDOOR);




                    }).build());



    public static final CreativeModeTab TERRARIA_TOOLS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "terraria_tools"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WOODEN_HAMMER))
                    .title(Component.translatable("creativemodetab.unnamedmod.terraria_tools"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.WOODEN_HAMMER);
                        output.accept(ModItems.LIGHTS_BANE);
                        output.accept(ModItems.NIGHTMARE_PICKAXE);
                        output.accept(ModItems.NIGHTMARE_SHOVEL);
                        output.accept(ModItems.WAR_AXE_OF_THE_NIGHT);
                        output.accept(ModItems.GUNGNIR);
                        output.accept(ModItems.BLOOD_BUTCHERER);
                        output.accept(ModItems.NIGHTS_EDGE);
                        output.accept(ModItems.THE_VOLCANO);
                        output.accept(ModItems.ADVANCED_HELLSTONE_SWORD);
                        output.accept(ModItems.BASIC_HELLSTONE_SWORD);
                        output.accept(ModItems.THE_BREAKER);
                        output.accept(ModItems.GOLD_SHORTSWORD);
                        output.accept(ModItems.BLADE_OF_GRASS);
                        output.accept(ModItems.MURAMASA);
                        output.accept(ModItems.IRON_BROADSWORD);
                        ;


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


                    }).build());

    public static final CreativeModeTab TERRARIA_ARMOR_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "terraria_armor"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.APRICOT))
                    .title(Component.translatable("creativemodetab.unnamedmod.terraria_armor"))
                    .displayItems((parameters, output) -> {

                    }).build());


    public static void registerModCreativeModeTabs() {
        Unnamedmod.LOGGER.info("Registering Creative Mode Tabs for" + Unnamedmod.MOD_ID);
    }
}
