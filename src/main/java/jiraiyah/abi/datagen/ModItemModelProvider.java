package jiraiyah.abi.datagen;

import jiraiyah.abi.Reference;
import jiraiyah.abi.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider
{
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, Reference.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        //<editor-fold desc="DUST">
        SimpleItem(ModItems.Dust.ALUMINIUM);
        SimpleItem(ModItems.Dust.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Dust.ALUMITE);
        SimpleItem(ModItems.Dust.ARDITE);
        SimpleItem(ModItems.Dust.BERYLLIUM);
        SimpleItem(ModItems.Dust.BLUTONIUM);
        SimpleItem(ModItems.Dust.BORON);
        SimpleItem(ModItems.Dust.BRASS);
        SimpleItem(ModItems.Dust.BRONZE);
        SimpleItem(ModItems.Dust.COBALT);
        SimpleItem(ModItems.Dust.CONDUCTIVE_IRON);
        SimpleItem(ModItems.Dust.CONSTANTAN);
        SimpleItem(ModItems.Dust.COPPER);
        SimpleItem(ModItems.Dust.CRUDE_STEEL);
        SimpleItem(ModItems.Dust.CYANIDE);
        SimpleItem(ModItems.Dust.DARK_STEEL);
        SimpleItem(ModItems.Dust.DAWN_STONE);
        SimpleItem(ModItems.Dust.DEMONICUM);
        SimpleItem(ModItems.Dust.DRACONIUM);
        SimpleItem(ModItems.Dust.ELECTRICAL_STEEL);
        SimpleItem(ModItems.Dust.ELECTRUM);
        SimpleItem(ModItems.Dust.ENCHANTIUM);
        SimpleItem(ModItems.Dust.END_STEEL);
        SimpleItem(ModItems.Dust.ENDERITE);
        SimpleItem(ModItems.Dust.ENERGETIC_SILVER);
        SimpleItem(ModItems.Dust.GOLD);
        SimpleItem(ModItems.Dust.GRAPHITE);
        SimpleItem(ModItems.Dust.INVAR);
        SimpleItem(ModItems.Dust.IRIDIUM);
        SimpleItem(ModItems.Dust.IRON);
        SimpleItem(ModItems.Dust.LEAD);
        SimpleItem(ModItems.Dust.LITHIUM);
        SimpleItem(ModItems.Dust.LUDICRITE);
        SimpleItem(ModItems.Dust.MAGNESIUM);
        SimpleItem(ModItems.Dust.MANGANESE);
        SimpleItem(ModItems.Dust.STEEL);
        SimpleItem(ModItems.Dust.TIN);
        SimpleItem(ModItems.Dust.YELLORIUM);
        //</editor-fold>

        //<editor-fold desc="GEAR">
        SimpleItem(ModItems.Gear.ALUMINIUM);
        SimpleItem(ModItems.Gear.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Gear.ALUMITE);
        SimpleItem(ModItems.Gear.ARDITE);
        SimpleItem(ModItems.Gear.BERYLLIUM);
        //</editor-fold>

        //<editor-fold desc="INGOT">
        SimpleItem(ModItems.Ingot.ALUMINIUM);
        SimpleItem(ModItems.Ingot.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Ingot.ALUMITE);
        SimpleItem(ModItems.Ingot.ARDITE);
        SimpleItem(ModItems.Ingot.BERYLLIUM);
        //</editor-fold>

        //<editor-fold desc="NUGGET">
        SimpleItem(ModItems.Nugget.ALUMINIUM);
        SimpleItem(ModItems.Nugget.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Nugget.ALUMITE);
        SimpleItem(ModItems.Nugget.ARDITE);
        SimpleItem(ModItems.Nugget.BERYLLIUM);
        //</editor-fold>

        //<editor-fold desc="PLATE">
        SimpleItem(ModItems.Plate.ALUMINIUM);
        SimpleItem(ModItems.Plate.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Plate.ALUMITE);
        SimpleItem(ModItems.Plate.ARDITE);
        SimpleItem(ModItems.Plate.BERYLLIUM);
        //</editor-fold>

        //<editor-fold desc="RAW">
        SimpleItem(ModItems.Raw.ALUMINIUM);
        SimpleItem(ModItems.Raw.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Raw.ALUMITE);
        SimpleItem(ModItems.Raw.ARDITE);
        SimpleItem(ModItems.Raw.BERYLLIUM);
        //</editor-fold>

        //<editor-fold desc="REINFORCED">
        SimpleItem(ModItems.Reinforced.ALUMINIUM);
        SimpleItem(ModItems.Reinforced.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Reinforced.ALUMITE);
        SimpleItem(ModItems.Reinforced.ARDITE);
        SimpleItem(ModItems.Reinforced.BERYLLIUM);
        //</editor-fold>

        //<editor-fold desc="ROD">
        SimpleItem(ModItems.Rod.ALUMINIUM);
        SimpleItem(ModItems.Rod.ALUMINIUM_BRASS);
        SimpleItem(ModItems.Rod.ALUMITE);
        SimpleItem(ModItems.Rod.ARDITE);
        SimpleItem(ModItems.Rod.BERYLLIUM);
        //</editor-fold>

        //<editor-fold desc="TOOL">
        SimpleItem(ModItems.Tool.SPANNER, true);
        //</editor-fold>
    }

    //<editor-fold desc="HELPER METHODS">
    private ItemModelBuilder SaplingItem(RegistryObject<Block> item)
    {
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated"))
                .texture("layer0",
                        Reference.Location("block/" + item.getId().getPath()));
    }

    private ItemModelBuilder SimpleItem(RegistryObject<Item> item)
    {
        return SimpleItem(item, false);
    }

    private ItemModelBuilder SimpleItem(RegistryObject<Item> item, boolean handheld)
    {
        if(item.getId().getPath().toLowerCase().contains(Reference.Names.DUST))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/dust/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.GEAR))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/gear/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.INGOT))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/ingot/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.NUGGET))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/nugget/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.PLATE))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/plate/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.RAW))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/raw/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.REINFORCED))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/reinforced/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.ROD))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/rod/" + item.getId().getPath()));

        if(item.getId().getPath().toLowerCase().contains(Reference.Names.TOOL))
            return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                    .texture("layer0",
                            Reference.Location("item/tool/" + item.getId().getPath()));

        return withExistingParent(item.getId().getPath(), new ResourceLocation(handheld ? "item/handheld" : "item/generated"))
                .texture("layer0",
                        Reference.Location("item/" + item.getId().getPath()));
    }
    //</editor-fold>
}