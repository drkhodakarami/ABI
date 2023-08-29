package jiraiyah.abi.zlib.util;

import jiraiyah.abi.Reference;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags
{
    public static class Blocks
    {
        //public static final TagKey<Block> SAPPHIRE_ORES = forgeTag("ores/sapphire");
        //public static final TagKey<Block> RUBY_ORES = forgeTag("ores/ruby");

        //public static final TagKey<Item> DUSTS_IRON = ItemTags.create(new ResourceLocation("forge", "dusts/iron"));

        public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = tag("need_sapphire_tool");

        private static TagKey<Block> tag(String name)
        {
            return BlockTags.create(Reference.Location(name));
        }

        private static TagKey<Block> forgeTag(String name)
        {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items
    {
        //<editor-fold desc="Collective Lists">
        //public static final TagKey<Item> ARMORS = forgeTag("armors");
        public static final TagKey<Item> CRYSTALS = forgeTag("crystals");
        public static final TagKey<Item> DUSTS = forgeTag("dusts");
        public static final TagKey<Item> GEARS = forgeTag("gears");
        public static final TagKey<Item> INGOTS = forgeTag("ingots");
        public static final TagKey<Item> NUGGETS = forgeTag("nuggets");
        public static final TagKey<Item> PLATES = forgeTag("plates");
        public static final TagKey<Item> RAW_MATERIALS = forgeTag("raw_materials");
        public static final TagKey<Item> REINFORCED = forgeTag("reinforced");
        public static final TagKey<Item> RODS = forgeTag("rods");
        public static final TagKey<Item> TOOLS = forgeTag("tools");
        public static final TagKey<Item> GEMS = forgeTag("gems");
        public static final TagKey<Item> CASTS = forgeTag("casts");
        //</editor-fold>

        public static class Casts
        {
            public static final TagKey<Item> AXE = forgeTag(Reference.Tags.CASTS + Reference.Names.Cast.AXE);
            public static final TagKey<Item> BINDING = forgeTag(Reference.Tags.CASTS + Reference.Names.Cast.BINDING);
            public static final TagKey<Item> BLANK = forgeTag(Reference.Tags.CASTS + Reference.Names.Cast.BLANK);
            public static final TagKey<Item> GEAR = forgeTag(Reference.Tags.CASTS + Reference.Names.Cast.GEAR);
            public static final TagKey<Item> GEM = forgeTag(Reference.Tags.CASTS + Reference.Names.Cast.GEM);
            public static final TagKey<Item> HAMMER = forgeTag(Reference.Tags.CASTS + Reference.Names.Cast.HAMMER);
            public static final TagKey<Item> HANDLE = forgeTag(Reference.Tags.CASTS + Reference.Names.Cast.HANDLE);
            public static final TagKey<Item> HOE = forgeTag(Reference.Tags.CASTS + Reference.Names.Cast.HOE);
            public static final TagKey<Item> INGOT = forgeTag(Reference.Tags.CASTS + Reference.Names.Cast.INGOT);
            public static final TagKey<Item> NUGGET = forgeTag(Reference.Tags.CASTS + Reference.Names.Cast.NUGGET);
            public static final TagKey<Item> PICKAXE = forgeTag(Reference.Tags.CASTS + Reference.Names.Cast.PICKAXE);
            public static final TagKey<Item> PLATE = forgeTag(Reference.Tags.CASTS + Reference.Names.Cast.PLATE);
            public static final TagKey<Item> ROD = forgeTag(Reference.Tags.CASTS + Reference.Names.Cast.ROD);
            public static final TagKey<Item> SHOVEL = forgeTag(Reference.Tags.CASTS + Reference.Names.Cast.SHOVEL);
            public static final TagKey<Item> SWORD = forgeTag(Reference.Tags.CASTS + Reference.Names.Cast.SWORD);
            public static final TagKey<Item> WIRE = forgeTag(Reference.Tags.CASTS + Reference.Names.Cast.WIRE);

            public static final TagKey<Item> ALL = forgeTag("casts");
        }

        public static class Crystals
        {
            public static final TagKey<Item> COBALT = forgeTag(Reference.Tags.CRYSTAL + Reference.Names.Material.COBALT);
            public static final TagKey<Item> CYANIDE = forgeTag(Reference.Tags.CRYSTAL + Reference.Names.Material.CYANIDE);
            public static final TagKey<Item> GLOWSTONE = forgeTag(Reference.Tags.CRYSTAL + Reference.Names.Material.GLOWSTONE);
            public static final TagKey<Item> NITER = forgeTag(Reference.Tags.CRYSTAL + Reference.Names.Material.NITER);
            public static final TagKey<Item> URANIUM = forgeTag(Reference.Tags.CRYSTAL + Reference.Names.Material.URANIUM);
            public static final TagKey<Item> YELLORIUM = forgeTag(Reference.Tags.CRYSTAL + Reference.Names.Material.YELLORIUM);

            public static final TagKey<Item> ALL = forgeTag("crystals");
        }

        public static class Dusts
        {
            public static final TagKey<Item> ALUMINIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.ALUMINIUM);
            public static final TagKey<Item> ALUMINIUM_BRASS = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.ALUMINIUM_BRASS);
            public static final TagKey<Item> ALUMITE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.ALUMITE);
            public static final TagKey<Item> AMETHYST_BRONZE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.AMETHYST_BRONZE);
            public static final TagKey<Item> APATITE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.APATITE);
            public static final TagKey<Item> ARDITE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.ARDITE);
            public static final TagKey<Item> BERYLLIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.BERYLLIUM);
            public static final TagKey<Item> BLUTONIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.BLUTONIUM);
            public static final TagKey<Item> BORON = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.BORON);
            public static final TagKey<Item> BRASS = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.BRASS);
            public static final TagKey<Item> BRONZE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.BRONZE);
            public static final TagKey<Item> CHARCOAL = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.CHARCOAL);
            public static final TagKey<Item> CINNABAR = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.CINNABAR);
            public static final TagKey<Item> CITRINE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.CITRINE);
            public static final TagKey<Item> COAL = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.COAL);
            public static final TagKey<Item> COBALT = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.COBALT);
            public static final TagKey<Item> CONDUCTIVE_IRON = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.CONDUCTIVE_IRON);
            public static final TagKey<Item> CONSTANTAN = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.CONSTANTAN);
            public static final TagKey<Item> COPPER = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.COPPER);
            public static final TagKey<Item> CRUDE_STEEL = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.CRUDE_STEEL);
            public static final TagKey<Item> CYANIDE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.CYANIDE);
            public static final TagKey<Item> DARK_STEEL = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.DARK_STEEL);
            public static final TagKey<Item> DAWN_STONE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.DAWN_STONE);
            public static final TagKey<Item> DEMONIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.DEMONIUM);
            public static final TagKey<Item> DIAMOND = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.DIAMOND);
            public static final TagKey<Item> DRACONIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.DRACONIUM);
            public static final TagKey<Item> ELECTRICAL_STEEL = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.ELECTRICAL_STEEL);
            public static final TagKey<Item> ELECTRUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.ELECTRUM);
            public static final TagKey<Item> EMERALD = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.EMERALD);
            public static final TagKey<Item> ENCHANTIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.ENCHANTIUM);
            public static final TagKey<Item> END_STEEL = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.END_STEEL);
            public static final TagKey<Item> ENDERITE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.ENDERITE);
            public static final TagKey<Item> ENERGETIC_SILVER = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.ENERGETIC_SILVER);
            public static final TagKey<Item> GOLD = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.GOLD);
            public static final TagKey<Item> GRAPHITE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.GRAPHITE);
            public static final TagKey<Item> HEPATIZON = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.HEPATIZON);
            public static final TagKey<Item> INVAR = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.INVAR);
            public static final TagKey<Item> IRIDIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.IRIDIUM);
            public static final TagKey<Item> IRON = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.IRON);
            public static final TagKey<Item> LAPIS = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.LAPIS);
            public static final TagKey<Item> LEAD = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.LEAD);
            public static final TagKey<Item> LITHIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.LITHIUM);
            public static final TagKey<Item> LUDICRITE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.LUDICRITE);
            public static final TagKey<Item> LUMIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.LUMIUM);
            public static final TagKey<Item> MAGNESIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.MAGNESIUM);
            public static final TagKey<Item> MANGANESE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.MANGANESE);
            public static final TagKey<Item> MANYULLYN = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.MANYULLYN);
            public static final TagKey<Item> NETHERITE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.NETHERITE);
            public static final TagKey<Item> NICKEL = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.NICKEL);
            public static final TagKey<Item> NITER = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.NITER);
            public static final TagKey<Item> OBSIDIAN = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.OBSIDIAN);
            public static final TagKey<Item> OSMIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.OSMIUM);
            public static final TagKey<Item> PLATINUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.PLATINUM);
            public static final TagKey<Item> PRISMARINE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.PRISMARINE);
            public static final TagKey<Item> QUARTZ = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.QUARTZ);
            public static final TagKey<Item> ROSE_GOLD = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.ROSE_GOLD);
            public static final TagKey<Item> RUBY = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.RUBY);
            public static final TagKey<Item> SAPPHIRE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.SAPPHIRE);
            public static final TagKey<Item> SIGNALUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.SIGNALUM);
            public static final TagKey<Item> SILVER = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.SILVER);
            public static final TagKey<Item> SLIMESTEEL = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.SLIMESTEEL);
            public static final TagKey<Item> SOULSTEEL = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.SOULSTEEL);
            public static final TagKey<Item> STEEL = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.STEEL);
            public static final TagKey<Item> SULFUR = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.SULFUR);
            public static final TagKey<Item> TIN = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.TIN);
            public static final TagKey<Item> URANIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.URANIUM);
            public static final TagKey<Item> YELLORIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.YELLORIUM);
            public static final TagKey<Item> ZINC = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.Material.ZINC);

            public static final TagKey<Item> ALL = forgeTag("dusts");
        }

        public static class Gears
        {
            public static final TagKey<Item> ALUMINIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.ALUMINIUM);
            public static final TagKey<Item> ALUMINIUM_BRASS = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.ALUMINIUM_BRASS);
            public static final TagKey<Item> ALUMITE = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.ALUMITE);
            public static final TagKey<Item> AMETHYST_BRONZE = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.AMETHYST_BRONZE);
            public static final TagKey<Item> ARDITE = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.ARDITE);
            public static final TagKey<Item> BERYLLIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.BERYLLIUM);
            public static final TagKey<Item> BLUTONIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.BLUTONIUM);
            public static final TagKey<Item> BORON = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.BORON);
            public static final TagKey<Item> BRASS = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.BRASS);
            public static final TagKey<Item> BRONZE = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.BRONZE);
            public static final TagKey<Item> COBALT = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.COBALT);
            public static final TagKey<Item> CONDUCTIVE_IRON = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.CONDUCTIVE_IRON);
            public static final TagKey<Item> CONSTANTAN = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.CONSTANTAN);
            public static final TagKey<Item> COPPER = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.COPPER);
            public static final TagKey<Item> CRUDE_STEEL = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.CRUDE_STEEL);
            public static final TagKey<Item> CYANIDE = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.CYANIDE);
            public static final TagKey<Item> DARK_STEEL = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.DARK_STEEL);
            public static final TagKey<Item> DAWN_STONE = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.DAWN_STONE);
            public static final TagKey<Item> DEMONIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.DEMONIUM);
            public static final TagKey<Item> DIAMOND = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.DIAMOND);
            public static final TagKey<Item> DRACONIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.DRACONIUM);
            public static final TagKey<Item> ELECTRICAL_STEEL = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.ELECTRICAL_STEEL);
            public static final TagKey<Item> ELECTRUM = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.ELECTRUM);
            public static final TagKey<Item> EMERALD = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.EMERALD);
            public static final TagKey<Item> ENCHANTIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.ENCHANTIUM);
            public static final TagKey<Item> END_STEEL = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.END_STEEL);
            public static final TagKey<Item> ENDERITE = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.ENDERITE);
            public static final TagKey<Item> ENERGETIC_SILVER = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.ENERGETIC_SILVER);
            public static final TagKey<Item> GLOWSTONE = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.GLOWSTONE);
            public static final TagKey<Item> GOLD = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.GOLD);
            public static final TagKey<Item> GRAPHITE = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.GRAPHITE);
            public static final TagKey<Item> HEPATIZON = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.HEPATIZON);
            public static final TagKey<Item> INVAR = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.INVAR);
            public static final TagKey<Item> IRIDIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.IRIDIUM);
            public static final TagKey<Item> IRON = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.IRON);
            public static final TagKey<Item> LAPIS = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.LAPIS);
            public static final TagKey<Item> LEAD = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.LEAD);
            public static final TagKey<Item> LITHIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.LITHIUM);
            public static final TagKey<Item> LUDICRITE = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.LUDICRITE);
            public static final TagKey<Item> LUMIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.LUMIUM);
            public static final TagKey<Item> MAGNESIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.MAGNESIUM);
            public static final TagKey<Item> MANGANESE = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.MANGANESE);
            public static final TagKey<Item> MANYULLYN = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.MANYULLYN);
            public static final TagKey<Item> NETHERITE = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.NETHERITE);
            public static final TagKey<Item> NICKEL = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.NICKEL);
            public static final TagKey<Item> NITER = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.NITER);
            public static final TagKey<Item> OBSIDIAN = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.OBSIDIAN);
            public static final TagKey<Item> OSMIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.OSMIUM);
            public static final TagKey<Item> PLATINUM = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.PLATINUM);
            public static final TagKey<Item> PRISMARINE = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.PRISMARINE);
            public static final TagKey<Item> QUARTZ = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.QUARTZ);
            public static final TagKey<Item> ROSE_GOLD = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.ROSE_GOLD);
            public static final TagKey<Item> RUBY = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.RUBY);
            public static final TagKey<Item> SAPPHIRE = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.SAPPHIRE);
            public static final TagKey<Item> SIGNALUM = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.SIGNALUM);
            public static final TagKey<Item> SILVER = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.SILVER);
            public static final TagKey<Item> SLIMESTEEL = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.SLIMESTEEL);
            public static final TagKey<Item> SOULSTEEL = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.SOULSTEEL);
            public static final TagKey<Item> STEEL = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.STEEL);
            public static final TagKey<Item> STONE = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.STONE);
            public static final TagKey<Item> SULFUR = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.SULFUR);
            public static final TagKey<Item> TIN = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.TIN);
            public static final TagKey<Item> URANIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.URANIUM);
            public static final TagKey<Item> WOOD = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.WOOD);
            public static final TagKey<Item> YELLORIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.YELLORIUM);
            public static final TagKey<Item> ZINC = forgeTag(Reference.Tags.GEAR + Reference.Names.Material.ZINC);

            public static final TagKey<Item> ALL = forgeTag("gears");
        }

        public static class Ingots
        {
            public static final TagKey<Item> ALUMINIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.ALUMINIUM);
            public static final TagKey<Item> ALUMINIUM_BRASS = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.ALUMINIUM_BRASS);
            public static final TagKey<Item> ALUMITE = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.ALUMITE);
            public static final TagKey<Item> AMETHYST_BRONZE = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.AMETHYST_BRONZE);
            public static final TagKey<Item> ARDITE = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.ARDITE);
            public static final TagKey<Item> BERYLLIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.BERYLLIUM);
            public static final TagKey<Item> BLUTONIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.BLUTONIUM);
            public static final TagKey<Item> BORON = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.BORON);
            public static final TagKey<Item> BRASS = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.BRASS);
            public static final TagKey<Item> BRONZE = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.BRONZE);
            public static final TagKey<Item> CONDUCTIVE_IRON = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.CONDUCTIVE_IRON);
            public static final TagKey<Item> CONSTANTAN = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.CONSTANTAN);
            public static final TagKey<Item> CRUDE_STEEL = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.CRUDE_STEEL);
            public static final TagKey<Item> DARK_STEEL = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.DARK_STEEL);
            public static final TagKey<Item> DEMONIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.DEMONIUM);
            public static final TagKey<Item> DRACONIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.DRACONIUM);
            public static final TagKey<Item> ELECTRICAL_STEEL = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.ELECTRICAL_STEEL);
            public static final TagKey<Item> ELECTRUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.ELECTRUM);
            public static final TagKey<Item> ENCHANTIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.ENCHANTIUM);
            public static final TagKey<Item> END_STEEL = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.END_STEEL);
            public static final TagKey<Item> ENDERITE = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.ENDERITE);
            public static final TagKey<Item> ENERGETIC_SILVER = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.ENERGETIC_SILVER);
            public static final TagKey<Item> GLOWSTONE = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.GLOWSTONE);
            public static final TagKey<Item> HEPATIZON = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.HEPATIZON);
            public static final TagKey<Item> INVAR = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.INVAR);
            public static final TagKey<Item> IRIDIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.IRIDIUM);
            public static final TagKey<Item> LEAD = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.LEAD);
            public static final TagKey<Item> LITHIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.LITHIUM);
            public static final TagKey<Item> LUDICRITE = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.LUDICRITE);
            public static final TagKey<Item> LUMIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.LUMIUM);
            public static final TagKey<Item> MANYULLYN = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.MANYULLYN);
            public static final TagKey<Item> NICKEL = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.NICKEL);
            public static final TagKey<Item> OBSIDIAN = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.OBSIDIAN);
            public static final TagKey<Item> OSMIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.OSMIUM);
            public static final TagKey<Item> PLATINUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.PLATINUM);
            public static final TagKey<Item> ROSE_GOLD = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.ROSE_GOLD);
            public static final TagKey<Item> SIGNALUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.SIGNALUM);
            public static final TagKey<Item> SILVER = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.SILVER);
            public static final TagKey<Item> SLIMESTEEL = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.SLIMESTEEL);
            public static final TagKey<Item> SOULSTEEL = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.SOULSTEEL);
            public static final TagKey<Item> STEEL = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.STEEL);
            public static final TagKey<Item> TIN = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.TIN);
            public static final TagKey<Item> URANIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.URANIUM);
            public static final TagKey<Item> YELLORIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.YELLORIUM);
            public static final TagKey<Item> ZINC = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.Material.ZINC);

            public static final TagKey<Item> ALL = forgeTag("ingots");
        }

        public static class Nuggets
        {
            public static final TagKey<Item> ALUMINIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.ALUMINIUM);
            public static final TagKey<Item> ALUMINIUM_BRASS = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.ALUMINIUM_BRASS);
            public static final TagKey<Item> ALUMITE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.ALUMITE);
            public static final TagKey<Item> AMETHYST_BRONZE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.AMETHYST_BRONZE);
            public static final TagKey<Item> ARDITE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.ARDITE);
            public static final TagKey<Item> BERYLLIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.BERYLLIUM);
            public static final TagKey<Item> BLUTONIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.BLUTONIUM);
            public static final TagKey<Item> BORON = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.BORON);
            public static final TagKey<Item> BRASS = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.BRASS);
            public static final TagKey<Item> BRONZE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.BRONZE);
            public static final TagKey<Item> COBALT = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.COBALT);
            public static final TagKey<Item> CONDUCTIVE_IRON = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.CONDUCTIVE_IRON);
            public static final TagKey<Item> CONSTANTAN = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.CONSTANTAN);
            public static final TagKey<Item> COPPER = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.COPPER);
            public static final TagKey<Item> CRUDE_STEEL = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.CRUDE_STEEL);
            public static final TagKey<Item> CYANIDE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.CYANIDE);
            public static final TagKey<Item> DARK_STEEL = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.DARK_STEEL);
            public static final TagKey<Item> DAWN_STONE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.DAWN_STONE);
            public static final TagKey<Item> DEMONIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.DEMONIUM);
            public static final TagKey<Item> DIAMOND = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.DIAMOND);
            public static final TagKey<Item> DRACONIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.DRACONIUM);
            public static final TagKey<Item> ELECTRICAL_STEEL = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.ELECTRICAL_STEEL);
            public static final TagKey<Item> ELECTRUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.ELECTRUM);
            public static final TagKey<Item> EMERALD = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.EMERALD);
            public static final TagKey<Item> ENCHANTIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.ENCHANTIUM);
            public static final TagKey<Item> END_STEEL = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.END_STEEL);
            public static final TagKey<Item> ENDERITE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.ENDERITE);
            public static final TagKey<Item> ENERGETIC_SILVER = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.ENERGETIC_SILVER);
            public static final TagKey<Item> GLOWSTONE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.GLOWSTONE);
            public static final TagKey<Item> GRAPHITE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.GRAPHITE);
            public static final TagKey<Item> HEPATIZON = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.HEPATIZON);
            public static final TagKey<Item> INVAR = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.INVAR);
            public static final TagKey<Item> IRIDIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.IRIDIUM);
            public static final TagKey<Item> LEAD = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.LEAD);
            public static final TagKey<Item> LITHIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.LITHIUM);
            public static final TagKey<Item> LUDICRITE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.LUDICRITE);
            public static final TagKey<Item> LUMIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.LUMIUM);
            public static final TagKey<Item> MAGNESIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.MAGNESIUM);
            public static final TagKey<Item> MANGANESE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.MANGANESE);
            public static final TagKey<Item> MANYULLYN = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.MANYULLYN);
            public static final TagKey<Item> NETHERITE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.NETHERITE);
            public static final TagKey<Item> NICKEL = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.NICKEL);
            public static final TagKey<Item> NITER = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.NITER);
            public static final TagKey<Item> OBSIDIAN = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.OBSIDIAN);
            public static final TagKey<Item> OSMIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.OSMIUM);
            public static final TagKey<Item> PLATINUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.PLATINUM);
            public static final TagKey<Item> ROSE_GOLD = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.ROSE_GOLD);
            public static final TagKey<Item> SIGNALUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.SIGNALUM);
            public static final TagKey<Item> SILVER = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.SILVER);
            public static final TagKey<Item> SLIMESTEEL = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.SLIMESTEEL);
            public static final TagKey<Item> SOULSTEEL = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.SOULSTEEL);
            public static final TagKey<Item> STEEL = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.STEEL);
            public static final TagKey<Item> TIN = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.TIN);
            public static final TagKey<Item> URANIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.URANIUM);
            public static final TagKey<Item> YELLORIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.YELLORIUM);
            public static final TagKey<Item> ZINC = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.Material.ZINC);

            public static final TagKey<Item> ALL = forgeTag("nuggets");
        }

        public static class Plates
        {
            public static final TagKey<Item> ALUMINIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.ALUMINIUM);
            public static final TagKey<Item> ALUMINIUM_BRASS = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.ALUMINIUM_BRASS);
            public static final TagKey<Item> ALUMITE = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.ALUMITE);
            public static final TagKey<Item> AMETHYST_BRONZE = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.AMETHYST_BRONZE);
            public static final TagKey<Item> ARDITE = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.ARDITE);
            public static final TagKey<Item> BERYLLIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.BERYLLIUM);
            public static final TagKey<Item> BLUTONIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.BLUTONIUM);
            public static final TagKey<Item> BORON = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.BORON);
            public static final TagKey<Item> BRASS = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.BRASS);
            public static final TagKey<Item> BRONZE = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.BRONZE);
            public static final TagKey<Item> CONDUCTIVE_IRON = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.CONDUCTIVE_IRON);
            public static final TagKey<Item> CONSTANTAN = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.CONSTANTAN);
            public static final TagKey<Item> COPPER = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.COPPER);
            public static final TagKey<Item> CRUDE_STEEL = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.CRUDE_STEEL);
            public static final TagKey<Item> DARK_STEEL = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.DARK_STEEL);
            public static final TagKey<Item> DEMONIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.DEMONIUM);
            public static final TagKey<Item> DRACONIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.DRACONIUM);
            public static final TagKey<Item> ELECTRICAL_STEEL = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.ELECTRICAL_STEEL);
            public static final TagKey<Item> ELECTRUM = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.ELECTRUM);
            public static final TagKey<Item> ENCHANTIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.ENCHANTIUM);
            public static final TagKey<Item> END_STEEL = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.END_STEEL);
            public static final TagKey<Item> ENDERITE = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.ENDERITE);
            public static final TagKey<Item> ENERGETIC_SILVER = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.ENERGETIC_SILVER);
            public static final TagKey<Item> GOLD = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.GOLD);
            public static final TagKey<Item> HEPATIZON = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.HEPATIZON);
            public static final TagKey<Item> INVAR = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.INVAR);
            public static final TagKey<Item> IRIDIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.IRIDIUM);
            public static final TagKey<Item> IRON = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.IRON);
            public static final TagKey<Item> LEAD = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.LEAD);
            public static final TagKey<Item> LITHIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.LITHIUM);
            public static final TagKey<Item> LUDICRITE = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.LUDICRITE);
            public static final TagKey<Item> LUMIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.LUMIUM);
            public static final TagKey<Item> MANYULLYN = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.MANYULLYN);
            public static final TagKey<Item> NETHERITE = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.NETHERITE);
            public static final TagKey<Item> NICKEL = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.NICKEL);
            public static final TagKey<Item> OSMIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.OSMIUM);
            public static final TagKey<Item> PLATINUM = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.PLATINUM);
            public static final TagKey<Item> ROSE_GOLD = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.ROSE_GOLD);
            public static final TagKey<Item> SIGNALUM = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.SIGNALUM);
            public static final TagKey<Item> SILVER = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.SILVER);
            public static final TagKey<Item> SLIMESTEEL = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.SLIMESTEEL);
            public static final TagKey<Item> SOULSTEEL = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.SOULSTEEL);
            public static final TagKey<Item> STEEL = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.STEEL);
            public static final TagKey<Item> TIN = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.TIN);
            public static final TagKey<Item> URANIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.URANIUM);
            public static final TagKey<Item> ZINC = forgeTag(Reference.Tags.PLATE + Reference.Names.Material.ZINC);

            public static final TagKey<Item> ALL = forgeTag("plates");
        }

        public static class Raw
        {
            public static final TagKey<Item> ALUMINIUM = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.Material.ALUMINIUM);
            public static final TagKey<Item> LEAD = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.Material.LEAD);
            public static final TagKey<Item> NICKEL = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.Material.NICKEL);
            public static final TagKey<Item> OSMIUM = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.Material.OSMIUM);
            public static final TagKey<Item> PLATINUM = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.Material.PLATINUM);
            public static final TagKey<Item> SILVER = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.Material.SILVER);
            public static final TagKey<Item> TIN = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.Material.TIN);
            public static final TagKey<Item> URANIUM = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.Material.URANIUM);
            public static final TagKey<Item> ZINC = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.Material.ZINC);

            public static final TagKey<Item> ALL = forgeTag("raw_materials");
        }

        public static class Rod
        {
            public static final TagKey<Item> ALUMINIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.ALUMINIUM);
            public static final TagKey<Item> ALUMINIUM_BRASS = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.ALUMINIUM_BRASS);
            public static final TagKey<Item> ALUMITE = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.ALUMITE);
            public static final TagKey<Item> AMETHYST_BRONZE = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.AMETHYST_BRONZE);
            public static final TagKey<Item> ARDITE = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.ARDITE);
            public static final TagKey<Item> BERYLLIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.BERYLLIUM);
            public static final TagKey<Item> BLUTONIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.BLUTONIUM);
            public static final TagKey<Item> BORON = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.BORON);
            public static final TagKey<Item> BRASS = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.BRASS);
            public static final TagKey<Item> BRONZE = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.BRONZE);
            public static final TagKey<Item> COBALT = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.COBALT);
            public static final TagKey<Item> CONDUCTIVE_IRON = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.CONDUCTIVE_IRON);
            public static final TagKey<Item> CONSTANTAN = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.CONSTANTAN);
            public static final TagKey<Item> COPPER = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.COPPER);
            public static final TagKey<Item> CRUDE_STEEL = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.CRUDE_STEEL);
            public static final TagKey<Item> DARK_STEEL = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.DARK_STEEL);
            public static final TagKey<Item> DEMONIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.DEMONIUM);
            public static final TagKey<Item> DRACONIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.DRACONIUM);
            public static final TagKey<Item> ELECTRICAL_STEEL = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.ELECTRICAL_STEEL);
            public static final TagKey<Item> ELECTRUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.ELECTRUM);
            public static final TagKey<Item> ENCHANTIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.ENCHANTIUM);
            public static final TagKey<Item> END_STEEL = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.END_STEEL);
            public static final TagKey<Item> ENDERITE = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.ENDERITE);
            public static final TagKey<Item> ENERGETIC_SILVER = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.ENERGETIC_SILVER);
            public static final TagKey<Item> GLOWSTONE = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.GLOWSTONE);
            public static final TagKey<Item> GOLD = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.GOLD);
            public static final TagKey<Item> GRAPHITE = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.GRAPHITE);
            public static final TagKey<Item> HEPATIZON = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.HEPATIZON);
            public static final TagKey<Item> INVAR = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.INVAR);
            public static final TagKey<Item> IRIDIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.IRIDIUM);
            public static final TagKey<Item> IRON = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.IRON);
            public static final TagKey<Item> LEAD = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.LEAD);
            public static final TagKey<Item> LITHIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.LITHIUM);
            public static final TagKey<Item> LUDICRITE = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.LUDICRITE);
            public static final TagKey<Item> LUMIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.LUMIUM);
            public static final TagKey<Item> MAGNESIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.MAGNESIUM);
            public static final TagKey<Item> MANYULLYN = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.MANYULLYN);
            public static final TagKey<Item> NICKEL = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.NICKEL);
            public static final TagKey<Item> OBSIDIAN = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.OBSIDIAN);
            public static final TagKey<Item> OSMIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.OSMIUM);
            public static final TagKey<Item> PLATINUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.PLATINUM);
            public static final TagKey<Item> ROSE_GOLD = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.ROSE_GOLD);
            public static final TagKey<Item> SIGNALUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.SIGNALUM);
            public static final TagKey<Item> SILVER = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.SILVER);
            public static final TagKey<Item> SLIMESTEEL = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.SLIMESTEEL);
            public static final TagKey<Item> SOULSTEEL = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.SOULSTEEL);
            public static final TagKey<Item> STEEL = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.STEEL);
            public static final TagKey<Item> TIN = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.TIN);
            public static final TagKey<Item> URANIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.URANIUM);
            public static final TagKey<Item> YELLORIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.YELLORIUM);
            public static final TagKey<Item> ZINC = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.Material.ZINC);

            public static final TagKey<Item> ALL = forgeTag("rods");
        }

        public static class Head
        {
            //<editor-fold desc="BRONZE">
            public static final TagKey<Item> BRONZE = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.BRONZE);
            public static final TagKey<Item> BRONZE_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.BRONZE + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> BRONZE_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.BRONZE + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> BRONZE_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.BRONZE + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> BRONZE_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.BRONZE + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> BRONZE_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.BRONZE + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> BRONZE_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.BRONZE + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="CITRINE">
            public static final TagKey<Item> CITRINE = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.CITRINE);
            public static final TagKey<Item> CITRINE_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.CITRINE + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> CITRINE_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.CITRINE + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> CITRINE_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.CITRINE + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> CITRINE_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.CITRINE + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> CITRINE_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.CITRINE + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> CITRINE_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.CITRINE + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="CONSTANTAN">
            public static final TagKey<Item> CONSTANTAN = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.CONSTANTAN);
            public static final TagKey<Item> CONSTANTAN_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.CONSTANTAN + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> CONSTANTAN_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.CONSTANTAN + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> CONSTANTAN_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.CONSTANTAN + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> CONSTANTAN_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.CONSTANTAN + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> CONSTANTAN_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.CONSTANTAN + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> CONSTANTAN_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.CONSTANTAN + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="COPPER">
            public static final TagKey<Item> COPPER = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.COPPER);
            public static final TagKey<Item> COPPER_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.COPPER + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> COPPER_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.COPPER + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> COPPER_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.COPPER + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> COPPER_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.COPPER + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> COPPER_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.COPPER + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> COPPER_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.COPPER + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="DIAMOND">
            public static final TagKey<Item> DIAMOND = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.DIAMOND);
            public static final TagKey<Item> DIAMOND_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.DIAMOND + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> DIAMOND_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.DIAMOND + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> DIAMOND_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.DIAMOND + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> DIAMOND_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.DIAMOND + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> DIAMOND_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.DIAMOND + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> DIAMOND_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.DIAMOND + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="ELECTRUM">
            public static final TagKey<Item> ELECTRUM = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.ELECTRUM);
            public static final TagKey<Item> ELECTRUM_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.ELECTRUM + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> ELECTRUM_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.ELECTRUM + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> ELECTRUM_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.ELECTRUM + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> ELECTRUM_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.ELECTRUM + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> ELECTRUM_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.ELECTRUM + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> ELECTRUM_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.ELECTRUM + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="EMERALD">
            public static final TagKey<Item> EMERALD = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.EMERALD);
            public static final TagKey<Item> EMERALD_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.EMERALD + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> EMERALD_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.EMERALD + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> EMERALD_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.EMERALD + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> EMERALD_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.EMERALD + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> EMERALD_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.EMERALD + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> EMERALD_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.EMERALD + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="ENDERITE">
            public static final TagKey<Item> ENDERITE = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.ENDERITE);
            public static final TagKey<Item> ENDERITE_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.ENDERITE + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> ENDERITE_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.ENDERITE + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> ENDERITE_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.ENDERITE + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> ENDERITE_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.ENDERITE + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> ENDERITE_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.ENDERITE + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> ENDERITE_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.ENDERITE + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="GOLD">
            public static final TagKey<Item> GOLD = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.GOLD);
            public static final TagKey<Item> GOLD_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.GOLD + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> GOLD_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.GOLD + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> GOLD_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.GOLD + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> GOLD_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.GOLD + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> GOLD_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.GOLD + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> GOLD_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.GOLD + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="INVAR">
            public static final TagKey<Item> INVAR = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.INVAR);
            public static final TagKey<Item> INVAR_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.INVAR + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> INVAR_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.INVAR + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> INVAR_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.INVAR + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> INVAR_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.INVAR + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> INVAR_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.INVAR + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> INVAR_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.INVAR + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="IRON">
            public static final TagKey<Item> IRON = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.IRON);
            public static final TagKey<Item> IRON_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.IRON + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> IRON_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.IRON + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> IRON_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.IRON + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> IRON_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.IRON + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> IRON_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.IRON + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> IRON_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.IRON + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="LEAD">
            public static final TagKey<Item> LEAD = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.LEAD);
            public static final TagKey<Item> LEAD_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.LEAD + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> LEAD_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.LEAD + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> LEAD_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.LEAD + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> LEAD_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.LEAD + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> LEAD_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.LEAD + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> LEAD_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.LEAD + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="NETHERITE">
            public static final TagKey<Item> NETHERITE = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.NETHERITE);
            public static final TagKey<Item> NETHERITE_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.NETHERITE + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> NETHERITE_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.NETHERITE + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> NETHERITE_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.NETHERITE + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> NETHERITE_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.NETHERITE + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> NETHERITE_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.NETHERITE + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> NETHERITE_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.NETHERITE + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="NICKEL">
            public static final TagKey<Item> NICKEL = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.NICKEL);
            public static final TagKey<Item> NICKEL_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.NICKEL + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> NICKEL_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.NICKEL + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> NICKEL_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.NICKEL + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> NICKEL_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.NICKEL + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> NICKEL_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.NICKEL + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> NICKEL_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.NICKEL + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="RUBY">
            public static final TagKey<Item> RUBY = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.RUBY);
            public static final TagKey<Item> RUBY_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.RUBY + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> RUBY_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.RUBY + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> RUBY_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.RUBY + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> RUBY_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.RUBY + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> RUBY_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.RUBY + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> RUBY_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.RUBY + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="SAPPHIRE">
            public static final TagKey<Item> SAPPHIRE = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.SAPPHIRE);
            public static final TagKey<Item> SAPPHIRE_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.SAPPHIRE + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> SAPPHIRE_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.SAPPHIRE + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> SAPPHIRE_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.SAPPHIRE + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> SAPPHIRE_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.SAPPHIRE + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> SAPPHIRE_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.SAPPHIRE + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> SAPPHIRE_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.SAPPHIRE + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="SILVER">
            public static final TagKey<Item> SILVER = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.SILVER);
            public static final TagKey<Item> SILVER_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.SILVER + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> SILVER_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.SILVER + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> SILVER_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.SILVER + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> SILVER_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.SILVER + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> SILVER_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.SILVER + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> SILVER_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.SILVER + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="STONE">
            public static final TagKey<Item> STONE = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.STONE);
            public static final TagKey<Item> STONE_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.STONE + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> STONE_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.STONE + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> STONE_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.STONE + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> STONE_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.STONE + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> STONE_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.STONE + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> STONE_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.STONE + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="TIN">
            public static final TagKey<Item> TIN = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.TIN);
            public static final TagKey<Item> TIN_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.TIN + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> TIN_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.TIN + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> TIN_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.TIN + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> TIN_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.TIN + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> TIN_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.TIN + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> TIN_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.TIN + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            //<editor-fold desc="WOOD">
            public static final TagKey<Item> WOOD = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + Reference.Names.Material.WOOD);
            public static final TagKey<Item> WOOD_AXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.WOOD + Reference.Names.Suffix.AXE);
            public static final TagKey<Item> WOOD_HAMMER =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.WOOD + Reference.Names.Suffix.HAMMER);
            public static final TagKey<Item> WOOD_HOE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.WOOD + Reference.Names.Suffix.HOE);
            public static final TagKey<Item> WOOD_PICKAXE =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.WOOD + Reference.Names.Suffix.PICKAXE);
            public static final TagKey<Item> WOOD_SHOVEL =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.WOOD + Reference.Names.Suffix.SHOVEL);
            public static final TagKey<Item> WOOD_SWORD =
                    forgeTag(Reference.Tags.Forge.Items.HEADS + Reference.Names.Material.WOOD + Reference.Names.Suffix.SWORD);
            //</editor-fold>

            public static final TagKey<Item> ALL_HEADS = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + "all");
            public static final TagKey<Item> ALL_AXE = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + "axe");
            public static final TagKey<Item> ALL_HAMMER = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + "hammer");
            public static final TagKey<Item> ALL_HOE = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + "hoe");
            public static final TagKey<Item> ALL_PICKAXE = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + "pickaxe");
            public static final TagKey<Item> ALL_SHOVEL = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + "shovel");
            public static final TagKey<Item> ALL_SWORD = forgeTag(Reference.Tags.Forge.Items.HEADS_PREFIX + "sword");
        }

        public static class Gems
        {
            public static final TagKey<Item> APATITE = forgeTag(Reference.Tags.Forge.Items.GEMS + Reference.Names.Material.APATITE);
            public static final TagKey<Item> CINNABAR = forgeTag(Reference.Tags.Forge.Items.GEMS + Reference.Names.Material.CINNABAR);
            public static final TagKey<Item> CITRINE = forgeTag(Reference.Tags.Forge.Items.GEMS + Reference.Names.Material.CITRINE);
            public static final TagKey<Item> PERIDOT = forgeTag(Reference.Tags.Forge.Items.GEMS + Reference.Names.Material.PERIDOT);
            public static final TagKey<Item> RED_GARNET = forgeTag(Reference.Tags.Forge.Items.GEMS + Reference.Names.Material.RED_GARNET);
            public static final TagKey<Item> RUBY = forgeTag(Reference.Tags.Forge.Items.GEMS + Reference.Names.Material.RUBY);
            public static final TagKey<Item> SAPPHIRE = forgeTag(Reference.Tags.Forge.Items.GEMS + Reference.Names.Material.SAPPHIRE);
            public static final TagKey<Item> SILKY_JEWEL = forgeTag(Reference.Tags.Forge.Items.GEMS + Reference.Names.Material.SILKY_JEWEL);
            public static final TagKey<Item> SOUL = forgeTag(Reference.Tags.Forge.Items.GEMS + Reference.Names.Material.SOUL);
            public static final TagKey<Item> YELLOW_GARNET = forgeTag(Reference.Tags.Forge.Items.GEMS + Reference.Names.Material.YELLOW_GARNET);

            public static final TagKey<Item> ALL = forgeTag("gems");
        }

        public static class Shards
        {
            public static final TagKey<Item> DIAMOND = forgeTag(Reference.Tags.Forge.Items.SHARDS + Reference.Names.Material.DIAMOND);
            public static final TagKey<Item> EMERALD = forgeTag(Reference.Tags.Forge.Items.SHARDS + Reference.Names.Material.EMERALD);
            public static final TagKey<Item> QUARTZ = forgeTag(Reference.Tags.Forge.Items.SHARDS + Reference.Names.Material.QUARTZ);
            public static final TagKey<Item> RUBY = forgeTag(Reference.Tags.Forge.Items.SHARDS + Reference.Names.Material.RUBY);
            public static final TagKey<Item> SAPPHIRE = forgeTag(Reference.Tags.Forge.Items.SHARDS + Reference.Names.Material.SAPPHIRE);
            public static final TagKey<Item> URANIUM = forgeTag(Reference.Tags.Forge.Items.SHARDS + Reference.Names.Material.URANIUM);

            public static final TagKey<Item> ALL = forgeTag("shards");
        }

        //<editor-fold desc="HELPER METHODS">
        private static TagKey<Item> tag(String name)
        {
            return ItemTags.create(Reference.Location(name));
        }

        private static TagKey<Item> forgeTag(String name)
        {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
        //</editor-fold>
    }
}