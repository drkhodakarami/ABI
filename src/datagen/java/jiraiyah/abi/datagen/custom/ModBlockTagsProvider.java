package jiraiyah.abi.datagen.custom;

import jiraiyah.abi.Reference;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider
{
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, Reference.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider)
    {
        /*this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get()
                );*/

        /*this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get()
                );*/

        /*this.tag(BlockTags.MINEABLE_WITH_HOE)
                .add(
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get()
                );*/

        /*this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get()
                );*/

        /*this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get()
                    );*/

        /*this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get()
                );*/

        /*this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get()
                );*/

        /*this.tag(Tags.Blocks.NEEDS_GOLD_TOOL)
                .add(
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get()
                );*/

        /*this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get()
                );*/

        /*this.tag(Tags.Blocks.NEEDS_WOOD_TOOL)
                .add(
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get()
                );*/
    }
}