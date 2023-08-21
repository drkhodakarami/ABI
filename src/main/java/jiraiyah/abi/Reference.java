package jiraiyah.abi;

import net.minecraft.resources.ResourceLocation;

public class Reference
{
    public static final String MODID = "abi";
    public static final String ModName = "ABI";

    public static ResourceLocation Location(String path)
    {
        return new ResourceLocation(MODID, path);
    }

    public static class Names
    {
        public static final String ALUMINIUM = "aluminium";
        public static final String ALUMINIUM_BRASS = "aluminium_brass";
        public static final String ALUMITE = "alumite";
        public static final String ARDITE = "ardite";
        public static final String BERYLLIUM = "beryllium";
        public static final String BLUTONIUM = "blutonium";
        public static final String BORON = "boron";
        public static final String BRASS = "brass";
        public static final String BRONZE = "bronze";
        public static final String COBALT = "cobalt";
        public static final String CONDUCTIVE_IRON = "conductive_iron";
        public static final String CONSTANTAN = "constantan";
        public static final String COPPER = "copper";
        public static final String CRUDE_STEEL = "crude_steel";
        public static final String CYANIDE = "cyanide";
        public static final String DARK_STEEL = "dark_steel";
        public static final String DAWN_STONE = "dawn_stone";
        public static final String DEMONIUM = "demonium";
        public static final String DRACONIUM = "draconium";
        public static final String ELECTRICAL_STEEL = "electrical_steel";
        public static final String ELECTRUM = "electrum";
        public static final String ENCHANTIUM = "enchantium";
        public static final String END_STEEL = "end_steel";
        public static final String ENDERITE = "enderite";
        public static final String ENERGETIC_SILVER = "energetic_silver";
        public static final String GOLD = "gold";
        public static final String GRAPHITE = "graphite";
        public static final String INVAR = "invar";
        public static final String IRIDIUM = "iridium";
        public static final String IRON = "iron";
        public static final String LEAD = "lead";
        public static final String LITHIUM = "lithium";
        public static final String LUDICRITE = "ludicrite";
        public static final String MAGNESIUM = "magnesium";
        public static final String MANGANESE = "manganese";
        public static final String NETHERITE = "netherite";
        public static final String NICKEL = "nickel";
        public static final String SILVER = "silver";
        public static final String STEEL = "steel";
        public static final String STONE = "stone";
        public static final String SULFUR = "sulfur";
        public static final String TIN = "tin";
        public static final String YELLORIUM = "yellorium";
        public static final String WOOD = "wood";

        public static final String DIAMOND = "diamond";
        public static final String EMERALD = "emerald";
        public static final String LAPIS = "lapis";
        public static final String PRISMARINE = "prismarine";
        public static final String QUARTZ = "quartz";
        public static final String RUBY = "ruby";
        public static final String SAPPHIRE = "sapphire";

        public static final String AUGMENT = "augment";
        public static final String AUGMENT_ACTIVE = "augment_active";
        public static final String CUTTER = "cutter";
        public static final String KNIFE = "knife";
        public static final String DOWSING = "dowsing_rod";
        public static final String ENGINEER = "engineer";
        public static final String SPANNER = "spanner";
        public static final String TUNER = "tuner";
        public static final String TUNER_ACTIVE = "tuner_active";
        public static final String WRENCH = "wrench";

        public static final String DUST = "dust_";
        public static final String FLUID = "fluid_";
        public static final String GEAR = "gear_";
        public static final String INGOT = "ingot_";
        public static final String MOLTEN = "molten_";
        public static final String NUGGET = "nugget_";
        public static final String PLATE = "plate_";
        public static final String RAW = "raw_";
        public static final String REINFORCED = "reinforced_";
        public static final String ROD = "rod_";
        public static final String TOOL = "tool_";
        public static final String GEM = "gem_";
        public static final String SHARD = "shard_";
        public static final String ARMOR = "armor_";
        public static final String HEAD = "head_";
        public static final String HAS = "has_";

        public static final String BLOCK = "_block";
        public static final String ORE = "_ore";
        public static final String PLACED = "_placed";
        public static final String OVERWORLD = "overworld_";
        public static final String DEEPSLATE = "deepslate_";
        public static final String END = "end_";
        public static final String NETHER = "nether_";

