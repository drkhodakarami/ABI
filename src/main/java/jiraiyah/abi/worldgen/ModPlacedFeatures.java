package jiraiyah.abi.worldgen;

import jiraiyah.abi.Reference;
import jiraiyah.abi.zlib.worldgen.ModOrePlacement;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures
{
    //<editor-fold desc="RUBY">
    /*public static final ResourceKey<PlacedFeature> RUBY_PLACED_KEY =
            createKey(Reference.Names.OVERWORLD + Reference.Names.RUBY + Reference.Names.PLACED);
    public static final ResourceKey<PlacedFeature> END_RUBY_PLACED_KEY =
            createKey(Reference.Names.END + Reference.Names.RUBY + Reference.Names.PLACED);
    public static final ResourceKey<PlacedFeature> NETHER_RUBY_PLACED_KEY =
            createKey(Reference.Names.NETHER + Reference.Names.RUBY + Reference.Names.PLACED);*/
    //</editor-fold>

    //<editor-fold desc="SAPPHIRE">
    /*public static final ResourceKey<PlacedFeature> SAPPHIRE_PLACED_KEY =
            createKey(Reference.Names.OVERWORLD + Reference.Names.SAPPHIRE + Reference.Names.PLACED);
    public static final ResourceKey<PlacedFeature> END_SAPPHIRE_PLACED_KEY =
            createKey(Reference.Names.END + Reference.Names.SAPPHIRE + Reference.Names.PLACED);
    public static final ResourceKey<PlacedFeature> NETHER_SAPPHIRE_PLACED_KEY =
            createKey(Reference.Names.NETHER + Reference.Names.SAPPHIRE + Reference.Names.PLACED);*/
    //</editor-fold>

    public static void bootstrap(BootstapContext<PlacedFeature> context)
    {
        //HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        //<editor-fold desc="RUBY_ORE">
        /*register(context, RUBY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(16,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.aboveBottom(5),
                                VerticalAnchor.aboveBottom(80))));

        register(context, NETHER_RUBY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.aboveBottom(30),
                                VerticalAnchor.aboveBottom(100))));

        register(context, END_RUBY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.aboveBottom(45),
                                VerticalAnchor.aboveBottom(30))));*/
        //</editor-fold>

        //<editor-fold desc="SAPPHIRE_ORE">
        /*register(context, SAPPHIRE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(16,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.aboveBottom(5),
                                VerticalAnchor.aboveBottom(124))));

        register(context, NETHER_SAPPHIRE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.aboveBottom(30),
                                VerticalAnchor.aboveBottom(100))));

        register(context, END_SAPPHIRE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(
                                VerticalAnchor.aboveBottom(45),
                                VerticalAnchor.aboveBottom(30))));*/
        //</editor-fold>
    }

    //<editor-fold desc="HELPER METHODS">
    private static ResourceKey<PlacedFeature> createKey(String name)
    {
        return ResourceKey.create(Registries.PLACED_FEATURE, Reference.Location(name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                 Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers)
    {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                 Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers)
    {
        context.register(key, new PlacedFeature(configuration, List.of(modifiers)));
    }
    //</editor-fold>
}