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
        /*public static final RegistryObject<Block> OVERWORLD_COPPER_ORE = registerBlock(
                Reference.Names.OVERWORLD + Reference.Names.COPPER + Reference.Names.ORE,
                () -> getOre(Blocks.STONE, SoundType.STONE));*/

        /*//<editor-fold desc="LEAD">
        public static final RegistryObject<Block> OVERWORLD_LEAD_ORE = registerBlock(
                Reference.Names.OVERWORLD + Reference.Names.LEAD + Reference.Names.ORE,
                () -> getOre(Blocks.STONE, SoundType.STONE));

        public static final RegistryObject<Block> Deep_LEAD_ORE = registerBlock(
                Reference.Names.DEEPSLATE + Reference.Names.LEAD + Reference.Names.ORE,
                () -> getOre(Blocks.DEEPSLATE, SoundType.DEEPSLATE, 4.5F, 3.0F));
        //</editor-fold>*/

        /*//<editor-fold desc="NICKEL">
        public static final RegistryObject<Block> OVERWORLD_NICKEL_ORE = registerBlock(
                Reference.Names.OVERWORLD + Reference.Names.NICKEL + Reference.Names.ORE,
                () -> getOre(Blocks.STONE, SoundType.STONE));

        public static final RegistryObject<Block> Deep_NICKEL_ORE = registerBlock(
                Reference.Names.DEEPSLATE + Reference.Names.NICKEL + Reference.Names.ORE,
                () -> getOre(Blocks.DEEPSLATE, SoundType.DEEPSLATE, 4.5F, 3.0F));
        //</editor-fold>*/

        /*//<editor-fold desc="NITER">
        public static final RegistryObject<Block> OVERWORLD_NITER_ORE = registerBlock(
                Reference.Names.OVERWORLD + Reference.Names.NITER + Reference.Names.ORE,
                () -> getOre(Blocks.STONE, SoundType.STONE, 0, 2));

        public static final RegistryObject<Block> Deep_NITER_ORE = registerBlock(
                Reference.Names.DEEPSLATE + Reference.Names.NITER + Reference.Names.ORE,
                () -> getOre(Blocks.DEEPSLATE, SoundType.DEEPSLATE, 4.5F, 3.0F));
        //</editor-fold>*/

        /*//<editor-fold desc="SILVER">
        public static final RegistryObject<Block> OVERWORLD_SILVER_ORE = registerBlock(
                Reference.Names.OVERWORLD + Reference.Names.SILVER + Reference.Names.ORE,
                () -> getOre(Blocks.STONE, SoundType.STONE));

        public static final RegistryObject<Block> Deep_SILVER_ORE = registerBlock(
                Reference.Names.DEEPSLATE + Reference.Names.SILVER + Reference.Names.ORE,
                () -> getOre(Blocks.DEEPSLATE, SoundType.DEEPSLATE, 4.5F, 3.0F));
        //</editor-fold>*/

        /*//<editor-fold desc="SULFUR">
        public static final RegistryObject<Block> OVERWORLD_SULFUR_ORE = registerBlock(
                Reference.Names.OVERWORLD + Reference.Names.SULFUR + Reference.Names.ORE,
                () -> getOre(Blocks.STONE, SoundType.STONE, 0, 0));

        public static final RegistryObject<Block> Deep_SULFUR_ORE = registerBlock(
                Reference.Names.DEEPSLATE + Reference.Names.LEAD + Reference.Names.ORE,
                () -> getOre(Blocks.DEEPSLATE, SoundType.DEEPSLATE, 4.5F, 3.0F, 0, 2));

        public static final RegistryObject<Block> NETHER_SULFUR_ORE = registerBlock(
                Reference.Names.NETHER + Reference.Names.SULFUR + Reference.Names.ORE,
                () -> getOre(Blocks.NETHERRACK, SoundType.NETHER_ORE, 0, 2));
        //</editor-fold>*/

        /*//<editor-fold desc="TIN">
        public static final RegistryObject<Block> OVERWORLD_TIN_ORE = registerBlock(
                Reference.Names.OVERWORLD + Reference.Names.TIN + Reference.Names.ORE,
                () -> getOre(Blocks.STONE, SoundType.STONE));

        public static final RegistryObject<Block> Deep_TIN_ORE = registerBlock(
                Reference.Names.DEEPSLATE + Reference.Names.LEAD + Reference.Names.ORE,
                () -> getOre(Blocks.DEEPSLATE, SoundType.DEEPSLATE, 4.5F, 3.0F));
        //</editor-fold>*/

        /*//<editor-fold desc="RUBY">
        public static final RegistryObject<Block> OVERWORLD_RUBY_ORE = registerBlock(
                Reference.Names.OVERWORLD + Reference.Names.RUBY + Reference.Names.ORE,
                () -> getOre(Blocks.STONE, SoundType.STONE,  3, 7));

        public static final RegistryObject<Block> DEEP_RUBY_ORE = registerBlock(
                Reference.Names.DEEPSLATE + Reference.Names.RUBY + Reference.Names.ORE,
                () -> getOre(Blocks.DEEPSLATE, SoundType.DEEPSLATE, 4.5F, 3.0F, 3, 7));

        public static final RegistryObject<Block> END_RUBY_ORE = registerBlock(
                Reference.Names.END + Reference.Names.RUBY + Reference.Names.ORE,
                () -> getOre(Blocks.END_STONE, SoundType.STONE, 3, 7));

        public static final RegistryObject<Block> NETHER_RUBY_ORE = registerBlock(
                Reference.Names.NETHER + Reference.Names.RUBY + Reference.Names.ORE,
                () -> getOre(Blocks.NETHERRACK, SoundType.NETHER_ORE, 3, 7));
        //</editor-fold>*/

        /*//<editor-fold desc="SAPPHIRE">
        public static final RegistryObject<Block> OVERWORLD_SAPPHIRE_ORE = registerBlock(
                Reference.Names.OVERWORLD + Reference.Names.SAPPHIRE + Reference.Names.ORE,
                () -> getOre(Blocks.STONE, SoundType.STONE, 3, 7));

        public static final RegistryObject<Block> DEEP_SAPPHIRE_ORE = registerBlock(
                Reference.Names.DEEPSLATE + Reference.Names.SAPPHIRE + Reference.Names.ORE,
                () -> getOre(Blocks.DEEPSLATE, SoundType.DEEPSLATE, 4.5F, 3.0F, 3, 7));

        public static final RegistryObject<Block> END_SAPPHIRE_ORE = registerBlock(
                Reference.Names.END + Reference.Names.SAPPHIRE + Reference.Names.ORE,
                () -> getOre(Blocks.END_STONE, SoundType.STONE, 3, 7));

        public static final RegistryObject<Block> NETHER_SAPPHIRE_ORE = registerBlock(
                Reference.Names.NETHER + Reference.Names.SAPPHIRE + Reference.Names.ORE,
                () -> getOre(Blocks.NETHERRACK, SoundType.NETHER_ORE, 3, 7));
        //</editor-fold>*/

        public static void initialize(){}
    }

    public static class Ingots
    {
        /*public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock(Reference.Names.BRONZE + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.METAL)));

        public static final RegistryObject<Block> CONSTANTAN_BLOCK = registerBlock(Reference.Names.CONSTANTAN + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.METAL)));

        public static final RegistryObject<Block> ELECTRUM_BLOCK = registerBlock(Reference.Names.ELECTRUM + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.METAL)));

        public static final RegistryObject<Block> ENDERITE_BLOCK = registerBlock(Reference.Names.ENDERITE + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.ANCIENT_DEBRIS)));

        public static final RegistryObject<Block> INVAR_BLOCK = registerBlock(Reference.Names.INVAR + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.METAL)));

        public static final RegistryObject<Block> LEAD_BLOCK = registerBlock(Reference.Names.LEAD + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.METAL)));

        public static final RegistryObject<Block> LUMIUM_BLOCK = registerBlock(Reference.Names.LUMIUM + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.METAL)));

        public static final RegistryObject<Block> NICKEL_BLOCK = registerBlock(Reference.Names.NICKEL + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.METAL)));

        public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock(Reference.Names.RAW + Reference.Names.LEAD + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.METAL)));

        public static final RegistryObject<Block> RAW_NICKEL_BLOCK = registerBlock(Reference.Names.RAW + Reference.Names.NICKEL + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.METAL)));

        public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock(Reference.Names.RAW + Reference.Names.SILVER + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.METAL)));

        public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock(Reference.Names.RAW + Reference.Names.TIN + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.METAL)));

        public static final RegistryObject<Block> SIGNALUM_BLOCK = registerBlock(Reference.Names.SIGNALUM + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.METAL)));

        public static final RegistryObject<Block> SILVER_BLOCK = registerBlock(Reference.Names.SILVER + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.METAL)));

        public static final RegistryObject<Block> STEEL_BLOCK = registerBlock(Reference.Names.STEEL + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.METAL)));

        public static final RegistryObject<Block> SULFUR_BLOCK = registerBlock(Reference.Names.SULFUR + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.METAL)));

        public static final RegistryObject<Block> TIN_BLOCK = registerBlock(Reference.Names.TIN + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.METAL)));*/

        public static void initialize(){}
    }

    public static class Gem
    {
        /*public static final RegistryObject<Block> RUBY_BLOCK = registerBlock(Reference.Names.RUBY + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.AMETHYST)));

        public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock(Reference.Names.SAPPHIRE + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                        .sound(SoundType.AMETHYST)));

        public static final RegistryObject<Block> SLIME_BLOCK = registerBlock(Reference.Names.SLIME + Reference.Names.BLOCK,
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK)
                        .sound(SoundType.SLIME_BLOCK)));*/

        public static void initialize(){}
    }


    /*public static final RegistryObject<Block> POTATO_BLOCK = registerBlock(Reference.Names.POTATO + Reference.Names.BLOCK,
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .sound(SoundType.BAMBOO_WOOD)));*/

    public static void initialize()
    {
        Ores.initialize();
        Ingots.initialize();
        Gem.initialize();
    }

    //<editor-fold desc="HELPER METHODS">
    private static Block getOre(Block block, SoundType soundType)
    {
        return new DropExperienceBlock(BlockBehaviour.Properties.copy(block)
                .strength(3.0F, 3.0F)
                .sound(soundType)
                .requiresCorrectToolForDrops(),
                UniformInt.of(0, 0));
    }

    private static Block getOre(Block block, SoundType soundType,  float destroyTime, float explosionTime)
    {
        return new DropExperienceBlock(BlockBehaviour.Properties.copy(block)
                .strength(destroyTime, explosionTime)
                .sound(soundType)
                .requiresCorrectToolForDrops(),
                UniformInt.of(0, 0));
    }

    private static Block getOre(Block block, SoundType soundType,  int minXp, int maxXp)
    {
        return new DropExperienceBlock(BlockBehaviour.Properties.copy(block)
                .strength(3.0F, 3.0F)
                .sound(soundType)
                .requiresCorrectToolForDrops(),
                UniformInt.of(minXp, maxXp));
    }

    private static Block getOre(Block block, SoundType soundType,  float destroyTime, float explosionTime, int minXp, int maxXp)
    {
        return new DropExperienceBlock(BlockBehaviour.Properties.copy(block)
                .strength(destroyTime, explosionTime)
                .sound(soundType)
                .requiresCorrectToolForDrops(),
                UniformInt.of(minXp, maxXp));
    }

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