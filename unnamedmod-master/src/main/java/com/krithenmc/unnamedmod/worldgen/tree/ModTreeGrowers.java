package com.krithenmc.unnamedmod.worldgen.tree;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.worldgen.ModFeatures;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.grower.TreeGrower;

public class ModTreeGrowers {
    public static final TreeGrower SHADEWOOD = new TreeGrower(Unnamedmod.MOD_ID + ":shadewood",
            WeightedList.of(ModFeatures.SHADEWOOD_KEY), WeightedList.of(), WeightedList.of(), null);
    public static final TreeGrower BOREAL = new TreeGrower(Unnamedmod.MOD_ID + ":boreal",
            WeightedList.of(ModFeatures.BOREAL), WeightedList.of(), WeightedList.of(), null);
}
