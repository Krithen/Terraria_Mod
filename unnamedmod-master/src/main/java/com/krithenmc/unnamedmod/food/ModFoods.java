package com.krithenmc.unnamedmod.food;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;

public class ModFoods {
    public static final FoodProperties BLACKCURRANT = new FoodProperties.Builder().nutrition(2).saturationModifier(2).build();
    public static final FoodProperties JOJA_COLA = new FoodProperties.Builder()
            .alwaysEdible()
            .nutrition(2)
            .saturationModifier(1)
            .build();
    public static final FoodProperties BANANUH = new FoodProperties.Builder().nutrition(6).saturationModifier(7).build();
    public static final FoodProperties APRICOT = new FoodProperties.Builder().nutrition(2).saturationModifier(2).build();
    public static final FoodProperties BLOOD_ORANGE = new FoodProperties.Builder().nutrition(2).saturationModifier(2).build();
    public static final FoodProperties JUNGLE_SPORES = new FoodProperties.Builder().nutrition(1).saturationModifier(0).build();
    public static final FoodProperties COCONUT = new FoodProperties.Builder().nutrition(4).saturationModifier(2).build();
    public static final FoodProperties CRIMSON_TIGERFISH = new FoodProperties.Builder().nutrition(4).saturationModifier(4).build();



}
