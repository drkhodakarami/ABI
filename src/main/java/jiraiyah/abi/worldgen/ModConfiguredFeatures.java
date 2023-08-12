package jiraiyah.abi.worldgen;

import jiraiyah.abi.Reference;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

public class ModConfiguredFeatures
{
    public static void Bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context)
    {

    }

    //<editor-fold desc="HELPER METHODS">
    public static ResourceKey<ConfiguredFeature<?, ?>> RegisterKey(String name)
    {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Reference.Location(name));
    }

    public static <FC extends FeatureConfiguration, F extends Feature<FC>> void Register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                         ResourceKey<ConfiguredFeature<?, ?>> key,
                                                                                         F feature, FC configuration)
    {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
    //</editor-fold>
}