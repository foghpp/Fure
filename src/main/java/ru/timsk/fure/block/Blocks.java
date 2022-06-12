package ru.timsk.fure.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {
    // Wood.
    public static final Block MOSSY_OAK_LOG = new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f));
    public static final Block MOSSY_OAK_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).strength(1.0f));

    public static void register() {
        // Wood.
        Registry.register(Registry.BLOCK, new Identifier("fure", "mossy_oak_log"), MOSSY_OAK_LOG);
        Registry.register(Registry.BLOCK, new Identifier("fure", "mossy_oak_planks"), MOSSY_OAK_PLANKS);
    }
}
