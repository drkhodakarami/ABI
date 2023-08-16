package jiraiyah.abi.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers
{
    public static final ForgeTier BRONZE = new ForgeTier(2, 325, 5.5f, 2.0f,
            16, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.Ingot.BRONZE.get()));

    public static final ForgeTier CONSTANTAN = new ForgeTier(1, 250, 5.5f, 2.0f,
            10, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.Ingot.CONSTANTAN.get()));

    public static final ForgeTier COPPER = new ForgeTier(1, 160, 4.5f, 1.5f,
            9, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.COPPER_INGOT));

    public static final ForgeTier ELECTRUM = new ForgeTier(0, 96, 13.0f, 0.0f,
            28, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.Ingot.ELECTRUM.get()));

    public static final ForgeTier INVAR = new ForgeTier(2, 300, 7.0f, 2.5f,
            13, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.Ingot.INVAR.get()));

    public static final ForgeTier LEAD = new ForgeTier(1, 32, 12.0f, 1.0f,
            16, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.Ingot.LEAD.get()));

    public static final ForgeTier NICKEL = new ForgeTier(2, 225, 7.0f, 2.5f,
            12, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.Ingot.NICKEL.get()));

    public static final ForgeTier RUBY = new ForgeTier(3, 800, 10f, 2.5f,
            28, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.Gem.SAPPHIRE.get()));

    public static final ForgeTier SAPPHIRE = new ForgeTier(3, 800, 10f, 2.5f,
            28, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.Gem.SAPPHIRE.get()));

    public static final ForgeTier SILVER = new ForgeTier(0, 24, 14.0f, 0.0f,
            30, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.Ingot.SILVER.get()));

    public static final ForgeTier TIN = new ForgeTier(0, 16, 13.0f, 0.0f,
            18, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.Ingot.TIN.get()));
}