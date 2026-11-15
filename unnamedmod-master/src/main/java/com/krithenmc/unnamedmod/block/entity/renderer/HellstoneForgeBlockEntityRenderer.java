package com.krithenmc.unnamedmod.block.entity.renderer;

import com.krithenmc.unnamedmod.block.entity.custom.HellstoneForgeBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.item.ItemModelResolver;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

public class HellstoneForgeBlockEntityRenderer implements BlockEntityRenderer<HellstoneForgeBlockEntity, HellstoneForgeBlockEntityRenderState> {
    private final ItemModelResolver itemModelResolver;

    public HellstoneForgeBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        itemModelResolver = context.itemModelResolver();

    }


    @Override
    public HellstoneForgeBlockEntityRenderState createRenderState() {
        return new HellstoneForgeBlockEntityRenderState();
    }

    @Override
    public void extractRenderState(HellstoneForgeBlockEntity blockEntity,
                                   HellstoneForgeBlockEntityRenderState state, float partialTicks, Vec3 cameraPosition,
                                   ModelFeatureRenderer.@Nullable CrumblingOverlay breakProgress) {
        BlockEntityRenderer.super.extractRenderState(blockEntity, state, partialTicks, cameraPosition, breakProgress);

        state.level = blockEntity.getLevel();
        state.rotation = (blockEntity.getLevel().getGameTime() + partialTicks * 0.5f) % 360f;


        itemModelResolver.updateForTopItem(state.itemStackRenderState,
                blockEntity.getTheItem(), ItemDisplayContext.FIXED, blockEntity.getLevel(), null, 0);
    }

    @Override
    public void submit(HellstoneForgeBlockEntityRenderState state,
                       PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
        poseStack.pushPose();

        poseStack.translate(0.5f, 1.15f, 0.5f);
        poseStack.scale(0.5f, 0.5f, 0.5f);
        poseStack.rotate(Axis.YP.rotationDegrees(state.rotation));

        state.itemStackRenderState.submit(poseStack, submitNodeCollector, state.lightCoords, OverlayTexture.NO_OVERLAY, 0);

        poseStack.popPose();

    }
}
