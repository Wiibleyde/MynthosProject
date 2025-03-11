package net.wiibleyde.themynthos.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wiibleyde.themynthos.TheMynthos;
import net.wiibleyde.themynthos.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheMynthos.MOD_ID);

    public static final RegistryObject<CreativeModeTab> THE_MYNTHOS_MOD_TAB = CREATIVE_MODE_TABS.register("the_mynthos_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MYNTHOS_PARADISE.get()))
                    .title(Component.translatable("creativetab.themynthosmodtab.the_mynthos_mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MYNTHOS_PARADISE.get());
                        output.accept(ModItems.MYNTHOS_CHEESE.get());
                        output.accept(ModItems.EMPTY_GLASS.get());
                        output.accept(ModItems.EMPTY_BOTTLE.get());
                        output.accept(ModItems.MYNTHOS_JUICE_BOTTLE.get());
                        output.accept(ModItems.MYNTHOS_MILK_BOTTLE.get());
                        output.accept(ModItems.MYNTHOS_PUMP.get());
                        output.accept(ModBlocks.PALM_TREE_LOG.get());
                        output.accept(ModBlocks.PALM_TREE_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_PALM_TREE_LOG.get());
                        output.accept(ModBlocks.STRIPPED_PALM_TREE_WOOD.get());
                        output.accept(ModBlocks.PALM_TREE_PLANKS.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}