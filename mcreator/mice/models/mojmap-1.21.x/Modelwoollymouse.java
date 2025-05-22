// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelwoollymouse<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "woollymouse"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart torso;
	private final ModelPart rearleftfoot;
	private final ModelPart rearrightfoot;
	private final ModelPart frontleftfoot;
	private final ModelPart frontrightfoot;
	private final ModelPart tail;

	public Modelwoollymouse(ModelPart root) {
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

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 23.0F, 3.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(20, 6)
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 2)
						.addBox(-0.5F, -0.9F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, -1.5F, -7.0F));

		PartDefinition cube_r1 = head
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(25, 21).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, 0.9F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(21, 22).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -0.5F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(22, 4).addBox(-1.5F, -1.5F, 0.0F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6358F, -1.6222F, 0.7897F, -0.3491F, 0.3491F, -0.3491F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(22, 4).addBox(-1.5F, -1.5F, 0.0F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5642F, -1.3222F, 1.1897F, -0.3491F, -0.3491F, 0.3491F));

		PartDefinition torso = body.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(4, 12)
						.addBox(-2.0F, -5.0F, -3.6F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -4.0F, -4.5F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 24)
						.addBox(-1.5F, -3.0F, -4.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 1.0F, -2.0F));

		PartDefinition cube_r5 = torso.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(4, 12).addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -3.5F, -3.6F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r6 = torso.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -4.5F, -4.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r7 = torso.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -5.0F, -0.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r8 = torso.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(8, 13).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -4.0F, 1.0F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r9 = torso.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(4, 12).addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -4.9F, -2.0F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r10 = torso.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(4, 12).addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -4.9F, -1.0F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r11 = torso.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(4, 14).addBox(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.9F, -4.5F, -1.5708F, -1.5708F, 1.5708F));

		PartDefinition cube_r12 = torso.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -4.9F, -2.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r13 = torso.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(4, 12)
						.addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 12)
						.addBox(0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, -2.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r14 = torso.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(4, 12).addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.5F, -1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r15 = torso.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(4, 12).addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, -1.5F, -1.5708F, 0.0F, -3.1416F));

		PartDefinition cube_r16 = torso.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(4, 12).addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -2.0F, -1.5F, -1.5708F, 0.0F, -3.1416F));

		PartDefinition cube_r17 = torso.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(4, 12)
						.addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 12)
						.addBox(0.0F, -1.5F, -3.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -2.0F, 0.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r18 = torso.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(4, 12).addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -2.5F, -1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition rearleftfoot = torso.addOrReplaceChild("rearleftfoot", CubeListBuilder.create(),
				PartPose.offset(2.5F, 0.0F, 2.0F));

		PartDefinition cube_r19 = rearleftfoot
				.addOrReplaceChild("cube_r19",
						CubeListBuilder.create().texOffs(21, 1).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-1.2F, 0.0F, 0.0F, 0.0F, 1.1345F, 0.0F));

		PartDefinition rearrightfoot = torso.addOrReplaceChild("rearrightfoot", CubeListBuilder.create(),
				PartPose.offset(-2.5F, 0.0F, 2.0F));

		PartDefinition cube_r20 = rearrightfoot
				.addOrReplaceChild("cube_r20",
						CubeListBuilder.create().texOffs(21, 1).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 1.9199F, 0.0F));

		PartDefinition frontleftfoot = torso.addOrReplaceChild("frontleftfoot", CubeListBuilder.create(),
				PartPose.offset(2.5F, 0.0F, -5.0F));

		PartDefinition cube_r21 = frontleftfoot
				.addOrReplaceChild("cube_r21",
						CubeListBuilder.create().texOffs(24, 6).addBox(0.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-0.5F, 0.0F, 2.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition frontrightfoot = torso.addOrReplaceChild("frontrightfoot", CubeListBuilder.create(),
				PartPose.offset(-2.5F, 0.0F, -5.0F));

		PartDefinition cube_r22 = frontrightfoot
				.addOrReplaceChild("cube_r22",
						CubeListBuilder.create().texOffs(24, 6).addBox(0.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.5F, 0.0F, 2.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(24, 2).addBox(-0.5F,
				1.02F, 1.3F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, -0.5F, 1.5F));

		PartDefinition cube_r23 = tail.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(22, 2).addBox(0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, -1.5F, -0.3491F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
	}
}