package net.lucacrafter.craftermod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class CraftaniumRingRightClickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("CrafterModTimer") == 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 5, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 6000, 5, false, false));
		}
		if (entity.getPersistentData().getDouble("CrafterModTimer") == 0) {
			entity.getPersistentData().putDouble("CrafterModTimer", 12000);
		} else {
			entity.getPersistentData().putDouble("CrafterModTimer", (entity.getPersistentData().getDouble("CrafterModTimer") - 1));
		}
	}
}
