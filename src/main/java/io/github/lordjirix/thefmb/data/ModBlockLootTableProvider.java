package io.github.lordjirix.thefmb.data;

import io.github.lordjirix.thefmb.block.FMBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {


        FMBlocks.GENERATED_BLOCKS.forEach(block -> {
            dropSelf(block.get());
        });

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return () -> (java.util.Iterator<Block>) FMBlocks.BLOCKS.getEntries()
                .stream()
                .map(holder -> holder.get()) // DeferredHolder::get returns Block
                .iterator();
    }
}