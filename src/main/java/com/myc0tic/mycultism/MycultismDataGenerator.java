package com.myc0tic.mycultism;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;


public class MycultismDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		// This method is used for adding custom things to Minecraft's registries during datagen,
		// primarily for world generation features. You likely don't need to add anything here
		// just for item recipes.
		// Example:
		// registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
	}
}
