package ru.timsk.fure.item.charm;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import java.util.UUID;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class HungerCharm extends TrinketItem {
    public HungerCharm() {
        super(new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1));
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getModifiers(stack, slot, entity, uuid);

        // Implementation goes here.

        return modifiers;
    }
}
