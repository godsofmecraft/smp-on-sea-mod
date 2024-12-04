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



    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {



    }
}
