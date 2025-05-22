package net.hidingfox.mice.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.hidingfox.mice.entity.WoollyMouseEntity;
import net.hidingfox.mice.MiceMod;

import java.util.Comparator;

public class WoollyMouseOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		MiceMod.queueServerWork(20, () -> {
			if (entity instanceof WoollyMouseEntity _datEntSetI)
				_datEntSetI.getEntityData().set(WoollyMouseEntity.DATA_timesincesheared, (int) ((entity instanceof WoollyMouseEntity _datEntI ? _datEntI.getEntityData().get(WoollyMouseEntity.DATA_timesincesheared) : 0) + 1));
			if ((entity instanceof WoollyMouseEntity _datEntI ? _datEntI.getEntityData().get(WoollyMouseEntity.DATA_timesincesheared) : 0) >= 1000) {
				if (entity instanceof WoollyMouseEntity _datEntSetL)
					_datEntSetL.getEntityData().set(WoollyMouseEntity.DATA_IsWooled, true);
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					if ((entityiterator instanceof Cat || entityiterator instanceof Fox) && !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
						if (entityiterator instanceof Mob _entity && (findEntityInWorldRange(world, WoollyMouseEntity.class, x, y, z, 10)) instanceof LivingEntity _ent)
							_entity.setTarget(_ent);
					}
				}
			}
		});
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}
