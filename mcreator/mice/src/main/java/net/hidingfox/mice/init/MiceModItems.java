
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hidingfox.mice.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;

import net.hidingfox.mice.MiceMod;

import java.util.function.Function;

public class MiceModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MiceMod.MODID);
	public static final DeferredItem<Item> MOUSE_SPAWN_EGG = register("mouse_spawn_egg", properties -> new SpawnEggItem(MiceModEntities.MOUSE.get(), properties));
	public static final DeferredItem<Item> RAT_SPAWN_EGG = register("rat_spawn_egg", properties -> new SpawnEggItem(MiceModEntities.RAT.get(), properties));
	public static final DeferredItem<Item> JERBOA_SPAWN_EGG = register("jerboa_spawn_egg", properties -> new SpawnEggItem(MiceModEntities.JERBOA.get(), properties));
	public static final DeferredItem<Item> WOOLLY_MOUSE_SPAWN_EGG = register("woolly_mouse_spawn_egg", properties -> new SpawnEggItem(MiceModEntities.WOOLLY_MOUSE.get(), properties));

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}
