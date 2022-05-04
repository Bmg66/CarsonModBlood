package net.carson.mccourse.util;

import net.carson.mccourse.MCCourseMod;
import net.carson.mccourse.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();

    }
    private  static  void  registerFuels() {
        System.out.println("REG FUELS"+ MCCourseMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModItems.BLOODY_COAL, 400);
    }
}

