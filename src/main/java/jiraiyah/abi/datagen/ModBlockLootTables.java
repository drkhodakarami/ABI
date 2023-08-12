package jiraiyah.abi.datagen;

import jiraiyah.abi.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider
{
    public ModBlockLootTables()
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate()
    {

    }

    //<editor-fold desc="HELPER METHODS">
    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
    //</editor-fold>
}