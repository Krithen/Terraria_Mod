package com.krithenmc.unnamedmod.entities.client;

import com.geckolib.model.DefaultedEntityGeoModel;
import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.entities.custom.BloodCrawlerEntity;
import net.minecraft.resources.Identifier;

public class BloodCrawlerModel extends DefaultedEntityGeoModel<BloodCrawlerEntity> {
    public BloodCrawlerModel() {
        super(Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "blood_crawler"));
    }
}
