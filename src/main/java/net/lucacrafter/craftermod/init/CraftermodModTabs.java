
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.lucacrafter.craftermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.lucacrafter.craftermod.CraftermodMod;

public class CraftermodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CraftermodMod.MODID);
	public static final RegistryObject<CreativeModeTab> CRAFTER_MOD = REGISTRY.register("crafter_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craftermod.crafter_mod")).icon(() -> new ItemStack(CraftermodModItems.CRAFTANIUM_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftermodModBlocks.CRAFTANIUM_ORE.get().asItem());
				tabData.accept(CraftermodModBlocks.DEEPSLATE_CRAFTANIUM_ORE.get().asItem());
				tabData.accept(CraftermodModBlocks.BLOCK_OF_CRAFTANIUM.get().asItem());
				tabData.accept(CraftermodModItems.CRAFTANIUM_INGOT.get());
				tabData.accept(CraftermodModItems.RAW_CRAFTANIUM.get());
				tabData.accept(CraftermodModItems.CRAFTANIUM_ARMOR_HELMET.get());
				tabData.accept(CraftermodModItems.CRAFTANIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftermodModItems.CRAFTANIUM_ARMOR_LEGGINGS.get());
				tabData.accept(CraftermodModItems.CRAFTANIUM_ARMOR_BOOTS.get());
				tabData.accept(CraftermodModItems.CRAFTANIUM_SWORD.get());
				tabData.accept(CraftermodModItems.CRAFTANIUM_AXE.get());
				tabData.accept(CraftermodModItems.CRAFTANIUM_PICKAXE.get());
				tabData.accept(CraftermodModItems.CRAFTANIUM_SHOVEL.get());
				tabData.accept(CraftermodModItems.CRAFTANIUM_UPGRADE_SMITHING_TEMPLATE.get());
			})

					.build());
}
