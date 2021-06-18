package io.github.chenjj100419.bettertech.item.base;

import io.github.chenjj100419.bettertech.itemGroup.modGroup;
import net.minecraft.item.Item;

public class itemBase extends Item {
    public itemBase() {
        super(new Properties().tab(modGroup.mainGroup));
    }
}
