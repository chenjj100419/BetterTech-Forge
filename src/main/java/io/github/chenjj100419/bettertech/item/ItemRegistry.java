package io.github.chenjj100419.bettertech.item;

import io.github.chenjj100419.bettertech.BetterTech;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterTech.MOD_ID);
    public static final RegistryObject<Item> null_Item = ITEMS.register("null", nullItem::new);
    public static final RegistryObject<Item> icon_Item = ITEMS.register("icon", ItemgroupIcon::new);
}
