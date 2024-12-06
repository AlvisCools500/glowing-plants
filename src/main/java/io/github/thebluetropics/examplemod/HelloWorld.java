package io.github.thebluetropics.examplemod;


import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class HelloWorld { // class
  public static final Item CUSTOM_ITEM = Registry.register(
    Registries.ITEM, // registry key (there's also Registries.BLOCK)
    Identifier.of(
      ExampleMod.ID, // mod id
      "my_custom_item" // item id
    ),
    new Item(
      new Item.Settings()
    )
  );

  /// Call `HelloWorld.initialize()` in `ExampleMod`
  public static void initialize() { /* ... */ }
}
