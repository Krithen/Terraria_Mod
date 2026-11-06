package com.krithenmc.unnamedmod.entities.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;

import javax.swing.text.html.parser.Entity;

public class AntlionModel extends EntityModel<AntlionRenderState> {
    private final ModelPart main;
    private final ModelPart segment3;
    private final ModelPart segment2;
    private final ModelPart segment1;
    private final ModelPart righthorn;
    private final ModelPart lefthorn;
    private final ModelPart eyes;
    private final ModelPart lefteye;
    private final ModelPart righteye;
    private final ModelPart legs;
    private final ModelPart rbl;
    private final ModelPart lbl;
    private final ModelPart frl;
    private final ModelPart lfl;

    private final KeyframeAnimation walkingAnimation;
    private final KeyframeAnimation idlingAnimation;

    public AntlionModel(ModelPart root) {
        super (root);
        this.main = root.getChild("main");
        this.segment3 = this.main.getChild("segment3");
        this.segment2 = this.segment3.getChild("segment2");
        this.segment1 = this.segment2.getChild("segment1");
        this.righthorn = this.segment1.getChild("righthorn");
        this.lefthorn = this.segment1.getChild("lefthorn");
        this.eyes = this.segment1.getChild("eyes");
        this.lefteye = this.eyes.getChild("lefteye");
        this.righteye = this.eyes.getChild("righteye");
        this.legs = this.segment1.getChild("legs");
        this.rbl = this.legs.getChild("rbl");
        this.lbl = this.legs.getChild("lbl");
        this.frl = this.legs.getChild("frl");
        this.lfl = this.legs.getChild("lfl");

        this.walkingAnimation = AntlionAnimations.WALK.bake(root);
        this.idlingAnimation = AntlionAnimations.IDLE.bake(root);
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, 19.25F, 0.0F, 1.5708F, 0.0F, -1.6144F));

        PartDefinition segment3 = main.addOrReplaceChild("segment3", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -0.5F, -4.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.25F, 7.25F, 0.0F));

        PartDefinition segment2 = segment3.addOrReplaceChild("segment2", CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, -4.5F, -4.0F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(28, 21).addBox(-3.0F, -1.5F, -4.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0001F, 0.0038F, 0.0002F));

        PartDefinition segment1 = segment2.addOrReplaceChild("segment1", CubeListBuilder.create().texOffs(2, 59).addBox(-3.0F, -4.4F, 2.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 40).addBox(-3.0F, -2.4F, -4.0F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(44, 33).addBox(-3.0F, -4.4F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(39, 58).addBox(-3.0F, -4.4F, -4.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(51, 1).addBox(2.0F, -4.4F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.1F, 0.0F, 0.0F, 0.0019F, 0.0F));

        PartDefinition righthorn = segment1.addOrReplaceChild("righthorn", CubeListBuilder.create().texOffs(36, 33).addBox(-1.0F, -0.875F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 32).addBox(-1.0F, -4.875F, -1.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(30, 36).addBox(-1.0F, -7.875F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(30, 33).addBox(-1.0F, -6.875F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.525F, -3.5F, 0.0433F, 0.0167F, 0.0033F));

        PartDefinition lefthorn = segment1.addOrReplaceChild("lefthorn", CubeListBuilder.create().texOffs(16, 32).addBox(-1.0F, -4.875F, 0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 35).addBox(-1.0F, -6.875F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 35).addBox(-1.0F, -7.875F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(22, 37).addBox(-1.0F, -0.875F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.525F, 3.5F, -0.0434F, -0.0113F, 0.0015F));

        PartDefinition eyes = segment1.addOrReplaceChild("eyes", CubeListBuilder.create(), PartPose.offset(-0.25F, -3.15F, 0.0F));

        PartDefinition lefteye = eyes.addOrReplaceChild("lefteye", CubeListBuilder.create(), PartPose.offsetAndRotation(3.75F, 0.7652F, -3.1736F, -0.2179F, -0.0149F, 0.0026F));

        PartDefinition cube_r1 = lefteye.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(33, 6).addBox(3.25F, -0.7975F, -4.2583F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.75F, -0.7652F, 3.1736F, 0.1745F, 0.0F, 0.0F));

        PartDefinition righteye = eyes.addOrReplaceChild("righteye", CubeListBuilder.create(), PartPose.offsetAndRotation(3.75F, 0.7652F, 3.1736F, 0.1309F, 0.0F, 0.0F));

        PartDefinition cube_r2 = righteye.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 33).addBox(3.25F, -0.7975F, 2.2583F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.75F, -0.7652F, -3.1736F, -0.1745F, 0.0F, 0.0F));

        PartDefinition legs = segment1.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(-0.25F, -3.15F, 0.0F));

        PartDefinition rbl = legs.addOrReplaceChild("rbl", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.75F, 8.75F, 3.9F, -0.006F, 0.0336F, -0.0023F));

        PartDefinition rightbackleg_r1 = rbl.addOrReplaceChild("rightbackleg_r1", CubeListBuilder.create().texOffs(28, 30).addBox(-7.1997F, 7.75F, 2.8219F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -8.75F, -3.9F, 0.0F, 0.3491F, 0.0F));

        PartDefinition lbl = legs.addOrReplaceChild("lbl", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.75F, 8.75F, -3.9F, -0.0078F, -0.0503F, 0.0035F));

        PartDefinition leftbackleg_r1 = lbl.addOrReplaceChild("leftbackleg_r1", CubeListBuilder.create().texOffs(0, 32).addBox(-7.1997F, 7.75F, -3.8219F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -8.75F, 3.9F, 0.0F, -0.3491F, 0.0F));

        PartDefinition frl = legs.addOrReplaceChild("frl", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.75F, 2.75F, 3.9F, -0.0147F, 0.0546F, -0.004F));

        PartDefinition forwardrightleg_r1 = frl.addOrReplaceChild("forwardrightleg_r1", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 1.0F, 0.0F, 0.3491F, 0.0F));

        PartDefinition lfl = legs.addOrReplaceChild("lfl", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.75F, 2.75F, -3.9F, -0.003F, -0.0339F, 0.0023F));

        PartDefinition leftforwardleg_r1 = lfl.addOrReplaceChild("leftforwardleg_r1", CubeListBuilder.create().texOffs(32, 3).addBox(-7.1997F, 1.75F, -3.8219F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -2.75F, 3.9F, 0.0F, -0.3491F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(AntlionRenderState state) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        //this.applyHeadRotation(state.yRot, state.xRot);

        this.walkingAnimation.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1f, 2.5f);
        this.idlingAnimation.apply(state.idleAnimationState, state.ageInTicks, 1f);

    }

    private void applyHeadRotation(float headYaw, float headPitch) {
        headYaw = Mth.clamp(headYaw, -30f, 30f);
        headPitch = Mth.clamp(headPitch, -25f, 45   );

        this.main.yRot = headYaw * ((float)Math.PI / 100f);
        this.main.xRot = headPitch * ((float)Math.PI / 100f);
    }
}
