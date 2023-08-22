package jiraiyah.abi.worldgen;

import jiraiyah.abi.Reference;
import jiraiyah.abi.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures
{
    //<editor-fold desc="RUBY">
    /*public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY =
            registerKey(Reference.Names.OVERWORLD + Reference.Names.RUBY + Reference.Names.ORE);
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_RUBY_ORE_KEY =
            registerKey(Reference.Names.END + Reference.Names.RUBY + Reference.Names.ORE);
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE_KEY =
            registerKey(Reference.Names.NETHER + Reference.Names.RUBY + Reference.Names.ORE);*/
    //</editor-fold>

    //<editor-fold desc="SAPPHIRE">
    /*public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY =
            registerKey(Reference.Names.OVERWORLD + Reference.Names.SAPPHIRE + Reference.Names.ORE);
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SAPPHIRE_ORE_KEY =
            registerKey(Reference.Names.END + Reference.Names.SAPPHIRE + Reference.Names.ORE);
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SAPPHIRE_ORE_KEY =
            registerKey(Reference.Names.NETHER + Reference.Names.SAPPHIRE + Reference.Names.ORE);*/
    //</editor-fold>

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context)
    {
        /*RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);
        RuleTest sandReplaceables = new BlockMatchTest(Blocks.SAND);
        RuleTest redSandReplaceables = new BlockMatchTest(Blocks.RED_SAND);*/

        //<editor-fold desc="RUBY ORE">
        /*List<OreConfiguration.TargetBlockState> overworldRubyOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.Ores.OVERWORLD_RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepReplaceables, ModBlocks.Ores.DEEP_RUBY_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE,
                new OreConfiguration(overworldRubyOres, 9));

        register(context, END_RUBY_ORE_KEY, Feature.ORE,
                new OreConfiguration(endstoneReplaceables,
                        ModBlocks.Ores.END_RUBY_ORE.get().defaultBlockState(), 6));

        register(context, NETHER_RUBY_ORE_KEY, Feature.ORE,
                new OreConfiguration(netherrackReplaceables,
                        ModBlocks.Ores.NETHER_RUBY_ORE.get().defaultBlockState(), 9));*/
        //</editor-fold>

        //<editor-fold desc="SAPPHIRE ORE">
        /*List<OreConfiguration.TargetBlockState> overworldSapphireOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.Ores.OVERWORLD_SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepReplaceables, ModBlocks.Ores.DEEP_SAPPHIRE_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE,
                new OreConfiguration(overworldSapphireOres, 9));

        register(context, END_SAPPHIRE_ORE_KEY, Feature.ORE,
                new OreConfiguration(endstoneReplaceables,
                        ModBlocks.Ores.END_SAPPHIRE_ORE.get().defaultBlockState(), 6));

        register(context, NETHER_SAPPHIRE_ORE_KEY, Feature.ORE,
                new OreConfiguration(netherrackReplaceables,
                        ModBlocks.Ores.NETHER_SAPPHIRE_ORE.get().defaultBlockState(), 9));*/
        //</editor-fold>
    }

    //<editor-fold desc="HELPER METHODS">
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name)
    {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Reference.Location(name));
    }

    public static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                         ResourceKey<ConfiguredFeature<?, ?>> key,
                                                                                         F feature, FC configuration)
    {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
    //</editor-fold>
}