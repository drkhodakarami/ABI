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

        /*blockWithItem(ModBlocks.Ores.OVERWORLD_LEAD_ORE);
        blockWithItem(ModBlocks.Ores.Deep_LEAD_ORE);

        blockWithItem(ModBlocks.Ores.OVERWORLD_NICKEL_ORE);
        blockWithItem(ModBlocks.Ores.Deep_NICKEL_ORE);

        blockWithItem(ModBlocks.Ores.OVERWORLD_NITER_ORE);
        blockWithItem(ModBlocks.Ores.Deep_NITER_ORE);

        blockWithItem(ModBlocks.Ores.OVERWORLD_SILVER_ORE);
        blockWithItem(ModBlocks.Ores.Deep_SILVER_ORE);

        blockWithItem(ModBlocks.Ores.OVERWORLD_SULFUR_ORE);
        blockWithItem(ModBlocks.Ores.Deep_SULFUR_ORE);
        blockWithItem(ModBlocks.Ores.NETHER_SULFUR_ORE);

        blockWithItem(ModBlocks.Ores.OVERWORLD_TIN_ORE);
        blockWithItem(ModBlocks.Ores.Deep_TIN_ORE);

        blockWithItem(ModBlocks.Ores.OVERWORLD_RUBY_ORE);
        blockWithItem(ModBlocks.Ores.DEEP_RUBY_ORE);
        blockWithItem(ModBlocks.Ores.END_RUBY_ORE);
        blockWithItem(ModBlocks.Ores.NETHER_RUBY_ORE);

        blockWithItem(ModBlocks.Ores.OVERWORLD_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.Ores.DEEP_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.Ores.END_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.Ores.NETHER_SAPPHIRE_ORE);*/

        //</editor-fold>

        //<editor-fold desc="INGOTS">
        /*blockWithItem(ModBlocks.Ingots.BRONZE_BLOCK);
        blockWithItem(ModBlocks.Ingots.CONSTANTAN_BLOCK);
        blockWithItem(ModBlocks.Ingots.ELECTRUM_BLOCK);
        blockWithItem(ModBlocks.Ingots.ENDERITE_BLOCK);
        blockWithItem(ModBlocks.Ingots.INVAR_BLOCK);
        blockWithItem(ModBlocks.Ingots.LEAD_BLOCK);
        blockWithItem(ModBlocks.Ingots.LUMIUM_BLOCK);
        blockWithItem(ModBlocks.Ingots.NICKEL_BLOCK);
        blockWithItem(ModBlocks.Ingots.RAW_LEAD_BLOCK);
        blockWithItem(ModBlocks.Ingots.RAW_NICKEL_BLOCK);
        blockWithItem(ModBlocks.Ingots.RAW_SILVER_BLOCK);
        blockWithItem(ModBlocks.Ingots.RAW_TIN_BLOCK);
        blockWithItem(ModBlocks.Ingots.SIGNALUM_BLOCK);
        blockWithItem(ModBlocks.Ingots.SILVER_BLOCK);
        blockWithItem(ModBlocks.Ingots.STEEL_BLOCK);
        blockWithItem(ModBlocks.Ingots.SULFUR_BLOCK);
        blockWithItem(ModBlocks.Ingots.TIN_BLOCK);*/
        //</editor-fold>

        //<editor-fold desc="GEMS">
        /*blockWithItem(ModBlocks.Gem.RUBY_BLOCK);
        blockWithItem(ModBlocks.Gem.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.Gem.SLIME_BLOCK);*/
        //</editor-fold>

        /*getVariantBuilder(ModBlocks.POTATO_BLOCK.get())
                .partialState()
                .modelForState()
                .modelFile(models().cubeBottomTop(Reference.Names.POTATO + Reference.Names.BLOCK,
                        Reference.Location("block/potato_block_side"),
                        Reference.Location("block/potato_block_bottom"),
                        Reference.Location("block/potato_block_top")))
                .addModel();
        simpleBlockItem(ModBlocks.POTATO_BLOCK.get(),
                models().cubeBottomTop(Reference.Names.POTATO + Reference.Names.BLOCK,
                        Reference.Location("block/potato_block_side"),
                        Reference.Location("block/potato_block_bottom"),
                        Reference.Location("block/potato_block_top")
                ));*/
    }

    //<editor-fold desc="HELPER METHODS">
    private void blockWithItem(RegistryObject<Block> blockRegistryObject)
    {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    //</editor-fold>
}