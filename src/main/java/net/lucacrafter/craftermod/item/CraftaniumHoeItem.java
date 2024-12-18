
package net.lucacrafter.craftermod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.lucacrafter.craftermod.init.CraftermodModItems;

public class CraftaniumHoeItem extends HoeItem {
	public CraftaniumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1024;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CraftermodModItems.CRAFTANIUM_INGOT.get()));
			}
		}, 0, 0f, new Item.Properties());
	}
}
