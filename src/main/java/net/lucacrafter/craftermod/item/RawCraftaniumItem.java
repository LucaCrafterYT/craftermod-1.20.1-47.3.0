
package net.lucacrafter.craftermod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawCraftaniumItem extends Item {
	public RawCraftaniumItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}