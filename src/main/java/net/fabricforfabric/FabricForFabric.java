package net.fabricforfabric;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FabricForFabric implements ModInitializer{

    public static final Item BLACK_FABRIC = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item BLUE_FABRIC = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item BROWN_FABRIC = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item CYAN_FABRIC = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item GRAY_FABRIC = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item GREEN_FABRIC = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item LIGHT_BLUE_FABRIC = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item LIME_FABRIC = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item MAGENTA_FABRIC = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item ORANGE_FABRIC = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item PINK_FABRIC = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item PURPLE_FABRIC = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item RED_FABRIC = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item LIGHT_GRAY_FABRIC = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item WHITE_FABRIC = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item YELLOW_FABRIC = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item FAUX_LEATHER = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "black_fabric"), BLACK_FABRIC);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "blue_fabric"), BLUE_FABRIC);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "brown_fabric"), BROWN_FABRIC);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "cyan_fabric"), CYAN_FABRIC);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "gray_fabric"), GRAY_FABRIC);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "green_fabric"), GREEN_FABRIC);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "light_blue_fabric"), LIGHT_BLUE_FABRIC);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "lime_fabric"), LIME_FABRIC);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "magenta_fabric"), MAGENTA_FABRIC);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "orange_fabric"), ORANGE_FABRIC);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "pink_fabric"), PINK_FABRIC);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "purple_fabric"), PURPLE_FABRIC);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "red_fabric"), RED_FABRIC);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "light_gray_fabric"), LIGHT_GRAY_FABRIC);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "white_fabric"), WHITE_FABRIC);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "yellow_fabric"), YELLOW_FABRIC);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "faux_leather"), FAUX_LEATHER);


    }
    
}
