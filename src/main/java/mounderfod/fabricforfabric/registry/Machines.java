package mounderfod.fabricforfabric.registry;

import mounderfod.fabricforfabric.FabricForFabric;
import mounderfod.fabricforfabric.block.BreakerBlock;
import mounderfod.fabricforfabric.block.PhaserBlock;
import mounderfod.fabricforfabric.block.item.BlockItemWithTooltip;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Machines {

    public static Block BREAKER_BLOCK;
    public static Block PHASER_BLOCK;
    public static final BooleanProperty PASSTHROUGH = BooleanProperty.of("passthrough");

    public static void register() {
        BREAKER_BLOCK = Registry.register(Registry.BLOCK, new Identifier("fabricforfabric", "breaker"), new BreakerBlock());
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "breaker"), new BlockItemWithTooltip(BREAKER_BLOCK, new Item.Settings().group(FabricForFabric.FABRIC_MACHINES), new TranslatableText[] {new TranslatableText("block.fabricforfabric.breaker.tooltip1"), new TranslatableText("block.fabricforfabric.breaker.tooltip2")}));
        PHASER_BLOCK = Registry.register(Registry.BLOCK, new Identifier("fabricforfabric", "phaser"), new PhaserBlock());
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "phaser"), new BlockItemWithTooltip(PHASER_BLOCK, new Item.Settings().group(FabricForFabric.FABRIC_MACHINES), new TranslatableText[] {new TranslatableText("block.fabricforfabric.phaser.tooltip")}));
    }
}
