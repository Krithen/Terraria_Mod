package com.krithenmc.unnamedmod.block;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.block.custom.*;
import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;

import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;

import net.minecraft.util.ColorRGBA;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;

import net.minecraft.world.level.material.PushReaction;

import java.util.function.Consumer;
import java.util.function.Function;

public class ModBlocks {

    public static final Block CYAN_MOSS = registerBlock("cyan_moss", properties ->
            new Block(properties.strength(0.1f).sound(SoundType.MOSS)));
    public static final Block PURPLE_MOSS = registerBlock("purple_moss", properties ->
            new Block(properties.strength(0.1f).sound(SoundType.MOSS)));
    public static final Block RED_MOSS = registerBlock("red_moss", properties ->
            new Block(properties.strength(0.1f).sound(SoundType.MOSS)));
    public static final Block BLUE_MOSS = registerBlock("blue_moss", properties ->
            new Block(properties.strength(0.1f).sound(SoundType.MOSS)));
    public static final Block ADAMANTITE_ORE = registerBlock("adamantite_ore", properties ->
            new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block ADAMANTITE_DEEPSLATE_ORE = registerBlock("adamantite_deepslate_ore", properties ->
            new DropExperienceBlock(UniformInt.of(3, 6), properties.strength(4f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block CHLOROPHYTE_ORE = registerBlock("chlorophyte_ore", properties ->
            new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(1f).sound(SoundType.MUD).requiresCorrectToolForDrops()));
    public static final Block CHLOROPHYTE_DEEPSLATE_ORE = registerBlock("chlorophyte_deepslate_ore", properties ->
            new DropExperienceBlock(UniformInt.of(3, 6), properties.strength(4f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block COBALT_ORE = registerBlock("cobalt_ore", properties ->
            new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block COBALT_DEEPSLATE_ORE = registerBlock("cobalt_deepslate_ore", properties ->
            new DropExperienceBlock(UniformInt.of(3, 6), properties.strength(4f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block CRIMTANE_ORE = registerBlock("crimtane_ore", properties ->
            new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block CRIMTANE_DEEPSLATE_ORE = registerBlock("crimtane_deepslate_ore", properties ->
            new DropExperienceBlock(UniformInt.of(3, 6), properties.strength(4f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block DEMONITE_ORE = registerBlock("demonite_ore", properties ->
            new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block DEMONITE_EBONSTONE_ORE = registerBlock("demonite_ebonstone_ore", properties ->
            new DropExperienceBlock(UniformInt.of(3, 6), properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block DEMONITE_DEEPSLATE_ORE = registerBlock("demonite_deepslate_ore", properties ->
            new DropExperienceBlock(UniformInt.of(3, 6), properties.strength(4f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block LEAD_ORE = registerBlock("lead_ore", properties ->
            new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block LEAD_DEEPSLATE_ORE = registerBlock("lead_deepslate_ore", properties ->
            new DropExperienceBlock(UniformInt.of(3, 6), properties.strength(4f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block SHADEWOOD_LEAVES = registerBlock("shadewood_leaves", properties ->
            new LeavesBlock(2f, properties.sound(SoundType.AZALEA_LEAVES).strength(0.2f).noOcclusion()) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {
                    return null;
                }

                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {

                }
            });
    public static final Block CRIMSTONE = registerBlock("crimstone", properties ->
            new Block(properties.requiresCorrectToolForDrops().strength(2).sound(SoundType.STONE)    ));
    public static final Block EBONSTONE = registerBlock("ebonstone", properties ->
            new Block(properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block EBONSTONE_WALL = registerBlock("ebonstone_wall", properties ->
            new WallBlock(properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore", properties ->
            new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block MYTHRIL_DEEPSLATE_ORE = registerBlock("mythril_deepslate_ore", properties ->
            new DropExperienceBlock(UniformInt.of(3, 6), properties.strength(4f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block METEORITE_ORE = registerBlock("meteorite_ore", properties ->
            new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block ORICHALCUM_ORE = registerBlock("orichalcum_ore", properties ->
            new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block ORICHALCUM_DEEPSLATE_ORE = registerBlock("orichalcum_deepslate_ore", properties ->
            new DropExperienceBlock(UniformInt.of(3, 6), properties.strength(4f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block SHADEWOOD_LOG = registerBlock("shadewood_log", properties -> new
            RotatedPillarBlock(properties.strength(1f).sound(SoundType.WOOD)));
    public static final Block BOREAL_WOOD_LOG = registerBlock("boreal_wood_log", properties -> new
            RotatedPillarBlock(properties.strength(1f).sound(SoundType.WOOD)));
    public static final Block LUMINITE_ORE = registerBlock("luminite_ore", properties ->
            new DropExperienceBlock(UniformInt.of(3, 6), properties.strength(4f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block SHADEWOOD_PLANK = registerBlock("shadewood_plank", properties ->
            new Block(properties.strength(1f).ignitedByLava()));
    public static final Block SHADEWOOD_STAIRS = registerBlock("shadewood_stairs", properties ->
            new StairBlock(ModBlocks.SHADEWOOD_PLANK.defaultBlockState(), properties.strength(1f).ignitedByLava()));
    public static final Block SHADEWOOD_SLAB = registerBlock("shadewood_slab", properties ->
            new SlabBlock(properties.strength(1f).ignitedByLava()));
    public static final Block SHADEWOOD_BUTTON = registerBlock("shadewood_button", properties ->
            new ButtonBlock(BlockSetType.IRON, 40, properties.strength(1f).noCollision()));
    public static final Block SHADEWOOD_PRESSURE_PLATE = registerBlock("shadewood_pressure_plate", properties ->
            new PressurePlateBlock(BlockSetType.DARK_OAK, properties.strength(1f).noCollision().forceSolidOn().pushReaction(PushReaction.DESTROY)));
    public static final Block SHADEWOOD_FENCE = registerBlock("shadewood_fence", properties ->
            new FenceBlock(properties.strength(1f)));
    public static final Block SHADEWOOD_FENCE_GATE = registerBlock("shadewood_fence_gate", properties ->
            new FenceGateBlock(WoodType.DARK_OAK, properties.strength(1f).noOcclusion()));
    public static final Block SHADEWOOD_DOOR = registerBlock("shadewood_door", properties ->
            new DoorBlock(BlockSetType.DARK_OAK, properties.strength(1f).noOcclusion()));
    public static final Block SHADEWOOD_TRAPDOOR = registerBlock("shadewood_trapdoor", properties ->
            new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(1f).noOcclusion()));


    public static final Block BLUE_GRANITE = registerBlock("blue_granite", properties ->
            new Block(properties.strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final Block EBONSAND = registerBlock("ebonsand", properties ->
            new SandBlock(new ColorRGBA(14406560), properties.strength(0.6f).sound(SoundType.SAND).instrument(NoteBlockInstrument.SNARE)));
    public static final Block CRIMSAND = registerBlock("crimsand", properties ->
            new SandBlock(new ColorRGBA(14406560), properties.strength(0.6f).sound(SoundType.SAND).instrument(NoteBlockInstrument.SNARE)));
    public static final Block SHIMMER_BLOCK = registerBlock("shimmer_block", properties ->
            new MagicBlock(properties.strength(1f)));
    public static final Block MARBLE = registerBlock("marble", properties ->
            new Block(properties.strength(2f)));
    public static final Block PALLADIUM_ORE = registerBlock("palladium_ore", properties ->
            new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block PALLADIUM_DEEPSLATE_ORE = registerBlock("palladium_deepslate_ore", properties ->
            new DropExperienceBlock(UniformInt.of(3, 6), properties.strength(4f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block EMERALD_GEMSPARK_BLOCK = registerBlock("emerald_gemspark_block", properties -> new
            EmeraldGemSparkBlock(properties.strength(2f).requiresCorrectToolForDrops().lightLevel(state -> state.getValue(EmeraldGemSparkBlock.CLICKED) ? 10 : 0)));
    public static final Block Boreal_Planks = registerBlock("boreal_planks", properties -> new
            Block(properties.strength(1f)));

    public static final Block BOREAL_STAIRS = registerBlock("boreal_stairs", properties -> new
            StairBlock(ModBlocks.Boreal_Planks.defaultBlockState(), properties.strength(1f)));
    public static final Block BOREAL_SLAB = registerBlock("boreal_slab", properties -> new
            SlabBlock(properties.strength(1f)));
    public static final Block BOREAL_BUTTON = registerBlock("boreal_button", properties ->
            new ButtonBlock(BlockSetType.IRON, 40, properties.strength(1f).noCollision()));
    public static final Block BOREAL_PRESSURE_PLATE = registerBlock("boreal_pressure_plate", properties ->
            new PressurePlateBlock(BlockSetType.DARK_OAK, properties.strength(1f).noCollision().forceSolidOn().pushReaction(PushReaction.DESTROY)));
    public static final Block BOREAL_FENCE = registerBlock("boreal_fence", properties ->
            new FenceBlock(properties.strength(1f)));
    public static final Block BOREAL_FENCE_GATE = registerBlock("boreal_fence_gate", properties ->
            new FenceGateBlock(WoodType.DARK_OAK, properties.strength(1f).noOcclusion()));
    public static final Block BOREAL_DOOR = registerBlock("boreal_door", properties ->
            new DoorBlock(BlockSetType.DARK_OAK, properties.strength(1f).noOcclusion()));
    public static final Block BOREAL_TRAPDOOR = registerBlock("boreal_trapdoor", properties ->
            new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(1f).noOcclusion()));
    public static final Block LEAD_ANVIL = registerBlock("lead_anvil", properties ->
            new AnvilBlock(properties.strength(2f)));
    public static final Block ANCIENT_FOSSIL = registerBlock("ancient_fossil", properties ->
            new Block(properties.strength(2f, 1).requiresCorrectToolForDrops()));
    public static final Block BLUE_MUSHROOM_STEM = registerBlock("blue_mushroom_stem", properties ->
            new HugeMushroomBlock(properties.strength(0.2f).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BLUE_MUSHROOM_BLOCK = registerBlock("blue_mushroom_block", properties ->
            new HugeMushroomBlock(properties.strength(0.2f).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block CLOUD = registerBlock("cloud", properties ->
            new ScaffoldingBlock(properties.strength(0.2f).bounceRestitution(0.5f)));
    public static final Block CRIMSON_BAMBOO_STALK = registerBlock("crimson_bamboo_stalk", properties ->
            new BambooStalkBlock(properties.strength(1f)));
    public static final Block CRISPY_HONEY_BLOCK = registerBlock("crispy_honey_block", properties ->
            new HoneyBlock(properties.strength(0.5f).jumpFactor(0.5f)));
    public static final Block DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore", properties ->
            new DropExperienceBlock(UniformInt.of(3, 6), properties.strength(4f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block ASTRA_BRICKS = registerBlock("astra_bricks", properties ->
            new Block(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block CHLOROPHYTE_BRICKS = registerBlock("chlorophyte_bricks", properties ->
            new Block(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final Block COBALT_BRICKS = registerBlock("cobalt_bricks", properties ->
            new Block(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final Block COSMIC_EMBER_BRICKS = registerBlock("cosmic_ember_bricks", properties ->
            new Block(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block CRIMSTONE_BRICKS = registerBlock("crimstone_bricks", properties ->
            new CrimsonBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final Block CRIMTANE_BRICKS = registerBlock("crimtane_bricks", properties ->
            new Block(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final Block CRYOCORE_BRICKS = registerBlock("cryocore_bricks", properties ->
            new Block(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block DARK_CELESTIAL_BRICKS = registerBlock("dark_celestial_bricks", properties ->
            new Block(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block DEMONITE_BRICKS = registerBlock("demonite_bricks", properties ->
            new Block(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block EBONSTONE_BRICKS = registerBlock("ebonstone_bricks", properties ->
            new Block(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block HALLOWED_BRICKS = registerBlock("hallowed_bricks", properties ->
            new Block(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final Block RAINBOW_BRICKS = registerBlock("rainbow_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block RAINBOW_BRICK_WALLS = registerBlock("rainbow_brick_walls", properties ->
            new WallBlock(properties.strength(2f)));
    public static final Block RAINBOW_BRICK_SLABS = registerBlock("rainbow_brick_slabs", properties ->
            new SlabBlock(properties.strength(2f)));
    public static final Block RAINBOW_BRICK_STAIRS = registerBlock("rainbow_brick_stairs", properties ->
            new StairBlock(ModBlocks.RAINBOW_BRICKS.defaultBlockState(), properties.strength(2f)));
    public static final Block RAINBOW_BRICK_BUTTON = registerBlock("rainbow_brick_button", properties ->
            new ButtonBlock(BlockSetType.STONE, 40, properties.strength(2f).noCollision()));
    public static final Block HARDENED_SAND = registerBlock("hardened_sand", properties ->
            new Block(properties.strength(1f)));
    public static final Block HARDENED_CRIMSAND = registerBlock("hardened_crimsand", properties ->
            new Block(properties.strength(1f)));
    public static final Block HARDENED_EBONSAND = registerBlock("hardened_ebonsand", properties ->
            new Block(properties.strength(1f)));
    public static final Block TUNGSTEN_ORE = registerBlock("tungsten_ore", properties ->
            new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block TITANIUM_DEEPSLATE_ORE = registerBlock("titanium_deepslate_ore", properties ->
            new DropExperienceBlock(UniformInt.of(3, 6), properties.strength(4f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block TITANIUM_ORE = registerBlock("titanium_ore", properties ->
            new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block TIN_DEEPSLATE_ORE = registerBlock("tin_deepslate_ore", properties ->
            new DropExperienceBlock(UniformInt.of(3, 6), properties.strength(4f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block TIN_ORE = registerBlock("tin_ore", properties ->
            new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block HIVE = registerBlock("hive", properties ->
            new HiveBlock(properties.strength(1f)));
    public static final Block ICE_BRICKS = registerBlock("ice_bricks", properties ->
            new IceBlock(properties.strength(2f)));
    public static final Block IRIDESCENT_BRICKS = registerBlock("iridescent_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block LIFE_CRYSTAL = registerBlock("life_crystal", properties ->
            new LifeCrystalBlock(properties.strength(2f).noOcclusion()));
    public static final Block LIVING_LEAF_BLOCK = registerBlock("living_leaf_block", properties ->
            new Block(properties.strength(1f).requiresCorrectToolForDrops()));
    public static final Block LIVING_MAHOGANY = registerBlock("living_mahogany", properties ->
            new Block(properties.strength(2f)));
    public static final Block LIVING_MAHOGANY_LEAVES = registerBlock("living_mahogany_leaves", properties ->
            new Block(properties.strength(1f).requiresCorrectToolForDrops()));
    public static final Block LIVING_WOOD = registerBlock("living_wood", properties ->
            new Block(properties.strength(3f)));
    public static final Block ASH = registerBlock("ash", properties ->
            new Block(properties.strength(2f)));
    public static final Block BOTTLE_TERRARIA = registerBlock("bottle_terraria", properties ->
            new BottleBlock(properties.strength(1f).noOcclusion()));
    public static final Block METEORITE_BRICKS = registerBlock("meteorite_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block MUDSTONE_BRICKS = registerBlock("mudstone_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block MYTHRIL_BRICKS = registerBlock("mythril_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block OBSIDIAN_BRICKS = registerBlock("obsidian_bricks", properties ->
            new Block(properties.strength(4f)));
    public static final Block PALMWOOD_LOG = registerBlock("palmwood_log", properties -> new
            RotatedPillarBlock(properties.strength(1f).sound(SoundType.WOOD)));
    public static final Block PALMWOOD_PLANKS = registerBlock("palmwood_planks", properties ->
            new Block(properties.strength(1f).sound(SoundType.WOOD)));
    public static final Block PALMWOOD_SLABS = registerBlock("palmwood_slabs", properties ->
            new SlabBlock(properties.strength(1f).sound(SoundType.WOOD)));
    public static final Block PALMWOOD_STAIRS = registerBlock("palmwood_stairs", properties ->
            new StairBlock(ModBlocks.PALMWOOD_PLANKS.defaultBlockState(), properties.strength(1f).sound(SoundType.WOOD)));
    public static final Block PALMWOOD_TRAPDOOR = registerBlock("palmwood_trapdoor", properties ->
            new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(1f).noOcclusion().sound(SoundType.WOOD)));
    public static final Block PALMWOOD_DOOR = registerBlock("palmwood_door", properties ->
            new DoorBlock(BlockSetType.DARK_OAK, properties.strength(1f).noOcclusion().sound(SoundType.WOOD)));
    public static final Block PALMWOOD_BUTTON = registerBlock("palmwood_button", properties ->
            new ButtonBlock(BlockSetType.DARK_OAK, 20, properties.sound(SoundType.WOOD).strength(1f).noCollision()));
    public static final Block PALMWOOD_PRESSURE_PLATE = registerBlock("palmwood_pressure_plate", properties ->
            new PressurePlateBlock(BlockSetType.DARK_OAK, properties.sound(SoundType.WOOD).strength(1f).noCollision()));
    public static final Block PALMWOOD_FENCE = registerBlock("palmwood_fence", properties ->
            new FenceBlock(properties.sound(SoundType.WOOD).strength(1f)));
    public static final Block PALMWOOD_FENCE_GATE = registerBlock("palmwood_fence_gate", properties ->
            new FenceGateBlock(WoodType.DARK_OAK, properties.sound(SoundType.WOOD).strength(1f)));
    public static final Block PALMWOOD = registerBlock("palmwood", properties ->
            new Block(properties.sound(SoundType.WOOD).strength(1f)));
    public static final Block SHADEWOOD = registerBlock("shadewood", properties ->
            new Block(properties.strength(1f).sound(SoundType.WOOD)));
    public static final Block BOREAL_WOOD = registerBlock("boreal_wood", properties ->
            new Block(properties.strength(1f).sound(SoundType.WOOD)));
    public static final Block HELIUM_MOSS = registerBlock("helium_moss", properties ->
            new Block(properties.strength(1f).sound(SoundType.MOSS)));
    public static final Block HELIUM_MOSS_CARPET = registerBlock("helium_moss_carpet", properties ->
            new MossyCarpetBlock(properties.strength(1f).sound(SoundType.MOSS)));
    public static final Block ARGON_MOSS = registerBlock("argon_moss", properties ->
            new Block(properties.strength(1f).sound(SoundType.MOSS)));
    public static final Block ARGON_MOSS_CARPET = registerBlock("argon_moss_carpet", properties ->
            new MossyCarpetBlock(properties.strength(1f).sound(SoundType.MOSS)));
    public static final Block DEATHWEED_CROP = registerBlockWithoutBlockitem("deathweed_crop", properties ->
            new DeathweedCropBlock(properties.noCollision().randomTicks().instabreak().sound(SoundType.CROP).pushReaction(PushReaction.DESTROY)));
    public static final Block BLOOD_ORANGE_BUSH = registerBlockWithoutBlockitem("blood_orange_bush", properties ->
            new BloodOrangeBushBlock(properties.randomTicks().noCollision().noOcclusion().sound(SoundType.SWEET_BERRY_BUSH)));










    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name), toRegister);

    }



    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name)))));
    }



    private static void registerBlockItem(String name, Block block, Component... tooltips) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name)))) {
                    @Override
                    public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                        for (var component : tooltips) {
                            builder.accept(component);
                        }
                        super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                    }
                });
    }
    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }
    public static void registerModBlocks() {
        Unnamedmod.LOGGER.info("Registering Mod Blocks for" + Unnamedmod.MOD_ID);

    }

    private static Block registerBlockWithoutBlockitem(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name))));
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name), toRegister);

    }




}