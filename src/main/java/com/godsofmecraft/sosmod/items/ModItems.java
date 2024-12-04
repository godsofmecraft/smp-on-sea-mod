package com.godsofmecraft.sosmod.items;

import com.godsofmecraft.sosmod.SmpOnSeaMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SmpOnSeaMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        SmpOnSeaMod.LOGGER.info("Registering Mod Items for" + SmpOnSeaMod.MOD_ID);

    }

}
