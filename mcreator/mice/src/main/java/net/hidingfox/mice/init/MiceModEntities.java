
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hidingfox.mice.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.hidingfox.mice.entity.WoollyMouseEntity;
import net.hidingfox.mice.entity.RatEntity;
import net.hidingfox.mice.entity.MouseEntity;
import net.hidingfox.mice.entity.JerboaEntity;
import net.hidingfox.mice.MiceMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class MiceModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, MiceMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<MouseEntity>> MOUSE = register("mouse",
			EntityType.Builder.<MouseEntity>of(MouseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(16).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RatEntity>> RAT = register("rat", EntityType.Builder.<RatEntity>of(RatEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(16).setUpdateInterval(3)

			.sized(0.3f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<JerboaEntity>> JERBOA = register("jerboa",
			EntityType.Builder.<JerboaEntity>of(JerboaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(16).setUpdateInterval(3)

					.sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<WoollyMouseEntity>> WOOLLY_MOUSE = register("woolly_mouse",
			EntityType.Builder.<WoollyMouseEntity>of(WoollyMouseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(16).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(MiceMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		MouseEntity.init(event);
		RatEntity.init(event);
		JerboaEntity.init(event);
		WoollyMouseEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MOUSE.get(), MouseEntity.createAttributes().build());
		event.put(RAT.get(), RatEntity.createAttributes().build());
		event.put(JERBOA.get(), JerboaEntity.createAttributes().build());
		event.put(WOOLLY_MOUSE.get(), WoollyMouseEntity.createAttributes().build());
	}
}
