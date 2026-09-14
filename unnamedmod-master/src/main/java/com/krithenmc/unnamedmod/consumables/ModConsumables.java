package com.krithenmc.unnamedmod.consumables;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModConsumables {

    public static final Consumable BLACKCURRANT_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).build();
    public static final Consumable JOJA_COLA_CONSUMABLE = Consumables.defaultDrink()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 12 * 20, 5), 1.0F))
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NAUSEA, 12 * 20, 255), 1.0F)).build();
    public static final Consumable BANANUH_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(3f)
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 30), 1.0f)).build();
    public static final Consumable APRICOT_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.6f).build();
    public static final Consumable BLOOD_ORANGE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).build();
    public static final Consumable JUNGLE_SPORES_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NAUSEA, 20, 10), 1.0F)).build();
    public static final Consumable COCONUT = Consumables.defaultFood()
            .consumeSeconds(1f).build();
    public static final Consumable CRIMSON_TIGERFISH = Consumables.defaultFood()
            .consumeSeconds(1f).build();
    public static final Consumable CHERRY = Consumables.defaultFood()
            .consumeSeconds(2f).build();
    public static final Consumable ELDERBERRY = Consumables.defaultFood().build();
    public static final Consumable GRAPEFRUIT = Consumables.defaultFood().build();
    public static final Consumable HAMBURGER = Consumables.defaultFood().build();
    public static final Consumable LEMON = Consumables.defaultFood().build();
    public static final Consumable MANGO = Consumables.defaultFood().build();
    public static final Consumable MARSHMALLOW = Consumables.defaultFood().build();

}
