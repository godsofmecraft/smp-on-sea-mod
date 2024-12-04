package com.godsofmecraft.sosmod.datagen;

import com.godsofmecraft.sosmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.DRIPSTONE_STAIRS);
        addDrop(ModBlocks.DRIPSTONE_WALL);

        addDrop(ModBlocks.DRIPSTONE_SLAB, slabDrops(ModBlocks.DRIPSTONE_SLAB));

        addDrop(ModBlocks.PACKED_MUD_STAIRS);
        addDrop(ModBlocks.PACKED_MUD_WALL);

        addDrop(ModBlocks.PACKED_MUD_SLAB, slabDrops(ModBlocks.PACKED_MUD_SLAB));

        addDrop(ModBlocks.HONEYCOMB_BLOCK_STAIRS);
        addDrop(ModBlocks.HONEYCOMB_BLOCK_WALL);

        addDrop(ModBlocks.HONEYCOMB_BLOCK_SLAB, slabDrops(ModBlocks.HONEYCOMB_BLOCK_SLAB));

        addDrop(ModBlocks.CLAY_STAIRS);
        addDrop(ModBlocks.CLAY_WALL);

        addDrop(ModBlocks.CLAY_SLAB, slabDrops(ModBlocks.CLAY_SLAB));

        addDrop(ModBlocks.QUARTZ_BRICKS_STAIRS);
        addDrop(ModBlocks.QUARTZ_BRICKS_WALL);

        addDrop(ModBlocks.QUARTZ_BRICKS_SLAB, slabDrops(ModBlocks.QUARTZ_BRICKS_SLAB));

        addDrop(ModBlocks.SMOOTH_BASALT_STAIRS);
        addDrop(ModBlocks.SMOOTH_BASALT_WALL);

        addDrop(ModBlocks.SMOOTH_BASALT_SLAB, slabDrops(ModBlocks.SMOOTH_BASALT_SLAB));

        addDrop(ModBlocks.NETHERRACK_STAIRS);
        addDrop(ModBlocks.NETHERRACK_WALL);

        addDrop(ModBlocks.NETHERRACK_SLAB, slabDrops(ModBlocks.NETHERRACK_SLAB));

        addDrop(ModBlocks.END_STONE_STAIRS);
        addDrop(ModBlocks.END_STONE_WALL);

        addDrop(ModBlocks.END_STONE_SLAB, slabDrops(ModBlocks.END_STONE_SLAB));


    }
}
