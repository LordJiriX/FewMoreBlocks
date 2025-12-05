package io.github.lordjirix.thefmb.data;

import io.github.lordjirix.thefmb.Thefmb;
import io.github.lordjirix.thefmb.block.FMBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;

public class FMBlockStateProvider extends BlockStateProvider {

    public FMBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Thefmb.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        // Loop through all auto-registered blocks
        FMBlocks.GENERATED_BLOCKS.forEach(this::blockWithItem);

        // If you also have static blocks:
        // blockWithItem(FMBlocks.TFMB_BLOCK);
        // blockWithItem(FMBlocks.BLUID_0_BLOCK);
    }

    /**
     * Creates:
     *  ✔ blockstate file
     *  ✔ block model (cube_all)
     *  ✔ item model (generated from block model)
     */
    private void blockWithItem(DeferredBlock<?> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
}