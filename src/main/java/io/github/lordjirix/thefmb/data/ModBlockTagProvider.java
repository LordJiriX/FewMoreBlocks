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

        // All blocks go in mineable_with_pickaxe
        var pickaxeTag = tag(BlockTags.MINEABLE_WITH_PICKAXE);

        FMBlocks.GENERATED_BLOCKS.forEach(block ->
                pickaxeTag.add(block.get())
        );

        // All blocks need at least stone tool
        var stoneToolTag = tag(BlockTags.NEEDS_STONE_TOOL);

        FMBlocks.GENERATED_BLOCKS.forEach(block ->
                stoneToolTag.add(block.get())
        );

        // If you have static blocks, add them too:
        // pickaxeTag.add(FMBlocks.TFMB_BLOCK.get());
        // stoneToolTag.add(FMBlocks.TFMB_BLOCK.get());
    }
}