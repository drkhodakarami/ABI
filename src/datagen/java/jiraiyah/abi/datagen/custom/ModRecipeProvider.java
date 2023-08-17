package jiraiyah.abi.datagen.custom;

import jiraiyah.abi.Reference;
import jiraiyah.abi.item.ModItems;
import jiraiyah.abi.zlib.util.ModTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder
{
    /*private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(
            ModBlocks.SAPPHIRE_ORE.get(),
            ModBlocks.DEEP_SAPPHIRE_ORE.get(),
            ModBlocks.END_SAPPHIRE_ORE.get(),
            ModBlocks.NETHER_SAPPHIRE_ORE.get()
            );*/

    public ModRecipeProvider(PackOutput pOutput)
    {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter)
    {
        //<editor-fold desc="ROTTEN FLESH TO LEATHER">
        simpleCookingRecipe(pWriter, "smoking", RecipeSerializer.SMOKING_RECIPE,
                300, Items.ROTTEN_FLESH, Items.LEATHER, 0.15F);
        simpleCookingRecipe(pWriter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING_RECIPE,
                600, Items.ROTTEN_FLESH, Items.LEATHER, 0.15F);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.ROTTEN_FLESH), RecipeCategory.MISC, Items.LEATHER,
                        0.15F, 100)
                .unlockedBy("has_rotten_flesh", has(Items.ROTTEN_FLESH))
                .save(pWriter);
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.ROTTEN_FLESH), RecipeCategory.MISC, Items.LEATHER,
                        0.15F, 50)
                .unlockedBy("has_rotten_flesh", has(Items.ROTTEN_FLESH))
                .save(pWriter, getBlastingRecipeName(Items.LEATHER));
        //</editor-fold>

        //<editor-fold desc="ARMOR">

        //<editor-fold desc="BRONZE ARMOR">
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.BRONZE_BOOTS.get())
                .define('A', ModTags.Items.Reinforced.BRONZE)
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.BRONZE,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.BRONZE).build()))
                //.unlockedBy(getHasName(ModItems.Reinforced.BRONZE.get()), has(ModItems.Reinforced.BRONZE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.BRONZE_CHESTPLATE.get())
                .define('A', ModTags.Items.Reinforced.BRONZE)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.BRONZE,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.BRONZE).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.BRONZE_LEGGINGS.get())
                .define('A', ModTags.Items.Reinforced.BRONZE)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.BRONZE,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.BRONZE).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.BRONZE_HELMET.get())
                .define('A', ModTags.Items.Reinforced.BRONZE)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.BRONZE,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.BRONZE).build()))
                .save(pWriter);
        //</editor-fold>

        //<editor-fold desc="CONSTANTAN ARMOR">
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.CONSTANTAN_BOOTS.get())
                .define('A', ModTags.Items.Reinforced.CONSTANTAN)
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.CONSTANTAN,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.CONSTANTAN).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.CONSTANTAN_CHESTPLATE.get())
                .define('A', ModTags.Items.Reinforced.CONSTANTAN)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.CONSTANTAN,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.CONSTANTAN).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.CONSTANTAN_LEGGINGS.get())
                .define('A', ModTags.Items.Reinforced.CONSTANTAN)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.CONSTANTAN,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.CONSTANTAN).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.CONSTANTAN_HELMET.get())
                .define('A', ModTags.Items.Reinforced.CONSTANTAN)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.CONSTANTAN,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.CONSTANTAN).build()))
                .save(pWriter);
        //</editor-fold>

        //<editor-fold desc="COPPER ARMOR">
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.COPPER_BOOTS.get())
                .define('A', ModTags.Items.Reinforced.COPPER)
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.COPPER,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.COPPER).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.COPPER_CHESTPLATE.get())
                .define('A', ModTags.Items.Reinforced.COPPER)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.COPPER,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.COPPER).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.COPPER_LEGGINGS.get())
                .define('A', ModTags.Items.Reinforced.COPPER)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.COPPER,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.COPPER).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.COPPER_HELMET.get())
                .define('A', ModTags.Items.Reinforced.COPPER)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.COPPER,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.COPPER).build()))
                .save(pWriter);
        //</editor-fold>

        //<editor-fold desc="ELECTRUM ARMOR">
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.ELECTRUM_BOOTS.get())
                .define('A', ModTags.Items.Reinforced.ELECTRUM)
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.ELECTRUM,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.ELECTRUM).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.ELECTRUM_CHESTPLATE.get())
                .define('A', ModTags.Items.Reinforced.ELECTRUM)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.ELECTRUM,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.ELECTRUM).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.ELECTRUM_LEGGINGS.get())
                .define('A', ModTags.Items.Reinforced.ELECTRUM)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.ELECTRUM,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.ELECTRUM).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.ELECTRUM_HELMET.get())
                .define('A', ModTags.Items.Reinforced.ELECTRUM)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.ELECTRUM,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.ELECTRUM).build()))
                .save(pWriter);
        //</editor-fold>

        //<editor-fold desc="EMERALD ARMOR">
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.EMERALD_BOOTS.get())
                .define('A', Tags.Items.GEMS_EMERALD)
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.EMERALD,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Tags.Items.GEMS_EMERALD).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.EMERALD_CHESTPLATE.get())
                .define('A', Tags.Items.GEMS_EMERALD)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy(Reference.Names.HAS + Reference.Names.EMERALD,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Tags.Items.GEMS_EMERALD).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.EMERALD_LEGGINGS.get())
                .define('A', Tags.Items.GEMS_EMERALD)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.EMERALD,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Tags.Items.GEMS_EMERALD).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.EMERALD_HELMET.get())
                .define('A', Tags.Items.GEMS_EMERALD)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .unlockedBy(Reference.Names.HAS + Reference.Names.EMERALD,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Tags.Items.GEMS_EMERALD).build()))
                .save(pWriter);
        //</editor-fold>

        //<editor-fold desc="INVAR ARMOR">
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.INVAR_BOOTS.get())
                .define('A', ModTags.Items.Reinforced.INVAR)
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.INVAR,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.INVAR).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.INVAR_CHESTPLATE.get())
                .define('A', ModTags.Items.Reinforced.INVAR)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.INVAR,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.INVAR).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.INVAR_LEGGINGS.get())
                .define('A', ModTags.Items.Reinforced.INVAR)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.INVAR,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.INVAR).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.INVAR_HELMET.get())
                .define('A', ModTags.Items.Reinforced.INVAR)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.INVAR,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.INVAR).build()))
                .save(pWriter);
        //</editor-fold>

        //<editor-fold desc="LEAD ARMOR">
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.LEAD_BOOTS.get())
                .define('A', ModTags.Items.Reinforced.LEAD)
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.LEAD,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.LEAD).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.LEAD_CHESTPLATE.get())
                .define('A', ModTags.Items.Reinforced.LEAD)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.LEAD,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.LEAD).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.LEAD_LEGGINGS.get())
                .define('A', ModTags.Items.Reinforced.LEAD)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.LEAD,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.LEAD).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.LEAD_HELMET.get())
                .define('A', ModTags.Items.Reinforced.LEAD)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.LEAD,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.LEAD).build()))
                .save(pWriter);
        //</editor-fold>

        //<editor-fold desc="NICKEL ARMOR">
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.NICKEL_BOOTS.get())
                .define('A', ModTags.Items.Reinforced.NICKEL)
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.NICKEL,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.NICKEL).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.NICKEL_CHESTPLATE.get())
                .define('A', ModTags.Items.Reinforced.NICKEL)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.NICKEL,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.NICKEL).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.NICKEL_LEGGINGS.get())
                .define('A', ModTags.Items.Reinforced.NICKEL)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.NICKEL,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.NICKEL).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.NICKEL_HELMET.get())
                .define('A', ModTags.Items.Reinforced.NICKEL)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.NICKEL,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.NICKEL).build()))
                .save(pWriter);
        //</editor-fold>

        //<editor-fold desc="RUBY ARMOR">
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.RUBY_BOOTS.get())
                .define('A', ModTags.Items.Gems.RUBY)
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.RUBY,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Gems.RUBY).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.RUBY_CHESTPLATE.get())
                .define('A', ModTags.Items.Gems.RUBY)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.RUBY,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Gems.RUBY).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.RUBY_LEGGINGS.get())
                .define('A', ModTags.Items.Gems.RUBY)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.RUBY,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Gems.RUBY).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.RUBY_HELMET.get())
                .define('A', ModTags.Items.Gems.RUBY)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.RUBY,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Gems.RUBY).build()))
                .save(pWriter);
        //</editor-fold>

        //<editor-fold desc="SAPPHIRE ARMOR">
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.SAPPHIRE_BOOTS.get())
                .define('A', ModTags.Items.Gems.SAPPHIRE)
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.SAPPHIRE,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Gems.SAPPHIRE).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.SAPPHIRE_CHESTPLATE.get())
                .define('A', ModTags.Items.Gems.SAPPHIRE)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.SAPPHIRE,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Gems.SAPPHIRE).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.SAPPHIRE_LEGGINGS.get())
                .define('A', ModTags.Items.Gems.SAPPHIRE)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.SAPPHIRE,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Gems.SAPPHIRE).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.SAPPHIRE_HELMET.get())
                .define('A', ModTags.Items.Gems.SAPPHIRE)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.SAPPHIRE,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Gems.SAPPHIRE).build()))
                .save(pWriter);
        //</editor-fold>

        //<editor-fold desc="SILVER ARMOR">
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.SILVER_BOOTS.get())
                .define('A', ModTags.Items.Reinforced.SILVER)
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.SILVER,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.SILVER).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.SILVER_CHESTPLATE.get())
                .define('A', ModTags.Items.Reinforced.SILVER)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.SILVER,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.SILVER).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.SILVER_LEGGINGS.get())
                .define('A', ModTags.Items.Reinforced.SILVER)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.SILVER,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.SILVER).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.SILVER_HELMET.get())
                .define('A', ModTags.Items.Reinforced.SILVER)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.SILVER,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.SILVER).build()))
                .save(pWriter);
        //</editor-fold>

        //<editor-fold desc="TIN ARMOR">
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.TIN_BOOTS.get())
                .define('A', ModTags.Items.Reinforced.TIN)
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.TIN,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.TIN).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.TIN_CHESTPLATE.get())
                .define('A', ModTags.Items.Reinforced.TIN)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.TIN,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.TIN).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.TIN_LEGGINGS.get())
                .define('A', ModTags.Items.Reinforced.TIN)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.TIN,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.TIN).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Armor.TIN_HELMET.get())
                .define('A', ModTags.Items.Reinforced.TIN)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .unlockedBy(Reference.Names.HAS + Reference.Names.REINFORCED + Reference.Names.TIN,
                        inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.Reinforced.TIN).build()))
                .save(pWriter);
        //</editor-fold>

        //</editor-fold>

        /*oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.Gem.SAPPHIRE.get(),
                0.25F, 100, "sapphire");
        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.Gem.SAPPHIRE.get(),
                0.25F, 200, "sapphire");*/
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
                            Reference.MODID + ":" + getItemName(pResult) +
                                    pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer,
                                                  RecipeCategory pUnpackedCategory, ItemLike pUnpacked,
                                                  RecipeCategory pPackedCategory, ItemLike pPacked)
    {
        nineBlockStorageRecipes(pFinishedRecipeConsumer, pUnpackedCategory, pUnpacked, pPackedCategory,
                pPacked, getSimpleRecipeName(pPacked), null, getSimpleRecipeName(pUnpacked), null);
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