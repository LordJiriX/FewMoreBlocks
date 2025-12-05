package io.github.lordjirix.thefmb.data;

import io.github.lordjirix.thefmb.Thefmb;
import io.github.lordjirix.thefmb.block.FMBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class FMBlockStateProvider extends BlockStateProvider {

    public FMBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Thefmb.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        FMBlocks.GENERATED_BLOCKS.forEach(this::blockWithItem);
    }

    private void blockWithItem(DeferredBlock<?> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
}