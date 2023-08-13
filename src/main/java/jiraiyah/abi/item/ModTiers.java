package jiraiyah.abi.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers
{
    public static final ForgeTier SAPPHIRE = new ForgeTier(3, 1000, 7f, 2.5f,
            12, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.Gem.SAPPHIRE.get()));

    public static final ForgeTier RUBY = new ForgeTier(3, 1000, 7f, 2.5f,
            12, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.Gem.SAPPHIRE.get()));
}