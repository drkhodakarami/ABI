package jiraiyah.abi.datagen;

import jiraiyah.abi.Reference;
import jiraiyah.abi.datagen.custom.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.biome.Biomes;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(),
                new ModRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(),
                ModLootTableProvider.Create(packOutput));
        generator.addProvider(event.includeServer(),
                new ModWorldGenProvider(packOutput, lookupProvider));

        ModBlockTagsProvider blockTagsProvider = generator.addProvider(event.includeServer(),
                new ModBlockTagsProvider(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(),
                new ModItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));

        generator.addProvider(event.includeClient(),
                new ModBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(),
                new ModItemModelProvider(packOutput, existingFileHelper));
    }
}

/*
// in GatherDataEvent
RegistrySetBuilder registrySetBuilder = new RegistrySetBuilder()
        .add(ForgeRegistries.Keys.BIOME_MODIFIERS, context -> {
            // create and register all your biome modifier instances to datagen
            context.register(Tags.Biomes.IS_DESERT, new ForgeBiomeModifiers.AddSpawnsBiomeModifier( , ));
        });

DatapackBuiltinEntriesProvider dbep = new DatapackBuiltinEntriesProvider(
        packOutput,
        event.getLookupProvider(),
        registrySetBuilder,
        Set.of(Reference.MODID));
generator.addProvider(true, dbep);*/