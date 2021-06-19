package io.github.chenjj100419.bettertech.item.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import io.github.chenjj100419.bettertech.itemGroup.modGroup;

public class itemAirApple extends Item {
    private static final Food food = (new Food.Builder()).saturationMod(0).fast().build();

    public itemAirApple() {
        super(new Properties().food(food).tab(modGroup.mainGroup));
    }
}
