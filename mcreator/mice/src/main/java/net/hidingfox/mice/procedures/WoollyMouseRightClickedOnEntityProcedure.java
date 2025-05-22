package net.hidingfox.mice.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.hidingfox.mice.entity.WoollyMouseEntity;

public class WoollyMouseRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SHEARS && entity instanceof WoollyMouseEntity _datEntL2 && _datEntL2.getEntityData().get(WoollyMouseEntity.DATA_IsWooled)
				&& !(entity instanceof LivingEntity _livEnt3 && _livEnt3.isBaby())) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.STRING));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).hurtAndBreak(1, _level, null, _stkprov -> {
				});
			}
			if (entity instanceof WoollyMouseEntity _datEntSetL)
				_datEntSetL.getEntityData().set(WoollyMouseEntity.DATA_IsWooled, false);
			if (entity instanceof WoollyMouseEntity _datEntSetI)
				_datEntSetI.getEntityData().set(WoollyMouseEntity.DATA_timesincesheared, 0);
		}
	}
}
