package com.krithenmc.unnamedmod.item.custom;

import com.geckolib.animatable.GeoItem;
import com.geckolib.animatable.client.GeoRenderProvider;
import com.geckolib.animatable.instance.AnimatableInstanceCache;
import com.geckolib.animatable.manager.AnimatableManager;
import com.geckolib.animation.AnimationController;
import com.geckolib.animation.object.PlayState;
import com.geckolib.constant.DefaultAnimations;
import com.geckolib.renderer.GeoItemRenderer;
import com.geckolib.util.GeckoLibUtil;
import com.google.common.base.Suppliers;
import com.krithenmc.unnamedmod.block.ModBlocks;
import com.krithenmc.unnamedmod.data.ModDataComponents;
import com.krithenmc.unnamedmod.stat.ModStats;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jspecify.annotations.Nullable;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class HammerItem extends Item implements GeoItem {
    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

    private static final Map<Block, Block> HAMMER_MAP =
            Map.of(
                    Blocks.ANDESITE, Blocks.ANDESITE_STAIRS,
                    Blocks.ANDESITE_STAIRS, Blocks.ANDESITE_SLAB,
                    Blocks.ANDESITE_SLAB, Blocks.ANDESITE,
                    Blocks.POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE_STAIRS,
                    Blocks.POLISHED_ANDESITE_STAIRS, Blocks.POLISHED_ANDESITE_SLAB,
                    Blocks.POLISHED_ANDESITE_SLAB, Blocks.POLISHED_ANDESITE,
                    ModBlocks.SHADEWOOD_PLANK, ModBlocks.SHADEWOOD_STAIRS,
                    ModBlocks.SHADEWOOD_STAIRS, ModBlocks.SHADEWOOD_SLAB,
                    ModBlocks.SHADEWOOD_SLAB, ModBlocks.SHADEWOOD_PLANK



            );

    public HammerItem(Properties properties) {
        super(properties);

        GeoItem.registerSyncedAnimatable(this);

    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        if (player.isCrouching()) {
            player.getMainHandItem().remove(ModDataComponents.COORDINATES);
            return InteractionResult.SUCCESS;
        }
        return super.use(level, player, hand);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {

        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if (HAMMER_MAP.containsKey(clickedBlock) && !level.isClientSide()) {
            level.setBlockAndUpdate(context.getClickedPos(), HAMMER_MAP.get(clickedBlock).defaultBlockState());

            context.getItemInHand().hurtAndBreak(1, context.getPlayer(), context.getHand());

            context.getItemInHand().set(ModDataComponents.COORDINATES, context.getClickedPos());
            context.getPlayer().awardStat(ModStats.HAMMER_USED_STAT, 1);
        }


        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {

        if (Minecraft.getInstance().hasShiftDown()) {
            builder.accept(Component.translatable("tooltip.unnamedmod.hammer.shift_down"));

        } else {
            builder.accept(Component.translatable("tooltip.unnamedmod.hammer"));

        }

        if (itemStack.has(ModDataComponents.COORDINATES)) {
            builder.accept(Component.literal("Last Block Hammered At" + itemStack.get(ModDataComponents.COORDINATES)));
        }



        super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
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
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private final Supplier<GeoItemRenderer<HammerItem>> renderer = Suppliers.memoize(() -> new GeoItemRenderer<>(HammerItem.this));

            @Override
            public @Nullable GeoItemRenderer<?> getGeoItemRenderer() {
                return this.renderer.get();
            }
        });
    }





}
