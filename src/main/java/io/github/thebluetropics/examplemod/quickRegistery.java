package io.github.thebluetropics.examplemod;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class quickRegistery {

    public static Item registerItem(Item item, String name) {
        Identifier id = Identifier.of(ExampleMod.ID, name);
        return Registry.register(Registries.ITEM, id, item);
    }

    public static Block registerBlock(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(ExampleMod.ID, name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }
}
