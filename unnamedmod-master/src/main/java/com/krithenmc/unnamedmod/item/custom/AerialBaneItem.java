package com.krithenmc.unnamedmod.item.custom;

import com.krithenmc.unnamedmod.tags.ModTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.Nullable;

import java.util.List;
import java.util.function.Predicate;

public class AerialBaneItem extends ProjectileWeaponItem {
    public static final Predicate<ItemStack> ARROWS = (itemStack) -> itemStack.is(ModTags.Items.ARROWS);
    private float damage;
    private final int range;
    private final int useTime;
    private final float drawTime;

    public AerialBaneItem(Properties properties, float damage, int range, int useTime, float drawTime) {

        super(properties);
        this.damage = damage;
        this.range = range;
        this.useTime = useTime;
        this.drawTime = drawTime;
    }

    public boolean releaseUsing(final ItemStack itemStack, final Level level, final LivingEntity entity, final int remainingTime) {
        if (entity instanceof Player player) {
            ItemStack projectile = player.getProjectile(itemStack);
            if (projectile.isEmpty()) {
                return false;
            } else {
                int timeHeld = this.getUseDuration(itemStack, entity) - remainingTime;
                float pow = this.damage;
                if ((int)timeHeld <= drawTime) {
                    return false;
                } else {
                    List<ItemStack> firedProjectiles = draw(itemStack, projectile, player);
                    if (level instanceof ServerLevel) {
                        ServerLevel serverLevel = (ServerLevel)level;
                        if (!firedProjectiles.isEmpty()) {
                            this.shoot(serverLevel, player, player.getUsedItemHand(), itemStack, firedProjectiles, this.damage, 1.0F, pow == 1.0f, (LivingEntity)null);
                        }
                    }

                    level.playSound((Entity)null, player.getX(), player.getY(), player.getZ(), SoundEvents.ARROW_SHOOT, SoundSource.PLAYERS, 1.0F, 1.0F / (level.getRandom().nextFloat() * 0.4F + 1.2F) + pow * 0.5F);
                    player.awardStat(Stats.ITEM_USED.get(this));
                    return true;
                }
            }
        } else {
            return false;
        }
    }

    public void shootProjectile(final LivingEntity shooter, final Projectile projectileEntity, final int index, final float power, final float uncertainty, final float angle, final @Nullable LivingEntity targetOverrride) {
        projectileEntity.shootFromRotation(shooter, shooter.getXRot(), shooter.getYRot() + angle, 0.0F, this.damage, uncertainty);
    }

    public float getPowerForTime(final int timeHeld) {
        float damage = this.damage;
        return damage;
    }

    @Override
    protected Projectile createProjectile(Level level, LivingEntity shooter, ItemStack weapon, ItemStack projectile, boolean isCrit) {
        Item var8 = projectile.getItem();
        ArrowItem var10000;
        if (var8 instanceof FlamingArrowItem flamingArrowItem) {
            var10000 = flamingArrowItem;
            ArrowItem arrowItem = var10000;
            AbstractArrow arrow = flamingArrowItem.createFlamingArrow(level, projectile, shooter, weapon);
            if (isCrit) {
                arrow.setCritArrow(true);
            }
            return arrow;
        } else if (var8 instanceof ArrowItem arrowItem){
            var10000 = arrowItem;
            AbstractArrow arrow = arrowItem.createArrow(level, projectile, shooter, weapon);
            if (isCrit) {
                arrow.setCritArrow(true);
            }
            return arrow;
        } else return null;
    }

    public int getUseDuration(final ItemStack itemStack, final LivingEntity user) {
        return this.useTime;
    }

    public ItemUseAnimation getUseAnimation(final ItemStack itemStack) {
        return ItemUseAnimation.BOW;
    }

    public InteractionResult use(final Level level, final Player player, final InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        boolean foundProjectile = !player.getProjectile(itemStack).isEmpty();
        if (!player.hasInfiniteMaterials() && !foundProjectile) {
            return InteractionResult.FAIL;
        } else {
            player.startUsingItem(hand);
            return InteractionResult.CONSUME;
        }
    }

    public Predicate<ItemStack> getAllSupportedProjectiles() {
        return ARROW_ONLY;
    }

    public int getDefaultProjectileRange() {
        return this.range;
    }
}
