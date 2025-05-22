
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hidingfox.mice.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.hidingfox.mice.client.renderer.WoollyMouseRenderer;
import net.hidingfox.mice.client.renderer.RatRenderer;
import net.hidingfox.mice.client.renderer.MouseRenderer;
import net.hidingfox.mice.client.renderer.JerboaRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MiceModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MiceModEntities.MOUSE.get(), MouseRenderer::new);
		event.registerEntityRenderer(MiceModEntities.RAT.get(), RatRenderer::new);
		event.registerEntityRenderer(MiceModEntities.JERBOA.get(), JerboaRenderer::new);
		event.registerEntityRenderer(MiceModEntities.WOOLLY_MOUSE.get(), WoollyMouseRenderer::new);
	}
}
