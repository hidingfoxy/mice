
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hidingfox.mice.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.hidingfox.mice.MiceMod;

public class MiceModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, MiceMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_MOUSE_SQUEAKS = REGISTRY.register("entity.mouse.squeaks", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mice", "entity.mouse.squeaks")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_MOUSE_HURTS = REGISTRY.register("entity.mouse.hurts", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mice", "entity.mouse.hurts")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_RAT_SQUEAKS = REGISTRY.register("entity.rat.squeaks", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mice", "entity.rat.squeaks")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_RAT_HURT = REGISTRY.register("entity.rat.hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mice", "entity.rat.hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_JERBOA_SQUEAKS = REGISTRY.register("entity.jerboa.squeaks", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mice", "entity.jerboa.squeaks")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_JERBOA_HURT = REGISTRY.register("entity.jerboa.hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mice", "entity.jerboa.hurt")));
}
