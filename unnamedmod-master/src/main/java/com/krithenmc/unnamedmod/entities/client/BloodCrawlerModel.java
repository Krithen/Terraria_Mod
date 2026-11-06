package com.krithenmc.unnamedmod.entities.client;

import com.geckolib.animatable.GeoAnimatable;
import com.geckolib.model.DefaultedEntityGeoModel;
import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.entities.custom.BloodCrawlerEntity;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

public class BloodCrawlerModel extends DefaultedEntityGeoModel<BloodCrawlerEntity> {
    public BloodCrawlerModel() {
        super(Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "blood_crawler"));
    }
}
