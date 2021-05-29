package mounderfod.fabricforfabric;

import mounderfod.fabricforfabric.registry.GrippedTools;
import mounderfod.fabricforfabric.registry.Machines;
import mounderfod.fabricforfabric.registry.MaterialItems;
import mounderfod.fabricforfabric.registry.UtilityItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.lwjgl.system.CallbackI;

public class FabricForFabric implements ModInitializer {

    // Creative Inventory Tabs
    public static final ItemGroup FABRIC_MATERIALS = FabricItemGroupBuilder.build(
            new Identifier("fabricforfabric", "materials"), () -> new ItemStack(MaterialItems.WHITE_FABRIC));

    public static final ItemGroup FABRIC_TOOLS = FabricItemGroupBuilder.build(
            new Identifier("fabricforfabric", "tools"), () -> new ItemStack(UtilityItems.DIAMOND_REPAIR_KIT));

    public static final ItemGroup FABRIC_MACHINES = FabricItemGroupBuilder.build(
            new Identifier("fabricforfabric", "machines"), () -> new ItemStack(Machines.PHASER_BLOCK));

    @Override
    public void onInitialize() {
        // Register Items
        GrippedTools.register();
        MaterialItems.register();
        UtilityItems.register();
        Machines.register();
    }

}