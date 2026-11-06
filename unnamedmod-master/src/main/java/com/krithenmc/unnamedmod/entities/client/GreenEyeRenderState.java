package com.krithenmc.unnamedmod.entities.client;

import com.krithenmc.unnamedmod.entities.variant.DemonEyeVariant;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class GreenEyeRenderState extends LivingEntityRenderState {
    public GreenEyeRenderState createRenderState() {


        return new GreenEyeRenderState();

    }
    public DemonEyeVariant variant;
}
