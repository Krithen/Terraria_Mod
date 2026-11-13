package com.krithenmc.unnamedmod.entities.client;

import com.krithenmc.unnamedmod.entities.variant.DemonEyeVariant;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class PurpleEyeRenderState extends LivingEntityRenderState {
    public PurpleEyeRenderState createRenderState() {


        return new PurpleEyeRenderState();

    }
    public DemonEyeVariant variant;
}
