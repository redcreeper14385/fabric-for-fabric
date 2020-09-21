package mounderfod.fabricforfabric;

import java.util.UUID;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import dev.emi.trinkets.api.SlotGroups;
import dev.emi.trinkets.api.Slots;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;

public class LuckRing extends TrinketItem {

    public LuckRing() {
        super(new Settings().maxCount(1).group(FabricForFabric.FABRIC_TOOLS));
    }

    @Override
    public boolean canWearInSlot(String group, String slot) {
        return group.equals(SlotGroups.HAND) && slot.equals(Slots.RING);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getTrinketModifiers(String group, String slot, UUID uuid, ItemStack stack) {
        Multimap<EntityAttribute, EntityAttributeModifier> map = HashMultimap.create();
        // Increase Luck attribute when worn
        map.put(EntityAttributes.GENERIC_LUCK, new EntityAttributeModifier(uuid, "Luck", 5f, EntityAttributeModifier.Operation.ADDITION));
        return map;

    }
}
    

