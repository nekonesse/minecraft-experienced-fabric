package nekonesse.minecraftexp;

import nekonesse.minecraftexp.datagen.ExperiencedBlockTagProvider;
import nekonesse.minecraftexp.datagen.ExperiencedLootTableProvider;
import nekonesse.minecraftexp.datagen.ExperiencedModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MinecraftExperiencedFabricDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ExperiencedBlockTagProvider::new);
		pack.addProvider(ExperiencedLootTableProvider::new);
		pack.addProvider(ExperiencedModelProvider::new);
	}
}
