package net.wiibleyde.themynthos.item.custom;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import org.slf4j.Logger;

public class DrinkItems extends Item {
    private static final Logger LOGGER = LogUtils.getLogger();

    public DrinkItems(Properties properties) {
        super(properties);
    }


    @Override
    public ItemUseAnimation getUseAnimation(ItemStack pStack) {
        LOGGER.info("DrinkItems.getUseAnimation");
        LOGGER.debug(pStack.toString());
        ItemUseAnimation animation = ItemUseAnimation.DRINK;
        LOGGER.info("Returning animation: " + animation);
        return animation;
    }

}
