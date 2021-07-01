package mounderfod.fabricforfabric.tool;

import mounderfod.fabricforfabric.FabricForFabric;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem {

    public PickaxeBase(ToolMaterial material) {
        super(material, 2, -2.8f, new Settings().group(FabricForFabric.F4F));
    }

}
    
