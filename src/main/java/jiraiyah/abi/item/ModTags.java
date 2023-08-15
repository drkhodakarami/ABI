package jiraiyah.abi.item;

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
        public static final TagKey<Item> ARMORS = forgeTag("armors");
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

        public static class Dusts
        {
            public static final TagKey<Item> ALUMINIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.ALUMINIUM);
            public static final TagKey<Item> ALUMINIUM_BRASS = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.ALUMINIUM_BRASS);
            public static final TagKey<Item> ALUMITE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.ALUMITE);
            public static final TagKey<Item> ARDITE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.ARDITE);
            public static final TagKey<Item> BERYLLIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.BERYLLIUM);
            public static final TagKey<Item> BLUTONIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.BLUTONIUM);
            public static final TagKey<Item> BORON = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.BORON);
            public static final TagKey<Item> BRASS = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.BRASS);
            public static final TagKey<Item> BRONZE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.BRONZE);
            public static final TagKey<Item> COBALT = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.COBALT);
            public static final TagKey<Item> CONDUCTIVE_IRON = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.CONDUCTIVE_IRON);
            public static final TagKey<Item> CONSTANTAN = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.CONSTANTAN);
            public static final TagKey<Item> COPPER = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.COPPER);
            public static final TagKey<Item> CRUDE_STEEL = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.CRUDE_STEEL);
            public static final TagKey<Item> CYANIDE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.CYANIDE);
            public static final TagKey<Item> DARK_STEEL = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.DARK_STEEL);
            public static final TagKey<Item> DAWN_STONE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.DAWN_STONE);
            public static final TagKey<Item> DEMONIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.DEMONIUM);
            public static final TagKey<Item> DRACONIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.DRACONIUM);
            public static final TagKey<Item> ELECTRICAL_STEEL = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.ELECTRICAL_STEEL);
            public static final TagKey<Item> ELECTRUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.ELECTRUM);
            public static final TagKey<Item> ENCHANTIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.ENCHANTIUM);
            public static final TagKey<Item> END_STEEL = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.END_STEEL);
            public static final TagKey<Item> ENDERITE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.ENDERITE);
            public static final TagKey<Item> ENERGETIC_SILVER = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.ENERGETIC_SILVER);
            public static final TagKey<Item> GOLD = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.GOLD);
            public static final TagKey<Item> GRAPHITE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.GRAPHITE);
            public static final TagKey<Item> INVAR = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.INVAR);
            public static final TagKey<Item> IRIDIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.IRIDIUM);
            public static final TagKey<Item> IRON = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.IRON);
            public static final TagKey<Item> LEAD = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.LEAD);
            public static final TagKey<Item> LITHIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.LITHIUM);
            public static final TagKey<Item> LUDICRITE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.LUDICRITE);
            public static final TagKey<Item> MAGNESIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.MAGNESIUM);
            public static final TagKey<Item> MANGANESE = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.MANGANESE);
            public static final TagKey<Item> STEEL = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.STEEL);
            public static final TagKey<Item> TIN = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.TIN);
            public static final TagKey<Item> YELLORIUM = forgeTag(Reference.Tags.Forge.Items.DUST + Reference.Names.YELLORIUM);
        }

        public static class Gears
        {
            public static final TagKey<Item> ALUMINIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.ALUMINIUM);
            public static final TagKey<Item> ALUMINIUM_BRASS = forgeTag(Reference.Tags.GEAR + Reference.Names.ALUMINIUM_BRASS);
            public static final TagKey<Item> ALUMITE = forgeTag(Reference.Tags.GEAR + Reference.Names.ALUMITE);
            public static final TagKey<Item> ARDITE = forgeTag(Reference.Tags.GEAR + Reference.Names.ARDITE);
            public static final TagKey<Item> BERYLLIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.BERYLLIUM);
            public static final TagKey<Item> BLUTONIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.BLUTONIUM);
            public static final TagKey<Item> BORON = forgeTag(Reference.Tags.GEAR + Reference.Names.BORON);
            public static final TagKey<Item> BRASS = forgeTag(Reference.Tags.GEAR + Reference.Names.BRASS);
            public static final TagKey<Item> BRONZE = forgeTag(Reference.Tags.GEAR + Reference.Names.BRONZE);
            public static final TagKey<Item> COBALT = forgeTag(Reference.Tags.GEAR + Reference.Names.COBALT);
            public static final TagKey<Item> CONDUCTIVE_IRON = forgeTag(Reference.Tags.GEAR + Reference.Names.CONDUCTIVE_IRON);
            public static final TagKey<Item> CONSTANTAN = forgeTag(Reference.Tags.GEAR + Reference.Names.CONSTANTAN);
            public static final TagKey<Item> COPPER = forgeTag(Reference.Tags.GEAR + Reference.Names.COPPER);
            public static final TagKey<Item> CRUDE_STEEL = forgeTag(Reference.Tags.GEAR + Reference.Names.CRUDE_STEEL);
            public static final TagKey<Item> CYANIDE = forgeTag(Reference.Tags.GEAR + Reference.Names.CYANIDE);
            public static final TagKey<Item> DARK_STEEL = forgeTag(Reference.Tags.GEAR + Reference.Names.DARK_STEEL);
            public static final TagKey<Item> DAWN_STONE = forgeTag(Reference.Tags.GEAR + Reference.Names.DAWN_STONE);
            public static final TagKey<Item> DEMONIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.DEMONIUM);
            public static final TagKey<Item> DRACONIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.DRACONIUM);
            public static final TagKey<Item> ELECTRICAL_STEEL = forgeTag(Reference.Tags.GEAR + Reference.Names.ELECTRICAL_STEEL);
            public static final TagKey<Item> ELECTRUM = forgeTag(Reference.Tags.GEAR + Reference.Names.ELECTRUM);
            public static final TagKey<Item> ENCHANTIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.ENCHANTIUM);
            public static final TagKey<Item> END_STEEL = forgeTag(Reference.Tags.GEAR + Reference.Names.END_STEEL);
            public static final TagKey<Item> ENDERITE = forgeTag(Reference.Tags.GEAR + Reference.Names.ENDERITE);
            public static final TagKey<Item> ENERGETIC_SILVER = forgeTag(Reference.Tags.GEAR + Reference.Names.ENERGETIC_SILVER);
            public static final TagKey<Item> GOLD = forgeTag(Reference.Tags.GEAR + Reference.Names.GOLD);
            public static final TagKey<Item> GRAPHITE = forgeTag(Reference.Tags.GEAR + Reference.Names.GRAPHITE);
            public static final TagKey<Item> INVAR = forgeTag(Reference.Tags.GEAR + Reference.Names.INVAR);
            public static final TagKey<Item> IRIDIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.IRIDIUM);
            public static final TagKey<Item> IRON = forgeTag(Reference.Tags.GEAR + Reference.Names.IRON);
            public static final TagKey<Item> LEAD = forgeTag(Reference.Tags.GEAR + Reference.Names.LEAD);
            public static final TagKey<Item> LITHIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.LITHIUM);
            public static final TagKey<Item> LUDICRITE = forgeTag(Reference.Tags.GEAR + Reference.Names.LUDICRITE);
            public static final TagKey<Item> MAGNESIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.MAGNESIUM);
            public static final TagKey<Item> MANGANESE = forgeTag(Reference.Tags.GEAR + Reference.Names.MANGANESE);
            public static final TagKey<Item> STEEL = forgeTag(Reference.Tags.GEAR + Reference.Names.STEEL);
            public static final TagKey<Item> TIN = forgeTag(Reference.Tags.GEAR + Reference.Names.TIN);
            public static final TagKey<Item> YELLORIUM = forgeTag(Reference.Tags.GEAR + Reference.Names.YELLORIUM);
        }

        public static class Ingots
        {
            public static final TagKey<Item> ALUMINIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.ALUMINIUM);
            public static final TagKey<Item> ALUMINIUM_BRASS = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.ALUMINIUM_BRASS);
            public static final TagKey<Item> ALUMITE = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.ALUMITE);
            public static final TagKey<Item> ARDITE = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.ARDITE);
            public static final TagKey<Item> BERYLLIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.BERYLLIUM);
            public static final TagKey<Item> BLUTONIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.BLUTONIUM);
            public static final TagKey<Item> BORON = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.BORON);
            public static final TagKey<Item> BRASS = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.BRASS);
            public static final TagKey<Item> BRONZE = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.BRONZE);
            public static final TagKey<Item> COBALT = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.COBALT);
            public static final TagKey<Item> CONDUCTIVE_IRON = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.CONDUCTIVE_IRON);
            public static final TagKey<Item> CONSTANTAN = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.CONSTANTAN);
            public static final TagKey<Item> CRUDE_STEEL = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.CRUDE_STEEL);
            public static final TagKey<Item> CYANIDE = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.CYANIDE);
            public static final TagKey<Item> DARK_STEEL = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.DARK_STEEL);
            public static final TagKey<Item> DAWN_STONE = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.DAWN_STONE);
            public static final TagKey<Item> DEMONIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.DEMONIUM);
            public static final TagKey<Item> DRACONIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.DRACONIUM);
            public static final TagKey<Item> ELECTRICAL_STEEL = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.ELECTRICAL_STEEL);
            public static final TagKey<Item> ELECTRUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.ELECTRUM);
            public static final TagKey<Item> ENCHANTIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.ENCHANTIUM);
            public static final TagKey<Item> END_STEEL = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.END_STEEL);
            public static final TagKey<Item> ENDERITE = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.ENDERITE);
            public static final TagKey<Item> ENERGETIC_SILVER = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.ENERGETIC_SILVER);
            public static final TagKey<Item> GRAPHITE = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.GRAPHITE);
            public static final TagKey<Item> INVAR = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.INVAR);
            public static final TagKey<Item> IRIDIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.IRIDIUM);
            public static final TagKey<Item> LEAD = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.LEAD);
            public static final TagKey<Item> LITHIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.LITHIUM);
            public static final TagKey<Item> LUDICRITE = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.LUDICRITE);
            public static final TagKey<Item> MAGNESIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.MAGNESIUM);
            public static final TagKey<Item> MANGANESE = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.MANGANESE);
            public static final TagKey<Item> STEEL = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.STEEL);
            public static final TagKey<Item> TIN = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.TIN);
            public static final TagKey<Item> YELLORIUM = forgeTag(Reference.Tags.Forge.Items.INGOTS + Reference.Names.YELLORIUM);
        }

        public static class Nuggets
        {
            public static final TagKey<Item> ALUMINIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.ALUMINIUM);
            public static final TagKey<Item> ALUMINIUM_BRASS = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.ALUMINIUM_BRASS);
            public static final TagKey<Item> ALUMITE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.ALUMITE);
            public static final TagKey<Item> ARDITE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.ARDITE);
            public static final TagKey<Item> BERYLLIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.BERYLLIUM);
            public static final TagKey<Item> BLUTONIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.BLUTONIUM);
            public static final TagKey<Item> BORON = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.BORON);
            public static final TagKey<Item> BRASS = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.BRASS);
            public static final TagKey<Item> BRONZE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.BRONZE);
            public static final TagKey<Item> COBALT = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.COBALT);
            public static final TagKey<Item> CONDUCTIVE_IRON = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.CONDUCTIVE_IRON);
            public static final TagKey<Item> CONSTANTAN = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.CONSTANTAN);
            public static final TagKey<Item> COPPER = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.COPPER);
            public static final TagKey<Item> CRUDE_STEEL = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.CRUDE_STEEL);
            public static final TagKey<Item> CYANIDE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.CYANIDE);
            public static final TagKey<Item> DARK_STEEL = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.DARK_STEEL);
            public static final TagKey<Item> DAWN_STONE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.DAWN_STONE);
            public static final TagKey<Item> DEMONIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.DEMONIUM);
            public static final TagKey<Item> DRACONIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.DRACONIUM);
            public static final TagKey<Item> ELECTRICAL_STEEL = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.ELECTRICAL_STEEL);
            public static final TagKey<Item> ELECTRUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.ELECTRUM);
            public static final TagKey<Item> ENCHANTIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.ENCHANTIUM);
            public static final TagKey<Item> END_STEEL = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.END_STEEL);
            public static final TagKey<Item> ENDERITE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.ENDERITE);
            public static final TagKey<Item> ENERGETIC_SILVER = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.ENERGETIC_SILVER);
            public static final TagKey<Item> GRAPHITE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.GRAPHITE);
            public static final TagKey<Item> INVAR = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.INVAR);
            public static final TagKey<Item> IRIDIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.IRIDIUM);
            public static final TagKey<Item> LEAD = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.LEAD);
            public static final TagKey<Item> LITHIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.LITHIUM);
            public static final TagKey<Item> LUDICRITE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.LUDICRITE);
            public static final TagKey<Item> MAGNESIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.MAGNESIUM);
            public static final TagKey<Item> MANGANESE = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.MANGANESE);
            public static final TagKey<Item> STEEL = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.STEEL);
            public static final TagKey<Item> TIN = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.TIN);
            public static final TagKey<Item> YELLORIUM = forgeTag(Reference.Tags.Forge.Items.NUGGETS + Reference.Names.YELLORIUM);
        }

        public static class Plates
        {
            public static final TagKey<Item> ALUMINIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.ALUMINIUM);
            public static final TagKey<Item> ALUMINIUM_BRASS = forgeTag(Reference.Tags.PLATE + Reference.Names.ALUMINIUM_BRASS);
            public static final TagKey<Item> ALUMITE = forgeTag(Reference.Tags.PLATE + Reference.Names.ALUMITE);
            public static final TagKey<Item> ARDITE = forgeTag(Reference.Tags.PLATE + Reference.Names.ARDITE);
            public static final TagKey<Item> BERYLLIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.BERYLLIUM);
            public static final TagKey<Item> BLUTONIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.BLUTONIUM);
            public static final TagKey<Item> BORON = forgeTag(Reference.Tags.PLATE + Reference.Names.BORON);
            public static final TagKey<Item> BRASS = forgeTag(Reference.Tags.PLATE + Reference.Names.BRASS);
            public static final TagKey<Item> BRONZE = forgeTag(Reference.Tags.PLATE + Reference.Names.BRONZE);
            public static final TagKey<Item> COBALT = forgeTag(Reference.Tags.PLATE + Reference.Names.COBALT);
            public static final TagKey<Item> CONDUCTIVE_IRON = forgeTag(Reference.Tags.PLATE + Reference.Names.CONDUCTIVE_IRON);
            public static final TagKey<Item> CONSTANTAN = forgeTag(Reference.Tags.PLATE + Reference.Names.CONSTANTAN);
            public static final TagKey<Item> COPPER = forgeTag(Reference.Tags.PLATE + Reference.Names.COPPER);
            public static final TagKey<Item> CRUDE_STEEL = forgeTag(Reference.Tags.PLATE + Reference.Names.CRUDE_STEEL);
            public static final TagKey<Item> CYANIDE = forgeTag(Reference.Tags.PLATE + Reference.Names.CYANIDE);
            public static final TagKey<Item> DARK_STEEL = forgeTag(Reference.Tags.PLATE + Reference.Names.DARK_STEEL);
            public static final TagKey<Item> DAWN_STONE = forgeTag(Reference.Tags.PLATE + Reference.Names.DAWN_STONE);
            public static final TagKey<Item> DEMONIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.DEMONIUM);
            public static final TagKey<Item> DRACONIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.DRACONIUM);
            public static final TagKey<Item> ELECTRICAL_STEEL = forgeTag(Reference.Tags.PLATE + Reference.Names.ELECTRICAL_STEEL);
            public static final TagKey<Item> ELECTRUM = forgeTag(Reference.Tags.PLATE + Reference.Names.ELECTRUM);
            public static final TagKey<Item> ENCHANTIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.ENCHANTIUM);
            public static final TagKey<Item> END_STEEL = forgeTag(Reference.Tags.PLATE + Reference.Names.END_STEEL);
            public static final TagKey<Item> ENDERITE = forgeTag(Reference.Tags.PLATE + Reference.Names.ENDERITE);
            public static final TagKey<Item> ENERGETIC_SILVER = forgeTag(Reference.Tags.PLATE + Reference.Names.ENERGETIC_SILVER);
            public static final TagKey<Item> GOLD = forgeTag(Reference.Tags.PLATE + Reference.Names.GOLD);
            public static final TagKey<Item> GRAPHITE = forgeTag(Reference.Tags.PLATE + Reference.Names.GRAPHITE);
            public static final TagKey<Item> INVAR = forgeTag(Reference.Tags.PLATE + Reference.Names.INVAR);
            public static final TagKey<Item> IRIDIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.IRIDIUM);
            public static final TagKey<Item> IRON = forgeTag(Reference.Tags.PLATE + Reference.Names.IRON);
            public static final TagKey<Item> LEAD = forgeTag(Reference.Tags.PLATE + Reference.Names.LEAD);
            public static final TagKey<Item> LITHIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.LITHIUM);
            public static final TagKey<Item> LUDICRITE = forgeTag(Reference.Tags.PLATE + Reference.Names.LUDICRITE);
            public static final TagKey<Item> MAGNESIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.MAGNESIUM);
            public static final TagKey<Item> MANGANESE = forgeTag(Reference.Tags.PLATE + Reference.Names.MANGANESE);
            public static final TagKey<Item> STEEL = forgeTag(Reference.Tags.PLATE + Reference.Names.STEEL);
            public static final TagKey<Item> TIN = forgeTag(Reference.Tags.PLATE + Reference.Names.TIN);
            public static final TagKey<Item> YELLORIUM = forgeTag(Reference.Tags.PLATE + Reference.Names.YELLORIUM);
        }

        public static class Raw
        {
            public static final TagKey<Item> ALUMINIUM = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.ALUMINIUM);
            public static final TagKey<Item> ALUMINIUM_BRASS = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.ALUMINIUM_BRASS);
            public static final TagKey<Item> ALUMITE = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.ALUMITE);
            public static final TagKey<Item> ARDITE = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.ARDITE);
            public static final TagKey<Item> BERYLLIUM = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.BERYLLIUM);
            public static final TagKey<Item> BLUTONIUM = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.BLUTONIUM);
            public static final TagKey<Item> BORON = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.BORON);
            public static final TagKey<Item> BRASS = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.BRASS);
            public static final TagKey<Item> BRONZE = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.BRONZE);
            public static final TagKey<Item> COBALT = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.COBALT);
            public static final TagKey<Item> CONDUCTIVE_IRON = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.CONDUCTIVE_IRON);
            public static final TagKey<Item> CONSTANTAN = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.CONSTANTAN);
            public static final TagKey<Item> CRUDE_STEEL = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.CRUDE_STEEL);
            public static final TagKey<Item> CYANIDE = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.CYANIDE);
            public static final TagKey<Item> DARK_STEEL = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.DARK_STEEL);
            public static final TagKey<Item> DAWN_STONE = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.DAWN_STONE);
            public static final TagKey<Item> DEMONIUM = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.DEMONIUM);
            public static final TagKey<Item> DRACONIUM = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.DRACONIUM);
            public static final TagKey<Item> ELECTRICAL_STEEL = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.ELECTRICAL_STEEL);
            public static final TagKey<Item> ELECTRUM = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.ELECTRUM);
            public static final TagKey<Item> ENCHANTIUM = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.ENCHANTIUM);
            public static final TagKey<Item> END_STEEL = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.END_STEEL);
            public static final TagKey<Item> ENDERITE = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.ENDERITE);
            public static final TagKey<Item> ENERGETIC_SILVER = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.ENERGETIC_SILVER);
            public static final TagKey<Item> GRAPHITE = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.GRAPHITE);
            public static final TagKey<Item> INVAR = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.INVAR);
            public static final TagKey<Item> IRIDIUM = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.IRIDIUM);
            public static final TagKey<Item> LEAD = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.LEAD);
            public static final TagKey<Item> LITHIUM = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.LITHIUM);
            public static final TagKey<Item> LUDICRITE = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.LUDICRITE);
            public static final TagKey<Item> MAGNESIUM = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.MAGNESIUM);
            public static final TagKey<Item> MANGANESE = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.MANGANESE);
            public static final TagKey<Item> STEEL = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.STEEL);
            public static final TagKey<Item> TIN = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.TIN);
            public static final TagKey<Item> YELLORIUM = forgeTag(Reference.Tags.Forge.Items.RAW_MATERIALS + Reference.Names.YELLORIUM);
        }

        public static class Reinforced
        {
            public static final TagKey<Item> ALUMINIUM = forgeTag(Reference.Tags.REINFORCED + Reference.Names.ALUMINIUM);
            public static final TagKey<Item> ALUMINIUM_BRASS = forgeTag(Reference.Tags.REINFORCED + Reference.Names.ALUMINIUM_BRASS);
            public static final TagKey<Item> ALUMITE = forgeTag(Reference.Tags.REINFORCED + Reference.Names.ALUMITE);
            public static final TagKey<Item> ARDITE = forgeTag(Reference.Tags.REINFORCED + Reference.Names.ARDITE);
            public static final TagKey<Item> BERYLLIUM = forgeTag(Reference.Tags.REINFORCED + Reference.Names.BERYLLIUM);
            public static final TagKey<Item> BLUTONIUM = forgeTag(Reference.Tags.REINFORCED + Reference.Names.BLUTONIUM);
            public static final TagKey<Item> BORON = forgeTag(Reference.Tags.REINFORCED + Reference.Names.BORON);
            public static final TagKey<Item> BRASS = forgeTag(Reference.Tags.REINFORCED + Reference.Names.BRASS);
            public static final TagKey<Item> BRONZE = forgeTag(Reference.Tags.REINFORCED + Reference.Names.BRONZE);
            public static final TagKey<Item> COBALT = forgeTag(Reference.Tags.REINFORCED + Reference.Names.COBALT);
            public static final TagKey<Item> CONDUCTIVE_IRON = forgeTag(Reference.Tags.REINFORCED + Reference.Names.CONDUCTIVE_IRON);
            public static final TagKey<Item> CONSTANTAN = forgeTag(Reference.Tags.REINFORCED + Reference.Names.CONSTANTAN);
            public static final TagKey<Item> COPPER = forgeTag(Reference.Tags.REINFORCED + Reference.Names.COPPER);
            public static final TagKey<Item> CRUDE_STEEL = forgeTag(Reference.Tags.REINFORCED + Reference.Names.CRUDE_STEEL);
            public static final TagKey<Item> CYANIDE = forgeTag(Reference.Tags.REINFORCED + Reference.Names.CYANIDE);
            public static final TagKey<Item> DARK_STEEL = forgeTag(Reference.Tags.REINFORCED + Reference.Names.DARK_STEEL);
            public static final TagKey<Item> DAWN_STONE = forgeTag(Reference.Tags.REINFORCED + Reference.Names.DAWN_STONE);
            public static final TagKey<Item> DEMONIUM = forgeTag(Reference.Tags.REINFORCED + Reference.Names.DEMONIUM);
            public static final TagKey<Item> DRACONIUM = forgeTag(Reference.Tags.REINFORCED + Reference.Names.DRACONIUM);
            public static final TagKey<Item> ELECTRICAL_STEEL = forgeTag(Reference.Tags.REINFORCED + Reference.Names.ELECTRICAL_STEEL);
            public static final TagKey<Item> ELECTRUM = forgeTag(Reference.Tags.REINFORCED + Reference.Names.ELECTRUM);
            public static final TagKey<Item> ENCHANTIUM = forgeTag(Reference.Tags.REINFORCED + Reference.Names.ENCHANTIUM);
            public static final TagKey<Item> END_STEEL = forgeTag(Reference.Tags.REINFORCED + Reference.Names.END_STEEL);
            public static final TagKey<Item> ENDERITE = forgeTag(Reference.Tags.REINFORCED + Reference.Names.ENDERITE);
            public static final TagKey<Item> ENERGETIC_SILVER = forgeTag(Reference.Tags.REINFORCED + Reference.Names.ENERGETIC_SILVER);
            public static final TagKey<Item> GOLD = forgeTag(Reference.Tags.REINFORCED + Reference.Names.GOLD);
            public static final TagKey<Item> GRAPHITE = forgeTag(Reference.Tags.REINFORCED + Reference.Names.GRAPHITE);
            public static final TagKey<Item> INVAR = forgeTag(Reference.Tags.REINFORCED + Reference.Names.INVAR);
            public static final TagKey<Item> IRIDIUM = forgeTag(Reference.Tags.REINFORCED + Reference.Names.IRIDIUM);
            public static final TagKey<Item> IRON = forgeTag(Reference.Tags.REINFORCED + Reference.Names.IRON);
            public static final TagKey<Item> LEAD = forgeTag(Reference.Tags.REINFORCED + Reference.Names.LEAD);
            public static final TagKey<Item> LITHIUM = forgeTag(Reference.Tags.REINFORCED + Reference.Names.LITHIUM);
            public static final TagKey<Item> LUDICRITE = forgeTag(Reference.Tags.REINFORCED + Reference.Names.LUDICRITE);
            public static final TagKey<Item> MAGNESIUM = forgeTag(Reference.Tags.REINFORCED + Reference.Names.MAGNESIUM);
            public static final TagKey<Item> MANGANESE = forgeTag(Reference.Tags.REINFORCED + Reference.Names.MANGANESE);
            public static final TagKey<Item> STEEL = forgeTag(Reference.Tags.REINFORCED + Reference.Names.STEEL);
            public static final TagKey<Item> TIN = forgeTag(Reference.Tags.REINFORCED + Reference.Names.TIN);
            public static final TagKey<Item> YELLORIUM = forgeTag(Reference.Tags.REINFORCED + Reference.Names.YELLORIUM);
        }

        public static class Rod
        {
            public static final TagKey<Item> ALUMINIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.ALUMINIUM);
            public static final TagKey<Item> ALUMINIUM_BRASS = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.ALUMINIUM_BRASS);
            public static final TagKey<Item> ALUMITE = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.ALUMITE);
            public static final TagKey<Item> ARDITE = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.ARDITE);
            public static final TagKey<Item> BERYLLIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.BERYLLIUM);
            public static final TagKey<Item> BLUTONIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.BLUTONIUM);
            public static final TagKey<Item> BORON = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.BORON);
            public static final TagKey<Item> BRASS = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.BRASS);
            public static final TagKey<Item> BRONZE = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.BRONZE);
            public static final TagKey<Item> COBALT = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.COBALT);
            public static final TagKey<Item> CONDUCTIVE_IRON = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.CONDUCTIVE_IRON);
            public static final TagKey<Item> CONSTANTAN = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.CONSTANTAN);
            public static final TagKey<Item> COPPER = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.COPPER);
            public static final TagKey<Item> CRUDE_STEEL = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.CRUDE_STEEL);
            public static final TagKey<Item> CYANIDE = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.CYANIDE);
            public static final TagKey<Item> DARK_STEEL = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.DARK_STEEL);
            public static final TagKey<Item> DAWN_STONE = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.DAWN_STONE);
            public static final TagKey<Item> DEMONIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.DEMONIUM);
            public static final TagKey<Item> DRACONIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.DRACONIUM);
            public static final TagKey<Item> ELECTRICAL_STEEL = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.ELECTRICAL_STEEL);
            public static final TagKey<Item> ELECTRUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.ELECTRUM);
            public static final TagKey<Item> ENCHANTIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.ENCHANTIUM);
            public static final TagKey<Item> END_STEEL = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.END_STEEL);
            public static final TagKey<Item> ENDERITE = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.ENDERITE);
            public static final TagKey<Item> ENERGETIC_SILVER = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.ENERGETIC_SILVER);
            public static final TagKey<Item> GOLD = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.GOLD);
            public static final TagKey<Item> GRAPHITE = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.GRAPHITE);
            public static final TagKey<Item> INVAR = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.INVAR);
            public static final TagKey<Item> IRIDIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.IRIDIUM);
            public static final TagKey<Item> IRON = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.IRON);
            public static final TagKey<Item> LEAD = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.LEAD);
            public static final TagKey<Item> LITHIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.LITHIUM);
            public static final TagKey<Item> LUDICRITE = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.LUDICRITE);
            public static final TagKey<Item> MAGNESIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.MAGNESIUM);
            public static final TagKey<Item> MANGANESE = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.MANGANESE);
            public static final TagKey<Item> STEEL = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.STEEL);
            public static final TagKey<Item> TIN = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.TIN);
            public static final TagKey<Item> YELLORIUM = forgeTag(Reference.Tags.Forge.Items.RODS + Reference.Names.YELLORIUM);
        }

        public static class Tool
        {
            public static final TagKey<Item> AUGMENT = forgeTag(Reference.Tags.Forge.Items.TOOLS + Reference.Names.AUGMENT);
            public static final TagKey<Item> CUTTER = forgeTag(Reference.Tags.Forge.Items.TOOLS + Reference.Names.CUTTER);
            public static final TagKey<Item> DOWSING_ROD = forgeTag(Reference.Tags.Forge.Items.TOOLS + Reference.Names.DOWSING);
            public static final TagKey<Item> KNIFE = forgeTag(Reference.Tags.Forge.Items.TOOLS + Reference.Names.KNIFE);
            public static final TagKey<Item> SPANNER = forgeTag(Reference.Tags.Forge.Items.TOOLS + Reference.Names.SPANNER);
            public static final TagKey<Item> TUNER = forgeTag(Reference.Tags.Forge.Items.TOOLS + Reference.Names.TUNER);
            public static final TagKey<Item> WRENCH = forgeTag(Reference.Tags.Forge.Items.TOOLS + Reference.Names.WRENCH);
        }

        public static class Gems
        {
            public static final TagKey<Item> RUBY = forgeTag(Reference.Tags.Forge.Items.GEMS + Reference.Names.RUBY);
            public static final TagKey<Item> SAPPHIRE = forgeTag(Reference.Tags.Forge.Items.GEMS + Reference.Names.SAPPHIRE);

            public static class Shards
            {
                public static final TagKey<Item> DIAMOND = forgeTag(Reference.Tags.Forge.Items.GEMS + Reference.Names.SHARD + Reference.Names.DIAMOND);
                public static final TagKey<Item> EMERALD = forgeTag(Reference.Tags.Forge.Items.GEMS + Reference.Names.SHARD + Reference.Names.EMERALD);
                public static final TagKey<Item> QUARTZ = forgeTag(Reference.Tags.Forge.Items.GEMS + Reference.Names.SHARD + Reference.Names.QUARTZ);
                public static final TagKey<Item> RUBY = forgeTag(Reference.Tags.Forge.Items.GEMS + Reference.Names.SHARD + Reference.Names.RUBY);
                public static final TagKey<Item> SAPPHIRE = forgeTag(Reference.Tags.Forge.Items.GEMS + Reference.Names.SHARD + Reference.Names.SAPPHIRE);
            }
        }

        public static class Casts
        {
            public static final TagKey<Item> BLANK = forgeTag(Reference.Tags.Forge.Items.CASTS + Reference.Names.CAST_BLANK);
            public static final TagKey<Item> BLANK_REINFORCED = forgeTag(Reference.Tags.Forge.Items.CASTS + Reference.Names.CAST_BLANK_REINFORCED);
            public static final TagKey<Item> GEAR = forgeTag(Reference.Tags.Forge.Items.CASTS + Reference.Names.CAST_GEAR);
            public static final TagKey<Item> GEM = forgeTag(Reference.Tags.Forge.Items.CASTS + Reference.Names.CAST_GEM);
            public static final TagKey<Item> HAMMER = forgeTag(Reference.Tags.Forge.Items.CASTS + Reference.Names.CAST_HAMMER);
            public static final TagKey<Item> HANDLE = forgeTag(Reference.Tags.Forge.Items.CASTS + Reference.Names.CAST_HANDLE);
            public static final TagKey<Item> INGOT = forgeTag(Reference.Tags.Forge.Items.CASTS + Reference.Names.CAST_INGOT);
            public static final TagKey<Item> NUGGET = forgeTag(Reference.Tags.Forge.Items.CASTS + Reference.Names.CAST_NUGGET);
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