package mounderfod.fabricforfabric.registry;

import mounderfod.fabricforfabric.api.item.ItemWithTooltip;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static mounderfod.fabricforfabric.FabricForFabric.FABRIC_TOOLS;

public class UtilityItems {
    // Bandage
    public static final Item BANDAGE = new ItemWithTooltip(new Item.Settings().group(FABRIC_TOOLS).maxCount(16).food(new FoodComponent.Builder().alwaysEdible().hunger(0).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*5), 1.0f).build()), new TranslatableText[]{new TranslatableText("item.fabricforfabric.bandage.tooltip")});
    public static final Item GRIP = new ItemWithTooltip(new Item.Settings().group(FABRIC_TOOLS).maxCount(1), new TranslatableText[]{new TranslatableText("item.fabricforfabric.grip.tooltip")});

    public static void register() {
        // Bandage
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "bandage"), BANDAGE);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "grip"), GRIP);
    }
}
