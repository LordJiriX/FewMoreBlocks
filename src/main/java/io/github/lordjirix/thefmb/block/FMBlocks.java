package io.github.lordjirix.thefmb.block;

import io.github.lordjirix.thefmb.Thefmb;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
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
