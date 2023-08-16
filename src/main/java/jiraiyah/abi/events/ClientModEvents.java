package jiraiyah.abi.events;

import com.mojang.logging.LogUtils;
import jiraiyah.abi.Reference;
import jiraiyah.abi.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ComputeFovModifierEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.slf4j.Logger;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents
{
    private static final Logger LOGGER = LogUtils.getLogger();

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event)
    {
        LOGGER.info(" **********************************************************");
        LOGGER.info(" ******************** ABI CLIENT SETUP ********************");
        LOGGER.info(" **********************************************************");
    }
}