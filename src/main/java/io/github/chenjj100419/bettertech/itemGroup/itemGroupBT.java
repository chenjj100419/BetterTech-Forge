package io.github.chenjj100419.bettertech.itemGroup;

import io.github.chenjj100419.bettertech.item.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class itemGroupBT extends ItemGroup {
    public itemGroupBT(){
        super("bttertech_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.null_Item.get());
    }
}
