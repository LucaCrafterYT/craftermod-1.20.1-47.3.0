
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.lucacrafter.craftermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.lucacrafter.craftermod.block.DeepslateCraftaniumOreBlock;
import net.lucacrafter.craftermod.block.CraftaniumOreBlock;
import net.lucacrafter.craftermod.block.BlockOfCraftaniumBlock;
import net.lucacrafter.craftermod.CraftermodMod;

public class CraftermodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CraftermodMod.MODID);
	public static final RegistryObject<Block> CRAFTANIUM_ORE = REGISTRY.register("craftanium_ore", () -> new CraftaniumOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_CRAFTANIUM_ORE = REGISTRY.register("deepslate_craftanium_ore", () -> new DeepslateCraftaniumOreBlock());
	public static final RegistryObject<Block> BLOCK_OF_CRAFTANIUM = REGISTRY.register("block_of_craftanium", () -> new BlockOfCraftaniumBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
