
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hidingfox.mice.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.hidingfox.mice.client.model.Modelwoollymouse;
import net.hidingfox.mice.client.model.Modelrata;
import net.hidingfox.mice.client.model.Modelmouse;
import net.hidingfox.mice.client.model.Modeljerboa;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MiceModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmouse.LAYER_LOCATION, Modelmouse::createBodyLayer);
		event.registerLayerDefinition(Modeljerboa.LAYER_LOCATION, Modeljerboa::createBodyLayer);
		event.registerLayerDefinition(Modelrata.LAYER_LOCATION, Modelrata::createBodyLayer);
		event.registerLayerDefinition(Modelwoollymouse.LAYER_LOCATION, Modelwoollymouse::createBodyLayer);
	}
}
