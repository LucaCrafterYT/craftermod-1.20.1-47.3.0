
package net.lucacrafter.craftermod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.lucacrafter.craftermod.init.CraftermodModItems;

public class CraftaniumPickaxeItem extends PickaxeItem {
	public CraftaniumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1328;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 7f;
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
