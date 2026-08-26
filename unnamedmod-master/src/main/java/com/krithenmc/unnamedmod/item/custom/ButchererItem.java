package com.krithenmc.unnamedmod.item.custom;

import com.geckolib.animatable.GeoAnimatable;
import com.geckolib.animatable.GeoItem;
import com.geckolib.animatable.client.GeoRenderProvider;
import com.geckolib.animatable.instance.AnimatableInstanceCache;
import com.geckolib.animatable.manager.AnimatableManager;
import com.geckolib.animation.AnimationController;
import com.geckolib.animation.RawAnimation;
import com.geckolib.animation.object.LoopType;
import com.geckolib.cache.animation.Animation;
import com.geckolib.constant.DefaultAnimations;
import com.geckolib.renderer.GeoItemRenderer;
import com.geckolib.util.GeckoLibUtil;
import com.google.common.base.Suppliers;
import com.sun.jna.platform.unix.solaris.Kstat2StatusException;
import net.minecraft.world.item.Item;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.Pointer;

import java.util.Properties;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ButchererItem extends Item implements GeoItem {
    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

    public ButchererItem(Properties properties) {
        super(properties);

        GeoItem.registerSyncedAnimatable(this);
    }


    @Override
    public boolean isPerspectiveAware() {
        return GeoItem.super.isPerspectiveAware();
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {


    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.geoCache;
    }

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private final Supplier<GeoItemRenderer<ButchererItem>> renderer = Suppliers.memoize(() -> new GeoItemRenderer<>(ButchererItem.this));

            @Override
            public @Nullable GeoItemRenderer<?> getGeoItemRenderer() {
                return this.renderer.get();
            }
        });

    }


    }

