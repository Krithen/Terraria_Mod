package com.krithenmc.unnamedmod.entities.client;

import com.krithenmc.unnamedmod.entities.variant.DemonEyeVariant;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

public class LargeDemonEyeRenderState extends LivingEntityRenderState {
    public LargeDemonEyeRenderState createRenderState() {


        return new LargeDemonEyeRenderState();

    }
    public DemonEyeVariant variant;
}
