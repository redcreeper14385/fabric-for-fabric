package mounderfod.fabricforfabric.registry;

import mounderfod.fabricforfabric.FabricForFabric;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class UtilityItems {
    // Repair Kits
    public static final Item IRON_REPAIR_KIT = new Item(new Item.Settings().group(FabricForFabric.FABRIC_TOOLS).maxCount(1).rarity(Rarity.UNCOMMON));
    public static final Item GOLD_REPAIR_KIT = new Item(new Item.Settings().group(FabricForFabric.FABRIC_TOOLS).maxCount(1).rarity(Rarity.UNCOMMON));
    public static final Item DIAMOND_REPAIR_KIT = new Item(new Item.Settings().group(FabricForFabric.FABRIC_TOOLS).maxCount(1).rarity(Rarity.UNCOMMON));
    // Bandage
    public static final Item BANDAGE = new Item(new Item.Settings().group(FabricForFabric.FABRIC_TOOLS).maxCount(16).food(new FoodComponent.Builder().alwaysEdible().hunger(0).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*3), 1.0f).build()));


    public static void RegisterItems() {
        // Repair Kits
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "iron_repair_kit"), IRON_REPAIR_KIT);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "gold_repair_kit"), GOLD_REPAIR_KIT);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "diamond_repair_kit"), DIAMOND_REPAIR_KIT);
        // Bandage
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "bandage"), BANDAGE);
    }
}
