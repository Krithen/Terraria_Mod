package com.krithenmc.unnamedmod.entities.custom;

import com.geckolib.animatable.GeoEntity;
import com.geckolib.animatable.instance.AnimatableInstanceCache;
import com.geckolib.animatable.manager.AnimatableManager;
import com.geckolib.animation.AnimationController;
import com.geckolib.constant.DefaultAnimations;
import com.geckolib.util.GeckoLibUtil;
import com.krithenmc.unnamedmod.entities.variant.DemonEyeVariant;
import net.minecraft.core.BlockPos;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Util;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.util.AirAndWaterRandomPos;
import net.minecraft.world.entity.ai.util.HoverRandomPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Random;

public class CrimeraEntity extends PathfinderMob implements GeoEntity {
    public static final int TICKS_PER_FLAP = Mth.ceil(1.4959966F);
    private @Nullable Vec3 hoverPos;
    private static final EntityDataAccessor<Integer> VARIANT =
            SynchedEntityData.defineId(CrimeraEntity.class, EntityDataSerializers.INT);

    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);
    public CrimeraEntity(EntityType<? extends PathfinderMob> type, Level level) {

        super(type, level);
        this.moveControl = new FlyingMoveControl(this, 10, true);

    }


    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1, true));
        this.goalSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.goalSelector.addGoal(1, new RandomStrollGoal(this, 0.8, 20) {
            @Override
            protected Vec3 getPosition() {
                RandomSource random = CrimeraEntity.this.getRandom();
                double dir_x = CrimeraEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
                double dir_y = CrimeraEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
                double dir_z = CrimeraEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
                return new Vec3(dir_x, dir_y, dir_z);
            }});

        this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, 6.0f));

    }

    @Override
    public void aiStep() {
        super.aiStep();
        this.setNoGravity(true);
    }

    public static AttributeSupplier.Builder createAttributes() {
        Random random = new Random();
        int scale = random.nextInt(1, 2);
        return PathfinderMob.createLivingAttributes()
                .add(Attributes.FOLLOW_RANGE, 60)
                .add(Attributes.MAX_HEALTH, 40)
                .add(Attributes.ATTACK_DAMAGE, 22)
                .add(Attributes.MOVEMENT_SPEED, 0.25f)
                .add(Attributes.FLYING_SPEED, 0.8)
                .add(Attributes.SAFE_FALL_DISTANCE, 300)
                ;
    }

    protected PathNavigation createNavigation(final Level level) {
        FlyingPathNavigation flyingPathNavigation = new FlyingPathNavigation(this, level) {
            public boolean isStableDestination(final BlockPos pos) {
                return this.level.getBlockState(pos.below()).isAir();
            }

            public void tick() {
                    super.tick();

            }
        };
        flyingPathNavigation.setCanOpenDoors(false);
        flyingPathNavigation.setCanFloat(true);
        flyingPathNavigation.setRequiredPathLength(48.0F);
        flyingPathNavigation.canNavigateGround();
        return flyingPathNavigation;
    }

    @Override
    public boolean isNoGravity() {
        return true;
    }


    public boolean isFlapping() {
        return this.isFlying() && this.tickCount % TICKS_PER_FLAP == 0;
    }

    public boolean isFlying() {
        return !this.onGround();
    }


    protected boolean omnidirectionalAirMover() {
        return true;
    }

    /*@Override
    public MoveControl getMoveControl() {
        return DemonEyeEntity.this.getMoveControl().setWantedPosition(this.hoverPos.x(), this.hoverPos.y(), this.hoverPos.z(), (double)0.35F);
    }

    private void setWantedPosition() {
        DemonEyeEntity.this.getMoveControl().setWantedPosition(this.hoverPos.x(), this.hoverPos.y(), this.hoverPos.z(), (double)0.35F);
    }*/

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(test -> {
            if (test.isMoving())
                return test.setAndContinue(DefaultAnimations.FLY);

            return test.setAndContinue(DefaultAnimations.IDLE);
        }));

    }



    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.geoCache;
    }

    private class DemonEyeWanderGoal extends Goal {
        public DemonEyeWanderGoal() {
            Objects.requireNonNull(CrimeraEntity.this  );
            super();
            this.setFlags(EnumSet.of(Flag.MOVE));
        }

        @Override
        public boolean canUse() {

            return CrimeraEntity.this.navigation.isDone();
        }

        private boolean pathfindDirectlyTowards(final BlockPos targetPos) {
            CrimeraEntity.this.navigation.moveTo(targetPos.getX(), targetPos.getY(), targetPos.getZ(), 1.0F);
            return CrimeraEntity.this.navigation.getPath() != null && CrimeraEntity.this.navigation.getPath().canReach();

        }

        @Override
        public boolean canContinueToUse() {
            return CrimeraEntity.this.navigation.isInProgress();
        }

        public void start() {
            Vec3 targetPos = this.getPosition();
            if (targetPos != null) {
                CrimeraEntity.this.navigation.moveTo(CrimeraEntity.this.navigation.createPath(BlockPos.containing(targetPos), 2), 1.0F);
            }
        }

        protected @Nullable Vec3 getPosition() {
            Vec3 wanderDirection = CrimeraEntity.this.getViewVector(1);
            int xzDist = 8;
            Vec3 groundBasedPosition = HoverRandomPos.getPos(CrimeraEntity.this, xzDist, xzDist, wanderDirection.x, wanderDirection.z, ((float)Math.PI / 2F), 3, 1);
            return groundBasedPosition != null ? groundBasedPosition : AirAndWaterRandomPos.getPos(CrimeraEntity.this, xzDist, xzDist, 0, wanderDirection.x, wanderDirection.z, ((float)Math.PI / 2F));
        }

    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder entityData) {
        super.defineSynchedData(entityData);
        entityData.define(VARIANT, 0);
    }

    private int getTypeVariant() {
        return this.entityData.get(VARIANT);
    }

    public DemonEyeVariant getVariant() {
        return DemonEyeVariant.byId(this.getTypeVariant());
    }

    private void setVariant(DemonEyeVariant variant) {
        this.entityData.set(VARIANT, variant.getId());
    }

    @Override
    protected void addAdditionalSaveData(ValueOutput output) {
        super.addAdditionalSaveData(output);
        output.putInt("Variant", this.getTypeVariant());
    }

    @Override
    protected void readAdditionalSaveData(ValueInput input) {
        super.readAdditionalSaveData(input);
        this.entityData.set(VARIANT, input.getIntOr("Variant", 0));
    }

    @Override
    public @Nullable SpawnGroupData finalizeSpawn(ServerLevelAccessor level,
                                                  DifficultyInstance difficulty, EntitySpawnReason spawnReason, @Nullable SpawnGroupData groupData) {
        DemonEyeVariant variant = Util.getRandom(DemonEyeVariant.values(), this.random);
        this.setVariant(variant);

        return super.finalizeSpawn(level, difficulty, spawnReason, groupData);
    }
}
