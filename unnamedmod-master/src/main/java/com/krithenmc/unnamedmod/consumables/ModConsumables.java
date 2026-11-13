package com.krithenmc.unnamedmod.consumables;

import com.krithenmc.unnamedmod.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModConsumables {

    public static final Consumable BLACKCURRANT_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.WELLFED, 300 * 20, 1), 1.0f))
            .consumeSeconds(1f).build();
    public static final Consumable JOJA_COLA_CONSUMABLE = Consumables.defaultDrink()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 12 * 20, 5), 1.0F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NAUSEA, 12 * 20, 255), 1.0F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.WELLFED, 120 * 20, 1), 1.0f)).build();
    public static final Consumable BANANUH_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(3f)
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 30), 1.0f)).build();
    public static final Consumable APRICOT_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.6f)
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.WELLFED, 300 * 20, 1), 1.0f))
            .build();
    public static final Consumable BLOOD_ORANGE_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.WELLFED, 300 * 20, 1), 1.0f))
            .consumeSeconds(1f).build();
    public static final Consumable JUNGLE_SPORES_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NAUSEA, 20, 10), 1.0F)).build();
    public static final Consumable COCONUT = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.WELLFED, 300 * 20, 1), 1.0f))
            .consumeSeconds(1f).build();
    public static final Consumable CRIMSON_TIGERFISH = Consumables.defaultFood()
            .consumeSeconds(1f).build();
    public static final Consumable CHERRY = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.WELLFED, 300 * 20, 1), 1.0f))
            .consumeSeconds(2f).build();
    public static final Consumable ELDERBERRY = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.WELLFED, 300 * 20, 1), 1.0f)).build();
    public static final Consumable GRAPEFRUIT = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.WELLFED, 300 * 20, 1), 1.0f)).build();
    public static final Consumable HAMBURGER = Consumables.defaultFood().build();
    public static final Consumable LEMON = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.WELLFED, 300 * 20, 1), 1.0f)).build();
    public static final Consumable MANGO = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.WELLFED, 300 * 20, 1), 1.0f)).build();
    public static final Consumable MARSHMALLOW = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.WELLFED, 300 * 20, 1), 1.0f)).build();
    public static final Consumable APPLE_PIE = Consumables.defaultFood().build();
    public static final Consumable BACON = Consumables.defaultFood().build();
    public static final Consumable BARBEQUE_RIBS = Consumables.defaultFood().build();
    public static final Consumable BUCKET_OF_MILKSHAKE = Consumables.defaultDrink().build();
    public static final Consumable CREAM_SODA = Consumables.defaultDrink().build();
    public static final Consumable GRAPE_JUICE = Consumables.defaultDrink().build();
    public static final Consumable FRUIT_SALAD = Consumables.defaultFood().build();
    public static final Consumable GOLDEN_DELIGHT = Consumables.defaultFood().build();
    public static final Consumable GRAPES = Consumables.defaultFood().build();
    public static final Consumable HOT_DOG = Consumables.defaultFood().build();
    public static final Consumable ICE_CREAM = Consumables.defaultFood().build();
    public static final Consumable NACHOS = Consumables.defaultFood().build();
    public static final Consumable PIXIEFISH = Consumables.defaultFood().build();


}
