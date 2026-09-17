package com.krithenmc.unnamedmod.registries;

import com.krithenmc.unnamedmod.item.ModItems;
import com.krithenmc.unnamedmod.potion.ModPotions;
import net.fabricmc.fabric.api.registry.FabricPotionBrewingBuilder;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;

public class ModPotionRecipes {
    public static void registerPotionRecipes() {
        FabricPotionBrewingBuilder.BUILD.register(builder ->
                builder.registerPotionRecipe(Potions.AWKWARD, Ingredient.of(ModItems.GRAPEFRUIT), ModPotions.WELLFED_POTION));
    }
}
