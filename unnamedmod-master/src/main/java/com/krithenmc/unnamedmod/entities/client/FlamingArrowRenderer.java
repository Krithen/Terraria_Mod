package com.krithenmc.unnamedmod.entities.client;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.object.projectile.ArrowModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.ArrowRenderState;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;

@Environment(EnvType.CLIENT)
public abstract class FlamingArrowRenderer<T extends AbstractArrow, S extends FlamingArrowEntityRenderState> extends EntityRenderer<T, S> {
    private final FlamingArrowEntityModel model;

    public FlamingArrowRenderer(final EntityRendererProvider.Context context) {
        super(context);
        this.model = new FlamingArrowEntityModel(context.bakeLayer(ModModelLayerLocations.FLAMING_ARROW));
    }


    public void submit(final S state, final PoseStack poseStack, final SubmitNodeCollector submitNodeCollector, final CameraRenderState camera) {
        poseStack.pushPose();
        poseStack.mulPose(Axis.YP.rotationDegrees(state.yRot - 90.0F));
        poseStack.mulPose(Axis.ZP.rotationDegrees(state.xRot));
        submitNodeCollector.submitModel(this.model, state, poseStack, this.getTextureLocation(state), state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor, (ModelFeatureRenderer.CrumblingOverlay)null);
        poseStack.popPose();
        super.submit(state, poseStack, submitNodeCollector, camera);
    }



    public Identifier getTextureLocation(FlamingArrowEntityRenderState state) {
        return Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "textures/entity/flaming_arrow/flaming_arrow.png");
    }



    public void extractRenderState(final T entity, final S state, final float partialTicks) {
        super.extractRenderState(entity, state, partialTicks);
        state.xRot = entity.getXRot(partialTicks);
        state.yRot = entity.getYRot(partialTicks);
        state.shake = (float)entity.shakeTime - partialTicks;
    }






}
