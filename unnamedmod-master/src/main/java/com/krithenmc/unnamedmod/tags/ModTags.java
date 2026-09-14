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



        public static final TagKey<Block> CRIMSON_BLOCK = createTag("crimson_block");
           public static final TagKey<Block> NEEDS_TIER1_TOOL = createTag("needs_tier1_tool");
        public static final TagKey<Block> INCORRECT_FOR_TIER1_TOOL = createTag("incorrect_for_tier1_tool");
        public static final TagKey<Block> NEEDS_TIER2_TOOL = createTag("needs_tier2_tool");
        public static final TagKey<Block> INCORRECT_FOR_TIER2_TOOL = createTag("incorrect_for_tier2_tool");
        public static final TagKey<Block> NEEDS_TIER3_TOOL = createTag("needs_tier3_tool");
        public static final TagKey<Block> INCORRECT_FOR_TIER3_TOOL = createTag("incorrect_for_tier3_tool");
        public static final TagKey<Block> NEEDS_TIER4_TOOL = createTag("needs_tier4_tool");
        public static final TagKey<Block> INCORRECT_FOR_TIER4_TOOL = createTag("incorrect_for_tier4_tool");
        public static final TagKey<Block> NEEDS_TIER5_TOOL = createTag("needs_tier5_tool");
        public static final TagKey<Block> INCORRECT_FOR_TIER5_TOOL = createTag("incorrect_for_tier5_tool");
        public static final TagKey<Block> NEEDS_TIER6_TOOL = createTag("needs_tier6_tool");
        public static final TagKey<Block> INCORRECT_FOR_TIER6_TOOL = createTag("incorrect_for_tier6_tool");
        public static final TagKey<Block> NEEDS_TIER7_TOOL = createTag("needs_tier7_tool");
        public static final TagKey<Block> INCORRECT_FOR_TIER7_TOOL = createTag("incorrect_for_tier7_tool");
        public static final TagKey<Block> NEEDS_TIER8_TOOL = createTag("needs_tier8_tool");
        public static final TagKey<Block> INCORRECT_FOR_TIER8_TOOL = createTag("incorrect_for_tier8_tool");
        public static final TagKey<Block> NEEDS_TIER9_TOOL = createTag("needs_tier9_tool");
        public static final TagKey<Block> INCORRECT_FOR_TIER9_TOOL = createTag("incorrect_for_tier9_tool");
        public static final TagKey<Block> NEEDS_TIER10_TOOL = createTag("needs_tier10_tool");
        public static final TagKey<Block> INCORRECT_FOR_TIER10_TOOL = createTag("incorrect_for_tier10_tool");
        public static final TagKey<Block> NOT_APPLICABLE = createTag("not_applicable");

        //tier1


        public static final TagKey<Block> NEEDS_LEAD_TOOL = createTag("needs_lead_tool");
        public static final TagKey<Block> INCORRECT_FOR_LEAD_TOOL = createTag("incorrect_for_lead_tool");
        public static final TagKey<Block> NEEDS_SILVER_TOOL = createTag("needs_silver_tool");
        public static final TagKey<Block> INCORRECT_FOR_SILVER_TOOL = createTag("incorrect_for_silver_tool");
        public static final TagKey<Block> NEEDS_TIN_TOOL = createTag("needs_tin_tool");
        public static final TagKey<Block> INCORRECT_FOR_TIN_TOOL = createTag("incorrect_for_tin_tool");
        public static final TagKey<Block> NEEDS_CACTUS_TOOL = createTag("needs_cactus_tool");
        public static final TagKey<Block> INCORRECT_FOR_CACTUS_TOOL = createTag("incorrect_for_cactus_tool");

        //tier2


        public static final TagKey<Block> NEEDS_TUNGSTEN_TOOL = createTag("needs_tungsten_tool");
        public static final TagKey<Block> INCORRECT_FOR_TUNGSTEN_TOOL = createTag("incorrect_for_tungsten_tool");

        //tier3


        public static final TagKey<Block> NEEDS_BONE_TOOL = createTag("needs_bone_tool");
        public static final TagKey<Block> INCORRECT_FOR_BONE_TOOL = createTag("incorrect_for_bone_tool");
        public static final TagKey<Block> NEEDS_FOSSIL_TOOL = createTag("needs_fossil_tool");
        public static final TagKey<Block> INCORRECT_FOR_FOSSIL_TOOL = createTag("incorrect_for_fossil_tool");
        public static final TagKey<Block> NEEDS_PLATINUM_TOOL = createTag("needs_platinum_tool");
        public static final TagKey<Block> INCORRECT_FOR_PLATINUM_TOOL = createTag("incorrect_for_platinum_tool");
        public static final TagKey<Block> NEEDS_CANDYCANE_TOOL = createTag("needs_candycane_tool");
        public static final TagKey<Block> INCORRECT_FOR_CANDYCANE_TOOL = createTag("incorrect_for_candycane_tool");

        //tier4


        public static final TagKey<Block> NEEDS_DEMONITE_TOOL = createTag("needs_demonite_tool");
        public static final TagKey<Block> INCORRECT_FOR_DEMONITE_TOOL = createTag("incorrect_for_demonite_tool");
        public static final TagKey<Block> NEEDS_CRIMTANE_TOOL = createTag("needs_crimtane_tool");
        public static final TagKey<Block> INCORRECT_FOR_CRIMTANE_TOOL = createTag("incorrect_for_crimtane_tool");

        //tier5

        public static final TagKey<Block> NEEDS_HELLSTONE_TOOL = createTag("needs_hellstone_tool");
        public static final TagKey<Block> INCORRECT_FOR_HELLSTONE_TOOL = createTag("incorrect_for_hellstone_tool");

        //tier6

        public static final TagKey<Block> NEEDS_COBALT_TOOL = createTag("needs_cobalt_tool");
        public static final TagKey<Block> INCORRECT_FOR_COBALT_TOOL = createTag("incorrect_for_cobalt_tool");
        public static final TagKey<Block> NEEDS_PALLADIUM_TOOL = createTag("needs_palladium_tool");
        public static final TagKey<Block> INCORRECT_FOR_PALLADIUM_TOOL = createTag("incorrect_for_palladium_tool");

        //tier7

        public static final TagKey<Block> NEEDS_MYTHRIL_TOOL = createTag("needs_mythril_tool");
        public static final TagKey<Block> INCORRECT_FOR_MYTHRIL_TOOL = createTag("incorrect_for_mythril_tool");
        public static final TagKey<Block> NEEDS_ORICHALCUM_TOOL = createTag("needs_orichalcum_tool");
        public static final TagKey<Block> INCORRECT_FOR_ORICHALCUM_TOOL = createTag("incorrect_for_orichalcum_tool");

        //tier8

        public static final TagKey<Block> NEEDS_ADAMANTITE_TOOL = createTag("needs_adamantite_tool");
        public static final TagKey<Block> INCORRECT_FOR_ADAMANTITE_TOOL = createTag("incorrect_for_adamantite_tool");
        public static final TagKey<Block> NEEDS_TITANIUM_TOOL = createTag("needs_titanium_tool");
        public static final TagKey<Block> INCORRECT_FOR_TITANIUM_TOOL = createTag("incorrect_for_titanium_tool");

        //tier9

        public static final TagKey<Block> NEEDS_HALLOWED_TOOL = createTag("needs_hallowed_tool");
        public static final TagKey<Block> INCORRECT_FOR_HALLOWED_TOOL = createTag("incorrect_for_hallowed_tool");
        public static final TagKey<Block> NEEDS_CHLOROPHYTE_TOOL = createTag("needs_chlorophyte_tool");
        public static final TagKey<Block> INCORRECT_FOR_CHLOROPHYTE_TOOL = createTag("incorrect_for_chlorophyte_tool");
        public static final TagKey<Block> NEEDS_SPECTRE_TOOL = createTag("needs_spectre_tool");
        public static final TagKey<Block> INCORRECT_FOR_SPECTRE_TOOL = createTag("incorrect_for_spectre_tool");
        public static final TagKey<Block> NEEDS_SHROOMITE_TOOL = createTag("needs_shroomite_tool");
        public static final TagKey<Block> INCORRECT_FOR_SHROOMITE_TOOL = createTag("incorrect_for_shroomite_tool");

        //tier10

        public static final TagKey<Block> NEEDS_VORTEX_TOOL = createTag("needs_vortex_tool");
        public static final TagKey<Block> INCORRECT_FOR_VORTEX_TOOL = createTag("incorrect_for_vortex_tool");
        public static final TagKey<Block> NEEDS_SOLAR_TOOL = createTag("needs_solar_tool");
        public static final TagKey<Block> INCORRECT_FOR_SOLAR_TOOL = createTag("incorrect_for_solar_tool");
        public static final TagKey<Block> NEEDS_STARDUST_TOOL = createTag("needs_stardust_tool");
        public static final TagKey<Block> INCORRECT_FOR_STARDUST_TOOL = createTag("incorrect_for_stardust_tool");
        public static final TagKey<Block> NEEDS_NEBULA_TOOL = createTag("needs_nebula_tool");
        public static final TagKey<Block> INCORRECT_FOR_NEBULA_TOOL = createTag("incorrect_for_nebula_tool");





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
        public static final TagKey<Item> CACTUS_REPAIR = createTag("cactus_repair");
        public static final TagKey<Item> FOSSIL_REPAIR = createTag("fossile_repair");
        public static final TagKey<Item> ORICHALCUM_REPAIR = createTag("orichalcum_repair");
        public static final TagKey<Item> ADAMANTITE_REPAIR = createTag("adamantite_repair");
        public static final TagKey<Item> PLATINUM_REPAIR = createTag("platinum_repair");
        public static final TagKey<Item> TITANIUM_REPAIR = createTag("titanium_repair");
        public static final TagKey<Item> CHLOROPHYTE_REPAIR = createTag("chlorophyte_repair");
        public static final TagKey<Item> SPECTRE_REPAIR = createTag("spectre_repair");
        public static final TagKey<Item> SHROOMITE_REPAIR = createTag("shroomite_repair");
        public static final TagKey<Item> VORTEX_REPAIR = createTag("vortex_repair");
        public static final TagKey<Item> SOLAR_REPAIR = createTag("solar_repair");
        public static final TagKey<Item> STARDUST_REPAIR = createTag("stardust_repair");
        public static final TagKey<Item> NEBULA_REPAIR = createTag("nebula_repair");




    }



}


