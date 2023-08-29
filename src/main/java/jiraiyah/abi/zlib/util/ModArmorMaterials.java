package jiraiyah.abi.zlib.util;

import jiraiyah.abi.Reference;
import jiraiyah.abi.item.ModItems;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.EnumMap;
import java.util.function.Supplier;

@SuppressWarnings("deprecation")
public enum ModArmorMaterials implements ArmorMaterial
{
    AMETHYST("amethyst", 7, new int[] {2, 5, 6, 2},12,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F, () -> Ingredient.of(Items.AMETHYST_SHARD)),

    BRONZE("bronze", 16, new int[] {2, 5, 6, 2},18,
            SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ModTags.Items.Ingots.BRONZE)),

    CITRINE("citrine", 28, new int[] {2, 5, 8, 3},19,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ModTags.Items.Gems.CITRINE)),

    CONSTANTAN("constantan", 8, new int[] {1, 4, 4, 2},12,
            SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ModTags.Items.Ingots.CONSTANTAN)),

    COPPER("copper", 7, new int[] {1, 3, 4, 7},17,
            SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(Items.COPPER_INGOT)),

    ELECTRUM("constantan", 7, new int[] {1, 3, 5, 2},30,
            SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ModTags.Items.Ingots.ELECTRUM)),

    EMERALD("emerald", 22, new int[] {3, 5, 6, 3},32,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F, () -> Ingredient.of(Items.EMERALD)),

    INVAR("invar", 15, new int[] {2, 5, 7, 2},12,
            SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ModTags.Items.Ingots.INVAR)),

    LEAD("lead", 12, new int[] {2, 4, 5, 2},18,
            SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ModTags.Items.Ingots.LEAD)),

    NICKEL("nickel", 14, new int[] {2, 5, 5, 2},14,
            SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ModTags.Items.Ingots.NICKEL)),

    RUBY("ruby", 28, new int[] {2, 6, 7, 3},32,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> Ingredient.of(ModTags.Items.Gems.RUBY)),

    SAPPHIRE("sapphire", 28, new int[] {2, 6, 7, 3},32,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> Ingredient.of(ModTags.Items.Gems.SAPPHIRE)),

    SILVER("silver", 6, new int[] {1, 3, 5, 2},32,
            SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.of(ModTags.Items.Ingots.SILVER)),

    TIN("tin", 8, new int[] {1, 3, 5, 1},20,
            SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ModTags.Items.Ingots.TIN)),
    ;

    //<editor-fold desc="HELPER METHODS">
    public static final StringRepresentable.EnumCodec<ArmorMaterials> CODEC = StringRepresentable.fromEnum(ArmorMaterials::values);

    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmount;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModArmorMaterials(String pName, int pDurabilityMultiplier, int[] pProtectionAmount,
                      int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance,
                      Supplier<Ingredient> pRepairIngredient)
    {
        this.name = pName;
        this.durabilityMultiplier = pDurabilityMultiplier;
        this.protectionAmount = pProtectionAmount;
        this.enchantmentValue = pEnchantmentValue;
        this.sound = pSound;
        this.toughness = pToughness;
        this.knockbackResistance = pKnockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);
    }

    @Override
    public int getDurabilityForType(ArmorItem.@NotNull Type pType)
    {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.@NotNull Type pType)
    {
        return this.protectionAmount[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return this.enchantmentValue;
    }

    @Override
    public @NotNull SoundEvent getEquipSound()
    {
        return this.sound;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient()
    {
        return this.repairIngredient.get();
    }

    @Override
    public @NotNull String getName()
    {
        return Reference.MODID + ":" + this.name;
    }

    @Override
    public float getToughness()
    {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return this.knockbackResistance;
    }
    //</editor-fold>
}