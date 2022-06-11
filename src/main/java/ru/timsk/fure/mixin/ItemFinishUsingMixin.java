package ru.timsk.fure.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.timsk.fure.item.charm.HungerCharm;

@Mixin(Item.class)
public class ItemFinishUsingMixin {
    @Inject(method = "finishUsing", at = @At("HEAD"))
    private void finishUsing(ItemStack stack, World world, LivingEntity user, CallbackInfoReturnable<ItemStack> cir) {
        if (((Item)(Object)this).equals(Items.ROTTEN_FLESH)) {
            HungerCharm.incrementRottenFleshEatenCount();
        }
    }
}
