package com.godsofmecraft.sosmod.block;

import com.godsofmecraft.sosmod.SmpOnSeaMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK)));

    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            new StairsBlock(Blocks.PACKED_MUD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.PACKED_MUD)));
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.PACKED_MUD)));
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PACKED_MUD)));


    public static final Block HONEYCOMB_BLOCK_STAIRS = registerBlock("honeycomb_block_stairs",
            new StairsBlock(Blocks.HONEYCOMB_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.HONEYCOMB_BLOCK)));
    public static final Block HONEYCOMB_BLOCK_SLAB = registerBlock("honeycomb_block_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.HONEYCOMB_BLOCK)));
    public static final Block HONEYCOMB_BLOCK_WALL = registerBlock("honeycomb_block_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.HONEYCOMB_BLOCK)));

    public static final Block CLAY_STAIRS = registerBlock("clay_stairs",
            new StairsBlock(Blocks.CLAY.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CLAY)));
    public static final Block CLAY_SLAB = registerBlock("clay_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.CLAY)));
    public static final Block CLAY_WALL = registerBlock("clay_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CLAY)));

    public static final Block QUARTZ_BRICKS_STAIRS = registerBlock("quartz_bricks_stairs",
            new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_SLAB = registerBlock("quartz_bricks_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_WALL = registerBlock("quartz_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));

    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_BASALT)));

    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            new StairsBlock(Blocks.NETHERRACK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK)));

    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SmpOnSeaMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        SmpOnSeaMod.LOGGER.info("Registering Mod Blocks for" + SmpOnSeaMod.MOD_ID);
    }

}
