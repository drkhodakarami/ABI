package jiraiyah.abi.item;

import jiraiyah.abi.Reference;
import jiraiyah.abi.item.custom.*;
import jiraiyah.abi.zlib.util.ModArmorEffects;
import jiraiyah.abi.zlib.util.ModArmorMaterials;
import jiraiyah.abi.zlib.util.ModTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);

    public static class Dust
    {
        public static final RegistryObject<Item> ALUMINIUM = ITEMS.register(
                Reference.Names.DUST + Reference.Names.ALUMINIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMINIUM_BRASS = ITEMS.register(
                Reference.Names.DUST + Reference.Names.ALUMINIUM_BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMITE = ITEMS.register(
                Reference.Names.DUST + Reference.Names.ALUMITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ARDITE = ITEMS.register(
                Reference.Names.DUST + Reference.Names.ARDITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BERYLLIUM = ITEMS.register(
                Reference.Names.DUST + Reference.Names.BERYLLIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BLUTONIUM = ITEMS.register(
                Reference.Names.DUST + Reference.Names.BLUTONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BORON = ITEMS.register(
                Reference.Names.DUST + Reference.Names.BORON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRASS = ITEMS.register(
                Reference.Names.DUST + Reference.Names.BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE = ITEMS.register(
                Reference.Names.DUST + Reference.Names.BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COBALT = ITEMS.register(
                Reference.Names.DUST + Reference.Names.COBALT, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONDUCTIVE_IRON = ITEMS.register(
                Reference.Names.DUST + Reference.Names.CONDUCTIVE_IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN = ITEMS.register(
                Reference.Names.DUST + Reference.Names.CONSTANTAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COPPER = ITEMS.register(
                Reference.Names.DUST + Reference.Names.COPPER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CRUDE_STEEL = ITEMS.register(
                Reference.Names.DUST + Reference.Names.CRUDE_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CYANIDE = ITEMS.register(
                Reference.Names.DUST + Reference.Names.CYANIDE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DARK_STEEL = ITEMS.register(
                Reference.Names.DUST + Reference.Names.DARK_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DAWN_STONE = ITEMS.register(
                Reference.Names.DUST + Reference.Names.DAWN_STONE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DEMONIUM = ITEMS.register(
                Reference.Names.DUST + Reference.Names.DEMONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DRACONIUM = ITEMS.register(
                Reference.Names.DUST + Reference.Names.DRACONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRICAL_STEEL = ITEMS.register(
                Reference.Names.DUST + Reference.Names.ELECTRICAL_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM = ITEMS.register(
                Reference.Names.DUST + Reference.Names.ELECTRUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENCHANTIUM = ITEMS.register(
                Reference.Names.DUST + Reference.Names.ENCHANTIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> END_STEEL = ITEMS.register(
                Reference.Names.DUST + Reference.Names.END_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENDERITE = ITEMS.register(
                Reference.Names.DUST + Reference.Names.ENDERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENERGETIC_SILVER = ITEMS.register(
                Reference.Names.DUST + Reference.Names.ENERGETIC_SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GOLD = ITEMS.register(
                Reference.Names.DUST + Reference.Names.GOLD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GRAPHITE = ITEMS.register(
                Reference.Names.DUST + Reference.Names.GRAPHITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR = ITEMS.register(
                Reference.Names.DUST + Reference.Names.INVAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRIDIUM = ITEMS.register(
                Reference.Names.DUST + Reference.Names.IRIDIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRON = ITEMS.register(
                Reference.Names.DUST + Reference.Names.IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD = ITEMS.register(
                Reference.Names.DUST + Reference.Names.LEAD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LITHIUM = ITEMS.register(
                Reference.Names.DUST + Reference.Names.LITHIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUDICRITE = ITEMS.register(
                Reference.Names.DUST + Reference.Names.LUDICRITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MAGNESIUM = ITEMS.register(
                Reference.Names.DUST + Reference.Names.MAGNESIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MANGANESE = ITEMS.register(
                Reference.Names.DUST + Reference.Names.MANGANESE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL = ITEMS.register(
                Reference.Names.DUST + Reference.Names.NICKEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> STEEL = ITEMS.register(
                Reference.Names.DUST + Reference.Names.STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER = ITEMS.register(
                Reference.Names.DUST + Reference.Names.SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN = ITEMS.register(
                Reference.Names.DUST + Reference.Names.TIN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> YELLORIUM = ITEMS.register(
                Reference.Names.DUST + Reference.Names.YELLORIUM, () -> new Item(new Item.Properties()));


        public static void initialize(){}
    }

    public static class Gear
    {
        public static final RegistryObject<Item> ALUMINIUM = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.ALUMINIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMINIUM_BRASS = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.ALUMINIUM_BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMITE = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.ALUMITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ARDITE = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.ARDITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BERYLLIUM = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.BERYLLIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BLUTONIUM = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.BLUTONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BORON = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.BORON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRASS = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COBALT = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.COBALT, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONDUCTIVE_IRON = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.CONDUCTIVE_IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.CONSTANTAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COPPER = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.COPPER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CRUDE_STEEL = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.CRUDE_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CYANIDE = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.CYANIDE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DARK_STEEL = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.DARK_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DAWN_STONE = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.DAWN_STONE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DEMONIUM = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.DEMONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DRACONIUM = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.DRACONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRICAL_STEEL = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.ELECTRICAL_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.ELECTRUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENCHANTIUM = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.ENCHANTIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> END_STEEL = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.END_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENDERITE = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.ENDERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENERGETIC_SILVER = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.ENERGETIC_SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GOLD = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.GOLD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GRAPHITE = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.GRAPHITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.INVAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRIDIUM = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.IRIDIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRON = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.LEAD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LITHIUM = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.LITHIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUDICRITE = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.LUDICRITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MAGNESIUM = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.MAGNESIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MANGANESE = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.MANGANESE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.NICKEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> STEEL = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.TIN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> YELLORIUM = ITEMS.register(
                Reference.Names.GEAR + Reference.Names.YELLORIUM, () -> new Item(new Item.Properties()));

        public static void initialize(){}
    }

    public static class Ingot
    {
        public static final RegistryObject<Item> ALUMINIUM = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.ALUMINIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMINIUM_BRASS = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.ALUMINIUM_BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMITE = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.ALUMITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ARDITE = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.ARDITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BERYLLIUM = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.BERYLLIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BLUTONIUM = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.BLUTONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BORON = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.BORON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRASS = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COBALT = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.COBALT, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONDUCTIVE_IRON = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.CONDUCTIVE_IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.CONSTANTAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CRUDE_STEEL = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.CRUDE_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CYANIDE = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.CYANIDE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DARK_STEEL = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.DARK_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DAWN_STONE = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.DAWN_STONE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DEMONIUM = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.DEMONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DRACONIUM = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.DRACONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRICAL_STEEL = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.ELECTRICAL_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.ELECTRUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENCHANTIUM = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.ENCHANTIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> END_STEEL = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.END_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENDERITE = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.ENDERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENERGETIC_SILVER = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.ENERGETIC_SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GRAPHITE = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.GRAPHITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.INVAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRIDIUM = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.IRIDIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.LEAD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LITHIUM = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.LITHIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUDICRITE = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.LUDICRITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MAGNESIUM = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.MAGNESIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MANGANESE = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.MANGANESE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.NICKEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> STEEL = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.TIN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> YELLORIUM = ITEMS.register(
                Reference.Names.INGOT + Reference.Names.YELLORIUM, () -> new Item(new Item.Properties()));

        public static void initialize(){}
    }

    public static class Nugget
    {
        public static final RegistryObject<Item> ALUMINIUM = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.ALUMINIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMINIUM_BRASS = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.ALUMINIUM_BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMITE = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.ALUMITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ARDITE = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.ARDITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BERYLLIUM = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.BERYLLIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BLUTONIUM = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.BLUTONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BORON = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.BORON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRASS = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COBALT = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.COBALT, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONDUCTIVE_IRON = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.CONDUCTIVE_IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.CONSTANTAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COPPER = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.COPPER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CRUDE_STEEL = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.CRUDE_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CYANIDE = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.CYANIDE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DARK_STEEL = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.DARK_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DAWN_STONE = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.DAWN_STONE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DEMONIUM = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.DEMONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DRACONIUM = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.DRACONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRICAL_STEEL = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.ELECTRICAL_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.ELECTRUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENCHANTIUM = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.ENCHANTIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> END_STEEL = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.END_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENDERITE = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.ENDERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENERGETIC_SILVER = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.ENERGETIC_SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GRAPHITE = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.GRAPHITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.INVAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRIDIUM = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.IRIDIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.LEAD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LITHIUM = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.LITHIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUDICRITE = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.LUDICRITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MAGNESIUM = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.MAGNESIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.NICKEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MANGANESE = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.MANGANESE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> STEEL = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.TIN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> YELLORIUM = ITEMS.register(
                Reference.Names.NUGGET + Reference.Names.YELLORIUM, () -> new Item(new Item.Properties()));

        public static void initialize(){}
    }

    public static class Plate
    {
        public static final RegistryObject<Item> ALUMINIUM = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.ALUMINIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMINIUM_BRASS = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.ALUMINIUM_BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMITE = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.ALUMITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ARDITE = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.ARDITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BERYLLIUM = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.BERYLLIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BLUTONIUM = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.BLUTONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BORON = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.BORON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRASS = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COBALT = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.COBALT, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONDUCTIVE_IRON = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.CONDUCTIVE_IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.CONSTANTAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COPPER = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.COPPER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CRUDE_STEEL = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.CRUDE_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CYANIDE = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.CYANIDE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DARK_STEEL = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.DARK_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DAWN_STONE = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.DAWN_STONE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DEMONIUM = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.DEMONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DRACONIUM = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.DRACONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRICAL_STEEL = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.ELECTRICAL_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.ELECTRUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENCHANTIUM = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.ENCHANTIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> END_STEEL = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.END_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENDERITE = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.ENDERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENERGETIC_SILVER = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.ENERGETIC_SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GOLD = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.GOLD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GRAPHITE = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.GRAPHITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.INVAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRIDIUM = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.IRIDIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRON = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.LEAD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LITHIUM = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.LITHIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUDICRITE = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.LUDICRITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MAGNESIUM = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.MAGNESIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MANGANESE = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.MANGANESE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.NICKEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> STEEL = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.TIN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> YELLORIUM = ITEMS.register(
                Reference.Names.PLATE + Reference.Names.YELLORIUM, () -> new Item(new Item.Properties()));

        public static void initialize(){}
    }

    public static class Raw
    {
        public static final RegistryObject<Item> ALUMINIUM = ITEMS.register(
                Reference.Names.RAW + Reference.Names.ALUMINIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMINIUM_BRASS = ITEMS.register(
                Reference.Names.RAW + Reference.Names.ALUMINIUM_BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMITE = ITEMS.register(
                Reference.Names.RAW + Reference.Names.ALUMITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ARDITE = ITEMS.register(
                Reference.Names.RAW + Reference.Names.ARDITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BERYLLIUM = ITEMS.register(
                Reference.Names.RAW + Reference.Names.BERYLLIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BLUTONIUM = ITEMS.register(
                Reference.Names.RAW + Reference.Names.BLUTONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BORON = ITEMS.register(
                Reference.Names.RAW + Reference.Names.BORON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRASS = ITEMS.register(
                Reference.Names.RAW + Reference.Names.BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE = ITEMS.register(
                Reference.Names.RAW + Reference.Names.BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COBALT = ITEMS.register(
                Reference.Names.RAW + Reference.Names.COBALT, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONDUCTIVE_IRON = ITEMS.register(
                Reference.Names.RAW + Reference.Names.CONDUCTIVE_IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN = ITEMS.register(
                Reference.Names.RAW + Reference.Names.CONSTANTAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CRUDE_STEEL = ITEMS.register(
                Reference.Names.RAW + Reference.Names.CRUDE_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CYANIDE = ITEMS.register(
                Reference.Names.RAW + Reference.Names.CYANIDE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DARK_STEEL = ITEMS.register(
                Reference.Names.RAW + Reference.Names.DARK_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DAWN_STONE = ITEMS.register(
                Reference.Names.RAW + Reference.Names.DAWN_STONE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DEMONIUM = ITEMS.register(
                Reference.Names.RAW + Reference.Names.DEMONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DRACONIUM = ITEMS.register(
                Reference.Names.RAW + Reference.Names.DRACONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRICAL_STEEL = ITEMS.register(
                Reference.Names.RAW + Reference.Names.ELECTRICAL_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM = ITEMS.register(
                Reference.Names.RAW + Reference.Names.ELECTRUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENCHANTIUM = ITEMS.register(
                Reference.Names.RAW + Reference.Names.ENCHANTIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> END_STEEL = ITEMS.register(
                Reference.Names.RAW + Reference.Names.END_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENDERITE = ITEMS.register(
                Reference.Names.RAW + Reference.Names.ENDERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENERGETIC_SILVER = ITEMS.register(
                Reference.Names.RAW + Reference.Names.ENERGETIC_SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GRAPHITE = ITEMS.register(
                Reference.Names.RAW + Reference.Names.GRAPHITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR = ITEMS.register(
                Reference.Names.RAW + Reference.Names.INVAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRIDIUM = ITEMS.register(
                Reference.Names.RAW + Reference.Names.IRIDIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD = ITEMS.register(
                Reference.Names.RAW + Reference.Names.LEAD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LITHIUM = ITEMS.register(
                Reference.Names.RAW + Reference.Names.LITHIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUDICRITE = ITEMS.register(
                Reference.Names.RAW + Reference.Names.LUDICRITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MAGNESIUM = ITEMS.register(
                Reference.Names.RAW + Reference.Names.MAGNESIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MANGANESE = ITEMS.register(
                Reference.Names.RAW + Reference.Names.MANGANESE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL = ITEMS.register(
                Reference.Names.RAW + Reference.Names.NICKEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> STEEL = ITEMS.register(
                Reference.Names.RAW + Reference.Names.STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER = ITEMS.register(
                Reference.Names.RAW + Reference.Names.SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN = ITEMS.register(
                Reference.Names.RAW + Reference.Names.TIN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> YELLORIUM = ITEMS.register(
                Reference.Names.RAW + Reference.Names.YELLORIUM, () -> new Item(new Item.Properties()));

        public static void initialize()
        {}
    }

    public static class Reinforced
    {
        public static final RegistryObject<Item> ALUMINIUM = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.ALUMINIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMINIUM_BRASS = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.ALUMINIUM_BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMITE = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.ALUMITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ARDITE = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.ARDITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BERYLLIUM = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.BERYLLIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BLUTONIUM = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.BLUTONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BORON = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.BORON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRASS = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COBALT = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.COBALT, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONDUCTIVE_IRON = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.CONDUCTIVE_IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.CONSTANTAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COPPER = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.COPPER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CRUDE_STEEL = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.CRUDE_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CYANIDE = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.CYANIDE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DARK_STEEL = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.DARK_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DAWN_STONE = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.DAWN_STONE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DEMONIUM = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.DEMONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DRACONIUM = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.DRACONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRICAL_STEEL = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.ELECTRICAL_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.ELECTRUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENCHANTIUM = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.ENCHANTIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> END_STEEL = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.END_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENDERITE = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.ENDERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENERGETIC_SILVER = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.ENERGETIC_SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GOLD = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.GOLD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GRAPHITE = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.GRAPHITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.INVAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRIDIUM = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.IRIDIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRON = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.LEAD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LITHIUM = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.LITHIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUDICRITE = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.LUDICRITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MAGNESIUM = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.MAGNESIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MANGANESE = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.MANGANESE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.NICKEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> STEEL = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.TIN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> YELLORIUM = ITEMS.register(
                Reference.Names.REINFORCED + Reference.Names.YELLORIUM, () -> new Item(new Item.Properties()));

        public static void initialize(){}
    }

    public static class Rod
    {
        public static final RegistryObject<Item> ALUMINIUM = ITEMS.register(
                Reference.Names.ROD + Reference.Names.ALUMINIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMINIUM_BRASS = ITEMS.register(
                Reference.Names.ROD + Reference.Names.ALUMINIUM_BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ALUMITE = ITEMS.register(
                Reference.Names.ROD + Reference.Names.ALUMITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ARDITE = ITEMS.register(
                Reference.Names.ROD + Reference.Names.ARDITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BERYLLIUM = ITEMS.register(
                Reference.Names.ROD + Reference.Names.BERYLLIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BLUTONIUM = ITEMS.register(
                Reference.Names.ROD + Reference.Names.BLUTONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BORON = ITEMS.register(
                Reference.Names.ROD + Reference.Names.BORON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRASS = ITEMS.register(
                Reference.Names.ROD + Reference.Names.BRASS, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BRONZE = ITEMS.register(
                Reference.Names.ROD + Reference.Names.BRONZE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COBALT = ITEMS.register(
                Reference.Names.ROD + Reference.Names.COBALT, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONDUCTIVE_IRON = ITEMS.register(
                Reference.Names.ROD + Reference.Names.CONDUCTIVE_IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CONSTANTAN = ITEMS.register(
                Reference.Names.ROD + Reference.Names.CONSTANTAN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COPPER = ITEMS.register(
                Reference.Names.ROD + Reference.Names.COPPER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CRUDE_STEEL = ITEMS.register(
                Reference.Names.ROD + Reference.Names.CRUDE_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CYANIDE = ITEMS.register(
                Reference.Names.ROD + Reference.Names.CYANIDE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DARK_STEEL = ITEMS.register(
                Reference.Names.ROD + Reference.Names.DARK_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DAWN_STONE = ITEMS.register(
                Reference.Names.ROD + Reference.Names.DAWN_STONE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DEMONIUM = ITEMS.register(
                Reference.Names.ROD + Reference.Names.DEMONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DRACONIUM = ITEMS.register(
                Reference.Names.ROD + Reference.Names.DRACONIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRICAL_STEEL = ITEMS.register(
                Reference.Names.ROD + Reference.Names.ELECTRICAL_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ELECTRUM = ITEMS.register(
                Reference.Names.ROD + Reference.Names.ELECTRUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENCHANTIUM = ITEMS.register(
                Reference.Names.ROD + Reference.Names.ENCHANTIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> END_STEEL = ITEMS.register(
                Reference.Names.ROD + Reference.Names.END_STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENDERITE = ITEMS.register(
                Reference.Names.ROD + Reference.Names.ENDERITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ENERGETIC_SILVER = ITEMS.register(
                Reference.Names.ROD + Reference.Names.ENERGETIC_SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GOLD = ITEMS.register(
                Reference.Names.ROD + Reference.Names.GOLD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GRAPHITE = ITEMS.register(
                Reference.Names.ROD + Reference.Names.GRAPHITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INVAR = ITEMS.register(
                Reference.Names.ROD + Reference.Names.INVAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRIDIUM = ITEMS.register(
                Reference.Names.ROD + Reference.Names.IRIDIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRON = ITEMS.register(
                Reference.Names.ROD + Reference.Names.IRON, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LEAD = ITEMS.register(
                Reference.Names.ROD + Reference.Names.LEAD, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LITHIUM = ITEMS.register(
                Reference.Names.ROD + Reference.Names.LITHIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> LUDICRITE = ITEMS.register(
                Reference.Names.ROD + Reference.Names.LUDICRITE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MAGNESIUM = ITEMS.register(
                Reference.Names.ROD + Reference.Names.MAGNESIUM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> MANGANESE = ITEMS.register(
                Reference.Names.ROD + Reference.Names.MANGANESE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NICKEL = ITEMS.register(
                Reference.Names.ROD + Reference.Names.NICKEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> STEEL = ITEMS.register(
                Reference.Names.ROD + Reference.Names.STEEL, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SILVER = ITEMS.register(
                Reference.Names.ROD + Reference.Names.SILVER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TIN = ITEMS.register(
                Reference.Names.ROD + Reference.Names.TIN, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> YELLORIUM = ITEMS.register(
                Reference.Names.ROD + Reference.Names.YELLORIUM, () -> new Item(new Item.Properties()));

        public static void initialize(){}
    }

    public static class Tool
    {
        public static final RegistryObject<Item> AUGMENT = ITEMS.register(
                Reference.Names.TOOL + Reference.Names.AUGMENT, () -> new Augment(new Item.Properties()));

        public static final RegistryObject<Item> CUTTER = ITEMS.register(
                Reference.Names.TOOL + Reference.Names.CUTTER, () -> new Cutter(new Item.Properties()));

        public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register(
                Reference.Names.TOOL + Reference.Names.DOWSING, () -> new DowsingRod(new Item.Properties()));

        public static final RegistryObject<Item> KNIFE = ITEMS.register(
                Reference.Names.TOOL + Reference.Names.KNIFE, () -> new Knife(new Item.Properties()));

        public static final RegistryObject<Item> SPANNER = ITEMS.register(
                Reference.Names.TOOL + Reference.Names.SPANNER, () -> new Spanner(new Item.Properties()));

        public static final RegistryObject<Item> TUNER = ITEMS.register(
                Reference.Names.TOOL + Reference.Names.TUNER, () -> new Tuner(new Item.Properties()));

        public static final RegistryObject<Item> WRENCH = ITEMS.register(
                Reference.Names.TOOL + Reference.Names.WRENCH, () -> new Wrench(new Item.Properties()));

        //<editor-fold desc="BRONZE TOOLS">
        public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register(Reference.Names.BRONZE + Reference.Names.SWORD,
                () -> new SwordItem(ModTiers.BRONZE, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register(Reference.Names.BRONZE + Reference.Names.PICKAXE,
                () -> new PickaxeItem(ModTiers.BRONZE, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register(Reference.Names.BRONZE + Reference.Names.SHOVEL,
                () -> new ShovelItem(ModTiers.BRONZE, 1, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register(Reference.Names.BRONZE + Reference.Names.AXE,
                () -> new AxeItem(ModTiers.BRONZE, 6, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register(Reference.Names.BRONZE + Reference.Names.HOE,
                () -> new HoeItem(ModTiers.BRONZE, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> BRONZE_HAMMER = ITEMS.register(Reference.Names.BRONZE + Reference.Names.HAMMER,
                () -> new HoeItem(ModTiers.BRONZE, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="CONSTANTAN TOOLS">
        public static final RegistryObject<Item> CONSTANTAN_SWORD = ITEMS.register(Reference.Names.CONSTANTAN + Reference.Names.SWORD,
                () -> new SwordItem(ModTiers.CONSTANTAN, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> CONSTANTAN_PICKAXE = ITEMS.register(Reference.Names.CONSTANTAN + Reference.Names.PICKAXE,
                () -> new PickaxeItem(ModTiers.CONSTANTAN, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> CONSTANTAN_SHOVEL = ITEMS.register(Reference.Names.CONSTANTAN + Reference.Names.SHOVEL,
                () -> new ShovelItem(ModTiers.CONSTANTAN, 1, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> CONSTANTAN_AXE = ITEMS.register(Reference.Names.CONSTANTAN + Reference.Names.AXE,
                () -> new AxeItem(ModTiers.CONSTANTAN, 6, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> CONSTANTAN_HOE = ITEMS.register(Reference.Names.CONSTANTAN + Reference.Names.HOE,
                () -> new HoeItem(ModTiers.CONSTANTAN, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> CONSTANTAN_HAMMER = ITEMS.register(Reference.Names.CONSTANTAN + Reference.Names.HAMMER,
                () -> new HoeItem(ModTiers.CONSTANTAN, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="COPPER TOOLS">
        public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register(Reference.Names.COPPER + Reference.Names.SWORD,
                () -> new SwordItem(ModTiers.COPPER, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register(Reference.Names.COPPER + Reference.Names.PICKAXE,
                () -> new PickaxeItem(ModTiers.COPPER, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register(Reference.Names.COPPER + Reference.Names.SHOVEL,
                () -> new ShovelItem(ModTiers.COPPER, 1, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_AXE = ITEMS.register(Reference.Names.COPPER + Reference.Names.AXE,
                () -> new AxeItem(ModTiers.COPPER, 6, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_HOE = ITEMS.register(Reference.Names.COPPER + Reference.Names.HOE,
                () -> new HoeItem(ModTiers.COPPER, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_HAMMER = ITEMS.register(Reference.Names.COPPER + Reference.Names.HAMMER,
                () -> new HoeItem(ModTiers.COPPER, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="ELECTRUM TOOLS">
        public static final RegistryObject<Item> ELECTRUM_SWORD = ITEMS.register(Reference.Names.ELECTRUM + Reference.Names.SWORD,
                () -> new SwordItem(ModTiers.ELECTRUM, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_PICKAXE = ITEMS.register(Reference.Names.ELECTRUM + Reference.Names.PICKAXE,
                () -> new PickaxeItem(ModTiers.ELECTRUM, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_SHOVEL = ITEMS.register(Reference.Names.ELECTRUM + Reference.Names.SHOVEL,
                () -> new ShovelItem(ModTiers.ELECTRUM, 1, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_AXE = ITEMS.register(Reference.Names.ELECTRUM + Reference.Names.AXE,
                () -> new AxeItem(ModTiers.ELECTRUM, 6, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_HOE = ITEMS.register(Reference.Names.ELECTRUM + Reference.Names.HOE,
                () -> new HoeItem(ModTiers.ELECTRUM, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_HAMMER = ITEMS.register(Reference.Names.ELECTRUM + Reference.Names.HAMMER,
                () -> new HoeItem(ModTiers.ELECTRUM, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="EMERALD TOOLS">
        public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register(Reference.Names.EMERALD + Reference.Names.SWORD,
                () -> new SwordItem(ModTiers.EMERALD, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register(Reference.Names.EMERALD + Reference.Names.PICKAXE,
                () -> new PickaxeItem(ModTiers.EMERALD, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register(Reference.Names.EMERALD + Reference.Names.SHOVEL,
                () -> new ShovelItem(ModTiers.EMERALD, 1, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register(Reference.Names.EMERALD + Reference.Names.AXE,
                () -> new AxeItem(ModTiers.EMERALD, 6, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register(Reference.Names.EMERALD + Reference.Names.HOE,
                () -> new HoeItem(ModTiers.EMERALD, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_HAMMER = ITEMS.register(Reference.Names.EMERALD + Reference.Names.HAMMER,
                () -> new HoeItem(ModTiers.EMERALD, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="INVAR TOOLS">
        public static final RegistryObject<Item> INVAR_SWORD = ITEMS.register(Reference.Names.INVAR + Reference.Names.SWORD,
                () -> new SwordItem(ModTiers.INVAR, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> INVAR_PICKAXE = ITEMS.register(Reference.Names.INVAR + Reference.Names.PICKAXE,
                () -> new PickaxeItem(ModTiers.INVAR, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> INVAR_SHOVEL = ITEMS.register(Reference.Names.INVAR + Reference.Names.SHOVEL,
                () -> new ShovelItem(ModTiers.INVAR, 1, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> INVAR_AXE = ITEMS.register(Reference.Names.INVAR + Reference.Names.AXE,
                () -> new AxeItem(ModTiers.INVAR, 6, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> INVAR_HOE = ITEMS.register(Reference.Names.INVAR + Reference.Names.HOE,
                () -> new HoeItem(ModTiers.INVAR, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> INVAR_HAMMER = ITEMS.register(Reference.Names.INVAR + Reference.Names.HAMMER,
                () -> new HoeItem(ModTiers.INVAR, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="LEAD TOOLS">
        public static final RegistryObject<Item> LEAD_SWORD = ITEMS.register(Reference.Names.LEAD + Reference.Names.SWORD,
                () -> new SwordItem(ModTiers.LEAD, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> LEAD_PICKAXE = ITEMS.register(Reference.Names.LEAD + Reference.Names.PICKAXE,
                () -> new PickaxeItem(ModTiers.LEAD, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> LEAD_SHOVEL = ITEMS.register(Reference.Names.LEAD + Reference.Names.SHOVEL,
                () -> new ShovelItem(ModTiers.LEAD, 1, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> LEAD_AXE = ITEMS.register(Reference.Names.LEAD + Reference.Names.AXE,
                () -> new AxeItem(ModTiers.LEAD, 6, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> LEAD_HOE = ITEMS.register(Reference.Names.LEAD + Reference.Names.HOE,
                () -> new HoeItem(ModTiers.LEAD, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> LEAD_HAMMER = ITEMS.register(Reference.Names.LEAD + Reference.Names.HAMMER,
                () -> new HoeItem(ModTiers.LEAD, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="NICKEL TOOLS">
        public static final RegistryObject<Item> NICKEL_SWORD = ITEMS.register(Reference.Names.NICKEL + Reference.Names.SWORD,
                () -> new SwordItem(ModTiers.NICKEL, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_PICKAXE = ITEMS.register(Reference.Names.NICKEL + Reference.Names.PICKAXE,
                () -> new PickaxeItem(ModTiers.NICKEL, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_SHOVEL = ITEMS.register(Reference.Names.NICKEL + Reference.Names.SHOVEL,
                () -> new ShovelItem(ModTiers.NICKEL, 1, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_AXE = ITEMS.register(Reference.Names.NICKEL + Reference.Names.AXE,
                () -> new AxeItem(ModTiers.NICKEL, 6, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_HOE = ITEMS.register(Reference.Names.NICKEL + Reference.Names.HOE,
                () -> new HoeItem(ModTiers.NICKEL, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_HAMMER = ITEMS.register(Reference.Names.NICKEL + Reference.Names.HAMMER,
                () -> new HoeItem(ModTiers.NICKEL, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="RUBY TOOLS">
        public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register(Reference.Names.RUBY + Reference.Names.SWORD,
                () -> new SwordItem(ModTiers.RUBY, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register(Reference.Names.RUBY + Reference.Names.PICKAXE,
                () -> new PickaxeItem(ModTiers.RUBY, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register(Reference.Names.RUBY + Reference.Names.SHOVEL,
                () -> new ShovelItem(ModTiers.RUBY, 1, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> RUBY_AXE = ITEMS.register(Reference.Names.RUBY + Reference.Names.AXE,
                () -> new AxeItem(ModTiers.RUBY, 6, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> RUBY_HOE = ITEMS.register(Reference.Names.RUBY + Reference.Names.HOE,
                () -> new HoeItem(ModTiers.RUBY, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> RUBY_HAMMER = ITEMS.register(Reference.Names.RUBY + Reference.Names.HAMMER,
                () -> new HoeItem(ModTiers.RUBY, 0, 0.0F, new Item.Properties()));

        public static final RegistryObject<Item> RUBY_BOW = ITEMS.register(Reference.Names.RUBY + Reference.Names.BOW,
                () -> new RubyBow(new Item.Properties().durability(500)));
        //</editor-fold>

        //<editor-fold desc="SAPPHIRE TOOLS">
        public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register(Reference.Names.SAPPHIRE + Reference.Names.SWORD,
                () -> new SwordItem(ModTiers.SAPPHIRE, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register(Reference.Names.SAPPHIRE + Reference.Names.PICKAXE,
                () -> new PickaxeItem(ModTiers.SAPPHIRE, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register(Reference.Names.SAPPHIRE + Reference.Names.SHOVEL,
                () -> new ShovelItem(ModTiers.SAPPHIRE, 1, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register(Reference.Names.SAPPHIRE + Reference.Names.AXE,
                () -> new AxeItem(ModTiers.SAPPHIRE, 6, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register(Reference.Names.SAPPHIRE + Reference.Names.HOE,
                () -> new HoeItem(ModTiers.SAPPHIRE, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_HAMMER = ITEMS.register(Reference.Names.SAPPHIRE + Reference.Names.HAMMER,
                () -> new HoeItem(ModTiers.SAPPHIRE, 0, 0.0F, new Item.Properties()));

        public static final RegistryObject<Item> SAPPHIRE_BOW = ITEMS.register(Reference.Names.SAPPHIRE + Reference.Names.BOW,
                () -> new SapphireBow(new Item.Properties().durability(500)));
        //</editor-fold>

        //<editor-fold desc="SILVER TOOLS">
        public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register(Reference.Names.SILVER + Reference.Names.SWORD,
                () -> new SwordItem(ModTiers.SILVER, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register(Reference.Names.SILVER + Reference.Names.PICKAXE,
                () -> new PickaxeItem(ModTiers.SILVER, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register(Reference.Names.SILVER + Reference.Names.SHOVEL,
                () -> new ShovelItem(ModTiers.SILVER, 1, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> SILVER_AXE = ITEMS.register(Reference.Names.SILVER + Reference.Names.AXE,
                () -> new AxeItem(ModTiers.SILVER, 6, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> SILVER_HOE = ITEMS.register(Reference.Names.SILVER + Reference.Names.HOE,
                () -> new HoeItem(ModTiers.SILVER, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> SILVER_HAMMER = ITEMS.register(Reference.Names.SILVER + Reference.Names.HAMMER,
                () -> new HoeItem(ModTiers.SILVER, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="TIN TOOLS">
        public static final RegistryObject<Item> TIN_SWORD = ITEMS.register(Reference.Names.TIN + Reference.Names.SWORD,
                () -> new SwordItem(ModTiers.TIN, 3, -2.4F, new Item.Properties()));
        public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register(Reference.Names.TIN + Reference.Names.PICKAXE,
                () -> new PickaxeItem(ModTiers.TIN, 1, -2.8F, new Item.Properties()));
        public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register(Reference.Names.TIN + Reference.Names.SHOVEL,
                () -> new ShovelItem(ModTiers.TIN, 1, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> TIN_AXE = ITEMS.register(Reference.Names.TIN + Reference.Names.AXE,
                () -> new AxeItem(ModTiers.TIN, 6, -3.0F, new Item.Properties()));
        public static final RegistryObject<Item> TIN_HOE = ITEMS.register(Reference.Names.TIN + Reference.Names.HOE,
                () -> new HoeItem(ModTiers.TIN, 0, 0.0F, new Item.Properties()));
        public static final RegistryObject<Item> TIN_HAMMER = ITEMS.register(Reference.Names.TIN + Reference.Names.HAMMER,
                () -> new HoeItem(ModTiers.TIN, 0, 0.0F, new Item.Properties()));
        //</editor-fold>

        public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register(Reference.Names.DIAMOND + Reference.Names.HAMMER,
                () -> new HoeItem(Tiers.DIAMOND, 0, 0.0F, new Item.Properties()));

        public static final RegistryObject<Item> GOLD_HAMMER = ITEMS.register(Reference.Names.GOLD + Reference.Names.HAMMER,
                () -> new HoeItem(Tiers.GOLD, 0, 0.0F, new Item.Properties()));

        public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register(Reference.Names.IRON + Reference.Names.HAMMER,
                () -> new HoeItem(Tiers.IRON, 0, 0.0F, new Item.Properties()));

        public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register(Reference.Names.NETHERITE + Reference.Names.HAMMER,
                () -> new HoeItem(Tiers.NETHERITE, 0, 0.0F, new Item.Properties()));

        public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register(Reference.Names.STONE + Reference.Names.HAMMER,
                () -> new HoeItem(Tiers.STONE, 0, 0.0F, new Item.Properties()));

        public static final RegistryObject<Item> WOOD_HAMMER = ITEMS.register(Reference.Names.WOOD + Reference.Names.HAMMER,
                () -> new HoeItem(Tiers.WOOD, 0, 0.0F, new Item.Properties()));

        public static void initialize(){}
    }

    public static class Gem
    {
        public static final RegistryObject<Item> RUBY = ITEMS.register(
                Reference.Names.GEM + Reference.Names.RUBY, () -> new Augment(new Item.Properties()));

        public static final RegistryObject<Item> RUBY_SHARD = ITEMS.register(
                Reference.Names.GEM + Reference.Names.SHARD + Reference.Names.RUBY, () -> new Augment(new Item.Properties()));

        public static final RegistryObject<Item> SAPPHIRE = ITEMS.register(
                Reference.Names.GEM + Reference.Names.SAPPHIRE, () -> new Augment(new Item.Properties()));

        public static final RegistryObject<Item> SAPPHIRE_SHARD = ITEMS.register(
                Reference.Names.GEM + Reference.Names.SHARD + Reference.Names.SAPPHIRE, () -> new Augment(new Item.Properties()));

        // SHARD ==>
        public static final RegistryObject<Item> DIAMOND_SHARD = ITEMS.register(
                Reference.Names.GEM + Reference.Names.SHARD + Reference.Names.DIAMOND, () -> new Augment(new Item.Properties()));
        // Diamond
        public static final RegistryObject<Item> QUARTZ_SHARD = ITEMS.register(
                Reference.Names.GEM + Reference.Names.SHARD + Reference.Names.QUARTZ, () -> new Augment(new Item.Properties()));
        // Quartz
        public static final RegistryObject<Item> EMERALD_SHARD = ITEMS.register(
                Reference.Names.GEM + Reference.Names.SHARD + Reference.Names.EMERALD, () -> new Augment(new Item.Properties()));
        // Emerald

        public static void initialize(){}
    }

    public static class Armor
    {
        public static final RegistryObject<Item> ENGINEER_HELMET = ITEMS.register(Reference.Names.ENGINEER + Reference.Names.HELMET,
                () -> new ModArmorEffects(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));

        //<editor-fold desc="AMETHYST">
        public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register(Reference.Names.AMETHYST + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register(Reference.Names.AMETHYST + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register(Reference.Names.AMETHYST + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register(Reference.Names.AMETHYST + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="BRONZE">
        public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register(Reference.Names.BRONZE + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register(Reference.Names.BRONZE + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register(Reference.Names.BRONZE + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register(Reference.Names.BRONZE + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="CONSTANTAN">
        public static final RegistryObject<Item> CONSTANTAN_HELMET = ITEMS.register(Reference.Names.CONSTANTAN + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.CONSTANTAN, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> CONSTANTAN_CHESTPLATE = ITEMS.register(Reference.Names.CONSTANTAN + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.CONSTANTAN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> CONSTANTAN_LEGGINGS = ITEMS.register(Reference.Names.CONSTANTAN + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.CONSTANTAN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> CONSTANTAN_BOOTS = ITEMS.register(Reference.Names.CONSTANTAN + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.CONSTANTAN, ArmorItem.Type.BOOTS, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="COPPER">
        public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register(Reference.Names.COPPER + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register(Reference.Names.COPPER + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register(Reference.Names.COPPER + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register(Reference.Names.COPPER + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="ELECTRUM">
        public static final RegistryObject<Item> ELECTRUM_HELMET = ITEMS.register(Reference.Names.ELECTRUM + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.ELECTRUM, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_CHESTPLATE = ITEMS.register(Reference.Names.ELECTRUM + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.ELECTRUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_LEGGINGS = ITEMS.register(Reference.Names.ELECTRUM + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.ELECTRUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_BOOTS = ITEMS.register(Reference.Names.ELECTRUM + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.ELECTRUM, ArmorItem.Type.BOOTS, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="EMERALD">
        public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register(Reference.Names.EMERALD + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register(Reference.Names.EMERALD + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register(Reference.Names.EMERALD + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register(Reference.Names.EMERALD + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="INVAR">
        public static final RegistryObject<Item> INVAR_HELMET = ITEMS.register(Reference.Names.INVAR + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.INVAR, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> INVAR_CHESTPLATE = ITEMS.register(Reference.Names.INVAR + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.INVAR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> INVAR_LEGGINGS = ITEMS.register(Reference.Names.INVAR + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.INVAR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> INVAR_BOOTS = ITEMS.register(Reference.Names.INVAR + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.INVAR, ArmorItem.Type.BOOTS, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="LEAD">
        public static final RegistryObject<Item> LEAD_HELMET = ITEMS.register(Reference.Names.LEAD + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.LEAD, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> LEAD_CHESTPLATE = ITEMS.register(Reference.Names.LEAD + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.LEAD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> LEAD_LEGGINGS = ITEMS.register(Reference.Names.LEAD + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.LEAD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> LEAD_BOOTS = ITEMS.register(Reference.Names.LEAD + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.LEAD, ArmorItem.Type.BOOTS, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="NICKEL">
        public static final RegistryObject<Item> NICKEL_HELMET = ITEMS.register(Reference.Names.NICKEL + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.NICKEL, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_CHESTPLATE = ITEMS.register(Reference.Names.NICKEL + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_LEGGINGS = ITEMS.register(Reference.Names.NICKEL + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_BOOTS = ITEMS.register(Reference.Names.NICKEL + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.NICKEL, ArmorItem.Type.BOOTS, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="RUBY">
        public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register(Reference.Names.RUBY + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register(Reference.Names.RUBY + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register(Reference.Names.RUBY + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register(Reference.Names.RUBY + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="SAPPHIRE">
        public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register(Reference.Names.SAPPHIRE + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register(Reference.Names.SAPPHIRE + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register(Reference.Names.SAPPHIRE + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register(Reference.Names.SAPPHIRE + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="SILVER">
        public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register(Reference.Names.SILVER + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.SILVER, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register(Reference.Names.SILVER + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register(Reference.Names.SILVER + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register(Reference.Names.SILVER + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.BOOTS, new Item.Properties()));
        //</editor-fold>

        //<editor-fold desc="TIN">
        public static final RegistryObject<Item> TIN_HELMET = ITEMS.register(Reference.Names.TIN + Reference.Names.HELMET,
                () -> new ModArmorEffects(ModArmorMaterials.TIN, ArmorItem.Type.HELMET, new Item.Properties()));
        public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register(Reference.Names.TIN + Reference.Names.CHEST_PLATE,
                () -> new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register(Reference.Names.TIN + Reference.Names.LEGGINGS,
                () -> new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register(Reference.Names.TIN + Reference.Names.BOOTS,
                () -> new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.BOOTS, new Item.Properties()));
        //</editor-fold>

        public static void initialize(){}
    }

    public static class Cast
    {
        public static final RegistryObject<Item> BLANK = ITEMS.register(
                Reference.Names.CAST + Reference.Names.CAST_BLANK, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> BLANK_REINFORCED = ITEMS.register(
                Reference.Names.CAST + Reference.Names.CAST_BLANK_REINFORCED, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GEAR = ITEMS.register(
                Reference.Names.CAST + Reference.Names.CAST_GEAR, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> GEM = ITEMS.register(
                Reference.Names.CAST + Reference.Names.CAST_GEM, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> HAMMER = ITEMS.register(
                Reference.Names.CAST + Reference.Names.CAST_HAMMER, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> HANDLE = ITEMS.register(
                Reference.Names.CAST + Reference.Names.CAST_HANDLE, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> INGOT = ITEMS.register(
                Reference.Names.CAST + Reference.Names.CAST_INGOT, () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> NUGGET = ITEMS.register(
                Reference.Names.CAST + Reference.Names.CAST_NUGGET, () -> new Item(new Item.Properties()));

        public static void initialize(){}
    }

    public static class Head
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
    }

    public static void initialize()
    {
        Dust.initialize();
        Gear.initialize();
        Ingot.initialize();
        Nugget.initialize();
        Plate.initialize();
        Raw.initialize();
        Reinforced.initialize();
        Rod.initialize();
        Gem.initialize();
        Tool.initialize();
        Armor.initialize();
        Cast.initialize();
        Head.initialize();
    }
}