package io.github.chenjj100419.bettertech.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blockDiamondNetherite extends Block {
    public blockDiamondNetherite() {
        super(Properties.of(Material.STONE).harvestLevel(3));
    }
}
