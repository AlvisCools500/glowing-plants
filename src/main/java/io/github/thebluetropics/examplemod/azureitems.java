package io.github.thebluetropics.examplemod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class azureitems {

    // Items
    public static final Item NEON_STICK = quickRegistery.registerItem(new Item(
            new Item.Settings().maxCount(16).fireproof()
    ), "neon_stick");

    public static void initialize() {}
}
