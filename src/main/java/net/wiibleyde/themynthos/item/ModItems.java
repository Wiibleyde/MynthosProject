package net.wiibleyde.themynthos.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wiibleyde.themynthos.TheMynthos;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, TheMynthos.MOD_ID);

    public static final RegistryObject<Item> MYNTHOSJUICE = ITEMS.register("mynthosjuice",
        () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse(TheMynthos.MOD_ID + ":mynthosjuice")))));

    public static final RegistryObject<Item> MYNTHOSCHEESE = ITEMS.register("mynthoscheese",
        () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse(TheMynthos.MOD_ID + ":mynthoscheese")))));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
