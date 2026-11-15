package com.krithenmc.unnamedmod.entities.custom;

import com.krithenmc.unnamedmod.entities.ModEntities;
import com.krithenmc.unnamedmod.item.ModItems;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SpellParticleOption;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.Nullable;

public class FlamingArrowEntity extends AbstractArrow {

    public FlamingArrowEntity(final Level level, final double x, final double y, final double z, final ItemStack pickupItemStack, final @Nullable ItemStack firedFromWeapon) {
        super(ModEntities.FLAMING_ARROW, x, y, z, level, pickupItemStack, firedFromWeapon);
    }

    public FlamingArrowEntity(final Level level, final LivingEntity owner, final ItemStack pickupItemStack, final @Nullable ItemStack firedFromWeapon) {
        super(ModEntities.FLAMING_ARROW, owner, level, pickupItemStack, firedFromWeapon);
    }

    public FlamingArrowEntity(EntityType<? extends FlamingArrowEntity> type, Level level) {
        super(type, level);
    }

    public void tick() {
        super.tick();
        if (this.level().isClientSide() && !this.isInGround()) {
            this.level().addParticle(SpellParticleOption.create(ParticleTypes.EFFECT, -1, 1.0F), this.getX(), this.getY(), this.getZ(), (double)0.0F, (double)0.0F, (double)0.0F);
        }

    }

    @Override
    public boolean isNoPhysics() {
        return false;
    }

    /*@Override
    protected void onHitEntity(EntityHitResult hitResult) {
        super.onHitEntity(hitResult);

        if (!level().isClientSide()) {
            hitResult.getEntity().igniteForSeconds(3);
        }
    }*/

    @Override
    protected void doPostHurtEffects(LivingEntity mob) {
        super.doPostHurtEffects(mob);


        if (!level().isClientSide()) {
            mob.igniteForSeconds(3);
        }
    }

    protected ItemStack getDefaultPickupItem() {
        return new ItemStack(ModItems.FLAMING_ARROW);
    }

    protected void setPickupItemStack(final ItemStack itemStack) {
        super.setPickupItemStack(itemStack);
    }
}
