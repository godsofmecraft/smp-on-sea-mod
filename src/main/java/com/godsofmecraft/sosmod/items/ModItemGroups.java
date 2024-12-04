package com.godsofmecraft.sosmod.items;

import com.godsofmecraft.sosmod.SmpOnSeaMod;
import com.godsofmecraft.sosmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SMP_ON_SEA = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SmpOnSeaMod.MOD_ID, "smp_on_sea"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.smp_on_sea"))
                    .icon(() -> new ItemStack(Items.SAND)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DRIPSTONE_STAIRS);
                        entries.add(ModBlocks.DRIPSTONE_SLAB);
                        entries.add(ModBlocks.DRIPSTONE_WALL);
                        entries.add(ModBlocks.PACKED_MUD_STAIRS);
                        entries.add(ModBlocks.PACKED_MUD_SLAB);
                        entries.add(ModBlocks.PACKED_MUD_WALL);
                        entries.add(ModBlocks.HONEYCOMB_BLOCK_STAIRS);
                        entries.add(ModBlocks.HONEYCOMB_BLOCK_SLAB);
                        entries.add(ModBlocks.HONEYCOMB_BLOCK_WALL);
                        entries.add(ModBlocks.CLAY_STAIRS);
                        entries.add(ModBlocks.CLAY_SLAB);
                        entries.add(ModBlocks.CLAY_WALL);
                        entries.add(ModBlocks.QUARTZ_BRICKS_STAIRS);
                        entries.add(ModBlocks.QUARTZ_BRICKS_SLAB);
                        entries.add(ModBlocks.QUARTZ_BRICKS_WALL);
                        entries.add(ModBlocks.SMOOTH_BASALT_STAIRS);
                        entries.add(ModBlocks.SMOOTH_BASALT_SLAB);
                        entries.add(ModBlocks.SMOOTH_BASALT_WALL);
                        entries.add(ModBlocks.NETHERRACK_STAIRS);
                        entries.add(ModBlocks.NETHERRACK_SLAB);
                        entries.add(ModBlocks.NETHERRACK_WALL);
                        entries.add(ModBlocks.END_STONE_STAIRS);
                        entries.add(ModBlocks.END_STONE_SLAB);
                        entries.add(ModBlocks.END_STONE_WALL);

                        entries.add(ModBlocks.YELLOW_TULIP);
                        entries.add(ModBlocks.MAGENTA_TULIP);
                        entries.add(ModBlocks.PURPLE_TULIP);
                        entries.add(ModBlocks.ORANGE_YELLOW_TULIP);
                        entries.add(ModBlocks.PURPLE_YELLOW_TULIP);
                        entries.add(ModBlocks.RED_WHITE_TULIP);
                        entries.add(ModBlocks.RAINBOW_TULIP);

                        entries.add(ModBlocks.YELLOW_ORCHID);
                        entries.add(ModBlocks.WHITE_ORCHID);
                        entries.add(ModBlocks.PINK_ORCHID);
                        entries.add(ModBlocks.PINK_YELLOW_ORCHID);
                        entries.add(ModBlocks.PURPLE_ORCHID);
                        entries.add(ModBlocks.ORANGE_ORCHID);
                        entries.add(ModBlocks.GREEN_ORCHID);
                        entries.add(ModBlocks.MAGENTA_WHITE_ORCHID);
                        entries.add(ModBlocks.RED_ORCHID);

                        entries.add(ModBlocks.PINK_LILY_OF_THE_VALLEY);



                        entries .add(ModBlocks.TERRACOTTA_STAIRS);
                        entries .add(ModBlocks.TERRACOTTA_SLAB);
                        entries   .add(ModBlocks.TERRACOTTA_WALL);
                        entries    .add(ModBlocks.WHITE_TERRACOTTA_STAIRS);
                        entries    .add(ModBlocks.WHITE_TERRACOTTA_SLAB);
                        entries    .add(ModBlocks.WHITE_TERRACOTTA_WALL);
                        entries   .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
                        entries    .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
                        entries   .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
                        entries     .add(ModBlocks.GRAY_TERRACOTTA_STAIRS);
                        entries      .add(ModBlocks.GRAY_TERRACOTTA_SLAB);
                        entries      .add(ModBlocks.GRAY_TERRACOTTA_WALL);
                        entries     .add(ModBlocks.BLACK_TERRACOTTA_STAIRS);
                        entries     .add(ModBlocks.BLACK_TERRACOTTA_SLAB);
                        entries     .add(ModBlocks.BLACK_TERRACOTTA_WALL);
                        entries     .add(ModBlocks.BROWN_TERRACOTTA_STAIRS);
                        entries     .add(ModBlocks.BROWN_TERRACOTTA_SLAB);
                        entries     .add(ModBlocks.BROWN_TERRACOTTA_WALL);
                        entries     .add(ModBlocks.RED_TERRACOTTA_STAIRS);
                        entries       .add(ModBlocks.RED_TERRACOTTA_SLAB);
                        entries       .add(ModBlocks.RED_TERRACOTTA_WALL);
                        entries      .add(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
                        entries       .add(ModBlocks.ORANGE_TERRACOTTA_SLAB);
                        entries      .add(ModBlocks.ORANGE_TERRACOTTA_WALL);
                        entries       .add(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
                        entries      .add(ModBlocks.YELLOW_TERRACOTTA_SLAB);
                        entries       .add(ModBlocks.YELLOW_TERRACOTTA_WALL);
                        entries       .add(ModBlocks.LIME_TERRACOTTA_STAIRS);
                        entries      .add(ModBlocks.LIME_TERRACOTTA_SLAB);
                        entries      .add(ModBlocks.LIME_TERRACOTTA_WALL);
                        entries      .add(ModBlocks.GREEN_TERRACOTTA_STAIRS);
                        entries      .add(ModBlocks.GREEN_TERRACOTTA_SLAB);
                        entries      .add(ModBlocks.GREEN_TERRACOTTA_WALL);
                        entries      .add(ModBlocks.CYAN_TERRACOTTA_STAIRS);
                        entries      .add(ModBlocks.CYAN_TERRACOTTA_SLAB);
                        entries      .add(ModBlocks.CYAN_TERRACOTTA_WALL);
                        entries      .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
                        entries       .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
                        entries       .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
                        entries      .add(ModBlocks.BLUE_TERRACOTTA_STAIRS);
                        entries      .add(ModBlocks.BLUE_TERRACOTTA_SLAB);
                        entries       .add(ModBlocks.BLUE_TERRACOTTA_WALL);
                        entries      .add(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
                        entries      .add(ModBlocks.PURPLE_TERRACOTTA_SLAB);
                        entries      .add(ModBlocks.PURPLE_TERRACOTTA_WALL);
                        entries       .add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
                        entries       .add(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
                        entries      .add(ModBlocks.MAGENTA_TERRACOTTA_WALL);
                        entries      .add(ModBlocks.PINK_TERRACOTTA_STAIRS);
                        entries      .add(ModBlocks.PINK_TERRACOTTA_SLAB);
                        entries      .add(ModBlocks.PINK_TERRACOTTA_WALL);
                        entries      .add(ModBlocks.WHITE_CONCRETE_STAIRS);
                        entries      .add(ModBlocks.WHITE_CONCRETE_SLAB);
                        entries     .add(ModBlocks.WHITE_CONCRETE_WALL);
                        entries      .add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
                        entries      .add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
                        entries       .add(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);
                        entries       .add(ModBlocks.GRAY_CONCRETE_STAIRS);
                        entries       .add(ModBlocks.GRAY_CONCRETE_SLAB);
                        entries       .add(ModBlocks.GRAY_CONCRETE_WALL);
                        entries      .add(ModBlocks.BLACK_CONCRETE_STAIRS);
                        entries       .add(ModBlocks.BLACK_CONCRETE_SLAB);
                        entries      .add(ModBlocks.BLACK_CONCRETE_WALL);
                        entries      .add(ModBlocks.BROWN_CONCRETE_STAIRS);
                        entries      .add(ModBlocks.BROWN_CONCRETE_SLAB);
                        entries     .add(ModBlocks.BROWN_CONCRETE_WALL);
                        entries     .add(ModBlocks.RED_CONCRETE_STAIRS);
                        entries     .add(ModBlocks.RED_CONCRETE_SLAB);
                        entries      .add(ModBlocks.RED_CONCRETE_WALL);
                        entries    .add(ModBlocks.ORANGE_CONCRETE_STAIRS);
                        entries      .add(ModBlocks.ORANGE_CONCRETE_SLAB);
                        entries     .add(ModBlocks.ORANGE_CONCRETE_WALL);
                        entries    .add(ModBlocks.YELLOW_CONCRETE_STAIRS);
                        entries   .add(ModBlocks.YELLOW_CONCRETE_SLAB);
                        entries   .add(ModBlocks.YELLOW_CONCRETE_WALL);
                        entries   .add(ModBlocks.LIME_CONCRETE_STAIRS);
                        entries   .add(ModBlocks.LIME_CONCRETE_SLAB);
                        entries   .add(ModBlocks.LIME_CONCRETE_WALL);
                        entries    .add(ModBlocks.GREEN_CONCRETE_STAIRS);
                        entries   .add(ModBlocks.GREEN_CONCRETE_SLAB);
                        entries   .add(ModBlocks.GREEN_CONCRETE_WALL);
                        entries     .add(ModBlocks.CYAN_CONCRETE_STAIRS);
                        entries    .add(ModBlocks.CYAN_CONCRETE_SLAB);
                        entries    .add(ModBlocks.CYAN_CONCRETE_WALL);
                        entries     .add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
                        entries     .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
                        entries    .add(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);
                        entries    .add(ModBlocks.BLUE_CONCRETE_STAIRS);
                        entries    .add(ModBlocks.BLUE_CONCRETE_SLAB);
                        entries    .add(ModBlocks.BLUE_CONCRETE_WALL);
                        entries     .add(ModBlocks.PURPLE_CONCRETE_STAIRS);
                        entries    .add(ModBlocks.PURPLE_CONCRETE_SLAB);
                        entries    .add(ModBlocks.PURPLE_CONCRETE_WALL);
                        entries   .add(ModBlocks.MAGENTA_CONCRETE_STAIRS);
                        entries    .add(ModBlocks.MAGENTA_CONCRETE_SLAB);
                        entries    .add(ModBlocks.MAGENTA_CONCRETE_WALL);
                        entries   .add(ModBlocks.PINK_CONCRETE_STAIRS);
                        entries    .add(ModBlocks.PINK_CONCRETE_SLAB);
                        entries    .add(ModBlocks.PINK_CONCRETE_WALL);






                    } ).build());


    public static void  registerItemGroups() {
        SmpOnSeaMod.LOGGER.info("Registering Item Group for" + SmpOnSeaMod.MOD_ID );

    }
}
