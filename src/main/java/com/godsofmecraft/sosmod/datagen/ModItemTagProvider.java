package com.godsofmecraft.sosmod.datagen;

import com.godsofmecraft.sosmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.FLOWERS)
                .add(ModBlocks.MAGENTA_TULIP.asItem())
                .add(ModBlocks.YELLOW_TULIP.asItem())
                .add(ModBlocks.PURPLE_TULIP.asItem())
                .add(ModBlocks.RAINBOW_TULIP.asItem())
                .add(ModBlocks.RED_WHITE_TULIP.asItem())
                .add(ModBlocks.ORANGE_YELLOW_TULIP.asItem())
                .add(ModBlocks.PURPLE_YELLOW_TULIP.asItem())
                .add(ModBlocks.PINK_LILY_OF_THE_VALLEY.asItem())
                .add(ModBlocks.YELLOW_ORCHID.asItem())
                .add(ModBlocks.ORANGE_ORCHID.asItem())
                .add(ModBlocks.GREEN_ORCHID.asItem())
                .add(ModBlocks.PINK_ORCHID.asItem())
                .add(ModBlocks.PURPLE_ORCHID.asItem())
                .add(ModBlocks.RED_ORCHID.asItem())
                .add(ModBlocks.WHITE_ORCHID.asItem())
                .add(ModBlocks.MAGENTA_WHITE_ORCHID.asItem())
                .add(ModBlocks.PINK_YELLOW_ORCHID.asItem());


        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(ModBlocks.MAGENTA_TULIP.asItem())
                .add(ModBlocks.YELLOW_TULIP.asItem())
                .add(ModBlocks.PURPLE_TULIP.asItem())
                .add(ModBlocks.RAINBOW_TULIP.asItem())
                .add(ModBlocks.RED_WHITE_TULIP.asItem())
                .add(ModBlocks.ORANGE_YELLOW_TULIP.asItem())
                .add(ModBlocks.PURPLE_YELLOW_TULIP.asItem())
                .add(ModBlocks.PINK_LILY_OF_THE_VALLEY.asItem())
                .add(ModBlocks.YELLOW_ORCHID.asItem())
                .add(ModBlocks.ORANGE_ORCHID.asItem())
                .add(ModBlocks.GREEN_ORCHID.asItem())
                .add(ModBlocks.PINK_ORCHID.asItem())
                .add(ModBlocks.PURPLE_ORCHID.asItem())
                .add(ModBlocks.RED_ORCHID.asItem())
                .add(ModBlocks.WHITE_ORCHID.asItem())
                .add(ModBlocks.MAGENTA_WHITE_ORCHID.asItem())
                .add(ModBlocks.PINK_YELLOW_ORCHID.asItem());





    }
}
