package com.krithenmc.unnamedmod.entities.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.EntityRenderState;

public class FlamingArrowEntityRenderer extends FlamingArrowRenderer{
    public FlamingArrowEntityRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public FlamingArrowEntityRenderState createRenderState() {
        return new FlamingArrowEntityRenderState();
    }

}
