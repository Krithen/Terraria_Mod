package com.krithenmc.unnamedmod;

import com.krithenmc.unnamedmod.block.ModBlocks;
import com.krithenmc.unnamedmod.creativemodetab.ModCreativeModeTabs;
import com.krithenmc.unnamedmod.data.ModDataComponents;
import com.krithenmc.unnamedmod.item.ModItems;
import com.krithenmc.unnamedmod.registries.ModCompostables;
import com.krithenmc.unnamedmod.registries.ModFuels;
import com.krithenmc.unnamedmod.sounds.ModSounds;
import com.krithenmc.unnamedmod.stat.ModStats;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Unnamedmod implements ModInitializer {
	public static final String MOD_ID = "unnamedmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();
		ModDataComponents.registerDataComponents();
		ModItems.registerModItems();
		ModStats.registerStats();
		ModBlocks.registerModBlocks();
		ModFuels.registerFuels();
		ModCompostables.registerCompostables();
		ModSounds.registerSounds();


	}
}

