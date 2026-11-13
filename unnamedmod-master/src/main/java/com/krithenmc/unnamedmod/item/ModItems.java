package com.krithenmc.unnamedmod.item;


import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.block.ModBlocks;
import com.krithenmc.unnamedmod.consumables.ModConsumables;
import com.krithenmc.unnamedmod.entities.ModEntities;
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
import net.minecraft.world.level.levelgen.structure.templatesystem.loader.DirectoryTemplateSource;


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
            HammerItem(properties.sword(ToolMaterial.WOOD, 0, -1.4f)));
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
            ShortSwordItem(properties.sword(ModToolMaterials.HALLOWED, 60, -1.4f)));
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
            HammerItem(properties.sword(ModToolMaterials.DEMONITE, 20, -1.4f)));
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
            new AerialBaneItem(properties.durability(1000), 10, 10, 60000, 6.0f));
    public static final Item ADAMANTITE_SWORD = registerItem("adamantite_sword", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.ADAMANTITE, 60, -1.4f)));
    public static final Item DEATHWEED_SEEDS = registerItem("deathweed_seeds", properties ->
            new BlockItem(ModBlocks.DEATHWEED_CROP, properties.useItemDescriptionPrefix()));
    public static final Item DEATHWEED = registerItem("deathweed", Item::new);
    public static final Item BEAM_SWORD = registerItem("beam_sword", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.NOTCRAFTED, 51, -1.4f)));
    public static final Item CACTUS_BROADSWORD = registerItem("cactus_broadsword", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.CACTUS, 9, -1.4f)));
    public static final Item COPPER_BROADSWORD = registerItem("copper_broadsword", properties ->
            new ShortSwordItem(properties.sword(ToolMaterial.COPPER, 5, -1.4f)));
    public static final Item CUTLASS = registerItem("cutlass", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.NOTCRAFTED, 52, -1.4f)));
    public static final Item GOLD_BROADSWORD = registerItem("gold_broadsword", properties ->
            new ShortSwordItem(properties.sword(ToolMaterial.GOLD, 11, -1.4f)));
    public static final Item IRON_BROADSWORD = registerItem("iron_broadsword", properties ->
            new ShortSwordItem(properties.sword(ToolMaterial.IRON, 8, -1.4f)));
    public static final Item LEAD_BROADSWORD = registerItem("lead_broadsword", properties ->
            new ShortSwordItem(properties.sword(ToolMaterial.IRON, 12, -1.4f)));
    public static final Item PLATINUM_BROADSWORD = registerItem("platinum_broadsword", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.PLATINUM, 15, -1.4f)));
    public static final Item PLATINUM_PICKAXE = registerItem("platinum_pickaxe", properties ->
            new ShortSwordItem(properties.pickaxe(ModToolMaterials.PLATINUM, 6, -1.4f)));
    public static final Item RULER = registerItem("ruler", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.NOTCRAFTED, 11, -1.4f)));
    public static final Item SILVER_BROADSWORD = registerItem("silver_broadsword", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.SILVER, 13, -1.4f)));
    public static final Item SILVER_PICKAXE = registerItem("silver_pickaxe", properties ->
            new ShortSwordItem(properties.pickaxe(ModToolMaterials.SILVER, 5, -1.4f)));
    public static final Item SUSPICIOUS_LOOKING_EYE = registerItem("suspicious_looking_eye", SuspiciousEyeItem::new);
    public static final Item TIN_BROADSWORD = registerItem("tin_broadsword", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.TIN, 9, 1.4f)));
    public static final Item TIN_PICKAXE = registerItem("tin_pickaxe", properties ->
            new ShortSwordItem(properties.pickaxe(ModToolMaterials.TIN, 4, -1.4f)));
    public static final Item TISSUE_SAMPLE = registerItem("tissue_sample", Item::new);
    public static final Item TITANIUM_SWORD = registerItem("titanium_sword", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.TITANIUM, 60, -1.4f)));
    public static final Item TUNGSTEN_BROADSWORD = registerItem("tungsten_broadsword", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.TUNGSTEN, 13, -1.4f)));
    public static final Item TUNGSTEN_PICKAXE = registerItem("tungsten_pickaxe", properties ->
            new ShortSwordItem(properties.pickaxe(ModToolMaterials.TUNGSTEN, 5, -1.4f)));
    public static final Item TRUE_EXCALIBUR = registerItem("true_excalibur", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.HALLOWED, 71, -1.4f)));
    public static final Item TRUE_NIGHTS_EDGE = registerItem("true_nights_edge", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.NIGHTS_EDGE, 69, -1.4f)));
    public static final Item TIN_AXE = registerItem("tin_axe", properties ->
            new ShortSwordItem(properties.axe(ModToolMaterials.TIN, 3, -2f)));
    public static final Item LEAD_AXE = registerItem("lead_axe", properties ->
            new ShortSwordItem(properties.axe(ModToolMaterials.LEAD, 5, -2f)));
    public static final Item SILVER_AXE = registerItem("silver_axe", properties ->
            new ShortSwordItem(properties.axe(ModToolMaterials.SILVER, 5, -2f)));
    public static final Item TUNGSTEN_AXE = registerItem("tungsten_axe", properties ->
            new ShortSwordItem(properties.axe(ModToolMaterials.TUNGSTEN, 6, -2f)));
    public static final Item PLATINUM_AXE = registerItem("platinum_axe", properties ->
            new ShortSwordItem(properties.axe(ModToolMaterials.PLATINUM, 6, -2f)));
    public static final Item STARDUST_HAMAXE = registerItem("stardust_hamaxe", properties ->
            new HammerItem(properties.axe(ModToolMaterials.STARDUST, 59, -2f)));
    public static final Item VORTEX_HAMAXE = registerItem("vortex_hamaxe", properties ->
            new HammerItem(properties.axe(ModToolMaterials.VORTEX, 59, -2f)));
    public static final Item NEBULA_HAMAXE = registerItem("nebula_hamaxe", properties ->
            new HammerItem(properties.axe(ModToolMaterials.NEBULA, 59, -2f)));
    public static final Item SOLAR_HAMAXE = registerItem("solar_hamaxe", properties ->
            new HammerItem(properties.axe(ModToolMaterials.SOLAR, 59, -2f)));
    public static final Item ADAMANTITE_GLAIVE = registerItem("adamantite_glaive", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.ADAMANTITE, 48, -1.4f)));
    public static final Item CHLOROPHYTE_PARTISAN = registerItem("chlorophyte_partisan", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.CHLOROPHYTE, 48 , -1.4f)));
    public static final Item COBALT_NAGINATA = registerItem("cobalt_naginata", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.COBALT, 43, -1.4f)));
    public static final Item DARK_LANCE = registerItem("dark_lance", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.NOTCRAFTED, 33, -1.4f)));
    public static final Item GHASTLY_GLAIVE = registerItem("ghastly_glaive", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.NOTCRAFTED, 44, -1.4f)));
    public static final Item BOTANICAL_PIERCER = registerItem("botanical_piercer", properties ->
    new ShortSwordItem(properties.sword(ModToolMaterials.NOTCRAFTED, 79, -1.4f))    );
    public static final Item COPPER_HAMMER = registerItem("copper_hammer", properties ->
            new HammerItem(properties.sword(ToolMaterial.COPPER, 3, -2.4f)));
    public static final Item CHLOROPHYTE_GREATHAMMER = registerItem("chlorophyte_greathammer", properties ->
            new HammerItem(properties.sword(ModToolMaterials.CHLOROPHYTE, 79, -2.4f)));
    public static final Item FLESH_GRINDER = registerItem("flesh_grinder", properties ->
            new HammerItem(properties.sword(ModToolMaterials.CRIMTANE, 22, -2.4f)));
    public static final Item GOLDEN_HAMMER = registerItem("golden_hammer", properties ->
            new HammerItem(properties.sword(ToolMaterial.GOLD, 8, -2.4f)));
    public static final Item HAEMORRHAXE = registerItem("haemorrhaxe", properties ->
            new HammerItem(properties.axe(ModToolMaterials.NOTCRAFTED, 29, -2.4f)));
    public static final Item HAMMUSH = registerItem("hammush", properties ->
            new HammerItem(properties.sword(ModToolMaterials.NOTCRAFTED, 25, -2.4f)));
    public static final Item IRON_HAMMER = registerItem("iron_hammer", properties ->
            new HammerItem(properties.sword(ToolMaterial.IRON, 6, -2.4f)));
    public static final Item LEAD_HAMMER = registerItem("lead_hammer", properties ->
            new HammerItem(properties.sword(ModToolMaterials.LEAD, 7, -2.4f)));
    public static final Item METEOR_HAMAXE = registerItem("meteor_hamaxe", properties ->
            new HammerItem(properties.axe(ModToolMaterials.NOTCRAFTED, 19, -2.4f)));
    public static final Item MOLTEN_HAMAXE = registerItem("molten_hamaxe", properties ->
            new HammerItem(properties.axe(ModToolMaterials.HELLSTONE, 19, -2.4f)));
    public static final Item PLATINUM_HAMMER = registerItem("platinum_hammer", properties ->
            new HammerItem(properties.sword(ModToolMaterials.PLATINUM, 9, -2.4f)));
    public static final Item PWNHAMMER = registerItem("pwnhammer", properties ->
            new HammerItem(properties.sword(ModToolMaterials.HALLOWED, 25, -2.4f)));
    public static final Item SILVER_HAMMER = registerItem("silver_hammer", properties ->
            new HammerItem(properties.sword(ModToolMaterials.SILVER, 8, -2.4f)));
    public static final Item TIN_HAMMER = registerItem("tin_hammer", properties ->
            new HammerItem(properties.sword(ModToolMaterials.TIN, 5, -2.4f)));
    public static final Item TUNGSTEN_HAMMER = registerItem("tungsten_hammer", properties ->
            new HammerItem(properties.sword(ModToolMaterials.TUNGSTEN, 8, -2.4f)));
    public static final Item ADAMANTITE_WARAXE = registerItem("adamantite_waraxe", properties ->
            new ShortSwordItem(properties.axe(ModToolMaterials.ADAMANTITE, 42, -1.4f)));
    public static final Item CHLOROPHYTE_GREATAXE = registerItem("chlorophyte_greataxe", properties ->
            new ShortSwordItem(properties.axe(ModToolMaterials.CHLOROPHYTE, 69, -1.4f)));
    public static final Item ANCIENT_CLOTH = registerItem("ancient_cloth", Item::new);
    public static final Item APPLE_PIE = registerItem("apple_pie", properties ->
            new Item(properties.food(ModFoods.APPLE_PIE, ModConsumables.APPLE_PIE)));
    public static final Item BACON = registerItem("bacon", properties ->
            new Item(properties.food(ModFoods.BACON, ModConsumables.BACON)));
    public static final Item BARBEQUE_RIBS = registerItem("barbeque_ribs", properties ->
            new Item(properties.food(ModFoods.BARBEQUE_RIBS, ModConsumables.BARBEQUE_RIBS)));
    public static final Item BLACK_LENS = registerItem("black_lens", Item::new);
    public static final Item BUCKET_OF_MILKSHAKE = registerItem("bucket_of_milkshake", properties ->
            new Item(properties.food(ModFoods.BUCKET_OF_MILKSHAKE, ModConsumables.BUCKET_OF_MILKSHAKE)));
    public static final Item CREAM_SODA = registerItem("cream_soda", properties ->
            new Item(properties.food(ModFoods.CREAM_SODA, ModConsumables.CREAM_SODA)));
    public static final Item CRIMSON_CRATE = registerItem("crimson_crate", Item::new);
    public static final Item CRYSTAL_SHARD = registerItem("crystal_shard", Item::new);
    public static final Item CURSED_FLAMES = registerItem("cursed_flames", properties ->
            new Item(properties.fireResistant()));
    public static final Item DIVINE_CRATE = registerItem("divine_crate", properties ->
            new DivineCrateItem(properties.stacksTo(1)));
    public static final Item ANTLION_SPAWN_EGG = registerItem("antlion_spawn_egg", properties ->
            new SpawnEggItem(properties.spawnEgg(ModEntities.ANTLION)));
    public static final Item SWARMER_SPAWN_EGG = registerItem("swarmer_spawn_egg", properties ->
            new SpawnEggItem(properties.spawnEgg(ModEntities.SWARMER)));
    public static final Item ANTLION_MANDIBLE = registerItem("antlion_mandible", Item::new);
    public static final Item DEMON_EYE_SPAWN_EGG = registerItem("demon_eye_spawn_egg", properties ->
            new SpawnEggItem(properties.spawnEgg(ModEntities.DEMON_EYE)));
    public static final Item ORICHALCUM_WARAXE = registerItem("orichalcum_waraxe", properties ->
            new ShortSwordItem(properties.axe(ModToolMaterials.ORICHALCUM, 41, -2f)));
    public static final Item GREEN_EYE_SPAWN_EGG = registerItem("green_eye_spawn_egg", properties ->
            new SpawnEggItem(properties.spawnEgg(ModEntities.GREEN_EYE)));
    public static final Item MYTHRIL_WARAXE = registerItem("mythril_waraxe", properties ->
            new ShortSwordItem(properties.axe(ModToolMaterials.MYTHRIL, 39, -2)));
    public static final Item PALLADIUM_WARAXE = registerItem("palladium_waraxe", properties ->
            new ShortSwordItem(properties.axe(ModToolMaterials.PALLADIUM, 35, -2)));
    public static final Item PICKAXE_AXE = registerItem("pickaxe_axe", properties ->
            new ShortSwordItem(properties.pickaxe(ModToolMaterials.HALLOWED, 34, -2).axe(ModToolMaterials.HALLOWED, 34, -2)));
    public static final Item PICKSAW = registerItem("picksaw", properties ->
            new ShortSwordItem(properties.pickaxe(ModToolMaterials.PICKSAW, 33, -2).axe(ModToolMaterials.PICKSAW, 33, -2)));
    public static final Item TITANIUM_WARAXE = registerItem("titanium_waraxe", properties ->
            new ShortSwordItem(properties.axe(ModToolMaterials.TITANIUM, 43, -2)));
    public static final Item ADAMANTITE_PICKAXE = registerItem("adamantite_pickaxe", properties ->
            new ShortSwordItem(properties.pickaxe(ModToolMaterials.ADAMANTITE, 20, -2)));
    public static final Item CHLOROPHYTE_CLAYMORE = registerItem("chlorophyte_claymore", properties ->
            new ShortSwordItem(properties.sword(ModToolMaterials.CHLOROPHYTE, 95, -2)));
    public static final Item NEBULA_PICKAXE = registerItem("nebula_pickaxe", properties ->
            new ShortSwordItem(properties.pickaxe(ModToolMaterials.NEBULA, 79, -2)));
    public static final Item ORICHALCUM_PICKAXE = registerItem("orichalcum_pickaxe", properties ->
            new ShortSwordItem(properties.pickaxe(ModToolMaterials.ORICHALCUM, 16, -2)));
    public static final Item PALLADIUM_PICKAXE = registerItem("palladium_pickaxe", properties ->
            new ShortSwordItem(properties.pickaxe(ModToolMaterials.PALLADIUM, 11, -2)));
    public static final Item PURPLE_EYE_SPAWN_EGG = registerItem("purple_eye_spawn_egg", properties ->
            new SpawnEggItem(properties.spawnEgg(ModEntities.PURPLE_EYE)));
    public static final Item GELATIN_CRYSTAL = registerItem("gelatin_crystal", GelatinCrystal::new);
    public static final Item GREEN_MUSHROOM = registerItem("green_mushroom", Item::new);
    public static final Item HALLOWED_CRATE = registerItem("hallowed_crate", HallowedCrateItem::new);
    public static final Item FRUIT_SALAD = registerItem("fruit_salad", properties ->
            new Item(properties.food(ModFoods.FRUIT_SALAD, ModConsumables.FRUIT_SALAD)));
    public static final Item GOLDEN_DELIGHT = registerItem("golden_delight", properties ->
            new Item(properties.food(ModFoods.GOLDEN_DELIGHT, ModConsumables.GOLDEN_DELIGHT)));
    public static final Item GRAPE_JUICE = registerItem("grape_juice", properties ->
            new Item(properties.food(ModFoods.GRAPE_JUICE, ModConsumables.GRAPE_JUICE)));
    public static final Item GRAPES = registerItem("grapes", properties ->
            new Item(properties.food(ModFoods.GRAPES, ModConsumables.GRAPES)));
    public static final Item HOT_DOG = registerItem("hot_dog", properties ->
            new Item(properties.food(ModFoods.HOT_DOG, ModConsumables.HOT_DOG)));
    public static final Item AERIAL_BANE = registerItem("aerial_bane", properties ->
            new AerialBaneItem(properties.durability(10000).rarity(Rarity.EPIC), 20, 5, 30000, 4.0f) {
                @Override
                public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                    builder.accept(Component.translatable("tooltip.unnamedmod.aerial_bane"));
                    super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                }
            });
    public static final Item FLAMING_ARROW = registerItem("flaming_arrow", FlamingArrowItem::new);














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
