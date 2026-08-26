package com.krithenmc.unnamedmod.datagen;

import com.krithenmc.unnamedmod.block.ModBlocks;
import com.krithenmc.unnamedmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.BLUE_MOSS);
        dropSelf(ModBlocks.RED_MOSS);
        dropSelf(ModBlocks.PURPLE_MOSS);
        dropSelf(ModBlocks.CYAN_MOSS);
        dropSelf(ModBlocks.CRIMSTONE);
        dropSelf(ModBlocks.EBONSTONE);
        dropSelf(ModBlocks.SHADEWOOD_LOG);
        dropSelf(ModBlocks.SHADEWOOD_PLANK);
        dropSelf(ModBlocks.BLUE_GRANITE);
        dropSelf(ModBlocks.EBONSAND);
        dropSelf(ModBlocks.CRIMSAND);
        dropSelf(ModBlocks.MARBLE);
        dropSelf(ModBlocks.SHADEWOOD_STAIRS);
        dropSelf(ModBlocks.SHADEWOOD_BUTTON);
        dropSelf(ModBlocks.SHADEWOOD_PRESSURE_PLATE);
        dropSelf(ModBlocks.SHADEWOOD_FENCE);
        dropSelf(ModBlocks.SHADEWOOD_FENCE_GATE);
        dropSelf(ModBlocks.EBONSTONE_WALL);
        dropSelf(ModBlocks.SHADEWOOD_TRAPDOOR);
        dropSelf(ModBlocks.EMERALD_GEMSPARK_BLOCK);
        dropSelf(ModBlocks.BOREAL_STAIRS);
        dropSelf(ModBlocks.Boreal_Planks);
        dropSelf(ModBlocks.BOREAL_BUTTON);
        dropSelf(ModBlocks.BOREAL_PRESSURE_PLATE);
        dropSelf(ModBlocks.BOREAL_FENCE);
        dropSelf(ModBlocks.BOREAL_FENCE_GATE);
        dropSelf(ModBlocks.BOREAL_TRAPDOOR);
        dropSelf(ModBlocks.BOREAL_WOOD_LOG);


        add(ModBlocks.ADAMANTITE_ORE, createOreDrop(ModBlocks.ADAMANTITE_ORE, ModItems.RAW_ADAMANTITE));
        add(ModBlocks.ADAMANTITE_DEEPSLATE_ORE, createOreDrop(ModBlocks.ADAMANTITE_DEEPSLATE_ORE, ModItems.RAW_ADAMANTITE));
        add(ModBlocks.COBALT_ORE, createOreDrop(ModBlocks.COBALT_ORE, ModItems.RAW_COBALT));
        add(ModBlocks.COBALT_DEEPSLATE_ORE, createOreDrop(ModBlocks.COBALT_DEEPSLATE_ORE, ModItems.RAW_COBALT));
        add(ModBlocks.CRIMTANE_ORE, createOreDrop(ModBlocks.CRIMTANE_ORE, ModItems.RAW_CRIMTANE));
        add(ModBlocks.CRIMTANE_DEEPSLATE_ORE, createOreDrop(ModBlocks.CRIMTANE_DEEPSLATE_ORE, ModItems.RAW_CRIMTANE));
        add(ModBlocks.DEMONITE_ORE, createOreDrop(ModBlocks.DEMONITE_ORE, ModItems.RAW_DEMONITE));
        add(ModBlocks.DEMONITE_EBONSTONE_ORE, createOreDrop(ModBlocks.DEMONITE_EBONSTONE_ORE, ModItems.RAW_DEMONITE));
        add(ModBlocks.DEMONITE_DEEPSLATE_ORE, createOreDrop(ModBlocks.DEMONITE_DEEPSLATE_ORE, ModItems.RAW_DEMONITE));
        add(ModBlocks.LEAD_DEEPSLATE_ORE, createOreDrop(ModBlocks.LEAD_DEEPSLATE_ORE, ModItems.RAW_LEAD));
        add(ModBlocks.LEAD_ORE, createOreDrop(ModBlocks.LEAD_ORE, ModItems.RAW_LEAD));
        add(ModBlocks.CHLOROPHYTE_ORE, createOreDrop(ModBlocks.CHLOROPHYTE_ORE, ModItems.RAW_CHLOROPHYTE));
        add(ModBlocks.MYTHRIL_ORE, createOreDrop(ModBlocks.MYTHRIL_ORE, ModItems.RAW_MYTHRIL));
        add(ModBlocks.MYTHRIL_DEEPSLATE_ORE, createOreDrop(ModBlocks.MYTHRIL_DEEPSLATE_ORE, ModItems.RAW_MYTHRIL));
        add(ModBlocks.METEORITE_ORE, createOreDrop(ModBlocks.METEORITE_ORE, ModItems.METEORITE));
        add(ModBlocks.ORICHALCUM_ORE, createOreDrop(ModBlocks.ORICHALCUM_ORE, ModItems.RAW_ORICHALCUM));
        add(ModBlocks.ORICHALCUM_DEEPSLATE_ORE, createOreDrop(ModBlocks.ORICHALCUM_DEEPSLATE_ORE, ModItems.RAW_ORICHALCUM));
        add(ModBlocks.CHLOROPHYTE_DEEPSLATE_ORE, createMultipleOreDrops(ModBlocks.CHLOROPHYTE_DEEPSLATE_ORE, ModItems.RAW_CHLOROPHYTE, 2, 4));
        add(ModBlocks.SHADEWOOD_LEAVES, createLeavesDrops(ModBlocks.SHADEWOOD_LEAVES, ModBlocks.ADAMANTITE_DEEPSLATE_ORE,3));
        add(ModBlocks.LUMINITE_ORE, createOreDrop(ModBlocks.LUMINITE_ORE, ModItems.RAW_LUMINITE));
        add(ModBlocks.SHIMMER_BLOCK, createSilkTouchOnlyTable(ModBlocks.SHIMMER_BLOCK));
        add(ModBlocks.PALLADIUM_ORE, createOreDrop(ModBlocks.PALLADIUM_ORE, ModItems.RAW_PALLADIUM));
        add(ModBlocks.PALLADIUM_DEEPSLATE_ORE, createOreDrop(ModBlocks.PALLADIUM_DEEPSLATE_ORE, ModItems.RAW_PALLADIUM));
        add(ModBlocks.SHADEWOOD_SLAB, this::createSlabItemTable);
        add(ModBlocks.SHADEWOOD_DOOR, this::createDoorTable);
        add(ModBlocks.BOREAL_SLAB, this::createSlabItemTable);
        add(ModBlocks.BOREAL_DOOR, this::createDoorTable);
        ;


    }
    public LootTable.Builder createMultipleOreDrops(final Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                block,
                (LootPoolEntryContainer.Builder<?>)this.applyExplosionDecay(
                        block,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }
}
