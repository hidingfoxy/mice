
package net.hidingfox.mice.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;

import net.hidingfox.mice.procedures.MouseModelVisualScaleProcedure;
import net.hidingfox.mice.entity.RatEntity;
import net.hidingfox.mice.client.model.animations.ratAnimation;
import net.hidingfox.mice.client.model.Modelrata;

import com.mojang.blaze3d.vertex.PoseStack;

public class RatRenderer extends MobRenderer<RatEntity, LivingEntityRenderState, Modelrata> {
	private RatEntity entity = null;

	public RatRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelrata.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(RatEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("mice:textures/entities/rattexture.png");
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

	private static final class AnimatedModel extends Modelrata {
		private RatEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(RatEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animateWalk(ratAnimation.walk, state.walkAnimationPos, state.walkAnimationSpeed, 6f, 4f);
			this.animate(entity.animationState1, ratAnimation.run, state.ageInTicks, 3f);
			super.setupAnim(state);
		}
	}
}
