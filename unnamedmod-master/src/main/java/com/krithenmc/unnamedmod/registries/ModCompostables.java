package com.krithenmc.unnamedmod.registries;

import com.krithenmc.unnamedmod.item.ModItems;
import net.fabricmc.fabric.api.registry.CompostableRegistry;

public class ModCompostables {
    public static void registerCompostables() {
        CompostableRegistry.INSTANCE.add(ModItems.BANANUH, 0.65f);
    }
}
