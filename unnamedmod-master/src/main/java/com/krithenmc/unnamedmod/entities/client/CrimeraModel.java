package com.krithenmc.unnamedmod.entities.client;

import com.geckolib.model.DefaultedEntityGeoModel;
import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.entities.custom.CrimeraEntity;
import net.minecraft.resources.Identifier;

public class CrimeraModel extends DefaultedEntityGeoModel<CrimeraEntity> {
    public CrimeraModel() {
        super(Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "crimera"));
    }
}
