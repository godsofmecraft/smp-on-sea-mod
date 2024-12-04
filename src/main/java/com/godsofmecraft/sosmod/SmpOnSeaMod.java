package com.godsofmecraft.sosmod;

import com.godsofmecraft.sosmod.block.ModBlocks;
import com.godsofmecraft.sosmod.datagen.ModWorldGenerator;
import com.godsofmecraft.sosmod.items.ModItemGroups;
import com.godsofmecraft.sosmod.items.ModItems;
import com.godsofmecraft.sosmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmpOnSeaMod implements ModInitializer {
	public static final String MOD_ID = "sosmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


		ModWorldGeneration.generateModWorldGen();
	}
}