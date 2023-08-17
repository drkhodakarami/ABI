package jiraiyah.abi.datagen.custom;

import jiraiyah.abi.block.ModBlocks;
import jiraiyah.abi.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

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
        //<editor-fold desc="ORES">

        //<editor-fold desc="RUBY">
        this.add(ModBlocks.Ores.OVERWORLD_RUBY_ORE.get(), block -> createSilkTouchDispatchTable(block, ModItems.Gem.RUBY.get()));
        this.add(ModBlocks.Ores.DEEP_RUBY_ORE.get(), block -> createSilkTouchDispatchTable(block, ModItems.Gem.RUBY.get()));
        this.add(ModBlocks.Ores.END_RUBY_ORE.get(), block -> createSilkTouchDispatchTable(block, ModItems.Gem.RUBY.get()));
        this.add(ModBlocks.Ores.NETHER_RUBY_ORE.get(), block -> createSilkTouchDispatchTable(block, ModItems.Gem.RUBY.get()));
        //</editor-fold>

        //<editor-fold desc="SAPPHIRE">
        this.add(ModBlocks.Ores.OVERWORLD_SAPPHIRE_ORE.get(), block -> createSilkTouchDispatchTable(block, ModItems.Gem.SAPPHIRE.get()));
        this.add(ModBlocks.Ores.DEEP_SAPPHIRE_ORE.get(), block -> createSilkTouchDispatchTable(block, ModItems.Gem.SAPPHIRE.get()));
        this.add(ModBlocks.Ores.END_SAPPHIRE_ORE.get(), block -> createSilkTouchDispatchTable(block, ModItems.Gem.SAPPHIRE.get()));
        this.add(ModBlocks.Ores.NETHER_SAPPHIRE_ORE.get(), block -> createSilkTouchDispatchTable(block, ModItems.Gem.SAPPHIRE.get()));
        //</editor-fold>

        //</editor-fold>

        //<editor-fold desc="GEMS">
        dropSelf(ModBlocks.Gem.RUBY_BLOCK.get());
        dropSelf(ModBlocks.Gem.SAPPHIRE_BLOCK.get());
        //</editor-fold>

        /**/
    }

    //<editor-fold desc="HELPER METHODS">
    @Override
    protected @NotNull Iterable<Block> getKnownBlocks()
    {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    protected LootTable.Builder createOreDrops (Block pBlock, Item item)
    {
        return createOreDrops(pBlock, item, 2.0F, 5.0F);
    }

    // COPPER => Min = 2.0, Max = 5.0
    // LAPIS => Min = 4.0, Max = 9.0
    // REDSTONE => Min = 4.0, Max = 5.0
    protected LootTable.Builder createOreDrops (Block pBlock, Item item, float minCount, float maxCount)
    {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minCount, maxCount)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createSilkTouchDispatchTable(Block block, ItemLike item)
    {
        return createSilkTouchDispatchTable(block, this.applyExplosionDecay(block,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createSilkTouchDispatchTable(Block block, ItemLike item, float min, float max )
    {
        return createSilkTouchDispatchTable(block, this.applyExplosionDecay(block,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    //</editor-fold>
}