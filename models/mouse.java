// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class mouse<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "mouse"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart torso;
	private final ModelPart rearleftfoot;
	private final ModelPart rearrightfoot;
	private final ModelPart frontleftfoot;
	private final ModelPart frontrightfoot;
	private final ModelPart tail;

	public mouse(ModelPart root) {
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

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(4, 6).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 12).addBox(-0.5F, -0.9F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, -1.5F, -7.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(17, 4).addBox(-1.5F, -1.5F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6358F, -1.6222F, 0.7897F, -0.3491F, 0.3491F, -0.3491F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(17, 4).addBox(-1.5F, -1.5F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5642F, -1.3222F, 1.1897F, -0.3491F, -0.3491F, 0.3491F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(1, 11).addBox(-1.5F, -3.0F, -4.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 1.0F, -2.0F));

		PartDefinition rearleftfoot = torso.addOrReplaceChild("rearleftfoot", CubeListBuilder.create(), PartPose.offset(2.5F, 0.0F, 2.0F));

		PartDefinition cube_r3 = rearleftfoot.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 14).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.0F, 0.0F, 0.0F, 1.1345F, 0.0F));

		PartDefinition rearrightfoot = torso.addOrReplaceChild("rearrightfoot", CubeListBuilder.create(), PartPose.offset(-2.5F, 0.0F, 2.0F));

		PartDefinition cube_r4 = rearrightfoot.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(13, 14).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 1.9199F, 0.0F));

		PartDefinition frontleftfoot = torso.addOrReplaceChild("frontleftfoot", CubeListBuilder.create(), PartPose.offset(2.5F, 0.0F, -5.0F));

		PartDefinition cube_r5 = frontleftfoot.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 8).addBox(0.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 2.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition frontrightfoot = torso.addOrReplaceChild("frontrightfoot", CubeListBuilder.create(), PartPose.offset(-2.5F, 0.0F, -5.0F));

		PartDefinition cube_r6 = frontrightfoot.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 8).addBox(0.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 2.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(19, 11).addBox(-0.5F, 1.02F, 1.3F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, -0.5F, 1.5F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(18, 10).addBox(0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.5F, -0.3491F, 0.0F, 0.0F));

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