package jiraiyah.abi.datagen.custom;

import jiraiyah.abi.Reference;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider
{
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, Reference.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {

    }

    //<editor-fold desc="HELPER METHODS">
    private void BlockWithItem(RegistryObject<Block> blockRegistryObject)
    {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    //</editor-fold>
}