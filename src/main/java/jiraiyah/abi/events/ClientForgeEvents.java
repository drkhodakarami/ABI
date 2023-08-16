package jiraiyah.abi.events;

import jiraiyah.abi.Reference;
import jiraiyah.abi.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ComputeFovModifierEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeEvents
{
    @SubscribeEvent
    public static void onComputeFovModifierEvent(ComputeFovModifierEvent event)
    {
        if (event.getPlayer().isUsingItem() &&
                (event.getPlayer().getUseItem().getItem() == ModItems.Tool.RUBY_BOW.get() ||
                        event.getPlayer().getUseItem().getItem() == ModItems.Tool.SAPPHIRE_BOW.get())) {
            float fovModifier = 1f;
            int ticksUsingItem = event.getPlayer().getTicksUsingItem();
            float deltaTicks = (float) ticksUsingItem / 5.0F;
            if (deltaTicks > 1.0F) {
                deltaTicks = 1.0F;
            } else {
                deltaTicks *= deltaTicks;
            }
            fovModifier *= 1.0F - deltaTicks * 0.15F;
            event.setNewFovModifier(fovModifier);
        }
    }
}