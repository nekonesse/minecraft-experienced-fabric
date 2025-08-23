package nekonesse.minecraftexp;

import nekonesse.minecraftexp.block.ExperiencedBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftExperiencedFabric implements ModInitializer {
	public static final String MOD_ID = "minecraft-experienced";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ExperiencedBlocks.registerModBlocks();
	}
}