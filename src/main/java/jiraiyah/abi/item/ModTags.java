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

        public static final TagKey<Item> SAPPHIRE_GEM = forgeTag("gems/sapphire");
        public static final TagKey<Item> RUBY_GEM = forgeTag("gems/ruby");

        public static final TagKey<Item> DIAMOND_SHARD = forgeTag("gems/shard_diamond");
        public static final TagKey<Item> EMERALD_SHARD = forgeTag("gems/shard_emerald");
        public static final TagKey<Item> QUARTZ_SHARD = forgeTag("gems/shard_quartz");
        public static final TagKey<Item> RUBY_SHARD = forgeTag("gems/shard_ruby");
        public static final TagKey<Item> SAPPHIRE_SHARD = forgeTag("gems/shard_sapphire");

        public static final TagKey<Item> WRENCH_TOOL = forgeTag("tools/wrench");
        public static final TagKey<Item> SPANNER_TOOL = forgeTag("tools/spanner");

        private static TagKey<Item> tag(String name)
        {
            return ItemTags.create(Reference.Location(name));
        }

        private static TagKey<Item> forgeTag(String name)
        {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}