package com.godsofmecraft.sosmod.block;

import com.godsofmecraft.sosmod.SmpOnSeaMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
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





    //terracotta
    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            new StairsBlock(Blocks.TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));

    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));

    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));

    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));

    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));

    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));

    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));

    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));

    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));

    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));

    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));

    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));

    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));

    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));


    //concrete

    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)));

    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)));

    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));

    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)));

    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));

    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));

    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));

    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)));

    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));

    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)));

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)));

    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));

    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));

    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)));

    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)));


    //FLOWERS


    public static final Block YELLOW_TULIP = registerBlock("yellow_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,
                    FabricBlockSettings.copyOf(Blocks.RED_TULIP).nonOpaque().noCollision()));
    public static final Block POTTED_YELLOW_TULIP = Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID,"potted_yellow_tulip"),
            new FlowerPotBlock(YELLOW_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP).nonOpaque()));

    public static final Block MAGENTA_TULIP = registerBlock("magenta_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,
                    FabricBlockSettings.copyOf(Blocks.RED_TULIP).nonOpaque().noCollision()));
    public static final Block POTTED_MAGENTA_TULIP = Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID,"potted_magenta_tulip"),
            new FlowerPotBlock(MAGENTA_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP).nonOpaque()));

    public static final Block PURPLE_TULIP = registerBlock("purple_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,
                    FabricBlockSettings.copyOf(Blocks.RED_TULIP).nonOpaque().noCollision()));
    public static final Block POTTED_PURPLE_TULIP = Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID,"potted_purple_tulip"),
            new FlowerPotBlock(PURPLE_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP).nonOpaque()));

    public static final Block PURPLE_YELLOW_TULIP = registerBlock("purple_yellow_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,
                    FabricBlockSettings.copyOf(Blocks.RED_TULIP).nonOpaque().noCollision()));
    public static final Block POTTED_PURPLE_YELLOW_TULIP = Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID,"potted_purple_yellow_tulip"),
            new FlowerPotBlock(PURPLE_YELLOW_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP).nonOpaque()));

    public static final Block ORANGE_YELLOW_TULIP = registerBlock("orange_yellow_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,
                    FabricBlockSettings.copyOf(Blocks.RED_TULIP).nonOpaque().noCollision()));
    public static final Block POTTED_ORANGE_YELLOW_TULIP = Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID,"potted_orange_yellow_tulip"),
            new FlowerPotBlock(ORANGE_YELLOW_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP).nonOpaque()));

    public static final Block RED_WHITE_TULIP = registerBlock("red_white_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,
                    FabricBlockSettings.copyOf(Blocks.RED_TULIP).nonOpaque().noCollision()));
    public static final Block POTTED_RED_WHITE_TULIP = Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID,"potted_red_white_tulip"),
            new FlowerPotBlock(RED_WHITE_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP).nonOpaque()));

    public static final Block RAINBOW_TULIP = registerBlock("rainbow_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 9,
                    FabricBlockSettings.copyOf(Blocks.RED_TULIP).nonOpaque().noCollision()));
    public static final Block POTTED_RAINBOW_TULIP = Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID,"potted_rainbow_tulip"),
            new FlowerPotBlock(RAINBOW_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP).nonOpaque()));


    public static final Block YELLOW_ORCHID = registerBlock("yellow_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 3,
                    FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).nonOpaque().noCollision()));
    public static final Block POTTED_YELLOW_ORCHID = Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID,"potted_yellow_orchid"),
            new FlowerPotBlock(YELLOW_ORCHID, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));

    public static final Block WHITE_ORCHID = registerBlock("white_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 3,
                    FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).nonOpaque().noCollision()));
    public static final Block POTTED_WHITE_ORCHID = Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID,"potted_white_orchid"),
            new FlowerPotBlock(WHITE_ORCHID, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));

    public static final Block PINK_ORCHID = registerBlock("pink_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 3,
                    FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).nonOpaque().noCollision()));
    public static final Block POTTED_PINK_ORCHID = Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID,"potted_pink_orchid"),
            new FlowerPotBlock(PINK_ORCHID, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));

    public static final Block PINK_YELLOW_ORCHID = registerBlock("pink_yellow_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 3,
                    FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).nonOpaque().noCollision()));
    public static final Block POTTED_PINK_YELLOW_ORCHID = Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID,"potted_pink_yellow_orchid"),
            new FlowerPotBlock(PINK_YELLOW_ORCHID, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));

    public static final Block PURPLE_ORCHID = registerBlock("purple_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 3,
                    FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).nonOpaque().noCollision()));
    public static final Block POTTED_PURPLE_ORCHID = Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID,"potted_purple_orchid"),
            new FlowerPotBlock(PURPLE_ORCHID, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));


    public static final Block ORANGE_ORCHID = registerBlock("orange_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 3,
                    FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).nonOpaque().noCollision()));
    public static final Block POTTED_ORANGE_ORCHID = Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID,"potted_orange_orchid"),
            new FlowerPotBlock(ORANGE_ORCHID, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));

    public static final Block GREEN_ORCHID = registerBlock("green_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 3,
                    FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).nonOpaque().noCollision()));
    public static final Block POTTED_GREEN_ORCHID = Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID,"potted_green_orchid"),
            new FlowerPotBlock(GREEN_ORCHID, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));

    public static final Block MAGENTA_WHITE_ORCHID = registerBlock("magenta_white_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 3,
                    FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).nonOpaque().noCollision()));
    public static final Block POTTED_MAGENTA_WHITE_ORCHID = Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID,"potted_magenta_white_orchid"),
            new FlowerPotBlock(MAGENTA_WHITE_ORCHID, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));

    public static final Block RED_ORCHID = registerBlock("red_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 3,
                    FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).nonOpaque().noCollision()));
    public static final Block POTTED_RED_ORCHID = Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID,"potted_red_orchid"),
            new FlowerPotBlock(RED_ORCHID, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));

    public static final Block PINK_LILY_OF_THE_VALLEY = registerBlock("pink_lily_of_the_valley",
            new FlowerBlock(StatusEffects.POISON, 12,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_PINK_LILY_OF_THE_VALLEY = Registry.register(Registries.BLOCK, new Identifier(SmpOnSeaMod.MOD_ID,"potted_pink_lily_of_the_valley"),
            new FlowerPotBlock(PINK_LILY_OF_THE_VALLEY, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));


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
