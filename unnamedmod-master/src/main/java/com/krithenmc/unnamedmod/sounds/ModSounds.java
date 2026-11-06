package com.krithenmc.unnamedmod.sounds;

import com.krithenmc.unnamedmod.Unnamedmod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

public class ModSounds {
    public static final SoundEvent NIGHTSEDGE = registerSoundEvent("nightsedge");

    public static final SoundEvent ANTLION_HIT = registerSoundEvent("antlion_hit");

    public static final SoundEvent ANTLION_KILLED = registerSoundEvent("antlion_killed");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }
    public static void registerSounds() {
        Unnamedmod.LOGGER.info("registering sounds for" + Unnamedmod.MOD_ID);
    }
}
