package nekonesse.minecraftexp.datagen;

import nekonesse.minecraftexp.block.ExperiencedBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ExperiencedLootTableProvider extends FabricBlockLootTableProvider {
    public ExperiencedLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ExperiencedBlocks.CRACKED_POLISHED_ANDESITE);
        addDrop(ExperiencedBlocks.POLISHED_ANDESITE_WALL);
        addDrop(ExperiencedBlocks.CRACKED_POLISHED_GRANITE);
        addDrop(ExperiencedBlocks.POLISHED_GRANITE_WALL);
        addDrop(ExperiencedBlocks.CRACKED_POLISHED_GRANITE);
        addDrop(ExperiencedBlocks.POLISHED_GRANITE_WALL);
        addDrop(ExperiencedBlocks.COBBLESTONE_BRICKS);
        addDrop(ExperiencedBlocks.CHISELED_COBBLESTONE_BRICKS);
        addDrop(ExperiencedBlocks.LAYERED_COBBLESTONE_BRICKS);
        addDrop(ExperiencedBlocks.STACKED_COBBLESTONE_BRICKS);
        addDrop(ExperiencedBlocks.CUT_COBBLESTONE_BRICKS);
        addDrop(ExperiencedBlocks.SMALL_COBBLESTONE_BRICKS);
        addDrop(ExperiencedBlocks.TRIPLE_COBBLESTONE_BRICKS);
        addDrop(ExperiencedBlocks.LAYERED_STONE_BRICKS);
        addDrop(ExperiencedBlocks.STACKED_STONE_BRICKS);
        addDrop(ExperiencedBlocks.CUT_STONE_BRICKS);
        addDrop(ExperiencedBlocks.SMALL_STONE_BRICKS);
        addDrop(ExperiencedBlocks.TRIPLE_STONE_BRICKS);
        addDrop(ExperiencedBlocks.POLISHED_NETHERRACK);
        addDrop(ExperiencedBlocks.POLISHED_NETHERRACK_SLAB);
        addDrop(ExperiencedBlocks.POLISHED_NETHERRACK_STAIRS);
        addDrop(ExperiencedBlocks.POLISHED_NETHERRACK_WALL);
        addDrop(ExperiencedBlocks.POLISHED_NETHERRACK_BRICKS);
        addDrop(ExperiencedBlocks.LAYERED_POLISHED_NETHERRACK);
        addDrop(ExperiencedBlocks.CUT_POLISHED_NETHERRACK);
        addDrop(ExperiencedBlocks.POLISHED_NETHERRACK_PILLAR);
    }
}
