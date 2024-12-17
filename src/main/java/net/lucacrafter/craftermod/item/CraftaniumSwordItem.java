
package net.lucacrafter.craftermod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.lucacrafter.craftermod.init.CraftermodModItems;

public class CraftaniumSwordItem extends SwordItem {
	public CraftaniumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1532;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 9f;
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
		}, 3, -3f, new Item.Properties());
	}
}
