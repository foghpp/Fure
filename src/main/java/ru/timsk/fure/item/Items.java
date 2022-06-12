package ru.timsk.fure.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.timsk.fure.block.Blocks;
import ru.timsk.fure.item.charm.*;
import ru.timsk.fure.item.food.*;

public class Items {
    // Charms.
    public static final HungerCharm HUNGER_CHARM = new HungerCharm();

    // Food.
    public static final FishSoup FISH_SOUP = new FishSoup();

    public static void register() {
        // Block items.
        Registry.register(Registry.ITEM, new Identifier("fure", "mossy_oak_log"), new BlockItem(Blocks.MOSSY_OAK_LOG, new FabricItemSettings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("fure", "mossy_oak_planks"), new BlockItem(Blocks.MOSSY_OAK_PLANKS, new FabricItemSettings().group(ItemGroup.MATERIALS)));

        // Charms.
        Registry.register(Registry.ITEM, new Identifier("fure", "hunger_charm"), HUNGER_CHARM);

        // Food.
        Registry.register(Registry.ITEM, new Identifier("fure", "fish_soup"), FISH_SOUP);
    }
}
