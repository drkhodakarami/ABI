package jiraiyah.abi;

import jiraiyah.abi.block.ModBlocks;
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
                    .withTabsAfter(CreativeModeTabs.COLORED_BLOCKS)
                    .withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS)
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
                        output.accept(ModItems.Dust.DEMONIUM.get());
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
                        output.accept(ModItems.Dust.NICKEL.get());
                        output.accept(ModItems.Dust.SILVER.get());
                        output.accept(ModItems.Dust.STEEL.get());
                        output.accept(ModItems.Dust.TIN.get());
                        output.accept(ModItems.Dust.YELLORIUM.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> GEAR = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.GEAR + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.COLORED_BLOCKS)
                    .withTabsBefore(CreativeTabs.DUST.getId())
                    .withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS)
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
                        output.accept(ModItems.Gear.DEMONIUM.get());
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
                        output.accept(ModItems.Gear.NICKEL.get());
                        output.accept(ModItems.Gear.SILVER.get());
                        output.accept(ModItems.Gear.STEEL.get());
                        output.accept(ModItems.Gear.TIN.get());
                        output.accept(ModItems.Gear.YELLORIUM.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> INGOT = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.INGOT + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.COLORED_BLOCKS)
                    .withTabsBefore(CreativeTabs.GEAR.getId())
                    .withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS)
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
                        output.accept(ModItems.Ingot.DEMONIUM.get());
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
                        output.accept(ModItems.Ingot.NICKEL.get());
                        output.accept(ModItems.Ingot.SILVER.get());
                        output.accept(ModItems.Ingot.STEEL.get());
                        output.accept(ModItems.Ingot.TIN.get());
                        output.accept(ModItems.Ingot.YELLORIUM.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> NUGGET = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.NUGGET + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.COLORED_BLOCKS)
                    .withTabsBefore(CreativeTabs.INGOT.getId())
                    .withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS)
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
                        output.accept(ModItems.Nugget.DEMONIUM.get());
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
                        output.accept(ModItems.Nugget.NICKEL.get());
                        output.accept(ModItems.Nugget.SILVER.get());
                        output.accept(ModItems.Nugget.STEEL.get());
                        output.accept(ModItems.Nugget.TIN.get());
                        output.accept(ModItems.Nugget.YELLORIUM.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> PLATE = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.PLATE + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.COLORED_BLOCKS)
                    .withTabsBefore(CreativeTabs.NUGGET.getId())
                    .withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS)
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
                        output.accept(ModItems.Plate.DEMONIUM.get());
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
                        output.accept(ModItems.Plate.NICKEL.get());
                        output.accept(ModItems.Plate.SILVER.get());
                        output.accept(ModItems.Plate.STEEL.get());
                        output.accept(ModItems.Plate.TIN.get());
                        output.accept(ModItems.Plate.YELLORIUM.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> RAW = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.RAW + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.COLORED_BLOCKS)
                    .withTabsBefore(CreativeTabs.PLATE.getId())
                    .withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS)
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
                        output.accept(ModItems.Raw.DEMONIUM.get());
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
                        output.accept(ModItems.Raw.NICKEL.get());
                        output.accept(ModItems.Raw.SILVER.get());
                        output.accept(ModItems.Raw.STEEL.get());
                        output.accept(ModItems.Raw.TIN.get());
                        output.accept(ModItems.Raw.YELLORIUM.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> REINFORCED = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.REINFORCED + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.COLORED_BLOCKS)
                    .withTabsBefore(CreativeTabs.RAW.getId())
                    .withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS)
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
                        output.accept(ModItems.Reinforced.DEMONIUM.get());
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
                        output.accept(ModItems.Reinforced.NICKEL.get());
                        output.accept(ModItems.Reinforced.SILVER.get());
                        output.accept(ModItems.Reinforced.STEEL.get());
                        output.accept(ModItems.Reinforced.TIN.get());
                        output.accept(ModItems.Reinforced.YELLORIUM.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> ROD = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.ROD + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.COLORED_BLOCKS)
                    .withTabsBefore(CreativeTabs.REINFORCED.getId())
                    .withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS)
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
                        output.accept(ModItems.Rod.DEMONIUM.get());
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
                        output.accept(ModItems.Rod.NICKEL.get());
                        output.accept(ModItems.Rod.SILVER.get());
                        output.accept(ModItems.Rod.STEEL.get());
                        output.accept(ModItems.Rod.TIN.get());
                        output.accept(ModItems.Rod.YELLORIUM.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> GEM = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.GEM + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.COLORED_BLOCKS)
                    .withTabsBefore(CreativeTabs.ROD.getId())
                    .withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS)
                    .icon(() -> ModItems.Gem.RUBY.get().getDefaultInstance())
                    .title(Component.translatable(Reference.Names.CREATIVE_TAB + Reference.MODID + "_" + Reference.Names.GEM + "tab"))
                    .displayItems((parameters, output) ->
                    {
                        output.accept(Items.DIAMOND);
                        output.accept(Items.EMERALD);
                        output.accept(ModItems.Gem.RUBY.get());
                        output.accept(ModItems.Gem.SAPPHIRE.get());
                        output.accept(Items.QUARTZ);
                        output.accept(ModItems.Gem.DIAMOND_SHARD.get());
                        output.accept(ModItems.Gem.EMERALD_SHARD.get());
                        output.accept(Items.PRISMARINE_SHARD);
                        output.accept(ModItems.Gem.QUARTZ_SHARD.get());
                        output.accept(ModItems.Gem.RUBY_SHARD.get());
                        output.accept(ModItems.Gem.SAPPHIRE_SHARD.get());

                        output.accept(ModBlocks.Gem.RUBY_BLOCK.get());
                        output.accept(ModBlocks.Gem.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.Gem.SLIME_BLOCK.get());

                        output.accept(ModBlocks.Ingots.BRONZE_BLOCK.get());
                        output.accept(ModBlocks.Ingots.CONSTANTAN_BLOCK.get());
                        output.accept(ModBlocks.Ingots.ELECTRUM_BLOCK.get());
                        output.accept(ModBlocks.Ingots.ENDERITE_BLOCK.get());
                        output.accept(ModBlocks.Ingots.INVAR_BLOCK.get());
                        output.accept(ModBlocks.Ingots.LEAD_BLOCK.get());
                        output.accept(ModBlocks.Ingots.LUMIUM_BLOCK.get());
                        output.accept(ModBlocks.Ingots.RAW_LEAD_BLOCK.get());
                        output.accept(ModBlocks.Ingots.RAW_NICKEL_BLOCK.get());
                        output.accept(ModBlocks.Ingots.RAW_SILVER_BLOCK.get());
                        output.accept(ModBlocks.Ingots.RAW_TIN_BLOCK.get());
                        output.accept(ModBlocks.Ingots.SIGNALUM_BLOCK.get());
                        output.accept(ModBlocks.Ingots.SILVER_BLOCK.get());
                        output.accept(ModBlocks.Ingots.STEEL_BLOCK.get());
                        output.accept(ModBlocks.Ingots.SULFUR_BLOCK.get());
                        output.accept(ModBlocks.Ingots.TIN_BLOCK.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> TOOL = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.TOOL + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.COLORED_BLOCKS)
                    .withTabsBefore(CreativeTabs.GEM.getId())
                    .withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS)
                    .icon(() -> ModItems.Tool.KNIFE.get().getDefaultInstance())
                    .title(Component.translatable(Reference.Names.CREATIVE_TAB + Reference.MODID + "_" + Reference.Names.TOOL + "tab"))
                    .displayItems((parameters, output) ->
                    {
                        output.accept(ModItems.Tool.AUGMENT.get());
                        output.accept(ModItems.Tool.CUTTER.get());
                        output.accept(ModItems.Tool.DOWSING_ROD.get());
                        output.accept(ModItems.Tool.KNIFE.get());
                        output.accept(ModItems.Tool.SPANNER.get());
                        output.accept(ModItems.Tool.TUNER.get());
                        output.accept(ModItems.Tool.WRENCH.get());

                        output.accept(ModItems.Tool.RUBY_BOW.get());
                        output.accept(ModItems.Tool.SAPPHIRE_BOW.get());

                        output.accept(ModItems.Tool.BRONZE_AXE.get());
                        output.accept(ModItems.Tool.CONSTANTAN_AXE.get());
                        output.accept(ModItems.Tool.COPPER_AXE.get());
                        output.accept(ModItems.Tool.ELECTRUM_AXE.get());
                        output.accept(ModItems.Tool.EMERALD_AXE.get());
                        output.accept(ModItems.Tool.INVAR_AXE.get());
                        output.accept(ModItems.Tool.LEAD_AXE.get());
                        output.accept(ModItems.Tool.NICKEL_AXE.get());
                        output.accept(ModItems.Tool.RUBY_AXE.get());
                        output.accept(ModItems.Tool.SAPPHIRE_AXE.get());
                        output.accept(ModItems.Tool.SILVER_AXE.get());
                        output.accept(ModItems.Tool.TIN_AXE.get());

                        output.accept(ModItems.Tool.BRONZE_HAMMER.get());
                        output.accept(ModItems.Tool.CONSTANTAN_HAMMER.get());
                        output.accept(ModItems.Tool.COPPER_HAMMER.get());
                        output.accept(ModItems.Tool.ELECTRUM_HAMMER.get());
                        output.accept(ModItems.Tool.EMERALD_HAMMER.get());
                        output.accept(ModItems.Tool.INVAR_HAMMER.get());
                        output.accept(ModItems.Tool.LEAD_HAMMER.get());
                        output.accept(ModItems.Tool.NICKEL_HAMMER.get());
                        output.accept(ModItems.Tool.RUBY_HAMMER.get());
                        output.accept(ModItems.Tool.SAPPHIRE_HAMMER.get());
                        output.accept(ModItems.Tool.SILVER_HAMMER.get());
                        output.accept(ModItems.Tool.TIN_HAMMER.get());

                        output.accept(ModItems.Tool.BRONZE_HOE.get());
                        output.accept(ModItems.Tool.CONSTANTAN_HOE.get());
                        output.accept(ModItems.Tool.COPPER_HOE.get());
                        output.accept(ModItems.Tool.ELECTRUM_HOE.get());
                        output.accept(ModItems.Tool.EMERALD_HOE.get());
                        output.accept(ModItems.Tool.INVAR_HOE.get());
                        output.accept(ModItems.Tool.LEAD_HOE.get());
                        output.accept(ModItems.Tool.NICKEL_HOE.get());
                        output.accept(ModItems.Tool.RUBY_HOE.get());
                        output.accept(ModItems.Tool.SAPPHIRE_HOE.get());
                        output.accept(ModItems.Tool.SILVER_HOE.get());
                        output.accept(ModItems.Tool.TIN_HOE.get());

                        output.accept(ModItems.Tool.BRONZE_PICKAXE.get());
                        output.accept(ModItems.Tool.CONSTANTAN_PICKAXE.get());
                        output.accept(ModItems.Tool.COPPER_PICKAXE.get());
                        output.accept(ModItems.Tool.ELECTRUM_PICKAXE.get());
                        output.accept(ModItems.Tool.EMERALD_PICKAXE.get());
                        output.accept(ModItems.Tool.INVAR_PICKAXE.get());
                        output.accept(ModItems.Tool.LEAD_PICKAXE.get());
                        output.accept(ModItems.Tool.NICKEL_PICKAXE.get());
                        output.accept(ModItems.Tool.RUBY_PICKAXE.get());
                        output.accept(ModItems.Tool.SAPPHIRE_PICKAXE.get());
                        output.accept(ModItems.Tool.SILVER_PICKAXE.get());
                        output.accept(ModItems.Tool.TIN_PICKAXE.get());

                        output.accept(ModItems.Tool.BRONZE_SHOVEL.get());
                        output.accept(ModItems.Tool.CONSTANTAN_SHOVEL.get());
                        output.accept(ModItems.Tool.COPPER_SHOVEL.get());
                        output.accept(ModItems.Tool.ELECTRUM_SHOVEL.get());
                        output.accept(ModItems.Tool.EMERALD_SHOVEL.get());
                        output.accept(ModItems.Tool.INVAR_SHOVEL.get());
                        output.accept(ModItems.Tool.LEAD_SHOVEL.get());
                        output.accept(ModItems.Tool.NICKEL_SHOVEL.get());
                        output.accept(ModItems.Tool.RUBY_SHOVEL.get());
                        output.accept(ModItems.Tool.SAPPHIRE_SHOVEL.get());
                        output.accept(ModItems.Tool.SILVER_SHOVEL.get());
                        output.accept(ModItems.Tool.TIN_SHOVEL.get());

                        output.accept(ModItems.Tool.BRONZE_SWORD.get());
                        output.accept(ModItems.Tool.CONSTANTAN_SWORD.get());
                        output.accept(ModItems.Tool.COPPER_SWORD.get());
                        output.accept(ModItems.Tool.ELECTRUM_SWORD.get());
                        output.accept(ModItems.Tool.EMERALD_SWORD.get());
                        output.accept(ModItems.Tool.INVAR_SWORD.get());
                        output.accept(ModItems.Tool.LEAD_SWORD.get());
                        output.accept(ModItems.Tool.NICKEL_SWORD.get());
                        output.accept(ModItems.Tool.RUBY_SWORD.get());
                        output.accept(ModItems.Tool.SAPPHIRE_SWORD.get());
                        output.accept(ModItems.Tool.SILVER_SWORD.get());
                        output.accept(ModItems.Tool.TIN_SWORD.get());

                        output.accept(ModItems.Head.BRONZE_AXE.get());
                        output.accept(ModItems.Head.CONSTANTAN_AXE.get());
                        output.accept(ModItems.Head.COPPER_AXE.get());
                        output.accept(ModItems.Head.ELECTRUM_AXE.get());
                        output.accept(ModItems.Head.EMERALD_AXE.get());
                        output.accept(ModItems.Head.INVAR_AXE.get());
                        output.accept(ModItems.Head.LEAD_AXE.get());
                        output.accept(ModItems.Head.NICKEL_AXE.get());
                        output.accept(ModItems.Head.RUBY_AXE.get());
                        output.accept(ModItems.Head.SAPPHIRE_AXE.get());
                        output.accept(ModItems.Head.SILVER_AXE.get());
                        output.accept(ModItems.Head.TIN_AXE.get());

                        output.accept(ModItems.Head.BRONZE_HAMMER.get());
                        output.accept(ModItems.Head.CONSTANTAN_HAMMER.get());
                        output.accept(ModItems.Head.COPPER_HAMMER.get());
                        output.accept(ModItems.Head.DIAMOND_HAMMER.get());
                        output.accept(ModItems.Head.ELECTRUM_HAMMER.get());
                        output.accept(ModItems.Head.EMERALD_HAMMER.get());
                        output.accept(ModItems.Head.GOLD_HAMMER.get());
                        output.accept(ModItems.Head.INVAR_HAMMER.get());
                        output.accept(ModItems.Head.IRON_HAMMER.get());
                        output.accept(ModItems.Head.LEAD_HAMMER.get());
                        output.accept(ModItems.Head.NETHERITE_HAMMER.get());
                        output.accept(ModItems.Head.NICKEL_HAMMER.get());
                        output.accept(ModItems.Head.RUBY_HAMMER.get());
                        output.accept(ModItems.Head.SAPPHIRE_HAMMER.get());
                        output.accept(ModItems.Head.SILVER_HAMMER.get());
                        output.accept(ModItems.Head.STONE_HAMMER.get());
                        output.accept(ModItems.Head.TIN_HAMMER.get());
                        output.accept(ModItems.Head.WOOD_HAMMER.get());

                        output.accept(ModItems.Head.BRONZE_HOE.get());
                        output.accept(ModItems.Head.CONSTANTAN_HOE.get());
                        output.accept(ModItems.Head.COPPER_HOE.get());
                        output.accept(ModItems.Head.ELECTRUM_HOE.get());
                        output.accept(ModItems.Head.EMERALD_HOE.get());
                        output.accept(ModItems.Head.INVAR_HOE.get());
                        output.accept(ModItems.Head.LEAD_HOE.get());
                        output.accept(ModItems.Head.NICKEL_HOE.get());
                        output.accept(ModItems.Head.RUBY_HOE.get());
                        output.accept(ModItems.Head.SAPPHIRE_HOE.get());
                        output.accept(ModItems.Head.SILVER_HOE.get());
                        output.accept(ModItems.Head.TIN_HOE.get());

                        output.accept(ModItems.Head.BRONZE_PICKAXE.get());
                        output.accept(ModItems.Head.CONSTANTAN_PICKAXE.get());
                        output.accept(ModItems.Head.COPPER_PICKAXE.get());
                        output.accept(ModItems.Head.ELECTRUM_PICKAXE.get());
                        output.accept(ModItems.Head.EMERALD_PICKAXE.get());
                        output.accept(ModItems.Head.INVAR_PICKAXE.get());
                        output.accept(ModItems.Head.LEAD_PICKAXE.get());
                        output.accept(ModItems.Head.NICKEL_PICKAXE.get());
                        output.accept(ModItems.Head.RUBY_PICKAXE.get());
                        output.accept(ModItems.Head.SAPPHIRE_PICKAXE.get());
                        output.accept(ModItems.Head.SILVER_PICKAXE.get());
                        output.accept(ModItems.Head.TIN_PICKAXE.get());

                        output.accept(ModItems.Head.BRONZE_SHOVEL.get());
                        output.accept(ModItems.Head.CONSTANTAN_SHOVEL.get());
                        output.accept(ModItems.Head.COPPER_SHOVEL.get());
                        output.accept(ModItems.Head.ELECTRUM_SHOVEL.get());
                        output.accept(ModItems.Head.EMERALD_SHOVEL.get());
                        output.accept(ModItems.Head.INVAR_SHOVEL.get());
                        output.accept(ModItems.Head.LEAD_SHOVEL.get());
                        output.accept(ModItems.Head.NICKEL_SHOVEL.get());
                        output.accept(ModItems.Head.RUBY_SHOVEL.get());
                        output.accept(ModItems.Head.SAPPHIRE_SHOVEL.get());
                        output.accept(ModItems.Head.SILVER_SHOVEL.get());
                        output.accept(ModItems.Head.TIN_SHOVEL.get());

                        output.accept(ModItems.Head.BRONZE_SWORD.get());
                        output.accept(ModItems.Head.CONSTANTAN_SWORD.get());
                        output.accept(ModItems.Head.COPPER_SWORD.get());
                        output.accept(ModItems.Head.ELECTRUM_SWORD.get());
                        output.accept(ModItems.Head.EMERALD_SWORD.get());
                        output.accept(ModItems.Head.INVAR_SWORD.get());
                        output.accept(ModItems.Head.LEAD_SWORD.get());
                        output.accept(ModItems.Head.NICKEL_SWORD.get());
                        output.accept(ModItems.Head.RUBY_SWORD.get());
                        output.accept(ModItems.Head.SAPPHIRE_SWORD.get());
                        output.accept(ModItems.Head.SILVER_SWORD.get());
                        output.accept(ModItems.Head.TIN_SWORD.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> ARMOR = CREATIVE_MODE_TABS.register(
            Reference.MODID + "_" + Reference.Names.ARMOR + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.COLORED_BLOCKS)
                    .withTabsBefore(CreativeTabs.TOOL.getId())
                    .withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS)
                    .icon(() -> ModItems.Armor.ENGINEER_HELMET.get().getDefaultInstance())
                    .title(Component.translatable(Reference.Names.CREATIVE_TAB + Reference.MODID + "_" + Reference.Names.ARMOR + "tab"))
                    .displayItems((parameters, output) ->
                    {
                        output.accept(ModItems.Armor.ENGINEER_HELMET.get());

                        output.accept(ModItems.Armor.BRONZE_HELMET.get());
                        output.accept(ModItems.Armor.BRONZE_CHESTPLATE.get());
                        output.accept(ModItems.Armor.BRONZE_LEGGINGS.get());
                        output.accept(ModItems.Armor.BRONZE_BOOTS.get());

                        output.accept(ModItems.Armor.CONSTANTAN_HELMET.get());
                        output.accept(ModItems.Armor.CONSTANTAN_CHESTPLATE.get());
                        output.accept(ModItems.Armor.CONSTANTAN_LEGGINGS.get());
                        output.accept(ModItems.Armor.CONSTANTAN_BOOTS.get());

                        output.accept(ModItems.Armor.COPPER_HELMET.get());
                        output.accept(ModItems.Armor.COPPER_CHESTPLATE.get());
                        output.accept(ModItems.Armor.COPPER_LEGGINGS.get());
                        output.accept(ModItems.Armor.COPPER_BOOTS.get());

                        output.accept(ModItems.Armor.ELECTRUM_HELMET.get());
                        output.accept(ModItems.Armor.ELECTRUM_CHESTPLATE.get());
                        output.accept(ModItems.Armor.ELECTRUM_LEGGINGS.get());
                        output.accept(ModItems.Armor.ELECTRUM_BOOTS.get());

                        output.accept(ModItems.Armor.EMERALD_HELMET.get());
                        output.accept(ModItems.Armor.EMERALD_CHESTPLATE.get());
                        output.accept(ModItems.Armor.EMERALD_LEGGINGS.get());
                        output.accept(ModItems.Armor.EMERALD_BOOTS.get());

                        output.accept(ModItems.Armor.INVAR_HELMET.get());
                        output.accept(ModItems.Armor.INVAR_CHESTPLATE.get());
                        output.accept(ModItems.Armor.INVAR_LEGGINGS.get());
                        output.accept(ModItems.Armor.INVAR_BOOTS.get());

                        output.accept(ModItems.Armor.LEAD_HELMET.get());
                        output.accept(ModItems.Armor.LEAD_CHESTPLATE.get());
                        output.accept(ModItems.Armor.LEAD_LEGGINGS.get());
                        output.accept(ModItems.Armor.LEAD_BOOTS.get());

                        output.accept(ModItems.Armor.NICKEL_HELMET.get());
                        output.accept(ModItems.Armor.NICKEL_CHESTPLATE.get());
                        output.accept(ModItems.Armor.NICKEL_LEGGINGS.get());
                        output.accept(ModItems.Armor.NICKEL_BOOTS.get());

                        output.accept(ModItems.Armor.RUBY_HELMET.get());
                        output.accept(ModItems.Armor.RUBY_CHESTPLATE.get());
                        output.accept(ModItems.Armor.RUBY_LEGGINGS.get());
                        output.accept(ModItems.Armor.RUBY_BOOTS.get());

                        output.accept(ModItems.Armor.SAPPHIRE_HELMET.get());
                        output.accept(ModItems.Armor.SAPPHIRE_CHESTPLATE.get());
                        output.accept(ModItems.Armor.SAPPHIRE_LEGGINGS.get());
                        output.accept(ModItems.Armor.SAPPHIRE_BOOTS.get());

                        output.accept(ModItems.Armor.SILVER_HELMET.get());
                        output.accept(ModItems.Armor.SILVER_CHESTPLATE.get());
                        output.accept(ModItems.Armor.SILVER_LEGGINGS.get());
                        output.accept(ModItems.Armor.SILVER_BOOTS.get());

                        output.accept(ModItems.Armor.TIN_HELMET.get());
                        output.accept(ModItems.Armor.TIN_CHESTPLATE.get());
                        output.accept(ModItems.Armor.TIN_LEGGINGS.get());
                        output.accept(ModItems.Armor.TIN_BOOTS.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> BLOCK = CREATIVE_MODE_TABS.register(
            Reference.MODID + Reference.Names.BLOCK + "tab", () -> CreativeModeTab.builder()
                    .withTabsAfter(CreativeModeTabs.COLORED_BLOCKS)
                    .withTabsBefore(CreativeTabs.ARMOR.getId())
                    .withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS)
                    .icon(() -> ModBlocks.Ores.OVERWORLD_RUBY_ORE.get().asItem().getDefaultInstance())
                    .title(Component.translatable(Reference.Names.CREATIVE_TAB + Reference.MODID + Reference.Names.BLOCK + "tab"))
                    .displayItems((parameters, output) ->
                    {
                        output.accept(ModBlocks.POTATO_BLOCK.get());

                        output.accept(ModBlocks.Ores.OVERWORLD_RUBY_ORE.get());
                        output.accept(ModBlocks.Ores.DEEP_RUBY_ORE.get());
                        output.accept(ModBlocks.Ores.END_RUBY_ORE.get());
                        output.accept(ModBlocks.Ores.NETHER_RUBY_ORE.get());

                        output.accept(ModBlocks.Ores.OVERWORLD_SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.Ores.DEEP_SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.Ores.END_SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.Ores.NETHER_SAPPHIRE_ORE.get());
                    }).build());
}