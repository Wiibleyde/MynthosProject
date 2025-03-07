package net.wiibleyde.themynthos.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.wiibleyde.themynthos.item.ModItems;
import org.jetbrains.annotations.NotNull;

public class MynthosMilkItem extends Item {

    public MynthosMilkItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack pStack, @NotNull Level pLevel, @NotNull LivingEntity pLivingEntity) {
        if (!pLevel.isClientSide) {
            for (MobEffectInstance effect : pLivingEntity.getActiveEffects()) {
                pLivingEntity.removeEffect(effect.getEffect());
            }
        }

        ItemStack emptyBottle = new ItemStack(ModItems.EMPTY_BOTTLE.get());
        if (pLivingEntity instanceof Player player) {
            if (!player.getInventory().add(emptyBottle)) {
                player.drop(emptyBottle, false);
            }
        }
        return super.finishUsingItem(pStack, pLevel, pLivingEntity);
    }

}
