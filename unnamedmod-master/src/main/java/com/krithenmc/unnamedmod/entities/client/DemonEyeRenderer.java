package com.krithenmc.unnamedmod.entities.client;

import com.geckolib.renderer.GeoEntityRenderer;
import com.geckolib.renderer.base.GeoRenderState;
import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.entities.custom.DemonEyeEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.resources.Identifier;

public class DemonEyeRenderer<R extends LivingEntityRenderState & GeoRenderState> extends GeoEntityRenderer<DemonEyeEntity, R> {

    public DemonEyeRenderer(EntityRendererProvider.Context context) {
        super(context, new DemonEyeModel());
    }

    @Override
    public Identifier getTextureLocation(R renderState) {
        return Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "textures/entity/demon_eye/demon_eye.png");
    }
}
