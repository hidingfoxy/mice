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
public class Modeljerboa extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mice", "modeljerboa"), "main");
	public final ModelPart root;
	public final ModelPart body;
	public final ModelPart torso;
	public final ModelPart head;
	public final ModelPart tail;
	public final ModelPart leftleg;
	public final ModelPart leftleg1;
	public final ModelPart leftleg2;
	public final ModelPart leftleg3;
	public final ModelPart rightleg;
	public final ModelPart rightleg1;
	public final ModelPart rightleg2;
	public final ModelPart rightleg3;

	public Modeljerboa(ModelPart root) {
		super(root);
		this.root = root.getChild("root");
		this.body = this.root.getChild("body");
		this.torso = this.body.getChild("torso");
		this.head = this.torso.getChild("head");
		this.tail = this.torso.getChild("tail");
		this.leftleg = this.body.getChild("leftleg");
		this.leftleg1 = this.leftleg.getChild("leftleg1");
		this.leftleg2 = this.leftleg1.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.rightleg = this.body.getChild("rightleg");
		this.rightleg1 = this.rightleg.getChild("rightleg1");
		this.rightleg2 = this.rightleg1.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 1.5F));
		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -2.5F, -2.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
				.addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(-2.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = torso.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 5).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0932F, -0.4368F, -1.8923F, -0.1222F, -0.6458F, -1.2217F));
		PartDefinition cube_r2 = torso.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 5).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0932F, -0.4368F, -1.8923F, 0.1222F, 0.6458F, 1.2217F));
		PartDefinition head = torso.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 2).addBox(0.0F, -0.4F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 9).addBox(-0.5F, -1.4F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -0.6F, -4.0F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 4).addBox(0.0F, -4.9F, 0.0F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.4F, 0.6F, 0.1745F, -2.3562F, -0.2618F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, 4).addBox(0.0F, -4.9F, 0.0F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2F, -1.4F, 0.6F, -0.1745F, -0.8727F, 0.2618F));
		PartDefinition tail = torso.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(4, 2).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 0).addBox(-0.5F, 2.7F, 4.3F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, -1.9F, 0.5F));
		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(4, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6F, 2.2F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(-2, 0).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2F, 7.1F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(-2, 0).addBox(-1.5F, 0.017F, 0.0294F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.7F, 6.2F, -0.0436F, -0.5236F, 1.5708F));
		PartDefinition leftleg = body.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offset(0.5F, 0.0F, 0.8F));
		PartDefinition leftleg1 = leftleg.addOrReplaceChild("leftleg1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.2F));
		PartDefinition cube_r8 = leftleg1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(4, 5).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, -0.1F, -0.2618F, 0.0F, 0.0F));
		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, 1.8F));
		PartDefinition cube_r9 = leftleg2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(3, 4).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5F, -2.6F, 0.5236F, 0.0F, 0.0F));
		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, -2.6F));
		PartDefinition cube_r10 = leftleg3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(-2, 4).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, 0.0F, -0.3491F, 0.0F));
		PartDefinition rightleg = body.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offset(-1.5F, 0.0F, 0.0F));
		PartDefinition rightleg1 = rightleg.addOrReplaceChild("rightleg1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition cube_r11 = rightleg1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(4, 5).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, -0.1F, -0.2618F, 0.0F, 0.0F));
		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, 1.8F));
		PartDefinition cube_r12 = rightleg2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(3, 4).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 1.5F, -2.6F, 0.5236F, 0.0F, 0.0F));
		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, -2.6F));
		PartDefinition cube_r13 = rightleg3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(-2, 4).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, 0.0F, 0.3491F, 0.0F));
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
