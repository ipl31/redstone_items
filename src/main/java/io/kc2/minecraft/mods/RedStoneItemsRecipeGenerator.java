package io.kc2.minecraft.mods;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedStoneItemsRecipeGenerator extends FabricRecipeProvider {
    public static final Logger LOGGER = LoggerFactory.getLogger("redstone-items-kc2-io:RedStoneItemsRecipeGenerator");
    RedStoneItemsRecipeGenerator(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        LOGGER.info("Generating recipe JSON.");
        generate_pickaxe_recipe().offerTo(exporter);
        generate_axe_recipe().offerTo(exporter);
        generate_sword_recipe().offerTo(exporter);
        generate_hoe_recipe().offerTo(exporter);
    }

    private ShapelessRecipeJsonBuilder generate_pickaxe_recipe(){
        ShapelessRecipeJsonBuilder builder = ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, RedStoneItems.REDSTONE_PICKAXE);
        builder.input(Items.REDSTONE_BLOCK, 4)
                .input(Items.REDSTONE, 2)
                .input(Items.STICK, 2)
                .input(Items.DIAMOND, 1)
                .criterion(FabricRecipeProvider.hasItem(RedStoneItems.REDSTONE_PICKAXE),
                        FabricRecipeProvider.conditionsFromItem(RedStoneItems.REDSTONE_PICKAXE))
                .criterion(FabricRecipeProvider.hasItem(Items.REDSTONE_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(Items.REDSTONE_BLOCK))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK));
        return builder;

    }

    private ShapelessRecipeJsonBuilder generate_axe_recipe(){
        ShapelessRecipeJsonBuilder builder = ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, RedStoneItems.REDSTONE_AXE);
        builder.input(Items.REDSTONE_BLOCK, 4)
                .input(Items.REDSTONE, 2)
                .input(Items.STICK, 2)
                .input(Items.DIAMOND, 2)
                .criterion(FabricRecipeProvider.hasItem(RedStoneItems.REDSTONE_AXE),
                        FabricRecipeProvider.conditionsFromItem(RedStoneItems.REDSTONE_AXE))
                .criterion(FabricRecipeProvider.hasItem(Items.REDSTONE_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(Items.REDSTONE_BLOCK))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK));
        return builder;
    }

    private ShapelessRecipeJsonBuilder generate_sword_recipe(){
        ShapelessRecipeJsonBuilder builder = ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, RedStoneItems.REDSTONE_SWORD);
        builder.input(Items.REDSTONE_BLOCK, 4)
                .input(Items.REDSTONE, 2)
                .input(Items.STICK, 2)
                .input(Items.DIAMOND, 1)
                .criterion(FabricRecipeProvider.hasItem(RedStoneItems.REDSTONE_SWORD),
                        FabricRecipeProvider.conditionsFromItem(RedStoneItems.REDSTONE_SWORD))
                .criterion(FabricRecipeProvider.hasItem(Items.REDSTONE_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(Items.REDSTONE_BLOCK))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK));
        return builder;
    }

    private ShapelessRecipeJsonBuilder generate_hoe_recipe(){
        ShapelessRecipeJsonBuilder builder = ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, RedStoneItems.REDSTONE_HOE);
        builder.input(Items.REDSTONE_BLOCK, 2)
                .input(Items.REDSTONE, 1)
                .input(Items.STICK, 1)
                .input(Items.DIAMOND, 1)
                .criterion(FabricRecipeProvider.hasItem(RedStoneItems.REDSTONE_HOE),
                        FabricRecipeProvider.conditionsFromItem(RedStoneItems.REDSTONE_HOE))
                .criterion(FabricRecipeProvider.hasItem(Items.REDSTONE_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(Items.REDSTONE_BLOCK))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK));
        return builder;
    }


}
