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

        BlockStateModelGenerator.BlockTexturePool cobblestoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ExperiencedBlocks.COBBLESTONE_BRICKS);
        cobblestoneBrickPool.slab(ExperiencedBlocks.COBBLESTONE_BRICK_SLAB);
        cobblestoneBrickPool.stairs(ExperiencedBlocks.COBBLESTONE_BRICK_STAIRS);
        cobblestoneBrickPool.wall(ExperiencedBlocks.COBBLESTONE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.CRACKED_COBBLESTONE_BRICKS);
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

        BlockStateModelGenerator.BlockTexturePool polishedNetherrackPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ExperiencedBlocks.POLISHED_NETHERRACK);
        polishedNetherrackPool.stairs(ExperiencedBlocks.POLISHED_NETHERRACK_STAIRS);
        polishedNetherrackPool.slab(ExperiencedBlocks.POLISHED_NETHERRACK_SLAB);
        polishedNetherrackPool.wall(ExperiencedBlocks.POLISHED_NETHERRACK_WALL);
        BlockStateModelGenerator.BlockTexturePool polishedNetherrackBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ExperiencedBlocks.POLISHED_NETHERRACK_BRICKS);
        polishedNetherrackBrickPool.stairs(ExperiencedBlocks.POLISHED_NETHERRACK_BRICK_STAIRS);
        polishedNetherrackBrickPool.slab(ExperiencedBlocks.POLISHED_NETHERRACK_BRICK_SLAB);
        polishedNetherrackBrickPool.wall(ExperiencedBlocks.POLISHED_NETHERRACK_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.LAYERED_POLISHED_NETHERRACK);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.CUT_POLISHED_NETHERRACK);
        blockStateModelGenerator.registerAxisRotated(ExperiencedBlocks.POLISHED_NETHERRACK_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);

        BlockStateModelGenerator.BlockTexturePool redNetherBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_NETHER_BRICKS);
        redNetherBrickPool.fence(ExperiencedBlocks.RED_NETHER_BRICK_FENCE);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.CHISELED_RED_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ExperiencedBlocks.CRACKED_RED_NETHER_BRICKS);

        BlockStateModelGenerator.BlockTexturePool prismarineBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PRISMARINE_BRICKS);
        prismarineBrickPool.wall(ExperiencedBlocks.PRISMARINE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool darkPrismarinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_PRISMARINE);
        darkPrismarinePool.wall(ExperiencedBlocks.DARK_PRISMARINE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
