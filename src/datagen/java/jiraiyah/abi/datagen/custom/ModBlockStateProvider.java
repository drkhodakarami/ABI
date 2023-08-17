package jiraiyah.abi.datagen.custom;

import jiraiyah.abi.Reference;
import jiraiyah.abi.block.ModBlocks;
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
        //<editor-fold desc="ORES">

        //<editor-fold desc="RUBY">
        blockWithItem(ModBlocks.Ores.OVERWORLD_RUBY_ORE);
        blockWithItem(ModBlocks.Ores.DEEP_RUBY_ORE);
        blockWithItem(ModBlocks.Ores.END_RUBY_ORE);
        blockWithItem(ModBlocks.Ores.NETHER_RUBY_ORE);
        //</editor-fold>

        //<editor-fold desc="SAPPHIRE">
        blockWithItem(ModBlocks.Ores.OVERWORLD_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.Ores.DEEP_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.Ores.END_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.Ores.NETHER_SAPPHIRE_ORE);
        //</editor-fold>

        //</editor-fold>

        //<editor-fold desc="GEMS">
        blockWithItem(ModBlocks.Gem.RUBY_BLOCK);
        blockWithItem(ModBlocks.Gem.SAPPHIRE_BLOCK);
        //</editor-fold>
    }

    //<editor-fold desc="HELPER METHODS">
    private void blockWithItem(RegistryObject<Block> blockRegistryObject)
    {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    //</editor-fold>
}