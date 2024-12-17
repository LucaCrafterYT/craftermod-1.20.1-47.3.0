
package net.lucacrafter.craftermod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.lucacrafter.craftermod.init.CraftermodModItems;

public class CraftaniumAxeItem extends AxeItem {
	public CraftaniumAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1264;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 5f;
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
		}, 1, -3f, new Item.Properties());
	}
}
