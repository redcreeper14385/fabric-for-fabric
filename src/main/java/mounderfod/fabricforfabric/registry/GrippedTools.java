package mounderfod.fabricforfabric.registry;

import me.shedaniel.autoconfig.AutoConfig;
import mounderfod.fabricforfabric.api.config.F4FConfig;
import mounderfod.fabricforfabric.api.item.ItemWithTooltip;
import mounderfod.fabricforfabric.tool.AxeBase;
import mounderfod.fabricforfabric.FabricForFabric;
import mounderfod.fabricforfabric.tool.PickaxeBase;
import mounderfod.fabricforfabric.tool.ToolMaterialGrippedDiamond;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static mounderfod.fabricforfabric.FabricForFabric.F4F;

public class GrippedTools {
    public static final SwordItem GRIPPED_DIAMOND_SWORD = new SwordItem(new ToolMaterialGrippedDiamond(), 4, -2.4f, new Item.Settings().group(FabricForFabric.F4F));
    public static final ShovelItem GRIPPED_DIAMOND_SHOVEL = new ShovelItem(new ToolMaterialGrippedDiamond(), 2, -2.8f, new Item.Settings().group(FabricForFabric.F4F));
    public static final PickaxeBase GRIPPED_DIAMOND_PICKAXE = new PickaxeBase(new ToolMaterialGrippedDiamond());
    public static final AxeBase GRIPPED_DIAMOND_AXE = new AxeBase(new ToolMaterialGrippedDiamond());
    public static final Item GRIP = new ItemWithTooltip(new Item.Settings().group(F4F).maxCount(1), new TranslatableText[]{new TranslatableText("item.fabricforfabric.grip.tooltip")});
    static F4FConfig config = AutoConfig.getConfigHolder(F4FConfig.class).getConfig();

    public static void register() {
        if (config.grippedTools) {
            Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "gripped_diamond_sword"), GRIPPED_DIAMOND_SWORD);
            Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "gripped_diamond_shovel"), GRIPPED_DIAMOND_SHOVEL);
            Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "gripped_diamond_pickaxe"), GRIPPED_DIAMOND_PICKAXE);
            Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "gripped_diamond_axe"), GRIPPED_DIAMOND_AXE);
            Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "grip"), GRIP);
        }
    }
}
