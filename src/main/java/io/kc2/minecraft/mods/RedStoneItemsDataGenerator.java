package io.kc2.minecraft.mods;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RedStoneItemsDataGenerator implements DataGeneratorEntrypoint {
	public static final Logger LOGGER = LoggerFactory.getLogger("redstone-items-kc2-io:data-generator");
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		LOGGER.info("Loading Redstone Item Recipe Generator.");
		pack.addProvider(RedStoneItemsRecipeGenerator::new);
	}
}
