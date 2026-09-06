package com.krithenmc.unnamedmod.tags;

import com.krithenmc.unnamedmod.Unnamedmod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;



public class ModTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name));
        }

        public static final TagKey<Block> NEEDS_DEMONITE_TOOL = createTag("needs_demonite_tool");
        public static final TagKey<Block> INCORRECT_FOR_DEMONITE_TOOL = createTag("incorrect_for_demonite_tool");
        public static final TagKey<Block> NEEDS_HALLOWED_TOOL = createTag("needs_hallowed_tool");
        public static final TagKey<Block> INCORRECT_FOR_HALLOWED_TOOL = createTag("incorrect_for_hallowed_tool");
        public static final TagKey<Block> INCORRECT_FOR_HELLSTONE_TOOL = createTag("incorrect_for_hellstone_tool");
        public static final TagKey<Block> CRIMSON_BLOCK = createTag("crimson_block");
        public static final TagKey<Block> INCORRECT_FOR_LEAD_TOOL = createTag("incorrect_for_lead_tool");
        public static final TagKey<Block> INCORRECT_FOR_SILVER_TOOL = createTag("incorrect_for_silver_tool");
        public static final TagKey<Block> INCORRECT_FOR_TIN_TOOL = createTag("incorrect_for_tin_tool");
        public static final TagKey<Block> INCORRECT_FOR_TUNGSTEN_TOOL = createTag("incorrect_for_tungsten_tool");
        public static final TagKey<Block> INCORRECT_FOR_PALLADIUM_TOOL = createTag("incorrect_for_palladium_tool");
        public static final TagKey<Block> INCORRECT_FOR_BONE_TOOL = createTag("incorrect_for_bone_tool");
        public static final TagKey<Block> INCORRECT_FOR_COBALT_TOOL = createTag("incorrect_for_cobalt_tool");
        public static final TagKey<Block> INCORRECT_FOR_MYTHRIL_TOOL = createTag("incorrect_for_mythril_tool");
        public static final TagKey<Block> NEEDS_HELLSTONE_TOOL = createTag("needs_hellstone_tool");


    }

    public static class Items {


        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Unnamedmod.MOD_ID, name));


        }
        public static final TagKey<Item> DEMONITE_REPAIR = createTag("demonite_repair");
        public static final TagKey<Item> HALLOWED_REPAIR = createTag("hallowed_repair");
        public static final TagKey<Item> CRIMTANE_REPAIR = createTag("crimtane_repair");
        public static final TagKey<Item> NIGHTS_EDGE_REPAIR = createTag("nights_edge_repair");
        public static final TagKey<Item> HELLSTONE_REPAIR = createTag("hellstone_repair");
        public static final TagKey<Item> CANDYCANE_REPAIR = createTag("candycane_repair");
        public static final TagKey<Item> ICE_REPAIR = createTag("ice_repair");
        public static final TagKey<Item> LEAD_REPAIR = createTag("lead_repair");
        public static final TagKey<Item> SILVER_REPAIR = createTag("silver_repair");
        public static final TagKey<Item> TIN_REPAIR = createTag("tin_repair");
        public static final TagKey<Item> TUNGSTEN_REPAIR = createTag("tungsten_repair");
        public static final TagKey<Item> PALLADIUM_REPAIR = createTag("palladium_repair");
        public static final TagKey<Item> BONE_REPAIR = createTag("bone_repair");
        public static final TagKey<Item> COBALT_REPAIR = createTag("cobalt_repair");
        public static final TagKey<Item> MYTHRIL_REPAIR = createTag("mythril_repair");

    }



}


