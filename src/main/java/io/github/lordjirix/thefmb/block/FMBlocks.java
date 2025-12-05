package io.github.lordjirix.thefmb.block;

import io.github.lordjirix.thefmb.Thefmb;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FMBlocks {
    public static List<String> blocks = List.of(
            "few_more_block_casting",
            "bluid",
            "bluid_smooth",
            "bluid_bricks",
            "bluid_chiseled_bricks",
            "bluid_mossy",
            "bluid_tiles",
            "yellid",
            "yellid_smooth",
            "yellid_bricks",
            "yellid_chiseled_bricks",
            "yellid_mossy",
            "yellid_tiles",
            "ruid",
            "ruid_smooth",
            "ruid_bricks",
            "ruid_chiseled_bricks",
            "ruid_mossy",
            "ruid_tiles",
            "grenid",
            "grenid_smooth",
            "grenid_bricks",
            "grenid_chiseled_bricks",
            "grenid_mossy",
            "grenid_tiles"
    );

    public static final Map<String, DeferredHolder<Item, Item>> BLOCK_ITEM_REG = new HashMap<>();
    public static final List<DeferredBlock<?>> GENERATED_BLOCKS = new ArrayList<>();
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Thefmb.MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Thefmb.MODID);
    /*

    public static final DeferredBlock<Block> TFMB_BLOCK = BLOCKS.registerSimpleBlock("few_more_block_casting", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> TFMB_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("few_more_block_casting", TFMB_BLOCK);

    // Bluids
    public static final DeferredBlock<Block> BLUID_0_BLOCK = BLOCKS.registerSimpleBlock("bluid", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> BLUID_0_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("bluid", BLUID_0_BLOCK);

    public static final DeferredBlock<Block> BLUID_1_BLOCK = BLOCKS.registerSimpleBlock("bluid_smooth", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> BLUID_1_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("bluid_smooth", BLUID_1_BLOCK);

    public static final DeferredBlock<Block> BLUID_2_BLOCK = BLOCKS.registerSimpleBlock("bluid_bricks", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> BLUID_2_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("bluid_bricks", BLUID_2_BLOCK);

    public static final DeferredBlock<Block> BLUID_3_BLOCK = BLOCKS.registerSimpleBlock("bluid_chiseled_bricks", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> BLUID_3_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("bluid_chiseled_bricks", BLUID_3_BLOCK);

    public static final DeferredBlock<Block> BLUID_4_BLOCK = BLOCKS.registerSimpleBlock("bluid_mossy", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> BLUID_4_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("bluid_mossy", BLUID_4_BLOCK);

    public static final DeferredBlock<Block> BLUID_5_BLOCK = BLOCKS.registerSimpleBlock("bluid_tiles", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> BLUID_5_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("bluid_tiles", BLUID_5_BLOCK);

    // Yellids
    public static final DeferredBlock<Block> YELLID_0_BLOCK = BLOCKS.registerSimpleBlock("yellid", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> YELLID_0_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("yellid", YELLID_0_BLOCK);

    public static final DeferredBlock<Block> YELLID_1_BLOCK = BLOCKS.registerSimpleBlock("yellid_smooth", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> YELLID_1_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("yellid_smooth", YELLID_1_BLOCK);

    public static final DeferredBlock<Block> YELLID_2_BLOCK = BLOCKS.registerSimpleBlock("yellid_bricks", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> YELLID_2_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("yellid_bricks", YELLID_2_BLOCK);

    public static final DeferredBlock<Block> YELLID_3_BLOCK = BLOCKS.registerSimpleBlock("yellid_chiseled_bricks", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> YELLID_3_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("yellid_chiseled_bricks", YELLID_3_BLOCK);

    public static final DeferredBlock<Block> YELLID_4_BLOCK = BLOCKS.registerSimpleBlock("yellid_mossy", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> YELLID_4_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("yellid_mossy", YELLID_4_BLOCK);

    public static final DeferredBlock<Block> YELLID_5_BLOCK = BLOCKS.registerSimpleBlock("yellid_tiles", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> YELLID_5_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("yellid_tiles", YELLID_5_BLOCK);

    // Ruids
    public static final DeferredBlock<Block> RUID_0_BLOCK = BLOCKS.registerSimpleBlock("ruid", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> RUID_0_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("ruid", RUID_0_BLOCK);

    public static final DeferredBlock<Block> RUID_1_BLOCK = BLOCKS.registerSimpleBlock("ruid_smooth", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> RUID_1_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("ruid_smooth", RUID_1_BLOCK);

    public static final DeferredBlock<Block> RUID_2_BLOCK = BLOCKS.registerSimpleBlock("ruid_bricks", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> RUID_2_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("ruid_bricks", RUID_2_BLOCK);

    public static final DeferredBlock<Block> RUID_3_BLOCK = BLOCKS.registerSimpleBlock("ruid_chiseled_bricks", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> RUID_3_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("ruid_chiseled_bricks", RUID_3_BLOCK);

    public static final DeferredBlock<Block> RUID_4_BLOCK = BLOCKS.registerSimpleBlock("ruid_mossy", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> RUID_4_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("ruid_mossy", RUID_4_BLOCK);

    public static final DeferredBlock<Block> RUID_5_BLOCK = BLOCKS.registerSimpleBlock("ruid_tiles", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> RUID_5_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("ruid_tiles", RUID_5_BLOCK);

    // Grenid


    public static final DeferredBlock<Block> GRENID_0_BLOCK = BLOCKS.registerSimpleBlock("grenid", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> GRENID_0_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("grenid", GRENID_0_BLOCK);

    public static final DeferredBlock<Block> GRENID_1_BLOCK = BLOCKS.registerSimpleBlock("grenid_smooth", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> GRENID_1_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("grenid_smooth", GRENID_1_BLOCK);

    public static final DeferredBlock<Block> GRENID_2_BLOCK = BLOCKS.registerSimpleBlock("grenid_bricks", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> GRENID_2_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("grenid_bricks", GRENID_2_BLOCK);

    public static final DeferredBlock<Block> GRENID_3_BLOCK = BLOCKS.registerSimpleBlock("grenid_chiseled_bricks", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> GRENID_3_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("grenid_chiseled_bricks", GRENID_3_BLOCK);

    public static final DeferredBlock<Block> GRENID_4_BLOCK = BLOCKS.registerSimpleBlock("grenid_mossy", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> GRENID_4_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("grenid_mossy", GRENID_4_BLOCK);

    public static final DeferredBlock<Block> GRENID_5_BLOCK = BLOCKS.registerSimpleBlock("grenid_tiles", BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.STONE).destroyTime(1.5f).mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> GRENID_5_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("grenid_tiles", GRENID_5_BLOCK);

    */

    public static void init(IEventBus eventBus) {
        blocks.forEach(name -> {
            DeferredBlock<Block> block = BLOCKS.register(name, () ->
                    new Block(BlockBehaviour.Properties.of().strength(1.5F)));

            GENERATED_BLOCKS.add(block);

            // Register item
            DeferredHolder<Item, Item> item = ITEMS.register(name, () ->
                    new BlockItem(block.get(), new Item.Properties()));


            BLOCK_ITEM_REG.put(name, item);
        });
        BLOCKS.register(eventBus);

        ITEMS.register(eventBus);
    }
}
