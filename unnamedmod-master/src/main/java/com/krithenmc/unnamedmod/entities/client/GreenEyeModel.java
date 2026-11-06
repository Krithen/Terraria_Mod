package com.krithenmc.unnamedmod.entities.client;

import com.geckolib.model.DefaultedEntityGeoModel;
import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.entities.custom.DemonEyeEntity;
import com.krithenmc.unnamedmod.entities.custom.GreenEyeEntity;
import net.minecraft.resources.Identifier;

public class GreenEyeModel extends DefaultedEntityGeoModel<GreenEyeEntity> {
    public GreenEyeModel() {
        super(Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "demon_eye"));
    }
}
