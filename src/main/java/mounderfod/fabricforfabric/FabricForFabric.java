package mounderfod.fabricforfabric;

import dev.emi.trinkets.api.SlotGroups;
import dev.emi.trinkets.api.Slots;
import dev.emi.trinkets.api.TrinketSlots;
import mounderfod.fabricforfabric.registry.GrippedTools;
import mounderfod.fabricforfabric.registry.MaterialItems;
import mounderfod.fabricforfabric.registry.TrinketItems;
import mounderfod.fabricforfabric.registry.UtilityItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class FabricForFabric implements ModInitializer {

    // Creative Inventory Tabs
    public static final ItemGroup FABRIC_MATERIALS = FabricItemGroupBuilder.build(
        new Identifier("fabricforfabric", "materials"), () -> new ItemStack(MaterialItems.WHITE_FABRIC));

    public static final ItemGroup FABRIC_TOOLS = FabricItemGroupBuilder.build(
        new Identifier("fabricforfabric", "tools"), () -> new ItemStack(UtilityItems.DIAMOND_REPAIR_KIT));

    @Override
    public void onInitialize() {
        // Register Trinket Slots
        TrinketSlots.addSlot(SlotGroups.HAND, Slots.GLOVES, new Identifier("trinkets", "textures/item/empty_trinket_slot_gloves.png"));
        TrinketSlots.addSlot(SlotGroups.HAND, Slots.RING, new Identifier("trinkets", "textures/item/empty_trinket_slot_ring.png"));
        // Register Items
        GrippedTools.RegisterItems();
        MaterialItems.RegisterItems();
        TrinketItems.RegisterItems();
        UtilityItems.RegisterItems();
    }

}