package com.godsofmecraft.sosmod.datagen;

import com.godsofmecraft.sosmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {



    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //DRIPSTONE
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);

        createStairsRecipe(ModBlocks.DRIPSTONE_STAIRS, Ingredient.ofItems(Blocks.DRIPSTONE_BLOCK))
                .criterion(hasItem(Items.DRIPSTONE_BLOCK), conditionsFromItem(Items.DRIPSTONE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DRIPSTONE_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);

        //PACKED MUD
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);

        createStairsRecipe(ModBlocks.PACKED_MUD_STAIRS, Ingredient.ofItems(Blocks.PACKED_MUD))
                .criterion(hasItem(Items.PACKED_MUD), conditionsFromItem(Items.PACKED_MUD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PACKED_MUD_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_STAIRS, Blocks.PACKED_MUD);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);

        //honeycomb
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HONEYCOMB_BLOCK_SLAB, Blocks.HONEYCOMB_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HONEYCOMB_BLOCK_WALL, Blocks.HONEYCOMB_BLOCK);

        createStairsRecipe(ModBlocks.HONEYCOMB_BLOCK_STAIRS, Ingredient.ofItems(Blocks.HONEYCOMB_BLOCK))
                .criterion(hasItem(Items.HONEYCOMB_BLOCK), conditionsFromItem(Items.HONEYCOMB_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.HONEYCOMB_BLOCK_STAIRS)));

        //clay

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CLAY_SLAB, Blocks.CLAY);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CLAY_WALL, Blocks.CLAY);

        createStairsRecipe(ModBlocks.CLAY_STAIRS, Ingredient.ofItems(Blocks.CLAY))
                .criterion(hasItem(Items.CLAY), conditionsFromItem(Items.CLAY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CLAY_STAIRS)));
//quartz
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICKS_SLAB, Blocks.QUARTZ_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICKS_WALL, Blocks.QUARTZ_BRICKS);

        createStairsRecipe(ModBlocks.QUARTZ_BRICKS_STAIRS, Ingredient.ofItems(Blocks.QUARTZ_BRICKS))
                .criterion(hasItem(Items.QUARTZ_BRICKS), conditionsFromItem(Items.QUARTZ_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.QUARTZ_BRICKS_STAIRS)));
        //basalt

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);

        createStairsRecipe(ModBlocks.SMOOTH_BASALT_STAIRS, Ingredient.ofItems(Blocks.SMOOTH_BASALT))
                .criterion(hasItem(Items.SMOOTH_BASALT), conditionsFromItem(Items.SMOOTH_BASALT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMOOTH_BASALT_STAIRS)));
        //netherack

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);

        createStairsRecipe(ModBlocks.NETHERRACK_STAIRS, Ingredient.ofItems(Blocks.NETHERRACK))
                .criterion(hasItem(Items.NETHERRACK), conditionsFromItem(Items.NETHERRACK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.NETHERRACK_STAIRS)));
        //endstone

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB, Blocks.END_STONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_WALL, Blocks.END_STONE);

        createStairsRecipe(ModBlocks.END_STONE_STAIRS, Ingredient.ofItems(Blocks.END_STONE))
                .criterion(hasItem(Items.END_STONE), conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.END_STONE_STAIRS)));



    }
}
