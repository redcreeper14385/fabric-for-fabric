package mounderfod.fabricforfabric.registry.data;

import me.shedaniel.autoconfig.AutoConfig;
import mounderfod.fabricforfabric.FabricForFabric;
import mounderfod.fabricforfabric.api.config.F4FConfig;
import mounderfod.fabricforfabric.registry.Machines;
import net.devtech.arrp.json.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import static net.devtech.arrp.api.RuntimeResourcePack.id;

public class MachinesData {
    public static void register() {
        F4FConfig config = AutoConfig.getConfigHolder(F4FConfig.class).getConfig();
        if (config.machines) {
            FabricForFabric.DATA.addRecipe(id("gripped_diamond_axe"), JRecipe.shaped(
                    JPattern.pattern("###", "FDF", "HSH"),
                    JKeys.keys()
                        .key("#", JIngredient.ingredient().item(Items.SMOOTH_STONE))
                        .key("F", JIngredient.ingredient().tag("fabricforfabric:fabrics"))
                        .key("D", JIngredient.ingredient().item(Items.DISPENSER))
                        .key("H", JIngredient.ingredient().item(Items.REDSTONE))
                        .key("S", JIngredient.ingredient().item(Items.DIAMOND_PICKAXE)),
                    JResult.item(Item.fromBlock(Machines.BREAKER_BLOCK))
            ));
            FabricForFabric.DATA.addRecipe(id("gripped_diamond_axe"), JRecipe.shaped(
                    JPattern.pattern("###", "FEF", "rIr"),
                    JKeys.keys()
                            .key("#", JIngredient.ingredient().item(Items.SMOOTH_STONE))
                            .key("F", JIngredient.ingredient().tag("fabricforfabric:fabrics"))
                            .key("E", JIngredient.ingredient().item(Items.ENDER_PEARL))
                            .key("r", JIngredient.ingredient().item(Items.REDSTONE))
                            .key("I", JIngredient.ingredient().item(Items.IRON_DOOR)),
                    JResult.itemStack(Item.fromBlock(Machines.PHASER_BLOCK), 4)
            ));
        }
    }
}
