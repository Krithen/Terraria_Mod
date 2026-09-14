package com.krithenmc.unnamedmod.datagen;


import com.krithenmc.unnamedmod.block.ModBlocks;
import com.krithenmc.unnamedmod.block.custom.BloodOrangeBushBlock;
import com.krithenmc.unnamedmod.block.custom.DeathweedCropBlock;
import com.krithenmc.unnamedmod.block.custom.EmeraldGemSparkBlock;
import com.krithenmc.unnamedmod.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TexturedModel;

import net.minecraft.client.model.Model;
import net.minecraft.client.renderer.block.dispatch.Variant;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.resources.Identifier;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.item.Items;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.CYAN_MOSS);
        blockModelGenerators.createTrivialCube(ModBlocks.RED_MOSS);
        blockModelGenerators.createTrivialCube(ModBlocks.BLUE_MOSS);
        blockModelGenerators.createTrivialCube(ModBlocks.PURPLE_MOSS);
        blockModelGenerators.createTrivialCube(ModBlocks.ADAMANTITE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.ADAMANTITE_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.CHLOROPHYTE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.CHLOROPHYTE_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.COBALT_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.COBALT_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.CRIMTANE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.CRIMTANE_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.DEMONITE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.DEMONITE_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.DEMONITE_EBONSTONE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.LEAD_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.LEAD_DEEPSLATE_ORE);


        blockModelGenerators.createTintedLeaves(ModBlocks.SHADEWOOD_LEAVES, TexturedModel.LEAVES, 780606);
        blockModelGenerators.createTrivialCube(ModBlocks.CRIMSTONE);
        //blockModelGenerators.createTrivialCube(ModBlocks.EBONSTONE);
        blockModelGenerators.createTrivialCube(ModBlocks.MYTHRIL_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.MYTHRIL_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.METEORITE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.ORICHALCUM_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.ORICHALCUM_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.LUMINITE_ORE);
        //blockModelGenerators.createTrivialCube(ModBlocks.SHADEWOOD_PLANK);
        blockModelGenerators.createTrivialCube(ModBlocks.BLUE_GRANITE);
        blockModelGenerators.createTrivialCube(ModBlocks.EBONSAND);
        blockModelGenerators.createTrivialCube(ModBlocks.CRIMSAND);
        blockModelGenerators.createTrivialCube(ModBlocks.SHIMMER_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.PALLADIUM_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.PALLADIUM_ORE);
        blockModelGenerators.family(ModBlocks.SHADEWOOD_PLANK)
                .stairs(ModBlocks.SHADEWOOD_STAIRS)
                .slab(ModBlocks.SHADEWOOD_SLAB)
                .button(ModBlocks.SHADEWOOD_BUTTON)
                .pressurePlate(ModBlocks.SHADEWOOD_PRESSURE_PLATE)
                .fence(ModBlocks.SHADEWOOD_FENCE)
                .fenceGate(ModBlocks.SHADEWOOD_FENCE_GATE);
        blockModelGenerators.family(ModBlocks.EBONSTONE)
                .wall(ModBlocks.EBONSTONE_WALL);
        blockModelGenerators.createTrivialCube(ModBlocks.MARBLE);


        blockModelGenerators.createDoor(ModBlocks.SHADEWOOD_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.SHADEWOOD_TRAPDOOR);

        Identifier LampOffIdentifier = TexturedModel.CUBE.create(ModBlocks.EMERALD_GEMSPARK_BLOCK, blockModelGenerators.modelOutput);
        Identifier LampOnIdentifier = blockModelGenerators.createSuffixedVariant(ModBlocks.EMERALD_GEMSPARK_BLOCK, "_on", ModelTemplates.CUBE_ALL, TextureMapping::cube);

        blockModelGenerators.blockStateOutput.accept(MultiVariantGenerator.dispatch(ModBlocks.EMERALD_GEMSPARK_BLOCK)
                .with(BlockModelGenerators.createBooleanModelDispatch(EmeraldGemSparkBlock.CLICKED,
                        new MultiVariant(WeightedList.<Variant>builder().add(new Variant(LampOnIdentifier)).build()),
                        new MultiVariant(WeightedList.<Variant>builder().add(new Variant(LampOffIdentifier)).build()))));
        blockModelGenerators.family(ModBlocks.Boreal_Planks)
                .stairs(ModBlocks.BOREAL_STAIRS)
                .slab(ModBlocks.BOREAL_SLAB)
                .button(ModBlocks.BOREAL_BUTTON)
                .pressurePlate(ModBlocks.BOREAL_PRESSURE_PLATE)
                .fence(ModBlocks.BOREAL_FENCE)
                .fenceGate(ModBlocks.BOREAL_FENCE_GATE);
        blockModelGenerators.createDoor(ModBlocks.BOREAL_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.BOREAL_TRAPDOOR);
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(ModBlocks.SHADEWOOD_LOG, TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL );
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(ModBlocks.BOREAL_WOOD_LOG, TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL );
        blockModelGenerators.createRotatedPillarWithHorizontalVariant(ModBlocks.PALMWOOD_LOG, TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL);
        blockModelGenerators.createAnvil(ModBlocks.LEAD_ANVIL);
        blockModelGenerators.createTrivialCube(ModBlocks.ANCIENT_FOSSIL);
        blockModelGenerators.createTrivialCube(ModBlocks.BLUE_MUSHROOM_STEM);
        blockModelGenerators.createMushroomBlock(ModBlocks.BLUE_MUSHROOM_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.CLOUD);
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.CRISPY_HONEY_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.ASTRA_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.CHLOROPHYTE_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.COBALT_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.COSMIC_EMBER_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.CRIMTANE_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.CRIMSTONE_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.CRYOCORE_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.EBONSTONE_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.DEMONITE_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.DARK_CELESTIAL_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.HALLOWED_BRICKS);
        blockModelGenerators.family(ModBlocks.RAINBOW_BRICKS)
                .stairs(ModBlocks.RAINBOW_BRICK_STAIRS)
                .slab(ModBlocks.RAINBOW_BRICK_SLABS)
                .wall(ModBlocks.RAINBOW_BRICK_WALLS)
                .button(ModBlocks.RAINBOW_BRICK_BUTTON);
        blockModelGenerators.createTrivialCube(ModBlocks.HARDENED_SAND);
        blockModelGenerators.createTrivialCube(ModBlocks.HARDENED_CRIMSAND);
        blockModelGenerators.createTrivialCube(ModBlocks.HARDENED_EBONSAND);
        blockModelGenerators.createTrivialCube(ModBlocks.TUNGSTEN_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.TITANIUM_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.TITANIUM_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.TIN_DEEPSLATE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.TIN_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.HIVE);
        blockModelGenerators.createTrivialCube(ModBlocks.ICE_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.IRIDESCENT_BRICKS);
        blockModelGenerators.createNonTemplateModelBlock(ModBlocks.LIFE_CRYSTAL);
        blockModelGenerators.createTrivialCube(ModBlocks.LIVING_LEAF_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.LIVING_MAHOGANY);
        blockModelGenerators.createTrivialCube(ModBlocks.LIVING_MAHOGANY_LEAVES);
        blockModelGenerators.createTrivialCube(ModBlocks.LIVING_WOOD);
        blockModelGenerators.createTrivialCube(ModBlocks.ASH);
        blockModelGenerators.createNonTemplateModelBlock(ModBlocks.BOTTLE_TERRARIA);
        blockModelGenerators.createTrivialCube(ModBlocks.METEORITE_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.MUDSTONE_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.MYTHRIL_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.OBSIDIAN_BRICKS);
        blockModelGenerators.family(ModBlocks.PALMWOOD_PLANKS)
                .stairs(ModBlocks.PALMWOOD_STAIRS)
                .slab(ModBlocks.PALMWOOD_SLABS)
                .button(ModBlocks.PALMWOOD_BUTTON)
                .pressurePlate(ModBlocks.PALMWOOD_PRESSURE_PLATE)
                .fence(ModBlocks.PALMWOOD_FENCE)
                .fenceGate(ModBlocks.PALMWOOD_FENCE_GATE)
               ;
        blockModelGenerators.createTrapdoor(ModBlocks.PALMWOOD_TRAPDOOR);
        blockModelGenerators.createDoor(ModBlocks.PALMWOOD_DOOR);
        blockModelGenerators.createTrivialCube(ModBlocks.PALMWOOD);
        blockModelGenerators.createTrivialCube(ModBlocks.SHADEWOOD);
        blockModelGenerators.createTrivialCube(ModBlocks.BOREAL_WOOD);
        blockModelGenerators.createTrivialCube(ModBlocks.HELIUM_MOSS);
        blockModelGenerators.createMossyCarpet(ModBlocks.HELIUM_MOSS_CARPET);
        blockModelGenerators.createTrivialCube(ModBlocks.ARGON_MOSS);
        blockModelGenerators.createMossyCarpet(ModBlocks.ARGON_MOSS_CARPET);
        blockModelGenerators.createCropBlock(ModBlocks.DEATHWEED_CROP, DeathweedCropBlock.AGE, 0, 1, 2);
        blockModelGenerators.createCrossBlock(ModBlocks.BLOOD_ORANGE_BUSH, BlockModelGenerators.PlantType.NOT_TINTED, BloodOrangeBushBlock.AGE
                , 0, 1, 2, 3);









    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.ADAMANTITE_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_ADAMANTITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.AMBER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CHLOROPHYTE_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.COBALT_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CRIMTANE_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.HALLOWED_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DEMONITE_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.HELLSTONE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.HELLSTONE_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.LEAD_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.LUMINITE_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.METEORITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.METEORITE_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MYTHRIL_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ORICHALCUM_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PALLADIUM_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PLATINUM_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_CHLOROPHYTE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_COBALT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_CRIMTANE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_DEMONITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_LEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_LUMINITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_MYTHRIL, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_ORICHALCUM, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_PALLADIUM, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_SILVER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SHROOMITE_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SILVER_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SPECTRE_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TIN_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TITANIUM_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TUNGSTEN_BAR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ECTOPLASM, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.GLOWING_MUSHROOM, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.WOODEN_HAMMER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.APRICOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BANANUH, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.GEL, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.JOJA_COLA, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BLACKCURRANT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ACORN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.UMBRAL_CRYSTAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.UMBRAL_PLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.declareCustomModelItem(ModItems.WAR_AXE_OF_THE_NIGHT);
        itemModelGenerators.declareCustomModelItem(ModItems.LIGHTS_BANE);
        itemModelGenerators.declareCustomModelItem(ModItems.NIGHTMARE_SHOVEL);
        itemModelGenerators.declareCustomModelItem(ModItems.NIGHTMARE_PICKAXE);
        itemModelGenerators.declareCustomModelItem(ModItems.GUNGNIR);
        itemModelGenerators.generateFlatItem(ModItems.CORRUPTED_STICK, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SOUL_OF_NIGHT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BLEEDING_STICK, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.declareCustomModelItem(ModItems.BLOOD_BUTCHERER);
        itemModelGenerators.declareCustomModelItem(ModItems.NIGHTS_EDGE);
        itemModelGenerators.declareCustomModelItem(ModItems.THE_VOLCANO);
        itemModelGenerators.generateFlatItem(ModItems.BASIC_HELLSTONE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ADVANCED_HELLSTONE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.JUNGLE_SPORES, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.STINGER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.declareCustomModelItem(ModItems.THE_BREAKER);
        itemModelGenerators.generateFlatItem(ModItems.SHADOW_SCALE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DEMONITE_PLATING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.declareCustomModelItem(ModItems.GOLD_SHORTSWORD);
        itemModelGenerators.generateFlatItem(ModItems.SOUL_OF_MIGHT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SOUL_OF_SIGHT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.declareCustomModelItem(ModItems.BLADE_OF_GRASS);
        itemModelGenerators.declareCustomModelItem(ModItems.MURAMASA);
        itemModelGenerators.declareCustomModelItem(ModItems.IRON_BROADSWORD);
        itemModelGenerators.declareCustomModelItem(ModItems.AREADBHAR);
        itemModelGenerators.declareCustomModelItem(ModItems.BEE_KEEPER);
        itemModelGenerators.declareCustomModelItem(ModItems.CANDY_CANE_SWORD);
        itemModelGenerators.generateFlatItem(ModItems.RAW_TUNGSTEN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.declareCustomModelItem(ModItems.EXOTIC_SCIMITAR);
        itemModelGenerators.declareCustomModelItem(ModItems.ICE_BLADE);
        itemModelGenerators.declareCustomModelItem(ModItems.TERRARIA_KATANA);
        itemModelGenerators.declareCustomModelItem(ModItems.PURPLE_CLUBBERFISH);
        itemModelGenerators.declareCustomModelItem(ModItems.TENTACLE_SPIKE);
        itemModelGenerators.declareCustomModelItem(ModItems.IRON_SHORTSWORD);
        itemModelGenerators.declareCustomModelItem(ModItems.LEAD_SHORTSWORD);
        itemModelGenerators.declareCustomModelItem(ModItems.SILVER_SHORTSWORD);
        itemModelGenerators.declareCustomModelItem(ModItems.TIN_SHORTSWORD);
        itemModelGenerators.declareCustomModelItem(ModItems.TUNGSTEN_SHORTSWORD);
        itemModelGenerators.declareCustomModelItem(ModItems.STARFURY);
        itemModelGenerators.generateFlatItem(ModItems.CORRUPT_SEEDS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.COCONUT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CRIMSON_TIGERFISH, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.declareCustomModelItem(ModItems.PALLADIUM_SWORD);
        itemModelGenerators.declareCustomModelItem(ModItems.ICE_SICKLE);
        itemModelGenerators.declareCustomModelItem(ModItems.BONE_SWORD);
        itemModelGenerators.declareCustomModelItem(ModItems.BRAND_OF_THE_INFERNO);
        itemModelGenerators.declareCustomModelItem(ModItems.COBALT_SWORD);
        itemModelGenerators.declareCustomModelItem(ModItems.FROSTBRAND);
        itemModelGenerators.declareCustomModelItem(ModItems.BONE_PICKAXE);
        itemModelGenerators.generateFlatItem(ModItems.RAW_TITANUM, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_TIN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.declareCustomModelItem(ModItems.CACTUS_PICKAXE);
        itemModelGenerators.declareCustomModelItem(ModItems.FOSSIL_PICKAXE);
        itemModelGenerators.declareCustomModelItem(ModItems.LEAD_PICKAXE);
        itemModelGenerators.declareCustomModelItem(ModItems.MYTHRIL_SWORD);
        itemModelGenerators.declareCustomModelItem(ModItems.ORICHALCUM_SWORD);
        itemModelGenerators.generateFlatItem(ModItems.MAGIC_MIRROR, ModelTemplates.FLAT_HANDHELD_ROD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CHERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.declareCustomModelItem(ModItems.COBALT_PICKAXE);
        itemModelGenerators.declareCustomModelItem(ModItems.DEATHBRINGER_PICKAXE);
        itemModelGenerators.generateFlatItem(ModItems.ELDERBERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FUSED_VERTEBRA, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.declareCustomModelItem(ModItems.GLADIUS);
        itemModelGenerators.declareCustomModelItem(Items.GOLDEN_PICKAXE);
        itemModelGenerators.generateFlatItem(ModItems.GRAPEFRUIT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.HAMBURGER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.LEMON, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.LENS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MANGO, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MARSHMALLOW, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.declareCustomModelItem(ModItems.MOLTEN_PICKAXE);
        itemModelGenerators.createFlatItemModel(ModItems.MUSHROOM, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.declareCustomModelItem(ModItems.SHADOW_SABATONS);
        itemModelGenerators.declareCustomModelItem(ModItems.SHADOW_GREAVES);
        itemModelGenerators.declareCustomModelItem(ModItems.SHADOW_SCALEMAIL);
        itemModelGenerators.declareCustomModelItem(ModItems.SHADOW_HELMET);
        itemModelGenerators.declareCustomModelItem(ModItems.ADAMANTITE_SWORD);
        itemModelGenerators.createFlatItemModel(ModItems.DEATHWEED, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.declareCustomModelItem(ModItems.BEAM_SWORD);











    }
}
