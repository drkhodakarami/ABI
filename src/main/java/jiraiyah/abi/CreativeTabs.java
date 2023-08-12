package jiraiyah.abi;

import jiraiyah.abi.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Reference.MODID);

    public static final RegistryObject<CreativeModeTab> DUST = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.DUST + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.BUILDING_BLOCKS)
                    .icon(() -> ModItems.Dust.ALUMITE.get().getDefaultInstance())
                    .title(Component.translatable(Reference.Names.CREATIVE_TAB + Reference.MODID + "_" + Reference.Names.DUST + "tab"))
                    .displayItems((parameters, output) ->
                    {
                        output.accept(ModItems.Dust.ALUMINIUM.get());
                        output.accept(ModItems.Dust.ALUMINIUM_BRASS.get());
                        output.accept(ModItems.Dust.ALUMITE.get());
                        output.accept(ModItems.Dust.ARDITE.get());
                        output.accept(ModItems.Dust.BERYLLIUM.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> GEAR = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.GEAR + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.BUILDING_BLOCKS)
                    .withTabsBefore(CreativeTabs.DUST.getId())
                    .icon(() -> ModItems.Gear.ALUMITE.get().getDefaultInstance())
                    .title(Component.translatable(Reference.Names.CREATIVE_TAB + Reference.MODID + "_" + Reference.Names.GEAR + "tab"))
                    .displayItems((parameters, output) ->
                    {
                        output.accept(ModItems.Gear.ALUMINIUM.get());
                        output.accept(ModItems.Gear.ALUMINIUM_BRASS.get());
                        output.accept(ModItems.Gear.ALUMITE.get());
                        output.accept(ModItems.Gear.ARDITE.get());
                        output.accept(ModItems.Gear.BERYLLIUM.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> INGOT = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.INGOT + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.BUILDING_BLOCKS)
                    .withTabsBefore(CreativeTabs.GEAR.getId())
                    .icon(() -> ModItems.Ingot.ALUMITE.get().getDefaultInstance())
                    .title(Component.translatable(Reference.Names.CREATIVE_TAB + Reference.MODID + "_" + Reference.Names.INGOT + "tab"))
                    .displayItems((parameters, output) ->
                    {
                        output.accept(ModItems.Ingot.ALUMINIUM.get());
                        output.accept(ModItems.Ingot.ALUMINIUM_BRASS.get());
                        output.accept(ModItems.Ingot.ALUMITE.get());
                        output.accept(ModItems.Ingot.ARDITE.get());
                        output.accept(ModItems.Ingot.BERYLLIUM.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> NUGGET = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.NUGGET + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.BUILDING_BLOCKS)
                    .withTabsBefore(CreativeTabs.INGOT.getId())
                    .icon(() -> ModItems.Nugget.ALUMITE.get().getDefaultInstance())
                    .title(Component.translatable(Reference.Names.CREATIVE_TAB + Reference.MODID + "_" + Reference.Names.NUGGET + "tab"))
                    .displayItems((parameters, output) ->
                    {
                        output.accept(ModItems.Nugget.ALUMINIUM.get());
                        output.accept(ModItems.Nugget.ALUMINIUM_BRASS.get());
                        output.accept(ModItems.Nugget.ALUMITE.get());
                        output.accept(ModItems.Nugget.ARDITE.get());
                        output.accept(ModItems.Nugget.BERYLLIUM.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> PLATE = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.PLATE + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.BUILDING_BLOCKS)
                    .withTabsBefore(CreativeTabs.NUGGET.getId())
                    .icon(() -> ModItems.Plate.ALUMITE.get().getDefaultInstance())
                    .title(Component.translatable(Reference.Names.CREATIVE_TAB + Reference.MODID + "_" + Reference.Names.PLATE + "tab"))
                    .displayItems((parameters, output) ->
                    {
                        output.accept(ModItems.Plate.ALUMINIUM.get());
                        output.accept(ModItems.Plate.ALUMINIUM_BRASS.get());
                        output.accept(ModItems.Plate.ALUMITE.get());
                        output.accept(ModItems.Plate.ARDITE.get());
                        output.accept(ModItems.Plate.BERYLLIUM.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> RAW = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.RAW + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.BUILDING_BLOCKS)
                    .withTabsBefore(CreativeTabs.PLATE.getId())
                    .icon(() -> ModItems.Raw.ALUMITE.get().getDefaultInstance())
                    .title(Component.translatable(Reference.Names.CREATIVE_TAB + Reference.MODID + "_" + Reference.Names.RAW + "tab"))
                    .displayItems((parameters, output) ->
                    {
                        output.accept(ModItems.Raw.ALUMINIUM.get());
                        output.accept(ModItems.Raw.ALUMINIUM_BRASS.get());
                        output.accept(ModItems.Raw.ALUMITE.get());
                        output.accept(ModItems.Raw.ARDITE.get());
                        output.accept(ModItems.Raw.BERYLLIUM.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> REINFORCED = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.REINFORCED + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.BUILDING_BLOCKS)
                    .withTabsBefore(CreativeTabs.RAW.getId())
                    .icon(() -> ModItems.Reinforced.ALUMITE.get().getDefaultInstance())
                    .title(Component.translatable(Reference.Names.CREATIVE_TAB + Reference.MODID + "_" + Reference.Names.REINFORCED + "tab"))
                    .displayItems((parameters, output) ->
                    {
                        output.accept(ModItems.Reinforced.ALUMINIUM.get());
                        output.accept(ModItems.Reinforced.ALUMINIUM_BRASS.get());
                        output.accept(ModItems.Reinforced.ALUMITE.get());
                        output.accept(ModItems.Reinforced.ARDITE.get());
                        output.accept(ModItems.Reinforced.BERYLLIUM.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> ROD = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.ROD + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.BUILDING_BLOCKS)
                    .withTabsBefore(CreativeTabs.REINFORCED.getId())
                    .icon(() -> ModItems.Rod.ALUMITE.get().getDefaultInstance())
                    .title(Component.translatable(Reference.Names.CREATIVE_TAB + Reference.MODID + "_" + Reference.Names.ROD + "tab"))
                    .displayItems((parameters, output) ->
                    {
                        output.accept(ModItems.Rod.ALUMINIUM.get());
                        output.accept(ModItems.Rod.ALUMINIUM_BRASS.get());
                        output.accept(ModItems.Rod.ALUMITE.get());
                        output.accept(ModItems.Rod.ARDITE.get());
                        output.accept(ModItems.Rod.BERYLLIUM.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> TOOL = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.TOOL + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.BUILDING_BLOCKS)
                    .withTabsBefore(CreativeTabs.ROD.getId())
                    .icon(() -> ModItems.Tool.SPANNER.get().getDefaultInstance())
                    .title(Component.translatable(Reference.Names.CREATIVE_TAB + Reference.MODID + "_" + Reference.Names.TOOL + "tab"))
                    .displayItems((parameters, output) ->
                    {
                        output.accept(ModItems.Tool.SPANNER.get());

                    }).build());
}