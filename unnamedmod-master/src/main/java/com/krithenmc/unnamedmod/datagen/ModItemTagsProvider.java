package com.krithenmc.unnamedmod.datagen;

import com.krithenmc.unnamedmod.item.ModItems;
import com.krithenmc.unnamedmod.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {

        //valueLookupBuilder(ModTags.Items.(Tag)
        //.add(Items.(Item)

        super(output, registryLookupFuture);
    }





    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(ItemTags.SWORDS).add(ModItems.getRK(ModItems.LIGHTS_BANE))
                .add(ModItems.getRK(ModItems.THE_VOLCANO))
                .add(ModItems.getRK(ModItems.BASIC_HELLSTONE_SWORD))
                .add(ModItems.getRK(ModItems.ADVANCED_HELLSTONE_SWORD))
                .add(ModItems.getRK(ModItems.BLADE_OF_GRASS))
                .add(ModItems.getRK(ModItems.MURAMASA))
                .add(ModItems.getRK(ModItems.IRON_BROADSWORD));
        tag(ItemTags.PICKAXES).add(ModItems.getRK(ModItems.NIGHTMARE_PICKAXE));
        tag(ItemTags.SHOVELS).add(ModItems.getRK(ModItems.NIGHTMARE_SHOVEL));
        tag(ItemTags.SPEARS).add(ModItems.getRK(ModItems.GUNGNIR));
        tag(ItemTags.AXES).add(ModItems.getRK(ModItems.WAR_AXE_OF_THE_NIGHT));

        tag(ModTags.Items.DEMONITE_REPAIR)
                .add(ModItems.getRK(ModItems.DEMONITE_BAR))
                .add(ModItems.getRK(ModItems.SHADOW_SCALE));

        tag(ModTags.Items.HALLOWED_REPAIR)
                .add(ModItems.getRK(ModItems.HALLOWED_BAR));

        tag(ModTags.Items.CRIMTANE_REPAIR)
                .add(ModItems.getRK(ModItems.CRIMTANE_BAR));

        tag(ModTags.Items.HELLSTONE_REPAIR)
                .add(ModItems.getRK(ModItems.HELLSTONE_BAR));


    }
}
