package com.krithenmc.unnamedmod.keymapping;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.mojang.blaze3d.platform.InputConstants;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

public class ModKeyMappings {

    public static final KeyMapping KEYBIND = KeyMappingHelper.registerKeyMapping(
            new KeyMapping("key.unnamedmod.keybind", InputConstants.Type.KEYSYM,
                    GLFW.GLFW_KEY_J, KeyMapping.Category.MISC)
    );

    public static void register() {
        Unnamedmod.LOGGER.info("Registering ModKeyMappings for" + Unnamedmod.MOD_ID);
    }
}
