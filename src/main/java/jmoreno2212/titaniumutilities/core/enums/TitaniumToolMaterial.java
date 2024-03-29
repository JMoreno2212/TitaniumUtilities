package jmoreno2212.titaniumutilities.core.enums;

import java.util.function.Supplier;

import jmoreno2212.titaniumutilities.core.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum TitaniumToolMaterial implements IItemTier {
	TITANIUM(4, 1796, 8.5F, 3.5F, 12, () -> {
		return Ingredient.of(ItemInit.TITANIUM_INGOT.get());
	});
	
	private final int level;
	private final int uses;
	private final float speed;
	private final float damage;
	private final int enchantmentValue;
	private final LazyValue<Ingredient> repairIngredient;
	   
	private TitaniumToolMaterial(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
		   this.level = level;
		   this.uses = uses;
		   this.speed = speed;
		   this.damage = damage;
		   this.enchantmentValue = enchantmentValue;
		   this.repairIngredient = new LazyValue<>(repairIngredient);
	}
	
	@Override
	public int getUses() {
		return this.uses;
	}

	@Override
	public float getSpeed() {
		return this.speed;
	}

	@Override
	public float getAttackDamageBonus() {
		return this.damage;
	}

	@Override
	public int getLevel() {
		return this.level;
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}

}
