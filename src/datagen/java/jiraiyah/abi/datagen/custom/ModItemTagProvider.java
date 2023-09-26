package jiraiyah.abi.datagen.custom;

import jiraiyah.abi.Reference;
import jiraiyah.abi.item.ModItems;
import jiraiyah.abi.zlib.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider
{
    public ModItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                              CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(pOutput, pLookupProvider, pBlockTags, Reference.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider)
    {
        //copy(ModTags.Blocks.RUBY_ORE, ModTags.Items.RUBY_ORE);

        //<editor-fold desc="TRIMMABLE ARMOR">
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Armor.AMETHYST_HELMET.get(),
                        ModItems.Armor.AMETHYST_CHESTPLATE.get(),
                        ModItems.Armor.AMETHYST_LEGGINGS.get(),
                        ModItems.Armor.AMETHYST_BOOTS.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Armor.BRONZE_HELMET.get(),
                        ModItems.Armor.BRONZE_LEGGINGS.get(),
                        ModItems.Armor.BRONZE_CHESTPLATE.get(),
                        ModItems.Armor.BRONZE_BOOTS.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Armor.CITRINE_HELMET.get(),
                        ModItems.Armor.CITRINE_CHESTPLATE.get(),
                        ModItems.Armor.CITRINE_LEGGINGS.get(),
                        ModItems.Armor.CITRINE_BOOTS.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Armor.CONSTANTAN_HELMET.get(),
                        ModItems.Armor.CONSTANTAN_CHESTPLATE.get(),
                        ModItems.Armor.CONSTANTAN_LEGGINGS.get(),
                        ModItems.Armor.CONSTANTAN_BOOTS.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Armor.COPPER_HELMET.get(),
                        ModItems.Armor.COPPER_CHESTPLATE.get(),
                        ModItems.Armor.COPPER_LEGGINGS.get(),
                        ModItems.Armor.COPPER_BOOTS.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Armor.ELECTRUM_HELMET.get(),
                        ModItems.Armor.ELECTRUM_CHESTPLATE.get(),
                        ModItems.Armor.ELECTRUM_LEGGINGS.get(),
                        ModItems.Armor.ELECTRUM_BOOTS.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Armor.EMERALD_HELMET.get(),
                        ModItems.Armor.EMERALD_CHESTPLATE.get(),
                        ModItems.Armor.EMERALD_LEGGINGS.get(),
                        ModItems.Armor.EMERALD_BOOTS.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Armor.INVAR_HELMET.get(),
                        ModItems.Armor.INVAR_CHESTPLATE.get(),
                        ModItems.Armor.INVAR_LEGGINGS.get(),
                        ModItems.Armor.INVAR_BOOTS.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Armor.LEAD_HELMET.get(),
                        ModItems.Armor.LEAD_CHESTPLATE.get(),
                        ModItems.Armor.LEAD_LEGGINGS.get(),
                        ModItems.Armor.LEAD_BOOTS.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Armor.NICKEL_HELMET.get(),
                        ModItems.Armor.NICKEL_CHESTPLATE.get(),
                        ModItems.Armor.NICKEL_LEGGINGS.get(),
                        ModItems.Armor.NICKEL_BOOTS.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Armor.RUBY_HELMET.get(),
                        ModItems.Armor.RUBY_CHESTPLATE.get(),
                        ModItems.Armor.RUBY_LEGGINGS.get(),
                        ModItems.Armor.RUBY_BOOTS.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Armor.SAPPHIRE_HELMET.get(),
                        ModItems.Armor.SAPPHIRE_CHESTPLATE.get(),
                        ModItems.Armor.SAPPHIRE_LEGGINGS.get(),
                        ModItems.Armor.SAPPHIRE_BOOTS.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Armor.SILVER_HELMET.get(),
                        ModItems.Armor.SILVER_CHESTPLATE.get(),
                        ModItems.Armor.SILVER_LEGGINGS.get(),
                        ModItems.Armor.SILVER_BOOTS.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Armor.TIN_HELMET.get(),
                        ModItems.Armor.TIN_CHESTPLATE.get(),
                        ModItems.Armor.TIN_LEGGINGS.get(),
                        ModItems.Armor.TIN_BOOTS.get());
        //</editor-fold>

        //<editor-fold desc="CRYSTALS">
        tag(ModTags.Items.Crystals.COBALT).add(ModItems.Crystal.COBALT.get());
        tag(ModTags.Items.Crystals.CYANIDE).add(ModItems.Crystal.CYANIDE.get());
        tag(ModTags.Items.Crystals.GLOWSTONE).add(ModItems.Crystal.GLOWSTONE.get());
        tag(ModTags.Items.Crystals.NITER).add(ModItems.Crystal.NITER.get());
        tag(ModTags.Items.Crystals.URANIUM).add(ModItems.Crystal.URANIUM.get());
        tag(ModTags.Items.Crystals.YELLORIUM).add(ModItems.Crystal.YELLORIUM.get());

        tag(ModTags.Items.Crystals.ALL).addTags(ModTags.Items.Crystals.COBALT);
        tag(ModTags.Items.Crystals.ALL).addTags(ModTags.Items.Crystals.CYANIDE);
        tag(ModTags.Items.Crystals.ALL).addTags(ModTags.Items.Crystals.GLOWSTONE);
        tag(ModTags.Items.Crystals.ALL).addTags(ModTags.Items.Crystals.NITER);
        tag(ModTags.Items.Crystals.ALL).addTags(ModTags.Items.Crystals.URANIUM);
        tag(ModTags.Items.Crystals.ALL).addTags(ModTags.Items.Crystals.YELLORIUM);
        //</editor-fold>

        //<editor-fold desc="DUSTS">
        tag(ModTags.Items.Dusts.ALUMINIUM).add(ModItems.Dust.ALUMINIUM.get());
        tag(ModTags.Items.Dusts.ALUMINIUM_BRASS).add(ModItems.Dust.ALUMINIUM_BRASS.get());
        tag(ModTags.Items.Dusts.ALUMITE).add(ModItems.Dust.ALUMITE.get());
        tag(ModTags.Items.Dusts.AMETHYST_BRONZE).add(ModItems.Dust.AMETHYST_BRONZE.get());
        tag(ModTags.Items.Dusts.APATITE).add(ModItems.Dust.APATITE.get());
        tag(ModTags.Items.Dusts.ARDITE).add(ModItems.Dust.ARDITE.get());
        tag(ModTags.Items.Dusts.BERYLLIUM).add(ModItems.Dust.BERYLLIUM.get());
        tag(ModTags.Items.Dusts.BLUTONIUM).add(ModItems.Dust.BLUTONIUM.get());
        tag(ModTags.Items.Dusts.BORON).add(ModItems.Dust.BORON.get());
        tag(ModTags.Items.Dusts.BRASS).add(ModItems.Dust.BRASS.get());
        tag(ModTags.Items.Dusts.BRONZE).add(ModItems.Dust.BRONZE.get());
        tag(ModTags.Items.Dusts.CHARCOAL).add(ModItems.Dust.CHARCOAL.get());
        tag(ModTags.Items.Dusts.CINNABAR).add(ModItems.Dust.CINNABAR.get());
        tag(ModTags.Items.Dusts.CITRINE).add(ModItems.Dust.CITRINE.get());
        tag(ModTags.Items.Dusts.COAL).add(ModItems.Dust.COAL.get());
        tag(ModTags.Items.Dusts.COBALT).add(ModItems.Dust.COBALT.get());
        tag(ModTags.Items.Dusts.CONDUCTIVE_IRON).add(ModItems.Dust.CONDUCTIVE_IRON.get());
        tag(ModTags.Items.Dusts.CONSTANTAN).add(ModItems.Dust.CONSTANTAN.get());
        tag(ModTags.Items.Dusts.COPPER).add(ModItems.Dust.COPPER.get());
        tag(ModTags.Items.Dusts.CRUDE_STEEL).add(ModItems.Dust.CRUDE_STEEL.get());
        tag(ModTags.Items.Dusts.CYANIDE).add(ModItems.Dust.CYANIDE.get());
        tag(ModTags.Items.Dusts.DARK_STEEL).add(ModItems.Dust.DARK_STEEL.get());
        tag(ModTags.Items.Dusts.DAWN_STONE).add(ModItems.Dust.DAWN_STONE.get());
        tag(ModTags.Items.Dusts.DEMONIUM).add(ModItems.Dust.DEMONIUM.get());
        tag(ModTags.Items.Dusts.DIAMOND).add(ModItems.Dust.DIAMOND.get());
        tag(ModTags.Items.Dusts.DRACONIUM).add(ModItems.Dust.DRACONIUM.get());
        tag(ModTags.Items.Dusts.ELECTRICAL_STEEL).add(ModItems.Dust.ELECTRICAL_STEEL.get());
        tag(ModTags.Items.Dusts.ELECTRUM).add(ModItems.Dust.ELECTRUM.get());
        tag(ModTags.Items.Dusts.EMERALD).add(ModItems.Dust.EMERALD.get());
        tag(ModTags.Items.Dusts.ENCHANTIUM).add(ModItems.Dust.ENCHANTIUM.get());
        tag(ModTags.Items.Dusts.END_STEEL).add(ModItems.Dust.END_STEEL.get());
        tag(ModTags.Items.Dusts.ENDERITE).add(ModItems.Dust.ENDERITE.get());
        tag(ModTags.Items.Dusts.ENERGETIC_SILVER).add(ModItems.Dust.ENERGETIC_SILVER.get());
        tag(ModTags.Items.Dusts.GOLD).add(ModItems.Dust.GOLD.get());
        tag(ModTags.Items.Dusts.GRAPHITE).add(ModItems.Dust.GRAPHITE.get());
        tag(ModTags.Items.Dusts.HEPATIZON).add(ModItems.Dust.HEPATIZON.get());
        tag(ModTags.Items.Dusts.INVAR).add(ModItems.Dust.INVAR.get());
        tag(ModTags.Items.Dusts.IRIDIUM).add(ModItems.Dust.IRIDIUM.get());
        tag(ModTags.Items.Dusts.IRON).add(ModItems.Dust.IRON.get());
        tag(ModTags.Items.Dusts.LAPIS).add(ModItems.Dust.LAPIS.get());
        tag(ModTags.Items.Dusts.LEAD).add(ModItems.Dust.LEAD.get());
        tag(ModTags.Items.Dusts.LITHIUM).add(ModItems.Dust.LITHIUM.get());
        tag(ModTags.Items.Dusts.LUDICRITE).add(ModItems.Dust.LUDICRITE.get());
        tag(ModTags.Items.Dusts.LUMIUM).add(ModItems.Dust.LUMIUM.get());
        tag(ModTags.Items.Dusts.MAGNESIUM).add(ModItems.Dust.MAGNESIUM.get());
        tag(ModTags.Items.Dusts.MANGANESE).add(ModItems.Dust.MANGANESE.get());
        tag(ModTags.Items.Dusts.MANYULLYN).add(ModItems.Dust.MANYULLYN.get());
        tag(ModTags.Items.Dusts.NETHERITE).add(ModItems.Dust.NETHERITE.get());
        tag(ModTags.Items.Dusts.NICKEL).add(ModItems.Dust.NICKEL.get());
        tag(ModTags.Items.Dusts.NITER).add(ModItems.Dust.NITER.get());
        tag(ModTags.Items.Dusts.OBSIDIAN).add(ModItems.Dust.OBSIDIAN.get());
        tag(ModTags.Items.Dusts.OSMIUM).add(ModItems.Dust.OSMIUM.get());
        tag(ModTags.Items.Dusts.PLATINUM).add(ModItems.Dust.PLATINUM.get());
        tag(ModTags.Items.Dusts.PRISMARINE).add(ModItems.Dust.PRISMARINE.get());
        tag(ModTags.Items.Dusts.QUARTZ).add(ModItems.Dust.QUARTZ.get());
        tag(ModTags.Items.Dusts.ROSE_GOLD).add(ModItems.Dust.ROSE_GOLD.get());
        tag(ModTags.Items.Dusts.RUBY).add(ModItems.Dust.RUBY.get());
        tag(ModTags.Items.Dusts.SAPPHIRE).add(ModItems.Dust.SAPPHIRE.get());
        tag(ModTags.Items.Dusts.SIGNALUM).add(ModItems.Dust.SIGNALUM.get());
        tag(ModTags.Items.Dusts.SILVER).add(ModItems.Dust.SILVER.get());
        tag(ModTags.Items.Dusts.SLIMESTEEL).add(ModItems.Dust.SLIMESTEEL.get());
        tag(ModTags.Items.Dusts.SOULSTEEL).add(ModItems.Dust.SOULSTEEL.get());
        tag(ModTags.Items.Dusts.STEEL).add(ModItems.Dust.STEEL.get());
        tag(ModTags.Items.Dusts.SULFUR).add(ModItems.Dust.SULFUR.get());
        tag(ModTags.Items.Dusts.TIN).add(ModItems.Dust.TIN.get());
        tag(ModTags.Items.Dusts.URANIUM).add(ModItems.Dust.URANIUM.get());
        tag(ModTags.Items.Dusts.YELLORIUM).add(ModItems.Dust.YELLORIUM.get());
        tag(ModTags.Items.Dusts.ZINC).add(ModItems.Dust.ZINC.get());

        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.ALUMINIUM);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.ALUMINIUM_BRASS);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.ALUMITE);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.AMETHYST_BRONZE);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.APATITE);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.ARDITE);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.BERYLLIUM);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.BLUTONIUM);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.BORON);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.BRASS);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.BRONZE);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.CHARCOAL);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.CINNABAR);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.CITRINE);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.COAL);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.COBALT);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.CONDUCTIVE_IRON);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.CONSTANTAN);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.COPPER);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.CRUDE_STEEL);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.CYANIDE);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.DARK_STEEL);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.DAWN_STONE);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.DEMONIUM);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.DIAMOND);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.DRACONIUM);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.ELECTRICAL_STEEL);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.ELECTRUM);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.EMERALD);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.ENCHANTIUM);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.END_STEEL);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.ENDERITE);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.ENERGETIC_SILVER);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.GOLD);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.GRAPHITE);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.HEPATIZON);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.INVAR);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.IRIDIUM);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.IRON);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.LAPIS);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.LEAD);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.LITHIUM);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.LUDICRITE);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.LUMIUM);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.MAGNESIUM);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.MANGANESE);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.MANYULLYN);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.NETHERITE);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.NICKEL);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.NITER);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.OBSIDIAN);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.OSMIUM);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.PLATINUM);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.PRISMARINE);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.QUARTZ);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.ROSE_GOLD);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.RUBY);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.SAPPHIRE);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.SIGNALUM);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.SILVER);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.SLIMESTEEL);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.SOULSTEEL);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.STEEL);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.SULFUR);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.TIN);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.URANIUM);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.YELLORIUM);
        tag(ModTags.Items.Dusts.ALL).addTags(ModTags.Items.Dusts.ZINC);
        //</editor-fold>

        //<editor-fold desc="GEARS">
        tag(ModTags.Items.Gears.ALUMINIUM).add(ModItems.Gear.ALUMINIUM.get());
        tag(ModTags.Items.Gears.ALUMINIUM_BRASS).add(ModItems.Gear.ALUMINIUM_BRASS.get());
        tag(ModTags.Items.Gears.ALUMITE).add(ModItems.Gear.ALUMITE.get());
        tag(ModTags.Items.Gears.AMETHYST_BRONZE).add(ModItems.Gear.AMETHYST_BRONZE.get());
        tag(ModTags.Items.Gears.ARDITE).add(ModItems.Gear.ARDITE.get());
        tag(ModTags.Items.Gears.BERYLLIUM).add(ModItems.Gear.BERYLLIUM.get());
        tag(ModTags.Items.Gears.BLUTONIUM).add(ModItems.Gear.BLUTONIUM.get());
        tag(ModTags.Items.Gears.BORON).add(ModItems.Gear.BORON.get());
        tag(ModTags.Items.Gears.BRASS).add(ModItems.Gear.BRASS.get());
        tag(ModTags.Items.Gears.BRONZE).add(ModItems.Gear.BRONZE.get());
        tag(ModTags.Items.Gears.COBALT).add(ModItems.Gear.COBALT.get());
        tag(ModTags.Items.Gears.CONDUCTIVE_IRON).add(ModItems.Gear.CONDUCTIVE_IRON.get());
        tag(ModTags.Items.Gears.CONSTANTAN).add(ModItems.Gear.CONSTANTAN.get());
        tag(ModTags.Items.Gears.COPPER).add(ModItems.Gear.COPPER.get());
        tag(ModTags.Items.Gears.CRUDE_STEEL).add(ModItems.Gear.CRUDE_STEEL.get());
        tag(ModTags.Items.Gears.CYANIDE).add(ModItems.Gear.CYANIDE.get());
        tag(ModTags.Items.Gears.DARK_STEEL).add(ModItems.Gear.DARK_STEEL.get());
        tag(ModTags.Items.Gears.DAWN_STONE).add(ModItems.Gear.DAWN_STONE.get());
        tag(ModTags.Items.Gears.DEMONIUM).add(ModItems.Gear.DEMONIUM.get());
        tag(ModTags.Items.Gears.DIAMOND).add(ModItems.Gear.DIAMOND.get());
        tag(ModTags.Items.Gears.DRACONIUM).add(ModItems.Gear.DRACONIUM.get());
        tag(ModTags.Items.Gears.ELECTRICAL_STEEL).add(ModItems.Gear.ELECTRICAL_STEEL.get());
        tag(ModTags.Items.Gears.ELECTRUM).add(ModItems.Gear.ELECTRUM.get());
        tag(ModTags.Items.Gears.EMERALD).add(ModItems.Gear.EMERALD.get());
        tag(ModTags.Items.Gears.ENCHANTIUM).add(ModItems.Gear.ENCHANTIUM.get());
        tag(ModTags.Items.Gears.END_STEEL).add(ModItems.Gear.END_STEEL.get());
        tag(ModTags.Items.Gears.ENDERITE).add(ModItems.Gear.ENDERITE.get());
        tag(ModTags.Items.Gears.ENERGETIC_SILVER).add(ModItems.Gear.ENERGETIC_SILVER.get());
        tag(ModTags.Items.Gears.GLOWSTONE).add(ModItems.Gear.GLOWSTONE.get());
        tag(ModTags.Items.Gears.GOLD).add(ModItems.Gear.GOLD.get());
        tag(ModTags.Items.Gears.GRAPHITE).add(ModItems.Gear.GRAPHITE.get());
        tag(ModTags.Items.Gears.HEPATIZON).add(ModItems.Gear.HEPATIZON.get());
        tag(ModTags.Items.Gears.INVAR).add(ModItems.Gear.INVAR.get());
        tag(ModTags.Items.Gears.IRIDIUM).add(ModItems.Gear.IRIDIUM.get());
        tag(ModTags.Items.Gears.IRON).add(ModItems.Gear.IRON.get());
        tag(ModTags.Items.Gears.LAPIS).add(ModItems.Gear.LAPIS.get());
        tag(ModTags.Items.Gears.LEAD).add(ModItems.Gear.LEAD.get());
        tag(ModTags.Items.Gears.LITHIUM).add(ModItems.Gear.LITHIUM.get());
        tag(ModTags.Items.Gears.LUDICRITE).add(ModItems.Gear.LUDICRITE.get());
        tag(ModTags.Items.Gears.LUMIUM).add(ModItems.Gear.LUMIUM.get());
        tag(ModTags.Items.Gears.MAGNESIUM).add(ModItems.Gear.MAGNESIUM.get());
        tag(ModTags.Items.Gears.MANGANESE).add(ModItems.Gear.MANGANESE.get());
        tag(ModTags.Items.Gears.MANYULLYN).add(ModItems.Gear.MANYULLYN.get());
        tag(ModTags.Items.Gears.NETHERITE).add(ModItems.Gear.NETHERITE.get());
        tag(ModTags.Items.Gears.NICKEL).add(ModItems.Gear.NICKEL.get());
        tag(ModTags.Items.Gears.NITER).add(ModItems.Gear.NITER.get());
        tag(ModTags.Items.Gears.OBSIDIAN).add(ModItems.Gear.OBSIDIAN.get());
        tag(ModTags.Items.Gears.OSMIUM).add(ModItems.Gear.OSMIUM.get());
        tag(ModTags.Items.Gears.PLATINUM).add(ModItems.Gear.PLATINUM.get());
        tag(ModTags.Items.Gears.PRISMARINE).add(ModItems.Gear.PRISMARINE.get());
        tag(ModTags.Items.Gears.QUARTZ).add(ModItems.Gear.QUARTZ.get());
        tag(ModTags.Items.Gears.ROSE_GOLD).add(ModItems.Gear.ROSE_GOLD.get());
        tag(ModTags.Items.Gears.RUBY).add(ModItems.Gear.RUBY.get());
        tag(ModTags.Items.Gears.SAPPHIRE).add(ModItems.Gear.SAPPHIRE.get());
        tag(ModTags.Items.Gears.SIGNALUM).add(ModItems.Gear.SIGNALUM.get());
        tag(ModTags.Items.Gears.SILVER).add(ModItems.Gear.SILVER.get());
        tag(ModTags.Items.Gears.SLIMESTEEL).add(ModItems.Gear.SLIMESTEEL.get());
        tag(ModTags.Items.Gears.SOULSTEEL).add(ModItems.Gear.SOULSTEEL.get());
        tag(ModTags.Items.Gears.STEEL).add(ModItems.Gear.STEEL.get());
        tag(ModTags.Items.Gears.STONE).add(ModItems.Gear.STONE.get());
        tag(ModTags.Items.Gears.SULFUR).add(ModItems.Gear.SULFUR.get());
        tag(ModTags.Items.Gears.TIN).add(ModItems.Gear.TIN.get());
        tag(ModTags.Items.Gears.URANIUM).add(ModItems.Gear.URANIUM.get());
        tag(ModTags.Items.Gears.WOOD).add(ModItems.Gear.WOOD.get());
        tag(ModTags.Items.Gears.YELLORIUM).add(ModItems.Gear.YELLORIUM.get());
        tag(ModTags.Items.Gears.ZINC).add(ModItems.Gear.ZINC.get());

        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.ALUMINIUM);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.ALUMINIUM_BRASS);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.ALUMITE);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.AMETHYST_BRONZE);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.ARDITE);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.BERYLLIUM);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.BLUTONIUM);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.BORON);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.BRASS);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.BRONZE);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.COBALT);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.CONDUCTIVE_IRON);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.CONSTANTAN);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.COPPER);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.CRUDE_STEEL);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.CYANIDE);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.DARK_STEEL);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.DAWN_STONE);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.DIAMOND);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.DEMONIUM);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.DRACONIUM);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.ELECTRICAL_STEEL);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.ELECTRUM);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.EMERALD);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.ENCHANTIUM);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.END_STEEL);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.ENDERITE);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.ENERGETIC_SILVER);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.GLOWSTONE);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.GOLD);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.GRAPHITE);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.HEPATIZON);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.INVAR);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.IRIDIUM);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.IRON);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.LAPIS);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.LEAD);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.LITHIUM);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.LUDICRITE);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.LUMIUM);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.MAGNESIUM);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.MANGANESE);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.MANYULLYN);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.NETHERITE);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.NICKEL);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.NITER);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.OBSIDIAN);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.OSMIUM);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.PLATINUM);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.PRISMARINE);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.QUARTZ);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.ROSE_GOLD);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.RUBY);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.SAPPHIRE);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.SIGNALUM);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.SILVER);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.SLIMESTEEL);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.SOULSTEEL);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.STEEL);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.STONE);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.SULFUR);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.TIN);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.URANIUM);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.WOOD);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.YELLORIUM);
        tag(ModTags.Items.Gears.ALL).addTags(ModTags.Items.Gears.ZINC);
        //</editor-fold>

        //<editor-fold desc="INGOTS">
        tag(ModTags.Items.Ingots.ALUMINIUM).add(ModItems.Ingot.ALUMINIUM.get());
        tag(ModTags.Items.Ingots.ALUMINIUM_BRASS).add(ModItems.Ingot.ALUMINIUM_BRASS.get());
        tag(ModTags.Items.Ingots.ALUMITE).add(ModItems.Ingot.ALUMITE.get());
        tag(ModTags.Items.Ingots.AMETHYST_BRONZE).add(ModItems.Ingot.AMETHYST_BRONZE.get());
        tag(ModTags.Items.Ingots.ARDITE).add(ModItems.Ingot.ARDITE.get());
        tag(ModTags.Items.Ingots.BERYLLIUM).add(ModItems.Ingot.BERYLLIUM.get());
        tag(ModTags.Items.Ingots.BLUTONIUM).add(ModItems.Ingot.BLUTONIUM.get());
        tag(ModTags.Items.Ingots.BORON).add(ModItems.Ingot.BORON.get());
        tag(ModTags.Items.Ingots.BRASS).add(ModItems.Ingot.BRASS.get());
        tag(ModTags.Items.Ingots.BRONZE).add(ModItems.Ingot.BRONZE.get());
        tag(ModTags.Items.Ingots.CONDUCTIVE_IRON).add(ModItems.Ingot.CONDUCTIVE_IRON.get());
        tag(ModTags.Items.Ingots.CONSTANTAN).add(ModItems.Ingot.CONSTANTAN.get());
        tag(ModTags.Items.Ingots.CRUDE_STEEL).add(ModItems.Ingot.CRUDE_STEEL.get());
        tag(ModTags.Items.Ingots.DARK_STEEL).add(ModItems.Ingot.DARK_STEEL.get());
        tag(ModTags.Items.Ingots.DEMONIUM).add(ModItems.Ingot.DEMONIUM.get());
        tag(ModTags.Items.Ingots.DRACONIUM).add(ModItems.Ingot.DRACONIUM.get());
        tag(ModTags.Items.Ingots.ELECTRICAL_STEEL).add(ModItems.Ingot.ELECTRICAL_STEEL.get());
        tag(ModTags.Items.Ingots.ELECTRUM).add(ModItems.Ingot.ELECTRUM.get());
        tag(ModTags.Items.Ingots.ENCHANTIUM).add(ModItems.Ingot.ENCHANTIUM.get());
        tag(ModTags.Items.Ingots.END_STEEL).add(ModItems.Ingot.END_STEEL.get());
        tag(ModTags.Items.Ingots.ENDERITE).add(ModItems.Ingot.ENDERITE.get());
        tag(ModTags.Items.Ingots.ENERGETIC_SILVER).add(ModItems.Ingot.ENERGETIC_SILVER.get());
        tag(ModTags.Items.Ingots.GLOWSTONE).add(ModItems.Ingot.GLOWSTONE.get());
        tag(ModTags.Items.Ingots.HEPATIZON).add(ModItems.Ingot.HEPATIZON.get());
        tag(ModTags.Items.Ingots.INVAR).add(ModItems.Ingot.INVAR.get());
        tag(ModTags.Items.Ingots.IRIDIUM).add(ModItems.Ingot.IRIDIUM.get());
        tag(ModTags.Items.Ingots.LEAD).add(ModItems.Ingot.LEAD.get());
        tag(ModTags.Items.Ingots.LITHIUM).add(ModItems.Ingot.LITHIUM.get());
        tag(ModTags.Items.Ingots.LUDICRITE).add(ModItems.Ingot.LUDICRITE.get());
        tag(ModTags.Items.Ingots.LUMIUM).add(ModItems.Ingot.LUMIUM.get());
        tag(ModTags.Items.Ingots.MANYULLYN).add(ModItems.Ingot.MANYULLYN.get());
        tag(ModTags.Items.Ingots.NICKEL).add(ModItems.Ingot.NICKEL.get());
        tag(ModTags.Items.Ingots.OBSIDIAN).add(ModItems.Ingot.OBSIDIAN.get());
        tag(ModTags.Items.Ingots.OSMIUM).add(ModItems.Ingot.OSMIUM.get());
        tag(ModTags.Items.Ingots.PLATINUM).add(ModItems.Ingot.PLATINUM.get());
        tag(ModTags.Items.Ingots.ROSE_GOLD).add(ModItems.Ingot.ROSE_GOLD.get());
        tag(ModTags.Items.Ingots.SIGNALUM).add(ModItems.Ingot.SIGNALUM.get());
        tag(ModTags.Items.Ingots.SILVER).add(ModItems.Ingot.SILVER.get());
        tag(ModTags.Items.Ingots.SLIMESTEEL).add(ModItems.Ingot.SLIMESTEEL.get());
        tag(ModTags.Items.Ingots.SOULSTEEL).add(ModItems.Ingot.SOULSTEEL.get());
        tag(ModTags.Items.Ingots.STEEL).add(ModItems.Ingot.STEEL.get());
        tag(ModTags.Items.Ingots.TIN).add(ModItems.Ingot.TIN.get());
        tag(ModTags.Items.Ingots.URANIUM).add(ModItems.Ingot.URANIUM.get());
        tag(ModTags.Items.Ingots.YELLORIUM).add(ModItems.Ingot.YELLORIUM.get());
        tag(ModTags.Items.Ingots.ZINC).add(ModItems.Ingot.ZINC.get());

        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.ALUMINIUM);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.ALUMINIUM_BRASS);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.ALUMITE);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.AMETHYST_BRONZE);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.ARDITE);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.BERYLLIUM);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.BLUTONIUM);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.BORON);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.BRASS);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.BRONZE);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.CONDUCTIVE_IRON);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.CONSTANTAN);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.CRUDE_STEEL);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.DARK_STEEL);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.DEMONIUM);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.DRACONIUM);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.ELECTRICAL_STEEL);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.ELECTRUM);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.ENCHANTIUM);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.END_STEEL);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.ENDERITE);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.ENERGETIC_SILVER);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.GLOWSTONE);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.HEPATIZON);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.INVAR);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.IRIDIUM);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.LEAD);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.LITHIUM);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.LUDICRITE);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.LUMIUM);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.MANYULLYN);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.NICKEL);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.OBSIDIAN);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.OSMIUM);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.PLATINUM);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.ROSE_GOLD);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.SIGNALUM);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.SILVER);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.SLIMESTEEL);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.SOULSTEEL);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.STEEL);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.TIN);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.URANIUM);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.YELLORIUM);
        tag(ModTags.Items.Ingots.ALL).addTags(ModTags.Items.Ingots.ZINC);
        //</editor-fold>

        //<editor-fold desc="NUGGETS">
        tag(ModTags.Items.Nuggets.ALUMINIUM).add(ModItems.Nugget.ALUMINIUM.get());
        tag(ModTags.Items.Nuggets.ALUMINIUM_BRASS).add(ModItems.Nugget.ALUMINIUM_BRASS.get());
        tag(ModTags.Items.Nuggets.ALUMITE).add(ModItems.Nugget.ALUMITE.get());
        tag(ModTags.Items.Nuggets.AMETHYST_BRONZE).add(ModItems.Nugget.AMETHYST_BRONZE.get());
        tag(ModTags.Items.Nuggets.ARDITE).add(ModItems.Nugget.ARDITE.get());
        tag(ModTags.Items.Nuggets.BERYLLIUM).add(ModItems.Nugget.BERYLLIUM.get());
        tag(ModTags.Items.Nuggets.BLUTONIUM).add(ModItems.Nugget.BLUTONIUM.get());
        tag(ModTags.Items.Nuggets.BORON).add(ModItems.Nugget.BORON.get());
        tag(ModTags.Items.Nuggets.BRASS).add(ModItems.Nugget.BRASS.get());
        tag(ModTags.Items.Nuggets.BRONZE).add(ModItems.Nugget.BRONZE.get());
        tag(ModTags.Items.Nuggets.COBALT).add(ModItems.Nugget.COBALT.get());
        tag(ModTags.Items.Nuggets.CONDUCTIVE_IRON).add(ModItems.Nugget.CONDUCTIVE_IRON.get());
        tag(ModTags.Items.Nuggets.CONSTANTAN).add(ModItems.Nugget.CONSTANTAN.get());
        tag(ModTags.Items.Nuggets.COPPER).add(ModItems.Nugget.COPPER.get());
        tag(ModTags.Items.Nuggets.CRUDE_STEEL).add(ModItems.Nugget.CRUDE_STEEL.get());
        tag(ModTags.Items.Nuggets.CYANIDE).add(ModItems.Nugget.CYANIDE.get());
        tag(ModTags.Items.Nuggets.DARK_STEEL).add(ModItems.Nugget.DARK_STEEL.get());
        tag(ModTags.Items.Nuggets.DAWN_STONE).add(ModItems.Nugget.DAWN_STONE.get());
        tag(ModTags.Items.Nuggets.DEMONIUM).add(ModItems.Nugget.DEMONIUM.get());
        tag(ModTags.Items.Nuggets.DIAMOND).add(ModItems.Nugget.DIAMOND.get());
        tag(ModTags.Items.Nuggets.DRACONIUM).add(ModItems.Nugget.DRACONIUM.get());
        tag(ModTags.Items.Nuggets.ELECTRICAL_STEEL).add(ModItems.Nugget.ELECTRICAL_STEEL.get());
        tag(ModTags.Items.Nuggets.ELECTRUM).add(ModItems.Nugget.ELECTRUM.get());
        tag(ModTags.Items.Nuggets.EMERALD).add(ModItems.Nugget.EMERALD.get());
        tag(ModTags.Items.Nuggets.ENCHANTIUM).add(ModItems.Nugget.ENCHANTIUM.get());
        tag(ModTags.Items.Nuggets.END_STEEL).add(ModItems.Nugget.END_STEEL.get());
        tag(ModTags.Items.Nuggets.ENDERITE).add(ModItems.Nugget.ENDERITE.get());
        tag(ModTags.Items.Nuggets.ENERGETIC_SILVER).add(ModItems.Nugget.ENERGETIC_SILVER.get());
        tag(ModTags.Items.Nuggets.GLOWSTONE).add(ModItems.Nugget.GLOWSTONE.get());
        tag(ModTags.Items.Nuggets.GRAPHITE).add(ModItems.Nugget.GRAPHITE.get());
        tag(ModTags.Items.Nuggets.HEPATIZON).add(ModItems.Nugget.HEPATIZON.get());
        tag(ModTags.Items.Nuggets.INVAR).add(ModItems.Nugget.INVAR.get());
        tag(ModTags.Items.Nuggets.IRIDIUM).add(ModItems.Nugget.IRIDIUM.get());
        tag(ModTags.Items.Nuggets.LEAD).add(ModItems.Nugget.LEAD.get());
        tag(ModTags.Items.Nuggets.LITHIUM).add(ModItems.Nugget.LITHIUM.get());
        tag(ModTags.Items.Nuggets.LUDICRITE).add(ModItems.Nugget.LUDICRITE.get());
        tag(ModTags.Items.Nuggets.LUMIUM).add(ModItems.Nugget.LUMIUM.get());
        tag(ModTags.Items.Nuggets.MAGNESIUM).add(ModItems.Nugget.MAGNESIUM.get());
        tag(ModTags.Items.Nuggets.MANGANESE).add(ModItems.Nugget.MANGANESE.get());
        tag(ModTags.Items.Nuggets.MANYULLYN).add(ModItems.Nugget.MANYULLYN.get());
        tag(ModTags.Items.Nuggets.NETHERITE).add(ModItems.Nugget.NETHERITE.get());
        tag(ModTags.Items.Nuggets.NICKEL).add(ModItems.Nugget.NICKEL.get());
        tag(ModTags.Items.Nuggets.NITER).add(ModItems.Nugget.NITER.get());
        tag(ModTags.Items.Nuggets.OBSIDIAN).add(ModItems.Nugget.OBSIDIAN.get());
        tag(ModTags.Items.Nuggets.OSMIUM).add(ModItems.Nugget.OSMIUM.get());
        tag(ModTags.Items.Nuggets.PLATINUM).add(ModItems.Nugget.PLATINUM.get());
        tag(ModTags.Items.Nuggets.ROSE_GOLD).add(ModItems.Nugget.ROSE_GOLD.get());
        tag(ModTags.Items.Nuggets.SIGNALUM).add(ModItems.Nugget.SIGNALUM.get());
        tag(ModTags.Items.Nuggets.SILVER).add(ModItems.Nugget.SILVER.get());
        tag(ModTags.Items.Nuggets.SLIMESTEEL).add(ModItems.Nugget.SLIMESTEEL.get());
        tag(ModTags.Items.Nuggets.SOULSTEEL).add(ModItems.Nugget.SOULSTEEL.get());
        tag(ModTags.Items.Nuggets.STEEL).add(ModItems.Nugget.STEEL.get());
        tag(ModTags.Items.Nuggets.TIN).add(ModItems.Nugget.TIN.get());
        tag(ModTags.Items.Nuggets.URANIUM).add(ModItems.Nugget.URANIUM.get());
        tag(ModTags.Items.Nuggets.YELLORIUM).add(ModItems.Nugget.YELLORIUM.get());
        tag(ModTags.Items.Nuggets.ZINC).add(ModItems.Nugget.ZINC.get());

        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.ALUMINIUM);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.ALUMINIUM_BRASS);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.ALUMITE);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.AMETHYST_BRONZE);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.ARDITE);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.BERYLLIUM);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.BLUTONIUM);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.BORON);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.BRASS);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.BRONZE);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.COBALT);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.CONDUCTIVE_IRON);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.CONSTANTAN);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.COPPER);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.CRUDE_STEEL);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.CYANIDE);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.DARK_STEEL);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.DAWN_STONE);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.DEMONIUM);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.DIAMOND);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.DRACONIUM);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.ELECTRICAL_STEEL);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.ELECTRUM);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.EMERALD);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.ENCHANTIUM);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.END_STEEL);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.ENDERITE);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.ENERGETIC_SILVER);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.GLOWSTONE);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.GRAPHITE);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.HEPATIZON);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.INVAR);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.IRIDIUM);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.LEAD);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.LITHIUM);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.LUDICRITE);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.MAGNESIUM);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.MANGANESE);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.MANYULLYN);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.NETHERITE);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.NICKEL);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.NITER);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.OBSIDIAN);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.OSMIUM);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.PLATINUM);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.ROSE_GOLD);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.SIGNALUM);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.SILVER);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.SLIMESTEEL);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.SOULSTEEL);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.STEEL);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.TIN);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.URANIUM);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.YELLORIUM);
        tag(ModTags.Items.Nuggets.ALL).addTags(ModTags.Items.Nuggets.ZINC);
        //</editor-fold>

        //<editor-fold desc="PLATES">
        tag(ModTags.Items.Plates.ALUMINIUM).add(ModItems.Plate.ALUMINIUM.get());
        tag(ModTags.Items.Plates.ALUMINIUM_BRASS).add(ModItems.Plate.ALUMINIUM_BRASS.get());
        tag(ModTags.Items.Plates.ALUMITE).add(ModItems.Plate.ALUMITE.get());
        tag(ModTags.Items.Plates.AMETHYST_BRONZE).add(ModItems.Plate.AMETHYST_BRONZE.get());
        tag(ModTags.Items.Plates.ARDITE).add(ModItems.Plate.ARDITE.get());
        tag(ModTags.Items.Plates.BERYLLIUM).add(ModItems.Plate.BERYLLIUM.get());
        tag(ModTags.Items.Plates.BLUTONIUM).add(ModItems.Plate.BLUTONIUM.get());
        tag(ModTags.Items.Plates.BORON).add(ModItems.Plate.BORON.get());
        tag(ModTags.Items.Plates.BRASS).add(ModItems.Plate.BRASS.get());
        tag(ModTags.Items.Plates.BRONZE).add(ModItems.Plate.BRONZE.get());
        tag(ModTags.Items.Plates.CONDUCTIVE_IRON).add(ModItems.Plate.CONDUCTIVE_IRON.get());
        tag(ModTags.Items.Plates.CONSTANTAN).add(ModItems.Plate.CONSTANTAN.get());
        tag(ModTags.Items.Plates.COPPER).add(ModItems.Plate.COPPER.get());
        tag(ModTags.Items.Plates.CRUDE_STEEL).add(ModItems.Plate.CRUDE_STEEL.get());
        tag(ModTags.Items.Plates.DARK_STEEL).add(ModItems.Plate.DARK_STEEL.get());
        tag(ModTags.Items.Plates.DEMONIUM).add(ModItems.Plate.DEMONIUM.get());
        tag(ModTags.Items.Plates.DRACONIUM).add(ModItems.Plate.DRACONIUM.get());
        tag(ModTags.Items.Plates.ELECTRICAL_STEEL).add(ModItems.Plate.ELECTRICAL_STEEL.get());
        tag(ModTags.Items.Plates.ELECTRUM).add(ModItems.Plate.ELECTRUM.get());
        tag(ModTags.Items.Plates.ENCHANTIUM).add(ModItems.Plate.ENCHANTIUM.get());
        tag(ModTags.Items.Plates.END_STEEL).add(ModItems.Plate.END_STEEL.get());
        tag(ModTags.Items.Plates.ENDERITE).add(ModItems.Plate.ENDERITE.get());
        tag(ModTags.Items.Plates.ENERGETIC_SILVER).add(ModItems.Plate.ENERGETIC_SILVER.get());
        tag(ModTags.Items.Plates.GOLD).add(ModItems.Plate.GOLD.get());
        tag(ModTags.Items.Plates.HEPATIZON).add(ModItems.Plate.HEPATIZON.get());
        tag(ModTags.Items.Plates.INVAR).add(ModItems.Plate.INVAR.get());
        tag(ModTags.Items.Plates.IRIDIUM).add(ModItems.Plate.IRIDIUM.get());
        tag(ModTags.Items.Plates.IRON).add(ModItems.Plate.IRON.get());
        tag(ModTags.Items.Plates.LEAD).add(ModItems.Plate.LEAD.get());
        tag(ModTags.Items.Plates.LITHIUM).add(ModItems.Plate.LITHIUM.get());
        tag(ModTags.Items.Plates.LUDICRITE).add(ModItems.Plate.LUDICRITE.get());
        tag(ModTags.Items.Plates.LUMIUM).add(ModItems.Plate.LUMIUM.get());
        tag(ModTags.Items.Plates.MANYULLYN).add(ModItems.Plate.MANYULLYN.get());
        tag(ModTags.Items.Plates.NETHERITE).add(ModItems.Plate.NETHERITE.get());
        tag(ModTags.Items.Plates.NICKEL).add(ModItems.Plate.NICKEL.get());
        tag(ModTags.Items.Plates.OSMIUM).add(ModItems.Plate.OSMIUM.get());
        tag(ModTags.Items.Plates.PLATINUM).add(ModItems.Plate.PLATINUM.get());
        tag(ModTags.Items.Plates.ROSE_GOLD).add(ModItems.Plate.ROSE_GOLD.get());
        tag(ModTags.Items.Plates.SIGNALUM).add(ModItems.Plate.SIGNALUM.get());
        tag(ModTags.Items.Plates.SILVER).add(ModItems.Plate.SILVER.get());
        tag(ModTags.Items.Plates.SLIMESTEEL).add(ModItems.Plate.SLIMESTEEL.get());
        tag(ModTags.Items.Plates.SOULSTEEL).add(ModItems.Plate.SOULSTEEL.get());
        tag(ModTags.Items.Plates.STEEL).add(ModItems.Plate.STEEL.get());
        tag(ModTags.Items.Plates.TIN).add(ModItems.Plate.TIN.get());
        tag(ModTags.Items.Plates.URANIUM).add(ModItems.Plate.URANIUM.get());
        tag(ModTags.Items.Plates.ZINC).add(ModItems.Plate.ZINC.get());

        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.ALUMINIUM_BRASS);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.ALUMINIUM);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.ALUMITE);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.AMETHYST_BRONZE);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.ARDITE);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.BERYLLIUM);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.BLUTONIUM);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.BORON);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.BRASS);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.BRONZE);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.CONDUCTIVE_IRON);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.CONSTANTAN);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.COPPER);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.CRUDE_STEEL);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.DARK_STEEL);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.DEMONIUM);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.DRACONIUM);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.ELECTRICAL_STEEL);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.ELECTRUM);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.ENCHANTIUM);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.END_STEEL);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.ENDERITE);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.ENERGETIC_SILVER);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.GOLD);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.HEPATIZON);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.INVAR);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.IRIDIUM);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.IRON);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.LEAD);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.LITHIUM);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.LUDICRITE);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.LUMIUM);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.MANYULLYN);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.NETHERITE);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.NICKEL);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.OSMIUM);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.PLATINUM);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.ROSE_GOLD);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.SIGNALUM);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.SILVER);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.SLIMESTEEL);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.SOULSTEEL);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.STEEL);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.TIN);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.URANIUM);
        tag(ModTags.Items.Plates.ALL).addTags(ModTags.Items.Plates.ZINC);
        //</editor-fold>

        //<editor-fold desc="RAW">
        tag(ModTags.Items.Raw.ALUMINIUM).add(ModItems.Raw.ALUMINIUM.get());
        tag(ModTags.Items.Raw.LEAD).add(ModItems.Raw.LEAD.get());
        tag(ModTags.Items.Raw.NICKEL).add(ModItems.Raw.NICKEL.get());
        tag(ModTags.Items.Raw.OSMIUM).add(ModItems.Raw.OSMIUM.get());
        tag(ModTags.Items.Raw.PLATINUM).add(ModItems.Raw.PLATINUM.get());
        tag(ModTags.Items.Raw.SILVER).add(ModItems.Raw.SILVER.get());
        tag(ModTags.Items.Raw.TIN).add(ModItems.Raw.TIN.get());
        tag(ModTags.Items.Raw.URANIUM).add(ModItems.Raw.URANIUM.get());
        tag(ModTags.Items.Raw.ZINC).add(ModItems.Raw.ZINC.get());

        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Raw.ALUMINIUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Raw.LEAD);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Raw.NICKEL);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Raw.OSMIUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Raw.PLATINUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Raw.SILVER);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Raw.TIN);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Raw.URANIUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Raw.ZINC);
        //</editor-fold>

        //<editor-fold desc="ROD">
        tag(ModTags.Items.Rod.ALUMINIUM).add(ModItems.Rod.ALUMINIUM.get());
        tag(ModTags.Items.Rod.ALUMINIUM_BRASS).add(ModItems.Rod.ALUMINIUM_BRASS.get());
        tag(ModTags.Items.Rod.ALUMITE).add(ModItems.Rod.ALUMITE.get());
        tag(ModTags.Items.Rod.AMETHYST_BRONZE).add(ModItems.Rod.AMETHYST_BRONZE.get());
        tag(ModTags.Items.Rod.ARDITE).add(ModItems.Rod.ARDITE.get());
        tag(ModTags.Items.Rod.BERYLLIUM).add(ModItems.Rod.BERYLLIUM.get());
        tag(ModTags.Items.Rod.BLUTONIUM).add(ModItems.Rod.BLUTONIUM.get());
        tag(ModTags.Items.Rod.BORON).add(ModItems.Rod.BORON.get());
        tag(ModTags.Items.Rod.BRASS).add(ModItems.Rod.BRASS.get());
        tag(ModTags.Items.Rod.BRONZE).add(ModItems.Rod.BRONZE.get());
        tag(ModTags.Items.Rod.COBALT).add(ModItems.Rod.COBALT.get());
        tag(ModTags.Items.Rod.CONDUCTIVE_IRON).add(ModItems.Rod.CONDUCTIVE_IRON.get());
        tag(ModTags.Items.Rod.CONSTANTAN).add(ModItems.Rod.CONSTANTAN.get());
        tag(ModTags.Items.Rod.COPPER).add(ModItems.Rod.COPPER.get());
        tag(ModTags.Items.Rod.CRUDE_STEEL).add(ModItems.Rod.CRUDE_STEEL.get());
        tag(ModTags.Items.Rod.DARK_STEEL).add(ModItems.Rod.DARK_STEEL.get());
        tag(ModTags.Items.Rod.DEMONIUM).add(ModItems.Rod.DEMONIUM.get());
        tag(ModTags.Items.Rod.DRACONIUM).add(ModItems.Rod.DRACONIUM.get());
        tag(ModTags.Items.Rod.ELECTRICAL_STEEL).add(ModItems.Rod.ELECTRICAL_STEEL.get());
        tag(ModTags.Items.Rod.ELECTRUM).add(ModItems.Rod.ELECTRUM.get());
        tag(ModTags.Items.Rod.ENCHANTIUM).add(ModItems.Rod.ENCHANTIUM.get());
        tag(ModTags.Items.Rod.END_STEEL).add(ModItems.Rod.END_STEEL.get());
        tag(ModTags.Items.Rod.ENDERITE).add(ModItems.Rod.ENDERITE.get());
        tag(ModTags.Items.Rod.ENERGETIC_SILVER).add(ModItems.Rod.ENERGETIC_SILVER.get());
        tag(ModTags.Items.Rod.GLOWSTONE).add(ModItems.Rod.GLOWSTONE.get());
        tag(ModTags.Items.Rod.GOLD).add(ModItems.Rod.GOLD.get());
        tag(ModTags.Items.Rod.GRAPHITE).add(ModItems.Rod.GRAPHITE.get());
        tag(ModTags.Items.Rod.HEPATIZON).add(ModItems.Rod.HEPATIZON.get());
        tag(ModTags.Items.Rod.INVAR).add(ModItems.Rod.INVAR.get());
        tag(ModTags.Items.Rod.IRIDIUM).add(ModItems.Rod.IRIDIUM.get());
        tag(ModTags.Items.Rod.IRON).add(ModItems.Rod.IRON.get());
        tag(ModTags.Items.Rod.LEAD).add(ModItems.Rod.LEAD.get());
        tag(ModTags.Items.Rod.LITHIUM).add(ModItems.Rod.LITHIUM.get());
        tag(ModTags.Items.Rod.LUDICRITE).add(ModItems.Rod.LUDICRITE.get());
        tag(ModTags.Items.Rod.LUMIUM).add(ModItems.Rod.LUMIUM.get());
        tag(ModTags.Items.Rod.MAGNESIUM).add(ModItems.Rod.MAGNESIUM.get());
        tag(ModTags.Items.Rod.MANYULLYN).add(ModItems.Rod.MANYULLYN.get());
        tag(ModTags.Items.Rod.NICKEL).add(ModItems.Rod.NICKEL.get());
        tag(ModTags.Items.Rod.OBSIDIAN).add(ModItems.Rod.OBSIDIAN.get());
        tag(ModTags.Items.Rod.OSMIUM).add(ModItems.Rod.OSMIUM.get());
        tag(ModTags.Items.Rod.PLATINUM).add(ModItems.Rod.PLATINUM.get());
        tag(ModTags.Items.Rod.ROSE_GOLD).add(ModItems.Rod.ROSE_GOLD.get());
        tag(ModTags.Items.Rod.SIGNALUM).add(ModItems.Rod.SIGNALUM.get());
        tag(ModTags.Items.Rod.SILVER).add(ModItems.Rod.SILVER.get());
        tag(ModTags.Items.Rod.SLIMESTEEL).add(ModItems.Rod.SLIMESTEEL.get());
        tag(ModTags.Items.Rod.SOULSTEEL).add(ModItems.Rod.SOULSTEEL.get());
        tag(ModTags.Items.Rod.STEEL).add(ModItems.Rod.STEEL.get());
        tag(ModTags.Items.Rod.TIN).add(ModItems.Rod.TIN.get());
        tag(ModTags.Items.Rod.URANIUM).add(ModItems.Rod.URANIUM.get());
        tag(ModTags.Items.Rod.YELLORIUM).add(ModItems.Rod.YELLORIUM.get());
        tag(ModTags.Items.Rod.ZINC).add(ModItems.Rod.ZINC.get());

        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.ALUMINIUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.ALUMINIUM_BRASS);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.ALUMITE);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.AMETHYST_BRONZE);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.ARDITE);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.BERYLLIUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.BLUTONIUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.BORON);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.BRASS);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.BRONZE);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.COBALT);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.CONDUCTIVE_IRON);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.CONSTANTAN);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.COPPER);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.CRUDE_STEEL);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.DARK_STEEL);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.DEMONIUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.DRACONIUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.ELECTRICAL_STEEL);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.ELECTRUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.ENCHANTIUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.END_STEEL);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.ENDERITE);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.ENERGETIC_SILVER);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.GLOWSTONE);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.GOLD);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.GRAPHITE);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.HEPATIZON);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.INVAR);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.IRIDIUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.IRON);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.LEAD);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.LITHIUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.LUDICRITE);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.LUMIUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.MAGNESIUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.MANYULLYN);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.NICKEL);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.OBSIDIAN);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.OSMIUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.PLATINUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.ROSE_GOLD);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.SIGNALUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.SILVER);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.SLIMESTEEL);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.SOULSTEEL);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.STEEL);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.TIN);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.URANIUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.YELLORIUM);
        tag(ModTags.Items.Raw.ALL).addTags(ModTags.Items.Rod.ZINC);
        //</editor-fold>

        //<editor-fold desc="HEAD">

        //<editor-fold desc="BRONZE">
        tag(ModTags.Items.Head.BRONZE).add(ModItems.Head.BRONZE_AXE.get());
        tag(ModTags.Items.Head.BRONZE_AXE).add(ModItems.Head.BRONZE_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.BRONZE_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.BRONZE_AXE.get());

        tag(ModTags.Items.Head.BRONZE).add(ModItems.Head.BRONZE_HAMMER.get());
        tag(ModTags.Items.Head.BRONZE_HAMMER).add(ModItems.Head.BRONZE_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.BRONZE_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.BRONZE_HAMMER.get());

        tag(ModTags.Items.Head.BRONZE).add(ModItems.Head.BRONZE_HOE.get());
        tag(ModTags.Items.Head.BRONZE_HOE).add(ModItems.Head.BRONZE_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.BRONZE_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.BRONZE_HOE.get());

        tag(ModTags.Items.Head.BRONZE).add(ModItems.Head.BRONZE_PICKAXE.get());
        tag(ModTags.Items.Head.BRONZE_PICKAXE).add(ModItems.Head.BRONZE_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.BRONZE_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.BRONZE_PICKAXE.get());

        tag(ModTags.Items.Head.BRONZE).add(ModItems.Head.BRONZE_SHOVEL.get());
        tag(ModTags.Items.Head.BRONZE_SHOVEL).add(ModItems.Head.BRONZE_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.BRONZE_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.BRONZE_SHOVEL.get());

        tag(ModTags.Items.Head.BRONZE).add(ModItems.Head.BRONZE_SWORD.get());
        tag(ModTags.Items.Head.BRONZE_SWORD).add(ModItems.Head.BRONZE_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.BRONZE_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.BRONZE_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="CITRINE">
        tag(ModTags.Items.Head.CITRINE).add(ModItems.Head.CITRINE_AXE.get());
        tag(ModTags.Items.Head.CITRINE_AXE).add(ModItems.Head.CITRINE_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.CITRINE_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.CITRINE_AXE.get());

        tag(ModTags.Items.Head.CITRINE).add(ModItems.Head.CITRINE_HAMMER.get());
        tag(ModTags.Items.Head.CITRINE_HAMMER).add(ModItems.Head.CITRINE_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.CITRINE_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.CITRINE_HAMMER.get());

        tag(ModTags.Items.Head.CITRINE).add(ModItems.Head.CITRINE_HOE.get());
        tag(ModTags.Items.Head.CITRINE_HOE).add(ModItems.Head.CITRINE_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.CITRINE_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.CITRINE_HOE.get());

        tag(ModTags.Items.Head.CITRINE).add(ModItems.Head.CITRINE_PICKAXE.get());
        tag(ModTags.Items.Head.CITRINE_PICKAXE).add(ModItems.Head.CITRINE_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.CITRINE_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.CITRINE_PICKAXE.get());

        tag(ModTags.Items.Head.CITRINE).add(ModItems.Head.CITRINE_SHOVEL.get());
        tag(ModTags.Items.Head.CITRINE_SHOVEL).add(ModItems.Head.CITRINE_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.CITRINE_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.CITRINE_SHOVEL.get());

        tag(ModTags.Items.Head.CITRINE).add(ModItems.Head.CITRINE_SWORD.get());
        tag(ModTags.Items.Head.CITRINE_SWORD).add(ModItems.Head.CITRINE_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.CITRINE_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.CITRINE_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="CONSTANTAN">
        tag(ModTags.Items.Head.CONSTANTAN).add(ModItems.Head.CONSTANTAN_AXE.get());
        tag(ModTags.Items.Head.CONSTANTAN_AXE).add(ModItems.Head.CONSTANTAN_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.CONSTANTAN_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.CONSTANTAN_AXE.get());

        tag(ModTags.Items.Head.CONSTANTAN).add(ModItems.Head.CONSTANTAN_HAMMER.get());
        tag(ModTags.Items.Head.CONSTANTAN_HAMMER).add(ModItems.Head.CONSTANTAN_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.CONSTANTAN_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.CONSTANTAN_HAMMER.get());

        tag(ModTags.Items.Head.CONSTANTAN).add(ModItems.Head.CONSTANTAN_HOE.get());
        tag(ModTags.Items.Head.CONSTANTAN_HOE).add(ModItems.Head.CONSTANTAN_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.CONSTANTAN_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.CONSTANTAN_HOE.get());

        tag(ModTags.Items.Head.CONSTANTAN).add(ModItems.Head.CONSTANTAN_PICKAXE.get());
        tag(ModTags.Items.Head.CONSTANTAN_PICKAXE).add(ModItems.Head.CONSTANTAN_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.CONSTANTAN_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.CONSTANTAN_PICKAXE.get());

        tag(ModTags.Items.Head.CONSTANTAN).add(ModItems.Head.CONSTANTAN_SHOVEL.get());
        tag(ModTags.Items.Head.CONSTANTAN_SHOVEL).add(ModItems.Head.CONSTANTAN_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.CONSTANTAN_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.CONSTANTAN_SHOVEL.get());

        tag(ModTags.Items.Head.CONSTANTAN).add(ModItems.Head.CONSTANTAN_SWORD.get());
        tag(ModTags.Items.Head.CONSTANTAN_SWORD).add(ModItems.Head.CONSTANTAN_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.CONSTANTAN_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.CONSTANTAN_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="COPPER">
        tag(ModTags.Items.Head.COPPER).add(ModItems.Head.COPPER_AXE.get());
        tag(ModTags.Items.Head.COPPER_AXE).add(ModItems.Head.COPPER_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.COPPER_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.COPPER_AXE.get());

        tag(ModTags.Items.Head.COPPER).add(ModItems.Head.COPPER_HAMMER.get());
        tag(ModTags.Items.Head.COPPER_HAMMER).add(ModItems.Head.COPPER_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.COPPER_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.COPPER_HAMMER.get());

        tag(ModTags.Items.Head.COPPER).add(ModItems.Head.COPPER_HOE.get());
        tag(ModTags.Items.Head.COPPER_HOE).add(ModItems.Head.COPPER_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.COPPER_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.COPPER_HOE.get());

        tag(ModTags.Items.Head.COPPER).add(ModItems.Head.COPPER_PICKAXE.get());
        tag(ModTags.Items.Head.COPPER_PICKAXE).add(ModItems.Head.COPPER_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.COPPER_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.COPPER_PICKAXE.get());

        tag(ModTags.Items.Head.COPPER).add(ModItems.Head.COPPER_SHOVEL.get());
        tag(ModTags.Items.Head.COPPER_SHOVEL).add(ModItems.Head.COPPER_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.COPPER_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.COPPER_SHOVEL.get());

        tag(ModTags.Items.Head.COPPER).add(ModItems.Head.COPPER_SWORD.get());
        tag(ModTags.Items.Head.COPPER_SWORD).add(ModItems.Head.COPPER_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.COPPER_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.COPPER_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="DIAMOND">
        tag(ModTags.Items.Head.DIAMOND).add(ModItems.Head.DIAMOND_AXE.get());
        tag(ModTags.Items.Head.DIAMOND_AXE).add(ModItems.Head.DIAMOND_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.DIAMOND_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.DIAMOND_AXE.get());

        tag(ModTags.Items.Head.DIAMOND).add(ModItems.Head.DIAMOND_HAMMER.get());
        tag(ModTags.Items.Head.DIAMOND_HAMMER).add(ModItems.Head.DIAMOND_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.DIAMOND_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.DIAMOND_HAMMER.get());

        tag(ModTags.Items.Head.DIAMOND).add(ModItems.Head.DIAMOND_HOE.get());
        tag(ModTags.Items.Head.DIAMOND_HOE).add(ModItems.Head.DIAMOND_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.DIAMOND_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.DIAMOND_HOE.get());

        tag(ModTags.Items.Head.DIAMOND).add(ModItems.Head.DIAMOND_PICKAXE.get());
        tag(ModTags.Items.Head.DIAMOND_PICKAXE).add(ModItems.Head.DIAMOND_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.DIAMOND_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.DIAMOND_PICKAXE.get());

        tag(ModTags.Items.Head.DIAMOND).add(ModItems.Head.DIAMOND_SHOVEL.get());
        tag(ModTags.Items.Head.DIAMOND_SHOVEL).add(ModItems.Head.DIAMOND_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.DIAMOND_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.DIAMOND_SHOVEL.get());

        tag(ModTags.Items.Head.DIAMOND).add(ModItems.Head.DIAMOND_SWORD.get());
        tag(ModTags.Items.Head.DIAMOND_SWORD).add(ModItems.Head.DIAMOND_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.DIAMOND_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.DIAMOND_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="ELECTRUM">
        tag(ModTags.Items.Head.ELECTRUM).add(ModItems.Head.ELECTRUM_AXE.get());
        tag(ModTags.Items.Head.ELECTRUM_AXE).add(ModItems.Head.ELECTRUM_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.ELECTRUM_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.ELECTRUM_AXE.get());

        tag(ModTags.Items.Head.ELECTRUM).add(ModItems.Head.ELECTRUM_HAMMER.get());
        tag(ModTags.Items.Head.ELECTRUM_HAMMER).add(ModItems.Head.ELECTRUM_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.ELECTRUM_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.ELECTRUM_HAMMER.get());

        tag(ModTags.Items.Head.ELECTRUM).add(ModItems.Head.ELECTRUM_HOE.get());
        tag(ModTags.Items.Head.ELECTRUM_HOE).add(ModItems.Head.ELECTRUM_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.ELECTRUM_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.ELECTRUM_HOE.get());

        tag(ModTags.Items.Head.ELECTRUM).add(ModItems.Head.ELECTRUM_PICKAXE.get());
        tag(ModTags.Items.Head.ELECTRUM_PICKAXE).add(ModItems.Head.ELECTRUM_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.ELECTRUM_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.ELECTRUM_PICKAXE.get());

        tag(ModTags.Items.Head.ELECTRUM).add(ModItems.Head.ELECTRUM_SHOVEL.get());
        tag(ModTags.Items.Head.ELECTRUM_SHOVEL).add(ModItems.Head.ELECTRUM_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.ELECTRUM_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.ELECTRUM_SHOVEL.get());

        tag(ModTags.Items.Head.ELECTRUM).add(ModItems.Head.ELECTRUM_SWORD.get());
        tag(ModTags.Items.Head.ELECTRUM_SWORD).add(ModItems.Head.ELECTRUM_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.ELECTRUM_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.ELECTRUM_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="EMERALD">
        tag(ModTags.Items.Head.EMERALD).add(ModItems.Head.EMERALD_AXE.get());
        tag(ModTags.Items.Head.EMERALD_AXE).add(ModItems.Head.EMERALD_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.EMERALD_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.EMERALD_AXE.get());

        tag(ModTags.Items.Head.EMERALD).add(ModItems.Head.EMERALD_HAMMER.get());
        tag(ModTags.Items.Head.EMERALD_HAMMER).add(ModItems.Head.EMERALD_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.EMERALD_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.EMERALD_HAMMER.get());

        tag(ModTags.Items.Head.EMERALD).add(ModItems.Head.EMERALD_HOE.get());
        tag(ModTags.Items.Head.EMERALD_HOE).add(ModItems.Head.EMERALD_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.EMERALD_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.EMERALD_HOE.get());

        tag(ModTags.Items.Head.EMERALD).add(ModItems.Head.EMERALD_PICKAXE.get());
        tag(ModTags.Items.Head.EMERALD_PICKAXE).add(ModItems.Head.EMERALD_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.EMERALD_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.EMERALD_PICKAXE.get());

        tag(ModTags.Items.Head.EMERALD).add(ModItems.Head.EMERALD_SHOVEL.get());
        tag(ModTags.Items.Head.EMERALD_SHOVEL).add(ModItems.Head.EMERALD_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.EMERALD_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.EMERALD_SHOVEL.get());

        tag(ModTags.Items.Head.EMERALD).add(ModItems.Head.EMERALD_SWORD.get());
        tag(ModTags.Items.Head.EMERALD_SWORD).add(ModItems.Head.EMERALD_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.EMERALD_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.EMERALD_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="ENDERITE">
        tag(ModTags.Items.Head.ENDERITE).add(ModItems.Head.ENDERITE_AXE.get());
        tag(ModTags.Items.Head.ENDERITE_AXE).add(ModItems.Head.ENDERITE_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.ENDERITE_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.ENDERITE_AXE.get());

        tag(ModTags.Items.Head.ENDERITE).add(ModItems.Head.ENDERITE_HAMMER.get());
        tag(ModTags.Items.Head.ENDERITE_HAMMER).add(ModItems.Head.ENDERITE_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.ENDERITE_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.ENDERITE_HAMMER.get());

        tag(ModTags.Items.Head.ENDERITE).add(ModItems.Head.ENDERITE_HOE.get());
        tag(ModTags.Items.Head.ENDERITE_HOE).add(ModItems.Head.ENDERITE_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.ENDERITE_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.ENDERITE_HOE.get());

        tag(ModTags.Items.Head.ENDERITE).add(ModItems.Head.ENDERITE_PICKAXE.get());
        tag(ModTags.Items.Head.ENDERITE_PICKAXE).add(ModItems.Head.ENDERITE_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.ENDERITE_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.ENDERITE_PICKAXE.get());

        tag(ModTags.Items.Head.ENDERITE).add(ModItems.Head.ENDERITE_SHOVEL.get());
        tag(ModTags.Items.Head.ENDERITE_SHOVEL).add(ModItems.Head.ENDERITE_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.ENDERITE_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.ENDERITE_SHOVEL.get());

        tag(ModTags.Items.Head.ENDERITE).add(ModItems.Head.ENDERITE_SWORD.get());
        tag(ModTags.Items.Head.ENDERITE_SWORD).add(ModItems.Head.ENDERITE_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.ENDERITE_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.ENDERITE_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="GOLD">
        tag(ModTags.Items.Head.GOLD).add(ModItems.Head.GOLD_AXE.get());
        tag(ModTags.Items.Head.GOLD_AXE).add(ModItems.Head.GOLD_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.GOLD_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.GOLD_AXE.get());

        tag(ModTags.Items.Head.GOLD).add(ModItems.Head.GOLD_HAMMER.get());
        tag(ModTags.Items.Head.GOLD_HAMMER).add(ModItems.Head.GOLD_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.GOLD_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.GOLD_HAMMER.get());

        tag(ModTags.Items.Head.GOLD).add(ModItems.Head.GOLD_HOE.get());
        tag(ModTags.Items.Head.GOLD_HOE).add(ModItems.Head.GOLD_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.GOLD_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.GOLD_HOE.get());

        tag(ModTags.Items.Head.GOLD).add(ModItems.Head.GOLD_PICKAXE.get());
        tag(ModTags.Items.Head.GOLD_PICKAXE).add(ModItems.Head.GOLD_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.GOLD_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.GOLD_PICKAXE.get());

        tag(ModTags.Items.Head.GOLD).add(ModItems.Head.GOLD_SHOVEL.get());
        tag(ModTags.Items.Head.GOLD_SHOVEL).add(ModItems.Head.GOLD_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.GOLD_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.GOLD_SHOVEL.get());

        tag(ModTags.Items.Head.GOLD).add(ModItems.Head.GOLD_SWORD.get());
        tag(ModTags.Items.Head.GOLD_SWORD).add(ModItems.Head.GOLD_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.GOLD_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.GOLD_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="INVAR">
        tag(ModTags.Items.Head.INVAR).add(ModItems.Head.INVAR_AXE.get());
        tag(ModTags.Items.Head.INVAR_AXE).add(ModItems.Head.INVAR_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.INVAR_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.INVAR_AXE.get());

        tag(ModTags.Items.Head.INVAR).add(ModItems.Head.INVAR_HAMMER.get());
        tag(ModTags.Items.Head.INVAR_HAMMER).add(ModItems.Head.INVAR_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.INVAR_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.INVAR_HAMMER.get());

        tag(ModTags.Items.Head.INVAR).add(ModItems.Head.INVAR_HOE.get());
        tag(ModTags.Items.Head.INVAR_HOE).add(ModItems.Head.INVAR_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.INVAR_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.INVAR_HOE.get());

        tag(ModTags.Items.Head.INVAR).add(ModItems.Head.INVAR_PICKAXE.get());
        tag(ModTags.Items.Head.INVAR_PICKAXE).add(ModItems.Head.INVAR_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.INVAR_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.INVAR_PICKAXE.get());

        tag(ModTags.Items.Head.INVAR).add(ModItems.Head.INVAR_SHOVEL.get());
        tag(ModTags.Items.Head.INVAR_SHOVEL).add(ModItems.Head.INVAR_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.INVAR_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.INVAR_SHOVEL.get());

        tag(ModTags.Items.Head.INVAR).add(ModItems.Head.INVAR_SWORD.get());
        tag(ModTags.Items.Head.INVAR_SWORD).add(ModItems.Head.INVAR_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.INVAR_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.INVAR_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="IRON">
        tag(ModTags.Items.Head.IRON).add(ModItems.Head.IRON_AXE.get());
        tag(ModTags.Items.Head.IRON_AXE).add(ModItems.Head.IRON_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.IRON_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.IRON_AXE.get());

        tag(ModTags.Items.Head.IRON).add(ModItems.Head.IRON_HAMMER.get());
        tag(ModTags.Items.Head.IRON_HAMMER).add(ModItems.Head.IRON_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.IRON_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.IRON_HAMMER.get());

        tag(ModTags.Items.Head.IRON).add(ModItems.Head.IRON_HOE.get());
        tag(ModTags.Items.Head.IRON_HOE).add(ModItems.Head.IRON_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.IRON_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.IRON_HOE.get());

        tag(ModTags.Items.Head.IRON).add(ModItems.Head.IRON_PICKAXE.get());
        tag(ModTags.Items.Head.IRON_PICKAXE).add(ModItems.Head.IRON_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.IRON_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.IRON_PICKAXE.get());

        tag(ModTags.Items.Head.IRON).add(ModItems.Head.IRON_SHOVEL.get());
        tag(ModTags.Items.Head.IRON_SHOVEL).add(ModItems.Head.IRON_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.IRON_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.IRON_SHOVEL.get());

        tag(ModTags.Items.Head.IRON).add(ModItems.Head.IRON_SWORD.get());
        tag(ModTags.Items.Head.IRON_SWORD).add(ModItems.Head.IRON_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.IRON_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.IRON_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="LEAD">
        tag(ModTags.Items.Head.LEAD).add(ModItems.Head.LEAD_AXE.get());
        tag(ModTags.Items.Head.LEAD_AXE).add(ModItems.Head.LEAD_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.LEAD_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.LEAD_AXE.get());

        tag(ModTags.Items.Head.LEAD).add(ModItems.Head.LEAD_HAMMER.get());
        tag(ModTags.Items.Head.LEAD_HAMMER).add(ModItems.Head.LEAD_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.LEAD_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.LEAD_HAMMER.get());

        tag(ModTags.Items.Head.LEAD).add(ModItems.Head.LEAD_HOE.get());
        tag(ModTags.Items.Head.LEAD_HOE).add(ModItems.Head.LEAD_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.LEAD_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.LEAD_HOE.get());

        tag(ModTags.Items.Head.LEAD).add(ModItems.Head.LEAD_PICKAXE.get());
        tag(ModTags.Items.Head.LEAD_PICKAXE).add(ModItems.Head.LEAD_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.LEAD_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.LEAD_PICKAXE.get());

        tag(ModTags.Items.Head.LEAD).add(ModItems.Head.LEAD_SHOVEL.get());
        tag(ModTags.Items.Head.LEAD_SHOVEL).add(ModItems.Head.LEAD_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.LEAD_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.LEAD_SHOVEL.get());

        tag(ModTags.Items.Head.LEAD).add(ModItems.Head.LEAD_SWORD.get());
        tag(ModTags.Items.Head.LEAD_SWORD).add(ModItems.Head.LEAD_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.LEAD_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.LEAD_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="NETHERITE">
        tag(ModTags.Items.Head.NETHERITE).add(ModItems.Head.NETHERITE_AXE.get());
        tag(ModTags.Items.Head.NETHERITE_AXE).add(ModItems.Head.NETHERITE_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.NETHERITE_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.NETHERITE_AXE.get());

        tag(ModTags.Items.Head.NETHERITE).add(ModItems.Head.NETHERITE_HAMMER.get());
        tag(ModTags.Items.Head.NETHERITE_HAMMER).add(ModItems.Head.NETHERITE_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.NETHERITE_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.NETHERITE_HAMMER.get());

        tag(ModTags.Items.Head.NETHERITE).add(ModItems.Head.NETHERITE_HOE.get());
        tag(ModTags.Items.Head.NETHERITE_HOE).add(ModItems.Head.NETHERITE_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.NETHERITE_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.NETHERITE_HOE.get());

        tag(ModTags.Items.Head.NETHERITE).add(ModItems.Head.NETHERITE_PICKAXE.get());
        tag(ModTags.Items.Head.NETHERITE_PICKAXE).add(ModItems.Head.NETHERITE_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.NETHERITE_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.NETHERITE_PICKAXE.get());

        tag(ModTags.Items.Head.NETHERITE).add(ModItems.Head.NETHERITE_SHOVEL.get());
        tag(ModTags.Items.Head.NETHERITE_SHOVEL).add(ModItems.Head.NETHERITE_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.NETHERITE_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.NETHERITE_SHOVEL.get());

        tag(ModTags.Items.Head.NETHERITE).add(ModItems.Head.NETHERITE_SWORD.get());
        tag(ModTags.Items.Head.NETHERITE_SWORD).add(ModItems.Head.NETHERITE_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.NETHERITE_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.NETHERITE_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="NICKEL">
        tag(ModTags.Items.Head.NICKEL).add(ModItems.Head.NICKEL_AXE.get());
        tag(ModTags.Items.Head.NICKEL_AXE).add(ModItems.Head.NICKEL_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.NICKEL_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.NICKEL_AXE.get());

        tag(ModTags.Items.Head.NICKEL).add(ModItems.Head.NICKEL_HAMMER.get());
        tag(ModTags.Items.Head.NICKEL_HAMMER).add(ModItems.Head.NICKEL_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.NICKEL_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.NICKEL_HAMMER.get());

        tag(ModTags.Items.Head.NICKEL).add(ModItems.Head.NICKEL_HOE.get());
        tag(ModTags.Items.Head.NICKEL_HOE).add(ModItems.Head.NICKEL_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.NICKEL_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.NICKEL_HOE.get());

        tag(ModTags.Items.Head.NICKEL).add(ModItems.Head.NICKEL_PICKAXE.get());
        tag(ModTags.Items.Head.NICKEL_PICKAXE).add(ModItems.Head.NICKEL_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.NICKEL_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.NICKEL_PICKAXE.get());

        tag(ModTags.Items.Head.NICKEL).add(ModItems.Head.NICKEL_SHOVEL.get());
        tag(ModTags.Items.Head.NICKEL_SHOVEL).add(ModItems.Head.NICKEL_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.NICKEL_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.NICKEL_SHOVEL.get());

        tag(ModTags.Items.Head.NICKEL).add(ModItems.Head.NICKEL_SWORD.get());
        tag(ModTags.Items.Head.NICKEL_SWORD).add(ModItems.Head.NICKEL_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.NICKEL_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.NICKEL_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="RUBY">
        tag(ModTags.Items.Head.RUBY).add(ModItems.Head.RUBY_AXE.get());
        tag(ModTags.Items.Head.RUBY_AXE).add(ModItems.Head.RUBY_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.RUBY_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.RUBY_AXE.get());

        tag(ModTags.Items.Head.RUBY).add(ModItems.Head.RUBY_HAMMER.get());
        tag(ModTags.Items.Head.RUBY_HAMMER).add(ModItems.Head.RUBY_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.RUBY_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.RUBY_HAMMER.get());

        tag(ModTags.Items.Head.RUBY).add(ModItems.Head.RUBY_HOE.get());
        tag(ModTags.Items.Head.RUBY_HOE).add(ModItems.Head.RUBY_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.RUBY_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.RUBY_HOE.get());

        tag(ModTags.Items.Head.RUBY).add(ModItems.Head.RUBY_PICKAXE.get());
        tag(ModTags.Items.Head.RUBY_PICKAXE).add(ModItems.Head.RUBY_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.RUBY_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.RUBY_PICKAXE.get());

        tag(ModTags.Items.Head.RUBY).add(ModItems.Head.RUBY_SHOVEL.get());
        tag(ModTags.Items.Head.RUBY_SHOVEL).add(ModItems.Head.RUBY_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.RUBY_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.RUBY_SHOVEL.get());

        tag(ModTags.Items.Head.RUBY).add(ModItems.Head.RUBY_SWORD.get());
        tag(ModTags.Items.Head.RUBY_SWORD).add(ModItems.Head.RUBY_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.RUBY_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.RUBY_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="SAPPHIRE">
        tag(ModTags.Items.Head.SAPPHIRE).add(ModItems.Head.SAPPHIRE_AXE.get());
        tag(ModTags.Items.Head.SAPPHIRE_AXE).add(ModItems.Head.SAPPHIRE_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.SAPPHIRE_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.SAPPHIRE_AXE.get());

        tag(ModTags.Items.Head.SAPPHIRE).add(ModItems.Head.SAPPHIRE_HAMMER.get());
        tag(ModTags.Items.Head.SAPPHIRE_HAMMER).add(ModItems.Head.SAPPHIRE_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.SAPPHIRE_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.SAPPHIRE_HAMMER.get());

        tag(ModTags.Items.Head.SAPPHIRE).add(ModItems.Head.SAPPHIRE_HOE.get());
        tag(ModTags.Items.Head.SAPPHIRE_HOE).add(ModItems.Head.SAPPHIRE_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.SAPPHIRE_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.SAPPHIRE_HOE.get());

        tag(ModTags.Items.Head.SAPPHIRE).add(ModItems.Head.SAPPHIRE_PICKAXE.get());
        tag(ModTags.Items.Head.SAPPHIRE_PICKAXE).add(ModItems.Head.SAPPHIRE_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.SAPPHIRE_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.SAPPHIRE_PICKAXE.get());

        tag(ModTags.Items.Head.SAPPHIRE).add(ModItems.Head.SAPPHIRE_SHOVEL.get());
        tag(ModTags.Items.Head.SAPPHIRE_SHOVEL).add(ModItems.Head.SAPPHIRE_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.SAPPHIRE_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.SAPPHIRE_SHOVEL.get());

        tag(ModTags.Items.Head.SAPPHIRE).add(ModItems.Head.SAPPHIRE_SWORD.get());
        tag(ModTags.Items.Head.SAPPHIRE_SWORD).add(ModItems.Head.SAPPHIRE_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.SAPPHIRE_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.SAPPHIRE_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="SILVER">
        tag(ModTags.Items.Head.SILVER).add(ModItems.Head.SILVER_AXE.get());
        tag(ModTags.Items.Head.SILVER_AXE).add(ModItems.Head.SILVER_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.SILVER_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.SILVER_AXE.get());

        tag(ModTags.Items.Head.SILVER).add(ModItems.Head.SILVER_HAMMER.get());
        tag(ModTags.Items.Head.SILVER_HAMMER).add(ModItems.Head.SILVER_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.SILVER_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.SILVER_HAMMER.get());

        tag(ModTags.Items.Head.SILVER).add(ModItems.Head.SILVER_HOE.get());
        tag(ModTags.Items.Head.SILVER_HOE).add(ModItems.Head.SILVER_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.SILVER_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.SILVER_HOE.get());

        tag(ModTags.Items.Head.SILVER).add(ModItems.Head.SILVER_PICKAXE.get());
        tag(ModTags.Items.Head.SILVER_PICKAXE).add(ModItems.Head.SILVER_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.SILVER_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.SILVER_PICKAXE.get());

        tag(ModTags.Items.Head.SILVER).add(ModItems.Head.SILVER_SHOVEL.get());
        tag(ModTags.Items.Head.SILVER_SHOVEL).add(ModItems.Head.SILVER_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.SILVER_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.SILVER_SHOVEL.get());

        tag(ModTags.Items.Head.SILVER).add(ModItems.Head.SILVER_SWORD.get());
        tag(ModTags.Items.Head.SILVER_SWORD).add(ModItems.Head.SILVER_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.SILVER_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.SILVER_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="STONE">
        tag(ModTags.Items.Head.STONE).add(ModItems.Head.STONE_AXE.get());
        tag(ModTags.Items.Head.STONE_AXE).add(ModItems.Head.STONE_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.STONE_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.STONE_AXE.get());

        tag(ModTags.Items.Head.STONE).add(ModItems.Head.STONE_HAMMER.get());
        tag(ModTags.Items.Head.STONE_HAMMER).add(ModItems.Head.STONE_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.STONE_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.STONE_HAMMER.get());

        tag(ModTags.Items.Head.STONE).add(ModItems.Head.STONE_HOE.get());
        tag(ModTags.Items.Head.STONE_HOE).add(ModItems.Head.STONE_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.STONE_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.STONE_HOE.get());

        tag(ModTags.Items.Head.STONE).add(ModItems.Head.STONE_PICKAXE.get());
        tag(ModTags.Items.Head.STONE_PICKAXE).add(ModItems.Head.STONE_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.STONE_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.STONE_PICKAXE.get());

        tag(ModTags.Items.Head.STONE).add(ModItems.Head.STONE_SHOVEL.get());
        tag(ModTags.Items.Head.STONE_SHOVEL).add(ModItems.Head.STONE_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.STONE_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.STONE_SHOVEL.get());

        tag(ModTags.Items.Head.STONE).add(ModItems.Head.STONE_SWORD.get());
        tag(ModTags.Items.Head.STONE_SWORD).add(ModItems.Head.STONE_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.STONE_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.STONE_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="TIN">
        tag(ModTags.Items.Head.TIN).add(ModItems.Head.TIN_AXE.get());
        tag(ModTags.Items.Head.TIN_AXE).add(ModItems.Head.TIN_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.TIN_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.TIN_AXE.get());

        tag(ModTags.Items.Head.TIN).add(ModItems.Head.TIN_HAMMER.get());
        tag(ModTags.Items.Head.TIN_HAMMER).add(ModItems.Head.TIN_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.TIN_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.TIN_HAMMER.get());

        tag(ModTags.Items.Head.TIN).add(ModItems.Head.TIN_HOE.get());
        tag(ModTags.Items.Head.TIN_HOE).add(ModItems.Head.TIN_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.TIN_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.TIN_HOE.get());

        tag(ModTags.Items.Head.TIN).add(ModItems.Head.TIN_PICKAXE.get());
        tag(ModTags.Items.Head.TIN_PICKAXE).add(ModItems.Head.TIN_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.TIN_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.TIN_PICKAXE.get());

        tag(ModTags.Items.Head.TIN).add(ModItems.Head.TIN_SHOVEL.get());
        tag(ModTags.Items.Head.TIN_SHOVEL).add(ModItems.Head.TIN_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.TIN_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.TIN_SHOVEL.get());

        tag(ModTags.Items.Head.TIN).add(ModItems.Head.TIN_SWORD.get());
        tag(ModTags.Items.Head.TIN_SWORD).add(ModItems.Head.TIN_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.TIN_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.TIN_SWORD.get());
        //</editor-fold>

        //<editor-fold desc="WOOD">
        tag(ModTags.Items.Head.WOOD).add(ModItems.Head.WOOD_AXE.get());
        tag(ModTags.Items.Head.WOOD_AXE).add(ModItems.Head.WOOD_AXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.WOOD_AXE.get());
        tag(ModTags.Items.Head.ALL_AXE).add(ModItems.Head.WOOD_AXE.get());

        tag(ModTags.Items.Head.WOOD).add(ModItems.Head.WOOD_HAMMER.get());
        tag(ModTags.Items.Head.WOOD_HAMMER).add(ModItems.Head.WOOD_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.WOOD_HAMMER.get());
        tag(ModTags.Items.Head.ALL_HAMMER).add(ModItems.Head.WOOD_HAMMER.get());

        tag(ModTags.Items.Head.WOOD).add(ModItems.Head.WOOD_HOE.get());
        tag(ModTags.Items.Head.WOOD_HOE).add(ModItems.Head.WOOD_HOE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.WOOD_HOE.get());
        tag(ModTags.Items.Head.ALL_HOE).add(ModItems.Head.WOOD_HOE.get());

        tag(ModTags.Items.Head.WOOD).add(ModItems.Head.WOOD_PICKAXE.get());
        tag(ModTags.Items.Head.WOOD_PICKAXE).add(ModItems.Head.WOOD_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.WOOD_PICKAXE.get());
        tag(ModTags.Items.Head.ALL_PICKAXE).add(ModItems.Head.WOOD_PICKAXE.get());

        tag(ModTags.Items.Head.WOOD).add(ModItems.Head.WOOD_SHOVEL.get());
        tag(ModTags.Items.Head.WOOD_SHOVEL).add(ModItems.Head.WOOD_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.WOOD_SHOVEL.get());
        tag(ModTags.Items.Head.ALL_SHOVEL).add(ModItems.Head.WOOD_SHOVEL.get());

        tag(ModTags.Items.Head.WOOD).add(ModItems.Head.WOOD_SWORD.get());
        tag(ModTags.Items.Head.WOOD_SWORD).add(ModItems.Head.WOOD_SWORD.get());
        tag(ModTags.Items.Head.ALL_HEADS).add(ModItems.Head.WOOD_SWORD.get());
        tag(ModTags.Items.Head.ALL_SWORD).add(ModItems.Head.WOOD_SWORD.get());
        //</editor-fold>

        //</editor-fold>

        //<editor-fold desc="GEMS">
        tag(ModTags.Items.Gems.APATITE).add(ModItems.Gem.APATITE.get());
        tag(ModTags.Items.Gems.CINNABAR).add(ModItems.Gem.CINNABAR.get());
        tag(ModTags.Items.Gems.CITRINE).add(ModItems.Gem.CITRINE.get());
        tag(ModTags.Items.Gems.PERIDOT).add(ModItems.Gem.PERIDOT.get());
        tag(ModTags.Items.Gems.RED_GARNET).add(ModItems.Gem.RED_GARNET.get());
        tag(ModTags.Items.Gems.RUBY).add(ModItems.Gem.RUBY.get());
        tag(ModTags.Items.Gems.SAPPHIRE).add(ModItems.Gem.SAPPHIRE.get());
        tag(ModTags.Items.Gems.SILKY_JEWEL).add(ModItems.Gem.SILKY_JEWEL.get());
        tag(ModTags.Items.Gems.SOUL).add(ModItems.Gem.SOUL.get());
        tag(ModTags.Items.Gems.YELLOW_GARNET).add(ModItems.Gem.YELLOW_GARNET.get());

        tag(ModTags.Items.Gems.ALL).addTags(ModTags.Items.Gems.APATITE);
        tag(ModTags.Items.Gems.ALL).addTags(ModTags.Items.Gems.CINNABAR);
        tag(ModTags.Items.Gems.ALL).addTags(ModTags.Items.Gems.CITRINE);
        tag(ModTags.Items.Gems.ALL).addTags(ModTags.Items.Gems.PERIDOT);
        tag(ModTags.Items.Gems.ALL).addTags(ModTags.Items.Gems.RED_GARNET);
        tag(ModTags.Items.Gems.ALL).addTags(ModTags.Items.Gems.RUBY);
        tag(ModTags.Items.Gems.ALL).addTags(ModTags.Items.Gems.SAPPHIRE);
        tag(ModTags.Items.Gems.ALL).addTags(ModTags.Items.Gems.SILKY_JEWEL);
        tag(ModTags.Items.Gems.ALL).addTags(ModTags.Items.Gems.SOUL);
        tag(ModTags.Items.Gems.ALL).addTags(ModTags.Items.Gems.YELLOW_GARNET);
        //</editor-fold>

        //<editor-fold desc="SHARDS">
        tag(ModTags.Items.Shards.DIAMOND).add(ModItems.Shard.DIAMOND.get());
        tag(ModTags.Items.Shards.EMERALD).add(ModItems.Shard.EMERALD.get());
        tag(ModTags.Items.Shards.QUARTZ).add(ModItems.Shard.QUARTZ.get());
        tag(ModTags.Items.Shards.RUBY).add(ModItems.Shard.RUBY.get());
        tag(ModTags.Items.Shards.SAPPHIRE).add(ModItems.Shard.SAPPHIRE.get());
        tag(ModTags.Items.Shards.URANIUM).add(ModItems.Shard.URANIUM.get());

        tag(ModTags.Items.Shards.ALL).addTags(ModTags.Items.Shards.DIAMOND);
        tag(ModTags.Items.Shards.ALL).addTags(ModTags.Items.Shards.EMERALD);
        tag(ModTags.Items.Shards.ALL).addTags(ModTags.Items.Shards.QUARTZ);
        tag(ModTags.Items.Shards.ALL).addTags(ModTags.Items.Shards.RUBY);
        tag(ModTags.Items.Shards.ALL).addTags(ModTags.Items.Shards.SAPPHIRE);
        tag(ModTags.Items.Shards.ALL).addTags(ModTags.Items.Shards.URANIUM);
        //</editor-fold>

        //<editor-fold desc="CASTS">
        tag(ModTags.Items.Casts.AXE).add(ModItems.Cast.AXE.get());
        tag(ModTags.Items.Casts.BINDING).add(ModItems.Cast.BINDING.get());
        tag(ModTags.Items.Casts.BLANK).add(ModItems.Cast.BLANK.get());
        tag(ModTags.Items.Casts.GEAR).add(ModItems.Cast.GEAR.get());
        tag(ModTags.Items.Casts.GEM).add(ModItems.Cast.GEM.get());
        tag(ModTags.Items.Casts.HAMMER).add(ModItems.Cast.HAMMER.get());
        tag(ModTags.Items.Casts.HANDLE).add(ModItems.Cast.HANDLE.get());
        tag(ModTags.Items.Casts.HOE).add(ModItems.Cast.HOE.get());
        tag(ModTags.Items.Casts.INGOT).add(ModItems.Cast.INGOT.get());
        tag(ModTags.Items.Casts.NUGGET).add(ModItems.Cast.NUGGET.get());
        tag(ModTags.Items.Casts.PICKAXE).add(ModItems.Cast.PICKAXE.get());
        tag(ModTags.Items.Casts.PLATE).add(ModItems.Cast.PLATE.get());
        tag(ModTags.Items.Casts.ROD).add(ModItems.Cast.ROD.get());
        tag(ModTags.Items.Casts.SHOVEL).add(ModItems.Cast.SHOVEL.get());
        tag(ModTags.Items.Casts.SWORD).add(ModItems.Cast.SWORD.get());
        tag(ModTags.Items.Casts.WIRE).add(ModItems.Cast.WIRE.get());

        tag(ModTags.Items.Casts.ALL).addTags(ModTags.Items.Casts.AXE);
        tag(ModTags.Items.Casts.ALL).addTags(ModTags.Items.Casts.BINDING);
        tag(ModTags.Items.Casts.ALL).addTags(ModTags.Items.Casts.BLANK);
        tag(ModTags.Items.Casts.ALL).addTags(ModTags.Items.Casts.GEAR);
        tag(ModTags.Items.Casts.ALL).addTags(ModTags.Items.Casts.GEM);
        tag(ModTags.Items.Casts.ALL).addTags(ModTags.Items.Casts.HAMMER);
        tag(ModTags.Items.Casts.ALL).addTags(ModTags.Items.Casts.HANDLE);
        tag(ModTags.Items.Casts.ALL).addTags(ModTags.Items.Casts.HOE);
        tag(ModTags.Items.Casts.ALL).addTags(ModTags.Items.Casts.INGOT);
        tag(ModTags.Items.Casts.ALL).addTags(ModTags.Items.Casts.NUGGET);
        tag(ModTags.Items.Casts.ALL).addTags(ModTags.Items.Casts.PICKAXE);
        tag(ModTags.Items.Casts.ALL).addTags(ModTags.Items.Casts.PLATE);
        tag(ModTags.Items.Casts.ALL).addTags(ModTags.Items.Casts.ROD);
        tag(ModTags.Items.Casts.ALL).addTags(ModTags.Items.Casts.SHOVEL);
        tag(ModTags.Items.Casts.ALL).addTags(ModTags.Items.Casts.SWORD);
        tag(ModTags.Items.Casts.ALL).addTags(ModTags.Items.Casts.WIRE);
        //</editor-fold>
    }
}