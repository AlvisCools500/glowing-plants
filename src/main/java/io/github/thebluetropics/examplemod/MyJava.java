package io.github.thebluetropics.examplemod;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MyJava {
    public static final Item NEON_STICK = Registry.register(
            Registries.ITEM,
            Identifier.of(ExampleMod.ID, "Neon_Stick"),
            new Item(new Item.Settings())
    );

    public static void initialize() {}

}
