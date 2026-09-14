package com.krithenmc.unnamedmod.stat;

import com.krithenmc.unnamedmod.Unnamedmod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.stats.Stat;
import net.minecraft.stats.StatFormatter;
import net.minecraft.stats.Stats;

public class ModStats {

    public static final Stat<?> HAMMER_USED_STAT = makeCustomStat("hammer_used");

    private static Stat<?> makeCustomStat(String key) {
        Identifier identifier = Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, key);
        Identifier newStat = Registry.register(BuiltInRegistries.CUSTOM_STAT, key, identifier);

        return Stats.CUSTOM.get(newStat, StatFormatter.DEFAULT);
    }



    public static void registerStats() {
        Unnamedmod.LOGGER.info("Registering Stats for" + Unnamedmod.MOD_ID);
    }
}
