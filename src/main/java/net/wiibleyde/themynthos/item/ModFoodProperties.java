package net.wiibleyde.themynthos.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties MYNTHOS_PARADISE = new FoodProperties.Builder().alwaysEdible().nutrition(3)
            .saturationModifier(0.3F).build();
}
