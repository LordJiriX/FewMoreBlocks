package io.github.lordjirix.thefmb.data;

import io.github.lordjirix.thefmb.Thefmb;
import io.github.lordjirix.thefmb.block.FMBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Thefmb.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(FMBlocks.GRENID_5_BLOCK.get())
                .add(FMBlocks.GRENID_4_BLOCK.get())
                .add(FMBlocks.GRENID_3_BLOCK.get())
                .add(FMBlocks.GRENID_2_BLOCK.get())
                .add(FMBlocks.GRENID_1_BLOCK.get())
                .add(FMBlocks.GRENID_0_BLOCK.get())
                .add(FMBlocks.TFMB_BLOCK.get())
                .add(FMBlocks.RUID_5_BLOCK.get())
                .add(FMBlocks.RUID_4_BLOCK.get())
                .add(FMBlocks.RUID_3_BLOCK.get())
                .add(FMBlocks.RUID_2_BLOCK.get())
                .add(FMBlocks.RUID_1_BLOCK.get())
                .add(FMBlocks.RUID_0_BLOCK.get())
                .add(FMBlocks.YELLID_5_BLOCK.get())
                .add(FMBlocks.YELLID_4_BLOCK.get())
                .add(FMBlocks.YELLID_3_BLOCK.get())
                .add(FMBlocks.YELLID_2_BLOCK.get())
                .add(FMBlocks.YELLID_1_BLOCK.get())
                .add(FMBlocks.YELLID_0_BLOCK.get())
                .add(FMBlocks.BLUID_5_BLOCK.get())
                .add(FMBlocks.BLUID_4_BLOCK.get())
                .add(FMBlocks.BLUID_3_BLOCK.get())
                .add(FMBlocks.BLUID_2_BLOCK.get())
                .add(FMBlocks.BLUID_1_BLOCK.get())
                .add(FMBlocks.BLUID_0_BLOCK.get());



        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(FMBlocks.GRENID_5_BLOCK.get())
                .add(FMBlocks.GRENID_4_BLOCK.get())
                .add(FMBlocks.GRENID_3_BLOCK.get())
                .add(FMBlocks.GRENID_2_BLOCK.get())
                .add(FMBlocks.GRENID_1_BLOCK.get())
                .add(FMBlocks.GRENID_0_BLOCK.get())
                .add(FMBlocks.TFMB_BLOCK.get())
                .add(FMBlocks.RUID_5_BLOCK.get())
                .add(FMBlocks.RUID_4_BLOCK.get())
                .add(FMBlocks.RUID_3_BLOCK.get())
                .add(FMBlocks.RUID_2_BLOCK.get())
                .add(FMBlocks.RUID_1_BLOCK.get())
                .add(FMBlocks.RUID_0_BLOCK.get())
                .add(FMBlocks.YELLID_5_BLOCK.get())
                .add(FMBlocks.YELLID_4_BLOCK.get())
                .add(FMBlocks.YELLID_3_BLOCK.get())
                .add(FMBlocks.YELLID_2_BLOCK.get())
                .add(FMBlocks.YELLID_1_BLOCK.get())
                .add(FMBlocks.YELLID_0_BLOCK.get())
                .add(FMBlocks.BLUID_5_BLOCK.get())
                .add(FMBlocks.BLUID_4_BLOCK.get())
                .add(FMBlocks.BLUID_3_BLOCK.get())
                .add(FMBlocks.BLUID_2_BLOCK.get())
                .add(FMBlocks.BLUID_1_BLOCK.get())
                .add(FMBlocks.BLUID_0_BLOCK.get());



    }
}