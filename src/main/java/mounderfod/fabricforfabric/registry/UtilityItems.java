package mounderfod.fabricforfabric.registry;

import me.shedaniel.autoconfig.AutoConfig;
import mounderfod.fabricforfabric.FabricForFabric;
import mounderfod.fabricforfabric.api.config.F4FConfig;
import mounderfod.fabricforfabric.api.item.ItemWithTooltip;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static mounderfod.fabricforfabric.FabricForFabric.F4F;

public class UtilityItems {

    static F4FConfig config = AutoConfig.getConfigHolder(F4FConfig.class).getConfig();
    // Bandage
    public static final Item BANDAGE = new ItemWithTooltip(new Item.Settings().group(F4F).maxCount(16).food(new FoodComponent.Builder().alwaysEdible().hunger(0).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*config.bandageDuration), 1.0f).build()), new TranslatableText[]{new TranslatableText("item.fabricforfabric.bandage.tooltip")});

    public static void register() {
        // Bandage
        if (config.utilityItems) {
            Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "bandage"), BANDAGE);
        }
    }
}
