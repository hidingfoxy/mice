package net.hidingfox.mice.procedures;

import net.minecraft.world.entity.Entity;

public class MouseRunPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.isSprinting();
	}
}
