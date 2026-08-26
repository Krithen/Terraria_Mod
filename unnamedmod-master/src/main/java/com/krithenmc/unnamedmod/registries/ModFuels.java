package com.krithenmc.unnamedmod.registries;

import com.krithenmc.unnamedmod.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelValueEvents;

public class ModFuels  {
    public static void registerFuels() {
        FuelValueEvents.BUILD.register((builder, context) -> {
            builder.add(ModItems.GEL, 200 * 3);
        });
    }
}
