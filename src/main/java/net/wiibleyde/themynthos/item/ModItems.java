package net.wiibleyde.themynthos.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Consumables;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wiibleyde.themynthos.TheMynthos;
import net.wiibleyde.themynthos.item.custom.MynthosJuiceItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, TheMynthos.MOD_ID);


    public static final RegistryObject<Item> MYNTHOS_CHEESE = ITEMS.register("mynthos_cheese",
        () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse(TheMynthos.MOD_ID + ":mynthos_cheese")))));

    public static final RegistryObject<Item> EMPTY_GLASS = ITEMS.register("empty_glass",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse(TheMynthos.MOD_ID + ":empty_glass")))));

    public static final RegistryObject<Item> MYNTHOS_PARADISE = ITEMS.register("mynthos_paradise",
            () -> new MynthosJuiceItem(new Item.Properties().food(ModFoodProperties.MYNTHOS_PARADISE, Consumables.DEFAULT_DRINK).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse(TheMynthos.MOD_ID + ":mynthos_paradise")))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
