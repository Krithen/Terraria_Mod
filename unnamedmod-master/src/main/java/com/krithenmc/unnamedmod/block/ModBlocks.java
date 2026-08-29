package com.krithenmc.unnamedmod.block;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.block.custom.CrimsonBlock;
import com.krithenmc.unnamedmod.block.custom.EmeraldGemSparkBlock;
import com.krithenmc.unnamedmod.block.custom.MagicBlock;
import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.impl.datagen.client.SoundTypeBuilderImpl;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.references.BlockItemIds;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.util.ColorRGBA;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
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
            new DoorBlock(BlockSetType.DARK_OAK, properties.strength(1f)));
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
            new DoorBlock(BlockSetType.DARK_OAK, properties.strength(1f)));
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
    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, Component... tooltips) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name))));
        registerBlockItem(name, toRegister, tooltips);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name), toRegister);

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
}