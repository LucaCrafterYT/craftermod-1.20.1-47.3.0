
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.lucacrafter.craftermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.lucacrafter.craftermod.item.RawCraftaniumItem;
import net.lucacrafter.craftermod.item.CraftaniumUpgradeSmithingTemplateItem;
import net.lucacrafter.craftermod.item.CraftaniumSwordItem;
import net.lucacrafter.craftermod.item.CraftaniumShovelItem;
import net.lucacrafter.craftermod.item.CraftaniumPickaxeItem;
import net.lucacrafter.craftermod.item.CraftaniumIngotItem;
import net.lucacrafter.craftermod.item.CraftaniumHoeItem;
import net.lucacrafter.craftermod.item.CraftaniumAxeItem;
import net.lucacrafter.craftermod.item.CraftaniumArmorItem;
import net.lucacrafter.craftermod.CraftermodMod;

public class CraftermodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CraftermodMod.MODID);
	public static final RegistryObject<Item> CRAFTANIUM_ORE = block(CraftermodModBlocks.CRAFTANIUM_ORE);
	public static final RegistryObject<Item> DEEPSLATE_CRAFTANIUM_ORE = block(CraftermodModBlocks.DEEPSLATE_CRAFTANIUM_ORE);
	public static final RegistryObject<Item> CRAFTANIUM_INGOT = REGISTRY.register("craftanium_ingot", () -> new CraftaniumIngotItem());
	public static final RegistryObject<Item> BLOCK_OF_CRAFTANIUM = block(CraftermodModBlocks.BLOCK_OF_CRAFTANIUM);
	public static final RegistryObject<Item> RAW_CRAFTANIUM = REGISTRY.register("raw_craftanium", () -> new RawCraftaniumItem());
	public static final RegistryObject<Item> CRAFTANIUM_ARMOR_HELMET = REGISTRY.register("craftanium_armor_helmet", () -> new CraftaniumArmorItem.Helmet());
	public static final RegistryObject<Item> CRAFTANIUM_ARMOR_CHESTPLATE = REGISTRY.register("craftanium_armor_chestplate", () -> new CraftaniumArmorItem.Chestplate());
	public static final RegistryObject<Item> CRAFTANIUM_ARMOR_LEGGINGS = REGISTRY.register("craftanium_armor_leggings", () -> new CraftaniumArmorItem.Leggings());
	public static final RegistryObject<Item> CRAFTANIUM_ARMOR_BOOTS = REGISTRY.register("craftanium_armor_boots", () -> new CraftaniumArmorItem.Boots());
	public static final RegistryObject<Item> CRAFTANIUM_SWORD = REGISTRY.register("craftanium_sword", () -> new CraftaniumSwordItem());
	public static final RegistryObject<Item> CRAFTANIUM_AXE = REGISTRY.register("craftanium_axe", () -> new CraftaniumAxeItem());
	public static final RegistryObject<Item> CRAFTANIUM_PICKAXE = REGISTRY.register("craftanium_pickaxe", () -> new CraftaniumPickaxeItem());
	public static final RegistryObject<Item> CRAFTANIUM_SHOVEL = REGISTRY.register("craftanium_shovel", () -> new CraftaniumShovelItem());
	public static final RegistryObject<Item> CRAFTANIUM_UPGRADE_SMITHING_TEMPLATE = REGISTRY.register("craftanium_upgrade_smithing_template", () -> new CraftaniumUpgradeSmithingTemplateItem());
	public static final RegistryObject<Item> CRAFTANIUM_HOE = REGISTRY.register("craftanium_hoe", () -> new CraftaniumHoeItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
