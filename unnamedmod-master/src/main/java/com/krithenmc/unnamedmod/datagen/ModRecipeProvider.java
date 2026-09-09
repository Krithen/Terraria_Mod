package com.krithenmc.unnamedmod.datagen;

import com.krithenmc.unnamedmod.block.ModBlocks;
import com.krithenmc.unnamedmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;

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











            }
        };
    }

    @Override
    public String getName() {
        return "Unnamedmod Recipes";
    }
}
