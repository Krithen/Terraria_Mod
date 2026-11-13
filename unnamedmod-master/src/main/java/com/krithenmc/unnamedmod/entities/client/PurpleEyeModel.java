package com.krithenmc.unnamedmod.entities.client;

import com.geckolib.model.DefaultedEntityGeoModel;
import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.entities.custom.GreenEyeEntity;
import com.krithenmc.unnamedmod.entities.custom.PurpleEyeEntity;
import net.minecraft.resources.Identifier;

public class PurpleEyeModel extends DefaultedEntityGeoModel<PurpleEyeEntity> {
    public PurpleEyeModel() {
        super(Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "demon_eye"));
    }
}
