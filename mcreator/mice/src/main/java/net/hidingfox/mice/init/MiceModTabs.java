
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hidingfox.mice.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.hidingfox.mice.MiceMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class MiceModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MiceMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(MiceModItems.MOUSE_SPAWN_EGG.get());
			tabData.accept(MiceModItems.RAT_SPAWN_EGG.get());
			tabData.accept(MiceModItems.JERBOA_SPAWN_EGG.get());
			tabData.accept(MiceModItems.WOOLLY_MOUSE_SPAWN_EGG.get());
		}
	}
}
