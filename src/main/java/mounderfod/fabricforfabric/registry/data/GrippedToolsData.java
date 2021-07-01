package mounderfod.fabricforfabric.registry.data;

import me.shedaniel.autoconfig.AutoConfig;
import mounderfod.fabricforfabric.FabricForFabric;
import mounderfod.fabricforfabric.api.config.F4FConfig;
import mounderfod.fabricforfabric.registry.GrippedTools;
import net.devtech.arrp.json.recipe.JIngredient;
import net.devtech.arrp.json.recipe.JIngredients;
import net.devtech.arrp.json.recipe.JRecipe;
import net.devtech.arrp.json.recipe.JResult;
import net.minecraft.item.Items;

import static net.devtech.arrp.api.RuntimeResourcePack.id;

public class GrippedToolsData {
    public static void register() {
        F4FConfig config = AutoConfig.getConfigHolder(F4FConfig.class).getConfig();
        if (config.grippedTools) {
            FabricForFabric.DATA.addRecipe(id("gripped_diamond_sword"), JRecipe.smithing(
                    JIngredient.ingredient().item(Items.DIAMOND_SWORD), JIngredient.ingredient().item(GrippedTools.GRIP), JResult.item(GrippedTools.GRIPPED_DIAMOND_SWORD)
            ));
            FabricForFabric.DATA.addRecipe(id("gripped_diamond_shovel"), JRecipe.smithing(
                    JIngredient.ingredient().item(Items.DIAMOND_SHOVEL), JIngredient.ingredient().item(GrippedTools.GRIP), JResult.item(GrippedTools.GRIPPED_DIAMOND_SHOVEL)
            ));
            FabricForFabric.DATA.addRecipe(id("gripped_diamond_pickaxe"), JRecipe.smithing(
                    JIngredient.ingredient().item(Items.DIAMOND_PICKAXE), JIngredient.ingredient().item(GrippedTools.GRIP), JResult.item(GrippedTools.GRIPPED_DIAMOND_PICKAXE)
            ));
            FabricForFabric.DATA.addRecipe(id("gripped_diamond_axe"), JRecipe.smithing(
                    JIngredient.ingredient().item(Items.DIAMOND_AXE), JIngredient.ingredient().item(GrippedTools.GRIP), JResult.item(GrippedTools.GRIPPED_DIAMOND_AXE)
            ));
            FabricForFabric.DATA.addRecipe(id("netherite_sword"), JRecipe.smithing(
                    JIngredient.ingredient().item(GrippedTools.GRIPPED_DIAMOND_SWORD), JIngredient.ingredient().item(Items.NETHERITE_INGOT), JResult.item(Items.NETHERITE_SWORD)
            ));
            FabricForFabric.DATA.addRecipe(id("netherite_shovel"), JRecipe.smithing(
                    JIngredient.ingredient().item(GrippedTools.GRIPPED_DIAMOND_SHOVEL), JIngredient.ingredient().item(Items.NETHERITE_INGOT), JResult.item(Items.NETHERITE_SHOVEL)
            ));
            FabricForFabric.DATA.addRecipe(id("netherite_pickaxe"), JRecipe.smithing(
                    JIngredient.ingredient().item(GrippedTools.GRIPPED_DIAMOND_PICKAXE), JIngredient.ingredient().item(Items.NETHERITE_INGOT), JResult.item(Items.NETHERITE_PICKAXE)
            ));
            FabricForFabric.DATA.addRecipe(id("netherite_axe"), JRecipe.smithing(
                    JIngredient.ingredient().item(GrippedTools.GRIPPED_DIAMOND_AXE), JIngredient.ingredient().item(Items.NETHERITE_INGOT), JResult.item(Items.NETHERITE_AXE)
            ));
            FabricForFabric.DATA.addRecipe(id("grip"), JRecipe.shapeless(
                    JIngredients.ingredients()
                            .add(JIngredient.ingredient().tag("fabricforfabric:fabrics"))
                            .add(JIngredient.ingredient().item(Items.DIAMOND)),
                    JResult.item(GrippedTools.GRIP)
            ));
        }
    }
}
