package mounderfod.fabricforfabric;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import mounderfod.fabricforfabric.api.config.F4FConfig;
import mounderfod.fabricforfabric.registry.GrippedTools;
import mounderfod.fabricforfabric.registry.Machines;
import mounderfod.fabricforfabric.registry.MaterialItems;
import mounderfod.fabricforfabric.registry.UtilityItems;
import mounderfod.fabricforfabric.registry.data.GrippedToolsData;
import mounderfod.fabricforfabric.registry.data.MachinesData;
import mounderfod.fabricforfabric.registry.data.UtilityItemsData;
import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class FabricForFabric implements ModInitializer {

    public static final RuntimeResourcePack DATA = RuntimeResourcePack.create("fabricforfabric:data");

    // Creative Inventory Tab
    public static final ItemGroup F4F = FabricItemGroupBuilder.build(
            new Identifier("fabricforfabric", "main"), () -> new ItemStack(MaterialItems.WHITE_FABRIC));

    @Override
    public void onInitialize() {
        AutoConfig.register(F4FConfig.class, Toml4jConfigSerializer::new);
        // Register Items
        MaterialItems.register();
        GrippedTools.register();
        Machines.register();
        UtilityItems.register();
        GrippedToolsData.register();
        MachinesData.register();
        UtilityItemsData.register();
        RRPCallback.BEFORE_VANILLA.register(a -> a.add(DATA));
    }

}