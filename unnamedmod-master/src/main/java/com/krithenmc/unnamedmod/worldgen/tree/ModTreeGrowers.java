package com.krithenmc.unnamedmod.worldgen.tree;

import com.krithenmc.unnamedmod.Unnamedmod;
import com.krithenmc.unnamedmod.worldgen.ModConfiguredFeatures;
import com.sun.source.tree.Tree;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower SHADEWOOD = new TreeGrower(Unnamedmod.MOD_ID + "shadewood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.SHADEWOOD_KEY), Optional.empty());
    public static final TreeGrower BOREAL = new TreeGrower(Unnamedmod.MOD_ID + "boreal",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BOREAL), Optional.empty());
}
