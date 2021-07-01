package mounderfod.fabricforfabric.tool;

import mounderfod.fabricforfabric.FabricForFabric;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem {

    public AxeBase(ToolMaterial material) {
        super(material, 6f, -.0f, new Settings().group(FabricForFabric.F4F));
    }

}
    
