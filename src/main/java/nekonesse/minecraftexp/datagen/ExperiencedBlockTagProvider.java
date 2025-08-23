package nekonesse.minecraftexp.datagen;

import nekonesse.minecraftexp.block.ExperiencedBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagBuilder;

import java.util.concurrent.CompletableFuture;

public class ExperiencedBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ExperiencedBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ExperiencedBlocks.CRACKED_POLISHED_ANDESITE)
                .add(ExperiencedBlocks.POLISHED_ANDESITE_WALL)
                .add(ExperiencedBlocks.CRACKED_POLISHED_GRANITE)
                .add(ExperiencedBlocks.POLISHED_GRANITE_WALL)
                .add(ExperiencedBlocks.CRACKED_POLISHED_GRANITE)
                .add(ExperiencedBlocks.POLISHED_GRANITE_WALL)
                .add(ExperiencedBlocks.COBBLESTONE_BRICKS)
                .add(ExperiencedBlocks.CHISELED_COBBLESTONE_BRICKS)
                .add(ExperiencedBlocks.LAYERED_COBBLESTONE_BRICKS)
                .add(ExperiencedBlocks.STACKED_COBBLESTONE_BRICKS)
                .add(ExperiencedBlocks.CUT_COBBLESTONE_BRICKS)
                .add(ExperiencedBlocks.SMALL_COBBLESTONE_BRICKS)
                .add(ExperiencedBlocks.TRIPLE_COBBLESTONE_BRICKS)
                .add(ExperiencedBlocks.LAYERED_STONE_BRICKS)
                .add(ExperiencedBlocks.STACKED_STONE_BRICKS)
                .add(ExperiencedBlocks.CUT_STONE_BRICKS)
                .add(ExperiencedBlocks.SMALL_STONE_BRICKS)
                .add(ExperiencedBlocks.TRIPLE_STONE_BRICKS)
                .add(ExperiencedBlocks.POLISHED_NETHERRACK)
                .add(ExperiencedBlocks.POLISHED_NETHERRACK_SLAB)
                .add(ExperiencedBlocks.POLISHED_NETHERRACK_STAIRS)
                .add(ExperiencedBlocks.POLISHED_NETHERRACK_WALL)
                .add(ExperiencedBlocks.POLISHED_NETHERRACK_BRICKS)
                .add(ExperiencedBlocks.LAYERED_POLISHED_NETHERRACK)
                .add(ExperiencedBlocks.CUT_POLISHED_NETHERRACK)
                .add(ExperiencedBlocks.POLISHED_NETHERRACK_PILLAR);

    }
}
