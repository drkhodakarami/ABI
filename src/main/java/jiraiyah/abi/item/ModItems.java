package jiraiyah.abi.item;

import jiraiyah.abi.Reference;
import jiraiyah.abi.item.custom.*;
import jiraiyah.abi.zlib.util.ModTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);

    public static class Armor
    {
        /*public static final RegistryObject<Item> ENGINEER_HELMET = ITEMS.register(Reference.Names.ENGINEER + Reference.Names.HELMET,
                () -> new ModArmorEffects(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));*/

        //<editor-fold desc="AMETHYST">
        /*public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register(Reference.Names.AMETHYST + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register(Reference.Names.AMETHYST + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register(Reference.Names.AMETHYST + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register(Reference.Names.AMETHYST + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new Item.Properties()));*/
        //</editor-fold>

        //<editor-fold desc="BRONZE">
        /*public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register(Reference.Names.BRONZE + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register(Reference.Names.BRONZE + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register(Reference.Names.BRONZE + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register(Reference.Names.BRONZE + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Properties()));*/
        //</editor-fold>

        //<editor-fold desc="CONSTANTAN">
        /*public static final RegistryObject<Item> CONSTANTAN_HELMET = ITEMS.register(Reference.Names.CONSTANTAN + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.CONSTANTAN, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> CONSTANTAN_CHESTPLATE = ITEMS.register(Reference.Names.CONSTANTAN + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.CONSTANTAN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> CONSTANTAN_LEGGINGS = ITEMS.register(Reference.Names.CONSTANTAN + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.CONSTANTAN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> CONSTANTAN_BOOTS = ITEMS.register(Reference.Names.CONSTANTAN + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.CONSTANTAN, ArmorItem.Type.BOOTS, new Item.Properties()));*/

        //</editor-fold>

        //<editor-fold desc="COPPER">
        /*public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register(Reference.Names.COPPER + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register(Reference.Names.COPPER + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register(Reference.Names.COPPER + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register(Reference.Names.COPPER + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));*/

        //</editor-fold>

        //<editor-fold desc="ELECTRUM">
        /*public static final RegistryObject<Item> ELECTRUM_HELMET = ITEMS.register(Reference.Names.ELECTRUM + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.ELECTRUM, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_CHESTPLATE = ITEMS.register(Reference.Names.ELECTRUM + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.ELECTRUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_LEGGINGS = ITEMS.register(Reference.Names.ELECTRUM + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.ELECTRUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_BOOTS = ITEMS.register(Reference.Names.ELECTRUM + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.ELECTRUM, ArmorItem.Type.BOOTS, new Item.Properties()));*/

        //</editor-fold>

        //<editor-fold desc="EMERALD">
        /*public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register(Reference.Names.EMERALD + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register(Reference.Names.EMERALD + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register(Reference.Names.EMERALD + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register(Reference.Names.EMERALD + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties()));*/

        //</editor-fold>

        //<editor-fold desc="INVAR">
        /*public static final RegistryObject<Item> INVAR_HELMET = ITEMS.register(Reference.Names.INVAR + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.INVAR, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> INVAR_CHESTPLATE = ITEMS.register(Reference.Names.INVAR + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.INVAR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> INVAR_LEGGINGS = ITEMS.register(Reference.Names.INVAR + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.INVAR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> INVAR_BOOTS = ITEMS.register(Reference.Names.INVAR + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.INVAR, ArmorItem.Type.BOOTS, new Item.Properties()));*/

        //</editor-fold>

        //<editor-fold desc="LEAD">
        /*public static final RegistryObject<Item> LEAD_HELMET = ITEMS.register(Reference.Names.LEAD + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.LEAD, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> LEAD_CHESTPLATE = ITEMS.register(Reference.Names.LEAD + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.LEAD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> LEAD_LEGGINGS = ITEMS.register(Reference.Names.LEAD + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.LEAD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> LEAD_BOOTS = ITEMS.register(Reference.Names.LEAD + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.LEAD, ArmorItem.Type.BOOTS, new Item.Properties()));*/

        //</editor-fold>

        //<editor-fold desc="NICKEL">
        /*public static final RegistryObject<Item> NICKEL_HELMET = ITEMS.register(Reference.Names.NICKEL + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.NICKEL, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_CHESTPLATE = ITEMS.register(Reference.Names.NICKEL + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_LEGGINGS = ITEMS.register(Reference.Names.NICKEL + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_BOOTS = ITEMS.register(Reference.Names.NICKEL + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.BOOTS, new Item.Properties()));*/

        //</editor-fold>

        //<editor-fold desc="RUBY">
        /*public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register(Reference.Names.RUBY + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register(Reference.Names.RUBY + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register(Reference.Names.RUBY + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register(Reference.Names.RUBY + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));*/

        //</editor-fold>

        //<editor-fold desc="SAPPHIRE">
        /*public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register(Reference.Names.SAPPHIRE + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register(Reference.Names.SAPPHIRE + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register(Reference.Names.SAPPHIRE + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register(Reference.Names.SAPPHIRE + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties()));*/

        //</editor-fold>

        //<editor-fold desc="SILVER">
        /*public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register(Reference.Names.SILVER + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.SILVER, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register(Reference.Names.SILVER + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register(Reference.Names.SILVER + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register(Reference.Names.SILVER + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.BOOTS, new Item.Properties()));*/

        //</editor-fold

        //<editor-fold desc="TIN">
        /*public static final RegistryObject<Item> TIN_HELMET = ITEMS.register(Reference.Names.TIN + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.TIN, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register(Reference.Names.TIN + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register(Reference.Names.TIN + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register(Reference.Names.TIN + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.BOOTS, new Item.Properties()));*/

        //</editor-fold>
        public static void initialize(){}

    }

    public static class Cast
    {
        public static final RegistryObject<Item> AXE = ITEMS.register(
                Reference.Names.Prefix.CAST + Reference.Names.Cast.AXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BINDING = ITEMS.register(
                Reference.Names.Prefix.CAST + Reference.Names.Cast.BINDING, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BLANK = ITEMS.register(
                Reference.Names.Prefix.CAST + Reference.Names.Cast.BLANK, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GEAR = ITEMS.register(
                Reference.Names.Prefix.CAST + Reference.Names.Cast.GEAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GEM = ITEMS.register(
                Reference.Names.Prefix.CAST + Reference.Names.Cast.GEM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> HAMMER = ITEMS.register(
                Reference.Names.Prefix.CAST + Reference.Names.Cast.HAMMER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> HANDLE = ITEMS.register(
                Reference.Names.Prefix.CAST + Reference.Names.Cast.HANDLE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> HOE = ITEMS.register(
                Reference.Names.Prefix.CAST + Reference.Names.Cast.HOE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INGOT = ITEMS.register(
                Reference.Names.Prefix.CAST + Reference.Names.Cast.INGOT, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NUGGET = ITEMS.register(
                Reference.Names.Prefix.CAST + Reference.Names.Cast.NUGGET, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> PICKAXE = ITEMS.register(
                Reference.Names.Prefix.CAST + Reference.Names.Cast.PICKAXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> PLATE = ITEMS.register(
                Reference.Names.Prefix.CAST + Reference.Names.Cast.PLATE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ROD = ITEMS.register(
                Reference.Names.Prefix.CAST + Reference.Names.Cast.ROD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SHOVEL = ITEMS.register(
                Reference.Names.Prefix.CAST + Reference.Names.Cast.SHOVEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SWORD = ITEMS.register(
                Reference.Names.Prefix.CAST + Reference.Names.Cast.SWORD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> WIRE = ITEMS.register(
                Reference.Names.Prefix.CAST + Reference.Names.Cast.WIRE, () -> new Item(new Item.Properties()));

        public static void initialize(){}
    }

    public static class Crystal
    {
        public static final RegistryObject<Item> COBALT = ITEMS.register(
                Reference.Names.Prefix.CRYSTAL + Reference.Names.Material.COBALT, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CYANIDE = ITEMS.register(
                Reference.Names.Prefix.CRYSTAL + Reference.Names.Material.CYANIDE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GLOWSTONE = ITEMS.register(
                Reference.Names.Prefix.CRYSTAL + Reference.Names.Material.GLOWSTONE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NITER = ITEMS.register(
                Reference.Names.Prefix.CRYSTAL + Reference.Names.Material.NITER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> URANIUM = ITEMS.register(
                Reference.Names.Prefix.CRYSTAL + Reference.Names.Material.URANIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> YELLORIUM = ITEMS.register(
                Reference.Names.Prefix.CRYSTAL + Reference.Names.Material.YELLORIUM, () -> new Item(new Item.Properties()));

        public static void initialize(){}
    }

    public static class Dust
    {
        public static final RegistryObject<Item> ALUMINIUM = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.ALUMINIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMINIUM_BRASS = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.ALUMINIUM_BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMITE = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.ALUMITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> AMETHYST_BRONZE = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.AMETHYST_BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> APATITE = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.APATITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ARDITE = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.ARDITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BERYLLIUM = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.BERYLLIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BLUTONIUM = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.BLUTONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BORON = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.BORON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRASS = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CHARCOAL = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.CHARCOAL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CINNABAR = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.CINNABAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CITRINE = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.CITRINE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COAL = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.COAL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COBALT = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.COBALT, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONDUCTIVE_IRON = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.CONDUCTIVE_IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.CONSTANTAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COPPER = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.COPPER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CRUDE_STEEL = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.CRUDE_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CYANIDE = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.CYANIDE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DARK_STEEL = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.DARK_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DAWN_STONE = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.DAWN_STONE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DEMONIUM = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.DEMONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DIAMOND = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.DIAMOND, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DRACONIUM = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.DRACONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRICAL_STEEL = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.ELECTRICAL_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.ELECTRUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> EMERALD = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.EMERALD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENCHANTIUM = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.ENCHANTIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> END_STEEL = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.END_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENDERITE = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.ENDERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENERGETIC_SILVER = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.ENERGETIC_SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GOLD = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.GOLD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GRAPHITE = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.GRAPHITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> HEPATIZON = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.HEPATIZON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.INVAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRIDIUM = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.IRIDIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRON = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LAPIS = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.LAPIS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.LEAD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LITHIUM = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.LITHIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUDICRITE = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.LUDICRITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUMIUM = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.LUMIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MAGNESIUM = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.MAGNESIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MANGANESE = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.MANGANESE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MANYULLYN = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.MANYULLYN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NETHERITE = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.NETHERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.NICKEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NITER = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.NITER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> OBSIDIAN = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.OBSIDIAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> OSMIUM = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.OSMIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> PLATINUM = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.PLATINUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> PRISMARINE = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.PRISMARINE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> QUARTZ = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.QUARTZ, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ROSE_GOLD = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.ROSE_GOLD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> RUBY = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.RUBY, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SAPPHIRE = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.SAPPHIRE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SIGNALUM = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.SIGNALUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SLIMESTEEL = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.SLIMESTEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SOULSTEEL = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.SOULSTEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> STEEL = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SULFUR = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.SULFUR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.TIN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> URANIUM = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.URANIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> YELLORIUM = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.YELLORIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ZINC = ITEMS.register(
                Reference.Names.Prefix.DUST + Reference.Names.Material.ZINC, () -> new Item(new Item.Properties()));

        public static void initialize(){}
    }

    public static class Gear
    {
        public static final RegistryObject<Item> ALUMINIUM = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.ALUMINIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMINIUM_BRASS = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.ALUMINIUM_BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMITE = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.ALUMITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> AMETHYST_BRONZE = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.AMETHYST_BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ARDITE = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.ARDITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BERYLLIUM = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.BERYLLIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BLUTONIUM = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.BLUTONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BORON = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.BORON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRASS = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COBALT = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.COBALT, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONDUCTIVE_IRON = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.CONDUCTIVE_IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.CONSTANTAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COPPER = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.COPPER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CRUDE_STEEL = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.CRUDE_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CYANIDE = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.CYANIDE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DARK_STEEL = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.DARK_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DAWN_STONE = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.DAWN_STONE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DEMONIUM = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.DEMONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DIAMOND = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.DIAMOND, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DRACONIUM = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.DRACONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRICAL_STEEL = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.ELECTRICAL_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.ELECTRUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> EMERALD = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.EMERALD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENCHANTIUM = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.ENCHANTIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> END_STEEL = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.END_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENDERITE = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.ENDERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENERGETIC_SILVER = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.ENERGETIC_SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GLOWSTONE = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.GLOWSTONE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GOLD = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.GOLD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GRAPHITE = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.GRAPHITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> HEPATIZON = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.HEPATIZON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.INVAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRIDIUM = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.IRIDIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRON = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LAPIS = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.LAPIS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.LEAD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LITHIUM = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.LITHIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUDICRITE = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.LUDICRITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUMIUM = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.LUMIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MAGNESIUM = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.MAGNESIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MANGANESE = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.MANGANESE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MANYULLYN = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.MANYULLYN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NETHERITE = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.NETHERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.NICKEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NITER = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.NITER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> OBSIDIAN = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.OBSIDIAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> OSMIUM = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.OSMIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> PLATINUM = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.PLATINUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> PRISMARINE = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.PRISMARINE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> QUARTZ = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.QUARTZ, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ROSE_GOLD = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.ROSE_GOLD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> RUBY = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.RUBY, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SAPPHIRE = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.SAPPHIRE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SIGNALUM = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.SIGNALUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SLIMESTEEL = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.SLIMESTEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SOULSTEEL = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.SOULSTEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> STEEL = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> STONE = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.STONE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SULFUR = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.SULFUR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.TIN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> URANIUM = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.URANIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> WOOD = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.WOOD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> YELLORIUM = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.YELLORIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ZINC = ITEMS.register(
                Reference.Names.Prefix.GEAR + Reference.Names.Material.ZINC, () -> new Item(new Item.Properties()));

        public static void initialize(){}
    }

    public static class Ingot
    {
        public static final RegistryObject<Item> ALUMINIUM = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.ALUMINIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMINIUM_BRASS = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.ALUMINIUM_BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMITE = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.ALUMITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> AMETHYST_BRONZE = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.AMETHYST_BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ARDITE = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.ARDITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BERYLLIUM = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.BERYLLIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BLUTONIUM = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.BLUTONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BORON = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.BORON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRASS = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONDUCTIVE_IRON = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.CONDUCTIVE_IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.CONSTANTAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CRUDE_STEEL = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.CRUDE_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DARK_STEEL = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.DARK_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DEMONIUM = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.DEMONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DRACONIUM = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.DRACONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRICAL_STEEL = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.ELECTRICAL_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.ELECTRUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENCHANTIUM = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.ENCHANTIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> END_STEEL = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.END_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENDERITE = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.ENDERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENERGETIC_SILVER = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.ENERGETIC_SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GLOWSTONE = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.GLOWSTONE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> HEPATIZON = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.HEPATIZON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.INVAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRIDIUM = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.IRIDIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.LEAD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LITHIUM = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.LITHIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUDICRITE = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.LUDICRITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUMIUM = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.LUMIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MANYULLYN = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.MANYULLYN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.NICKEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> OBSIDIAN = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.OBSIDIAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> OSMIUM = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.OSMIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> PLATINUM = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.PLATINUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ROSE_GOLD = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.ROSE_GOLD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SIGNALUM = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.SIGNALUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SLIMESTEEL = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.SLIMESTEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SOULSTEEL = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.SOULSTEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> STEEL = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.TIN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> URANIUM = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.URANIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> YELLORIUM = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.YELLORIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ZINC = ITEMS.register(
                Reference.Names.Prefix.INGOT + Reference.Names.Material.ZINC, () -> new Item(new Item.Properties()));

        public static void initialize(){}
    }

    public static class Nugget
    {
        public static final RegistryObject<Item> ALUMINIUM = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.ALUMINIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMINIUM_BRASS = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.ALUMINIUM_BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMITE = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.ALUMITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> AMETHYST_BRONZE = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.AMETHYST_BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ARDITE = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.ARDITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BERYLLIUM = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.BERYLLIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BLUTONIUM = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.BLUTONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BORON = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.BORON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRASS = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COBALT = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.COBALT, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONDUCTIVE_IRON = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.CONDUCTIVE_IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.CONSTANTAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COPPER = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.COPPER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CRUDE_STEEL = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.CRUDE_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CYANIDE = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.CYANIDE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DARK_STEEL = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.DARK_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DAWN_STONE = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.DAWN_STONE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DEMONIUM = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.DEMONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DIAMOND = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.DIAMOND, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DRACONIUM = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.DRACONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRICAL_STEEL = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.ELECTRICAL_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.ELECTRUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> EMERALD = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.EMERALD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENCHANTIUM = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.ENCHANTIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> END_STEEL = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.END_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENDERITE = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.ENDERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENERGETIC_SILVER = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.ENERGETIC_SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GLOWSTONE = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.GLOWSTONE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GRAPHITE = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.GRAPHITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> HEPATIZON = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.HEPATIZON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.INVAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRIDIUM = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.IRIDIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.LEAD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LITHIUM = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.LITHIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUDICRITE = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.LUDICRITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUMIUM = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.LUMIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MAGNESIUM = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.MAGNESIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MANGANESE = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.MANGANESE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MANYULLYN = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.MANYULLYN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NETHERITE = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.NETHERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.NICKEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NITER = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.NITER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> OBSIDIAN = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.OBSIDIAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> OSMIUM = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.OSMIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> PLATINUM = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.PLATINUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ROSE_GOLD = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.ROSE_GOLD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SIGNALUM = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.SIGNALUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SLIMESTEEL = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.SLIMESTEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SOULSTEEL = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.SOULSTEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> STEEL = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.TIN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> URANIUM = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.URANIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> YELLORIUM = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.YELLORIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ZINC = ITEMS.register(
                Reference.Names.Prefix.NUGGET + Reference.Names.Material.ZINC, () -> new Item(new Item.Properties()));

        public static void initialize(){}
    }

    public static class Plate
    {
        public static final RegistryObject<Item> ALUMINIUM = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.ALUMINIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMINIUM_BRASS = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.ALUMINIUM_BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMITE = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.ALUMITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> AMETHYST_BRONZE = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.AMETHYST_BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ARDITE = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.ARDITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BERYLLIUM = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.BERYLLIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BLUTONIUM = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.BLUTONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BORON = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.BORON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRASS = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONDUCTIVE_IRON = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.CONDUCTIVE_IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.CONSTANTAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COPPER = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.COPPER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CRUDE_STEEL = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.CRUDE_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DARK_STEEL = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.DARK_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DEMONIUM = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.DEMONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DRACONIUM = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.DRACONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRICAL_STEEL = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.ELECTRICAL_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.ELECTRUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENCHANTIUM = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.ENCHANTIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> END_STEEL = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.END_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENDERITE = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.ENDERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENERGETIC_SILVER = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.ENERGETIC_SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GOLD = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.GOLD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> HEPATIZON = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.HEPATIZON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.INVAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRIDIUM = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.IRIDIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRON = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.LEAD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LITHIUM = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.LITHIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUDICRITE = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.LUDICRITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUMIUM = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.LUMIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MANYULLYN = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.MANYULLYN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NETHERITE = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.NETHERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.NICKEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> OSMIUM = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.OSMIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> PLATINUM = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.PLATINUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ROSE_GOLD = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.ROSE_GOLD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SIGNALUM = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.SIGNALUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SLIMESTEEL = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.SLIMESTEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SOULSTEEL = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.SOULSTEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> STEEL = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.TIN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> URANIUM = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.URANIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ZINC = ITEMS.register(
                Reference.Names.Prefix.PLATE + Reference.Names.Material.ZINC, () -> new Item(new Item.Properties()));

        public static void initialize(){}
    }

    public static class Raw
    {
        public static final RegistryObject<Item> ALUMINIUM = ITEMS.register(
                Reference.Names.Prefix.RAW + Reference.Names.Material.ALUMINIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD = ITEMS.register(
                Reference.Names.Prefix.RAW + Reference.Names.Material.LEAD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL = ITEMS.register(
                Reference.Names.Prefix.RAW + Reference.Names.Material.NICKEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> OSMIUM = ITEMS.register(
                Reference.Names.Prefix.RAW + Reference.Names.Material.OSMIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> PLATINUM = ITEMS.register(
                Reference.Names.Prefix.RAW + Reference.Names.Material.PLATINUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER = ITEMS.register(
                Reference.Names.Prefix.RAW + Reference.Names.Material.SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN = ITEMS.register(
                Reference.Names.Prefix.RAW + Reference.Names.Material.TIN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> URANIUM = ITEMS.register(
                Reference.Names.Prefix.RAW + Reference.Names.Material.URANIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ZINC = ITEMS.register(
                Reference.Names.Prefix.RAW + Reference.Names.Material.ZINC, () -> new Item(new Item.Properties()));

        public static void initialize()
        {}
    }

    public static class Rod
    {
        public static final RegistryObject<Item> ALUMINIUM = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.ALUMINIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMINIUM_BRASS = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.ALUMINIUM_BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMITE = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.ALUMITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> AMETHYST_BRONZE = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.AMETHYST_BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ARDITE = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.ARDITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BERYLLIUM = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.BERYLLIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BLUTONIUM = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.BLUTONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BORON = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.BORON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRASS = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COBALT = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.COBALT, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONDUCTIVE_IRON = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.CONDUCTIVE_IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.CONSTANTAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COPPER = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.COPPER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CRUDE_STEEL = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.CRUDE_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DARK_STEEL = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.DARK_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DEMONIUM = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.DEMONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DRACONIUM = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.DRACONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRICAL_STEEL = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.ELECTRICAL_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.ELECTRUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENCHANTIUM = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.ENCHANTIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> END_STEEL = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.END_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENDERITE = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.ENDERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENERGETIC_SILVER = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.ENERGETIC_SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GLOWSTONE = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.GLOWSTONE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GOLD = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.GOLD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GRAPHITE = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.GRAPHITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> HEPATIZON = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.HEPATIZON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.INVAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRIDIUM = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.IRIDIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRON = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.LEAD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LITHIUM = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.LITHIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUDICRITE = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.LUDICRITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUMIUM = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.LUMIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MAGNESIUM = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.MAGNESIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MANYULLYN = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.MANYULLYN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.NICKEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> OBSIDIAN = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.OBSIDIAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> OSMIUM = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.OSMIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> PLATINUM = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.PLATINUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ROSE_GOLD = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.ROSE_GOLD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SIGNALUM = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.SIGNALUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SLIMESTEEL = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.SLIMESTEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SOULSTEEL = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.SOULSTEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> STEEL = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.TIN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> URANIUM = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.URANIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> YELLORIUM = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.YELLORIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ZINC = ITEMS.register(
                Reference.Names.Prefix.ROD + Reference.Names.Material.ZINC, () -> new Item(new Item.Properties()));

        public static void initialize(){}
    }

    public static class Tool
    {
        //<editor-fold desc="BRONZE TOOLS">
        public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register(Reference.Names.Material.BRONZE + Reference.Names.Suffix.SWORD,
                () -> new SwordItem(ModTiers.BRONZE, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register(Reference.Names.Material.BRONZE + Reference.Names.Suffix.PICKAXE,
                () -> new PickaxeItem(ModTiers.BRONZE, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register(Reference.Names.Material.BRONZE + Reference.Names.Suffix.SHOVEL,
                () -> new ShovelItem(ModTiers.BRONZE, 1.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register(Reference.Names.Material.BRONZE + Reference.Names.Suffix.AXE,
                () -> new AxeItem(ModTiers.BRONZE, 6.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register(Reference.Names.Material.BRONZE + Reference.Names.Suffix.HOE,
                () -> new HoeItem(ModTiers.BRONZE, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> BRONZE_HAMMER = ITEMS.register(Reference.Names.Material.BRONZE + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(ModTiers.BRONZE, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="CITRINE TOOLS">
        public static final RegistryObject<Item> CITRINE_SWORD = ITEMS.register(Reference.Names.Material.CITRINE + Reference.Names.Suffix.SWORD,
                () -> new SwordItem(ModTiers.CITRINE, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> CITRINE_PICKAXE = ITEMS.register(Reference.Names.Material.CITRINE + Reference.Names.Suffix.PICKAXE,
                () -> new PickaxeItem(ModTiers.CITRINE, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> CITRINE_SHOVEL = ITEMS.register(Reference.Names.Material.CITRINE + Reference.Names.Suffix.SHOVEL,
                () -> new ShovelItem(ModTiers.CITRINE, 1.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> CITRINE_AXE = ITEMS.register(Reference.Names.Material.CITRINE + Reference.Names.Suffix.AXE,
                () -> new AxeItem(ModTiers.CITRINE, 6.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> CITRINE_HOE = ITEMS.register(Reference.Names.Material.CITRINE + Reference.Names.Suffix.HOE,
                () -> new HoeItem(ModTiers.CITRINE, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> CITRINE_HAMMER = ITEMS.register(Reference.Names.Material.CITRINE + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(ModTiers.CITRINE, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="CONSTANTAN TOOLS">
        public static final RegistryObject<Item> CONSTANTAN_SWORD = ITEMS.register(Reference.Names.Material.CONSTANTAN + Reference.Names.Suffix.SWORD,
                () -> new SwordItem(ModTiers.CONSTANTAN, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> CONSTANTAN_PICKAXE = ITEMS.register(Reference.Names.Material.CONSTANTAN + Reference.Names.Suffix.PICKAXE,
                () -> new PickaxeItem(ModTiers.CONSTANTAN, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> CONSTANTAN_SHOVEL = ITEMS.register(Reference.Names.Material.CONSTANTAN + Reference.Names.Suffix.SHOVEL,
                () -> new ShovelItem(ModTiers.CONSTANTAN, 1.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> CONSTANTAN_AXE = ITEMS.register(Reference.Names.Material.CONSTANTAN + Reference.Names.Suffix.AXE,
                () -> new AxeItem(ModTiers.CONSTANTAN, 6.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> CONSTANTAN_HOE = ITEMS.register(Reference.Names.Material.CONSTANTAN + Reference.Names.Suffix.HOE,
                () -> new HoeItem(ModTiers.CONSTANTAN, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> CONSTANTAN_HAMMER = ITEMS.register(Reference.Names.Material.CONSTANTAN + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(ModTiers.CONSTANTAN, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="COPPER TOOLS">
        public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register(Reference.Names.Material.COPPER + Reference.Names.Suffix.SWORD,
                () -> new SwordItem(ModTiers.COPPER, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register(Reference.Names.Material.COPPER + Reference.Names.Suffix.PICKAXE,
                () -> new PickaxeItem(ModTiers.COPPER, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register(Reference.Names.Material.COPPER + Reference.Names.Suffix.SHOVEL,
                () -> new ShovelItem(ModTiers.COPPER, 1.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_AXE = ITEMS.register(Reference.Names.Material.COPPER + Reference.Names.Suffix.AXE,
                () -> new AxeItem(ModTiers.COPPER, 6.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_HOE = ITEMS.register(Reference.Names.Material.COPPER + Reference.Names.Suffix.HOE,
                () -> new HoeItem(ModTiers.COPPER, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_HAMMER = ITEMS.register(Reference.Names.Material.COPPER + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(ModTiers.COPPER, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="ELECTRUM TOOLS">
        public static final RegistryObject<Item> ELECTRUM_SWORD = ITEMS.register(Reference.Names.Material.ELECTRUM + Reference.Names.Suffix.SWORD,
                () -> new SwordItem(ModTiers.ELECTRUM, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_PICKAXE = ITEMS.register(Reference.Names.Material.ELECTRUM + Reference.Names.Suffix.PICKAXE,
                () -> new PickaxeItem(ModTiers.ELECTRUM, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_SHOVEL = ITEMS.register(Reference.Names.Material.ELECTRUM + Reference.Names.Suffix.SHOVEL,
                () -> new ShovelItem(ModTiers.ELECTRUM, 1.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_AXE = ITEMS.register(Reference.Names.Material.ELECTRUM + Reference.Names.Suffix.AXE,
                () -> new AxeItem(ModTiers.ELECTRUM, 6.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_HOE = ITEMS.register(Reference.Names.Material.ELECTRUM + Reference.Names.Suffix.HOE,
                () -> new HoeItem(ModTiers.ELECTRUM, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_HAMMER = ITEMS.register(Reference.Names.Material.ELECTRUM + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(ModTiers.ELECTRUM, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="EMERALD TOOLS">
        public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register(Reference.Names.Material.EMERALD + Reference.Names.Suffix.SWORD,
                () -> new SwordItem(ModTiers.EMERALD, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register(Reference.Names.Material.EMERALD + Reference.Names.Suffix.PICKAXE,
                () -> new PickaxeItem(ModTiers.EMERALD, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register(Reference.Names.Material.EMERALD + Reference.Names.Suffix.SHOVEL,
                () -> new ShovelItem(ModTiers.EMERALD, 1.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register(Reference.Names.Material.EMERALD + Reference.Names.Suffix.AXE,
                () -> new AxeItem(ModTiers.EMERALD, 6.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register(Reference.Names.Material.EMERALD + Reference.Names.Suffix.HOE,
                () -> new HoeItem(ModTiers.EMERALD, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_HAMMER = ITEMS.register(Reference.Names.Material.EMERALD + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(ModTiers.EMERALD, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="ENDERITE TOOLS">
        public static final RegistryObject<Item> ENDERITE_SWORD = ITEMS.register(Reference.Names.Material.ENDERITE + Reference.Names.Suffix.SWORD,
                () -> new SwordItem(ModTiers.ENDERITE, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> ENDERITE_PICKAXE = ITEMS.register(Reference.Names.Material.ENDERITE + Reference.Names.Suffix.PICKAXE,
                () -> new PickaxeItem(ModTiers.ENDERITE, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> ENDERITE_SHOVEL = ITEMS.register(Reference.Names.Material.ENDERITE + Reference.Names.Suffix.SHOVEL,
                () -> new ShovelItem(ModTiers.ENDERITE, 1.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> ENDERITE_AXE = ITEMS.register(Reference.Names.Material.ENDERITE + Reference.Names.Suffix.AXE,
                () -> new AxeItem(ModTiers.ENDERITE, 6.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> ENDERITE_HOE = ITEMS.register(Reference.Names.Material.ENDERITE + Reference.Names.Suffix.HOE,
                () -> new HoeItem(ModTiers.ENDERITE, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> ENDERITE_HAMMER = ITEMS.register(Reference.Names.Material.ENDERITE + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(ModTiers.ENDERITE, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="INVAR TOOLS">
        public static final RegistryObject<Item> INVAR_SWORD = ITEMS.register(Reference.Names.Material.INVAR + Reference.Names.Suffix.SWORD,
                () -> new SwordItem(ModTiers.INVAR, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> INVAR_PICKAXE = ITEMS.register(Reference.Names.Material.INVAR + Reference.Names.Suffix.PICKAXE,
                () -> new PickaxeItem(ModTiers.INVAR, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> INVAR_SHOVEL = ITEMS.register(Reference.Names.Material.INVAR + Reference.Names.Suffix.SHOVEL,
                () -> new ShovelItem(ModTiers.INVAR, 1.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> INVAR_AXE = ITEMS.register(Reference.Names.Material.INVAR + Reference.Names.Suffix.AXE,
                () -> new AxeItem(ModTiers.INVAR, 6.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> INVAR_HOE = ITEMS.register(Reference.Names.Material.INVAR + Reference.Names.Suffix.HOE,
                () -> new HoeItem(ModTiers.INVAR, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> INVAR_HAMMER = ITEMS.register(Reference.Names.Material.INVAR + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(ModTiers.INVAR, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="LEAD TOOLS">
        public static final RegistryObject<Item> LEAD_SWORD = ITEMS.register(Reference.Names.Material.LEAD + Reference.Names.Suffix.SWORD,
                () -> new SwordItem(ModTiers.LEAD, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> LEAD_PICKAXE = ITEMS.register(Reference.Names.Material.LEAD + Reference.Names.Suffix.PICKAXE,
                () -> new PickaxeItem(ModTiers.LEAD, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> LEAD_SHOVEL = ITEMS.register(Reference.Names.Material.LEAD + Reference.Names.Suffix.SHOVEL,
                () -> new ShovelItem(ModTiers.LEAD, 1.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> LEAD_AXE = ITEMS.register(Reference.Names.Material.LEAD + Reference.Names.Suffix.AXE,
                () -> new AxeItem(ModTiers.LEAD, 6.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> LEAD_HOE = ITEMS.register(Reference.Names.Material.LEAD + Reference.Names.Suffix.HOE,
                () -> new HoeItem(ModTiers.LEAD, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> LEAD_HAMMER = ITEMS.register(Reference.Names.Material.LEAD + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(ModTiers.LEAD, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="NICKEL TOOLS">
        public static final RegistryObject<Item> NICKEL_SWORD = ITEMS.register(Reference.Names.Material.NICKEL + Reference.Names.Suffix.SWORD,
                () -> new SwordItem(ModTiers.NICKEL, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_PICKAXE = ITEMS.register(Reference.Names.Material.NICKEL + Reference.Names.Suffix.PICKAXE,
                () -> new PickaxeItem(ModTiers.NICKEL, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_SHOVEL = ITEMS.register(Reference.Names.Material.NICKEL + Reference.Names.Suffix.SHOVEL,
                () -> new ShovelItem(ModTiers.NICKEL, 1.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_AXE = ITEMS.register(Reference.Names.Material.NICKEL + Reference.Names.Suffix.AXE,
                () -> new AxeItem(ModTiers.NICKEL, 6.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_HOE = ITEMS.register(Reference.Names.Material.NICKEL + Reference.Names.Suffix.HOE,
                () -> new HoeItem(ModTiers.NICKEL, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_HAMMER = ITEMS.register(Reference.Names.Material.NICKEL + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(ModTiers.NICKEL, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="RUBY TOOLS">
        public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register(Reference.Names.Material.RUBY + Reference.Names.Suffix.SWORD,
                () -> new SwordItem(ModTiers.RUBY, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register(Reference.Names.Material.RUBY + Reference.Names.Suffix.PICKAXE,
                () -> new PickaxeItem(ModTiers.RUBY, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register(Reference.Names.Material.RUBY + Reference.Names.Suffix.SHOVEL,
                () -> new ShovelItem(ModTiers.RUBY, 1.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> RUBY_AXE = ITEMS.register(Reference.Names.Material.RUBY + Reference.Names.Suffix.AXE,
                () -> new AxeItem(ModTiers.RUBY, 6.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> RUBY_HOE = ITEMS.register(Reference.Names.Material.RUBY + Reference.Names.Suffix.HOE,
                () -> new HoeItem(ModTiers.RUBY, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> RUBY_HAMMER = ITEMS.register(Reference.Names.Material.RUBY + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(ModTiers.RUBY, 0, 0.0F, new Item.Properties()));

        public static final RegistryObject<Item> RUBY_BOW = ITEMS.register(Reference.Names.Material.RUBY + Reference.Names.Suffix.BOW,
                () -> new RubyBow(new Item.Properties().durability(500)));
        //</editor-fold>

        //<editor-fold desc="SAPPHIRE TOOLS">
        public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register(Reference.Names.Material.SAPPHIRE + Reference.Names.Suffix.SWORD,
                () -> new SwordItem(ModTiers.SAPPHIRE, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register(Reference.Names.Material.SAPPHIRE + Reference.Names.Suffix.PICKAXE,
                () -> new PickaxeItem(ModTiers.SAPPHIRE, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register(Reference.Names.Material.SAPPHIRE + Reference.Names.Suffix.SHOVEL,
                () -> new ShovelItem(ModTiers.SAPPHIRE, 1.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register(Reference.Names.Material.SAPPHIRE + Reference.Names.Suffix.AXE,
                () -> new AxeItem(ModTiers.SAPPHIRE, 6.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register(Reference.Names.Material.SAPPHIRE + Reference.Names.Suffix.HOE,
                () -> new HoeItem(ModTiers.SAPPHIRE, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_HAMMER = ITEMS.register(Reference.Names.Material.SAPPHIRE + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(ModTiers.SAPPHIRE, 0, 0.0F, new Item.Properties()));

        public static final RegistryObject<Item> SAPPHIRE_BOW = ITEMS.register(Reference.Names.Material.SAPPHIRE + Reference.Names.Suffix.BOW,
                () -> new SapphireBow(new Item.Properties().durability(500)));
        //</editor-fold>

        //<editor-fold desc="SILVER TOOLS">
        public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register(Reference.Names.Material.SILVER + Reference.Names.Suffix.SWORD,
                () -> new SwordItem(ModTiers.SILVER, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register(Reference.Names.Material.SILVER + Reference.Names.Suffix.PICKAXE,
                () -> new PickaxeItem(ModTiers.SILVER, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register(Reference.Names.Material.SILVER + Reference.Names.Suffix.SHOVEL,
                () -> new ShovelItem(ModTiers.SILVER, 1.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> SILVER_AXE = ITEMS.register(Reference.Names.Material.SILVER + Reference.Names.Suffix.AXE,
                () -> new AxeItem(ModTiers.SILVER, 6.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> SILVER_HOE = ITEMS.register(Reference.Names.Material.SILVER + Reference.Names.Suffix.HOE,
                () -> new HoeItem(ModTiers.SILVER, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> SILVER_HAMMER = ITEMS.register(Reference.Names.Material.SILVER + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(ModTiers.SILVER, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="TIN TOOLS">
        public static final RegistryObject<Item> TIN_SWORD = ITEMS.register(Reference.Names.Material.TIN + Reference.Names.Suffix.SWORD,
                () -> new SwordItem(ModTiers.TIN, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register(Reference.Names.Material.TIN + Reference.Names.Suffix.PICKAXE,
                () -> new PickaxeItem(ModTiers.TIN, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register(Reference.Names.Material.TIN + Reference.Names.Suffix.SHOVEL,
                () -> new ShovelItem(ModTiers.TIN, 1.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> TIN_AXE = ITEMS.register(Reference.Names.Material.TIN + Reference.Names.Suffix.AXE,
                () -> new AxeItem(ModTiers.TIN, 6.0F, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> TIN_HOE = ITEMS.register(Reference.Names.Material.TIN + Reference.Names.Suffix.HOE,
                () -> new HoeItem(ModTiers.TIN, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> TIN_HAMMER = ITEMS.register(Reference.Names.Material.TIN + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(ModTiers.TIN, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="VANILLA HAMMERS">
        public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register(Reference.Names.Material.DIAMOND + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(Tiers.DIAMOND, 0, 0.0F, new Item.Properties()));

        public static final RegistryObject<Item> GOLD_HAMMER = ITEMS.register(Reference.Names.Material.GOLD + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(Tiers.GOLD, 0, 0.0F, new Item.Properties()));

        public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register(Reference.Names.Material.IRON + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(Tiers.IRON, 0, 0.0F, new Item.Properties()));

        public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register(Reference.Names.Material.NETHERITE + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(Tiers.NETHERITE, 0, 0.0F, new Item.Properties()));

        public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register(Reference.Names.Material.STONE + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(Tiers.STONE, 0, 0.0F, new Item.Properties()));

        public static final RegistryObject<Item> WOOD_HAMMER = ITEMS.register(Reference.Names.Material.WOOD + Reference.Names.Suffix.HAMMER,
                () -> new HoeItem(Tiers.WOOD, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        public static void initialize(){}
    }

    public static class Gem
    {
        public static final RegistryObject<Item> APATITE = ITEMS.register(
                Reference.Names.Prefix.GEM + Reference.Names.Material.APATITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CINNABAR = ITEMS.register(
                Reference.Names.Prefix.GEM + Reference.Names.Material.CINNABAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CITRINE = ITEMS.register(
                Reference.Names.Prefix.GEM + Reference.Names.Material.CITRINE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> PERIDOT = ITEMS.register(
                Reference.Names.Prefix.GEM + Reference.Names.Material.PERIDOT, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> RED_GARNET = ITEMS.register(
                Reference.Names.Prefix.GEM + Reference.Names.Material.RED_GARNET, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> RUBY = ITEMS.register(
                Reference.Names.Prefix.GEM + Reference.Names.Material.RUBY, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SAPPHIRE = ITEMS.register(
                Reference.Names.Prefix.GEM + Reference.Names.Material.SAPPHIRE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILKY_JEWEL = ITEMS.register(
                Reference.Names.Prefix.GEM + Reference.Names.Material.SILKY_JEWEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SOUL = ITEMS.register(
                Reference.Names.Prefix.GEM + Reference.Names.Material.SOUL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> YELLOW_GARNET = ITEMS.register(
                Reference.Names.Prefix.GEM + Reference.Names.Material.YELLOW_GARNET, () -> new Item(new Item.Properties()));

        public static void initialize() {}
    }

    public static class Shard
    {
        public static final RegistryObject<Item> DIAMOND = ITEMS.register(
                Reference.Names.Prefix.SHARD + Reference.Names.Material.DIAMOND, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> EMERALD = ITEMS.register(
                Reference.Names.Prefix.SHARD + Reference.Names.Material.EMERALD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> QUARTZ = ITEMS.register(
                Reference.Names.Prefix.SHARD + Reference.Names.Material.QUARTZ, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> RUBY = ITEMS.register(
                Reference.Names.Prefix.SHARD + Reference.Names.Material.RUBY, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SAPPHIRE = ITEMS.register(
                Reference.Names.Prefix.SHARD + Reference.Names.Material.SAPPHIRE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> URANIUM = ITEMS.register(
                Reference.Names.Prefix.SHARD + Reference.Names.Material.URANIUM, () -> new Item(new Item.Properties()));

        public static void initialize(){}
    }

    /*public static class Head
    {
        //<editor-fold desc="BRONZE">
        public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.BRONZE + Reference.Names.SWORD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.BRONZE + Reference.Names.PICKAXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.BRONZE + Reference.Names.SHOVEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.BRONZE + Reference.Names.AXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.BRONZE + Reference.Names.HOE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.BRONZE + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="CONSTANTAN">
        public static final RegistryObject<Item> CONSTANTAN_SWORD = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.CONSTANTAN + Reference.Names.SWORD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN_PICKAXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.CONSTANTAN + Reference.Names.PICKAXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN_SHOVEL = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.CONSTANTAN + Reference.Names.SHOVEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN_AXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.CONSTANTAN + Reference.Names.AXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN_HOE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.CONSTANTAN + Reference.Names.HOE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.CONSTANTAN + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="COPPER">
        public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.COPPER + Reference.Names.SWORD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.COPPER + Reference.Names.PICKAXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.COPPER + Reference.Names.SHOVEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COPPER_AXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.COPPER + Reference.Names.AXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COPPER_HOE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.COPPER + Reference.Names.HOE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COPPER_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.COPPER + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));
        //</editor-fold>

        public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.DIAMOND + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));

        //<editor-fold desc="ELECTRUM">
        public static final RegistryObject<Item> ELECTRUM_SWORD = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.ELECTRUM + Reference.Names.SWORD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM_PICKAXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.ELECTRUM + Reference.Names.PICKAXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM_SHOVEL = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.ELECTRUM + Reference.Names.SHOVEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM_AXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.ELECTRUM + Reference.Names.AXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM_HOE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.ELECTRUM + Reference.Names.HOE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.ELECTRUM + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="EMERALD">
        public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.EMERALD + Reference.Names.SWORD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.EMERALD + Reference.Names.PICKAXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.EMERALD + Reference.Names.SHOVEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.EMERALD + Reference.Names.AXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.EMERALD + Reference.Names.HOE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> EMERALD_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.EMERALD + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));
        //</editor-fold>

        public static final RegistryObject<Item> GOLD_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.GOLD + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));

        //<editor-fold desc="INVAR">
        public static final RegistryObject<Item> INVAR_SWORD = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.INVAR + Reference.Names.SWORD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR_PICKAXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.INVAR + Reference.Names.PICKAXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR_SHOVEL = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.INVAR + Reference.Names.SHOVEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR_AXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.INVAR + Reference.Names.AXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR_HOE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.INVAR + Reference.Names.HOE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.INVAR + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));
        //</editor-fold>

        public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.IRON + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));

        //<editor-fold desc="LEAD">
        public static final RegistryObject<Item> LEAD_SWORD = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.LEAD + Reference.Names.SWORD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD_PICKAXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.LEAD + Reference.Names.PICKAXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD_SHOVEL = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.LEAD + Reference.Names.SHOVEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD_AXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.LEAD + Reference.Names.AXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD_HOE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.LEAD + Reference.Names.HOE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.LEAD + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));
        //</editor-fold>

        public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.NETHERITE + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));

        //<editor-fold desc="NICKEL">
        public static final RegistryObject<Item> NICKEL_SWORD = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.NICKEL + Reference.Names.SWORD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL_PICKAXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.NICKEL + Reference.Names.PICKAXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL_SHOVEL = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.NICKEL + Reference.Names.SHOVEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL_AXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.NICKEL + Reference.Names.AXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL_HOE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.NICKEL + Reference.Names.HOE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.NICKEL + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="RUBY">
        public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.RUBY + Reference.Names.SWORD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.RUBY + Reference.Names.PICKAXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.RUBY + Reference.Names.SHOVEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> RUBY_AXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.RUBY + Reference.Names.AXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> RUBY_HOE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.RUBY + Reference.Names.HOE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> RUBY_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.RUBY + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="SAPPHIRE">
        public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.SAPPHIRE + Reference.Names.SWORD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.SAPPHIRE + Reference.Names.PICKAXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.SAPPHIRE + Reference.Names.SHOVEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.SAPPHIRE + Reference.Names.AXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.SAPPHIRE + Reference.Names.HOE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SAPPHIRE_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.SAPPHIRE + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="SILVER">
        public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.SILVER + Reference.Names.SWORD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.SILVER + Reference.Names.PICKAXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.SILVER + Reference.Names.SHOVEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER_AXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.SILVER + Reference.Names.AXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER_HOE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.SILVER + Reference.Names.HOE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.SILVER + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));
        //</editor-fold>

        public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.STONE + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));

        //<editor-fold desc="TIN">
        public static final RegistryObject<Item> TIN_SWORD = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.TIN + Reference.Names.SWORD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.TIN + Reference.Names.PICKAXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.TIN + Reference.Names.SHOVEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN_AXE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.TIN + Reference.Names.AXE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN_HOE = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.TIN + Reference.Names.HOE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.TIN + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));
        //</editor-fold>

        public static final RegistryObject<Item> WOOD_HAMMER = ITEMS.register(
                Reference.Names.HEAD + Reference.Names.WOOD + Reference.Names.HAMMER, () -> new Item(new Item.Properties()));

        public static void initialize(){}
    }*/

    public static void initialize()
    {
        Armor.initialize();
        Cast.initialize();
        Crystal.initialize();
        Dust.initialize();
        Gear.initialize();
        Ingot.initialize();
        Nugget.initialize();
        Plate.initialize();
        Raw.initialize();
        Rod.initialize();
        Gem.initialize();
        Shard.initialize();
        Tool.initialize();
        //Head.initialize();
    }
}