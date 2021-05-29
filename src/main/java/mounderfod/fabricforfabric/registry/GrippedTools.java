package mounderfod.fabricforfabric.registry;

import mounderfod.fabricforfabric.AxeBase;
import mounderfod.fabricforfabric.FabricForFabric;
import mounderfod.fabricforfabric.PickaxeBase;
import mounderfod.fabricforfabric.ToolMaterialGrippedDiamond;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GrippedTools {
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "gripped_diamond_sword"), new SwordItem(new ToolMaterialGrippedDiamond(),
                4, -2.4f, new Item.Settings().group(FabricForFabric.FABRIC_TOOLS)));
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "gripped_diamond_shovel"), new ShovelItem(new ToolMaterialGrippedDiamond(),
                2, -2.8f, new Item.Settings().group(FabricForFabric.FABRIC_TOOLS)));
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "gripped_diamond_pickaxe"), new PickaxeBase(new ToolMaterialGrippedDiamond()));
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "gripped_diamond_axe"), new AxeBase(new ToolMaterialGrippedDiamond()));
    }
}
