package com.godsofmecraft.sosmod.world;

import com.godsofmecraft.sosmod.SmpOnSeaMod;
import com.godsofmecraft.sosmod.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
   public static final RegistryKey<PlacedFeature> PINK_LILY_OF_THE_VALLEY_PLACED = registerKey("pink_lily_of_the_valley_placed");
    public static final RegistryKey<PlacedFeature> YELLOW_TULIP_PLACED = registerKey("yellow_tulip_placed");
    public static final RegistryKey<PlacedFeature> MAGENTA_TULIP_PLACED = registerKey("magenta_tulip_placed");
    public static final RegistryKey<PlacedFeature> PURPLE_TULIP_PLACED = registerKey("purple_tulip_placed");
    public static final RegistryKey<PlacedFeature> ORANGE_YELLOW_TULIP_PLACED = registerKey("orange_yellow_tulip_placed");
    public static final RegistryKey<PlacedFeature> PURPLE_YELLOW_TULIP_PLACED = registerKey("purple_yellow_tulip_placed");
    public static final RegistryKey<PlacedFeature> RED_WHITE_TULIP_PLACED = registerKey("red_white_tulip_placed");
    public static final RegistryKey<PlacedFeature> RAINBOW_TULIP_PLACED = registerKey("rainbow_tulip_placed");



    public static final RegistryKey<PlacedFeature> YELLOW_ORCHID_PLACED = registerKey("yellow_orchid_placed");
    public static final RegistryKey<PlacedFeature> WHITE_ORCHID_PLACED = registerKey("white_orchid_placed");
    public static final RegistryKey<PlacedFeature> PINK_ORCHID_PLACED = registerKey("pink_orchid_placed");
    public static final RegistryKey<PlacedFeature> PINK_YELLOW_ORCHID_PLACED = registerKey("pink_yellow_orchid_placed");
    public static final RegistryKey<PlacedFeature> PURPLE_ORCHID_PLACED = registerKey("purple_orchid_placed");
    public static final RegistryKey<PlacedFeature> ORANGE_ORCHID_PLACED = registerKey("orange_orchid_placed");
    public static final RegistryKey<PlacedFeature> GREEN_ORCHID_PLACED = registerKey("green_orchid_placed");
    public static final RegistryKey<PlacedFeature> MAGENTA_WHITE_ORCHID_PLACED = registerKey("magenta_white_orchid_placed");
    public static final RegistryKey<PlacedFeature> RED_ORCHID_PLACED = registerKey("red_orchid_placed");



    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, PINK_LILY_OF_THE_VALLEY_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_LILY_OF_THE_VALLEY_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(25), ModBlocks.PINK_LILY_OF_THE_VALLEY));

        register(context, YELLOW_TULIP_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YELLOW_TULIP_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(10), ModBlocks.YELLOW_TULIP));
        register(context, MAGENTA_TULIP_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MAGENTA_TULIP_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(10), ModBlocks.MAGENTA_TULIP));
        register(context, PURPLE_TULIP_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PURPLE_TULIP_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(10), ModBlocks.PURPLE_TULIP));
        register(context, ORANGE_YELLOW_TULIP_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORANGE_YELLOW_TULIP_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(10), ModBlocks.ORANGE_YELLOW_TULIP));
        register(context, PURPLE_YELLOW_TULIP_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PURPLE_YELLOW_TULIP_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(10), ModBlocks.PURPLE_YELLOW_TULIP));
        register(context, RED_WHITE_TULIP_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RED_WHITE_TULIP_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(10), ModBlocks.RED_WHITE_TULIP));
        register(context, RAINBOW_TULIP_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RAINBOW_TULIP_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(13), ModBlocks.RAINBOW_TULIP));



        register(context, YELLOW_ORCHID_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YELLOW_ORCHID_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(20), ModBlocks.YELLOW_ORCHID));
        register(context, WHITE_ORCHID_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_ORCHID_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(20), ModBlocks.WHITE_ORCHID));
        register(context, PINK_ORCHID_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_ORCHID_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(20), ModBlocks.PINK_ORCHID));
        register(context, PINK_YELLOW_ORCHID_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_YELLOW_ORCHID_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(25), ModBlocks.PINK_YELLOW_ORCHID));
        register(context, PURPLE_ORCHID_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PURPLE_ORCHID_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(20), ModBlocks.PURPLE_ORCHID));
        register(context, ORANGE_ORCHID_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORANGE_ORCHID_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(20), ModBlocks.ORANGE_ORCHID));
        register(context, GREEN_ORCHID_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GREEN_ORCHID_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(20), ModBlocks.GREEN_ORCHID));
        register(context, MAGENTA_WHITE_ORCHID_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MAGENTA_WHITE_ORCHID_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(25), ModBlocks.MAGENTA_WHITE_ORCHID));
        register(context, RED_ORCHID_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RED_ORCHID_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(RarityFilterPlacementModifier.of(20), ModBlocks.RED_ORCHID));





    }
    public static List<PlacementModifier> makePatchPlacements(PlacementModifier countOrRarity) {
        return List.of(countOrRarity, SquarePlacementModifier.of(), PlacedFeatures.FOUR_ABOVE_AND_BELOW_RANGE, BiomePlacementModifier.of());
    }


    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(SmpOnSeaMod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
