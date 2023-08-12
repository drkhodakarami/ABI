package jiraiyah.abi.worldgen;

import jiraiyah.abi.Reference;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures
{
    public static void Bootstrap(BootstapContext<PlacedFeature> context)
    {

    }

    //<editor-fold desc="HELPER METHODS">
    private static ResourceKey<PlacedFeature> CreateKey(String name)
    {
        return ResourceKey.create(Registries.PLACED_FEATURE, Reference.Location(name));
    }

    private static void Register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                 Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers)
    {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void Register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                 Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers)
    {
        context.register(key, new PlacedFeature(configuration, List.of(modifiers)));
    }
    //</editor-fold>
}