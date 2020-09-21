package mounderfod.fabricforfabric;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem {

    public PickaxeBase(ToolMaterial material) {
        super(material, 2, -2.8f, new Settings().group(FabricForFabric.FABRIC_TOOLS));
    }

}
    
