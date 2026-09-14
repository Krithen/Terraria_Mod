package com.krithenmc.unnamedmod.datagen;
import com.krithenmc.unnamedmod.item.ModItems;
import com.krithenmc.unnamedmod.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.references.ItemIds;
import net.minecraft.tags.ItemTags;


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
                .add(ModItems.getRK(ModItems.IRON_BROADSWORD))
                .add(ModItems.getRK(ModItems.AREADBHAR))
                .add(ModItems.getRK(ModItems.BEE_KEEPER))
                .add(ModItems.getRK(ModItems.CANDY_CANE_SWORD))
                .add(ModItems.getRK(ModItems.EXOTIC_SCIMITAR))
                .add(ModItems.getRK(ModItems.ICE_BLADE))
                .add(ModItems.getRK(ModItems.TERRARIA_KATANA))
                .add(ModItems.getRK(ModItems.PURPLE_CLUBBERFISH))
                .add(ModItems.getRK(ModItems.TENTACLE_SPIKE))
                .add(ModItems.getRK(ModItems.IRON_SHORTSWORD))
                .add(ModItems.getRK(ModItems.LEAD_SHORTSWORD))
                .add(ModItems.getRK(ModItems.SILVER_SHORTSWORD))
                .add(ModItems.getRK(ModItems.TIN_SHORTSWORD))
                .add(ModItems.getRK(ModItems.TUNGSTEN_SHORTSWORD))
                .add(ModItems.getRK(ModItems.STARFURY))
                .add(ModItems.getRK(ModItems.PALLADIUM_SWORD))
                .add(ModItems.getRK(ModItems.ICE_SICKLE))
                .add(ModItems.getRK(ModItems.BONE_SWORD))
                .add(ModItems.getRK(ModItems.BRAND_OF_THE_INFERNO))
                .add(ModItems.getRK(ModItems.COBALT_SWORD))
                .add(ModItems.getRK(ModItems.MYTHRIL_SWORD))
                .add(ModItems.getRK(ModItems.ORICHALCUM_SWORD))
                .add(ModItems.getRK(ModItems.GLADIUS))
                .add(ModItems.getRK(ModItems.ADAMANTITE_SWORD))
                .add(ModItems.getRK(ModItems.BEAM_SWORD))

        ;
        tag(ItemTags.PICKAXES)
                .add(ModItems.getRK(ModItems.NIGHTMARE_PICKAXE))
                .add(ModItems.getRK(ModItems.BONE_PICKAXE))
                .add(ModItems.getRK(ModItems.CACTUS_PICKAXE))
                .add(ModItems.getRK(ModItems.FOSSIL_PICKAXE))
                .add(ModItems.getRK(ModItems.LEAD_PICKAXE))
                .add(ModItems.getRK(ModItems.COBALT_PICKAXE))
                .add(ModItems.getRK(ModItems.DEATHBRINGER_PICKAXE))
                .add(ModItems.getRK(ModItems.MOLTEN_PICKAXE));
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

        tag(ModTags.Items.CANDYCANE_REPAIR);
                //CandyCane once its added)

        tag(ModTags.Items.ICE_REPAIR)
                ;
                //add ice, blue ice, and packed ice

        tag(ModTags.Items.LEAD_REPAIR)
                .add(ModItems.getRK(ModItems.LEAD_BAR));

        tag(ModTags.Items.SILVER_REPAIR)
                .add(ModItems.getRK(ModItems.SILVER_BAR));

        tag(ModTags.Items.TIN_REPAIR)
                .add(ModItems.getRK(ModItems.TIN_BAR));

        tag(ModTags.Items.TUNGSTEN_REPAIR)
                .add(ModItems.getRK(ModItems.TUNGSTEN_BAR));

        tag(ModTags.Items.PALLADIUM_REPAIR)
                .add(ModItems.getRK(ModItems.PALLADIUM_BAR));

        tag(ModTags.Items.COBALT_REPAIR)
                .add(ModItems.getRK(ModItems.COBALT_BAR));

        tag(ModTags.Items.BONE_REPAIR)
                .add(ItemIds.BONE);
        //add bones

        tag(ModTags.Items.MYTHRIL_REPAIR)
                .add(ModItems.getRK(ModItems.MYTHRIL_BAR));

        tag(ModTags.Items.CACTUS_REPAIR)    ;

        tag(ModTags.Items.FOSSIL_REPAIR)
                //sturdy fossil
        ;

        tag(ModTags.Items.ORICHALCUM_REPAIR)
                .add(ModItems.getRK(ModItems.ORICHALCUM_BAR));

        tag(ModTags.Items.ADAMANTITE_REPAIR)
                .add(ModItems.getRK(ModItems.ADAMANTITE_BAR));

        tag(ModTags.Items.PLATINUM_REPAIR)
                .add(ModItems.getRK(ModItems.PLATINUM_BAR));

        tag(ModTags.Items.TITANIUM_REPAIR)
                .add(ModItems.getRK(ModItems.TITANIUM_BAR));

        tag(ModTags.Items.CHLOROPHYTE_REPAIR)
                .add(ModItems.getRK(ModItems.CHLOROPHYTE_BAR));

        tag(ModTags.Items.SPECTRE_REPAIR)
                .add(ModItems.getRK(ModItems.SPECTRE_BAR));

        tag(ModTags.Items.SHROOMITE_REPAIR)
                .add(ModItems.getRK(ModItems.SHROOMITE_BAR));

        tag(ModTags.Items.VORTEX_REPAIR);

        tag(ModTags.Items.SOLAR_REPAIR);

        tag(ModTags.Items.NEBULA_REPAIR);

        tag(ModTags.Items.STARDUST_REPAIR);

        tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.getRK(ModItems.SHADOW_HELMET));

        tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.getRK(ModItems.SHADOW_SCALEMAIL));

        tag(ItemTags.LEG_ARMOR)
                .add(ModItems.getRK(ModItems.SHADOW_GREAVES));

        tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.getRK(ModItems.SHADOW_SABATONS));

        tag(ItemTags.BOW_ENCHANTABLE)
                .add(ModItems.getRK(ModItems.DEMON_BOW));




    }
}
