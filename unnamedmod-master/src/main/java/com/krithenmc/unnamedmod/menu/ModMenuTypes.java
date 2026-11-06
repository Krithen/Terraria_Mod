package com.krithenmc.unnamedmod.menu;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.menu.custom.HellstoneForgeMenu;
import net.fabricmc.fabric.api.menu.v1.ExtendedMenuType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.inventory.MenuType;

public class ModMenuTypes {
    public static final MenuType<HellstoneForgeMenu> HELLSTONE_FORGE_MENU =
            Registry.register(BuiltInRegistries.MENU, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "hellstone_forge_menu"),
            new ExtendedMenuType<>(HellstoneForgeMenu::new, BlockPos.STREAM_CODEC));

    public static void registerModMenuTypes() {
        Unnamedmod.LOGGER.info("Registering ModMenuTypes for " + Unnamedmod.MOD_ID);
    }
}
