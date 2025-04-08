package com.myc0tic.mycultism;


import com.myc0tic.mycultism.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mycultism implements ModInitializer {
	public static final String MOD_ID = "mycultism";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}