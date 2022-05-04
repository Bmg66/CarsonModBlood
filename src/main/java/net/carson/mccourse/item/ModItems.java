package net.carson.mccourse.item;

import net.carson.mccourse.MCCourseMod;
import net.carson.mccourse.item.custom.DowsingRodItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BLOOD_INGOT = registerItem("blood_ingot",
    new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item RAW_BLOOD_ORE = registerItem("raw_blood_ore",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroups.COURSE).maxDamage(32)));

    public static final Item BLOOD = registerItem("blood",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE).food(ModFoodComponents.BLOOD)));

    public static final Item BLOODY_COAL = registerItem("bloody_coal",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    private static Item registerItem(String name, Item item) {
    return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item );

    }

    public static void registerModItems() {
System.out.println("Registering Mod Items for" + MCCourseMod.MOD_ID);

    }
}
