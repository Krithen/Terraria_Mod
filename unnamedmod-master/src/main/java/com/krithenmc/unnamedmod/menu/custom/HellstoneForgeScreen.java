package com.krithenmc.unnamedmod.menu.custom;

import com.krithenmc.unnamedmod.Unnamedmod;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Inventory;

public class HellstoneForgeScreen extends AbstractContainerScreen<HellstoneForgeMenu> {

    public static final Identifier TEXTURE = Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "textures/gui/hellstoneforge/hellstoneforge_gui.png");
    public HellstoneForgeScreen(HellstoneForgeMenu menu, Inventory inventory, Component title) {
        super(menu, inventory, title);
    }

    @Override
    public void extractBackground(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float a) {
        super.extractBackground(graphics, mouseX, mouseY, a);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        graphics.blit(RenderPipelines.GUI_TEXTURED, TEXTURE, x, y, 0, 0, imageWidth, imageHeight, 256, 256);
    }
}
