package mounderfod.fabricforfabric.registry;

import me.shedaniel.autoconfig.AutoConfig;
import mounderfod.fabricforfabric.FabricForFabric;
import mounderfod.fabricforfabric.api.config.F4FConfig;
import mounderfod.fabricforfabric.block.BreakerBlock;
import mounderfod.fabricforfabric.block.PhaserBlock;
import mounderfod.fabricforfabric.api.block.item.BlockItemWithTooltip;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Machines {

    public static Block BREAKER_BLOCK;
    public static Block PHASER_BLOCK;
    public static final BooleanProperty PASSTHROUGH = BooleanProperty.of("passthrough");
    static F4FConfig config = AutoConfig.getConfigHolder(F4FConfig.class).getConfig();

    public static void register() {
        if (config.machines) {
            BREAKER_BLOCK = Registry.register(Registry.BLOCK, new Identifier("fabricforfabric", "breaker"), new BreakerBlock());
            Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "breaker"), new BlockItemWithTooltip(BREAKER_BLOCK, new Item.Settings().group(FabricForFabric.F4F), new TranslatableText[]{new TranslatableText("block.fabricforfabric.breaker.tooltip1"), new TranslatableText("block.fabricforfabric.breaker.tooltip2")}));
            PHASER_BLOCK = Registry.register(Registry.BLOCK, new Identifier("fabricforfabric", "phaser"), new PhaserBlock());
            Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "phaser"), new BlockItemWithTooltip(PHASER_BLOCK, new Item.Settings().group(FabricForFabric.F4F), new TranslatableText[]{new TranslatableText("block.fabricforfabric.phaser.tooltip")}));
        }
    }

}