        public static final String CREATIVE_TAB = "creativetab.";
        
        public static final String HELMET = "_helmet";
        public static final String CHEST_PLATE = "_chestplate";
        public static final String LEGGINGS = "_leggings";
        public static final String BOOTS = "_boots";

        public static final String SWORD = "_sword";
        public static final String PICKAXE = "_pickaxe";
        public static final String SHOVEL = "_shovel";
        public static final String AXE = "_axe";
        public static final String HOE = "_hoe";
        public static final String HAMMER = "_hammer";
        public static final String BOW = "_bow";

        public static final String CAST = "cast_";
        public static final String CAST_AXE = "axe";
        public static final String CAST_BLANK = "blank";
        public static final String CAST_BLANK_REINFORCED = "blank_reinforced";
        public static final String CAST_GEAR = "gear";
        public static final String CAST_GEM = "gem";
        public static final String CAST_HAMMER = "hammer";
        public static final String CAST_HANDLE = "handle";
        public static final String CAST_INGOT = "ingot";
        public static final String CAST_NUGGET = "nugget";
        public static final String CAST_PICKAXE = "pickaxe";
        public static final String CAST_PLATE = "plate";
        public static final String CAST_ROD = "rod";
        public static final String CAST_SWORD = "sword";

        public static final String LUMIUM = "lumium";
        public static final String POTATO = "potato";
        public static final String SIGNALUM = "signalum";
        public static final String SLIME = "slime";
        public static final String NITER = "niter";
    }

    public static class Tags
    {
        public static class Forge
        {
            public static class Blocks
            {
                public static final String BARRELS = "barrels/";
                public static final String CHESTS = "chests/";
                public static final String COBBLESTONE = "cobblestone/";
                public static final String FENCE_GATES = "fence_gates/";
                public static final String FENCES = "fences/";
                public static final String GLASS = "glass/";
                public static final String GLASS_PANES = "glass_panes/";
                public static final String ORE_BEARING_GROUND = "ore_bearing_ground/";
                public static final String SAND = "sand/";
                public static final String STORAGE_BLOCKS = "storage_blocks/";
            }

            public static class Items
            {
                public static final String ARMORS = "armors/";
                public static final String BARRELS = "barrels/";
                public static final String CHESTS = "chests/";
                public static final String COBBLESTONES = "cobblestones/";
                public static final String CROPS = "crops/";
                public static final String DUST = "dusts/";
                public static final String DYES = "dyes/";
                public static final String FENCE_GATES = "fence_gates/";
                public static final String FENCES = "fences/";
                public static final String GEMS = "gems/";
                public static final String GLASS = "glass/";
                public static final String GLASS_PANES = "glass_panes/";
                public static final String INGOTS = "ingots/";
                public static final String NUGGETS = "nuggets/";
                public static final String ORE_BEARING_GROUND = "ore_bearing_ground/";
                public static final String ORE_IN_GROUND = "ore_in_ground/";
                public static final String ORE_RATES = "ore_rates/";
                public static final String ORES = "ores/";
                public static final String RAW_MATERIALS = "raw_materials/";
                public static final String RODS = "rods/";
                public static final String SAND = "sand/";
                public static final String SEEDS = "seeds/";
                public static final String STORAGE_BLOCKS = "storage_blocks/";
                public static final String TOOLS = "tools/";
                public static final String CASTS = "casts/";
            }

            public static final String ENTITY_TYPES = "entity_types/";
            public static final String FLUIDS = "fluids/";
            public static final String WORLDGEN = "worldgen/";
            public static final String IS_COLD = "biome/is_cold/";
            public static final String IS_DENSE = "biome/is_dense/";
            public static final String IS_DRY = "biome/is_dry/";
            public static final String IS_HOT = "biome/is_hot/";
            public static final String IS_SPARSE = "biome/is_sparse/";
            public static final String IS_WET = "biome/is_wet/";
        }

        public static final String GEAR = "gears/";
        public static final String PLATE = "plates/";
        public static final String REINFORCED = "reinforced/";
    }
}