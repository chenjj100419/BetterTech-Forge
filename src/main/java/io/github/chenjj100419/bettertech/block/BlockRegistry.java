package io.github.chenjj100419.bettertech.block;

import io.github.chenjj100419.bettertech.BetterTech;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterTech.MOD_ID);
    public static final RegistryObject<Block> diamond_netherite_block = BLOCKS.register("diamond_netherite_block", blockDiamondNetherite::new);
}
