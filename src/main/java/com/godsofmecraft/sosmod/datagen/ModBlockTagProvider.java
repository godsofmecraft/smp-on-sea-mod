package com.godsofmecraft.sosmod.datagen;

import com.godsofmecraft.sosmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

    public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
        public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);


        }



        @Override
        protected void configure(RegistryWrapper.WrapperLookup arg) {

            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                    .add(ModBlocks.DRIPSTONE_STAIRS)
                    .add(ModBlocks.DRIPSTONE_SLAB)
                    .add(ModBlocks.DRIPSTONE_WALL)
                    .add(ModBlocks.PACKED_MUD_STAIRS)
                    .add(ModBlocks.PACKED_MUD_SLAB)
                    .add(ModBlocks.PACKED_MUD_WALL)
                    .add(ModBlocks.HONEYCOMB_BLOCK_STAIRS)
                    .add(ModBlocks.HONEYCOMB_BLOCK_SLAB)
                    .add(ModBlocks.HONEYCOMB_BLOCK_STAIRS)
                    .add(ModBlocks.QUARTZ_BRICKS_STAIRS)
                    .add(ModBlocks.QUARTZ_BRICKS_SLAB)
                    .add(ModBlocks.QUARTZ_BRICKS_WALL)
                    .add(ModBlocks.SMOOTH_BASALT_STAIRS)
                    .add(ModBlocks.SMOOTH_BASALT_SLAB)
                    .add(ModBlocks.SMOOTH_BASALT_WALL)
                    .add(ModBlocks.NETHERRACK_STAIRS)
                    .add(ModBlocks.NETHERRACK_SLAB)
                    .add(ModBlocks.NETHERRACK_WALL)
                    .add(ModBlocks.END_STONE_STAIRS)
                    .add(ModBlocks.END_STONE_SLAB)
                    .add(ModBlocks.END_STONE_WALL);

            getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                    .add(ModBlocks.CLAY_STAIRS)
                    .add(ModBlocks.CLAY_SLAB)
                    .add(ModBlocks.CLAY_WALL);

            getOrCreateTagBuilder(BlockTags.WALLS)
                    .add(ModBlocks.DRIPSTONE_WALL)
                    .add(ModBlocks.PACKED_MUD_WALL)
                    .add(ModBlocks.HONEYCOMB_BLOCK_WALL)
                    .add(ModBlocks.CLAY_WALL)
                    .add(ModBlocks.QUARTZ_BRICKS_WALL)
                    .add(ModBlocks.SMOOTH_BASALT_WALL)
                    .add(ModBlocks.NETHERRACK_WALL)
                    .add(ModBlocks.END_STONE_WALL);


        }
    }
