package com.krithenmc.unnamedmod.block.entity;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.block.ModBlocks;
import com.krithenmc.unnamedmod.block.entity.custom.HellstoneForgeBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModBlockEntites {

    public static final BlockEntityType<HellstoneForgeBlockEntity> HELLSTONE_BE =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "hellstone_be"),
                    FabricBlockEntityTypeBuilder.create(HellstoneForgeBlockEntity::new, ModBlocks.HELLSTONE_FORGE).build());

    public static void registerBlockEntities() {
        Unnamedmod.LOGGER.info("registering ModBlockEntites for" + Unnamedmod.MOD_ID);
    }
}
