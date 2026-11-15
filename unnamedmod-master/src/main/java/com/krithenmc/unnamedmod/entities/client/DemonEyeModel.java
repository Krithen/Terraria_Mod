package com.krithenmc.unnamedmod.entities.client;

import com.geckolib.model.DefaultedEntityGeoModel;
import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.entities.custom.DemonEyeEntity;
import net.minecraft.resources.Identifier;

public class DemonEyeModel extends DefaultedEntityGeoModel<DemonEyeEntity> {
    public DemonEyeModel() {
        super(Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "demon_eye"));
    }
}
