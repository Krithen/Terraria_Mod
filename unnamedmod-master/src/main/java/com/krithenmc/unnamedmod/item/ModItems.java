package com.krithenmc.unnamedmod.item;


import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.block.ModBlocks;
import com.krithenmc.unnamedmod.consumables.ModConsumables;
import com.krithenmc.unnamedmod.food.ModFoods;

import com.krithenmc.unnamedmod.item.custom.*;

import net.fabricmc.fabric.api.item.v1.FabricItem;

import net.minecraft.core.Registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.TooltipDisplay;


import net.minecraft.world.item.equipment.ArmorType;


import java.util.function.Consumer;
import java.util.function.Function;



public class ModItems extends Item.Properties {
    public static class Properties implements FabricItem

            .Properties {

    }



    public static final Item ADAMANTITE_BAR = registerItem("adamantite_bar", properties -> new
            Item(properties.fireResistant().rarity(Rarity.RARE)));
    public static final Item RAW_ADAMANTITE = registerItem("raw_adamantite", properties -> new
            Item(properties.fireResistant().rarity(Rarity.RARE)));
    public static final Item AMBER = registerItem("amber", Item::new);
    public static final Item CHLOROPHYTE_BAR = registerItem("chlorophyte_bar", properties -> new
            Item(properties.rarity(Rarity.EPIC).fireResistant()));
    public static final Item COBALT_BAR = registerItem("cobalt_bar", properties -> new
            Item(properties.fireResistant().rarity(Rarity.RARE)));
    public static final Item CRIMTANE_BAR = registerItem("crimtane_bar", properties -> new
            Item(properties.rarity(Rarity.UNCOMMON)));
    public static final Item DEMONITE_BAR = registerItem("demonite_bar", properties -> new
            Item(properties.rarity(Rarity.UNCOMMON)));
    public static final Item HALLOWED_BAR = registerItem("hallowed_bar", properties -> new
            Item(properties.rarity(Rarity.RARE).fireResistant()));
    public static final Item HELLSTONE = registerItem("hellstone", properties -> new
            Item(properties.rarity(Rarity.UNCOMMON).fireResistant()));
    public static final Item HELLSTONE_BAR = registerItem("hellstone_bar", properties -> new
            Item(properties.rarity(Rarity.UNCOMMON).fireResistant()));
    public static final Item LEAD_BAR = registerItem("lead_bar", properties -> new
            Item(properties.rarity(Rarity.COMMON).fireResistant()));
    public static final Item LUMINITE_BAR = registerItem("luminite_bar", properties -> new
            Item(properties.fireResistant().rarity(Rarity.EPIC)));
    public static final Item METEORITE = registerItem("meteorite", Item::new);
    public static final Item METEORITE_BAR = registerItem("meteorite_bar", Item::new);
    public static final Item MYTHRIL_BAR = registerItem("mythril_bar", properties -> new
            Item(properties.rarity(Rarity.RARE).fireResistant()));
    public static final Item ORICHALCUM_BAR = registerItem("orichalcum_bar", properties -> new
            Item(properties.fireResistant().rarity(Rarity.RARE).enchantable(100)));
    public static final Item PALLADIUM_BAR = registerItem("palladium_bar", properties -> new
            Item(properties.fireResistant().rarity(Rarity.RARE)));
    public static final Item PLATINUM_BAR = registerItem("platinum_bar", Item::new);
    public static final Item RAW_CHLOROPHYTE = registerItem("raw_chlorophyte", properties -> new
            Item(properties.rarity(Rarity.EPIC).fireResistant()));
    public static final Item RAW_COBALT = registerItem("raw_cobalt", properties -> new
            Item(properties.rarity(Rarity.RARE).fireResistant()));
    public static final Item RAW_CRIMTANE = registerItem("raw_crimtane", Item::new);
    public static final Item RAW_DEMONITE = registerItem("raw_demonite", Item::new);
    public static final Item RAW_LEAD = registerItem("raw_lead", Item::new);
    public static final Item RAW_LUMINITE = registerItem("raw_luminite", properties -> new
            Item(properties.rarity(Rarity.EPIC).fireResistant()));
    public static final Item RAW_MYTHRIL = registerItem("raw_mythril", properties -> new
            Item(properties.rarity(Rarity.RARE).fireResistant()));
    public static final Item RAW_ORICHALCUM = registerItem("raw_orichalcum", properties -> new
            Item(properties.rarity(Rarity.RARE).fireResistant()));
    public static final Item RAW_PALLADIUM = registerItem("raw_palladium", properties -> new
            Item(properties.rarity(Rarity.RARE).fireResistant()));
    public static final Item RAW_SILVER = registerItem("raw_silver", Item::new);
    public static final Item RUBY = registerItem("ruby", Item::new);
    public static final Item SAPPHIRE = registerItem("sapphire", Item::new);
    public static final Item SHROOMITE_BAR = registerItem("shroomite_bar", properties -> new Item(properties.rarity(Rarity.EPIC).fireResistant())) ;
    public static final Item SILVER_BAR = registerItem("silver_bar", Item::new);
    public static final Item SPECTRE_BAR = registerItem("spectre_bar", properties -> new
            Item(properties.rarity(Rarity.EPIC).fireResistant()));
    public static final Item TIN_BAR = registerItem("tin_bar", Item::new);
    public static final Item TITANIUM_BAR = registerItem("titanium_bar", properties -> new
            Item(properties.rarity(Rarity.RARE).fireResistant()));
    public static final Item TOPAZ = registerItem("topaz", Item::new);
    public static final Item TUNGSTEN_BAR = registerItem("tungsten_bar", Item::new);
    public static final Item ECTOPLASM = registerItem("ectoplasm", Item::new);
    public static final Item GLOWING_MUSHROOM = registerItem("glowing_mushroom", Item::new);
    public static final Item WOODEN_HAMMER = registerItem("wooden_hammer", properties -> new
            HammerItem(ToolMaterial.WOOD, 0, -3.5f, properties));
    public static final Item APRICOT = registerItem("apricot", properties -> new
            Item(properties.food(ModFoods.APRICOT, ModConsumables.APRICOT_CONSUMABLE)));
    public static final Item BANANUH = registerItem("banana", properties -> new
            Item(properties.food(ModFoods.BANANUH, ModConsumables.BANANUH_CONSUMABLE)) {
                @Override
                public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                    builder.accept(Component.translatable("tooltip.unnamedmod.bananuh"));
                    super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                }
            });
    public static final Item GEL = registerItem("gel", Item::new);
    public static final Item JOJA_COLA = registerItem("joja_cola", properties -> new
            Item(properties.food(ModFoods.JOJA_COLA, ModConsumables.JOJA_COLA_CONSUMABLE)) {
                @Override
                public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                    builder.accept(Component.translatable("tooltip.unnamedmod.joja_cola"));


                    super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                }
            });
    public static final Item BLACKCURRANT = registerItem("blackcurrant", properties -> new
            Item(properties.food(ModFoods.BLACKCURRANT, ModConsumables.BLACKCURRANT_CONSUMABLE)));
    public static final Item BLOOD_ORANGE = registerItem("blood_orange", properties -> new
            BlockItem(ModBlocks.BLOOD_ORANGE_BUSH, properties.food(ModFoods.BLOOD_ORANGE, ModConsumables.BLOOD_ORANGE_CONSUMABLE).useItemDescriptionPrefix()));
    public static final Item ACORN = registerItem("acorn", Item::new);
    public static final Item UMBRAL_CRYSTAL = registerItem("umbral_crystal", Item::new);
    public static final Item UMBRAL_PLATE = registerItem("umbral_plate", Item::new);
    public static final Item LIGHTS_BANE = registerItem("lights_bane", properties -> new
            Item(properties.sword(ModToolMaterials.DEMONITE, 12, -0.4f)));
    public static final Item NIGHTMARE_PICKAXE = registerItem("nightmare_pickaxe", properties -> new
            Item(properties.pickaxe(ModToolMaterials.DEMONITE, 5, -1.4f)){
                @Override
                public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                    builder.accept(Component.translatable("tooltip.unnamedmod.nightmare_pickaxe"));
                    super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                }
            });
    public static final Item NIGHTMARE_SHOVEL = registerItem("nightmare_shovel", properties -> new
            ShovelItem(ModToolMaterials.DEMONITE, 1, -1.4f, properties));
    public static final Item WAR_AXE_OF_THE_NIGHT = registerItem("war_axe_of_the_night", properties -> new
            AxeItem(ModToolMaterials.DEMONITE, 16, -3.0f, properties));
    public static final Item GUNGNIR = registerItem("gungnir", properties -> new
            Item(properties.spear(ModToolMaterials.HALLOWED, 0.95f, 5f, 0.1f, 1.5f, 20f, 7f, 6f, 20f, 2f)));
    public static final Item CORRUPTED_STICK = registerItem("corrupted_stick", Item::new);
    public static final Item SOUL_OF_NIGHT = registerItem("soul_of_night", properties -> new
            Item(properties) {
                @Override
                public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                    builder .accept(Component.translatable("tooltip.unnamedmod.soul_of_night"));
                    super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                }
            });

    public static final Item BLOOD_BUTCHERER = registerItem("blood_butcherer", properties -> new
            Item(properties.sword(ModToolMaterials.CRIMTANE, 18, -0.8f)));
    public static final Item BLEEDING_STICK = registerItem("bleeding_stick", Item::new);
    public static final Item NIGHTS_EDGE = registerItem("nights_edge", properties -> new
            Item(properties.sword(ModToolMaterials.NIGHTS_EDGE, 40, -0.8f)) );
    public static final Item THE_VOLCANO = registerItem("the_volcano", properties -> new
            Item(properties.sword(ModToolMaterials.HELLSTONE, 40, -3)) {
                @Override
                public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                    builder.accept(Component.translatable("tooltip.unnamedmod.the_volcano"));
                    super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                }
            });
    public static final Item ADVANCED_HELLSTONE_SWORD = registerItem("advanced_hellstone_sword", properties -> new
            Item(properties.sword(ModToolMaterials.HELLSTONE, 12, -3)) {
                @Override
                public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                    builder.accept(Component.translatable("tooltip.unnamedmod.advanced_hellstone_sword"));
                    super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                }
            });
    public static final Item BASIC_HELLSTONE_SWORD = registerItem("basic_hellstone_sword", properties -> new
            Item(properties.sword(ModToolMaterials.HELLSTONE, 8, -3)) {
                @Override
                public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                    builder.accept(Component.translatable("tooltip.unnamedmod.basic_hellstone_sword"));
                    super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                }
            });
    public static final Item STINGER = registerItem("stinger", Item::new);
    public static final Item JUNGLE_SPORES = registerItem("jungle_spores", properties -> new
            Item(properties.food(ModFoods.JUNGLE_SPORES, ModConsumables.JUNGLE_SPORES_CONSUMABLE)));

    public static final Item THE_BREAKER = registerItem("the_breaker", properties -> new
            HammerItem(ModToolMaterials.DEMONITE, 20, -3.5f, properties));
    public static final Item SHADOW_SCALE = registerItem("shadow_scale", Item::new);
    public static final Item DEMONITE_PLATING = registerItem("demonite_plating", Item::new);
    public static final Item GOLD_SHORTSWORD = registerItem("gold_shortsword", properties -> new
            ShortSwordItem(properties.sword(ToolMaterial.GOLD, 12, 0)));
    public static final Item SOUL_OF_MIGHT = registerItem("soul_of_might", properties -> new
            Item(properties) {
                @Override
                public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                    builder.accept(Component.translatable("tooltip.unnamedmod.soul_of_might"));
                    super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                }
            });
    public static final Item SOUL_OF_SIGHT = registerItem("soul_of_sight", properties -> new
            Item(properties) {
                @Override
                public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                    builder.accept(Component.translatable("tooltip.unnamedmod.soul_of_sight"));
                    super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                }
            });
    public static final Item BLADE_OF_GRASS = registerItem("blade_of_grass", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.NOTCRAFTED, 17, -0.5f)));
    public static final Item MURAMASA = registerItem("muramasa", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.NOTCRAFTED, 24, 0.4f)));
    public static final Item IRON_BROADSWORD = registerItem("iron_broadsword", properties -> new
            ShortSwordItem(properties.sword(ToolMaterial.IRON, 10, -2.4f)));
    public static final Item AREADBHAR = registerItem("areadbhar", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.NOTCRAFTED, 35, -1.4f)));
    public static final Item BEE_KEEPER = registerItem("bee_keeper", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.BEE, 29, -0.4f)));
    public static final Item CANDY_CANE_SWORD = registerItem("candy_cane_sword", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.CANDYCANE, 18, -2.0f)));
    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten", Item::new);
    public static final Item EXOTIC_SCIMITAR = registerItem("exotic_scimitar", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.NOTCRAFTED, 19, -0.4f)));
    public static final Item ICE_BLADE = registerItem("ice_blade", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.ICE, 17, 0.6f)));
    public static final Item TERRARIA_KATANA = registerItem("terraria_katana", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.NOTCRAFTED, 17, -1)));
    public static final Item PURPLE_CLUBBERFISH = registerItem("purple_clubberfish", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.NOTCRAFTED, 34, -2)));
    public static final Item TENTACLE_SPIKE = registerItem("tentacle_spike", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.NOTCRAFTED, 19, -1)));
    public static final Item IRON_SHORTSWORD = registerItem("iron_shortsword", properties -> new
            ShortSwordItem(properties.sword(ToolMaterial.IRON, 6, -1.4f)));
    public static final Item LEAD_SHORTSWORD = registerItem("lead_shortsword", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.LEAD, 7, -1.4f)));
    public static final Item SILVER_SHORTSWORD = registerItem("silver_shortsword", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.SILVER, 7, -1.4f)));
    public static final Item TIN_SHORTSWORD = registerItem("tin_shortsword", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.TIN, 5, -1.4f)));
    public static final Item TUNGSTEN_SHORTSWORD = registerItem("tungsten_shortsword", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.TUNGSTEN, 9, -1.4f)));
    public static final Item STARFURY = registerItem("starfury", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.NOTCRAFTED, 24, -2)));
    public static final Item CORRUPT_SEEDS = registerItem("corrupt_seeds", Item::new);
    public static final Item COCONUT = registerItem("coconut", properties -> new
            Item(properties.food(ModFoods.COCONUT, ModConsumables.COCONUT)));
    public static final Item CRIMSON_TIGERFISH = registerItem("crimson_tigerfish", properties -> new
            Item(properties.food(ModFoods.CRIMSON_TIGERFISH, ModConsumables.CRIMSON_TIGERFISH)));
    public static final Item PALLADIUM_SWORD = registerItem("palladium_sword", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.PALLADIUM, 48, -1.4f)));
    public static final Item ICE_SICKLE = registerItem("ice_sickle", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.ICE, 49, -1.4f)));
    public static final Item BONE_SWORD = registerItem("bone_sword", properties -> new
            ShortSwordItem(properties.sword(ModToolMaterials.BONE, 18, -1.4f)));
    public static final Item BRAND_OF_THE_INFERNO = registerItem("brand_of_the_inferno", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.NOTCRAFTED, 94, -1.4f)));
    public static final Item COBALT_SWORD = registerItem("cobalt_sword", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.COBALT, 39, -1.4f)));
    public static final Item FROSTBRAND = registerItem("frostbrand", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.ICE, 48, -1.4f)));
    public static final Item BONE_PICKAXE = registerItem("bone_pickaxe", properties ->
            new ShortSwordItem(properties.pickaxe(ModToolMaterials.BONE, 7, -1.4f)) {
                @Override
                public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                    builder.accept(Component.translatable("tooltip.unnamedmod.bone_pickaxe"));
                    super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                }
            });
    public static final Item RAW_TITANUM = registerItem("raw_titanium", Item::new);
    public static final Item RAW_TIN = registerItem("raw_tin", Item::new);
    public static final Item CACTUS_PICKAXE = registerItem("cactus_pickaxe", properties ->
            new ShortSwordItem(properties.pickaxe(ModToolMaterials.CACTUS, 3, -1.4f)));
    public static final Item FOSSIL_PICKAXE = registerItem("fossil_pickaxe", properties ->
            new ShortSwordItem(properties.pickaxe(ModToolMaterials.FOSSIL, 7, -1.4f)));
    public static final Item LEAD_PICKAXE = registerItem("lead_pickaxe", properties ->
            new ShortSwordItem(properties.pickaxe(ModToolMaterials.LEAD, 5, -1.4f)));
    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.MYTHRIL, 49, -1.4f)));
    public static final Item ORICHALCUM_SWORD = registerItem("orichalcum_sword", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.ORICHALCUM, 58, -1.4f)));
    public static final Item MAGIC_MIRROR = registerItem("magic_mirror", MirrorItem::new);
    public static final Item CHERRY = registerItem("cherry", properties ->
            new Item(properties.food(ModFoods.CHERRY, ModConsumables.CHERRY)));
    public static final Item COBALT_PICKAXE = registerItem("cobalt_pickaxe", properties ->
            new ShortSwordItem(properties.pickaxe(ModToolMaterials.COBALT, 9, -1.4f)));
    public static final Item DEATHBRINGER_PICKAXE = registerItem("deathbringer_pickaxe", properties ->
            new ShortSwordItem(properties.pickaxe(ModToolMaterials.CRIMTANE, 11, -1.4f)));
    public static final Item ELDERBERRY = registerItem("elderberry", properties ->
            new Item(properties.food(ModFoods.ELDERBERRY, ModConsumables.ELDERBERRY)));
    public static final Item FUSED_VERTEBRA = registerItem("fused_vertebra", Item::new);
    public static final Item GLADIUS = registerItem("gladius", properties ->
            new Item(properties.sword(ModToolMaterials.NOTCRAFTED, 14, -1.2f)) {
                @Override
                public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                    builder.accept(Component.translatable("tooltip.unnamedmod.gladius"));
                    super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                }
            });
    public static final Item GRAPEFRUIT = registerItem("grapefruit", properties ->
            new Item(properties.food(ModFoods.GRAPEFRUIT, ModConsumables.GRAPEFRUIT)));
    public static final Item HAMBURGER = registerItem("hamburger", properties ->
            new Item(properties.food(ModFoods.HAMBURGER, ModConsumables.HAMBURGER)));
    public static final Item LEMON = registerItem("lemon", properties ->
            new Item(properties.food(ModFoods.LEMON, ModConsumables.LEMON)));
    public static final Item LENS = registerItem("lens", Item::new);
    public static final Item MANGO = registerItem("mango", properties ->
            new Item(properties.food(ModFoods.MANGO, ModConsumables.MANGO)));
    public static final Item MARSHMALLOW = registerItem("marshmallow", properties ->
            new Item(properties.food(ModFoods.MARSHMALLOW, ModConsumables.MARSHMALLOW)));
    public static final Item MOLTEN_PICKAXE = registerItem("molten_pickaxe", properties ->
            new ShortSwordItem(properties.pickaxe(ModToolMaterials.HELLSTONE, 11, -1.4f)));
    public static final Item MUSHROOM = registerItem("mushroom", Item::new);
    public static final Item SHADOW_HELMET = registerItem("shadow_helmet", properties ->
            new TerrariaArmorItems(properties.humanoidArmor(ModArmorMaterials.DEMONITE_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item SHADOW_SCALEMAIL = registerItem("shadow_scalemail", properties ->
            new TerrariaArmorItems(properties.humanoidArmor(ModArmorMaterials.DEMONITE_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item SHADOW_GREAVES = registerItem("shadow_greaves", properties ->
            new TerrariaArmorItems(properties.humanoidArmor(ModArmorMaterials.DEMONITE_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item SHADOW_SABATONS = registerItem("shadow_sabatons", properties ->
            new TerrariaArmorItems(properties.humanoidArmor(ModArmorMaterials.DEMONITE_ARMOR_MATERIAL, ArmorType.BOOTS)));
    public static final Item DEMON_BOW = registerItem("demon_bow", properties ->
            new TerrariaBowItem(properties.durability(5000)));
    public static final Item ADAMANTITE_SWORD = registerItem("adamantite_sword", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.ADAMANTITE, 60, -1.4f)));
    public static final Item DEATHWEED_SEEDS = registerItem("deathweed_seeds", properties ->
            new BlockItem(ModBlocks.DEATHWEED_CROP, properties.useItemDescriptionPrefix()));
    public static final Item DEATHWEED = registerItem("deathweed", Item::new);
    public static final Item BEAM_SWORD = registerItem("beam_sword", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.NOTCRAFTED, 51, -1.4f)));










    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name)))));


    }


    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }

    public static void registerModItems() {
        Unnamedmod.LOGGER.info("Registering mod items for" + Unnamedmod.MOD_ID);
    }

}
