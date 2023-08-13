package jiraiyah.abi.datagen;

import jiraiyah.abi.item.ModItems;
import jiraiyah.abi.item.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider
{
    public ModItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags)
    {
        super(pOutput, pLookupProvider, pBlockTags);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider)
    {
        //copy(ModTags.Blocks.RUBY_ORE, ModTags.Items.RUBY_ORE);



        //<editor-fold desc="GEMS">
        tag(ModTags.Items.RUBY_GEM).add(ModItems.Gem.RUBY.get());
        tag(ModTags.Items.SAPPHIRE_GEM).add(ModItems.Gem.SAPPHIRE.get());
        tag(ModTags.Items.SAPPHIRE_SHARD).add(ModItems.Gem.SAPPHIRE.get());
        tag(ModTags.Items.DIAMOND_SHARD).add(ModItems.Gem.DIAMOND_SHARD.get());
        tag(ModTags.Items.EMERALD_SHARD).add(ModItems.Gem.EMERALD_SHARD.get());
        tag(ModTags.Items.QUARTZ_SHARD).add(ModItems.Gem.QUARTZ_SHARD.get());
        tag(ModTags.Items.RUBY_SHARD).add(ModItems.Gem.RUBY_SHARD.get());
        tag(ModTags.Items.SAPPHIRE_SHARD).add(ModItems.Gem.SAPPHIRE_SHARD.get());

        tag(Tags.Items.GEMS).addTags(ModTags.Items.RUBY_GEM);
        tag(Tags.Items.GEMS).addTags(ModTags.Items.SAPPHIRE_GEM);
        tag(Tags.Items.GEMS).addTags(ModTags.Items.SAPPHIRE_SHARD);
        tag(Tags.Items.GEMS).addTags(ModTags.Items.DIAMOND_SHARD);
        tag(Tags.Items.GEMS).addTags(ModTags.Items.EMERALD_SHARD);
        tag(Tags.Items.GEMS).addTags(ModTags.Items.QUARTZ_SHARD);
        tag(Tags.Items.GEMS).addTags(ModTags.Items.RUBY_SHARD);
        tag(Tags.Items.GEMS).addTags(ModTags.Items.SAPPHIRE_SHARD);
        //</editor-fold>
    }
}