package mounderfod.fabricforfabric.registry.data;

import me.shedaniel.autoconfig.AutoConfig;
import mounderfod.fabricforfabric.FabricForFabric;
import mounderfod.fabricforfabric.api.config.F4FConfig;
import mounderfod.fabricforfabric.registry.UtilityItems;
import net.devtech.arrp.json.recipe.*;
import net.minecraft.item.Items;

import static net.devtech.arrp.api.RuntimeResourcePack.id;

public class UtilityItemsData {
    public static void register() {
        F4FConfig config = AutoConfig.getConfigHolder(F4FConfig.class).getConfig();
        if (config.utilityItems) {
            FabricForFabric.DATA.addRecipe(id("gripped_diamond_axe"), JRecipe.shaped(
                    JPattern.pattern(" # ", "#B#", " # "),
                    JKeys.keys()
                            .key("#", JIngredient.ingredient().tag("fabricforfabric:fabrics"))
                            .key("B", JIngredient.ingredient().item(Items.BREAD)),
                    JResult.item(UtilityItems.BANDAGE)
            ));
        }
    }
}
