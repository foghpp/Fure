package ru.timsk.fure.item.food;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FishSoup extends Item {
    public FishSoup() {
        super(new FabricItemSettings().food(FoodComponents.MUSHROOM_STEW).group(ItemGroup.FOOD).maxCount(1));
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user)
    {
        super.finishUsing(stack, world, user);

        return Items.BOWL.getDefaultStack();
    }
}
