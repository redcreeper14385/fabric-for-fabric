package mounderfod.fabricforfabric;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem {

    protected PickaxeBase(ToolMaterial material) {
        super(material, -1, -2.8f, new Settings().group(ItemGroup.TOOLS));
    }

}
    
