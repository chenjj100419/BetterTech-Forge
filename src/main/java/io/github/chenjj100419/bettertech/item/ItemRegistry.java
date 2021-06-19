package io.github.chenjj100419.bettertech.item;

import io.github.chenjj100419.bettertech.BetterTech;
import io.github.chenjj100419.bettertech.block.BlockRegistry;
import io.github.chenjj100419.bettertech.item.food.itemAirApple;
import io.github.chenjj100419.bettertech.item.food.itemDiamondApple;
import io.github.chenjj100419.bettertech.item.normal.itemMesh;
import io.github.chenjj100419.bettertech.itemGroup.modGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterTech.MOD_ID);
    public static final RegistryObject<Item> null_Item = ITEMS.register("null", nullItem::new);
    public static final RegistryObject<Item> icon_Item = ITEMS.register("icon", ItemgroupIcon::new);
    public static final RegistryObject<Item> air_apple_Item = ITEMS.register("air_apple", itemAirApple::new);
    public static final RegistryObject<Item> diamond_apple_Item = ITEMS.register("diamond_apple", itemDiamondApple::new);
    public static final RegistryObject<Item> diamond_netherite_Block = ITEMS.register("diamond_netherite_block", () -> new BlockItem(BlockRegistry.diamond_netherite_block.get(), new Item.Properties().tab(modGroup.mainGroup)));
    public static final RegistryObject<Item> mesh_Item = ITEMS.register("mesh", itemMesh::new);

}
