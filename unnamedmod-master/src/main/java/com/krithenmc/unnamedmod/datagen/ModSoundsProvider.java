package com.krithenmc.unnamedmod.datagen;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.sounds.ModSounds;
import net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricSoundsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModSoundsProvider extends FabricSoundsProvider {
    public ModSoundsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registryLookup, SoundExporter exporter) {
        exporter.add(ModSounds.NIGHTSEDGE, SoundTypeBuilder.of(ModSounds.NIGHTSEDGE).subtitle("sounds.unnamedmod.nightsedge")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "nightsedge"))));

    }

    @Override
    public String getName() {
        return "Unnamedmod Sounds";
    }
}
