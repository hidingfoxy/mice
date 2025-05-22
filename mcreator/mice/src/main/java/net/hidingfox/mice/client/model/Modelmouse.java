package net.hidingfox.mice.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmouse extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mice", "modelmouse"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart torso;
	public final ModelPart rearleftfoot;
	public final ModelPart rearrightfoot;
	public final ModelPart frontleftfoot;
	public final ModelPart frontrightfoot;
	public final ModelPart tail;

	public Modelmouse(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.torso = this.body.getChild("torso");
		this.rearleftfoot = this.torso.getChild("rearleftfoot");
		this.rearrightfoot = this.torso.getChild("rearrightfoot");
		this.frontleftfoot = this.torso.getChild("frontleftfoot");
		this.frontrightfoot = this.torso.getChild("frontrightfoot");
		this.tail = this.body.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 23.0F, 3.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 0).addBox(-0.5F, -0.9F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, -1.5F, -7.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 0).addBox(-1.5F, -1.5F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6358F, -1.6222F, 0.7897F, -0.3491F, 0.3491F, -0.3491F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 0).addBox(-1.5F, -1.5F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5642F, -1.3222F, 1.1897F, -0.3491F, -0.3491F, 0.3491F));
		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 4).addBox(-1.5F, -3.0F, -4.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 1.0F, -2.0F));
		PartDefinition rearleftfoot = torso.addOrReplaceChild("rearleftfoot", CubeListBuilder.create(), PartPose.offset(2.5F, 0.0F, 2.0F));
		PartDefinition cube_r3 = rearleftfoot.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(7, 12).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2F, 0.0F, 0.0F, 0.0F, 1.1345F, 0.0F));
		PartDefinition rearrightfoot = torso.addOrReplaceChild("rearrightfoot", CubeListBuilder.create(), PartPose.offset(-2.5F, 0.0F, 2.0F));
		PartDefinition cube_r4 = rearrightfoot.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(7, 12).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 1.9199F, 0.0F));
		PartDefinition frontleftfoot = torso.addOrReplaceChild("frontleftfoot", CubeListBuilder.create(), PartPose.offset(2.5F, 0.0F, -5.0F));
		PartDefinition cube_r5 = frontleftfoot.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(9, 7).addBox(0.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, 2.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition frontrightfoot = torso.addOrReplaceChild("frontrightfoot", CubeListBuilder.create(), PartPose.offset(-2.5F, 0.0F, -5.0F));
		PartDefinition cube_r6 = frontrightfoot.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(9, 7).addBox(0.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, 2.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(8, 4).addBox(-0.5F, 1.02F, 1.3F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, -0.5F, 1.5F));
		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(7, 3).addBox(0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.5F, -0.3491F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
	}
}
