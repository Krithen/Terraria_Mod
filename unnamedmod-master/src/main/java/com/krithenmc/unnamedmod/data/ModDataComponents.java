package com.krithenmc.unnamedmod.data;

import com.krithenmc.unnamedmod.Unnamedmod;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

import java.util.function.UnaryOperator;

public class ModDataComponents {

    public static final DataComponentType<BlockPos> COORDINATES = register("coordinates",
            builder -> builder.persistent(BlockPos.CODEC).networkSynchronized(BlockPos.STREAM_CODEC));

    private static <T> DataComponentType<T> register(String name, UnaryOperator<DataComponentType.Builder<T>> builderOperator) {
        return Registry.register(BuiltInRegistries.DATA_COMPONENT_TYPE, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name),
                builderOperator.apply(DataComponentType.builder()).build());
    }
    public static void registerDataComponents() {
        Unnamedmod.LOGGER.info("Registering Date Components for " + Unnamedmod.MOD_ID);
    }
}
