package net.hidingfox.mice.procedures;

import net.minecraft.world.entity.Entity;

import net.hidingfox.mice.entity.WoollyMouseEntity;

public class WoollyMouseDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof WoollyMouseEntity _datEntL0 && _datEntL0.getEntityData().get(WoollyMouseEntity.DATA_IsWooled)) == true;
	}
}
