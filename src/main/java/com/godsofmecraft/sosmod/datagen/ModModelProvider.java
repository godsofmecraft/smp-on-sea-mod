package com.godsofmecraft.sosmod.datagen;

import com.godsofmecraft.sosmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);}
    private void genSlabStairWallModels(BlockStateModelGenerator blockStateModelGenerator, Block block, Block slab, Block stairs, Block wall) {
        BlockStateModelGenerator.BlockTexturePool pool = blockStateModelGenerator.registerCubeAllModelTexturePool(block);
        pool.stairs(stairs);
        pool.slab(slab);
        pool.wall(wall);
    }




    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        genSlabStairWallModels(blockStateModelGenerator, Blocks.DRIPSTONE_BLOCK, ModBlocks.DRIPSTONE_SLAB, ModBlocks.DRIPSTONE_STAIRS, ModBlocks.DRIPSTONE_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.PACKED_MUD, ModBlocks.PACKED_MUD_SLAB, ModBlocks.PACKED_MUD_STAIRS, ModBlocks.PACKED_MUD_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.HONEYCOMB_BLOCK, ModBlocks.HONEYCOMB_BLOCK_SLAB, ModBlocks.HONEYCOMB_BLOCK_STAIRS, ModBlocks.HONEYCOMB_BLOCK_WALL);

        genSlabStairWallModels(blockStateModelGenerator, Blocks.CLAY, ModBlocks.CLAY_SLAB, ModBlocks.CLAY_STAIRS, ModBlocks.CLAY_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICKS_SLAB, ModBlocks.QUARTZ_BRICKS_STAIRS, ModBlocks.QUARTZ_BRICKS_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.SMOOTH_BASALT, ModBlocks.SMOOTH_BASALT_SLAB, ModBlocks.SMOOTH_BASALT_STAIRS, ModBlocks.SMOOTH_BASALT_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.NETHERRACK, ModBlocks.NETHERRACK_SLAB, ModBlocks.NETHERRACK_STAIRS, ModBlocks.NETHERRACK_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.END_STONE, ModBlocks.END_STONE_SLAB, ModBlocks.END_STONE_STAIRS, ModBlocks.END_STONE_WALL);


        genSlabStairWallModels(blockStateModelGenerator, Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_SLAB, ModBlocks.TERRACOTTA_STAIRS, ModBlocks.TERRACOTTA_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.WHITE_TERRACOTTA, ModBlocks.WHITE_TERRACOTTA_SLAB, ModBlocks.WHITE_TERRACOTTA_STAIRS, ModBlocks.WHITE_TERRACOTTA_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.LIGHT_GRAY_TERRACOTTA, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.GRAY_TERRACOTTA, ModBlocks.GRAY_TERRACOTTA_SLAB, ModBlocks.GRAY_TERRACOTTA_STAIRS, ModBlocks.GRAY_TERRACOTTA_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.BLACK_TERRACOTTA, ModBlocks.BLACK_TERRACOTTA_SLAB, ModBlocks.BLACK_TERRACOTTA_STAIRS, ModBlocks.BLACK_TERRACOTTA_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.BROWN_TERRACOTTA, ModBlocks.BROWN_TERRACOTTA_SLAB, ModBlocks.BROWN_TERRACOTTA_STAIRS, ModBlocks.BROWN_TERRACOTTA_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.RED_TERRACOTTA, ModBlocks.RED_TERRACOTTA_SLAB, ModBlocks.RED_TERRACOTTA_STAIRS, ModBlocks.RED_TERRACOTTA_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.ORANGE_TERRACOTTA, ModBlocks.ORANGE_TERRACOTTA_SLAB, ModBlocks.ORANGE_TERRACOTTA_STAIRS, ModBlocks.ORANGE_TERRACOTTA_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.YELLOW_TERRACOTTA, ModBlocks.YELLOW_TERRACOTTA_SLAB, ModBlocks.YELLOW_TERRACOTTA_STAIRS, ModBlocks.YELLOW_TERRACOTTA_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.LIME_TERRACOTTA, ModBlocks.LIME_TERRACOTTA_SLAB, ModBlocks.LIME_TERRACOTTA_STAIRS, ModBlocks.LIME_TERRACOTTA_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.GREEN_TERRACOTTA, ModBlocks.GREEN_TERRACOTTA_SLAB, ModBlocks.GREEN_TERRACOTTA_STAIRS, ModBlocks.GREEN_TERRACOTTA_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.CYAN_TERRACOTTA, ModBlocks.CYAN_TERRACOTTA_SLAB, ModBlocks.CYAN_TERRACOTTA_STAIRS, ModBlocks.CYAN_TERRACOTTA_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.LIGHT_BLUE_TERRACOTTA, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.BLUE_TERRACOTTA, ModBlocks.BLUE_TERRACOTTA_SLAB, ModBlocks.BLUE_TERRACOTTA_STAIRS, ModBlocks.BLUE_TERRACOTTA_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.PURPLE_TERRACOTTA, ModBlocks.PURPLE_TERRACOTTA_SLAB, ModBlocks.PURPLE_TERRACOTTA_STAIRS, ModBlocks.PURPLE_TERRACOTTA_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.MAGENTA_TERRACOTTA, ModBlocks.MAGENTA_TERRACOTTA_SLAB, ModBlocks.MAGENTA_TERRACOTTA_STAIRS, ModBlocks.MAGENTA_TERRACOTTA_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.PINK_TERRACOTTA, ModBlocks.PINK_TERRACOTTA_SLAB, ModBlocks.PINK_TERRACOTTA_STAIRS, ModBlocks.PINK_TERRACOTTA_WALL);

        genSlabStairWallModels(blockStateModelGenerator, Blocks.WHITE_CONCRETE, ModBlocks.WHITE_CONCRETE_SLAB, ModBlocks.WHITE_CONCRETE_STAIRS, ModBlocks.WHITE_CONCRETE_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.LIGHT_GRAY_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.GRAY_CONCRETE, ModBlocks.GRAY_CONCRETE_SLAB, ModBlocks.GRAY_CONCRETE_STAIRS, ModBlocks.GRAY_CONCRETE_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.BLACK_CONCRETE, ModBlocks.BLACK_CONCRETE_SLAB, ModBlocks.BLACK_CONCRETE_STAIRS, ModBlocks.BLACK_CONCRETE_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.BROWN_CONCRETE, ModBlocks.BROWN_CONCRETE_SLAB, ModBlocks.BROWN_CONCRETE_STAIRS, ModBlocks.BROWN_CONCRETE_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.RED_CONCRETE, ModBlocks.RED_CONCRETE_SLAB, ModBlocks.RED_CONCRETE_STAIRS, ModBlocks.RED_CONCRETE_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.ORANGE_CONCRETE, ModBlocks.ORANGE_CONCRETE_SLAB, ModBlocks.ORANGE_CONCRETE_STAIRS, ModBlocks.ORANGE_CONCRETE_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.YELLOW_CONCRETE, ModBlocks.YELLOW_CONCRETE_SLAB, ModBlocks.YELLOW_CONCRETE_STAIRS, ModBlocks.YELLOW_CONCRETE_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.LIME_CONCRETE, ModBlocks.LIME_CONCRETE_SLAB, ModBlocks.LIME_CONCRETE_STAIRS, ModBlocks.LIME_CONCRETE_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.GREEN_CONCRETE, ModBlocks.GREEN_CONCRETE_SLAB, ModBlocks.GREEN_CONCRETE_STAIRS, ModBlocks.GREEN_CONCRETE_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.CYAN_CONCRETE, ModBlocks.CYAN_CONCRETE_SLAB, ModBlocks.CYAN_CONCRETE_STAIRS, ModBlocks.CYAN_CONCRETE_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.LIGHT_BLUE_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.BLUE_CONCRETE, ModBlocks.BLUE_CONCRETE_SLAB, ModBlocks.BLUE_CONCRETE_STAIRS, ModBlocks.BLUE_CONCRETE_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.PURPLE_CONCRETE, ModBlocks.PURPLE_CONCRETE_SLAB, ModBlocks.PURPLE_CONCRETE_STAIRS, ModBlocks.PURPLE_CONCRETE_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.MAGENTA_CONCRETE, ModBlocks.MAGENTA_CONCRETE_SLAB, ModBlocks.MAGENTA_CONCRETE_STAIRS, ModBlocks.MAGENTA_CONCRETE_WALL);
        genSlabStairWallModels(blockStateModelGenerator, Blocks.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_SLAB, ModBlocks.PINK_CONCRETE_STAIRS, ModBlocks.PINK_CONCRETE_WALL);


        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_TULIP, ModBlocks.POTTED_YELLOW_TULIP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MAGENTA_TULIP, ModBlocks.POTTED_MAGENTA_TULIP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_TULIP, ModBlocks.POTTED_PURPLE_TULIP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ORANGE_YELLOW_TULIP, ModBlocks.POTTED_ORANGE_YELLOW_TULIP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_YELLOW_TULIP, ModBlocks.POTTED_PURPLE_YELLOW_TULIP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.RED_WHITE_TULIP, ModBlocks.POTTED_RED_WHITE_TULIP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.RAINBOW_TULIP, ModBlocks.POTTED_RAINBOW_TULIP, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_ORCHID, ModBlocks.POTTED_YELLOW_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WHITE_ORCHID, ModBlocks.POTTED_WHITE_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_ORCHID, ModBlocks.POTTED_PINK_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_YELLOW_ORCHID, ModBlocks.POTTED_PINK_YELLOW_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_ORCHID, ModBlocks.POTTED_PURPLE_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ORANGE_ORCHID, ModBlocks.POTTED_ORANGE_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GREEN_ORCHID, ModBlocks.POTTED_GREEN_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MAGENTA_WHITE_ORCHID, ModBlocks.POTTED_MAGENTA_WHITE_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.RED_ORCHID, ModBlocks.POTTED_RED_ORCHID, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_LILY_OF_THE_VALLEY, ModBlocks.POTTED_PINK_LILY_OF_THE_VALLEY, BlockStateModelGenerator.TintType.NOT_TINTED);



    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {



    }
}
