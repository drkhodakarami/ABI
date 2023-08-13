package jiraiyah.abi.item;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Map;

public class ModArmorItem extends ArmorItem
{
    private static  final Map<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
                    .put(ModArmorMaterials.SAPPHIRE,
                            new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 1))
                    .put(ModArmorMaterials.RUBY,
                            new MobEffectInstance(MobEffects.NIGHT_VISION, 200, 1))
                    .build();

    public ModArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties)
    {
        super(pMaterial, pType, pProperties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player)
    {
        if(!level.isClientSide)
            if (HasFullSuitOfArmorOn(player))
                EvaluateArmorEffects(player);
    }

    private void EvaluateArmorEffects(Player player)
    {
        for(Map.Entry<ArmorMaterial, MobEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet())
        {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffectInstance mapStatusEffect = entry.getValue();
            if(HasCorrectArmorOn(mapArmorMaterial, player))
                AddStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
        }
    }

    private void AddStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial, MobEffectInstance mapStatusEffect)
    {
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());

        if(!hasPlayerEffect)
        {
            player.addEffect(new MobEffectInstance(mapStatusEffect.getEffect(),
                    mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier()));
        }
    }

    private boolean HasFullSuitOfArmorOn(Player player)
    {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean HasCorrectArmorOn(ArmorMaterial material, Player player)
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
}