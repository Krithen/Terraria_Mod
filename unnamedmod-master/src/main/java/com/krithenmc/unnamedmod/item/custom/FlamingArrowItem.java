package com.krithenmc.unnamedmod.item.custom;

import com.krithenmc.unnamedmod.entities.custom.FlamingArrowEntity;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileItem;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.Nullable;

public class FlamingArrowItem extends ArrowItem implements ProjectileItem {
    public FlamingArrowItem(Properties properties) {
        super(properties);
    }

    public AbstractArrow createFlamingArrow(final Level level, final ItemStack itemStack, final LivingEntity owner, final @Nullable ItemStack firedFromWeapon) {
        return new FlamingArrowEntity(level, owner, itemStack.copyWithCount(1), firedFromWeapon);
    }

    @Override
    public Projectile asProjectile(Level level, Position position, ItemStack itemStack, Direction direction) {
        FlamingArrowEntity flamingArrow = new FlamingArrowEntity(level, position.x(), position.y(), position.z(), itemStack.copyWithCount(1), (ItemStack) null  );
        flamingArrow.pickup = AbstractArrow.Pickup.ALLOWED;
        return flamingArrow;
    }
}
