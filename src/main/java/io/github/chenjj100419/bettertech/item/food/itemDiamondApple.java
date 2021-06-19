package io.github.chenjj100419.bettertech.item.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import io.github.chenjj100419.bettertech.itemGroup.modGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class itemDiamondApple extends Item{
    private static final Food food = (new Food.Builder())
            .saturationMod(40)
            .effect(() -> new EffectInstance(Effects.ABSORPTION, 30 * (60 * 20), 10), 1)
            .effect(() -> new EffectInstance(Effects.LUCK, 30 * (60 * 20), 10), 1)
            .effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 30 * (60 * 20), 10), 1)
            .effect(() -> new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 30 * (60 * 20), 10), 1)
            .effect(() -> new EffectInstance(Effects.HEALTH_BOOST, 30 * (60 * 20), 2), 1)
            .effect(() -> new EffectInstance(Effects.REGENERATION, 30 * (60 * 20), 2), 1)
            .build();

    public itemDiamondApple() {
        super(new Item.Properties().food(food).tab(modGroup.mainGroup));
    }
}
