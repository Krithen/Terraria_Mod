package com.krithenmc.unnamedmod.item;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.tags.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.EquipmentAsset;

public class ModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY =
            ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));
    public static final ResourceKey<EquipmentAsset> DEMONITE_KEY =
            ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, "demonite"));


    public static final ArmorMaterial DEMONITE_ARMOR_MATERIAL = new ArmorMaterial(5000, ArmorMaterials.makeDefense(2, 5, 7, 5, 10), 20,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 1, 1, ModTags.Items.DEMONITE_REPAIR, DEMONITE_KEY);

}


