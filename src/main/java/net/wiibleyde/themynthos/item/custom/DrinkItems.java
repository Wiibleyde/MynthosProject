package net.wiibleyde.themynthos.item.custom;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

public class DrinkItems extends Item {
    private static final Logger LOGGER = LogUtils.getLogger();

    public DrinkItems(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull ItemUseAnimation getUseAnimation(@NotNull ItemStack pStack) {
        LOGGER.info("Using drink item");
        return ItemUseAnimation.DRINK;
    }
}
