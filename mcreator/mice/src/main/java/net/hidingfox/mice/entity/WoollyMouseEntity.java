
package net.hidingfox.mice.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.animal.Ocelot;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.BreedGoal;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.BuiltInRegistries;

import net.hidingfox.mice.procedures.WoollyMouseRightClickedOnEntityProcedure;
import net.hidingfox.mice.procedures.WoollyMouseOnEntityTickUpdateProcedure;
import net.hidingfox.mice.procedures.MouseRunPlaybackConditionProcedure;
import net.hidingfox.mice.init.MiceModEntities;

public class WoollyMouseEntity extends Animal {
	public static final EntityDataAccessor<Boolean> DATA_IsWooled = SynchedEntityData.defineId(WoollyMouseEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Integer> DATA_timesincesheared = SynchedEntityData.defineId(WoollyMouseEntity.class, EntityDataSerializers.INT);
	public final AnimationState animationState1 = new AnimationState();

	public WoollyMouseEntity(EntityType<WoollyMouseEntity> type, Level world) {
		super(type, world);
		xpReward = 1;
		setNoAi(false);
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_IsWooled, true);
		builder.define(DATA_timesincesheared, 0);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new PanicGoal(this, 1.2));
		this.goalSelector.addGoal(2, new AvoidEntityGoal<>(this, Cat.class, (float) 10, 1.2, 1.2));
		this.goalSelector.addGoal(3, new AvoidEntityGoal<>(this, Ocelot.class, (float) 10, 1.2, 1.2));
		this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, Fox.class, (float) 10, 1.2, 1.2));
		this.goalSelector.addGoal(5, new BreedGoal(this, 1));
		this.goalSelector.addGoal(6, new TemptGoal(this, 1, Ingredient.of(Items.WHEAT_SEEDS), false));
		this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 0.5));
		this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(9, new FloatGoal(this));
		this.goalSelector.addGoal(10, new RemoveBlockGoal(Blocks.TALL_GRASS, this, 1, (int) 3));
	}

	@Override
	public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("mice:entity.mouse.squeaks"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("mice:entity.mouse.hurts"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.generic.death"));
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putBoolean("DataIsWooled", this.entityData.get(DATA_IsWooled));
		compound.putInt("Datatimesincesheared", this.entityData.get(DATA_timesincesheared));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("DataIsWooled"))
			this.entityData.set(DATA_IsWooled, compound.getBoolean("DataIsWooled"));
		if (compound.contains("Datatimesincesheared"))
			this.entityData.set(DATA_timesincesheared, compound.getInt("Datatimesincesheared"));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.SUCCESS;
		super.mobInteract(sourceentity, hand);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level();

		WoollyMouseRightClickedOnEntityProcedure.execute(world, entity, sourceentity);
		return retval;
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState1.animateWhen(MouseRunPlaybackConditionProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		WoollyMouseOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		WoollyMouseEntity retval = MiceModEntities.WOOLLY_MOUSE.get().create(serverWorld, EntitySpawnReason.BREEDING);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), EntitySpawnReason.BREEDING, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(Items.WHEAT_SEEDS, Items.PUMPKIN_SEEDS, Items.MELON_SEEDS, Items.BEETROOT_SEEDS).test(stack);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(MiceModEntities.WOOLLY_MOUSE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8), RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 2);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 1);
		builder = builder.add(Attributes.FOLLOW_RANGE, 6);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		builder = builder.add(Attributes.TEMPT_RANGE, 10);
		return builder;
	}
}
