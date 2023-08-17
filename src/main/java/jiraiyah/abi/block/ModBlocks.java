package jiraiyah.abi.block;

import jiraiyah.abi.Reference;
import jiraiyah.abi.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MODID);

    public static class Ores
    {
        //<editor-fold desc="RUBY">
        public static final RegistryObject<Block> OVERWORLD_RUBY_ORE = registerBlock(
                Reference.Names.OVERWORLD + Reference.Names.RUBY + Reference.Names.ORE,
                () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                        .strength(2.0f)
                        .requiresCorrectToolForDrops(),
                        UniformInt.of(3, 6)));

        public static final RegistryObject<Block> DEEP_RUBY_ORE = registerBlock(
                Reference.Names.DEEPSLATE + Reference.Names.RUBY + Reference.Names.ORE,
                () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                        .strength(2.0f)
                        .requiresCorrectToolForDrops(),
                        UniformInt.of(3, 6)));

        public static final RegistryObject<Block> END_RUBY_ORE = registerBlock(
                Reference.Names.END + Reference.Names.RUBY + Reference.Names.ORE,
                () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                        .strength(2.0f)
                        .requiresCorrectToolForDrops(),
                        UniformInt.of(3, 6)));

        public static final RegistryObject<Block> NETHER_RUBY_ORE = registerBlock(
                Reference.Names.NETHER + Reference.Names.RUBY + Reference.Names.ORE,
                () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                        .strength(2.0f)
                        .requiresCorrectToolForDrops(),
                        UniformInt.of(3, 6)));
        //</editor-fold>

        //<editor-fold desc="SAPPHIRE">
        public static final RegistryObject<Block> OVERWORLD_SAPPHIRE_ORE = registerBlock(
                Reference.Names.OVERWORLD + Reference.Names.SAPPHIRE + Reference.Names.ORE,
                () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                        .strength(2.0f)
                        .requiresCorrectToolForDrops(),
                        UniformInt.of(3, 6)));

        public static final RegistryObject<Block> DEEP_SAPPHIRE_ORE = registerBlock(
                Reference.Names.DEEPSLATE + Reference.Names.SAPPHIRE + Reference.Names.ORE,
                () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                        .strength(2.0f)
                        .requiresCorrectToolForDrops(),
                        UniformInt.of(3, 6)));

        public static final RegistryObject<Block> END_SAPPHIRE_ORE = registerBlock(
                Reference.Names.END + Reference.Names.SAPPHIRE + Reference.Names.ORE,
                () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                        .strength(2.0f)
                        .requiresCorrectToolForDrops(),
                        UniformInt.of(3, 6)));

        public static final RegistryObject<Block> NETHER_SAPPHIRE_ORE = registerBlock(
                Reference.Names.NETHER + Reference.Names.SAPPHIRE + Reference.Names.ORE,
                () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                        .strength(2.0f)
                        .requiresCorrectToolForDrops(),
                        UniformInt.of(3, 6)));
        //</editor-fold>

        public static void initialize(){}
    }

    public static class Ingots
    {
        public static void initialize(){}
    }

    public static class Gem
    {
        public static final RegistryObject<Block> RUBY_BLOCK = registerBlock(Reference.Names.RUBY + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.AMETHYST)));

        public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock(Reference.Names.SAPPHIRE + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.AMETHYST)));

        public static void initialize(){}
    }

    public static void initialize()
    {
        Ores.initialize();
        Ingots.initialize();
        Gem.initialize();
    }

    //<editor-fold desc="HELPER METHODS">
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> result = BLOCKS.register(name, block);
        registerBlockItem(name, result);
        return result;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block)
    {
        return BLOCKS.register(name, block);
    }
    //</editor-fold>
}