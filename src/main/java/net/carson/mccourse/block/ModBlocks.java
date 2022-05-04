package net.carson.mccourse.block;
import net.carson.mccourse.MCCourseMod;
import net.carson.mccourse.block.custom.SpeedyBlock;
import net.carson.mccourse.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {



    public static final  Block BLOOD_BLOCK = registerBlock("blood_block",
    new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroups.COURSE);

    public static final  Block BLOOD_ORE = registerBlock("blood_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.COURSE);


    public static final  Block DEEPSLATE_BLOOD_ORE = registerBlock("deepslate_blood_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.COURSE);

    public static final  Block RAW_BLOOD_ORE = registerBlock("raw_blood_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.COURSE);

    public static final  Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.COURSE);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
    }


   private static Item registerBlockItem(String name, Block block, ItemGroup group) {
   return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name),
        new BlockItem(block, new FabricItemSettings().group(group)));

}
    public static void registerModBlocks() {

        System.out.println("MOD BLOCK"+ MCCourseMod.MOD_ID);
    }
}
