package com.krithenmc.unnamedmod.datagen.villager;


import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.TradeCost;
import net.minecraft.world.item.trading.VillagerTrade;
import net.minecraft.world.level.block.Blocks;

public class ModVillagerTrades {
    public static final ResourceKey<VillagerTrade> FARMER_1_EMERALD_BANANUH = createKey("farmer/1/emerald_bananuh");
    public static final ResourceKey<VillagerTrade> FARMER_1_SAND_COCONUT = createKey("farmer/1/sand_coconut");

    public static final ResourceKey<VillagerTrade> FARMER_2_EMERALD_MANGO = createKey("farmer/1/emerald_mango");

    public static final ResourceKey<VillagerTrade> WEAPONSMITH_4_EMERALD_BLOOD_BUTCHERER = createKey("weaponsmith/4/emerald_blood_butcherer");
    public static final ResourceKey<VillagerTrade> BUTCHER_4_EMERALD_HAMBURGER = createKey("butcher/4/emerald_hamburger");

    public static void bootstrap(BootstrapContext<VillagerTrade> context) {
        var items = context.lookup(Registries.ITEM);
        var enchantments = context.lookup(Registries.ENCHANTMENT);

        context.register(FARMER_1_EMERALD_BANANUH, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 4),
                new ItemStackTemplate(ModItems.BANANUH),
                12, 8, 0.05f).build());

        context.register(FARMER_1_SAND_COCONUT, VillagerTrade.builder(
                new TradeCost(Blocks.SAND, 3),
                new ItemStackTemplate(ModItems.COCONUT),
                30, 8, 0.05f).build());

        context.register(FARMER_2_EMERALD_MANGO, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 5),
                new ItemStackTemplate(ModItems.MANGO),
                12, 8, 0.05f).build());

        context.register(WEAPONSMITH_4_EMERALD_BLOOD_BUTCHERER, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 30),
                new ItemStackTemplate(ModItems.BLOOD_BUTCHERER),
                1, 8, 0.05f).build());

        context.register(BUTCHER_4_EMERALD_HAMBURGER, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 4),
                new ItemStackTemplate(ModItems.HAMBURGER, 2),
                12, 8, 0.05f).build());
    }

    private static ResourceKey<VillagerTrade> createKey(String name) {
        return ResourceKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name));
    }
}
