package com.krithenmc.unnamedmod.loot;

import com.krithenmc.unnamedmod.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.FabricLootTableBuilder;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProvider;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

import static net.minecraft.world.level.storage.loot.LootPool.lootPool;

public class ModLootTablesModifier {
    public static void modifyLootTables(ResourceKey<LootTable> key, FabricLootTableBuilder builder,
                                        LootTableSource tableSource, HolderLookup.Provider provider)  {
        if(key.identifier().equals(Identifier.withDefaultNamespace("blocks/short_grass"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(0.25f))
                    .add(LootItem.lootTableItem(ModItems.DEATHWEED_SEEDS))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(1, 2)).build());

            builder.pool(poolBuilder.build());
        }

        if (key.identifier().equals(Identifier.withDefaultNamespace("entities/slime"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(1f))
                    .add(LootItem.lootTableItem(ModItems.GEL))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(3, 5)));

            builder.pool(poolBuilder.build());
        }
    }
}
