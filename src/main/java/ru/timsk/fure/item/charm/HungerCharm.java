package ru.timsk.fure.item.charm;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;

public class HungerCharm extends TrinketItem {
    private static int rottenFleshEatenCount = 0;
    public HungerCharm() {
        super(new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1).rarity(Rarity.RARE));
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            if (player.getStatusEffect(StatusEffects.HUNGER) == null)
            {
                StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.HUNGER, 100500);
                player.setStatusEffect(effect, player);
            }

            if (rottenFleshEatenCount >= 64 * 2) {
                if (player.getHungerManager().getFoodLevel() < 17) {
                    player.getHungerManager().setFoodLevel(17);
                }
            }
            else {
                if (player.getHungerManager().getFoodLevel() < 7) {
                    player.getHungerManager().setFoodLevel(7);
                }
            }
        }
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            player.getHungerManager().setFoodLevel(0);
        }
    }

    public static void incrementRottenFleshEatenCount() {
        rottenFleshEatenCount++;
    }
}
