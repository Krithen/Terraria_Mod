package com.krithenmc.unnamedmod.datagen;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.predicates.ItemPredicate;
import net.minecraft.advancements.triggers.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementsProvider extends FabricAdvancementProvider {
    public ModAdvancementsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    public void generateAdvancement(HolderLookup.Provider registries, Consumer<AdvancementHolder> output) {
        var items = registries.lookupOrThrow(Registries.ITEM);
        var blocks = registries.lookupOrThrow(Registries.BLOCK);

        AdvancementHolder root = Advancement.Builder.advancement()
                .rootDisplay(
                        ModItems.TIN_BAR,
                        Component.translatable("advancements.unnamedmod.root.title"),
                        Component.translatable("advancements.unnamedmod.root.description"),
                        Identifier.withDefaultNamespace("gui/advancements/backgrounds/adventure"),
                        AdvancementType.TASK,
                        false,
                        false,
                        false
                )
                .addCriterion("has_tin", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.TIN_BAR)))
                .save(output, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "unnamedmod/root"));

        AdvancementHolder getLead = Advancement.Builder.advancement()
                .parent(root)
                .display(
                        ModItems.LEAD_BAR,
                        Component.translatable("advancements.unnamedmod.get_lead.title"),
                        Component.translatable("advancements.unnamedmod.get_lead.description"),
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("has_lead", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.LEAD_BAR)))
                .save(output, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "unnamedmod/get_lead"));

        AdvancementHolder getLeadShortSword = Advancement.Builder.advancement()
                .parent(getLead)
                .display(
                        ModItems.LEAD_SHORTSWORD,
                        Component.translatable("advancements.unnamedmod.get_lead_shortsword.title"),
                        Component.translatable("advancements.unnamedmod.get_lead_shortsword.description"),
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("has_lead_shortsword", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.LEAD_SHORTSWORD)))
                .save(output, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "unnamedmod/get_lead_shortsword"));

        AdvancementHolder getLeadPickaxe = Advancement.Builder.advancement()
                .parent(getLead)
                .display(
                        ModItems.LEAD_PICKAXE,
                        Component.translatable("advancements.unnamedmod.get_lead_pickaxe.title"),
                        Component.translatable("advancements.unnamedmod.get_lead_pickaxe.description"),
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("has_lead_pickaxe", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.LEAD_PICKAXE)))
                .save(output, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID,  "unnamedmod/get_lead_pickaxe"));

        AdvancementHolder getLeadBroadSword = Advancement.Builder.advancement()
                .parent(getLead)
                .display(
                        ModItems.LEAD_BROADSWORD,
                        Component.translatable("advancements.unnamedmod.get_lead_broadsword.title"),
                        Component.translatable("advancements.unnamedmod.get_lead_broadsword.description"),
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("has_lead_broadsword", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.LEAD_BROADSWORD)))
                .save(output, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "unnamedmod/get_lead_broadsword"));

        AdvancementHolder getTungsten = Advancement.Builder.advancement()
                .parent(getLead)
                .display(
                        ModItems.TUNGSTEN_BAR,
                        Component.translatable("advancements.unnamedmod.get_tungsten.title"),
                        Component.translatable("advancements.unnamedmod.get_tungsten.description"),
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("has_tungsten", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.TUNGSTEN_BAR)))
                .save(output, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "unnamedmod/has_tungsten"));

        AdvancementHolder getSilver = Advancement.Builder.advancement()
                .parent(getLead)
                .display(
                        ModItems.SILVER_BAR,
                        Component.translatable("advancements.unnamedmod.get_silver.title"),
                        Component.translatable("advancements.unnamedmod.get_silver.description"),
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion("has_silver", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.SILVER_BAR)))
                .save(output,Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "unnamedmod/has_silver"));
    }
}
