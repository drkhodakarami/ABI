package jiraiyah.abi.datagen;

import jiraiyah.abi.Reference;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder
{
    public ModRecipeProvider(PackOutput pOutput)
    {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter)
    {

    }

    //<editor-fold desc="VANILLA REPLACEMENT HELPER METHODS">
    protected static void simpleCookingRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, String pCookingMethod,
                                              RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                              int pCookingTime, ItemLike pIngredient, ItemLike pResult,
                                              float pExperience)
    {
        SimpleCookingRecipeBuilder.generic(Ingredient.of(pIngredient), RecipeCategory.FOOD, pResult, pExperience,
                        pCookingTime, pCookingSerializer)
                .unlockedBy(getHasName(pIngredient), has(pIngredient))
                .save(pFinishedRecipeConsumer,
                        Reference.Location(getItemName(pResult) + "_from_" + pCookingMethod));
    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients,
                                      RecipeCategory pCategory, ItemLike pResult, float pExperience,
                                      int pCookingTIme, String pGroup)
    {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients,
                                      RecipeCategory pCategory, ItemLike pResult, float pExperience,
                                      int pCookingTime, String pGroup)
    {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer,
                                     RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                     float pExperience, int pCookingTime, String pGroup, String pRecipeName)
    {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,
                            Reference.Location(getItemName(pResult)) +
                                    pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer,
                                                  RecipeCategory pUnpackedCategory, ItemLike pUnpacked,
                                                  RecipeCategory pPackedCategory, ItemLike pPacked)
    {
        nineBlockStorageRecipes(pFinishedRecipeConsumer, pUnpackedCategory, pUnpacked, pPackedCategory,
                pPacked, getSimpleRecipeName(pPacked), (String)null, getSimpleRecipeName(pUnpacked), (String)null);
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer,
                                                  RecipeCategory pUnpackedCategory, ItemLike pUnpacked,
                                                  RecipeCategory pPackedCategory, ItemLike pPacked, String pPackedName,
                                                  @Nullable String pPackedGroup, String pUnpackedName,
                                                  @Nullable String pUnpackedGroup)
    {
        ShapelessRecipeBuilder.shapeless(pUnpackedCategory, pUnpacked, 9).requires(pPacked)
                .group(pUnpackedGroup).unlockedBy(getHasName(pPacked), has(pPacked))
                .save(pFinishedRecipeConsumer, Reference.Location(pUnpackedName));
        ShapedRecipeBuilder.shaped(pPackedCategory, pPacked).define('#', pUnpacked)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(pPackedGroup).unlockedBy(getHasName(pUnpacked), has(pUnpacked))
                .save(pFinishedRecipeConsumer, Reference.Location(pPackedName));
    }
    //</editor-fold>
}