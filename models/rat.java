// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class rata<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "rata"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart torso;
	private final ModelPart rearleftfoot;
	private final ModelPart rearrightfoot;
	private final ModelPart frontleftfoot;
	private final ModelPart frontrightfoot;
	private final ModelPart tail;

	public rata(ModelPart root) {
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

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(1, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(11, 1).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 12).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 17).addBox(0.5F, -1.7F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 17).addBox(-1.5F, -1.7F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, -1.5F, -8.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 4).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9502F, -1.7429F, 0.9805F, -0.0873F, 3.0543F, 2.5307F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(18, 4).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8695F, -1.7305F, 0.9855F, 0.0873F, -0.2618F, -0.9599F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(1, 12).addBox(-2.5F, -3.5F, -2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 5).addBox(-2.5F, -3.0F, 1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1, 5).addBox(-2.0F, -3.0F, -5.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 1.0F, -3.0F));

		PartDefinition rearleftfoot = torso.addOrReplaceChild("rearleftfoot", CubeListBuilder.create(), PartPose.offset(2.5F, 0.0F, 2.0F));

		PartDefinition cube_r3 = rearleftfoot.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(21, 0).addBox(-2.0F, 0.0F, -1.7F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition rearrightfoot = torso.addOrReplaceChild("rearrightfoot", CubeListBuilder.create(), PartPose.offset(-2.5F, 0.0F, 2.0F));

		PartDefinition cube_r4 = rearrightfoot.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(21, 0).addBox(-2.0F, 0.0F, -1.7F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -1.0F, 0.0F, 2.3562F, 0.0F));

		PartDefinition frontleftfoot = torso.addOrReplaceChild("frontleftfoot", CubeListBuilder.create(), PartPose.offset(2.5F, 0.0F, -5.0F));

		PartDefinition cube_r5 = frontleftfoot.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(21, 0).addBox(-2.0F, 0.0F, -1.7F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition frontrightfoot = torso.addOrReplaceChild("frontrightfoot", CubeListBuilder.create(), PartPose.offset(-2.5F, 0.0F, -5.0F));

		PartDefinition cube_r6 = frontrightfoot.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(21, 0).addBox(-2.0F, 0.0F, -1.7F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0F, 0.0F, 0.0F, 2.3562F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.5F, 1.5F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(14, 6).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -0.5F, -0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}