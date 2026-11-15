package com.krithenmc.unnamedmod.entities.client;

import com.geckolib.renderer.GeoEntityRenderer;
import com.geckolib.renderer.base.GeoRenderState;
import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.entities.custom.CrimeraEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.resources.Identifier;

public class CrimeraRenderer<R extends LivingEntityRenderState & GeoRenderState> extends GeoEntityRenderer<CrimeraEntity, R> {

    public CrimeraRenderer(EntityRendererProvider.Context context) {
        super(context, new CrimeraModel());
    }

    @Override
    public Identifier getTextureLocation(R renderState) {
        return Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "textures/entity/crimera/crimera.png");
    }
}
