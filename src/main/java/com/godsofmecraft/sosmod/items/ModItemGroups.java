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




                    } ).build());


    public static void  registerItemGroups() {
        SmpOnSeaMod.LOGGER.info("Registering Item Group for" + SmpOnSeaMod.MOD_ID );

    }
}
