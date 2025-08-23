package nekonesse.minecraftexp.block;

import nekonesse.minecraftexp.MinecraftExperiencedFabric;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ExperiencedBlocks {
    //POLISHED ANDESITE
    public static final Block CRACKED_POLISHED_ANDESITE = register("cracked_polished_andesite",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE),
            true);
    public static final Block POLISHED_ANDESITE_WALL = register("polished_andesite_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE),
            true);
    //POLISHED GRANITE
    public static final Block CRACKED_POLISHED_GRANITE = register("cracked_polished_granite",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE),
            true);
    public static final Block POLISHED_GRANITE_WALL = register("polished_granite_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE),
            true);
    //POLISHED DIORITE
    public static final Block CRACKED_POLISHED_DIORITE = register("cracked_polished_diorite",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE),
            true);
    public static final Block POLISHED_DIORITE_WALL = register("polished_diorite_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE),
            true);
    //COBBLESTONE
    public static final Block COBBLESTONE_BRICKS = register("cobblestone_bricks",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.COBBLESTONE),
            true);
    public static final Block CHISELED_COBBLESTONE_BRICKS = register("chiseled_cobblestone_bricks",
            Block::new,
            AbstractBlock.Settings.copy(COBBLESTONE_BRICKS),
            true);
    public static final Block LAYERED_COBBLESTONE_BRICKS = register("layered_cobblestone_bricks",
            Block::new,
            AbstractBlock.Settings.copy(COBBLESTONE_BRICKS),
            true);
    public static final Block STACKED_COBBLESTONE_BRICKS = register("stacked_cobblestone_bricks",
            Block::new,
            AbstractBlock.Settings.copy(COBBLESTONE_BRICKS),
            true);
    public static final Block CUT_COBBLESTONE_BRICKS = register("cut_cobblestone_bricks",
            Block::new,
            AbstractBlock.Settings.copy(COBBLESTONE_BRICKS),
            true);
    public static final Block SMALL_COBBLESTONE_BRICKS = register("small_cobblestone_bricks",
            Block::new,
            AbstractBlock.Settings.copy(COBBLESTONE_BRICKS),
            true);
    public static final Block TRIPLE_COBBLESTONE_BRICKS = register("triple_cobblestone_bricks",
            Block::new,
            AbstractBlock.Settings.copy(COBBLESTONE_BRICKS),
            true);
    //STONE
    public static final Block LAYERED_STONE_BRICKS = register("layered_stone_bricks",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.STONE_BRICKS),
            true);
    public static final Block STACKED_STONE_BRICKS = register("stacked_stone_bricks",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.STONE_BRICKS),
            true);
    public static final Block CUT_STONE_BRICKS = register("cut_stone_bricks",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.STONE_BRICKS),
            true);
    public static final Block SMALL_STONE_BRICKS = register("small_stone_bricks",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.STONE_BRICKS),
            true);
    public static final Block TRIPLE_STONE_BRICKS = register("triple_stone_bricks",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.STONE_BRICKS),
            true);
    //POLISHED NETHERRACK
    public static final Block POLISHED_NETHERRACK = register("polished_netherrack",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS).strength(2f),
            true);
    public static final Block POLISHED_NETHERRACK_BRICKS = register("polished_netherrack_bricks",
            Block::new,
            AbstractBlock.Settings.copy(POLISHED_NETHERRACK),
            true);
    public static final Block POLISHED_NETHERRACK_SLAB = register("polished_netherrack_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(POLISHED_NETHERRACK),
            true);
    public static final Block POLISHED_NETHERRACK_STAIRS = register("polished_netherrack_stairs",
            settings -> new StairsBlock(POLISHED_NETHERRACK.getDefaultState(), settings),
            AbstractBlock.Settings.copy(POLISHED_NETHERRACK),
            true);
    public static final Block POLISHED_NETHERRACK_WALL = register("polished_netherrack_wall",
            WallBlock::new,
            AbstractBlock.Settings.copy(POLISHED_NETHERRACK),
            true);
    public static final Block LAYERED_POLISHED_NETHERRACK = register("layered_polished_netherrack",
            Block::new,
            AbstractBlock.Settings.copy(POLISHED_NETHERRACK),
            true);
    public static final Block CUT_POLISHED_NETHERRACK = register("cut_polished_netherrack",
            Block::new,
            AbstractBlock.Settings.copy(POLISHED_NETHERRACK),
            true);
    public static final Block POLISHED_NETHERRACK_PILLAR = register("polished_netherrack_pillar",
            PillarBlock::new,
            AbstractBlock.Settings.copy(POLISHED_NETHERRACK),
            true);

    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        RegistryKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MinecraftExperiencedFabric.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinecraftExperiencedFabric.MOD_ID, name));
    }

    private static void registerTabs() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.addAfter(Blocks.COBBLESTONE_WALL,COBBLESTONE_BRICKS);
            entries.addAfter(COBBLESTONE_BRICKS,LAYERED_COBBLESTONE_BRICKS);
            entries.addAfter(LAYERED_COBBLESTONE_BRICKS,STACKED_COBBLESTONE_BRICKS);
            entries.addAfter(STACKED_COBBLESTONE_BRICKS,CUT_COBBLESTONE_BRICKS);
            entries.addAfter(CUT_COBBLESTONE_BRICKS,SMALL_COBBLESTONE_BRICKS);
            entries.addAfter(SMALL_COBBLESTONE_BRICKS,TRIPLE_COBBLESTONE_BRICKS);

            entries.addAfter(Blocks.STONE_BRICKS,LAYERED_STONE_BRICKS);
            entries.addAfter(LAYERED_STONE_BRICKS,STACKED_STONE_BRICKS);
            entries.addAfter(STACKED_STONE_BRICKS,CUT_STONE_BRICKS);
            entries.addAfter(CUT_STONE_BRICKS,SMALL_STONE_BRICKS);
            entries.addAfter(SMALL_STONE_BRICKS,TRIPLE_STONE_BRICKS);

            /*entries.addAfter(Blocks.CHERRY_BUTTON,LATEWOOD_LOG);
            entries.addAfter(LATEWOOD_LOG,LATEWOOD_WOOD);
            entries.addAfter(LATEWOOD_WOOD,STRIPPED_LATEWOOD_LOG);
            entries.addAfter(STRIPPED_LATEWOOD_LOG,STRIPPED_LATEWOOD_WOOD);
            entries.addAfter(STRIPPED_LATEWOOD_WOOD,LATEWOOD_PLANKS);*/

            entries.addAfter(Blocks.NETHERRACK,POLISHED_NETHERRACK);
            entries.addAfter(POLISHED_NETHERRACK, POLISHED_NETHERRACK_STAIRS);
            entries.addAfter(POLISHED_NETHERRACK_STAIRS, POLISHED_NETHERRACK_SLAB);
            entries.addAfter(POLISHED_NETHERRACK_SLAB, POLISHED_NETHERRACK_WALL);
            entries.addAfter(POLISHED_NETHERRACK_WALL,POLISHED_NETHERRACK_BRICKS);
            entries.addAfter(POLISHED_NETHERRACK_BRICKS,LAYERED_POLISHED_NETHERRACK);
            entries.addAfter(LAYERED_POLISHED_NETHERRACK,CUT_POLISHED_NETHERRACK);
            entries.addAfter(CUT_POLISHED_NETHERRACK,POLISHED_NETHERRACK_PILLAR);

            entries.addAfter(Blocks.POLISHED_ANDESITE_SLAB,POLISHED_ANDESITE_WALL);
            entries.addAfter(POLISHED_ANDESITE_WALL,CRACKED_POLISHED_ANDESITE);

            entries.addAfter(Blocks.POLISHED_DIORITE_SLAB,POLISHED_DIORITE_WALL);
            entries.addAfter(POLISHED_DIORITE_WALL,CRACKED_POLISHED_DIORITE);

            entries.addAfter(Blocks.POLISHED_GRANITE_SLAB,POLISHED_GRANITE_WALL);
            entries.addAfter(POLISHED_GRANITE_WALL,CRACKED_POLISHED_GRANITE);
        });
        /*ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE_BLOCKS).register(entries -> {
            entries.addBefore(Blocks.RAIL,WOODEN_RAIL);
            entries.addAfter(Blocks.ACTIVATOR_RAIL,COPPER_RAIL);
            entries.addAfter(COPPER_RAIL,EXPOSED_COPPER_RAIL);
            entries.addAfter(EXPOSED_COPPER_RAIL,WEATHERED_COPPER_RAIL);
            entries.addAfter(WEATHERED_COPPER_RAIL,OXIDIZED_COPPER_RAIL);
            entries.addAfter(OXIDIZED_COPPER_RAIL,WAXED_COPPER_RAIL);
            entries.addAfter(WAXED_COPPER_RAIL,WAXED_EXPOSED_COPPER_RAIL);
            entries.addAfter(WAXED_EXPOSED_COPPER_RAIL,WAXED_WEATHERED_COPPER_RAIL);
            entries.addAfter(WAXED_WEATHERED_COPPER_RAIL,WAXED_OXIDIZED_COPPER_RAIL);
        });*/
    }

    public static void registerModBlocks() {
        registerTabs();
        MinecraftExperiencedFabric.LOGGER.info("Registering Blocks for " + MinecraftExperiencedFabric.MOD_ID);
    }
}
