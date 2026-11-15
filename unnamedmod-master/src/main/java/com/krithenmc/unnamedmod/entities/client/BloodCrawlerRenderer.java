package com.krithenmc.unnamedmod.entities.client;

import com.geckolib.renderer.GeoEntityRenderer;
import com.geckolib.renderer.base.GeoRenderState;
import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.entities.custom.BloodCrawlerEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.resources.Identifier;

public class BloodCrawlerRenderer<R extends LivingEntityRenderState & GeoRenderState> extends GeoEntityRenderer<BloodCrawlerEntity, R> {

    public BloodCrawlerRenderer(EntityRendererProvider.Context context) {

        super(context, new BloodCrawlerModel());
    }

    @Override
    public Identifier getTextureLocation(R renderState) {
        return Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "textures/entity/blood_crawler/blood_crawler.png");
    }

}
