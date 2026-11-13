package com.krithenmc.unnamedmod.entities.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import javax.swing.text.html.parser.Entity;

public class FlamingArrowEntityModel extends EntityModel<FlamingArrowEntityRenderState> {
    private final ModelPart main;

    public FlamingArrowEntityModel(ModelPart root) {
        super(root);
        this.main = root.getChild("main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create().texOffs(0, 0).addBox(0.025F, -6.25F, -2.5F, 0.0F, 16.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.075F, -6.25F, -2.5F, 0.0F, 16.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(15, 2).addBox(-2.475F, -5.25F, -2.5F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.075F, 21.45F, 1.7F, -1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -8.0F, -2.5F, 0.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, 1.75F, 0.0F, 0.0F, 1.5708F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

}
