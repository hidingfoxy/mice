
package net.hidingfox.mice.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;

import net.hidingfox.mice.procedures.WoollyMouseDisplayConditionProcedure;
import net.hidingfox.mice.procedures.MousePlaybackConditionProcedure;
import net.hidingfox.mice.procedures.MouseModelVisualScaleProcedure;
import net.hidingfox.mice.entity.WoollyMouseEntity;
import net.hidingfox.mice.client.model.animations.woollymouseAnimation;
import net.hidingfox.mice.client.model.Modelwoollymouse;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WoollyMouseRenderer extends MobRenderer<WoollyMouseEntity, LivingEntityRenderState, Modelwoollymouse> {
	private WoollyMouseEntity entity = null;

	public WoollyMouseRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelwoollymouse.LAYER_LOCATION)), 0.3f);
		this.addLayer(new RenderLayer<>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mice:textures/entities/woollymouseshearedtexture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (WoollyMouseDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(state, 0));
				}
			}
		});
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(WoollyMouseEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("mice:textures/entities/woollymousetexture.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) MouseModelVisualScaleProcedure.execute(entity);
		poseStack.scale(scale, scale, scale);
	}

	private static final class AnimatedModel extends Modelwoollymouse {
		private WoollyMouseEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(WoollyMouseEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			if (MousePlaybackConditionProcedure.execute())
				this.animateWalk(woollymouseAnimation.walk, state.walkAnimationPos, state.walkAnimationSpeed, 4f, 5f);
			this.animate(entity.animationState1, woollymouseAnimation.run, state.ageInTicks, 4f);
			super.setupAnim(state);
		}
	}
}
