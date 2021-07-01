package mounderfod.fabricforfabric.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static mounderfod.fabricforfabric.FabricForFabric.FABRIC_TOOLS;

public class UtilityItems {
    // Bandage
    public static final Item BANDAGE = new Item(new Item.Settings().group(FABRIC_TOOLS).maxCount(16).food(new FoodComponent.Builder().alwaysEdible().hunger(0).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*5), 1.0f).build()));

    public static void register() {
        // Bandage
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "bandage"), BANDAGE);
    }
}
