package jiraiyah.abi.datagen.custom;

import jiraiyah.abi.Reference;
import jiraiyah.abi.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider
{
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, Reference.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        //<editor-fold desc="ARMOR">
        /*SimpleItem(ModItems.Armor.ENGINEER_HELMET, true);

        SimpleItem(ModItems.Armor.AMETHYST_HELMET);
        SimpleItem(ModItems.Armor.AMETHYST_CHESTPLATE);
        SimpleItem(ModItems.Armor.AMETHYST_LEGGINGS);
        SimpleItem(ModItems.Armor.AMETHYST_BOOTS);*/

        /*SimpleItem(ModItems.Armor.BRONZE_HELMET);
        SimpleItem(ModItems.Armor.BRONZE_CHESTPLATE);
        SimpleItem(ModItems.Armor.BRONZE_LEGGINGS);
        SimpleItem(ModItems.Armor.BRONZE_BOOTS);

        SimpleItem(ModItems.Armor.CONSTANTAN_HELMET);
        SimpleItem(ModItems.Armor.CONSTANTAN_CHESTPLATE);
        SimpleItem(ModItems.Armor.CONSTANTAN_LEGGINGS);
        SimpleItem(ModItems.Armor.CONSTANTAN_BOOTS);*/

        /*SimpleItem(ModItems.Armor.COPPER_HELMET);
        SimpleItem(ModItems.Armor.COPPER_CHESTPLATE);
        SimpleItem(ModItems.Armor.COPPER_LEGGINGS);
        SimpleItem(ModItems.Armor.COPPER_BOOTS);*/

        /*SimpleItem(ModItems.Armor.ELECTRUM_HELMET);
        SimpleItem(ModItems.Armor.ELECTRUM_CHESTPLATE);
        SimpleItem(ModItems.Armor.ELECTRUM_LEGGINGS);
        SimpleItem(ModItems.Armor.ELECTRUM_BOOTS);*/

        /*SimpleItem(ModItems.Armor.EMERALD_HELMET);
        SimpleItem(ModItems.Armor.EMERALD_CHESTPLATE);
        SimpleItem(ModItems.Armor.EMERALD_LEGGINGS);
        SimpleItem(ModItems.Armor.EMERALD_BOOTS);*/

        /*SimpleItem(ModItems.Armor.INVAR_HELMET);
        SimpleItem(ModItems.Armor.INVAR_CHESTPLATE);
        SimpleItem(ModItems.Armor.INVAR_LEGGINGS);
        SimpleItem(ModItems.Armor.INVAR_BOOTS);

        SimpleItem(ModItems.Armor.LEAD_HELMET);
        SimpleItem(ModItems.Armor.LEAD_CHESTPLATE);
        SimpleItem(ModItems.Armor.LEAD_LEGGINGS);
        SimpleItem(ModItems.Armor.LEAD_BOOTS);

        SimpleItem(ModItems.Armor.NICKEL_HELMET);
        SimpleItem(ModItems.Armor.NICKEL_CHESTPLATE);
        SimpleItem(ModItems.Armor.NICKEL_LEGGINGS);
        SimpleItem(ModItems.Armor.NICKEL_BOOTS);

        SimpleItem(ModItems.Armor.RUBY_HELMET);
        SimpleItem(ModItems.Armor.RUBY_CHESTPLATE);
        SimpleItem(ModItems.Armor.RUBY_LEGGINGS);
        SimpleItem(ModItems.Armor.RUBY_BOOTS);

        SimpleItem(ModItems.Armor.SAPPHIRE_HELMET);
        SimpleItem(ModItems.Armor.SAPPHIRE_CHESTPLATE);
        SimpleItem(ModItems.Armor.SAPPHIRE_LEGGINGS);
        SimpleItem(ModItems.Armor.SAPPHIRE_BOOTS);

        SimpleItem(ModItems.Armor.SILVER_HELMET);
        SimpleItem(ModItems.Armor.SILVER_CHESTPLATE);
        SimpleItem(ModItems.Armor.SILVER_LEGGINGS);
        SimpleItem(ModItems.Armor.SILVER_BOOTS);

        SimpleItem(ModItems.Armor.TIN_HELMET);
        SimpleItem(ModItems.Armor.TIN_CHESTPLATE);
        SimpleItem(ModItems.Armor.TIN_LEGGINGS);
        SimpleItem(ModItems.Armor.TIN_BOOTS);*/
        //</editor-fold>

        //<editor-fold desc="CRYSTALS">
        SimpleItem(ModItems.Crystal.COBALT);
        SimpleItem(ModItems.Crystal.CYANIDE);
        SimpleItem(ModItems.Crystal.GLOWSTONE);
        SimpleItem(ModItems.Crystal.NITER);
        SimpleItem(ModItems.Crystal.URANIUM);
        SimpleItem(ModItems.Crystal.YELLORIUM);
        //</editor-fold>

        //<editor-fold desc="DUST">
        SimpleItem(ModItems.Dust.ALUMINIUM);
        SimpleItem(ModItems.Dust.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Dust.ALUMITE);
        SimpleItem(ModItems.Dust.AMETHYST_BRONZE);
        SimpleItem(ModItems.Dust.APATITE);
        SimpleItem(ModItems.Dust.ARDITE);
        SimpleItem(ModItems.Dust.BERYLLIUM);
        SimpleItem(ModItems.Dust.BLUTONIUM);
        SimpleItem(ModItems.Dust.BORON);
        SimpleItem(ModItems.Dust.BRASS);
        SimpleItem(ModItems.Dust.BRONZE);
        SimpleItem(ModItems.Dust.CHARCOAL);
        SimpleItem(ModItems.Dust.CINNABAR);
        SimpleItem(ModItems.Dust.CITRINE);
        SimpleItem(ModItems.Dust.COAL);
        SimpleItem(ModItems.Dust.COBALT);
        SimpleItem(ModItems.Dust.CONDUCTIVE_IRON);
        SimpleItem(ModItems.Dust.CONSTANTAN);
        SimpleItem(ModItems.Dust.COPPER);
        SimpleItem(ModItems.Dust.CRUDE_STEEL);
        SimpleItem(ModItems.Dust.CYANIDE);
        SimpleItem(ModItems.Dust.DARK_STEEL);
        SimpleItem(ModItems.Dust.DAWN_STONE);
        SimpleItem(ModItems.Dust.DEMONIUM);
        SimpleItem(ModItems.Dust.DIAMOND);
        SimpleItem(ModItems.Dust.DRACONIUM);
        SimpleItem(ModItems.Dust.ELECTRICAL_STEEL);
        SimpleItem(ModItems.Dust.ELECTRUM);
        SimpleItem(ModItems.Dust.EMERALD);
        SimpleItem(ModItems.Dust.ENCHANTIUM);
        SimpleItem(ModItems.Dust.END_STEEL);
        SimpleItem(ModItems.Dust.ENDERITE);
        SimpleItem(ModItems.Dust.ENERGETIC_SILVER);
        SimpleItem(ModItems.Dust.GOLD);
        SimpleItem(ModItems.Dust.GRAPHITE);
        SimpleItem(ModItems.Dust.HEPATIZON);
        SimpleItem(ModItems.Dust.INVAR);
        SimpleItem(ModItems.Dust.IRIDIUM);
        SimpleItem(ModItems.Dust.IRON);
        SimpleItem(ModItems.Dust.LAPIS);
        SimpleItem(ModItems.Dust.LEAD);
        SimpleItem(ModItems.Dust.LITHIUM);
        SimpleItem(ModItems.Dust.LUDICRITE);
        SimpleItem(ModItems.Dust.LUMIUM);
        SimpleItem(ModItems.Dust.MAGNESIUM);
        SimpleItem(ModItems.Dust.MANGANESE);
        SimpleItem(ModItems.Dust.MANYULLYN);
        SimpleItem(ModItems.Dust.NETHERITE);
        SimpleItem(ModItems.Dust.NICKEL);
        SimpleItem(ModItems.Dust.NITER);
        SimpleItem(ModItems.Dust.OBSIDIAN);
        SimpleItem(ModItems.Dust.OSMIUM);
        SimpleItem(ModItems.Dust.PLATINUM);
        SimpleItem(ModItems.Dust.PRISMARINE);
        SimpleItem(ModItems.Dust.QUARTZ);
        SimpleItem(ModItems.Dust.ROSE_GOLD);
        SimpleItem(ModItems.Dust.RUBY);
        SimpleItem(ModItems.Dust.SAPPHIRE);
        SimpleItem(ModItems.Dust.SIGNALUM);
        SimpleItem(ModItems.Dust.SILVER);
        SimpleItem(ModItems.Dust.SLIMESTEEL);
        SimpleItem(ModItems.Dust.SOULSTEEL);
        SimpleItem(ModItems.Dust.STEEL);
        SimpleItem(ModItems.Dust.SULFUR);
        SimpleItem(ModItems.Dust.TIN);
        SimpleItem(ModItems.Dust.URANIUM);
        SimpleItem(ModItems.Dust.YELLORIUM);
        SimpleItem(ModItems.Dust.ZINC);
        //</editor-fold>

        /*//<editor-fold desc="GEAR">
        SimpleItem(ModItems.Gear.ALUMINIUM);
        SimpleItem(ModItems.Gear.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Gear.ALUMITE);
        SimpleItem(ModItems.Gear.ARDITE);
        SimpleItem(ModItems.Gear.BERYLLIUM);
        SimpleItem(ModItems.Gear.BLUTONIUM);
        SimpleItem(ModItems.Gear.BORON);
        SimpleItem(ModItems.Gear.BRASS);
        SimpleItem(ModItems.Gear.BRONZE);
        SimpleItem(ModItems.Gear.COBALT);
        SimpleItem(ModItems.Gear.CONDUCTIVE_IRON);
        SimpleItem(ModItems.Gear.CONSTANTAN);
        SimpleItem(ModItems.Gear.COPPER);
        SimpleItem(ModItems.Gear.CRUDE_STEEL);
        SimpleItem(ModItems.Gear.CYANIDE);
        SimpleItem(ModItems.Gear.DARK_STEEL);
        SimpleItem(ModItems.Gear.DAWN_STONE);
        SimpleItem(ModItems.Gear.DEMONIUM);
        SimpleItem(ModItems.Gear.DRACONIUM);
        SimpleItem(ModItems.Gear.ELECTRICAL_STEEL);
        SimpleItem(ModItems.Gear.ELECTRUM);
        SimpleItem(ModItems.Gear.ENCHANTIUM);
        SimpleItem(ModItems.Gear.END_STEEL);
        SimpleItem(ModItems.Gear.ENDERITE);
        SimpleItem(ModItems.Gear.ENERGETIC_SILVER);
        SimpleItem(ModItems.Gear.GOLD);
        SimpleItem(ModItems.Gear.GRAPHITE);
        SimpleItem(ModItems.Gear.INVAR);
        SimpleItem(ModItems.Gear.IRIDIUM);
        SimpleItem(ModItems.Gear.IRON);
        SimpleItem(ModItems.Gear.LEAD);
        SimpleItem(ModItems.Gear.LITHIUM);
        SimpleItem(ModItems.Gear.LUDICRITE);
        SimpleItem(ModItems.Gear.MAGNESIUM);
        SimpleItem(ModItems.Gear.MANGANESE);
        SimpleItem(ModItems.Gear.NICKEL);
        SimpleItem(ModItems.Gear.STEEL);
        SimpleItem(ModItems.Gear.SILVER);
        SimpleItem(ModItems.Gear.TIN);
        SimpleItem(ModItems.Gear.YELLORIUM);
        //</editor-fold>*/

        /*//<editor-fold desc="INGOT">
        SimpleItem(ModItems.Ingot.ALUMINIUM);
        SimpleItem(ModItems.Ingot.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Ingot.ALUMITE);
        SimpleItem(ModItems.Ingot.ARDITE);
        SimpleItem(ModItems.Ingot.BERYLLIUM);
        SimpleItem(ModItems.Ingot.BLUTONIUM);
        SimpleItem(ModItems.Ingot.BORON);
        SimpleItem(ModItems.Ingot.BRASS);
        SimpleItem(ModItems.Ingot.BRONZE);
        SimpleItem(ModItems.Ingot.COBALT);
        SimpleItem(ModItems.Ingot.CONDUCTIVE_IRON);
        SimpleItem(ModItems.Ingot.CONSTANTAN);
        SimpleItem(ModItems.Ingot.CRUDE_STEEL);
        SimpleItem(ModItems.Ingot.CYANIDE);
        SimpleItem(ModItems.Ingot.DARK_STEEL);
        SimpleItem(ModItems.Ingot.DAWN_STONE);
        SimpleItem(ModItems.Ingot.DEMONIUM);
        SimpleItem(ModItems.Ingot.DRACONIUM);
        SimpleItem(ModItems.Ingot.ELECTRICAL_STEEL);
        SimpleItem(ModItems.Ingot.ELECTRUM);
        SimpleItem(ModItems.Ingot.ENCHANTIUM);
        SimpleItem(ModItems.Ingot.END_STEEL);
        SimpleItem(ModItems.Ingot.ENDERITE);
        SimpleItem(ModItems.Ingot.ENERGETIC_SILVER);
        SimpleItem(ModItems.Ingot.GRAPHITE);
        SimpleItem(ModItems.Ingot.INVAR);
        SimpleItem(ModItems.Ingot.IRIDIUM);
        SimpleItem(ModItems.Ingot.LEAD);
        SimpleItem(ModItems.Ingot.LITHIUM);
        SimpleItem(ModItems.Ingot.LUDICRITE);
        SimpleItem(ModItems.Ingot.MAGNESIUM);
        SimpleItem(ModItems.Ingot.MANGANESE);
        SimpleItem(ModItems.Ingot.NICKEL);
        SimpleItem(ModItems.Ingot.STEEL);
        SimpleItem(ModItems.Ingot.SILVER);
        SimpleItem(ModItems.Ingot.TIN);
        SimpleItem(ModItems.Ingot.YELLORIUM);
        //</editor-fold>*/

        /*//<editor-fold desc="NUGGET">
        SimpleItem(ModItems.Nugget.ALUMINIUM);
        SimpleItem(ModItems.Nugget.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Nugget.ALUMITE);
        SimpleItem(ModItems.Nugget.ARDITE);
        SimpleItem(ModItems.Nugget.BERYLLIUM);
        SimpleItem(ModItems.Nugget.BLUTONIUM);
        SimpleItem(ModItems.Nugget.BORON);
        SimpleItem(ModItems.Nugget.BRASS);
        SimpleItem(ModItems.Nugget.BRONZE);
        SimpleItem(ModItems.Nugget.COBALT);
        SimpleItem(ModItems.Nugget.CONDUCTIVE_IRON);
        SimpleItem(ModItems.Nugget.CONSTANTAN);
        SimpleItem(ModItems.Nugget.COPPER);
        SimpleItem(ModItems.Nugget.CRUDE_STEEL);
        SimpleItem(ModItems.Nugget.CYANIDE);
        SimpleItem(ModItems.Nugget.DARK_STEEL);
        SimpleItem(ModItems.Nugget.DAWN_STONE);
        SimpleItem(ModItems.Nugget.DEMONIUM);
        SimpleItem(ModItems.Nugget.DRACONIUM);
        SimpleItem(ModItems.Nugget.ELECTRICAL_STEEL);
        SimpleItem(ModItems.Nugget.ELECTRUM);
        SimpleItem(ModItems.Nugget.ENCHANTIUM);
        SimpleItem(ModItems.Nugget.END_STEEL);
        SimpleItem(ModItems.Nugget.ENDERITE);
        SimpleItem(ModItems.Nugget.ENERGETIC_SILVER);
        SimpleItem(ModItems.Nugget.GRAPHITE);
        SimpleItem(ModItems.Nugget.INVAR);
        SimpleItem(ModItems.Nugget.IRIDIUM);
        SimpleItem(ModItems.Nugget.LEAD);
        SimpleItem(ModItems.Nugget.LITHIUM);
        SimpleItem(ModItems.Nugget.LUDICRITE);
        SimpleItem(ModItems.Nugget.MAGNESIUM);
        SimpleItem(ModItems.Nugget.MANGANESE);
        SimpleItem(ModItems.Nugget.NICKEL);
        SimpleItem(ModItems.Nugget.STEEL);
        SimpleItem(ModItems.Nugget.SILVER);
        SimpleItem(ModItems.Nugget.TIN);
        SimpleItem(ModItems.Nugget.YELLORIUM);
        //</editor-fold>*/

        /*//<editor-fold desc="PLATE">
        SimpleItem(ModItems.Plate.ALUMINIUM);
        SimpleItem(ModItems.Plate.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Plate.ALUMITE);
        SimpleItem(ModItems.Plate.ARDITE);
        SimpleItem(ModItems.Plate.BERYLLIUM);
        SimpleItem(ModItems.Plate.BLUTONIUM);
        SimpleItem(ModItems.Plate.BORON);
        SimpleItem(ModItems.Plate.BRASS);
        SimpleItem(ModItems.Plate.BRONZE);
        SimpleItem(ModItems.Plate.COBALT);
        SimpleItem(ModItems.Plate.CONDUCTIVE_IRON);
        SimpleItem(ModItems.Plate.CONSTANTAN);
        SimpleItem(ModItems.Plate.COPPER);
        SimpleItem(ModItems.Plate.CRUDE_STEEL);
        SimpleItem(ModItems.Plate.CYANIDE);
        SimpleItem(ModItems.Plate.DARK_STEEL);
        SimpleItem(ModItems.Plate.DAWN_STONE);
        SimpleItem(ModItems.Plate.DEMONIUM);
        SimpleItem(ModItems.Plate.DRACONIUM);
        SimpleItem(ModItems.Plate.ELECTRICAL_STEEL);
        SimpleItem(ModItems.Plate.ELECTRUM);
        SimpleItem(ModItems.Plate.ENCHANTIUM);
        SimpleItem(ModItems.Plate.END_STEEL);
        SimpleItem(ModItems.Plate.ENDERITE);
        SimpleItem(ModItems.Plate.ENERGETIC_SILVER);
        SimpleItem(ModItems.Plate.GOLD);
        SimpleItem(ModItems.Plate.GRAPHITE);
        SimpleItem(ModItems.Plate.INVAR);
        SimpleItem(ModItems.Plate.IRIDIUM);
        SimpleItem(ModItems.Plate.IRON);
        SimpleItem(ModItems.Plate.LEAD);
        SimpleItem(ModItems.Plate.LITHIUM);
        SimpleItem(ModItems.Plate.LUDICRITE);
        SimpleItem(ModItems.Plate.MAGNESIUM);
        SimpleItem(ModItems.Plate.MANGANESE);
        SimpleItem(ModItems.Plate.NICKEL);
        SimpleItem(ModItems.Plate.STEEL);
        SimpleItem(ModItems.Plate.SILVER);
        SimpleItem(ModItems.Plate.TIN);
        SimpleItem(ModItems.Plate.YELLORIUM);
        //</editor-fold>*/

        /*//<editor-fold desc="RAW">
        SimpleItem(ModItems.Raw.ALUMINIUM);
        SimpleItem(ModItems.Raw.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Raw.ALUMITE);
        SimpleItem(ModItems.Raw.ARDITE);
        SimpleItem(ModItems.Raw.BERYLLIUM);
        SimpleItem(ModItems.Raw.BLUTONIUM);
        SimpleItem(ModItems.Raw.BORON);
        SimpleItem(ModItems.Raw.BRASS);
        SimpleItem(ModItems.Raw.BRONZE);
        SimpleItem(ModItems.Raw.COBALT);
        SimpleItem(ModItems.Raw.CONDUCTIVE_IRON);
        SimpleItem(ModItems.Raw.CONSTANTAN);
        SimpleItem(ModItems.Raw.CRUDE_STEEL);
        SimpleItem(ModItems.Raw.CYANIDE);
        SimpleItem(ModItems.Raw.DARK_STEEL);
        SimpleItem(ModItems.Raw.DAWN_STONE);
        SimpleItem(ModItems.Raw.DEMONIUM);
        SimpleItem(ModItems.Raw.DRACONIUM);
        SimpleItem(ModItems.Raw.ELECTRICAL_STEEL);
        SimpleItem(ModItems.Raw.ELECTRUM);
        SimpleItem(ModItems.Raw.ENCHANTIUM);
        SimpleItem(ModItems.Raw.END_STEEL);
        SimpleItem(ModItems.Raw.ENDERITE);
        SimpleItem(ModItems.Raw.ENERGETIC_SILVER);
        SimpleItem(ModItems.Raw.GRAPHITE);
        SimpleItem(ModItems.Raw.INVAR);
        SimpleItem(ModItems.Raw.IRIDIUM);
        SimpleItem(ModItems.Raw.LEAD);
        SimpleItem(ModItems.Raw.LITHIUM);
        SimpleItem(ModItems.Raw.LUDICRITE);
        SimpleItem(ModItems.Raw.MAGNESIUM);
        SimpleItem(ModItems.Raw.MANGANESE);
        SimpleItem(ModItems.Raw.NICKEL);
        SimpleItem(ModItems.Raw.STEEL);
        SimpleItem(ModItems.Raw.SILVER);
        SimpleItem(ModItems.Raw.TIN);
        SimpleItem(ModItems.Raw.YELLORIUM);
        //</editor-fold>*/

        /*//<editor-fold desc="REINFORCED">
        SimpleItem(ModItems.Reinforced.ALUMINIUM);
        SimpleItem(ModItems.Reinforced.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Reinforced.ALUMITE);
        SimpleItem(ModItems.Reinforced.ARDITE);
        SimpleItem(ModItems.Reinforced.BERYLLIUM);
        SimpleItem(ModItems.Reinforced.BLUTONIUM);
        SimpleItem(ModItems.Reinforced.BORON);
        SimpleItem(ModItems.Reinforced.BRASS);
        SimpleItem(ModItems.Reinforced.BRONZE);
        SimpleItem(ModItems.Reinforced.COBALT);
        SimpleItem(ModItems.Reinforced.CONDUCTIVE_IRON);
        SimpleItem(ModItems.Reinforced.CONSTANTAN);
        SimpleItem(ModItems.Reinforced.COPPER);
        SimpleItem(ModItems.Reinforced.CRUDE_STEEL);
        SimpleItem(ModItems.Reinforced.CYANIDE);
        SimpleItem(ModItems.Reinforced.DARK_STEEL);
        SimpleItem(ModItems.Reinforced.DAWN_STONE);
        SimpleItem(ModItems.Reinforced.DEMONIUM);
        SimpleItem(ModItems.Reinforced.DRACONIUM);
        SimpleItem(ModItems.Reinforced.ELECTRICAL_STEEL);
        SimpleItem(ModItems.Reinforced.ELECTRUM);
        SimpleItem(ModItems.Reinforced.ENCHANTIUM);
        SimpleItem(ModItems.Reinforced.END_STEEL);
        SimpleItem(ModItems.Reinforced.ENDERITE);
        SimpleItem(ModItems.Reinforced.ENERGETIC_SILVER);
        SimpleItem(ModItems.Reinforced.GOLD);
        SimpleItem(ModItems.Reinforced.GRAPHITE);
        SimpleItem(ModItems.Reinforced.INVAR);
        SimpleItem(ModItems.Reinforced.IRIDIUM);
        SimpleItem(ModItems.Reinforced.IRON);
        SimpleItem(ModItems.Reinforced.LEAD);
        SimpleItem(ModItems.Reinforced.LITHIUM);
        SimpleItem(ModItems.Reinforced.LUDICRITE);
        SimpleItem(ModItems.Reinforced.MAGNESIUM);
        SimpleItem(ModItems.Reinforced.MANGANESE);
        SimpleItem(ModItems.Reinforced.NICKEL);
        SimpleItem(ModItems.Reinforced.SILVER);
        SimpleItem(ModItems.Reinforced.STEEL);
        SimpleItem(ModItems.Reinforced.TIN);
        SimpleItem(ModItems.Reinforced.YELLORIUM);
        //</editor-fold>*/

        /*//<editor-fold desc="ROD">
        SimpleItem(ModItems.Rod.ALUMINIUM);
        SimpleItem(ModItems.Rod.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Rod.ALUMITE);
        SimpleItem(ModItems.Rod.ARDITE);
        SimpleItem(ModItems.Rod.BERYLLIUM);
        SimpleItem(ModItems.Rod.BLUTONIUM);
        SimpleItem(ModItems.Rod.BORON);
        SimpleItem(ModItems.Rod.BRASS);
        SimpleItem(ModItems.Rod.BRONZE);
        SimpleItem(ModItems.Rod.COBALT);
        SimpleItem(ModItems.Rod.CONDUCTIVE_IRON);
        SimpleItem(ModItems.Rod.CONSTANTAN);
        SimpleItem(ModItems.Rod.COPPER);
        SimpleItem(ModItems.Rod.CRUDE_STEEL);
        SimpleItem(ModItems.Rod.CYANIDE);
        SimpleItem(ModItems.Rod.DARK_STEEL);
        SimpleItem(ModItems.Rod.DAWN_STONE);
        SimpleItem(ModItems.Rod.DEMONIUM);
        SimpleItem(ModItems.Rod.DRACONIUM);
        SimpleItem(ModItems.Rod.ELECTRICAL_STEEL);
        SimpleItem(ModItems.Rod.ELECTRUM);
        SimpleItem(ModItems.Rod.ENCHANTIUM);
        SimpleItem(ModItems.Rod.END_STEEL);
        SimpleItem(ModItems.Rod.ENDERITE);
        SimpleItem(ModItems.Rod.ENERGETIC_SILVER);
        SimpleItem(ModItems.Rod.GOLD);
        SimpleItem(ModItems.Rod.GRAPHITE);
        SimpleItem(ModItems.Rod.INVAR);
        SimpleItem(ModItems.Rod.IRIDIUM);
        SimpleItem(ModItems.Rod.IRON);
        SimpleItem(ModItems.Rod.LEAD);
        SimpleItem(ModItems.Rod.LITHIUM);
        SimpleItem(ModItems.Rod.LUDICRITE);
        SimpleItem(ModItems.Rod.MAGNESIUM);
        SimpleItem(ModItems.Rod.MANGANESE);
        SimpleItem(ModItems.Rod.NICKEL);
        SimpleItem(ModItems.Rod.SILVER);
        SimpleItem(ModItems.Rod.STEEL);
        SimpleItem(ModItems.Rod.TIN);
        SimpleItem(ModItems.Rod.YELLORIUM);
        //</editor-fold>*/

        /*//<editor-fold desc="GEMS">
        SimpleItem(ModItems.Gem.RUBY);
        SimpleItem(ModItems.Gem.SAPPHIRE);

        SimpleItem(ModItems.Gem.DIAMOND_SHARD);
        SimpleItem(ModItems.Gem.EMERALD_SHARD);
        SimpleItem(ModItems.Gem.QUARTZ_SHARD);
        SimpleItem(ModItems.Gem.RUBY_SHARD);
        SimpleItem(ModItems.Gem.SAPPHIRE_SHARD);
        //</editor-fold>*/

        /*//<editor-fold desc="TOOL">
        SimpleItem(ModItems.Tool.AUGMENT, true);
        SimpleItem(ModItems.Tool.CUTTER, true);
        SimpleItem(ModItems.Tool.DOWSING_ROD, true);
        SimpleItem(ModItems.Tool.KNIFE, true);
        SimpleItem(ModItems.Tool.SPANNER, true);
        SimpleItem(ModItems.Tool.TUNER, true);
        SimpleItem(ModItems.Tool.WRENCH, true);

        SimpleItem(ModItems.Tool.BRONZE_SWORD, true);
        SimpleItem(ModItems.Tool.BRONZE_PICKAXE, true);
        SimpleItem(ModItems.Tool.BRONZE_SHOVEL, true);
        SimpleItem(ModItems.Tool.BRONZE_AXE, true);
        SimpleItem(ModItems.Tool.BRONZE_HOE, true);
        SimpleItem(ModItems.Tool.BRONZE_HAMMER, true);

        SimpleItem(ModItems.Tool.CONSTANTAN_SWORD, true);
        SimpleItem(ModItems.Tool.CONSTANTAN_PICKAXE, true);
        SimpleItem(ModItems.Tool.CONSTANTAN_SHOVEL, true);
        SimpleItem(ModItems.Tool.CONSTANTAN_AXE, true);
        SimpleItem(ModItems.Tool.CONSTANTAN_HOE, true);
        SimpleItem(ModItems.Tool.CONSTANTAN_HAMMER, true);

        SimpleItem(ModItems.Tool.COPPER_SWORD, true);
        SimpleItem(ModItems.Tool.COPPER_PICKAXE, true);
        SimpleItem(ModItems.Tool.COPPER_SHOVEL, true);
        SimpleItem(ModItems.Tool.COPPER_AXE, true);
        SimpleItem(ModItems.Tool.COPPER_HOE, true);
        SimpleItem(ModItems.Tool.COPPER_HAMMER, true);

        SimpleItem(ModItems.Tool.DIAMOND_HAMMER, true);

        SimpleItem(ModItems.Tool.ELECTRUM_SWORD, true);
        SimpleItem(ModItems.Tool.ELECTRUM_PICKAXE, true);
        SimpleItem(ModItems.Tool.ELECTRUM_SHOVEL, true);
        SimpleItem(ModItems.Tool.ELECTRUM_AXE, true);
        SimpleItem(ModItems.Tool.ELECTRUM_HOE, true);
        SimpleItem(ModItems.Tool.ELECTRUM_HAMMER, true);

        SimpleItem(ModItems.Tool.EMERALD_SWORD, true);
        SimpleItem(ModItems.Tool.EMERALD_PICKAXE, true);
        SimpleItem(ModItems.Tool.EMERALD_SHOVEL, true);
        SimpleItem(ModItems.Tool.EMERALD_AXE, true);
        SimpleItem(ModItems.Tool.EMERALD_HOE, true);
        SimpleItem(ModItems.Tool.EMERALD_HAMMER, true);

        SimpleItem(ModItems.Tool.GOLD_HAMMER, true);

        SimpleItem(ModItems.Tool.INVAR_SWORD, true);
        SimpleItem(ModItems.Tool.INVAR_PICKAXE, true);
        SimpleItem(ModItems.Tool.INVAR_SHOVEL, true);
        SimpleItem(ModItems.Tool.INVAR_AXE, true);
        SimpleItem(ModItems.Tool.INVAR_HOE, true);
        SimpleItem(ModItems.Tool.INVAR_HAMMER, true);

        SimpleItem(ModItems.Tool.IRON_HAMMER, true);

        SimpleItem(ModItems.Tool.LEAD_SWORD, true);
        SimpleItem(ModItems.Tool.LEAD_PICKAXE, true);
        SimpleItem(ModItems.Tool.LEAD_SHOVEL, true);
        SimpleItem(ModItems.Tool.LEAD_AXE, true);
        SimpleItem(ModItems.Tool.LEAD_HOE, true);
        SimpleItem(ModItems.Tool.LEAD_HAMMER, true);

        SimpleItem(ModItems.Tool.NETHERITE_HAMMER, true);

        SimpleItem(ModItems.Tool.NICKEL_SWORD, true);
        SimpleItem(ModItems.Tool.NICKEL_PICKAXE, true);
        SimpleItem(ModItems.Tool.NICKEL_SHOVEL, true);
        SimpleItem(ModItems.Tool.NICKEL_AXE, true);
        SimpleItem(ModItems.Tool.NICKEL_HOE, true);
        SimpleItem(ModItems.Tool.NICKEL_HAMMER, true);

        SimpleItem(ModItems.Tool.RUBY_BOW, true);
        SimpleItem(ModItems.Tool.RUBY_SWORD, true);
        SimpleItem(ModItems.Tool.RUBY_PICKAXE, true);
        SimpleItem(ModItems.Tool.RUBY_SHOVEL, true);
        SimpleItem(ModItems.Tool.RUBY_AXE, true);
        SimpleItem(ModItems.Tool.RUBY_HOE, true);
        SimpleItem(ModItems.Tool.RUBY_HAMMER, true);

        SimpleItem(ModItems.Tool.SAPPHIRE_BOW, true);
        SimpleItem(ModItems.Tool.SAPPHIRE_SWORD, true);
        SimpleItem(ModItems.Tool.SAPPHIRE_PICKAXE, true);
        SimpleItem(ModItems.Tool.SAPPHIRE_SHOVEL, true);
        SimpleItem(ModItems.Tool.SAPPHIRE_AXE, true);
        SimpleItem(ModItems.Tool.SAPPHIRE_HOE, true);
        SimpleItem(ModItems.Tool.SAPPHIRE_HAMMER, true);

        SimpleItem(ModItems.Tool.SILVER_SWORD, true);
        SimpleItem(ModItems.Tool.SILVER_PICKAXE, true);
        SimpleItem(ModItems.Tool.SILVER_SHOVEL, true);
        SimpleItem(ModItems.Tool.SILVER_AXE, true);
        SimpleItem(ModItems.Tool.SILVER_HOE, true);
        SimpleItem(ModItems.Tool.SILVER_HAMMER, true);

        SimpleItem(ModItems.Tool.STONE_HAMMER, true);

        SimpleItem(ModItems.Tool.TIN_SWORD, true);
        SimpleItem(ModItems.Tool.TIN_PICKAXE, true);
        SimpleItem(ModItems.Tool.TIN_SHOVEL, true);
        SimpleItem(ModItems.Tool.TIN_AXE, true);
        SimpleItem(ModItems.Tool.TIN_HOE, true);
        SimpleItem(ModItems.Tool.TIN_HAMMER, true);

        SimpleItem(ModItems.Tool.WOOD_HAMMER, true);
        //</editor-fold>*/

        /*//<editor-fold desc="CAST">
        SimpleItem(ModItems.Cast.BLANK);
        SimpleItem(ModItems.Cast.BLANK_REINFORCED);
        SimpleItem(ModItems.Cast.GEAR);
        SimpleItem(ModItems.Cast.GEM);
        SimpleItem(ModItems.Cast.HAMMER);
        SimpleItem(ModItems.Cast.HANDLE);
        SimpleItem(ModItems.Cast.INGOT);
        SimpleItem(ModItems.Cast.NUGGET);
        //</editor-fold>*/

        /*//<editor-fold desc="HEAD">
        SimpleItem(ModItems.Head.BRONZE_AXE);
        SimpleItem(ModItems.Head.BRONZE_HAMMER);
        SimpleItem(ModItems.Head.BRONZE_HOE);
        SimpleItem(ModItems.Head.BRONZE_PICKAXE);
        SimpleItem(ModItems.Head.BRONZE_SHOVEL);
        SimpleItem(ModItems.Head.BRONZE_SWORD);

        SimpleItem(ModItems.Head.CONSTANTAN_AXE);
        SimpleItem(ModItems.Head.CONSTANTAN_HAMMER);
        SimpleItem(ModItems.Head.CONSTANTAN_HOE);
        SimpleItem(ModItems.Head.CONSTANTAN_PICKAXE);
        SimpleItem(ModItems.Head.CONSTANTAN_SHOVEL);
        SimpleItem(ModItems.Head.CONSTANTAN_SWORD);

        SimpleItem(ModItems.Head.COPPER_AXE);
        SimpleItem(ModItems.Head.COPPER_HAMMER);
        SimpleItem(ModItems.Head.COPPER_HOE);
        SimpleItem(ModItems.Head.COPPER_PICKAXE);
        SimpleItem(ModItems.Head.COPPER_SHOVEL);
        SimpleItem(ModItems.Head.COPPER_SWORD);

        SimpleItem(ModItems.Head.DIAMOND_HAMMER);

        SimpleItem(ModItems.Head.ELECTRUM_AXE);
        SimpleItem(ModItems.Head.ELECTRUM_HAMMER);
        SimpleItem(ModItems.Head.ELECTRUM_HOE);
        SimpleItem(ModItems.Head.ELECTRUM_PICKAXE);
        SimpleItem(ModItems.Head.ELECTRUM_SHOVEL);
        SimpleItem(ModItems.Head.ELECTRUM_SWORD);

        SimpleItem(ModItems.Head.EMERALD_AXE);
        SimpleItem(ModItems.Head.EMERALD_HAMMER);
        SimpleItem(ModItems.Head.EMERALD_HOE);
        SimpleItem(ModItems.Head.EMERALD_PICKAXE);
        SimpleItem(ModItems.Head.EMERALD_SHOVEL);
        SimpleItem(ModItems.Head.EMERALD_SWORD);

        SimpleItem(ModItems.Head.GOLD_HAMMER);

        SimpleItem(ModItems.Head.INVAR_AXE);
        SimpleItem(ModItems.Head.INVAR_HAMMER);
        SimpleItem(ModItems.Head.INVAR_HOE);
        SimpleItem(ModItems.Head.INVAR_PICKAXE);
        SimpleItem(ModItems.Head.INVAR_SHOVEL);
        SimpleItem(ModItems.Head.INVAR_SWORD);

        SimpleItem(ModItems.Head.IRON_HAMMER);

        SimpleItem(ModItems.Head.LEAD_AXE);
        SimpleItem(ModItems.Head.LEAD_HAMMER);
        SimpleItem(ModItems.Head.LEAD_HOE);
        SimpleItem(ModItems.Head.LEAD_PICKAXE);
        SimpleItem(ModItems.Head.LEAD_SHOVEL);
        SimpleItem(ModItems.Head.LEAD_SWORD);

        SimpleItem(ModItems.Head.NETHERITE_HAMMER);

        SimpleItem(ModItems.Head.NICKEL_AXE);
        SimpleItem(ModItems.Head.NICKEL_HAMMER);
        SimpleItem(ModItems.Head.NICKEL_HOE);
        SimpleItem(ModItems.Head.NICKEL_PICKAXE);
        SimpleItem(ModItems.Head.NICKEL_SHOVEL);
        SimpleItem(ModItems.Head.NICKEL_SWORD);

        SimpleItem(ModItems.Head.RUBY_AXE);
        SimpleItem(ModItems.Head.RUBY_HAMMER);
        SimpleItem(ModItems.Head.RUBY_HOE);
        SimpleItem(ModItems.Head.RUBY_PICKAXE);
        SimpleItem(ModItems.Head.RUBY_SHOVEL);
        SimpleItem(ModItems.Head.RUBY_SWORD);

        SimpleItem(ModItems.Head.SAPPHIRE_AXE);
        SimpleItem(ModItems.Head.SAPPHIRE_HAMMER);
        SimpleItem(ModItems.Head.SAPPHIRE_HOE);
        SimpleItem(ModItems.Head.SAPPHIRE_PICKAXE);
        SimpleItem(ModItems.Head.SAPPHIRE_SHOVEL);
        SimpleItem(ModItems.Head.SAPPHIRE_SWORD);

        SimpleItem(ModItems.Head.SILVER_AXE);
        SimpleItem(ModItems.Head.SILVER_HAMMER);
        SimpleItem(ModItems.Head.SILVER_HOE);
        SimpleItem(ModItems.Head.SILVER_PICKAXE);
        SimpleItem(ModItems.Head.SILVER_SHOVEL);
        SimpleItem(ModItems.Head.SILVER_SWORD);

        SimpleItem(ModItems.Head.STONE_HAMMER);

        SimpleItem(ModItems.Head.TIN_AXE);
        SimpleItem(ModItems.Head.TIN_HAMMER);
        SimpleItem(ModItems.Head.TIN_HOE);
        SimpleItem(ModItems.Head.TIN_PICKAXE);
        SimpleItem(ModItems.Head.TIN_SHOVEL);
        SimpleItem(ModItems.Head.TIN_SWORD);

        SimpleItem(ModItems.Head.WOOD_HAMMER);
        //</editor-fold>*/
    }

    //<editor-fold desc="HELPER METHODS">
    private ItemModelBuilder SaplingItem(RegistryObject<Block> item)
    {
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated"))
                .texture("layer0",
                        Reference.Location("block/" + item.getId().getPath()));
    }

    private ItemModelBuilder SimpleItem(RegistryObject<Item> item)
    {
        return SimpleItem(item, false);
    }

    private ItemModelBuilder SimpleItem(RegistryObject<Item> item, boolean handheld)
    {
        //<editor-fold desc="ITEM SPECIAL SUBFOLDERS">
        if(item.getId().getPath().toLowerCase().contains(Reference.Names.CRYSTAL))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/crystal/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.DUST))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/dust/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.GEAR))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/gear/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.INGOT))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/ingot/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.NUGGET))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/nugget/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.PLATE))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/plate/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.RAW))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/raw/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.REINFORCED))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/reinforced/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.ROD))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/rod/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.TOOL) ||
           item.getId().getPath().toLowerCase().contains(Reference.Names.BOW) ||
           (item.getId().getPath().toLowerCase().contains(Reference.Names.SWORD) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.CAST) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.HEAD)) ||
           (item.getId().getPath().toLowerCase().contains(Reference.Names.AXE) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.CAST) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.HEAD)) ||
           (item.getId().getPath().toLowerCase().contains(Reference.Names.PICKAXE) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.CAST) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.HEAD)) ||
           (item.getId().getPath().toLowerCase().contains(Reference.Names.SHOVEL) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.CAST) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.HEAD)) ||
           (item.getId().getPath().toLowerCase().contains(Reference.Names.HOE) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.CAST) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.HEAD)) ||
           (item.getId().getPath().toLowerCase().contains(Reference.Names.HAMMER) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.CAST) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.HEAD)))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/tool/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.GEM))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/gem/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.HELMET) ||
           item.getId().getPath().toLowerCase().contains(Reference.Names.CHEST_PLATE) ||
           item.getId().getPath().toLowerCase().contains(Reference.Names.LEGGINGS) ||
           item.getId().getPath().toLowerCase().contains(Reference.Names.BOOTS))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/armor/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.CAST))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/cast/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.HEAD))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/tool/head/" + item.getId().getPath()));
        //</editor-fold>

        return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                .texture("layer0",
                        Reference.Location("item/" + item.getId().getPath()));
    }
    //</editor-fold>
}