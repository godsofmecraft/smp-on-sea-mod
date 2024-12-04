package com.godsofmecraft.sosmod.world;

import com.godsofmecraft.sosmod.SmpOnSeaMod;
import com.godsofmecraft.sosmod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_LILY_OF_THE_VALLEY_KEY =registerKey("pink_lily_of_the_valley");

    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_TULIP_KEY =registerKey("yellow_tulip");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAGENTA_TULIP_KEY =registerKey("magenta_tulip");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_TULIP_KEY =registerKey("purple_tulip");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_YELLOW_TULIP_KEY =registerKey("orange_yellow_tulip");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_YELLOW_TULIP_KEY =registerKey("purple_yellow_tulip");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_WHITE_TULIP_KEY =registerKey("red_white_tulip");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RAINBOW_TULIP_KEY =registerKey("rainbow_tulip");


    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_ORCHID_KEY =registerKey("yellow_orchid");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_ORCHID_KEY =registerKey("white_orchid");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_ORCHID_KEY =registerKey("pink_orchid");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_YELLOW_ORCHID_KEY =registerKey("pink_yellow_orchid");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_ORCHID_KEY =registerKey("purple__orchid");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_ORCHID_KEY =registerKey("orange_orchid");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GREEN_ORCHID_KEY =registerKey("green_orchid");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAGENTA_WHITE_ORCHID_KEY =registerKey("magenta_white_orchid");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_ORCHID_KEY =registerKey("red_orchid");




    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {


        register(context, PINK_LILY_OF_THE_VALLEY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                36, 5, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_LILY_OF_THE_VALLEY)))
        ));

        register(context, YELLOW_TULIP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                36, 5, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.YELLOW_TULIP)))
        ));
        register(context, MAGENTA_TULIP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                36, 5, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.MAGENTA_TULIP)))
        ));
        register(context, PURPLE_TULIP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                36, 5, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PURPLE_TULIP)))
        ));
        register(context, ORANGE_YELLOW_TULIP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                36, 5, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ORANGE_YELLOW_TULIP)))
        ));
        register(context, PURPLE_YELLOW_TULIP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                36, 5, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PURPLE_YELLOW_TULIP)))
        ));
        register(context, RED_WHITE_TULIP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                36, 5, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.RED_WHITE_TULIP)))
        ));
        register(context, RAINBOW_TULIP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                36, 5, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.RAINBOW_TULIP)))
        ));


        register(context, YELLOW_ORCHID_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                36, 5, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.YELLOW_ORCHID)))
        ));
        register(context, WHITE_ORCHID_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                36, 5, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_ORCHID)))
        ));
        register(context, PINK_ORCHID_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                36, 5, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_ORCHID)))
        ));
        register(context, PINK_YELLOW_ORCHID_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                36, 5, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_YELLOW_ORCHID)))
        ));
        register(context, PURPLE_ORCHID_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                36, 5, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PURPLE_ORCHID)))
        ));
        register(context, ORANGE_ORCHID_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                36, 5, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ORANGE_ORCHID)))
        ));
        register(context, GREEN_ORCHID_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                36, 5, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GREEN_ORCHID)))
        ));
        register(context, MAGENTA_WHITE_ORCHID_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                36, 5, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.MAGENTA_WHITE_ORCHID)))
        ));
        register(context, RED_ORCHID_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                36, 5, 5, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.RED_ORCHID)))
        ));



    }
    private static RandomPatchFeatureConfig createRandomPatchFeatureConfig(Block block, int tries) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(tries, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(block))));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(SmpOnSeaMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
