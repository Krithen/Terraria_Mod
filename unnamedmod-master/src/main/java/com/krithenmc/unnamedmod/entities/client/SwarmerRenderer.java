package com.krithenmc.unnamedmod.entities.client;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.entities.custom.AntlionEntity;
import com.krithenmc.unnamedmod.entities.custom.SwarmerEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;

public class SwarmerRenderer extends MobRenderer<SwarmerEntity, SwarmerRenderState, SwarmerModel> {

    public SwarmerRenderer(EntityRendererProvider.Context context) {
        super(context, new SwarmerModel(context.bakeLayer(ModModelLayerLocations.SWARMER)), 0.45f);
    }

    @Override
    public Identifier getTextureLocation(SwarmerRenderState state) {
        return Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "textures/entity/swarmer/swarmer.png");
    }

    @Override
    public SwarmerRenderState createRenderState() {
        return new SwarmerRenderState();
    }

    @Override
    public void extractRenderState(SwarmerEntity entity, SwarmerRenderState state, float partialTicks) {
        super.extractRenderState(entity, state, partialTicks);

        state.idleAnimationState.copyFrom(entity.idleAnimationState);
    }
}
