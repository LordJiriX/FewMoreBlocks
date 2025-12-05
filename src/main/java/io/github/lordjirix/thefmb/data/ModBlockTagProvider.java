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


        var pickaxeTag = tag(BlockTags.MINEABLE_WITH_PICKAXE);

        FMBlocks.GENERATED_BLOCKS.forEach(block ->
                pickaxeTag.add(block.get())
        );


        var stoneToolTag = tag(BlockTags.NEEDS_STONE_TOOL);

        FMBlocks.GENERATED_BLOCKS.forEach(block ->
                stoneToolTag.add(block.get())
        );


    }
}