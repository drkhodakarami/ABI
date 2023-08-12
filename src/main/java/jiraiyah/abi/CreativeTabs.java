package jiraiyah.abi;

import jiraiyah.abi.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
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
                        output.accept(ModItems.Dust.BLUTONIUM.get());
                        output.accept(ModItems.Dust.BORON.get());
                        output.accept(ModItems.Dust.BRASS.get());
                        output.accept(ModItems.Dust.BRONZE.get());
                        output.accept(ModItems.Dust.COBALT.get());
                        output.accept(ModItems.Dust.CONDUCTIVE_IRON.get());
                        output.accept(ModItems.Dust.CONSTANTAN.get());
                        output.accept(ModItems.Dust.COPPER.get());
                        output.accept(ModItems.Dust.CRUDE_STEEL.get());
                        output.accept(ModItems.Dust.CYANIDE.get());
                        output.accept(ModItems.Dust.DARK_STEEL.get());
                        output.accept(ModItems.Dust.DAWN_STONE.get());
                        output.accept(ModItems.Dust.DEMONICUM.get());
                        output.accept(ModItems.Dust.DRACONIUM.get());
                        output.accept(ModItems.Dust.ELECTRICAL_STEEL.get());
                        output.accept(ModItems.Dust.ELECTRUM.get());
                        output.accept(ModItems.Dust.ENCHANTIUM.get());
                        output.accept(ModItems.Dust.END_STEEL.get());
                        output.accept(ModItems.Dust.ENDERITE.get());
                        output.accept(ModItems.Dust.ENERGETIC_SILVER.get());
                        output.accept(ModItems.Dust.GOLD.get());
                        output.accept(ModItems.Dust.GRAPHITE.get());
                        output.accept(ModItems.Dust.INVAR.get());
                        output.accept(ModItems.Dust.IRIDIUM.get());
                        output.accept(ModItems.Dust.IRON.get());
                        output.accept(ModItems.Dust.LEAD.get());
                        output.accept(ModItems.Dust.LITHIUM.get());
                        output.accept(ModItems.Dust.LUDICRITE.get());
                        output.accept(ModItems.Dust.MAGNESIUM.get());
                        output.accept(ModItems.Dust.MANGANESE.get());
                        output.accept(ModItems.Dust.STEEL.get());
                        output.accept(ModItems.Dust.TIN.get());
                        output.accept(ModItems.Dust.YELLORIUM.get());
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
                        output.accept(ModItems.Gear.BLUTONIUM.get());
                        output.accept(ModItems.Gear.BORON.get());
                        output.accept(ModItems.Gear.BRASS.get());
                        output.accept(ModItems.Gear.BRONZE.get());
                        output.accept(ModItems.Gear.COBALT.get());
                        output.accept(ModItems.Gear.CONDUCTIVE_IRON.get());
                        output.accept(ModItems.Gear.CONSTANTAN.get());
                        output.accept(ModItems.Gear.COPPER.get());
                        output.accept(ModItems.Gear.CRUDE_STEEL.get());
                        output.accept(ModItems.Gear.CYANIDE.get());
                        output.accept(ModItems.Gear.DARK_STEEL.get());
                        output.accept(ModItems.Gear.DAWN_STONE.get());
                        output.accept(ModItems.Gear.DEMONICUM.get());
                        output.accept(ModItems.Gear.DRACONIUM.get());
                        output.accept(ModItems.Gear.ELECTRICAL_STEEL.get());
                        output.accept(ModItems.Gear.ELECTRUM.get());
                        output.accept(ModItems.Gear.ENCHANTIUM.get());
                        output.accept(ModItems.Gear.END_STEEL.get());
                        output.accept(ModItems.Gear.ENDERITE.get());
                        output.accept(ModItems.Gear.ENERGETIC_SILVER.get());
                        output.accept(ModItems.Gear.GOLD.get());
                        output.accept(ModItems.Gear.GRAPHITE.get());
                        output.accept(ModItems.Gear.INVAR.get());
                        output.accept(ModItems.Gear.IRIDIUM.get());
                        output.accept(ModItems.Gear.IRON.get());
                        output.accept(ModItems.Gear.LEAD.get());
                        output.accept(ModItems.Gear.LITHIUM.get());
                        output.accept(ModItems.Gear.LUDICRITE.get());
                        output.accept(ModItems.Gear.MAGNESIUM.get());
                        output.accept(ModItems.Gear.MANGANESE.get());
                        output.accept(ModItems.Gear.STEEL.get());
                        output.accept(ModItems.Gear.TIN.get());
                        output.accept(ModItems.Gear.YELLORIUM.get());
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
                        output.accept(ModItems.Ingot.BLUTONIUM.get());
                        output.accept(ModItems.Ingot.BORON.get());
                        output.accept(ModItems.Ingot.BRASS.get());
                        output.accept(ModItems.Ingot.BRONZE.get());
                        output.accept(ModItems.Ingot.COBALT.get());
                        output.accept(ModItems.Ingot.CONDUCTIVE_IRON.get());
                        output.accept(ModItems.Ingot.CONSTANTAN.get());
                        output.accept(Items.COPPER_INGOT);
                        output.accept(ModItems.Ingot.CRUDE_STEEL.get());
                        output.accept(ModItems.Ingot.CYANIDE.get());
                        output.accept(ModItems.Ingot.DARK_STEEL.get());
                        output.accept(ModItems.Ingot.DAWN_STONE.get());
                        output.accept(ModItems.Ingot.DEMONICUM.get());
                        output.accept(ModItems.Ingot.DRACONIUM.get());
                        output.accept(ModItems.Ingot.ELECTRICAL_STEEL.get());
                        output.accept(ModItems.Ingot.ELECTRUM.get());
                        output.accept(ModItems.Ingot.ENCHANTIUM.get());
                        output.accept(ModItems.Ingot.END_STEEL.get());
                        output.accept(ModItems.Ingot.ENDERITE.get());
                        output.accept(ModItems.Ingot.ENERGETIC_SILVER.get());
                        output.accept(Items.GOLD_INGOT);
                        output.accept(ModItems.Ingot.GRAPHITE.get());
                        output.accept(ModItems.Ingot.INVAR.get());
                        output.accept(ModItems.Ingot.IRIDIUM.get());
                        output.accept(Items.IRON_INGOT);
                        output.accept(ModItems.Ingot.LEAD.get());
                        output.accept(ModItems.Ingot.LITHIUM.get());
                        output.accept(ModItems.Ingot.LUDICRITE.get());
                        output.accept(ModItems.Ingot.MAGNESIUM.get());
                        output.accept(ModItems.Ingot.MANGANESE.get());
                        output.accept(ModItems.Ingot.STEEL.get());
                        output.accept(ModItems.Ingot.TIN.get());
                        output.accept(ModItems.Ingot.YELLORIUM.get());
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
                        output.accept(ModItems.Nugget.BLUTONIUM.get());
                        output.accept(ModItems.Nugget.BORON.get());
                        output.accept(ModItems.Nugget.BRASS.get());
                        output.accept(ModItems.Nugget.BRONZE.get());
                        output.accept(ModItems.Nugget.COBALT.get());
                        output.accept(ModItems.Nugget.CONDUCTIVE_IRON.get());
                        output.accept(ModItems.Nugget.CONSTANTAN.get());
                        output.accept(ModItems.Nugget.COPPER.get());
                        output.accept(ModItems.Nugget.CRUDE_STEEL.get());
                        output.accept(ModItems.Nugget.CYANIDE.get());
                        output.accept(ModItems.Nugget.DARK_STEEL.get());
                        output.accept(ModItems.Nugget.DAWN_STONE.get());
                        output.accept(ModItems.Nugget.DEMONICUM.get());
                        output.accept(ModItems.Nugget.DRACONIUM.get());
                        output.accept(ModItems.Nugget.ELECTRICAL_STEEL.get());
                        output.accept(ModItems.Nugget.ELECTRUM.get());
                        output.accept(ModItems.Nugget.ENCHANTIUM.get());
                        output.accept(ModItems.Nugget.END_STEEL.get());
                        output.accept(ModItems.Nugget.ENDERITE.get());
                        output.accept(ModItems.Nugget.ENERGETIC_SILVER.get());
                        output.accept(Items.GOLD_NUGGET);
                        output.accept(ModItems.Nugget.GRAPHITE.get());
                        output.accept(ModItems.Nugget.INVAR.get());
                        output.accept(ModItems.Nugget.IRIDIUM.get());
                        output.accept(Items.IRON_NUGGET);
                        output.accept(ModItems.Nugget.LEAD.get());
                        output.accept(ModItems.Nugget.LITHIUM.get());
                        output.accept(ModItems.Nugget.LUDICRITE.get());
                        output.accept(ModItems.Nugget.MAGNESIUM.get());
                        output.accept(ModItems.Nugget.MANGANESE.get());
                        output.accept(ModItems.Nugget.STEEL.get());
                        output.accept(ModItems.Nugget.TIN.get());
                        output.accept(ModItems.Nugget.YELLORIUM.get());
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
                        output.accept(ModItems.Plate.BLUTONIUM.get());
                        output.accept(ModItems.Plate.BORON.get());
                        output.accept(ModItems.Plate.BRASS.get());
                        output.accept(ModItems.Plate.BRONZE.get());
                        output.accept(ModItems.Plate.COBALT.get());
                        output.accept(ModItems.Plate.CONDUCTIVE_IRON.get());
                        output.accept(ModItems.Plate.CONSTANTAN.get());
                        output.accept(ModItems.Plate.COPPER.get());
                        output.accept(ModItems.Plate.CRUDE_STEEL.get());
                        output.accept(ModItems.Plate.CYANIDE.get());
                        output.accept(ModItems.Plate.DARK_STEEL.get());
                        output.accept(ModItems.Plate.DAWN_STONE.get());
                        output.accept(ModItems.Plate.DEMONICUM.get());
                        output.accept(ModItems.Plate.DRACONIUM.get());
                        output.accept(ModItems.Plate.ELECTRICAL_STEEL.get());
                        output.accept(ModItems.Plate.ELECTRUM.get());
                        output.accept(ModItems.Plate.ENCHANTIUM.get());
                        output.accept(ModItems.Plate.END_STEEL.get());
                        output.accept(ModItems.Plate.ENDERITE.get());
                        output.accept(ModItems.Plate.ENERGETIC_SILVER.get());
                        output.accept(ModItems.Plate.GOLD.get());
                        output.accept(ModItems.Plate.GRAPHITE.get());
                        output.accept(ModItems.Plate.INVAR.get());
                        output.accept(ModItems.Plate.IRIDIUM.get());
                        output.accept(ModItems.Plate.IRON.get());
                        output.accept(ModItems.Plate.LEAD.get());
                        output.accept(ModItems.Plate.LITHIUM.get());
                        output.accept(ModItems.Plate.LUDICRITE.get());
                        output.accept(ModItems.Plate.MAGNESIUM.get());
                        output.accept(ModItems.Plate.MANGANESE.get());
                        output.accept(ModItems.Plate.STEEL.get());
                        output.accept(ModItems.Plate.TIN.get());
                        output.accept(ModItems.Plate.YELLORIUM.get());
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
                        output.accept(ModItems.Raw.BLUTONIUM.get());
                        output.accept(ModItems.Raw.BORON.get());
                        output.accept(ModItems.Raw.BRASS.get());
                        output.accept(ModItems.Raw.BRONZE.get());
                        output.accept(ModItems.Raw.COBALT.get());
                        output.accept(ModItems.Raw.CONDUCTIVE_IRON.get());
                        output.accept(ModItems.Raw.CONSTANTAN.get());
                        output.accept(Items.RAW_COPPER);
                        output.accept(ModItems.Raw.CRUDE_STEEL.get());
                        output.accept(ModItems.Raw.CYANIDE.get());
                        output.accept(ModItems.Raw.DARK_STEEL.get());
                        output.accept(ModItems.Raw.DAWN_STONE.get());
                        output.accept(ModItems.Raw.DEMONICUM.get());
                        output.accept(ModItems.Raw.DRACONIUM.get());
                        output.accept(ModItems.Raw.ELECTRICAL_STEEL.get());
                        output.accept(ModItems.Raw.ELECTRUM.get());
                        output.accept(ModItems.Raw.ENCHANTIUM.get());
                        output.accept(ModItems.Raw.END_STEEL.get());
                        output.accept(ModItems.Raw.ENDERITE.get());
                        output.accept(ModItems.Raw.ENERGETIC_SILVER.get());
                        output.accept(Items.RAW_GOLD);
                        output.accept(ModItems.Raw.GRAPHITE.get());
                        output.accept(ModItems.Raw.INVAR.get());
                        output.accept(ModItems.Raw.IRIDIUM.get());
                        output.accept(Items.RAW_IRON);
                        output.accept(ModItems.Raw.LEAD.get());
                        output.accept(ModItems.Raw.LITHIUM.get());
                        output.accept(ModItems.Raw.LUDICRITE.get());
                        output.accept(ModItems.Raw.MAGNESIUM.get());
                        output.accept(ModItems.Raw.MANGANESE.get());
                        output.accept(ModItems.Raw.STEEL.get());
                        output.accept(ModItems.Raw.TIN.get());
                        output.accept(ModItems.Raw.YELLORIUM.get());
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
                        output.accept(ModItems.Reinforced.BLUTONIUM.get());
                        output.accept(ModItems.Reinforced.BORON.get());
                        output.accept(ModItems.Reinforced.BRASS.get());
                        output.accept(ModItems.Reinforced.BRONZE.get());
                        output.accept(ModItems.Reinforced.COBALT.get());
                        output.accept(ModItems.Reinforced.CONDUCTIVE_IRON.get());
                        output.accept(ModItems.Reinforced.CONSTANTAN.get());
                        output.accept(ModItems.Reinforced.COPPER.get());
                        output.accept(ModItems.Reinforced.CRUDE_STEEL.get());
                        output.accept(ModItems.Reinforced.CYANIDE.get());
                        output.accept(ModItems.Reinforced.DARK_STEEL.get());
                        output.accept(ModItems.Reinforced.DAWN_STONE.get());
                        output.accept(ModItems.Reinforced.DEMONICUM.get());
                        output.accept(ModItems.Reinforced.DRACONIUM.get());
                        output.accept(ModItems.Reinforced.ELECTRICAL_STEEL.get());
                        output.accept(ModItems.Reinforced.ELECTRUM.get());
                        output.accept(ModItems.Reinforced.ENCHANTIUM.get());
                        output.accept(ModItems.Reinforced.END_STEEL.get());
                        output.accept(ModItems.Reinforced.ENDERITE.get());
                        output.accept(ModItems.Reinforced.ENERGETIC_SILVER.get());
                        output.accept(ModItems.Reinforced.GOLD.get());
                        output.accept(ModItems.Reinforced.GRAPHITE.get());
                        output.accept(ModItems.Reinforced.INVAR.get());
                        output.accept(ModItems.Reinforced.IRIDIUM.get());
                        output.accept(ModItems.Reinforced.IRON.get());
                        output.accept(ModItems.Reinforced.LEAD.get());
                        output.accept(ModItems.Reinforced.LITHIUM.get());
                        output.accept(ModItems.Reinforced.LUDICRITE.get());
                        output.accept(ModItems.Reinforced.MAGNESIUM.get());
                        output.accept(ModItems.Reinforced.MANGANESE.get());
                        output.accept(ModItems.Reinforced.STEEL.get());
                        output.accept(ModItems.Reinforced.TIN.get());
                        output.accept(ModItems.Reinforced.YELLORIUM.get());
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
                        output.accept(ModItems.Rod.BLUTONIUM.get());
                        output.accept(ModItems.Rod.BORON.get());
                        output.accept(ModItems.Rod.BRASS.get());
                        output.accept(ModItems.Rod.BRONZE.get());
                        output.accept(ModItems.Rod.COBALT.get());
                        output.accept(ModItems.Rod.CONDUCTIVE_IRON.get());
                        output.accept(ModItems.Rod.CONSTANTAN.get());
                        output.accept(ModItems.Rod.COPPER.get());
                        output.accept(ModItems.Rod.CRUDE_STEEL.get());
                        output.accept(ModItems.Rod.CYANIDE.get());
                        output.accept(ModItems.Rod.DARK_STEEL.get());
                        output.accept(ModItems.Rod.DAWN_STONE.get());
                        output.accept(ModItems.Rod.DEMONICUM.get());
                        output.accept(ModItems.Rod.DRACONIUM.get());
                        output.accept(ModItems.Rod.ELECTRICAL_STEEL.get());
                        output.accept(ModItems.Rod.ELECTRUM.get());
                        output.accept(ModItems.Rod.ENCHANTIUM.get());
                        output.accept(ModItems.Rod.END_STEEL.get());
                        output.accept(ModItems.Rod.ENDERITE.get());
                        output.accept(ModItems.Rod.ENERGETIC_SILVER.get());
                        output.accept(ModItems.Rod.GOLD.get());
                        output.accept(ModItems.Rod.GRAPHITE.get());
                        output.accept(ModItems.Rod.INVAR.get());
                        output.accept(ModItems.Rod.IRIDIUM.get());
                        output.accept(ModItems.Rod.IRON.get());
                        output.accept(ModItems.Rod.LEAD.get());
                        output.accept(ModItems.Rod.LITHIUM.get());
                        output.accept(ModItems.Rod.LUDICRITE.get());
                        output.accept(ModItems.Rod.MAGNESIUM.get());
                        output.accept(ModItems.Rod.MANGANESE.get());
                        output.accept(ModItems.Rod.STEEL.get());
                        output.accept(ModItems.Rod.TIN.get());
                        output.accept(ModItems.Rod.YELLORIUM.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> GEM = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.GEM + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.BUILDING_BLOCKS)
                    .withTabsBefore(CreativeTabs.ROD.getId())
                    .icon(() -> ModItems.Gem.RUBY.get().getDefaultInstance())
                    .title(Component.translatable(Reference.Names.CREATIVE_TAB + Reference.MODID + "_" + Reference.Names.GEM + "tab"))
                    .displayItems((parameters, output) ->
                    {
                        output.accept(ModItems.Gem.RUBY.get());
                        output.accept(ModItems.Gem.SAPPHIRE.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> TOOL = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.TOOL + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.BUILDING_BLOCKS)
                    .withTabsBefore(CreativeTabs.GEM.getId())
                    .icon(() -> ModItems.Tool.KNIFE.get().getDefaultInstance())
                    .title(Component.translatable(Reference.Names.CREATIVE_TAB + Reference.MODID + "_" + Reference.Names.TOOL + "tab"))
                    .displayItems((parameters, output) ->
                    {
                        output.accept(ModItems.Tool.AUGMENT.get());
                        output.accept(ModItems.Tool.CUTTER.get());
                        output.accept(ModItems.Tool.DOWSING_ROD.get());
                        output.accept(ModItems.Tool.ENGINEER_HELMET.get());
                        output.accept(ModItems.Tool.KNIFE.get());
                        output.accept(ModItems.Tool.SPANNER.get());
                        output.accept(ModItems.Tool.TUNER.get());
                        output.accept(ModItems.Tool.WRENCH.get());
                    }).build());
}