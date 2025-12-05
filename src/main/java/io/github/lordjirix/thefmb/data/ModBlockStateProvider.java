package io.github.lordjirix.thefmb.data;

import io.github.lordjirix.thefmb.Thefmb;
import io.github.lordjirix.thefmb.block.FMBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import static io.github.lordjirix.thefmb.block.FMBlocks.RUID_1_BLOCK;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Thefmb.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {


       blockWithItem(FMBlocks.TFMB_BLOCK);
       // Bluids
       blockWithItem(FMBlocks.BLUID_0_BLOCK);
       blockWithItem(FMBlocks.BLUID_1_BLOCK);
       blockWithItem(FMBlocks.BLUID_2_BLOCK);
       blockWithItem(FMBlocks.BLUID_3_BLOCK);
       blockWithItem(FMBlocks.BLUID_4_BLOCK);
       blockWithItem(FMBlocks.BLUID_5_BLOCK);
       // Yellids
       blockWithItem(FMBlocks.YELLID_0_BLOCK);
       blockWithItem(FMBlocks.YELLID_1_BLOCK);
       blockWithItem(FMBlocks.YELLID_2_BLOCK);
       blockWithItem(FMBlocks.YELLID_3_BLOCK);
       blockWithItem(FMBlocks.YELLID_4_BLOCK);
       blockWithItem(FMBlocks.YELLID_5_BLOCK);
       // Ruids
        blockWithItem(FMBlocks.RUID_0_BLOCK);
        blockWithItem(FMBlocks.RUID_1_BLOCK);
        blockWithItem(FMBlocks.RUID_2_BLOCK);
        blockWithItem(FMBlocks.RUID_3_BLOCK);
        blockWithItem(FMBlocks.RUID_4_BLOCK);
        blockWithItem(FMBlocks.RUID_5_BLOCK);
        // Grenids
        blockWithItem(FMBlocks.GRENID_0_BLOCK);
        blockWithItem(FMBlocks.GRENID_1_BLOCK);
        blockWithItem(FMBlocks.GRENID_2_BLOCK);
        blockWithItem(FMBlocks.GRENID_3_BLOCK);
        blockWithItem(FMBlocks.GRENID_4_BLOCK);
        blockWithItem(FMBlocks.GRENID_5_BLOCK);


    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}