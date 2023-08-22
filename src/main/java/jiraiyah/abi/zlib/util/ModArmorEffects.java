package jiraiyah.abi.zlib.util;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ModArmorEffects extends ArmorItem
{
    private static final Map<ArmorMaterial, ArrayList<MobEffectInstance>> MATERIAL_TO_EFFECT_MAP;

    static
    {
        MATERIAL_TO_EFFECT_MAP = new HashMap<>();
        /*addValues(ModArmorMaterials.EMERALD, new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200, 3));*/
        /*addValues(ModArmorMaterials.RUBY, new MobEffectInstance(MobEffects.NIGHT_VISION, 200, 3));
        addValues(ModArmorMaterials.SAPPHIRE, new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 3));
        addValues(ModArmorMaterials.SAPPHIRE, new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 200, 3));*/
    }

    public ModArmorEffects(ArmorMaterial pMaterial, Type pType, Properties pProperties)
    {
        super(pMaterial, pType, pProperties);
    }

    //<editor-fold desc="HELPER METHODS">
    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player)
    {
        if(!level.isClientSide)
            if (hasFullSuitOfArmorOn(player))
                evaluateArmorEffects(player);
    }

    private void evaluateArmorEffects(Player player)
    {
        for(HashMap.Entry<ArmorMaterial, ArrayList<MobEffectInstance>> entry : MATERIAL_TO_EFFECT_MAP.entrySet())
        {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            entry.getValue().forEach((effect) ->
            {
                if(hasCorrectArmorOn(mapArmorMaterial, player))
                    addStatusEffectForMaterial(player, mapArmorMaterial, effect);
            });
        }
    }

    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial, MobEffectInstance mapStatusEffect)
    {
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());

        if(!hasPlayerEffect)
        {
            player.addEffect(new MobEffectInstance(mapStatusEffect.getEffect(),
                    mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier()));
        }
    }

    private boolean hasFullSuitOfArmorOn(Player player)
    {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player)
    {
        for (ItemStack armorStack: player.getInventory().armor)
            if (!(armorStack.getItem() instanceof ArmorItem))
                return false;

        ArmorItem boots = ((ArmorItem)player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmor(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmor(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }

    private static void addValues(ArmorMaterial key, MobEffectInstance value) {
        ArrayList tempList;
        if (MATERIAL_TO_EFFECT_MAP.containsKey(key)) {
            tempList = MATERIAL_TO_EFFECT_MAP.get(key);
            if(tempList == null)
                tempList = new ArrayList();
            tempList.add(value);
        } else {
            tempList = new ArrayList();
            tempList.add(value);
        }
        MATERIAL_TO_EFFECT_MAP.put(key,tempList);
    }
    //</editor-fold>
}