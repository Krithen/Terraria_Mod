package com.krithenmc.unnamedmod.item.custom;

import com.geckolib.animatable.GeoAnimatable;
import com.geckolib.animatable.GeoItem;
import com.geckolib.animatable.client.GeoRenderProvider;
import com.geckolib.animatable.instance.AnimatableInstanceCache;
import com.geckolib.animatable.manager.AnimatableManager;
import com.geckolib.animation.AnimationController;
import com.geckolib.animation.RawAnimation;
import com.geckolib.animation.object.LoopType;
import com.geckolib.animation.object.PlayState;
import com.geckolib.cache.animation.Animation;
import com.geckolib.constant.DefaultAnimations;
import com.geckolib.renderer.GeoItemRenderer;
import com.geckolib.util.GeckoLibUtil;
import com.google.common.base.Suppliers;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jspecify.annotations.Nullable;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ShortSwordItem extends Item implements GeoItem {
    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);
    public ShortSwordItem(Properties properties) {
        super(properties);

        GeoItem.registerSyncedAnimatable(this);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(test -> {
            if (test.isMoving())
                return test.setAndContinue(DefaultAnimations.ATTACK_STRIKE);

            return PlayState.STOP;
        }));


    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.geoCache;
    }

    @Override
    public boolean isPerspectiveAware() {
        return true;
    }

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private final Supplier<GeoItemRenderer<ShortSwordItem>> renderer = Suppliers.memoize(() -> new GeoItemRenderer<>(ShortSwordItem.this));

            @Override
            public @Nullable GeoItemRenderer<?> getGeoItemRenderer() {
                return this.renderer.get();
            }
        });
    }
}
