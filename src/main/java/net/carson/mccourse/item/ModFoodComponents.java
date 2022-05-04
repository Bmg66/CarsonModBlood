package net.carson.mccourse.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static FoodComponent BLOOD = new FoodComponent.Builder().hunger(1).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 100), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 100),1f).build();
}
