package com.krithenmc.unnamedmod.entities.client;

import com.krithenmc.unnamedmod.entities.variant.DemonEyeVariant;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class DemonEyeRenderState extends LivingEntityRenderState {
    public DemonEyeRenderState createRenderState() {


        return new DemonEyeRenderState();

    }
    public DemonEyeVariant variant;
}
