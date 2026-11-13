package com.krithenmc.unnamedmod.datagen;

import com.krithenmc.unnamedmod.entities.ModEntities;
import com.krithenmc.unnamedmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricEntityLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.EnchantedCountIncreaseFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemKilledByPlayerCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.concurrent.CompletableFuture;

public class ModEntitiesLootTableProvider extends FabricEntityLootSubProvider {
    public ModEntitiesLootTableProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate() {
        this.add(ModEntities.ANTLION,
                LootTable.lootTable().withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.ANTLION_MANDIBLE)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2)))
                                .apply(EnchantedCountIncreaseFunction.lootingMultiplier(this.registries, UniformGenerator.between(2.0f, 3.0f)))
                                .when(LootItemKilledByPlayerCondition.killedByPlayer()))));

        this.add(ModEntities.SWARMER,
                LootTable.lootTable().withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.ANTLION_MANDIBLE)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2)))
                                .apply(EnchantedCountIncreaseFunction.lootingMultiplier(this.registries, UniformGenerator.between(2.0f, 3.0f)))
                                .when(LootItemKilledByPlayerCondition.killedByPlayer()))));

        this.add(ModEntities.DEMON_EYE,
                LootTable.lootTable().withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(0.3f))
                        .add(LootItem.lootTableItem(ModItems.LENS)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2)))
                                .apply(EnchantedCountIncreaseFunction.lootingMultiplier(this.registries, UniformGenerator.between(1, 2)))
                                .when(LootItemKilledByPlayerCondition.killedByPlayer()))));


        this.add(ModEntities.GREEN_EYE,
                LootTable.lootTable().withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(0.3f))
                        .add(LootItem.lootTableItem(ModItems.LENS)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2)))
                                .apply(EnchantedCountIncreaseFunction.lootingMultiplier(this.registries, UniformGenerator.between(1, 2)))
                                .when(LootItemKilledByPlayerCondition.killedByPlayer()))));

    }
}
