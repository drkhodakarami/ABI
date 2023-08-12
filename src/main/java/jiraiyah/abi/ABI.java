package jiraiyah.abi;

import com.mojang.logging.LogUtils;
import jiraiyah.abi.block.ModBlocks;
import jiraiyah.abi.fluid.ModFluidTypes;
import jiraiyah.abi.fluid.ModFluids;
import jiraiyah.abi.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Reference.MODID)
public class ABI
{
    private static final Logger LOGGER = LogUtils.getLogger();

    public ABI()
    {
        LOGGER.info(" **********************************************************");
        LOGGER.info(" *************************** ABI **************************");
        LOGGER.info(" **********************************************************");
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);

        registerDeferredAll(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void registerDeferredAll(IEventBus eventBus)
    {
        ModItems.initialize();

        LOGGER.info(Reference.ModName + " >>>>>>>>>>>>>>>> Registering Creative Tabs");
        CreativeTabs.CREATIVE_MODE_TABS.register(eventBus);
        LOGGER.info(Reference.ModName + " >>>>>>>>>>>>>>>> Registering Blocks");
        ModBlocks.BLOCKS.register(eventBus);
        LOGGER.info(Reference.ModName + " >>>>>>>>>>>>>>>> Registering Items");
        ModItems.ITEMS.register(eventBus);
        LOGGER.info(Reference.ModName + " >>>>>>>>>>>>>>>> Registering FluidS");
        ModFluids.FLUIDS.register(eventBus);
        LOGGER.info(Reference.ModName + " >>>>>>>>>>>>>>>> Registering Fluid Types");
        ModFluidTypes.FLUID_TYPES.register(eventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info(" **********************************************************");
        LOGGER.info(" ******************** ABI COMMON SETUP ********************");
        LOGGER.info(" **********************************************************");
        event.enqueueWork(() -> {

        });
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info(" **********************************************************");
        LOGGER.info(" ******************** ABI SERVER SETUP ********************");
        LOGGER.info(" **********************************************************");
    }
}