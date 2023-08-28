package jiraiyah.abi.zlib.util;

import jiraiyah.abi.Reference;
import jiraiyah.abi.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModTiers
{
    //level 5 ==> after netherite

    // wood = 0 ==> use : 59 ==> speed : 2.5 ==> damage : 0.0 ==> enchant : 15
    // stone = 1 ==> use : 131 ==> speed : 4.0 ==> damage : 1.0 ==> enchant : 5
    // iron = 2 ==> use : 250 ==> speed : 6.0 ==> damage : 2.0 ==> enchant : 14
    // diamond = 3 ==> use : 1561 ==> speed : 8.0 ==> damage : 3.0 ==> enchant : 10
    // gold = 0 ==> use : 32 ==> speed : 12.0 ==> damage : 0.0 ==> enchant : 22
    // netherite = 4 ==> use : 2031 ==> speed : 9.0 ==> damage : 4.0 ==> enchant : 15

    public static final Tier BRONZE = TierSortingRegistry.registerTier(new ForgeTier(2, 325, 5.5F, 2.0F, 16,
            //ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(Items.EMERALD)), Reference.Location("bronze"), List.of(Tiers.IRON), List.of());
            BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.Ingot.BRONZE.get())),
            Reference.Location(Reference.Names.Material.BRONZE), List.of(Tiers.STONE), List.of());

    public static final Tier CITRINE = TierSortingRegistry.registerTier(new ForgeTier(2, 800, 1.5F, 2.0F, 22,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.Gem.CITRINE.get())),
            Reference.Location(Reference.Names.Material.CITRINE), List.of(Tiers.STONE), List.of());

    public static final Tier CONSTANTAN = TierSortingRegistry.registerTier(new ForgeTier(1, 250, 5.5F, 2.0F, 10,
            BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.Ingot.CONSTANTAN.get())),
            Reference.Location(Reference.Names.Material.CONSTANTAN), List.of(Tiers.STONE), List.of());

    public static final Tier COPPER = TierSortingRegistry.registerTier(new ForgeTier(1, 160, 4.5F, 1.5F, 9,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            Reference.Location(Reference.Names.Material.COPPER), List.of(Tiers.STONE), List.of());

    public static final Tier ELECTRUM = TierSortingRegistry.registerTier(new ForgeTier(0, 96, 13.0F, 0.0F, 28,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.Ingot.ELECTRUM.get())),
            Reference.Location(Reference.Names.Material.ELECTRUM), List.of(Tiers.STONE), List.of());

    public static final Tier EMERALD = TierSortingRegistry.registerTier(new ForgeTier(3, 600, 10.0F, 2.0F, 28,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.EMERALD)),
            Reference.Location(Reference.Names.Material.EMERALD), List.of(Tiers.STONE), List.of());

    public static final Tier ENDERITE = TierSortingRegistry.registerTier(new ForgeTier(2, 100, 5.0F, 0.0F, 30,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.Ingot.ENDERITE.get())),
            Reference.Location(Reference.Names.Material.ENDERITE), List.of(Tiers.STONE), List.of());

    public static final Tier INVAR = TierSortingRegistry.registerTier(new ForgeTier(2, 300, 7.0F, 2.5F, 13,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.Ingot.INVAR.get())),
            Reference.Location(Reference.Names.Material.INVAR), List.of(Tiers.STONE), List.of());

    public static final Tier LEAD = TierSortingRegistry.registerTier(new ForgeTier(1, 32, 12.0F, 1.0F, 16,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.Ingot.LEAD.get())),
            Reference.Location(Reference.Names.Material.LEAD), List.of(Tiers.STONE), List.of());

    public static final Tier NICKEL = TierSortingRegistry.registerTier(new ForgeTier(2, 225, 7.0F, 2.5F, 12,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.Ingot.NICKEL.get())),
            Reference.Location(Reference.Names.Material.NICKEL), List.of(Tiers.STONE), List.of());

    public static final Tier RUBY = TierSortingRegistry.registerTier(new ForgeTier(3, 1000, 10.0F, 2.5F, 30,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.Gem.RUBY.get())),
            Reference.Location(Reference.Names.Material.RUBY), List.of(Tiers.STONE), List.of());

    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(new ForgeTier(3, 1000, 10.0F, 2.5F, 30,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.Gem.SAPPHIRE.get())),
            Reference.Location(Reference.Names.Material.SAPPHIRE), List.of(Tiers.STONE), List.of());

    public static final Tier SILVER = TierSortingRegistry.registerTier(new ForgeTier(0, 28, 14.0F, 0.0F, 30,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.Ingot.SILVER.get())),
            Reference.Location(Reference.Names.Material.SILVER), List.of(Tiers.STONE), List.of());

    public static final Tier TIN = TierSortingRegistry.registerTier(new ForgeTier(0, 24, 13.0F, 0.0F, 18,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.Ingot.TIN.get())),
            Reference.Location(Reference.Names.Material.TIN), List.of(Tiers.STONE), List.of());
}