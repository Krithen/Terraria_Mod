package com.krithenmc.unnamedmod.entities.client;

import com.geckolib.renderer.GeoEntityRenderer;
import com.geckolib.renderer.base.GeoRenderState;
import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.entities.custom.GreenEyeEntity;
import com.krithenmc.unnamedmod.entities.custom.PurpleEyeEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.resources.Identifier;

public class PurpleEyeRenderer<R extends LivingEntityRenderState & GeoRenderState> extends GeoEntityRenderer<PurpleEyeEntity, R> {

    public PurpleEyeRenderer(EntityRendererProvider.Context context) {
        super(context, new PurpleEyeModel());
    }

    @Override
    public Identifier getTextureLocation(R renderState) {
        return Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "textures/entity/demon_eye/purple_eye.png");
    }
}
