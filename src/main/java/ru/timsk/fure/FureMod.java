package ru.timsk.fure;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.timsk.fure.block.MossyOakLog;
import ru.timsk.fure.block.MossyOakPlanks;
import ru.timsk.fure.item.charm.*;
import ru.timsk.fure.item.food.*;

public class FureMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final Logger LOGGER = LoggerFactory.getLogger("fure");

	// Charms.
	public static final HungerCharm HUNGER_CHARM = new HungerCharm();

	// Food.
	public static final FishSoup FISH_SOUP = new FishSoup();

	// Blocks.
	public static final MossyOakLog MOSSY_OAK_LOG = new MossyOakLog(
			FabricBlockSettings.of(Material.WOOD).strength(1.0f));
	public static final MossyOakPlanks MOSSY_OAK_PLANKS = new MossyOakPlanks(
			FabricBlockSettings.of(Material.WOOD).strength(1.0f));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// Charms.
		Registry.register(Registry.ITEM, new Identifier("fure", "hunger_charm"), HUNGER_CHARM);

		// Food.
		Registry.register(Registry.ITEM, new Identifier("fure", "fish_soup"), FISH_SOUP);

		// Block
		Registry.register(Registry.BLOCK, new Identifier("fure", "mossy_oak_log"), MOSSY_OAK_LOG);
		Registry.register(Registry.ITEM, new Identifier("fure", "mossy_oak_log"),
				new BlockItem(MOSSY_OAK_LOG, new FabricItemSettings().group(ItemGroup.MISC)));

		Registry.register(Registry.BLOCK, new Identifier("fure", "mossy_oak_planks"), MOSSY_OAK_PLANKS);
		Registry.register(Registry.ITEM, new Identifier("fure", "mossy_oak_planks"),
				new BlockItem(MOSSY_OAK_PLANKS, new FabricItemSettings().group(ItemGroup.MISC)));
	}
}
