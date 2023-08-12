package jiraiyah.abi.item;

import jiraiyah.abi.Reference;
import net.minecraft.world.item.Item;
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

        public static void initialize(){}
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

        public static void initialize(){}
    }

    public static class Tool
    {
        public static final RegistryObject<Item> SPANNER = ITEMS.register(
                Reference.Names.TOOL + Reference.Names.SPANNER, () -> new Item(new Item.Properties()));

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
        Tool.initialize();
    }
}