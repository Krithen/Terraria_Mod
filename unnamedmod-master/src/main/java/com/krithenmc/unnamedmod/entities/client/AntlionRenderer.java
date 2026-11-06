package com.krithenmc.unnamedmod.entities.client;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.entities.custom.AntlionEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;

public class AntlionRenderer extends MobRenderer<AntlionEntity, AntlionRenderState, AntlionModel> {

    public AntlionRenderer(EntityRendererProvider.Context context) {
        super(context, new AntlionModel(context.bakeLayer(ModModelLayerLocations.ANTLION)), 0.45f);
    }

    @Override
    public Identifier getTextureLocation(AntlionRenderState state) {
        return Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "textures/entity/antlion/antlion.png");
    }

    @Override
    public AntlionRenderState createRenderState() {
        return new AntlionRenderState();
    }

    @Override
    public void extractRenderState(AntlionEntity entity, AntlionRenderState state, float partialTicks) {
        super.extractRenderState(entity, state, partialTicks);

        state.idleAnimationState.copyFrom(entity.idleAnimationState);
    }
}
