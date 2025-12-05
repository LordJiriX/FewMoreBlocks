package io.github.lordjirix.thefmb.data;

import io.github.lordjirix.thefmb.block.FMBlocks;
import io.github.lordjirix.thefmb.Thefmb;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(FMBlocks.TFMB_BLOCK.get());
        // Bluids
        dropSelf(FMBlocks.BLUID_0_BLOCK.get());
        dropSelf(FMBlocks.BLUID_1_BLOCK.get());
        dropSelf(FMBlocks.BLUID_2_BLOCK.get());
        dropSelf(FMBlocks.BLUID_3_BLOCK.get());
        dropSelf(FMBlocks.BLUID_4_BLOCK.get());
        dropSelf(FMBlocks.BLUID_5_BLOCK.get());
        // Yellid
        dropSelf(FMBlocks.YELLID_0_BLOCK.get());
        dropSelf(FMBlocks.YELLID_1_BLOCK.get());
        dropSelf(FMBlocks.YELLID_2_BLOCK.get());
        dropSelf(FMBlocks.YELLID_3_BLOCK.get());
        dropSelf(FMBlocks.YELLID_4_BLOCK.get());
        dropSelf(FMBlocks.YELLID_5_BLOCK.get());
        // Ruids
        dropSelf(FMBlocks.RUID_0_BLOCK.get());
        dropSelf(FMBlocks.RUID_1_BLOCK.get());
        dropSelf(FMBlocks.RUID_2_BLOCK.get());
        dropSelf(FMBlocks.RUID_3_BLOCK.get());
        dropSelf(FMBlocks.RUID_4_BLOCK.get());
        dropSelf(FMBlocks.RUID_5_BLOCK.get());
        // Grenids
        dropSelf(FMBlocks.GRENID_0_BLOCK.get());
        dropSelf(FMBlocks.GRENID_1_BLOCK.get());
        dropSelf(FMBlocks.GRENID_2_BLOCK.get());
        dropSelf(FMBlocks.GRENID_3_BLOCK.get());
        dropSelf(FMBlocks.GRENID_4_BLOCK.get());
        dropSelf(FMBlocks.GRENID_5_BLOCK.get());





    }



    @Override
    protected Iterable<Block> getKnownBlocks() {
        return FMBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}