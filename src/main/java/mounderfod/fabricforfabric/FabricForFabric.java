package mounderfod.fabricforfabric;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class FabricForFabric implements ModInitializer {

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
    public static final Item IRON_REPAIR_KIT = new Item(new Item.Settings().group(ItemGroup.TOOLS).maxCount(1).rarity(Rarity.UNCOMMON));
    public static final Item GOLD_REPAIR_KIT = new Item(new Item.Settings().group(ItemGroup.TOOLS).maxCount(1).rarity(Rarity.UNCOMMON));
    public static final Item DIAMOND_REPAIR_KIT = new Item(new Item.Settings().group(ItemGroup.TOOLS).maxCount(1).rarity(Rarity.UNCOMMON));
    public static final Item BANDAGE = new Item(new Item.Settings().group(ItemGroup.TOOLS).maxCount(16).food(new FoodComponent.Builder().alwaysEdible().hunger(0).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*3), 1.0f).build()));

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
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "iron_repair_kit"), IRON_REPAIR_KIT);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "gold_repair_kit"), GOLD_REPAIR_KIT);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "diamond_repair_kit"), DIAMOND_REPAIR_KIT);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "bandage"), BANDAGE);
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "gripped_diamond_pickaxe"), new PickaxeBase(new ToolMaterialGrippedDiamond()));
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "gripped_diamond_shovel"), new ShovelItem(new ToolMaterialGrippedDiamond(),
        -1, -2.8f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "gripped_diamond_sword"), new ShovelItem(new ToolMaterialGrippedDiamond(),
        4, -2.4f, new Item.Settings().group(ItemGroup.TOOLS)));



    }

}