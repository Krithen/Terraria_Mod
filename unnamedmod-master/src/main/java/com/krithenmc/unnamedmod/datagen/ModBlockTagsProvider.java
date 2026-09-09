package com.krithenmc.unnamedmod.datagen;

import com.krithenmc.unnamedmod.block.ModBlocks;
import com.krithenmc.unnamedmod.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;


import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(ModBlocks.CHLOROPHYTE_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.ADAMANTITE_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.ADAMANTITE_ORE))
                .add(ModBlocks.getRK(ModBlocks.COBALT_ORE))
                .add(ModBlocks.getRK(ModBlocks.COBALT_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.CRIMTANE_ORE))
                .add(ModBlocks.getRK(ModBlocks.CRIMTANE_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEMONITE_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEMONITE_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEMONITE_EBONSTONE_ORE))
                .add(ModBlocks.getRK(ModBlocks.LEAD_ORE))
                .add(ModBlocks.getRK(ModBlocks.LEAD_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.CRIMSTONE))
                .add(ModBlocks.getRK(ModBlocks.EBONSTONE))
                .add(ModBlocks.getRK(ModBlocks.MYTHRIL_ORE))
                .add(ModBlocks.getRK(ModBlocks.MYTHRIL_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.METEORITE_ORE))
                .add(ModBlocks.getRK(ModBlocks.ORICHALCUM_ORE))
                .add(ModBlocks.getRK(ModBlocks.ORICHALCUM_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.LUMINITE_ORE))
                .add(ModBlocks.getRK(ModBlocks.BLUE_GRANITE))
                .add(ModBlocks.getRK(ModBlocks.MARBLE))
                .add(ModBlocks.getRK(ModBlocks.PALLADIUM_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.PALLADIUM_ORE))
                .add(ModBlocks.getRK(ModBlocks.EBONSTONE_WALL))
                .add(ModBlocks.getRK(ModBlocks.LEAD_ANVIL))
                .add(ModBlocks.getRK(ModBlocks.ANCIENT_FOSSIL))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_TUNGSTEN_ORE))
                .add(ModBlocks.getRK(ModBlocks.ASTRA_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.CHLOROPHYTE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.COBALT_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.COSMIC_EMBER_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.CRIMTANE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.CRIMSTONE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.CRYOCORE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.DEMONITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.EBONSTONE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.DARK_CELESTIAL_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.HALLOWED_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.RAINBOW_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.RAINBOW_BRICK_SLABS))
                .add(ModBlocks.getRK(ModBlocks.RAINBOW_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.RAINBOW_BRICK_WALLS))
                .add(ModBlocks.getRK(ModBlocks.RAINBOW_BRICK_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.TUNGSTEN_ORE))
                .add(ModBlocks.getRK(ModBlocks.TITANIUM_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.TITANIUM_ORE))
                .add(ModBlocks.getRK(ModBlocks.TIN_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.TIN_ORE))
                .add(ModBlocks.getRK(ModBlocks.HIVE))
                .add(ModBlocks.getRK(ModBlocks.ICE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.IRIDESCENT_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.ASH))

        ;


        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.BOREAL_SLAB))
                .add(ModBlocks.getRK(ModBlocks.RAINBOW_BRICK_SLABS));

        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.BOREAL_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.RAINBOW_BRICK_STAIRS));

        tag(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.BOREAL_BUTTON));

        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.BOREAL_PRESSURE_PLATE));

        tag(BlockTags.FENCES)
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_FENCE))
                .add(ModBlocks.getRK(ModBlocks.BOREAL_FENCE));

        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_FENCE_GATE))
                .add(ModBlocks.getRK(ModBlocks.BOREAL_FENCE_GATE));


        tag(BlockTags.WALLS)
                .add(ModBlocks.getRK(ModBlocks.EBONSTONE_WALL))
                .add(ModBlocks.getRK(ModBlocks.RAINBOW_BRICK_WALLS));

        tag(BlockTags.DOORS)
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_DOOR))
                .add(ModBlocks.getRK(ModBlocks.BOREAL_DOOR));

        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_TRAPDOOR))
                .add(ModBlocks.getRK(ModBlocks.BOREAL_TRAPDOOR));










        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.getRK(ModBlocks.CYAN_MOSS))
                .add(ModBlocks.getRK(ModBlocks.RED_MOSS))
                .add(ModBlocks.getRK(ModBlocks.PURPLE_MOSS))
                .add(ModBlocks.getRK(ModBlocks.BLUE_MOSS))
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_LEAVES))
                .add(ModBlocks.getRK(ModBlocks.LIVING_LEAF_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.LIVING_MAHOGANY_LEAVES));

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.getRK(ModBlocks.CHLOROPHYTE_ORE))
                .add(ModBlocks.getRK(ModBlocks.EBONSAND))
                .add(ModBlocks.getRK(ModBlocks.CRIMSAND))
                .add(ModBlocks.getRK(ModBlocks.SHIMMER_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.HARDENED_EBONSAND))
                .add(ModBlocks.getRK(ModBlocks.HARDENED_SAND))
                .add(ModBlocks.getRK(ModBlocks.HARDENED_CRIMSAND));

        tag(BlockTags.SHEARS_EXTREME_BREAKING_SPEED)
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_LEAVES));

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_LOG))
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_PLANK))
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_SLAB))
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_FENCE))
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_FENCE_GATE))
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_DOOR))
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_TRAPDOOR))
                .add(ModBlocks.getRK(ModBlocks.Boreal_Planks))
                .add(ModBlocks.getRK(ModBlocks.BOREAL_SLAB))
                .add(ModBlocks.getRK(ModBlocks.BOREAL_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.BOREAL_WOOD_LOG))
                .add(ModBlocks.getRK(ModBlocks.BOREAL_FENCE))
                .add(ModBlocks.getRK(ModBlocks.BOREAL_FENCE_GATE))
                .add(ModBlocks.getRK(ModBlocks.BOREAL_DOOR))
                .add(ModBlocks.getRK(ModBlocks.BOREAL_TRAPDOOR))
                .add(ModBlocks.getRK(ModBlocks.BOREAL_WOOD_LOG))
                .add(ModBlocks.getRK(ModBlocks.BLUE_MUSHROOM_STEM))
                .add(ModBlocks.getRK(ModBlocks.BLUE_MUSHROOM_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.CRIMSON_BAMBOO_STALK))
                .add(ModBlocks.getRK(ModBlocks.LIVING_MAHOGANY))
                .add(ModBlocks.getRK(ModBlocks.LIVING_WOOD));

        tag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.NEEDS_HELLSTONE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_DEMONITE_TOOL)
                .add(ModBlocks.getRK(ModBlocks.COBALT_ORE))
                .add(ModBlocks.getRK(ModBlocks.COBALT_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.PALLADIUM_ORE))
                .add(ModBlocks.getRK(ModBlocks.PALLADIUM_DEEPSLATE_ORE))
                ;

        tag(ModTags.Blocks.NEEDS_DEMONITE_TOOL)
                .add(ModBlocks.getRK(ModBlocks.EBONSTONE))
                .add(ModBlocks.getRK(ModBlocks.CRIMSTONE))
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.getRK(ModBlocks.DEMONITE_EBONSTONE_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEMONITE_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEMONITE_ORE))
                .add(ModBlocks.getRK(ModBlocks.CRIMTANE_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.CRIMTANE_ORE))
                ;
        tag(ModTags.Blocks.NEEDS_HALLOWED_TOOL)
                .addTag(ModTags.Blocks.NEEDS_MYTHRIL_TOOL)
                .addTag(ModTags.Blocks.NEEDS_COBALT_TOOL)
                .addTag(ModTags.Blocks.NEEDS_TIN_TOOL)
                .addTag(ModTags.Blocks.NEEDS_SILVER_TOOL)
                .addTag(ModTags.Blocks.NEEDS_LEAD_TOOL)
                .addTag(ModTags.Blocks.NEEDS_DEMONITE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_BONE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_HELLSTONE_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL)
                .addTag(ModTags.Blocks.NEEDS_PALLADIUM_TOOL)
                .addTag(BlockTags.NEEDS_STONE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_TUNGSTEN_TOOL)
                .add(ModBlocks.getRK(ModBlocks.CHLOROPHYTE_ORE))
                .add(ModBlocks.getRK(ModBlocks.CHLOROPHYTE_DEEPSLATE_ORE));

        tag(ModTags.Blocks.INCORRECT_FOR_LEAD_TOOL)
                .addTag(ModTags.Blocks.NEEDS_DEMONITE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_HELLSTONE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_PALLADIUM_TOOL)
                .addTag(ModTags.Blocks.NEEDS_COBALT_TOOL)
                .addTag(ModTags.Blocks.NEEDS_HALLOWED_TOOL)
                .addTag(ModTags.Blocks.NEEDS_MYTHRIL_TOOL)
                .addTag(ModTags.Blocks.NEEDS_BONE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_HALLOWED_TOOL)
                ;

        tag(ModTags.Blocks.NEEDS_LEAD_TOOL)
                .addTag(ModTags.Blocks.NEEDS_TIN_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_SILVER_TOOL)
        ;

        tag(ModTags.Blocks.NEEDS_SILVER_TOOL)
                .addTag(ModTags.Blocks.NEEDS_TIN_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_TIN_TOOL);

        tag(ModTags.Blocks.NEEDS_TIN_TOOL)
                .add(ModBlocks.getRK(ModBlocks.LEAD_ORE))
                .add(ModBlocks.getRK(ModBlocks.LEAD_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.TUNGSTEN_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_TUNGSTEN_ORE));

        tag(ModTags.Blocks.INCORRECT_FOR_TUNGSTEN_TOOL);

        tag(ModTags.Blocks.NEEDS_TUNGSTEN_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_BONE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_HALLOWED_TOOL)
                .addTag(ModTags.Blocks.NEEDS_HELLSTONE_TOOL);

        tag(ModTags.Blocks.NEEDS_BONE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_DEMONITE_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_COBALT_TOOL);

        tag(ModTags.Blocks.NEEDS_COBALT_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_MYTHRIL_TOOL);

        tag(ModTags.Blocks.NEEDS_MYTHRIL_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_PALLADIUM_TOOL);

        tag(ModTags.Blocks.NEEDS_PALLADIUM_TOOL);

        tag(BlockTags.NEEDS_STONE_TOOL);

        tag(ModTags.Blocks.NEEDS_CACTUS_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_CACTUS_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_FOSSIL_TOOL);

        tag(ModTags.Blocks.NEEDS_FOSSIL_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_ORICHALCUM_TOOL);

        tag(ModTags.Blocks.NEEDS_ORICHALCUM_TOOL);



        tag(ModTags.Blocks.INCORRECT_FOR_DEMONITE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_HALLOWED_TOOL)
                .addTag(ModTags.Blocks.NEEDS_HELLSTONE_TOOL);

        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .addTag(ModTags.Blocks.NEEDS_DEMONITE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_HALLOWED_TOOL)
                .addTag(ModTags.Blocks.NEEDS_HELLSTONE_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_HELLSTONE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_HALLOWED_TOOL);

        tag(ModTags.Blocks.CRIMSON_BLOCK)
                .add(ModBlocks.getRK(ModBlocks.CRIMSTONE))
                .add(ModBlocks.getRK(ModBlocks.CRIMSAND));

        tag(BlockTags.PLANKS)
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_PLANK))
                .add(ModBlocks.getRK(ModBlocks.Boreal_Planks));

        tag(BlockTags.LOGS)
                .add(ModBlocks.getRK(ModBlocks.SHADEWOOD_LOG))
                .add(ModBlocks.getRK(ModBlocks.BOREAL_WOOD_LOG));











    }
}
