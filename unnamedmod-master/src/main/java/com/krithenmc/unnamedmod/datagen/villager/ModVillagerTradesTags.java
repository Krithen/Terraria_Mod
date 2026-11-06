package com.krithenmc.unnamedmod.datagen.villager;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagEntry;
import net.minecraft.tags.VillagerTradeTags;
import net.minecraft.world.item.trading.VillagerTrade;
import net.minecraft.world.item.trading.VillagerTrades;

import java.util.concurrent.CompletableFuture;

public class ModVillagerTradesTags extends FabricTagsProvider<VillagerTrade> {

    public ModVillagerTradesTags(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, Registries.VILLAGER_TRADE, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        getOrCreateRawBuilder(VillagerTradeTags.FARMER_LEVEL_1)
                .add(TagEntry.element(ModVillagerTrades.FARMER_1_EMERALD_BANANUH.identifier()))
                .add(TagEntry.element(ModVillagerTrades.FARMER_1_SAND_COCONUT.identifier()));

        getOrCreateRawBuilder(VillagerTradeTags.FARMER_LEVEL_2)
                .add(TagEntry.element(ModVillagerTrades.FARMER_2_EMERALD_MANGO.identifier()));

        getOrCreateRawBuilder(VillagerTradeTags.WEAPONSMITH_LEVEL_4)
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_4_EMERALD_BLOOD_BUTCHERER.identifier()));

        getOrCreateRawBuilder(VillagerTradeTags.BUTCHER_LEVEL_4)
                .add(TagEntry.element(ModVillagerTrades.BUTCHER_4_EMERALD_HAMBURGER.identifier()));
    }
}
