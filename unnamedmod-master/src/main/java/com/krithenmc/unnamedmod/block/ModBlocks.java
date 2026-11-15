package com.krithenmc.unnamedmod.block;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.block.custom.*;
import com.krithenmc.unnamedmod.worldgen.tree.ModTreeGrowers;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.ColorRGBA;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
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
            new UntintedParticleLeavesBlock(0.01f,   ParticleTypes.PALE_OAK_LEAVES, AmbientLeavesBlockSoundPlayer.noAmbientSound(),  properties
                    .mapColor(MapColor.PLANT).strength(0.2F).randomTicks().sound(SoundType.LEAF_LITTER).noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never).ignitedByLava().pushReaction(PushReaction.POPPED).isRedstoneConductor(Blocks::never)));
    public static final Block CRIMSTONE = registerBlock("crimstone", properties ->
            new Block(properties.requiresCorrectToolForDrops().strength(2).sound(SoundType.STONE)    ));
    public static final Block CRIMSTONE_STAIRS = registerBlock("crimstone_stairs", properties ->
            new StairBlock(ModBlocks.CRIMSTONE.defaultBlockState(), properties.strength(2f).sound(SoundType.STONE)));
    public static final Block CRIMSTONE_SLAB = registerBlock("crimstone_slab", properties ->
            new SlabBlock(properties.strength(2f).sound(SoundType.STONE)));
    public static final Block CRIMSTONE_WALL = registerBlock("crimstone_wall", properties ->
            new WallBlock(properties.strength(2f).sound(SoundType.STONE)));
    public static final Block EBONSTONE = registerBlock("ebonstone", properties ->
            new Block(properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block EBONSTONE_WALL = registerBlock("ebonstone_wall", properties ->
            new WallBlock(properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block EBONSTONE_STAIRS = registerBlock("ebonstone_stairs", properties ->
            new StairBlock(ModBlocks.EBONSTONE.defaultBlockState(), properties.strength(2f).sound(SoundType.STONE)));
    public static final Block EBONSTONE_SLAB = registerBlock("ebonstone_slab", properties ->
            new SlabBlock(properties.strength(2f).sound(SoundType.STONE)));
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
            RotatedPillarBlock(properties.strength(2f).instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block STRIPPED_SHADEWOOD_LOG = registerBlock("stripped_shadewood_log", properties -> new
            RotatedPillarBlock(properties.strength(2f).instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block STRIPPED_SHADEWOOD = registerBlock("stripped_shadewood", properties -> new
            RotatedPillarBlock(properties.strength(2f).instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).ignitedByLava()));
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
            new PressurePlateBlock(BlockSetType.DARK_OAK, properties.strength(1f).noCollision().forceSolidOn().pushReaction(PushReaction.POPPED)));
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
    public static final Block BLUE_GRANITE_STAIRS = registerBlock("blue_granite_stairs", properties ->
            new StairBlock(ModBlocks.BLUE_GRANITE.defaultBlockState(), properties.strength(2f).explosionResistance(2f)));
    public static final Block BLUE_GRANITE_SLAB = registerBlock("blue_granite_slab", properties ->
            new SlabBlock(properties.strength(2f).explosionResistance(2f)));
    public static final Block BLUE_GRANITE_WALL = registerBlock("blue_granite_wall", properties ->
            new WallBlock(properties.strength(2f).explosionResistance(2f)));
    public static final Block EBONSAND = registerBlock("ebonsand", properties ->
            new SandBlock(new ColorRGBA(14406560), properties.strength(0.6f).sound(SoundType.SAND).instrument(NoteBlockInstrument.SNARE)));
    public static final Block CRIMSAND = registerBlock("crimsand", properties ->
            new SandBlock(new ColorRGBA(14406560), properties.strength(0.6f).sound(SoundType.SAND).instrument(NoteBlockInstrument.SNARE)));
    public static final Block SHIMMER_BLOCK = registerBlock("shimmer_block", properties ->
            new MagicBlock(properties.strength(1f)));
    public static final Block MARBLE = registerBlock("marble", properties ->
            new Block(properties.strength(2f)));
    public static final Block MARBLE_STAIRS = registerBlock("marble_stairs", properties ->
            new StairBlock(ModBlocks.MARBLE.defaultBlockState(), properties.strength(2f)));
    public static final Block MARBLE_SLAB = registerBlock("marble_slab", properties ->
            new SlabBlock(properties.strength(2f)));
    public static final Block MARBLE_WALL = registerBlock("marble_wall", properties ->
            new WallBlock(properties.strength(2f)));
    public static final Block PALLADIUM_ORE = registerBlock("palladium_ore", properties ->
            new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block PALLADIUM_DEEPSLATE_ORE = registerBlock("palladium_deepslate_ore", properties ->
            new DropExperienceBlock(UniformInt.of(3, 6), properties.strength(4f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block EMERALD_GEMSPARK_BLOCK = registerBlock("emerald_gemspark_block", properties -> new
            GemSparkBlock(properties.strength(2f).requiresCorrectToolForDrops().lightLevel(state -> state.getValue(GemSparkBlock.CLICKED) ? 10 : 0)));
    public static final Block Boreal_Planks = registerBlock("boreal_planks", properties -> new
            Block(properties.strength(1f)));

    public static final Block BOREAL_STAIRS = registerBlock("boreal_stairs", properties -> new
            StairBlock(ModBlocks.Boreal_Planks.defaultBlockState(), properties.strength(1f)));
    public static final Block BOREAL_SLAB = registerBlock("boreal_slab", properties -> new
            SlabBlock(properties.strength(1f)));
    public static final Block BOREAL_BUTTON = registerBlock("boreal_button", properties ->
            new ButtonBlock(BlockSetType.IRON, 40, properties.strength(1f).noCollision()));
    public static final Block BOREAL_PRESSURE_PLATE = registerBlock("boreal_pressure_plate", properties ->
            new PressurePlateBlock(BlockSetType.DARK_OAK, properties.strength(1f).noCollision().forceSolidOn().pushReaction(PushReaction.POPPED)));
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
    public static final Block CHLOROPHYTE_BRICK_WALL = registerBlock("chlorophyte_brick_wall", properties ->
            new WallBlock(properties.strength(2f)));
    public static final Block CHLOROPHYTE_BRICK_STAIRS = registerBlock("chlorophyte_brick_stairs", properties ->
            new StairBlock(ModBlocks.CHLOROPHYTE_BRICKS.defaultBlockState(), properties.strength(2f)));
    public static final Block CHLOROPHYTE_BRICK_SLAB = registerBlock("chlorophyte_brick_slab", properties ->
            new SlabBlock(properties.strength(2f)));
    public static final Block COBALT_BRICKS = registerBlock("cobalt_bricks", properties ->
            new Block(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final Block COBALT_BRICK_WALL = registerBlock("cobalt_brick_wall", properties ->
            new WallBlock(properties.strength(2f)));
    public static final Block COBALT_BRICK_STAIRS = registerBlock("cobalt_brick_stairs", properties ->
            new StairBlock(ModBlocks.COBALT_BRICKS.defaultBlockState(), properties.strength(2f)));
    public static final Block COBALT_BRICK_SLAB = registerBlock("cobalt_brick_slab", properties ->
            new SlabBlock(properties.strength(2f)));
    public static final Block COSMIC_EMBER_BRICKS = registerBlock("cosmic_ember_bricks", properties ->
            new Block(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block CRIMSTONE_BRICKS = registerBlock("crimstone_bricks", properties ->
            new CrimsonBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final Block CRIMSTONE_BRICK_STAIRS = registerBlock("crimstone_brick_stairs", properties ->
            new StairBlock(ModBlocks.CRIMSTONE_BRICKS.defaultBlockState(), properties.strength(2f)));
    public static final Block CRIMSTONE_BRICK_SLAB = registerBlock("crimstone_brick_slab", properties ->
            new SlabBlock(properties.strength(2f)));
    public static final Block CRIMSTONE_BRICK_WALL = registerBlock("crimstone_brick_wall", properties ->
            new WallBlock(properties.strength(2f)));
    public static final Block CRIMTANE_BRICKS = registerBlock("crimtane_bricks", properties ->
            new Block(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final Block CRIMTANE_BRICK_STAIRS = registerBlock("crimtane_brick_stairs", properties ->
            new StairBlock(ModBlocks.CRIMSTONE_BRICKS.defaultBlockState(), properties.strength(2f)));
    public static final Block CRIMTANE_BRICK_SLAB = registerBlock("crimtane_brick_slab", properties ->
            new SlabBlock(properties.strength(2f)));
    public static final Block CRIMTANE_BRICK_WALL = registerBlock("crimtane_brick_wall", properties ->
            new WallBlock(properties.strength(2f)));
    public static final Block CRYOCORE_BRICKS = registerBlock("cryocore_bricks", properties ->
            new Block(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block DARK_CELESTIAL_BRICKS = registerBlock("dark_celestial_bricks", properties ->
            new Block(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block HEAVENFORGED_BRICKS = registerBlock("heavenforged_bricks", properties ->
            new Block(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block LUMINITE_BRICKS = registerBlock("luminite_bricks", properties ->
            new Block(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block LUNAR_RUST_BRICKS = registerBlock("lunar_rust_bricks", properties ->
            new Block(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block MERCURY_BRICKS = registerBlock("mercury_bricks", properties ->
            new Block(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block DEMONITE_BRICKS = registerBlock("demonite_bricks", properties ->
            new Block(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block DEMONITE_BRICK_STAIRS = registerBlock("demonite_brick_stairs", properties ->
            new StairBlock(ModBlocks.DEMONITE_BRICKS.defaultBlockState(), properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block DEMONITE_BRICK_SLAB = registerBlock("demonite_brick_slab", properties ->
            new SlabBlock(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block DEMONITE_BRICK_WALL = registerBlock("demonite_brick_wall", properties ->
            new WallBlock(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block EBONSTONE_BRICKS = registerBlock("ebonstone_bricks", properties ->
            new Block(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block EBONSTONE_BRICK_STAIRS = registerBlock("ebonstone_brick_stairs", properties ->
            new StairBlock(ModBlocks.EBONSTONE_BRICKS.defaultBlockState(), properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block EBONSTONE_BRICK_SLAB = registerBlock("ebonstone_brick_slab", properties ->
            new SlabBlock(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block EBONSTONE_BRICK_WALL = registerBlock("ebonstone_brick_wall", properties ->
            new WallBlock(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final Block HALLOWED_BRICKS = registerBlock("hallowed_bricks", properties ->
            new Block(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final Block HALLOWED_BRICK_STAIRS = registerBlock("hallowed_brick_stairs", properties ->
            new StairBlock(ModBlocks.HALLOWED_BRICKS.defaultBlockState(), properties.strength(2f).requiresCorrectToolForDrops()));
    public static final Block HALLOWED_BRICK_SLAB = registerBlock("hallowed_brick_slab", properties ->
            new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()) );
    public static final Block HALLOWED_BRICK_WALL = registerBlock("hallowed_brick_wall", properties ->
            new WallBlock(properties.strength(2f).requiresCorrectToolForDrops()));
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
            new Block(properties.mapColor(MapColor.ICE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1F, 4.5F).sound(SoundType.GLASS)));
    public static final Block ICE_BRICK_STAIRS = registerBlock("ice_brick_stairs", properties ->
            new StairBlock(ModBlocks.ICE_BRICKS.defaultBlockState(), properties.mapColor(MapColor.ICE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1F, 4.5F).sound(SoundType.GLASS)));
    public static final Block ICE_BRICK_SLAB = registerBlock("ice_brick_slab", properties ->
            new SlabBlock(properties.mapColor(MapColor.ICE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1F, 4.5F).sound(SoundType.GLASS)));
    public static final Block ICE_BRICK_WALL = registerBlock("ice_brick_wall", properties ->
            new WallBlock(properties.mapColor(MapColor.ICE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1F, 4.5F).sound(SoundType.GLASS)));
    public static final Block IRIDESCENT_BRICKS = registerBlock("iridescent_bricks", properties ->
            new Block(properties.mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block IRIDESCENT_BRICK_STAIRS = registerBlock("iridescent_brick_stairs", properties ->
            new StairBlock(ModBlocks.IRIDESCENT_BRICKS.defaultBlockState(), properties.mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block IRIDESCENT_BRICK_SLAB = registerBlock("iridescent_brick_slab", properties ->
            new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block IRIDESCENT_BRICK_WALL = registerBlock("iridescent_brick_wall", properties ->
            new WallBlock(properties.mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
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
            new Block(properties.mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block METEORITE_BRICK_STAIRS = registerBlock("meteorite_brick_stairs", properties ->
            new StairBlock(ModBlocks.METEORITE_BRICKS.defaultBlockState(), properties.mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block METEORITE_BRICK_SLAB = registerBlock("meteorite_brick_slab", properties ->
            new SlabBlock(properties.mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block METEORITE_BRICK_WALL = registerBlock("meteorite_brick_wall", properties ->
            new WallBlock(properties.mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block MUDSTONE_BRICKS = registerBlock("mudstone_bricks", properties ->
            new Block(properties.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().sound(SoundType.MUD).strength(0.5F, 4.5F)));
    public static final Block MUDSTONE_BRICK_STAIRS = registerBlock("mudstone_brick_stairs", properties ->
            new StairBlock(ModBlocks.MUDSTONE_BRICKS.defaultBlockState(), properties.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().sound(SoundType.MUD).strength(0.5F, 4.5F)));
    public static final Block MUDSTONE_BRICK_SLAB = registerBlock("mudstone_brick_slab", properties ->
            new SlabBlock(properties.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().sound(SoundType.MUD).strength(0.5F, 4.5F)));
    public static final Block MUDSTONE_BRICK_WALL = registerBlock("mudstone_brick_wall", properties ->
            new WallBlock(properties.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().sound(SoundType.MUD).strength(0.5F, 4.5F)));
    public static final Block MYTHRIL_BRICKS = registerBlock("mythril_bricks", properties ->
            new Block(properties.requiresCorrectToolForDrops().strength(2f, 8.0f).mapColor(MapColor.COLOR_BLUE)));
    public static final Block MYTHRIL_BRICK_STAIRS = registerBlock("mythril_brick_stairs", properties ->
            new StairBlock(ModBlocks.MYTHRIL_BRICKS.defaultBlockState(), properties.requiresCorrectToolForDrops().strength(2f, 8.0f).mapColor(MapColor.COLOR_BLUE)));
    public static final Block MYTHRIL_BRICK_SLAB = registerBlock("mythril_brick_slab", properties ->
            new SlabBlock(properties.requiresCorrectToolForDrops().strength(2f, 8.0f).mapColor(MapColor.COLOR_BLUE)));
    public static final Block MYTHRIL_BRICK_WALL = registerBlock("mythril_brick_wall", properties ->
            new WallBlock(properties.requiresCorrectToolForDrops().strength(2f, 8.0f).mapColor(MapColor.COLOR_BLUE)));
    public static final Block OBSIDIAN_BRICKS = registerBlock("obsidian_bricks", properties ->
            new Block(properties.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final Block OBSIDIAN_BRICK_STAIRS = registerBlock("obsidian_brick_stairs", properties ->
            new StairBlock(ModBlocks.OBSIDIAN_BRICKS.defaultBlockState(), properties.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final Block OBSIDIAN_BRICK_SLAB = registerBlock("obsidian_brick_slab", properties ->
            new SlabBlock(properties.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final Block OBSIDIAN_BRICK_WALL = registerBlock("obsidian_brick_wall", properties ->
            new WallBlock(properties.mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
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
            new RotatedPillarBlock(properties.strength(1f).sound(SoundType.WOOD)));

    public static final Block HELIUM_MOSS = registerBlock("helium_moss", properties ->
            new Block(properties.strength(1f).sound(SoundType.MOSS)));
    public static final Block HELIUM_MOSS_CARPET = registerBlock("helium_moss_carpet", properties ->
            new MossyCarpetBlock(properties.strength(1f).sound(SoundType.MOSS)));
    public static final Block ARGON_MOSS = registerBlock("argon_moss", properties ->
            new Block(properties.strength(1f).sound(SoundType.MOSS)));
    public static final Block ARGON_MOSS_CARPET = registerBlock("argon_moss_carpet", properties ->
            new MossyCarpetBlock(properties.strength(1f).sound(SoundType.MOSS)));
    public static final Block KRYPTON_MOSS = registerBlock("krypton_moss", properties ->
            new Block(properties.strength(1f).sound(SoundType.MOSS)));
    public static final Block KRYPTON_MOSS_CARPET = registerBlock("krypton_moss_carpet", properties ->
            new MossyCarpetBlock(properties.strength(1f).sound(SoundType.MOSS)));
    public static final Block LAVA_MOSS = registerBlock("lava_moss", properties ->
            new Block(properties.strength(1f).sound(SoundType.MOSS)));
    public static final Block LAVA_MOSS_CARPET = registerBlock("lava_moss_carpet", properties ->
            new MossyCarpetBlock(properties.strength(1f).sound(SoundType.MOSS)));
    public static final Block DEATHWEED_CROP = registerBlockWithoutBlockitem("deathweed_crop", properties ->
            new DeathweedCropBlock(properties.noCollision().randomTicks().instabreak().sound(SoundType.CROP).pushReaction(PushReaction.POPPED)));
    public static final Block BLOOD_ORANGE_BUSH = registerBlockWithoutBlockitem("blood_orange_bush", properties ->
            new BloodOrangeBushBlock(properties.randomTicks().noCollision().noOcclusion().sound(SoundType.SWEET_BERRY_BUSH)));
    public static final Block BLUE_DUNGEON_BRICKS = registerBlock("blue_dungeon_bricks", properties ->
            new Block(properties.strength(5f).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final Block BLUE_DUNGEON_BRICK_STAIRS = registerBlock("blue_dungeon_brick_stairs", properties ->
            new StairBlock(ModBlocks.BLUE_DUNGEON_BRICKS.defaultBlockState(), properties.strength(5f).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final Block BLUE_DUNGEON_BRICK_SLAB = registerBlock("blue_dungeon_brick_slab", properties ->
            new SlabBlock(properties.strength(5f).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final Block BLUE_DUNGEON_BRICK_WALL = registerBlock("blue_dungeon_brick_wall", properties ->
            new WallBlock(properties.strength(5f).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final Block PINK_DUNGEON_BRICKS = registerBlock("pink_dungeon_bricks", properties ->
            new Block(properties.strength(5f).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final Block PINK_DUNGEON_BRICK_STAIRS = registerBlock("pink_dungeon_brick_stairs", properties ->
            new StairBlock(ModBlocks.PINK_DUNGEON_BRICKS.defaultBlockState(), properties.strength(5f).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final Block PINK_DUNGEON_BRICK_SLAB = registerBlock("pink_dungeon_brick_slab", properties ->
            new SlabBlock(properties.strength(5f).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final Block PINK_DUNGEON_BRICK_WALL = registerBlock("pink_dungeon_brick_wall", properties ->
            new WallBlock(properties.strength(5f).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final Block GREEN_DUNGEON_BRICKS = registerBlock("green_dungeon_bricks", properties ->
            new Block(properties.strength(5f).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final Block GREEN_DUNGEON_BRICK_STAIRS = registerBlock("green_dungeon_brick_stairs", properties ->
            new StairBlock(ModBlocks.GREEN_DUNGEON_BRICKS.defaultBlockState(), properties.strength(5f).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final Block GREEN_DUNGEON_BRICK_SLAB = registerBlock("green_dungeon_brick_slab", properties ->
            new SlabBlock(properties.strength(5f).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final Block GREEN_DUNGEON_BRICK_WALL = registerBlock("green_dungeon_brick_wall", properties ->
            new WallBlock(properties.strength(5f).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final Block HELLSTONE_ORE = registerBlock("hellstone_ore", properties ->
            new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block LIZAHARD_BRICKS = registerBlock("lizahard_bricks", properties ->
            new Block(properties.strength(3f).sound(SoundType.CINNABAR).requiresCorrectToolForDrops()));
    public static final Block LIZAHARD_BRICK_STAIRS = registerBlock("lizahard_brick_stairs", properties ->
            new StairBlock(ModBlocks.LIZAHARD_BRICKS.defaultBlockState(), properties.strength(3f).sound(SoundType.CINNABAR).requiresCorrectToolForDrops()));
    public static final Block LIZAHARD_BRICK_SLAB = registerBlock("lizahard_brick_slab", properties ->
            new SlabBlock(properties.strength(3f).sound(SoundType.CINNABAR).requiresCorrectToolForDrops()));
    public static final Block LIZAHARD_BRICK_WALL = registerBlock("lizahard_brick_wall", properties ->
            new WallBlock(properties.strength(3f).sound(SoundType.CINNABAR).requiresCorrectToolForDrops()));
    public static final Block PEARLSAND = registerBlock("pearlsand", properties ->
            new SandBlock(new ColorRGBA(14406560), properties.strength(1f).sound(SoundType.SAND)));
    public static final Block PEARLSTONE_BRICKS = registerBlock("pearlstone_bricks", properties ->
            new Block(properties.mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block PEARLSTONE_BRICK_STAIRS = registerBlock("pearlstone_brick_stairs", properties ->
            new StairBlock(ModBlocks.PEARLSTONE_BRICKS.defaultBlockState(), properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F))  );
    public static final Block PEARLSTONE_BRICK_SLAB = registerBlock("pearlstone_brick_slab",  properties ->
            new SlabBlock(properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block PEARLSTONE_BRICK_WALL = registerBlock("pearlstone_brick_wall", properties ->
            new WallBlock(properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block RAINCLOUD = registerBlock("raincloud", properties ->
            new Block(properties.strength(1f)));
    public static final Block RED_BRICK = registerBlock("red_brick", properties ->
            new Block(properties.strength(2f)));
    public static final Block RED_ICE = registerBlock("red_ice", properties ->
            new IceBlock(properties.strength(1f).friction(50)));
    public static final Block RICH_MAHOGANY_DOOR = registerBlock("rich_mahogany_door", properties ->
            new DoorBlock(BlockSetType.DARK_OAK, properties.sound(SoundType.WOOD).noOcclusion()));
    public static final Block RICH_MAHOGANY_LOG = registerBlock("rich_mahogany_log", properties ->
            new RotatedPillarBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final Block RICH_MAHOGANY_PLANKS = registerBlock("rich_mahogany_planks", properties ->
            new Block(properties.strength(1f).sound(SoundType.WOOD)));
    public static final Block RICH_MAHOGANY_SLAB = registerBlock("rich_mahogany_slab", properties ->
            new SlabBlock(properties.strength(1f).sound(SoundType.WOOD)));
    public static final Block RICH_MAHOGANY_STAIRS = registerBlock("rich_mahogany_stairs", properties ->
            new StairBlock(ModBlocks.RICH_MAHOGANY_PLANKS.defaultBlockState(), properties.sound(SoundType.WOOD).strength(1f)));
    public static final Block RICH_MAHOGANY_FENCE = registerBlock("rich_mahogany_fence", properties ->
            new FenceBlock(properties.strength(1f).sound(SoundType.WOOD)));
    public static final Block RICH_MAHOGANY_FENCE_GATE = registerBlock("rich_mahogany_fence_gate", properties ->
            new FenceGateBlock(WoodType.OAK, properties.strength(1f).sound(SoundType.WOOD)));
    public static final Block RICH_MAHOGANY_BUTTON = registerBlock("rich_mahogany_button", properties ->
            new ButtonBlock(BlockSetType.DARK_OAK, 20, properties.strength(1f).sound(SoundType.WOOD).noOcclusion().noCollision()));
    public static final Block RICH_MAHOGANY_PRESSURE_PLATE = registerBlock("rich_mahogany_pressure_plate", properties ->
            new PressurePlateBlock(BlockSetType.DARK_OAK, properties.sound(SoundType.WOOD).strength(1f).noCollision().noOcclusion()));
    public static final Block SILVER_DEEPSLATE_ORE = registerBlock("silver_deepslate_ore", properties ->
            new DropExperienceBlock(UniformInt.of(3, 6), properties.strength(4f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block SILVER_ORE = registerBlock("silver_ore", properties ->
            new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block SNOW_BRICKS = registerBlock("snow_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block SUNPLATE_BLOCK = registerBlock("sunplate_block", properties ->
            new Block(properties.strength(2f)));
    public static final Block ADAMANTITE_BEAM = registerBlock("adamantite_beam", properties ->
            new GlazedTerracottaBlock(properties.strength(1f)));
    public static final Block AMBER_GEMSPARK_BLOCK = registerBlock("amber_gemspark_block", properties -> new
            GemSparkBlock(properties.strength(2f).requiresCorrectToolForDrops().lightLevel(state -> state.getValue(GemSparkBlock.CLICKED) ? 10 : 0)));
    public static final Block AMBER_STONE = registerBlock("amber_stone", properties ->
            new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(2f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block AMETHYST_GEMSPARK_BLOCK = registerBlock("amethyst_gemspark_block", properties -> new
            GemSparkBlock(properties.strength(2f).requiresCorrectToolForDrops().lightLevel(state -> state.getValue(GemSparkBlock.CLICKED) ? 10 : 0)));
    public static final Block ANCIENT_BLUE_BRICKS = registerBlock("ancient_blue_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block ANCIENT_COBALT_BRICKS = registerBlock("ancient_cobalt_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block ANCIENT_COPPER_BRICKS = registerBlock("ancient_copper_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block ANCIENT_GOLD_BRICKS = registerBlock("ancient_gold_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block ANCIENT_GREEN_BRICKS = registerBlock("ancient_green_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block ANCIENT_HELLSTONE_BRICKS = registerBlock("ancient_hellstone_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block ANCIENT_MYTHRIL_BRICKS = registerBlock("ancient_mythril_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block ANCIENT_OBSIDIAN_BRICKS = registerBlock("ancient_obsidian_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block ANCIENT_PINK_BRICKS = registerBlock("ancient_pink_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block ARGON_MOSS_BRICK = registerBlock("argon_moss_brick", properties ->
            new Block(properties.strength(2f).sound(SoundType.MOSS)));
    public static final Block ASH_WOOD = registerBlock("ash_wood", properties ->
            new RotatedPillarBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final Block ASPHALT = registerBlock("asphalt", properties ->
            new AsphaltBlock(properties.strength(2f)));
    public static final Block COPPER_BRICKS = registerBlock("copper_bricks", properties ->
            new RotatedPillarBlock(properties.strength(2f)));
    public static final Block CRACKED_BLUE_DUNGEON_BRICKS = registerBlock("cracked_blue_dungeon_bricks", properties ->
            new Block(properties.strength(0.1f).pushReaction(PushReaction.POPPED).sound(SoundType.CALCITE).instabreak()));
    public static final Block CRACKED_GREEN_DUNGEON_BRICKS = registerBlock("cracked_green_dungeon_bricks", properties ->
            new Block(properties.strength(0.1f).pushReaction(PushReaction.POPPED).sound(SoundType.CALCITE).instabreak()));
    public static final Block CRACKED_PINK_DUNGEON_BRICKS = registerBlock("cracked_pink_dungeon_bricks", properties ->
            new Block(properties.strength(0.1f).pushReaction(PushReaction.POPPED).sound(SoundType.CALCITE).instabreak()));
    public static final Block EBONWOOD_LOG = registerBlock("ebonwood_log", properties ->
            new RotatedPillarBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final Block EBONWOOD_PLANKS = registerBlock("ebonwood_planks", properties ->
            new Block(properties.strength(2f).sound(SoundType.WOOD)));
    public static final Block EBONWOOD_STAIRS = registerBlock("ebonwood_stairs", properties ->
            new StairBlock(ModBlocks.EBONWOOD_PLANKS.defaultBlockState(), properties.strength(2f).sound(SoundType.WOOD))    );
    public static final Block EBONWOOD_SLAB = registerBlock("ebonwood_slab", properties ->
            new SlabBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final Block EBONWOOD_BUTTON = registerBlock("ebonwood_button", properties ->
            new ButtonBlock(BlockSetType.DARK_OAK, 20, properties.strength(2f).noCollision().noOcclusion().sound(SoundType.WOOD)));
    public static final Block EBONWOOD_PRESSURE_PLATE = registerBlock("ebonwood_pressure_plate", properties ->
            new PressurePlateBlock(BlockSetType.DARK_OAK,properties.strength(2f).noCollision().noOcclusion().sound(SoundType.WOOD)));
    public static final Block EBONWOOD_FENCE = registerBlock("ebonwood_fence", properties ->
            new FenceBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final Block EBONWOOD_FENCE_GATE = registerBlock("ebonwood_fence_gate", properties ->
            new FenceGateBlock(WoodType.DARK_OAK ,properties.strength(2f).sound(SoundType.WOOD)));
    public static final Block EBONWOOD_DOOR = registerBlock("ebonwood_door", properties ->
            new DoorBlock(BlockSetType.DARK_OAK, properties.strength(2f).sound(SoundType.WOOD).noOcclusion()));
    public static final Block EBONWOOD_TRAPDOOR = registerBlock("ebonwood_trapdoor", properties ->
            new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(2f).sound(SoundType.WOOD).noOcclusion()))  ;
    public static final Block GOLD_BRICKS = registerBlock("gold_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block GOTHIC_BRICKS = registerBlock("gothic_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block HELIUM_MOSS_BRICK = registerBlock("helium_moss_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block IRON_BRICKS = registerBlock("iron_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block KRYPTON_MOSS_BRICK = registerBlock("krypton_moss_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block LAVA_MOSS_BRICK = registerBlock("lava_moss_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block LEAD_BRICKS = registerBlock("lead_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block MIDNIGHT_CONFETTI_BLOCK = registerBlock("midnight_confetti_block", properties ->
            new Block(properties.strength(2f)));
    public static final Block PLATINUM_BRICKS = registerBlock("platinum_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block RICH_MAHOGANY_TRAPDOOR = registerBlock("rich_mahogany_trapdoor", properties ->
            new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(2f).sound(SoundType.WOOD).noOcclusion()))  ;
    public static final Block SILVER_BRICKS = registerBlock("silver_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block TIN_BRICKS = registerBlock("tin_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block HELLSTONE_FORGE = registerBlock("hellstone_forge", properties ->
            new HellstoneForgeBlock(properties.strength(2f).noOcclusion()));
    public static final Block BLINKROOT = registerBlock("blinkroot", properties ->
            new FlowerBlock(MobEffects.GLOWING, 70.f, properties.sound(SoundType.GRASS).noOcclusion().noCollision().instabreak().pushReaction(PushReaction.POPPED).mapColor(MapColor.PLANT)));
    public static final Block CRIMSON_CACTUS = registerBlock("crimson_cactus", properties ->
            new CactusBlock(properties.strength(0.5f).sound(SoundType.CACTUS_FLOWER)));
    public static final Block CRIMSANDSTONE = registerBlock("crimsandstone", properties ->
            new Block(properties.strength(1f).sound(SoundType.SAND)));
    public static final Block CRIMSON_GRASS = registerBlock("crimson_grass", properties ->
            new GrassBlock(properties.strength(1f).sound(SoundType.GRASS)));
    public static final Block CRIMSON_DIRT = registerBlock("crimson_dirt", properties ->
            new Block(properties.strength(1f)));
    public static final Block CRYSTAL_SHARD = registerBlockWithoutBlockitem("crystal_shard", properties ->
            new Block(properties.strength(1f).sound(SoundType.LARGE_AMETHYST_BUD)) );
    public static final Block SHADEWOOD_SAPLING = registerBlock("shadewood_sapling", properties ->
            new SaplingBlock(ModTreeGrowers.SHADEWOOD, properties.instabreak().noCollision().randomTicks().sound(SoundType.GRASS).pushReaction(PushReaction.POPPED)));
    public static final Block POTTED_SHADEWOOD_SAPLING = registerBlockWithoutBlockitem("potted_shadewood_sapling", properties ->
            new FlowerPotBlock(SHADEWOOD_SAPLING, properties.instabreak().noOcclusion().pushReaction(PushReaction.POPPED)));
    public static final Block ASH_WOOD_PLANKS = registerBlock("ash_wood_planks", properties ->
            new Block(properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BOREAL_SAPLING = registerBlock("boreal_sapling", properties ->
            new SaplingBlock(ModTreeGrowers.BOREAL, properties.instabreak().noCollision().randomTicks().sound(SoundType.GRASS).pushReaction(PushReaction.POPPED)));
    public static final Block POTTED_BOREAL_SAPLING = registerBlockWithoutBlockitem("potted_boreal_sapling", properties ->
            new FlowerPotBlock(BOREAL_SAPLING, properties.instabreak().noOcclusion().pushReaction(PushReaction.POPPED)));
    public static final Block XENON_MOSS_BRICKS = registerBlock("xenon_moss_bricks", properties ->
            new PortalBlock(properties.strength(2f).sound(SoundType.MOSS)));
    public static final Block TUNGSTEN_BRICKS = registerBlock("tungsten_bricks", properties ->
            new Block(properties.strength(2f)));
    public static final Block ASH_STAIRS = registerBlock("ash_stairs", properties ->
            new StairBlock(ModBlocks.ASH_WOOD_PLANKS.defaultBlockState(), properties.strength(2f).sound(SoundType.WOOD))    );
    public static final Block ASH_SLAB = registerBlock("ash_slab", properties ->
            new SlabBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final Block ASH_BUTTON = registerBlock("ash_button", properties ->
            new ButtonBlock(BlockSetType.DARK_OAK, 20, properties.strength(2f).noCollision().noOcclusion().sound(SoundType.WOOD)));
    public static final Block ASH_PRESSURE_PLATE = registerBlock("ash_pressure_plate", properties ->
            new PressurePlateBlock(BlockSetType.DARK_OAK,properties.strength(2f).noCollision().noOcclusion().sound(SoundType.WOOD)));
    public static final Block ASH_FENCE = registerBlock("ash_fence", properties ->
            new FenceBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final Block ASH_FENCE_GATE = registerBlock("ash_fence_gate", properties ->
            new FenceGateBlock(WoodType.DARK_OAK ,properties.strength(2f).sound(SoundType.WOOD)));
    public static final Block ASH_DOOR = registerBlock("ash_door", properties ->
            new DoorBlock(BlockSetType.DARK_OAK, properties.strength(2f).sound(SoundType.WOOD).noOcclusion()));
    public static final Block ASH_TRAPDOOR = registerBlock("ash_trapdoor", properties ->
            new TrapDoorBlock(BlockSetType.DARK_OAK, properties.strength(2f).sound(SoundType.WOOD).noOcclusion()))  ;
    public static final Block BLOODY_ANDESITE  =registerBlock("bloody_andesite", properties ->
            new Block(properties.mapColor(MapColor.FIRE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block BLOODY_ANDESITE_STAIRS = registerBlock("bloody_andesite_stairs", properties ->
            new StairBlock(ModBlocks.BLOODY_ANDESITE.defaultBlockState(), properties.mapColor(MapColor.FIRE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block BLOODY_ANDESITE_SLAB = registerBlock("bloody_andesite_slab", properties ->
            new SlabBlock(properties.mapColor(MapColor.FIRE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block BLOODY_ANDESITE_WALL = registerBlock("bloody_andesite_wall", properties ->
            new WallBlock(properties.mapColor(MapColor.FIRE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CRIMSON_GRANITE  =registerBlock("crimson_granite", properties ->
            new Block(properties.mapColor(MapColor.FIRE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CRIMSON_GRANITE_STAIRS = registerBlock("crimson_granite_stairs", properties ->
            new StairBlock(ModBlocks.CRIMSON_GRANITE.defaultBlockState(), properties.mapColor(MapColor.FIRE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CRIMSON_GRANITE_SLAB = registerBlock("crimson_granite_slab", properties ->
            new SlabBlock(properties.mapColor(MapColor.FIRE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CRIMSON_GRANITE_WALL = registerBlock("crimson_granite_wall", properties ->
            new WallBlock(properties.mapColor(MapColor.FIRE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CRIMSON_TALL_GRASS = registerBlock("crimson_tall_grass", properties ->
            new DoublePlantBlock(properties.mapColor(MapColor.PLANT).replaceable().noCollision().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.POPPED)));
    public static final Block DEEPCRIMSTONE = registerBlock("deepcrimstone", properties ->
            new Block(properties.mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final Block DEEPCRIMSTONE_STAIRS = registerBlock("deepcrimstone_stairs", properties ->
            new StairBlock(ModBlocks.DEEPCRIMSTONE.defaultBlockState(), properties.mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final Block DEEPCRIMSTONE_SLAB = registerBlock("deepcrimstone_slab", properties ->
            new SlabBlock(properties.mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final Block DEEPCRIMSTONE_WALL  =registerBlock("deepcrimstone_wall", properties ->
            new WallBlock(properties.mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final Block EBONSANDSTONE = registerBlock("ebonsandstone", properties ->
            new Block(properties.mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block EYE_FLOWER = registerBlock("eye_flower", properties ->
            new FlowerBlock(MobEffects.BLINDNESS, 0.5f, properties.mapColor(MapColor.PLANT).noCollision().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.POPPED)));
    public static final Block EYE_FLOWER_POTTED = registerBlock("eye_flower_potted", properties ->
            new FlowerPotBlock(EYE_FLOWER, properties.instabreak().noOcclusion().pushReaction(PushReaction.POPPED)));
    public static final Block STRIPPED_BOREAL_LOG = registerBlock("stripped_boreal_log", properties ->
            new RotatedPillarBlock(properties.instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block STRIPPED_BOREAL_WOOD = registerBlock("stripped_boreal_wood", properties ->
            new RotatedPillarBlock(properties.instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BOREAL_WOOD = registerBlock("boreal_wood", properties ->
            new RotatedPillarBlock(properties.instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block PEARLWOOD_LOG = registerBlock("pearlwood_log", properties ->
            new RotatedPillarBlock(properties.instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block PEARLWOOD = registerBlock("pearlwood", properties ->
            new RotatedPillarBlock(properties.instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block PEARLWOOD_PLANKS = registerBlock("pearlwood_planks", properties ->
            new Block(properties.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block PEARLWOOD_STAIRS = registerBlock("pearlwood_stairs", properties ->
            new StairBlock(ModBlocks.PEARLWOOD_PLANKS.defaultBlockState(), properties.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block PEARLWOOD_SLAB = registerBlock("pearlwood_slab", properties ->
            new SlabBlock(properties.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block PEARLWOOD_BUTTON = registerBlock("pearlwood_button", properties ->
            new ButtonBlock(BlockSetType.DARK_OAK, 20, properties.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block PEARLWOOD_PRESSURE_PLATE = registerBlock("pearlwood_pressure_plate", properties ->
            new PressurePlateBlock(BlockSetType.DARK_OAK, properties.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block PEARLWOOD_FENCE = registerBlock("pearlwood_fence", properties ->
            new FenceBlock(properties.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block PEARLWOOD_FENCE_GATE = registerBlock("pearlwood_fence_gate", properties ->
            new FenceGateBlock(WoodType.DARK_OAK, properties.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block PEARLSANDSTONE = registerBlock("pearlsandstone", properties ->
            new Block(properties.mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    public static final Block PEARLSTONE = registerBlock("pearlstone", properties ->
            new Block(properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block PEARLSTONE_STAIRS = registerBlock("pearlstone_stairs", properties ->
            new StairBlock(ModBlocks.PEARLSTONE.defaultBlockState(), properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block PEARLSTONE_SLAB = registerBlock("pearlstone_slab", properties ->
             new SlabBlock(properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block PEARLSTONE_WALL = registerBlock("pearlstone_wall", properties ->
            new WallBlock(properties.mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block PALMWOOD_LEAVES = registerBlock("palmwood_leaves", properties ->
            new UntintedParticleLeavesBlock(0.01f,   ParticleTypes.PALE_OAK_LEAVES, AmbientLeavesBlockSoundPlayer.noAmbientSound(),  properties
                    .mapColor(MapColor.PLANT).strength(0.2F).randomTicks().sound(SoundType.LEAF_LITTER).noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never).ignitedByLava().pushReaction(PushReaction.POPPED).isRedstoneConductor(Blocks::never)));
    public static final Block PINK_ICE = registerBlock("pink_ice", properties -> new
            IceBlock(properties.mapColor(MapColor.ICE).friction(0.98F).randomTicks().strength(0.5F).sound(SoundType.GLASS).noOcclusion().isRedstoneConductor(Blocks::never)));
    public static final Block OBSIDIAN_BED = registerBlock("obsidian_bed", properties ->
            new BedBlock(DyeColor.BLACK, properties.mapColor(MapColor.COLOR_BLACK).sound(SoundType.WOOD).strength(0.2F).bounceRestitution(0.75F).noOcclusion().ignitedByLava().pushReaction(PushReaction.POPPED)));






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