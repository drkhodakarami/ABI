package jiraiyah.abi.datagen.custom;

import jiraiyah.abi.Reference;
import jiraiyah.abi.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider
{
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();

    static
    {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

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

        //<editor-fold desc="GEAR">
        SimpleItem(ModItems.Gear.ALUMINIUM);
        SimpleItem(ModItems.Gear.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Gear.ALUMITE);
        SimpleItem(ModItems.Gear.AMETHYST_BRONZE);
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
        SimpleItem(ModItems.Gear.DIAMOND);
        SimpleItem(ModItems.Gear.DRACONIUM);
        SimpleItem(ModItems.Gear.ELECTRICAL_STEEL);
        SimpleItem(ModItems.Gear.ELECTRUM);
        SimpleItem(ModItems.Gear.EMERALD);
        SimpleItem(ModItems.Gear.ENCHANTIUM);
        SimpleItem(ModItems.Gear.END_STEEL);
        SimpleItem(ModItems.Gear.ENDERITE);
        SimpleItem(ModItems.Gear.ENERGETIC_SILVER);
        SimpleItem(ModItems.Gear.GLOWSTONE);
        SimpleItem(ModItems.Gear.GOLD);
        SimpleItem(ModItems.Gear.GRAPHITE);
        SimpleItem(ModItems.Gear.HEPATIZON);
        SimpleItem(ModItems.Gear.INVAR);
        SimpleItem(ModItems.Gear.IRIDIUM);
        SimpleItem(ModItems.Gear.IRON);
        SimpleItem(ModItems.Gear.LAPIS);
        SimpleItem(ModItems.Gear.LEAD);
        SimpleItem(ModItems.Gear.LITHIUM);
        SimpleItem(ModItems.Gear.LUDICRITE);
        SimpleItem(ModItems.Gear.LUMIUM);
        SimpleItem(ModItems.Gear.MAGNESIUM);
        SimpleItem(ModItems.Gear.MANGANESE);
        SimpleItem(ModItems.Gear.MANYULLYN);
        SimpleItem(ModItems.Gear.NETHERITE);
        SimpleItem(ModItems.Gear.NICKEL);
        SimpleItem(ModItems.Gear.NITER);
        SimpleItem(ModItems.Gear.OBSIDIAN);
        SimpleItem(ModItems.Gear.OSMIUM);
        SimpleItem(ModItems.Gear.PLATINUM);
        SimpleItem(ModItems.Gear.PRISMARINE);
        SimpleItem(ModItems.Gear.QUARTZ);
        SimpleItem(ModItems.Gear.ROSE_GOLD);
        SimpleItem(ModItems.Gear.RUBY);
        SimpleItem(ModItems.Gear.SAPPHIRE);
        SimpleItem(ModItems.Gear.SIGNALUM);
        SimpleItem(ModItems.Gear.SILVER);
        SimpleItem(ModItems.Gear.SLIMESTEEL);
        SimpleItem(ModItems.Gear.SOULSTEEL);
        SimpleItem(ModItems.Gear.STEEL);
        SimpleItem(ModItems.Gear.STONE);
        SimpleItem(ModItems.Gear.SULFUR);
        SimpleItem(ModItems.Gear.TIN);
        SimpleItem(ModItems.Gear.URANIUM);
        SimpleItem(ModItems.Gear.WOOD);
        SimpleItem(ModItems.Gear.YELLORIUM);
        SimpleItem(ModItems.Gear.ZINC);
        //</editor-fold>

        //<editor-fold desc="INGOT">
        SimpleItem(ModItems.Ingot.ALUMINIUM);
        SimpleItem(ModItems.Ingot.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Ingot.ALUMITE);
        SimpleItem(ModItems.Ingot.AMETHYST_BRONZE);
        SimpleItem(ModItems.Ingot.ARDITE);
        SimpleItem(ModItems.Ingot.BERYLLIUM);
        SimpleItem(ModItems.Ingot.BLUTONIUM);
        SimpleItem(ModItems.Ingot.BORON);
        SimpleItem(ModItems.Ingot.BRASS);
        SimpleItem(ModItems.Ingot.BRONZE);
        SimpleItem(ModItems.Ingot.CONDUCTIVE_IRON);
        SimpleItem(ModItems.Ingot.CONSTANTAN);
        SimpleItem(ModItems.Ingot.CRUDE_STEEL);
        SimpleItem(ModItems.Ingot.DARK_STEEL);
        SimpleItem(ModItems.Ingot.DEMONIUM);
        SimpleItem(ModItems.Ingot.DRACONIUM);
        SimpleItem(ModItems.Ingot.ELECTRICAL_STEEL);
        SimpleItem(ModItems.Ingot.ELECTRUM);
        SimpleItem(ModItems.Ingot.ENCHANTIUM);
        SimpleItem(ModItems.Ingot.END_STEEL);
        SimpleItem(ModItems.Ingot.ENDERITE);
        SimpleItem(ModItems.Ingot.ENERGETIC_SILVER);
        SimpleItem(ModItems.Ingot.GLOWSTONE);
        SimpleItem(ModItems.Ingot.HEPATIZON);
        SimpleItem(ModItems.Ingot.INVAR);
        SimpleItem(ModItems.Ingot.IRIDIUM);
        SimpleItem(ModItems.Ingot.LEAD);
        SimpleItem(ModItems.Ingot.LITHIUM);
        SimpleItem(ModItems.Ingot.LUDICRITE);
        SimpleItem(ModItems.Ingot.LUMIUM);
        SimpleItem(ModItems.Ingot.MANYULLYN);
        SimpleItem(ModItems.Ingot.NICKEL);
        SimpleItem(ModItems.Ingot.OBSIDIAN);
        SimpleItem(ModItems.Ingot.OSMIUM);
        SimpleItem(ModItems.Ingot.PLATINUM);
        SimpleItem(ModItems.Ingot.ROSE_GOLD);
        SimpleItem(ModItems.Ingot.SIGNALUM);
        SimpleItem(ModItems.Ingot.SILVER);
        SimpleItem(ModItems.Ingot.SLIMESTEEL);
        SimpleItem(ModItems.Ingot.SOULSTEEL);
        SimpleItem(ModItems.Ingot.STEEL);
        SimpleItem(ModItems.Ingot.TIN);
        SimpleItem(ModItems.Ingot.URANIUM);
        SimpleItem(ModItems.Ingot.YELLORIUM);
        SimpleItem(ModItems.Ingot.ZINC);
        //</editor-fold>

        //<editor-fold desc="NUGGET">
        SimpleItem(ModItems.Nugget.ALUMINIUM);
        SimpleItem(ModItems.Nugget.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Nugget.ALUMITE);
        SimpleItem(ModItems.Nugget.AMETHYST_BRONZE);
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
        SimpleItem(ModItems.Nugget.DIAMOND);
        SimpleItem(ModItems.Nugget.DRACONIUM);
        SimpleItem(ModItems.Nugget.ELECTRICAL_STEEL);
        SimpleItem(ModItems.Nugget.ELECTRUM);
        SimpleItem(ModItems.Nugget.EMERALD);
        SimpleItem(ModItems.Nugget.ENCHANTIUM);
        SimpleItem(ModItems.Nugget.END_STEEL);
        SimpleItem(ModItems.Nugget.ENDERITE);
        SimpleItem(ModItems.Nugget.ENERGETIC_SILVER);
        SimpleItem(ModItems.Nugget.GLOWSTONE);
        SimpleItem(ModItems.Nugget.GRAPHITE);
        SimpleItem(ModItems.Nugget.HEPATIZON);
        SimpleItem(ModItems.Nugget.INVAR);
        SimpleItem(ModItems.Nugget.IRIDIUM);
        SimpleItem(ModItems.Nugget.LEAD);
        SimpleItem(ModItems.Nugget.LITHIUM);
        SimpleItem(ModItems.Nugget.LUDICRITE);
        SimpleItem(ModItems.Nugget.LUMIUM);
        SimpleItem(ModItems.Nugget.MAGNESIUM);
        SimpleItem(ModItems.Nugget.MANGANESE);
        SimpleItem(ModItems.Nugget.MANYULLYN);
        SimpleItem(ModItems.Nugget.NETHERITE);
        SimpleItem(ModItems.Nugget.NICKEL);
        SimpleItem(ModItems.Nugget.NITER);
        SimpleItem(ModItems.Nugget.OBSIDIAN);
        SimpleItem(ModItems.Nugget.OSMIUM);
        SimpleItem(ModItems.Nugget.PLATINUM);
        SimpleItem(ModItems.Nugget.ROSE_GOLD);
        SimpleItem(ModItems.Nugget.SIGNALUM);
        SimpleItem(ModItems.Nugget.SILVER);
        SimpleItem(ModItems.Nugget.SLIMESTEEL);
        SimpleItem(ModItems.Nugget.SOULSTEEL);
        SimpleItem(ModItems.Nugget.STEEL);
        SimpleItem(ModItems.Nugget.TIN);
        SimpleItem(ModItems.Nugget.URANIUM);
        SimpleItem(ModItems.Nugget.YELLORIUM);
        SimpleItem(ModItems.Nugget.ZINC);
        //</editor-fold>

        //<editor-fold desc="PLATE">
        SimpleItem(ModItems.Plate.ALUMINIUM);
        SimpleItem(ModItems.Plate.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Plate.ALUMITE);
        SimpleItem(ModItems.Plate.AMETHYST_BRONZE);
        SimpleItem(ModItems.Plate.ARDITE);
        SimpleItem(ModItems.Plate.BERYLLIUM);
        SimpleItem(ModItems.Plate.BLUTONIUM);
        SimpleItem(ModItems.Plate.BORON);
        SimpleItem(ModItems.Plate.BRASS);
        SimpleItem(ModItems.Plate.BRONZE);
        SimpleItem(ModItems.Plate.CONDUCTIVE_IRON);
        SimpleItem(ModItems.Plate.CONSTANTAN);
        SimpleItem(ModItems.Plate.COPPER);
        SimpleItem(ModItems.Plate.CRUDE_STEEL);
        SimpleItem(ModItems.Plate.DARK_STEEL);
        SimpleItem(ModItems.Plate.DEMONIUM);
        SimpleItem(ModItems.Plate.DRACONIUM);
        SimpleItem(ModItems.Plate.ELECTRICAL_STEEL);
        SimpleItem(ModItems.Plate.ELECTRUM);
        SimpleItem(ModItems.Plate.ENCHANTIUM);
        SimpleItem(ModItems.Plate.END_STEEL);
        SimpleItem(ModItems.Plate.ENDERITE);
        SimpleItem(ModItems.Plate.ENERGETIC_SILVER);
        SimpleItem(ModItems.Plate.GOLD);
        SimpleItem(ModItems.Plate.HEPATIZON);
        SimpleItem(ModItems.Plate.INVAR);
        SimpleItem(ModItems.Plate.IRIDIUM);
        SimpleItem(ModItems.Plate.IRON);
        SimpleItem(ModItems.Plate.LEAD);
        SimpleItem(ModItems.Plate.LITHIUM);
        SimpleItem(ModItems.Plate.LUDICRITE);
        SimpleItem(ModItems.Plate.LUMIUM);
        SimpleItem(ModItems.Plate.MANYULLYN);
        SimpleItem(ModItems.Plate.NETHERITE);
        SimpleItem(ModItems.Plate.NICKEL);
        SimpleItem(ModItems.Plate.OSMIUM);
        SimpleItem(ModItems.Plate.PLATINUM);
        SimpleItem(ModItems.Plate.ROSE_GOLD);
        SimpleItem(ModItems.Plate.SIGNALUM);
        SimpleItem(ModItems.Plate.SILVER);
        SimpleItem(ModItems.Plate.SLIMESTEEL);
        SimpleItem(ModItems.Plate.SOULSTEEL);
        SimpleItem(ModItems.Plate.STEEL);
        SimpleItem(ModItems.Plate.TIN);
        SimpleItem(ModItems.Plate.URANIUM);
        SimpleItem(ModItems.Plate.ZINC);
        //</editor-fold>

        //<editor-fold desc="RAW">
        SimpleItem(ModItems.Raw.ALUMINIUM);
        SimpleItem(ModItems.Raw.LEAD);
        SimpleItem(ModItems.Raw.NICKEL);
        SimpleItem(ModItems.Raw.OSMIUM);
        SimpleItem(ModItems.Raw.PLATINUM);
        SimpleItem(ModItems.Raw.SILVER);
        SimpleItem(ModItems.Raw.TIN);
        SimpleItem(ModItems.Raw.URANIUM);
        SimpleItem(ModItems.Raw.ZINC);
        //</editor-fold>

        //<editor-fold desc="ROD">
        SimpleItem(ModItems.Rod.ALUMINIUM);
        SimpleItem(ModItems.Rod.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Rod.ALUMITE);
        SimpleItem(ModItems.Rod.AMETHYST_BRONZE);
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
        SimpleItem(ModItems.Rod.DARK_STEEL);
        SimpleItem(ModItems.Rod.DEMONIUM);
        SimpleItem(ModItems.Rod.DRACONIUM);
        SimpleItem(ModItems.Rod.ELECTRICAL_STEEL);
        SimpleItem(ModItems.Rod.ELECTRUM);
        SimpleItem(ModItems.Rod.ENCHANTIUM);
        SimpleItem(ModItems.Rod.END_STEEL);
        SimpleItem(ModItems.Rod.ENDERITE);
        SimpleItem(ModItems.Rod.ENERGETIC_SILVER);
        SimpleItem(ModItems.Rod.GLOWSTONE);
        SimpleItem(ModItems.Rod.GOLD);
        SimpleItem(ModItems.Rod.GRAPHITE);
        SimpleItem(ModItems.Rod.HEPATIZON);
        SimpleItem(ModItems.Rod.INVAR);
        SimpleItem(ModItems.Rod.IRIDIUM);
        SimpleItem(ModItems.Rod.IRON);
        SimpleItem(ModItems.Rod.LEAD);
        SimpleItem(ModItems.Rod.LITHIUM);
        SimpleItem(ModItems.Rod.LUDICRITE);
        SimpleItem(ModItems.Rod.LUMIUM);
        SimpleItem(ModItems.Rod.MAGNESIUM);
        SimpleItem(ModItems.Rod.MANYULLYN);
        SimpleItem(ModItems.Rod.NICKEL);
        SimpleItem(ModItems.Rod.OBSIDIAN);
        SimpleItem(ModItems.Rod.OSMIUM);
        SimpleItem(ModItems.Rod.PLATINUM);
        SimpleItem(ModItems.Rod.ROSE_GOLD);
        SimpleItem(ModItems.Rod.SIGNALUM);
        SimpleItem(ModItems.Rod.SILVER);
        SimpleItem(ModItems.Rod.SLIMESTEEL);
        SimpleItem(ModItems.Rod.SOULSTEEL);
        SimpleItem(ModItems.Rod.STEEL);
        SimpleItem(ModItems.Rod.TIN);
        SimpleItem(ModItems.Rod.URANIUM);
        SimpleItem(ModItems.Rod.YELLORIUM);
        SimpleItem(ModItems.Rod.ZINC);
        //</editor-fold>

        //<editor-fold desc="GEMS">
        SimpleItem(ModItems.Gem.APATITE);
        SimpleItem(ModItems.Gem.CINNABAR);
        SimpleItem(ModItems.Gem.CITRINE);
        SimpleItem(ModItems.Gem.PERIDOT);
        SimpleItem(ModItems.Gem.RED_GARNET);
        SimpleItem(ModItems.Gem.RUBY);
        SimpleItem(ModItems.Gem.SAPPHIRE);
        SimpleItem(ModItems.Gem.SILKY_JEWEL);
        SimpleItem(ModItems.Gem.SOUL);
        SimpleItem(ModItems.Gem.YELLOW_GARNET);

        SimpleItem(ModItems.Shard.DIAMOND);
        SimpleItem(ModItems.Shard.EMERALD);
        SimpleItem(ModItems.Shard.QUARTZ);
        SimpleItem(ModItems.Shard.RUBY);
        SimpleItem(ModItems.Shard.SAPPHIRE);
        SimpleItem(ModItems.Shard.URANIUM);
        //</editor-fold>

        //<editor-fold desc="TOOL">
        SimpleItem(ModItems.Tool.BRONZE_SWORD, true);
        SimpleItem(ModItems.Tool.BRONZE_PICKAXE, true);
        SimpleItem(ModItems.Tool.BRONZE_SHOVEL, true);
        SimpleItem(ModItems.Tool.BRONZE_AXE, true);
        SimpleItem(ModItems.Tool.BRONZE_HOE, true);
        SimpleItem(ModItems.Tool.BRONZE_HAMMER, true);

        SimpleItem(ModItems.Tool.CITRINE_SWORD, true);
        SimpleItem(ModItems.Tool.CITRINE_PICKAXE, true);
        SimpleItem(ModItems.Tool.CITRINE_SHOVEL, true);
        SimpleItem(ModItems.Tool.CITRINE_AXE, true);
        SimpleItem(ModItems.Tool.CITRINE_HOE, true);
        SimpleItem(ModItems.Tool.CITRINE_HAMMER, true);

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

        SimpleItem(ModItems.Tool.ENDERITE_SWORD, true);
        SimpleItem(ModItems.Tool.ENDERITE_PICKAXE, true);
        SimpleItem(ModItems.Tool.ENDERITE_SHOVEL, true);
        SimpleItem(ModItems.Tool.ENDERITE_AXE, true);
        SimpleItem(ModItems.Tool.ENDERITE_HOE, true);
        SimpleItem(ModItems.Tool.ENDERITE_HAMMER, true);

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
        //</editor-fold>

        //<editor-fold desc="CAST">
        SimpleItem(ModItems.Cast.AXE);
        SimpleItem(ModItems.Cast.BINDING);
        SimpleItem(ModItems.Cast.BLANK);
        SimpleItem(ModItems.Cast.GEAR);
        SimpleItem(ModItems.Cast.GEM);
        SimpleItem(ModItems.Cast.HAMMER);
        SimpleItem(ModItems.Cast.HANDLE);
        SimpleItem(ModItems.Cast.HOE);
        SimpleItem(ModItems.Cast.INGOT);
        SimpleItem(ModItems.Cast.NUGGET);
        SimpleItem(ModItems.Cast.PICKAXE);
        SimpleItem(ModItems.Cast.PLATE);
        SimpleItem(ModItems.Cast.ROD);
        SimpleItem(ModItems.Cast.SHOVEL);
        SimpleItem(ModItems.Cast.SWORD);
        SimpleItem(ModItems.Cast.WIRE);
        //</editor-fold>

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

        //trimmedArmorItem(ModItems.Armor.SAPPHIRE_HELMET);
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
        if(item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.CRYSTAL))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/crystal/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.CAST))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/cast/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.HEAD))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/tool/head/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.DUST))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/dust/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.GEAR))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/gear/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.INGOT))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/ingot/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.NUGGET))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/nugget/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.PLATE))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/plate/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.RAW))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/raw/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.ROD))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/rod/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.TOOL) ||
           item.getId().getPath().toLowerCase().contains(Reference.Names.Suffix.BOW) ||
           (item.getId().getPath().toLowerCase().contains(Reference.Names.Suffix.SWORD) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.CAST) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.HEAD)) ||
           (item.getId().getPath().toLowerCase().contains(Reference.Names.Suffix.AXE) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.CAST) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.HEAD)) ||
           (item.getId().getPath().toLowerCase().contains(Reference.Names.Suffix.PICKAXE) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.CAST) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.HEAD)) ||
           (item.getId().getPath().toLowerCase().contains(Reference.Names.Suffix.SHOVEL) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.CAST) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.HEAD)) ||
           (item.getId().getPath().toLowerCase().contains(Reference.Names.Suffix.HOE) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.CAST) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.HEAD)) ||
           (item.getId().getPath().toLowerCase().contains(Reference.Names.Suffix.HAMMER) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.CAST) &&
                   !item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.HEAD)))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/tool/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.SHARD))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/shard/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.GEM) ||
        !item.getId().getPath().toLowerCase().contains(Reference.Names.Prefix.SHARD))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/gem/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.Suffix.HELMET) ||
           item.getId().getPath().toLowerCase().contains(Reference.Names.Suffix.CHEST_PLATE) ||
           item.getId().getPath().toLowerCase().contains(Reference.Names.Suffix.LEGGINGS) ||
           item.getId().getPath().toLowerCase().contains(Reference.Names.Suffix.BOOTS))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/armor/" + item.getId().getPath()));
        //</editor-fold>

        return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                .texture("layer0",
                        Reference.Location("item/" + item.getId().getPath()));
    }

    // Shout out to El_Redstoniano for making this
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = Reference.MODID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry ->
            {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                this.existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                Reference.Location("item/armor/" + itemRegistryObject.getId().getPath()));
            });
        }
    }
    //</editor-fold>
}