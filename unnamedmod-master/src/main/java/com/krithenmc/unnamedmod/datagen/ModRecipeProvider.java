package com.krithenmc.unnamedmod.datagen;

import com.krithenmc.unnamedmod.block.ModBlocks;
import com.krithenmc.unnamedmod.item.ModItems;
import com.krithenmc.unnamedmod.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.krithenmc.unnamedmod.block.ModBlocks.*;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {

                List<ItemLike> ADAMANTITE_SMELTABLES = List.of(ModItems.RAW_ADAMANTITE, ModBlocks.ADAMANTITE_ORE, ModBlocks.ADAMANTITE_DEEPSLATE_ORE);

                oreSmelting(ADAMANTITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.ADAMANTITE_BAR, 0.25f, 200, "adamantite");
                oreBlasting(ADAMANTITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.ADAMANTITE_BAR, 0.25f, 100, "adamantite");

                List<ItemLike> CHLOROPHYTE_SMELTABLES = List.of(ModItems.RAW_CHLOROPHYTE, ModBlocks.CHLOROPHYTE_ORE, ModBlocks.CHLOROPHYTE_DEEPSLATE_ORE);

                oreSmelting(CHLOROPHYTE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.CHLOROPHYTE_BAR, 0.25f, 200, "chlorophyte");
                oreBlasting(CHLOROPHYTE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.CHLOROPHYTE_BAR, 0.25f, 100, "chlorophyte");

                List<ItemLike> COBALT_SMELTABLES = List.of(ModItems.RAW_COBALT, ModBlocks.COBALT_ORE, ModBlocks.COBALT_DEEPSLATE_ORE);

                oreSmelting(COBALT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.COBALT_BAR, 0.25f, 200, "cobalt");
                oreBlasting(COBALT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.COBALT_BAR, 0.25f, 100, "cobalt");

                List<ItemLike> CRIMTANE_SMELTABLES = List.of(ModItems.RAW_CRIMTANE, ModBlocks.CRIMTANE_ORE, ModBlocks.CRIMTANE_DEEPSLATE_ORE);

                oreSmelting(CRIMTANE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.CRIMTANE_BAR, 0.25f, 200, "crimtane");
                oreBlasting(CRIMTANE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.CRIMTANE_BAR, 0.25f, 100, "crimtane");

                List<ItemLike> DEMONITE_SMELTABLES = List.of(ModItems.RAW_DEMONITE, ModBlocks.DEMONITE_ORE, ModBlocks.DEMONITE_DEEPSLATE_ORE, ModBlocks.DEMONITE_EBONSTONE_ORE);

                oreSmelting(DEMONITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.DEMONITE_BAR, 0.25f, 200, "demonite");
                oreBlasting(DEMONITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.DEMONITE_BAR, 0.25f, 100, "demonite");

                List<ItemLike> LEAD_SMELTABLES = List.of(ModItems.RAW_LEAD, ModBlocks.LEAD_ORE, ModBlocks.LEAD_DEEPSLATE_ORE);

                oreSmelting(LEAD_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.LEAD_BAR, 0.25f, 200, "lead");
                oreBlasting(LEAD_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.LEAD_BAR, 0.25f, 100, "lead");

                List<ItemLike> SILVER_SMELTABLES = List.of(ModItems.RAW_SILVER, ModBlocks.SILVER_ORE, ModBlocks.SILVER_DEEPSLATE_ORE);

                oreSmelting(SILVER_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.SILVER_BAR, 0.25f, 200, "silver");
                oreBlasting(SILVER_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.SILVER_BAR, 0.25f, 100, "silver");

                List<ItemLike> TUNGSTEN_SMELTABLES = List.of(ModItems.RAW_TUNGSTEN, ModBlocks.TUNGSTEN_ORE, ModBlocks.DEEPSLATE_TUNGSTEN_ORE);

                oreSmelting(TUNGSTEN_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.TUNGSTEN_BAR, 0.25f, 200, "tungsten");
                oreBlasting(TUNGSTEN_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.TUNGSTEN_BAR, 0.25f, 100, "tungsten");


                List<ItemLike> TIN_SMELTABLES = List.of(ModItems.RAW_TIN, ModBlocks.TIN_ORE, ModBlocks.TIN_DEEPSLATE_ORE);

                oreSmelting(TIN_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.TIN_BAR, 0.25f, 200, "tin");
                oreBlasting(TIN_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.TIN_BAR, 0.25f, 100, "tin");





                shaped(RecipeCategory.MISC, ModItems.SHROOMITE_BAR)
                        .pattern("GGG")
                        .pattern("GCG")
                        .pattern("GGG")
                        .define('G', ModItems.GLOWING_MUSHROOM)
                        .define('C', ModItems.CHLOROPHYTE_BAR)
                        .unlockedBy(getHasName(ModItems.CHLOROPHYTE_BAR), has(ModItems.CHLOROPHYTE_BAR))
                        .group("chlorophyte")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.SPECTRE_BAR)
                        .pattern("CEC")
                        .define('C', ModItems.CHLOROPHYTE_BAR)
                        .define('E', ModItems.ECTOPLASM)
                        .unlockedBy(getHasName(ModItems.CHLOROPHYTE_BAR), has(ModItems.CHLOROPHYTE_BAR))
                        .group("chlorophyte")
                        .save(output);

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHADEWOOD_PLANK, 4)
                        .requires(ModBlocks.SHADEWOOD_LOG)
                        .unlockedBy(getHasName(ModBlocks.SHADEWOOD_LOG), has(ModBlocks.SHADEWOOD_LOG))
                        .group("shadewood")
                        .save(output);


                shaped(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                        .pattern("WWW")
                        .pattern("WWW")
                        .pattern(" S ")
                        .define('W', Items.OAK_PLANKS)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(Items.OAK_PLANKS), has(Items.OAK_PLANKS))
                        .group("hammers")
                        .save(output, "wooden_hammer_oak");

                shaped(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                        .pattern("WWW")
                        .pattern("WWW")
                        .pattern(" S ")
                        .define('W', Items.SPRUCE_PLANKS)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(Items.SPRUCE_PLANKS), has(Items.SPRUCE_PLANKS))
                        .group("hammers")
                        .save(output, "wooden_hammer_spruce");

                shaped(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                        .pattern("WWW")
                        .pattern("WWW")
                        .pattern(" S ")
                        .define('W', ModBlocks.SHADEWOOD_PLANK)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModBlocks.SHADEWOOD_PLANK), has(ModBlocks.SHADEWOOD_PLANK))
                        .group("hammers")
                        .save(output, "wooden_hammer_shadewood");

                shaped(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                        .pattern("WWW")
                        .pattern("WWW")
                        .pattern(" S ")
                        .define('W', Items.PALE_OAK_PLANKS)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(Items.PALE_OAK_PLANKS), has(Items.PALE_OAK_PLANKS))
                        .group("hammers")
                        .save(output, "wooden_hammer_pale");

                shaped(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                        .pattern("WWW")
                        .pattern("WWW")
                        .pattern(" S ")
                        .define('W', Items.ACACIA_PLANKS)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(Items.ACACIA_PLANKS), has(Items.ACACIA_PLANKS))
                        .group("hammers")
                        .save(output, "wooden_hammer_acacia");

                stairBuilder(ModBlocks.SHADEWOOD_STAIRS, Ingredient.of(ModBlocks.SHADEWOOD_PLANK))
                        .unlockedBy(getHasName(ModBlocks.SHADEWOOD_PLANK), has(ModBlocks.SHADEWOOD_PLANK))
                        .group("shadewood")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHADEWOOD_SLAB, ModBlocks.SHADEWOOD_PLANK);

                buttonBuilder(ModBlocks.SHADEWOOD_BUTTON, Ingredient.of(ModBlocks.SHADEWOOD_PLANK))
                        .unlockedBy(getHasName(ModBlocks.SHADEWOOD_PLANK), has(ModBlocks.SHADEWOOD_PLANK))
                        .group("shadewood")
                        .save(output);

                pressurePlate(ModBlocks.SHADEWOOD_PRESSURE_PLATE, ModBlocks.SHADEWOOD_PLANK);

                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EBONSTONE_WALL, Ingredient.of(ModBlocks.EBONSTONE))
                        .unlockedBy(getHasName(ModBlocks.EBONSTONE), has(ModBlocks.EBONSTONE))
                        .group("ebonstone")
                        .save(output);

                fenceBuilder(ModBlocks.SHADEWOOD_FENCE, Ingredient.of(ModBlocks.SHADEWOOD_PLANK))
                        .unlockedBy(getHasName(ModBlocks.SHADEWOOD_PLANK), has(ModBlocks.SHADEWOOD_PLANK))
                        .group("shadewood")
                        .save(output);

                fenceGateBuilder(ModBlocks.SHADEWOOD_FENCE_GATE, Ingredient.of(ModBlocks.SHADEWOOD_PLANK))
                        .unlockedBy(getHasName(ModBlocks.SHADEWOOD_PLANK), has(ModBlocks.SHADEWOOD_PLANK))
                        .group("shadewood")
                        .save(output);

                doorBuilder(ModBlocks.SHADEWOOD_DOOR, Ingredient.of(ModBlocks.SHADEWOOD_PLANK))
                        .unlockedBy(getHasName(ModBlocks.SHADEWOOD_PLANK), has(ModBlocks.SHADEWOOD_PLANK))
                        .group("shadewood")
                        .save(output);

                trapdoorBuilder(ModBlocks.SHADEWOOD_TRAPDOOR, Ingredient.of(ModBlocks.SHADEWOOD_PLANK))
                        .unlockedBy(getHasName(ModBlocks.SHADEWOOD_PLANK), has(ModBlocks.SHADEWOOD_PLANK))
                        .group("shadewood")
                        .save(output);


                shaped(RecipeCategory.COMBAT, ModItems.LIGHTS_BANE)
                        .pattern("D")
                        .pattern("D")
                        .pattern("S")
                        .define('D', ModItems.DEMONITE_BAR)
                        .define('S', ModItems.CORRUPTED_STICK)
                        .unlockedBy(getHasName(ModItems.DEMONITE_BAR), has(ModItems.DEMONITE_BAR))
                        .group("demonite")
                        .save(output);


                shaped(RecipeCategory.TOOLS, ModItems.CORRUPTED_STICK)
                        .pattern("DDD")
                        .pattern("DSD")
                        .pattern("DDD")
                        .define('D', ModItems.DEMONITE_BAR)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.DEMONITE_BAR), has(ModItems.DEMONITE_BAR))
                        .group("demonite")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.WAR_AXE_OF_THE_NIGHT)
                        .pattern("DDD")
                        .pattern("DSD")
                        .pattern(" S ")
                        .define('D', ModItems.DEMONITE_BAR)
                        .define('S', ModItems.CORRUPTED_STICK)
                        .unlockedBy(getHasName(ModItems.DEMONITE_BAR), has(ModItems.DEMONITE_BAR))
                        .group("demonite")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.NIGHTMARE_PICKAXE)
                        .pattern("DDD")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('D', ModItems.DEMONITE_BAR)
                        .define('S', ModItems.CORRUPTED_STICK)
                        .unlockedBy(getHasName(ModItems.DEMONITE_BAR), has(ModItems.DEMONITE_BAR))
                        .group("demonite")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.NIGHTMARE_SHOVEL)
                        .pattern("D")
                        .pattern("S")
                        .pattern("S")
                        .define('D', ModItems.DEMONITE_BAR)
                        .define('S', ModItems.CORRUPTED_STICK)
                        .unlockedBy(getHasName(ModItems.DEMONITE_BAR), has(ModItems.DEMONITE_BAR))
                        .group("demonite")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.GUNGNIR)
                        .pattern("HHH")
                        .pattern("HHH")
                        .pattern("HSH")
                        .define('H', ModItems.HALLOWED_BAR)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.HALLOWED_BAR), has(ModItems.HALLOWED_BAR))
                        .group("hallowed")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.BLEEDING_STICK)
                        .pattern("CCC")
                        .pattern("CSC")
                        .pattern("CCC")
                        .define('C', ModItems.CRIMTANE_BAR)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.CRIMTANE_BAR), has(ModItems.CRIMTANE_BAR))
                        .group("crimtane")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.BLOOD_BUTCHERER)
                        .pattern("CC")
                        .pattern("C ")
                        .pattern("S ")
                        .define('C', ModItems.CRIMTANE_BAR)
                        .define('S', ModItems.BLEEDING_STICK)
                        .unlockedBy(getHasName(ModItems.CRIMTANE_BAR), has(ModItems.CRIMTANE_BAR))
                        .group("crimtane")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.THE_VOLCANO)
                        .pattern("HHH")
                        .pattern(" H ")
                        .pattern(" S ")
                        .define('S', ModItems.ADVANCED_HELLSTONE_SWORD)
                        .define('H', ModItems.HELLSTONE_BAR)
                        .unlockedBy(getHasName(ModItems.THE_VOLCANO), has(ModItems.THE_VOLCANO))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.ADVANCED_HELLSTONE_SWORD)
                        .pattern("HHH")
                        .pattern("HSH")
                        .pattern("OOO")
                        .define('O', Items.CRYING_OBSIDIAN)
                        .define('H', ModItems.HELLSTONE_BAR)
                        .define('S', ModItems.BASIC_HELLSTONE_SWORD)
                        .unlockedBy(getHasName(ModItems.ADVANCED_HELLSTONE_SWORD), has(ModItems.ADVANCED_HELLSTONE_SWORD))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.BASIC_HELLSTONE_SWORD)
                        .pattern("H")
                        .pattern("H")
                        .pattern("S")
                        .define('S', Items.STICK)
                        .define('H', ModItems.HELLSTONE_BAR)
                        .unlockedBy(getHasName(ModItems.HELLSTONE_BAR), has(ModItems.HELLSTONE_BAR))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.DEMONITE_PLATING)
                        .pattern("SDS")
                        .pattern("DSD")
                        .pattern("SDS")
                        .define('D', ModItems.DEMONITE_BAR)
                        .define('S', ModItems.SHADOW_SCALE)
                        .unlockedBy(getHasName(ModItems.SHADOW_SCALE), has(ModItems.SHADOW_SCALE))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.THE_BREAKER)
                        .pattern("DBD")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('S', ModItems.CORRUPTED_STICK)
                        .define('D', ModItems.DEMONITE_PLATING)
                        .define('B', ModItems.DEMONITE_BAR)
                        .unlockedBy(getHasName(ModItems.DEMONITE_PLATING), has(ModItems.DEMONITE_PLATING))
                        .save(output);

                stairBuilder(ModBlocks.BOREAL_STAIRS, Ingredient.of(ModBlocks.Boreal_Planks))
                        .unlockedBy(getHasName(ModBlocks.Boreal_Planks), has(ModBlocks.Boreal_Planks))
                        .group("boreal")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BOREAL_SLAB, ModBlocks.Boreal_Planks);

                shaped(RecipeCategory.COMBAT, ModItems.BLADE_OF_GRASS)
                        .pattern("JSJ")
                        .pattern("VDV")
                        .pattern("JSJ")
                        .define('D', Items.DIAMOND_SWORD)
                        .define('V', Items.VINE)
                        .define('J', ModItems.JUNGLE_SPORES )
                        .define('S', ModItems.STINGER)
                        .unlockedBy(getHasName(ModItems.BLADE_OF_GRASS), has(ModItems.BLADE_OF_GRASS))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.IRON_BROADSWORD)
                        .pattern("B")
                        .pattern("I")
                        .pattern("S")
                        .define('I', Items.IRON_SWORD)
                        .define('S', Items.STICK)
                        .define('B', Items.IRON_INGOT )
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(output);



                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHLOROPHYTE_BRICKS)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', ModItems.CHLOROPHYTE_BAR)
                        .unlockedBy(getHasName(ModItems.CHLOROPHYTE_BAR), has(ModItems.CHLOROPHYTE_BAR))
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBALT_BRICKS)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', ModItems.COBALT_BAR)
                        .unlockedBy(getHasName(ModItems.COBALT_BAR), has(ModItems.COBALT_BAR))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSTONE_BRICKS)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', ModBlocks.CRIMSTONE)
                        .unlockedBy(getHasName(ModBlocks.CRIMSTONE), has(ModBlocks.CRIMSTONE))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMTANE_BRICKS)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', ModItems.CRIMTANE_BAR)
                        .unlockedBy(getHasName(ModItems.CRIMTANE_BAR), has(ModItems.CRIMTANE_BAR))
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEMONITE_BRICKS)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', ModItems.DEMONITE_BAR)
                        .unlockedBy(getHasName(ModItems.DEMONITE_BAR), has(ModItems.DEMONITE_BAR))
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EBONSTONE_BRICKS)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', ModBlocks.EBONSTONE)
                        .unlockedBy(getHasName(ModBlocks.EBONSTONE), has(ModBlocks.EBONSTONE))
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HALLOWED_BRICKS)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', ModItems.HALLOWED_BAR)
                        .unlockedBy(getHasName(ModItems.HALLOWED_BAR), has(ModItems.HALLOWED_BAR))
                        .save(output);


                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAINBOW_BRICK_WALLS, Ingredient.of(ModBlocks.RAINBOW_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.RAINBOW_BRICKS), has(ModBlocks.RAINBOW_BRICKS))
                        .group("rainbow")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAINBOW_BRICK_SLABS, ModBlocks.RAINBOW_BRICKS);

                stairBuilder(ModBlocks.RAINBOW_BRICK_STAIRS, Ingredient.of(ModBlocks.RAINBOW_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.RAINBOW_BRICKS), has(ModBlocks.RAINBOW_BRICKS))
                        .group("rainbow")
                        .save(output);


                buttonBuilder(ModBlocks.RAINBOW_BRICK_BUTTON, Ingredient.of(ModBlocks.RAINBOW_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.RAINBOW_BRICKS), has(ModBlocks.RAINBOW_BRICKS))
                        .group("rainbow")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.COBALT_SWORD)
                        .pattern("C")
                        .pattern("C")
                        .pattern("S")
                        .define('C', ModBlocks.COBALT_BRICKS)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.COBALT_BAR), has(ModItems.COBALT_BAR))
                        .group("cobalt")
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_BRICKS)
                        .pattern("II")
                        .pattern("II")
                        .define('I', Blocks.BLUE_ICE)
                        .unlockedBy(getHasName(Blocks.BLUE_ICE), has(Blocks.BLUE_ICE))
                        .group("ice")
                        .save(output);


                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRIDESCENT_BRICKS)
                        .pattern("CA")
                        .pattern("AC")
                        .define('C', Blocks.COBBLESTONE)
                        .define('A', ModBlocks.ASH)
                        .unlockedBy(getHasName(ModBlocks.ASH), has(ModBlocks.ASH))
                        .group("bricks")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.COBALT_PICKAXE)
                        .pattern("BCB")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('B', ModItems.COBALT_BAR)
                        .define('C', ModBlocks.COBALT_BRICKS)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.COBALT_BAR), has(ModItems.COBALT_BAR))
                        .group("cobalt")
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUDSTONE_BRICKS)
                        .pattern("SM")
                        .define('S', Blocks.COBBLESTONE)
                        .define('M', Blocks.MUD)
                        .unlockedBy(getHasName(Blocks.MUD), has(Blocks.MUD))
                        .save(output);


                bricksBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MYTHRIL_BRICKS, Ingredient.of(ModItems.MYTHRIL_BAR))
                        .unlockedBy(getHasName(ModItems.MYTHRIL_BAR), has(ModItems.MYTHRIL_BAR))
                        .group("mythril")
                        .save(output);

                bricksBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICKS, Ingredient.of(Blocks.OBSIDIAN))
                        .unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN))
                        .save(output);

                stairBuilder(ModBlocks.PALMWOOD_STAIRS, Ingredient.of(ModBlocks.PALMWOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.PALMWOOD_PLANKS), has(ModBlocks.PALMWOOD_PLANKS))
                        .group("palmwood")
                        .save(output);

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALMWOOD_SLABS, Ingredient.of(ModBlocks.PALMWOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.PALMWOOD_PLANKS), has(ModBlocks.PALMWOOD_PLANKS))
                        .group("palmwood")
                        .save(output);

                trapdoorBuilder(ModBlocks.PALMWOOD_TRAPDOOR, Ingredient.of(ModBlocks.PALMWOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.PALMWOOD_PLANKS), has(ModBlocks.PALMWOOD_PLANKS))
                        .group("palmwood")
                        .save(output);

                doorBuilder(ModBlocks.PALMWOOD_DOOR, Ingredient.of(ModBlocks.PALMWOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.PALMWOOD_PLANKS), has(ModBlocks.PALMWOOD_PLANKS))
                        .group("palmwood")
                        .save(output);

                buttonBuilder(ModBlocks.PALMWOOD_BUTTON, Ingredient.of(ModBlocks.PALMWOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.PALMWOOD_PLANKS), has(ModBlocks.PALMWOOD_PLANKS))
                        .group("palmwood")
                        .save(output);

                pressurePlateBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALMWOOD_PRESSURE_PLATE, Ingredient.of(ModBlocks.PALMWOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.PALMWOOD_PLANKS), has(ModBlocks.PALMWOOD_PLANKS))
                        .group("palmwood")
                        .save(output);

                fenceBuilder(ModBlocks.PALMWOOD_FENCE, Ingredient.of(ModBlocks.PALMWOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.PALMWOOD_PLANKS), has(ModBlocks.PALMWOOD_PLANKS))
                        .group("palmwood")
                        .save(output);

                fenceGateBuilder(ModBlocks.PALMWOOD_FENCE_GATE, Ingredient.of(ModBlocks.PALMWOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.PALMWOOD_PLANKS), has(ModBlocks.PALMWOOD_PLANKS))
                        .group("palmwood")
                        .save(output);

                woodFromLogs(ModBlocks.PALMWOOD, ModBlocks.PALMWOOD_LOG);
                woodFromLogs(ModBlocks.SHADEWOOD, ModBlocks.SHADEWOOD_LOG);
                woodFromLogs(ModBlocks.BOREAL_WOOD, ModBlocks.BOREAL_WOOD_LOG);

                stairBuilder(ModBlocks.EBONWOOD_STAIRS, Ingredient.of(ModBlocks.EBONWOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.EBONWOOD_PLANKS), has(ModBlocks.EBONWOOD_PLANKS))
                        .group("ebonwood")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EBONWOOD_SLAB, ModBlocks.EBONWOOD_PLANKS);

                buttonBuilder(ModBlocks.EBONWOOD_BUTTON, Ingredient.of(ModBlocks.EBONWOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.EBONWOOD_PLANKS), has(ModBlocks.EBONWOOD_PLANKS))
                        .group("ebonwood")
                        .save(output);

                pressurePlate(ModBlocks.EBONWOOD_PRESSURE_PLATE, ModBlocks.EBONWOOD_PLANKS);

                fenceBuilder(ModBlocks.EBONWOOD_FENCE, Ingredient.of(ModBlocks.EBONWOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.EBONWOOD_PLANKS), has(ModBlocks.EBONWOOD_PLANKS))
                        .group("ebonwood")
                        .save(output);

                fenceGateBuilder(ModBlocks.EBONWOOD_FENCE_GATE, Ingredient.of(ModBlocks.EBONWOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.EBONWOOD_PLANKS), has(ModBlocks.EBONWOOD_PLANKS))
                        .group("ebonwood")
                        .save(output);

                doorBuilder(ModBlocks.EBONWOOD_DOOR, Ingredient.of(ModBlocks.EBONWOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.EBONWOOD_PLANKS), has(ModBlocks.EBONWOOD_PLANKS))
                        .group("ebonwood")
                        .save(output);

                trapdoorBuilder(ModBlocks.EBONWOOD_TRAPDOOR, Ingredient.of(ModBlocks.EBONWOOD_TRAPDOOR))
                        .unlockedBy(getHasName(ModBlocks.EBONWOOD_PLANKS), has(ModBlocks.EBONWOOD_PLANKS))
                        .group("ebonwood")
                        .save(output);


                bricksBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_BRICKS, Ingredient.of(Items.GOLD_INGOT))
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .group("gold")
                        .save(output);

                bricksBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_BRICKS, Ingredient.of(Items.IRON_INGOT))
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .group("iron")
                        .save(output);

                shaped(RecipeCategory.TOOLS, Items.IRON_INGOT)
                        .pattern(" I ")
                        .define('I', ModBlocks.IRON_BRICKS)
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .group("iron")
                        .save(output);

                shaped(RecipeCategory.TOOLS, Items.GOLD_INGOT)
                        .pattern(" I ")
                        .define('I', ModBlocks.GOLD_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.GOLD_BRICKS), has(ModBlocks.GOLD_BRICKS))
                        .group("gold")
                        .save(output);

                bricksBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAD_BRICKS, Ingredient.of(ModItems.LEAD_BAR))
                        .unlockedBy(getHasName(ModItems.LEAD_BAR), has(ModItems.LEAD_BAR))
                        .group("lead")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.LEAD_BAR)
                        .pattern(" I ")
                        .define('I', ModBlocks.LEAD_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.LEAD_BRICKS), has(ModBlocks.LEAD_BRICKS))
                        .group("lead")
                        .save(output);


                bricksBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PLATINUM_BRICKS, Ingredient.of(ModItems.PLATINUM_BAR))
                        .unlockedBy(getHasName(ModItems.PLATINUM_BAR), has(ModItems.PLATINUM_BAR))
                        .group("platinum")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.PLATINUM_BAR)
                        .pattern(" I ")
                        .define('I', ModBlocks.PLATINUM_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.PLATINUM_BRICKS), has(ModBlocks.PLATINUM_BRICKS))
                        .group("platinum")
                        .save(output);

                trapdoorBuilder(ModBlocks.RICH_MAHOGANY_TRAPDOOR, Ingredient.of(ModBlocks.RICH_MAHOGANY_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.RICH_MAHOGANY_PLANKS), has(ModBlocks.RICH_MAHOGANY_PLANKS))
                        .group("mahogany")
                        .save(output);

                bricksBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILVER_BRICKS, Ingredient.of(ModItems.SILVER_BAR))
                        .unlockedBy(getHasName(ModItems.SILVER_BAR), has(ModItems.SILVER_BAR))
                        .group("silver")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.SILVER_BAR)
                        .pattern(" I ")
                        .define('I', ModBlocks.SILVER_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.SILVER_BRICKS), has(ModBlocks.SILVER_BRICKS))
                        .group("silver")
                        .save(output);

                bricksBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TIN_BRICKS, Ingredient.of(ModItems.TIN_BAR))
                        .unlockedBy(getHasName(ModItems.TIN_BAR), has(ModItems.TIN_BAR))
                        .group("tin")
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.TIN_BAR)
                        .pattern(" I ")
                        .define('I', ModBlocks.TIN_BRICKS)
                        .unlockedBy(getHasName(ModBlocks.TIN_BRICKS), has(ModBlocks.TIN_BRICKS))
                        .group("tin")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.LEAD_HAMMER)
                        .pattern("LLL")
                        .pattern("LLL")
                        .pattern(" S ")
                        .define('L', ModItems.LEAD_BAR)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.LEAD_BAR), has(ModItems.LEAD_BAR))
                        .group("lead")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.ADAMANTITE_GLAIVE)
                        .pattern("AA ")
                        .pattern(" S ")
                        .pattern("  S")
                        .define('A', ModBlocks.ADAMANTITE_BEAM)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ADAMANTITE_BAR), has(ModItems.ADAMANTITE_BAR))
                        .group("adamantite")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.ADAMANTITE_SWORD)
                        .pattern(" A ")
                        .pattern(" A ")
                        .pattern(" S ")
                        .define('A', ModBlocks.ADAMANTITE_BEAM)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ADAMANTITE_BAR), has(ModItems.ADAMANTITE_BAR))
                        .group("adamantite")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.ADAMANTITE_WARAXE)
                        .pattern("aAa")
                        .pattern("aAa")
                        .pattern(" S ")
                        .define('A', ModBlocks.ADAMANTITE_BEAM)
                        .define('a', ModItems.ADAMANTITE_BAR)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ADAMANTITE_BAR), has(ModItems.ADAMANTITE_BAR))
                        .group("adamantite")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.TITANIUM_SWORD)
                        .pattern(" A ")
                        .pattern(" A ")
                        .pattern(" S ")
                        .define('A', ModItems.TITANIUM_BAR)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModItems.TITANIUM_BAR), has(ModItems.TITANIUM_BAR))
                        .group("titanium")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.TIN_BROADSWORD)
                        .pattern("T")
                        .pattern("T")
                        .pattern("A")
                        .define('T', ModBlocks.TIN_BRICKS)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.TIN_BAR), has(ModItems.TIN_BAR))
                        .group("tin")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.TIN_PICKAXE)
                        .pattern("TTT")
                        .pattern(" A ")
                        .pattern(" A ")
                        .define('T', ModBlocks.TIN_BRICKS)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.TIN_BAR), has(ModItems.TIN_BAR))
                        .group("tin")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.TIN_AXE)
                        .pattern(" TT")
                        .pattern(" AT")
                        .pattern(" A ")
                        .define('T', ModBlocks.TIN_BRICKS)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.TIN_BAR), has(ModItems.TIN_BAR))
                        .group("tin")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.TIN_HAMMER)
                        .pattern("TTT")
                        .pattern("tAt")
                        .pattern(" A ")
                        .define('T', ModBlocks.TIN_BRICKS)
                        .define('t', ModItems.TIN_BAR)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.TIN_BAR), has(ModItems.TIN_BAR))
                        .group("tin")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.TIN_SHORTSWORD)
                        .pattern("T")
                        .pattern("A")
                        .define('T', ModBlocks.TIN_BRICKS)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.TIN_BAR), has(ModItems.TIN_BAR))
                        .group("tin")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.SILVER_BROADSWORD)
                        .pattern("S")
                        .pattern("S")
                        .pattern("A")
                        .define('S', ModBlocks.SILVER_BRICKS)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.SILVER_BAR), has(ModItems.SILVER_BAR))
                        .group("silver")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.SILVER_PICKAXE)
                        .pattern("TTT")
                        .pattern(" A ")
                        .pattern(" A ")
                        .define('T', ModBlocks.SILVER_BRICKS)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.SILVER_BAR), has(ModItems.SILVER_BAR))
                        .group("silver")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.SILVER_AXE)
                        .pattern("TT")
                        .pattern("AT")
                        .pattern("A ")
                        .define('T', ModBlocks.SILVER_BRICKS)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.SILVER_BAR), has(ModItems.SILVER_BAR))
                        .group("silver")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.SILVER_HAMMER)
                        .pattern("TTT")
                        .pattern("tAt")
                        .pattern(" A ")
                        .define('T', ModBlocks.SILVER_BRICKS)
                        .define('t', ModItems.SILVER_BAR)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.SILVER_HAMMER), has(ModItems.SILVER_HAMMER))
                        .group("silver")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.SILVER_SHORTSWORD)
                        .pattern("T")
                        .pattern("A")
                        .define('T', ModBlocks.SILVER_BRICKS)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.SILVER_BAR), has(ModItems.SILVER_BAR))
                        .group("silver")
                        .save(output);


                shaped(RecipeCategory.COMBAT, ModItems.TUNGSTEN_PICKAXE)
                        .pattern("TTT")
                        .pattern(" A ")
                        .pattern(" A ")
                        .define('T', ModBlocks.TUNGSTEN_BRICKS)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.TUNGSTEN_BAR), has(ModItems.TUNGSTEN_BAR))
                        .group("tungsten")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.TUNGSTEN_AXE)
                        .pattern("TT")
                        .pattern("AT")
                        .pattern("A ")
                        .define('T', ModBlocks.TUNGSTEN_BRICKS)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.TUNGSTEN_BAR), has(ModItems.TUNGSTEN_BAR))
                        .group("tungsten")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.TUNGSTEN_HAMMER)
                        .pattern("TTT")
                        .pattern("tAt")
                        .pattern(" A ")
                        .define('T', ModBlocks.TUNGSTEN_BRICKS)
                        .define('t', ModItems.TUNGSTEN_BAR)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.TUNGSTEN_HAMMER), has(ModItems.TUNGSTEN_HAMMER))
                        .group("tungsten")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.TUNGSTEN_SHORTSWORD)
                        .pattern("T")
                        .pattern("A")
                        .define('T', ModBlocks.TUNGSTEN_BRICKS)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.TUNGSTEN_BAR), has(ModItems.TUNGSTEN_BAR))
                        .group("tungsten")
                        .save(output);


                shaped(RecipeCategory.COMBAT, ModItems.TUNGSTEN_BROADSWORD)
                        .pattern("S")
                        .pattern("S")
                        .pattern("A")
                        .define('S', ModBlocks.TUNGSTEN_BRICKS)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.TUNGSTEN_BAR), has(ModItems.TUNGSTEN_BAR))
                        .group("tungsten")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.PLATINUM_BROADSWORD)
                        .pattern("S")
                        .pattern("S")
                        .pattern("A")
                        .define('S', ModBlocks.PLATINUM_BRICKS)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.PLATINUM_BAR), has(ModItems.PLATINUM_BAR))
                        .group("platinum")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.PLATINUM_PICKAXE)
                        .pattern("TTT")
                        .pattern(" A ")
                        .pattern(" A ")
                        .define('T', ModBlocks.PLATINUM_BRICKS)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.PLATINUM_BAR), has(ModItems.PLATINUM_BAR))
                        .group("platinum")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.PLATINUM_AXE)
                        .pattern("TT")
                        .pattern("AT")
                        .pattern("A ")
                        .define('T', ModBlocks.PLATINUM_BRICKS)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.PLATINUM_BAR), has(ModItems.PLATINUM_BAR))
                        .group("platinum")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.PLATINUM_HAMMER)
                        .pattern("TTT")
                        .pattern("tAt")
                        .pattern(" A ")
                        .define('T', ModBlocks.PLATINUM_BRICKS)
                        .define('t', ModItems.PLATINUM_BAR)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(ModItems.PLATINUM_HAMMER), has(ModItems.PLATINUM_HAMMER))
                        .group("platinum")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.GOLD_BROADSWORD)
                        .pattern("S")
                        .pattern("S")
                        .pattern("A")
                        .define('S', Blocks.GOLD_BLOCK)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .group("gold")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.GOLDEN_HAMMER)
                        .pattern("TTT")
                        .pattern("tAt")
                        .pattern(" A ")
                        .define('T', Blocks.GOLD_BLOCK)
                        .define('t', Items.GOLD_INGOT)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .group("gold")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.GOLD_SHORTSWORD)
                        .pattern("T")
                        .pattern("A")
                        .define('T', ModBlocks.GOLD_BRICKS)
                        .define('A', Items.STICK)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .group("gold")
                        .save(output);


                shaped(RecipeCategory.COMBAT, ModItems.FLESH_GRINDER)
                        .pattern("ttt")
                        .pattern("tAt")
                        .pattern(" A ")
                        .define('t', ModItems.CRIMTANE_BAR)
                        .define('A', ModItems.BLEEDING_STICK)
                        .unlockedBy(getHasName(ModItems.CRIMTANE_BAR), has(ModItems.CRIMTANE_BAR))
                        .group("crimtane")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.DEATHBRINGER_PICKAXE)
                        .pattern("TTT")
                        .pattern(" A ")
                        .pattern(" A ")
                        .define('T', ModItems.CRIMTANE_BAR)
                        .define('A', ModItems.BLEEDING_STICK)
                        .unlockedBy(getHasName(ModItems.CRIMTANE_BAR), has(ModItems.CRIMTANE_BAR))
                        .group("crimtane")
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUNGSTEN_BRICKS)
                        .pattern("TT")
                        .pattern("TT")
                        .define('T', ModItems.TUNGSTEN_BAR)
                        .unlockedBy(getHasName(ModItems.TUNGSTEN_BAR), has(ModItems.TUNGSTEN_BAR))
                        .group("tungsten")
                        .save(output);


                stairBuilder(ModBlocks.ASH_STAIRS, Ingredient.of(ModBlocks.ASH_WOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.ASH_WOOD_PLANKS), has(ModBlocks.ASH_WOOD_PLANKS))
                        .group("ash")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASH_SLAB, ModBlocks.ASH_WOOD_PLANKS);

                buttonBuilder(ModBlocks.ASH_BUTTON, Ingredient.of(ModBlocks.ASH_WOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.ASH_WOOD_PLANKS), has(ModBlocks.ASH_WOOD_PLANKS))
                        .group("ash")
                        .save(output);

                pressurePlate(ModBlocks.ASH_PRESSURE_PLATE, ModBlocks.ASH_WOOD_PLANKS);

                fenceBuilder(ModBlocks.ASH_FENCE, Ingredient.of(ModBlocks.ASH_WOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.ASH_WOOD_PLANKS), has(ModBlocks.ASH_WOOD_PLANKS))
                        .group("ash")
                        .save(output);

                fenceGateBuilder(ModBlocks.ASH_FENCE_GATE, Ingredient.of(ModBlocks.ASH_WOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.ASH_WOOD_PLANKS), has(ModBlocks.ASH_WOOD_PLANKS))
                        .group("ash")
                        .save(output);

                doorBuilder(ModBlocks.ASH_DOOR, Ingredient.of(ModBlocks.ASH_WOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.ASH_WOOD_PLANKS), has(ModBlocks.ASH_WOOD_PLANKS))
                        .group("ash")
                        .save(output);

                trapdoorBuilder(ModBlocks.ASH_TRAPDOOR, Ingredient.of(ModBlocks.ASH_WOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.ASH_WOOD_PLANKS), has(ModBlocks.ASH_WOOD_PLANKS))
                        .group("ash")
                        .save(output);

                planksFromLog(ModBlocks.ASH_WOOD_PLANKS, ModTags.Items.ASH_WOOD_LOGS, 4);

                stairBuilder(ModBlocks.BLOODY_ANDESITE_STAIRS, Ingredient.of(ModBlocks.BLOODY_ANDESITE))
                        .unlockedBy(getHasName(ModBlocks.BLOODY_ANDESITE), has(ModBlocks.BLOODY_ANDESITE))
                        .group("bloody_andesite")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOODY_ANDESITE_SLAB, ModBlocks.BLOODY_ANDESITE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOODY_ANDESITE_WALL, ModBlocks.BLOODY_ANDESITE);

                stairBuilder(ModBlocks.CRIMSON_GRANITE_STAIRS, Ingredient.of(ModBlocks.CRIMSON_GRANITE))
                        .unlockedBy(getHasName(ModBlocks.CRIMSON_GRANITE), has(ModBlocks.CRIMSON_GRANITE))
                        .group("crimson_granite")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_GRANITE_SLAB, ModBlocks.CRIMSON_GRANITE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_GRANITE_WALL, ModBlocks.CRIMSON_GRANITE);

                stairBuilder(ModBlocks.DEEPCRIMSTONE_STAIRS, Ingredient.of(ModBlocks.DEEPCRIMSTONE))
                        .unlockedBy(getHasName(ModBlocks.DEEPCRIMSTONE), has(ModBlocks.DEEPCRIMSTONE))
                        .group("deepcrimstone")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPCRIMSTONE_SLAB, ModBlocks.DEEPCRIMSTONE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPCRIMSTONE_WALL, ModBlocks.DEEPCRIMSTONE);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EBONSANDSTONE)
                        .pattern("SS")
                        .pattern("SS")
                        .define('S', ModBlocks.EBONSAND)
                        .unlockedBy(getHasName(ModBlocks.EBONSAND), has(ModBlocks.EBONSAND))
                        .group("ebon")
                        .save(output);

               planksFromLog(ModBlocks.Boreal_Planks, ModTags.Items.BOREAL_LOGS, 4);

               woodFromLogs(ModBlocks.BOREAL_WOOD_LOG, ModBlocks.BOREAL_WOOD);

               woodFromLogs(ModBlocks.STRIPPED_BOREAL_LOG, ModBlocks.STRIPPED_BOREAL_WOOD);

               planksFromLog(ModBlocks.PEARLWOOD_PLANKS, ModTags.Items.PEARLWOOD_LOGS, 4);

                stairBuilder(ModBlocks.PEARLWOOD_STAIRS, Ingredient.of(ModBlocks.PEARLWOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.PEARLWOOD_PLANKS), has(ModBlocks.PEARLWOOD_PLANKS))
                        .group("pearlwood")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEARLWOOD_SLAB, ModBlocks.PEARLWOOD_PLANKS);

                buttonBuilder(ModBlocks.PEARLWOOD_BUTTON, Ingredient.of(ModBlocks.PEARLWOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.PEARLWOOD_PLANKS), has(ModBlocks.PEARLWOOD_PLANKS))
                        .group("pearlwood")
                        .save(output);

                pressurePlate(ModBlocks.PEARLWOOD_PRESSURE_PLATE, ModBlocks.PEARLWOOD_PLANKS);

                fenceBuilder(ModBlocks.PEARLWOOD_FENCE, Ingredient.of(ModBlocks.PEARLWOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.PEARLWOOD_PLANKS), has(ModBlocks.PEARLWOOD_PLANKS))
                        .group("pearlwood")
                        .save(output);

                fenceGateBuilder(ModBlocks.PEARLWOOD_FENCE_GATE, Ingredient.of(ModBlocks.PEARLWOOD_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.PEARLWOOD_PLANKS), has(ModBlocks.PEARLWOOD_PLANKS))
                        .group("pearlwood")
                        .save(output);

                stairBuilder(ModBlocks.PEARLSTONE_STAIRS, Ingredient.of(ModBlocks.PEARLSTONE))
                        .unlockedBy(getHasName(ModBlocks.PEARLSTONE), has(ModBlocks.PEARLSTONE))
                        .group("pearlstone")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEARLSTONE_SLAB, ModBlocks.PEARLSTONE);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEARLSTONE_WALL, ModBlocks.PEARLSTONE);


                stairBuilder(ModBlocks.CRIMSTONE_BRICK_STAIRS, Ingredient.of(ModBlocks.CRIMSTONE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.CRIMSTONE_BRICKS), has(ModBlocks.CRIMSTONE_BRICKS))
                        .group("crimstone")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSTONE_BRICK_SLAB, ModBlocks.CRIMSTONE_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSTONE_BRICK_WALL, ModBlocks.CRIMSTONE_BRICKS);

                stairBuilder(ModBlocks.CRIMTANE_BRICK_STAIRS, Ingredient.of(ModBlocks.CRIMTANE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.CRIMTANE_BRICKS), has(ModBlocks.CRIMTANE_BRICKS))
                        .group("crimtane")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMTANE_BRICK_SLAB, ModBlocks.CRIMTANE_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMTANE_BRICK_WALL, ModBlocks.CRIMTANE_BRICKS);

                stairBuilder(ModBlocks.DEMONITE_BRICK_STAIRS, Ingredient.of(ModBlocks.DEMONITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.DEMONITE_BRICKS), has(ModBlocks.DEMONITE_BRICKS))
                        .group("demonite")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEMONITE_BRICK_SLAB, ModBlocks.DEMONITE_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEMONITE_BRICK_WALL, ModBlocks.DEMONITE_BRICKS);

                stairBuilder(ModBlocks.EBONSTONE_BRICK_STAIRS, Ingredient.of(ModBlocks.EBONSTONE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.EBONSTONE_BRICKS), has(ModBlocks.EBONSTONE_BRICKS))
                        .group("ebonstone")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EBONSTONE_BRICK_SLAB, ModBlocks.EBONSTONE_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EBONSTONE_BRICK_WALL, ModBlocks.EBONSTONE_BRICKS);


                stairBuilder(ModBlocks.HALLOWED_BRICK_STAIRS, Ingredient.of(ModBlocks.HALLOWED_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.HALLOWED_BRICKS), has(ModBlocks.HALLOWED_BRICKS))
                        .group("hallowed")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HALLOWED_BRICK_SLAB, ModBlocks.HALLOWED_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HALLOWED_BRICK_WALL, ModBlocks.HALLOWED_BRICKS);


                stairBuilder(ModBlocks.ICE_BRICK_STAIRS, Ingredient.of(ModBlocks.ICE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.ICE_BRICKS), has(ModBlocks.ICE_BRICKS))
                        .group("ice")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_BRICK_SLAB, ModBlocks.ICE_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_BRICK_WALL, ModBlocks.ICE_BRICKS);

                stairBuilder(ModBlocks.IRIDESCENT_BRICK_STAIRS, Ingredient.of(ModBlocks.IRIDESCENT_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.IRIDESCENT_BRICKS), has(ModBlocks.IRIDESCENT_BRICKS))
                        .group("iridescent")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRIDESCENT_BRICK_SLAB, ModBlocks.IRIDESCENT_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRIDESCENT_BRICK_WALL, ModBlocks.IRIDESCENT_BRICKS);

                stairBuilder(ModBlocks.METEORITE_BRICK_STAIRS, Ingredient.of(ModBlocks.METEORITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.METEORITE_BRICKS), has(ModBlocks.METEORITE_BRICKS))
                        .group("meteorite")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.METEORITE_BRICK_SLAB, ModBlocks.METEORITE_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.METEORITE_BRICK_WALL, ModBlocks.METEORITE_BRICKS);

                stairBuilder(ModBlocks.MUDSTONE_BRICK_STAIRS, Ingredient.of(ModBlocks.MUDSTONE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.MUDSTONE_BRICKS), has(ModBlocks.MUDSTONE_BRICKS))
                        .group("mudstone")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUDSTONE_BRICK_SLAB, ModBlocks.MUDSTONE_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUDSTONE_BRICK_WALL, ModBlocks.MUDSTONE_BRICKS);

                stairBuilder(ModBlocks.MYTHRIL_BRICK_STAIRS, Ingredient.of(ModBlocks.MYTHRIL_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.MYTHRIL_BRICKS), has(ModBlocks.MYTHRIL_BRICKS))
                        .group("mythril_bricks")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MYTHRIL_BRICK_SLAB, ModBlocks.MYTHRIL_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MYTHRIL_BRICK_WALL, ModBlocks.MYTHRIL_BRICKS);

                stairBuilder(ModBlocks.OBSIDIAN_BRICK_STAIRS, Ingredient.of(ModBlocks.OBSIDIAN_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.OBSIDIAN_BRICKS), has(ModBlocks.OBSIDIAN_BRICKS))
                        .group("obsidian_bricks")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICK_SLAB, ModBlocks.OBSIDIAN_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICK_WALL, ModBlocks.OBSIDIAN_BRICKS);

                stairBuilder(ModBlocks.BLUE_DUNGEON_BRICK_STAIRS, Ingredient.of(ModBlocks.BLUE_DUNGEON_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.BLUE_DUNGEON_BRICKS), has(ModBlocks.BLUE_DUNGEON_BRICKS))
                        .group("blue_dungeon_bricks")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_DUNGEON_BRICK_SLAB, ModBlocks.BLUE_DUNGEON_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_DUNGEON_BRICK_WALL, ModBlocks.BLUE_DUNGEON_BRICKS);

                stairBuilder(ModBlocks.GREEN_DUNGEON_BRICK_STAIRS, Ingredient.of(GREEN_DUNGEON_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.GREEN_DUNGEON_BRICKS), has(ModBlocks.GREEN_DUNGEON_BRICKS))
                        .group("green_dungeon_bricks")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_DUNGEON_BRICK_SLAB, ModBlocks.GREEN_DUNGEON_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_DUNGEON_BRICK_WALL, ModBlocks.GREEN_DUNGEON_BRICKS);

                stairBuilder(ModBlocks.LIZAHARD_BRICK_STAIRS, Ingredient.of(LIZAHARD_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.LIZAHARD_BRICKS), has(ModBlocks.LIZAHARD_BRICKS))
                        .group("lizahard")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIZAHARD_BRICK_SLAB, ModBlocks.LIZAHARD_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIZAHARD_BRICK_WALL, ModBlocks.LIZAHARD_BRICKS);


                stairBuilder(ModBlocks.PEARLSTONE_BRICK_STAIRS, Ingredient.of(PEARLSTONE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.PEARLSTONE_BRICKS), has(ModBlocks.PEARLSTONE_BRICKS))
                        .group("pearlstone")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEARLSTONE_BRICK_SLAB, ModBlocks.PEARLSTONE_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEARLSTONE_BRICK_WALL, ModBlocks.PEARLSTONE_BRICKS);





























            }
        };
    }

    @Override
    public String getName() {
        return "Unnamedmod Recipes";
    }
}
