package com.myc0tic.mycultism.item;

import com.myc0tic.mycultism.Mycultism;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
       public static final Item MAGIC_MUSHROOM = registerItem("magic_mushroom",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Mycultism.MOD_ID,"magic_mushroom")))));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Mycultism.MOD_ID, name),item);
    }

    public static void registerModItems() {
        Mycultism.LOGGER.info("registering mod items for "+ Mycultism.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(MAGIC_MUSHROOM);
        });
    }

}
