package nekonesse.minecraftexp.datagen;

import nekonesse.minecraftexp.block.ExperiencedBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.TexturedModel;

public class ExperiencedModelProvider extends FabricModelProvider {
    public ExperiencedModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.CRACKED_POLISHED_ANDESITE);
        BlockStateModelGenerator.BlockTexturePool polishedAndesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        polishedAndesitePool.wall(ExperiencedBlocks.POLISHED_ANDESITE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.CRACKED_POLISHED_GRANITE);
        BlockStateModelGenerator.BlockTexturePool polishedGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        polishedGranitePool.wall(ExperiencedBlocks.POLISHED_GRANITE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.CRACKED_POLISHED_DIORITE);
        BlockStateModelGenerator.BlockTexturePool polishedDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
        polishedDioritePool.wall(ExperiencedBlocks.POLISHED_DIORITE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.COBBLESTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.CHISELED_COBBLESTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.LAYERED_COBBLESTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.STACKED_COBBLESTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.CUT_COBBLESTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.SMALL_COBBLESTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.TRIPLE_COBBLESTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.LAYERED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.STACKED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.CUT_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.SMALL_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.TRIPLE_STONE_BRICKS);

        //blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.POLISHED_NETHERRACK);
        BlockStateModelGenerator.BlockTexturePool polishedNetherrackPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ExperiencedBlocks.POLISHED_NETHERRACK);
        polishedNetherrackPool.stairs(ExperiencedBlocks.POLISHED_NETHERRACK_STAIRS);
        polishedNetherrackPool.slab(ExperiencedBlocks.POLISHED_NETHERRACK_SLAB);
        polishedNetherrackPool.wall(ExperiencedBlocks.POLISHED_NETHERRACK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.POLISHED_NETHERRACK_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.LAYERED_POLISHED_NETHERRACK);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.CUT_POLISHED_NETHERRACK);
        blockStateModelGenerator.registerAxisRotated(ExperiencedBlocks.POLISHED_NETHERRACK_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
