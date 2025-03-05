package net.wiibleyde.themynthos.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.wiibleyde.themynthos.item.ModItems;
import org.jetbrains.annotations.NotNull;

public class MynthosJuiceItem extends Item {

    public MynthosJuiceItem(Properties properties) {
        super(properties);
    }

    // Give the player a glass bottle when they drink the juice
    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack pStack, @NotNull Level pLevel, @NotNull LivingEntity pLivingEntity) {
        ItemStack emptyGlass = new ItemStack(ModItems.EMPTY_GLASS.get());
        if (pLivingEntity instanceof Player player) {
            if (!player.getInventory().add(emptyGlass)) {
                player.drop(emptyGlass, false);
            }
        }
        return super.finishUsingItem(pStack, pLevel, pLivingEntity);
    }
}
