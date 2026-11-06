package com.krithenmc.unnamedmod.entities.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;

public class SwarmerModel extends EntityModel<SwarmerRenderState> {
    private final ModelPart main;
    private final ModelPart body;
    private final ModelPart wings;
    private final ModelPart leftwing;
    private final ModelPart rightwing;
    private final ModelPart tail;
    private final ModelPart legs;
    private final ModelPart leg1;
    private final ModelPart leg2;
    private final ModelPart leg3;
    private final ModelPart leg4;
    private final ModelPart leg5;
    private final ModelPart leg6;
    private final ModelPart head;
    private final ModelPart rightmandible;
    private final ModelPart leftmandible;
    private final ModelPart idkwhatthisis;
    private final ModelPart eyes;

    private final KeyframeAnimation flyingAnimation;
    private final KeyframeAnimation idlingAnimation;

    public SwarmerModel(ModelPart root) {
        super (root);
        this.main = root.getChild("main");
        this.body = this.main.getChild("body");
        this.wings = this.body.getChild("wings");
        this.leftwing = this.wings.getChild("leftwing");
        this.rightwing = this.wings.getChild("rightwing");
        this.tail = this.body.getChild("tail");
        this.legs = this.body.getChild("legs");
        this.leg1 = this.legs.getChild("leg1");
        this.leg2 = this.legs.getChild("leg2");
        this.leg3 = this.legs.getChild("leg3");
        this.leg4 = this.legs.getChild("leg4");
        this.leg5 = this.legs.getChild("leg5");
        this.leg6 = this.legs.getChild("leg6");
        this.head = this.body.getChild("head");
        this.rightmandible = this.head.getChild("rightmandible");
        this.leftmandible = this.head.getChild("leftmandible");
        this.idkwhatthisis = this.head.getChild("idkwhatthis is");
        this.eyes = this.head.getChild("eyes");

        this.flyingAnimation = SwarmerAnimations.FLY.bake(root);
        this.idlingAnimation = SwarmerAnimations.IDLE.bake(root);
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 12).addBox(-4.6158F, -2.2611F, -1.3472F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 19).addBox(-4.6158F, -0.2611F, -0.3472F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.3842F, -8.7389F, 0.3472F));

        PartDefinition wings = body.addOrReplaceChild("wings", CubeListBuilder.create(), PartPose.offset(0.3842F, -2.2611F, -1.3472F));

        PartDefinition leftwing = wings.addOrReplaceChild("leftwing", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9648F, 1.0F, 0.7264F, 0.0F, 0.4363F, 0.0F));

        PartDefinition cube_r1 = leftwing.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 1.0F, -4.0F, 21.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9648F, -1.0F, -0.7264F, 0.0F, 0.48F, 0.0F));

        PartDefinition rightwing = wings.addOrReplaceChild("rightwing", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9648F, 1.0F, 3.2736F, 0.0F, -0.2618F, 0.0F));

        PartDefinition cube_r2 = rightwing.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, 1.0F, -2.0F, 21.0F, 0.0F, 6.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.9648F, -1.0F, 0.7264F, 0.0F, -0.48F, 0.0F));

        PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(28, 26).addBox(0.5F, -1.5F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(14, 26).addBox(5.5F, -1.5F, -1.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(22, 12).addBox(10.5F, -1.5F, -2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8842F, 1.2389F, 0.6528F, -0.0088F, -0.0029F, 0.008F));

        PartDefinition legs = body.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(1.4842F, 1.7389F, -0.8472F));

        PartDefinition leg1 = legs.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6831F, -0.6726F, 0.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition cube_r3 = leg1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(20, 33).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.6831F, 0.6726F, 0.0F, 0.0F, 0.0F, -0.3927F));

        PartDefinition cube_r4 = leg1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, 36).addBox(-0.1F, 1.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.6831F, 0.6726F, 0.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition leg2 = legs.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6831F, -0.6726F, 0.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition cube_r5 = leg2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(16, 33).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.6831F, 0.6726F, 0.0F, 0.0F, 0.0F, -0.3927F));

        PartDefinition cube_r6 = leg2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(4, 36).addBox(-0.1F, 1.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.6831F, 0.6726F, 0.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition leg3 = legs.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6831F, -0.6726F, 0.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition cube_r7 = leg3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 36).addBox(-0.1F, 1.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.6831F, 0.6726F, 0.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition cube_r8 = leg3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 33).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.6831F, 0.6726F, 0.0F, 0.0F, 0.0F, -0.3927F));

        PartDefinition leg4 = legs.addOrReplaceChild("leg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6831F, -0.6726F, 3.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition cube_r9 = leg4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 34).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.6831F, 0.6726F, 0.0F, 0.0F, 0.0F, -0.3927F));

        PartDefinition cube_r10 = leg4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(36, 34).addBox(-0.1F, 1.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.6831F, 0.6726F, 0.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition leg5 = legs.addOrReplaceChild("leg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6831F, -0.6726F, 3.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition cube_r11 = leg5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(28, 34).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.6831F, 0.6726F, 0.0F, 0.0F, 0.0F, -0.3927F));

        PartDefinition cube_r12 = leg5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(12, 37).addBox(-0.1F, 1.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.6831F, 0.6726F, 0.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition leg6 = legs.addOrReplaceChild("leg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6831F, -0.6726F, 3.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition cube_r13 = leg6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(16, 37).addBox(-0.1F, 1.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.6831F, 0.6726F, 0.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition cube_r14 = leg6.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(32, 34).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.6831F, 0.6726F, 0.0F, 0.0F, 0.0F, -0.3927F));

        PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(22, 20).addBox(-4.5948F, -0.5667F, -1.5833F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 23).addBox(-3.5948F, 1.4333F, -1.5833F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.021F, -0.6944F, 0.2361F));

        PartDefinition rightmandible = head.addOrReplaceChild("rightmandible", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7611F, 2.792F, 1.9541F, -0.1051F, 0.0432F, 0.0245F));

        PartDefinition cube_r15 = rightmandible.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(32, 32).addBox(-1.5F, -1.3F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.6492F, 1.9414F, 2.7178F, 0.648F, 0.3565F, -0.1505F));

        PartDefinition cube_r16 = rightmandible.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(24, 32).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.7337F, 0.4414F, 0.9626F, 0.3994F, 0.625F, -0.6643F));

        PartDefinition cube_r17 = rightmandible.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(16, 31).addBox(-4.3F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.6492F, 1.9414F, 2.7178F, 0.7268F, 0.0194F, 0.2596F));

        PartDefinition leftmandible = head.addOrReplaceChild("leftmandible", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7611F, 2.792F, -1.1208F, 0.0F, -0.0873F, -0.1745F));

        PartDefinition cube_r18 = leftmandible.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, -1.3F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.6492F, 1.9414F, -2.7178F, -0.648F, -0.3565F, -0.1505F));

        PartDefinition cube_r19 = leftmandible.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(28, 30).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.7337F, 0.4414F, -0.9626F, -0.3994F, -0.625F, -0.6643F));

        PartDefinition cube_r20 = leftmandible.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(8, 31).addBox(-4.3F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.6492F, 1.9414F, -2.7178F, -0.7268F, -0.0194F, 0.2596F));

        PartDefinition idkwhatthisis = head.addOrReplaceChild("idkwhatthis is", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8948F, 2.2333F, 0.4167F, 0.0F, 0.0F, 0.2182F));

        PartDefinition cube_r21 = idkwhatthisis.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 29).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
                .texOffs(14, 23).addBox(-1.5F, -0.5F, -3.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.2618F));

        PartDefinition eyes = head.addOrReplaceChild("eyes", CubeListBuilder.create().texOffs(6, 33).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 33).addBox(-1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5948F, 0.4333F, 0.4167F, 0.0F, 0.0F, -0.3491F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(SwarmerRenderState state) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(state.yRot, state.xRot);

        this.flyingAnimation.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1f, 2.5f);
        this.idlingAnimation.apply(state.idleAnimationState, state.ageInTicks, 1f);

    }

    private void applyHeadRotation(float headYaw, float headPitch) {
        headYaw = Mth.clamp(headYaw, -30f, 30f);
        headPitch = Mth.clamp(headPitch, -25f, 45   );

        this.head.yRot = headYaw * ((float)Math.PI / 100f);
        this.head.xRot = headPitch * ((float)Math.PI / 100f);
    }

}
