package fieryphoenix99.titaniumutilities.core.enums;

import java.util.function.Supplier;

import fieryphoenix99.titaniumutilities.core.init.ItemInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum TitaniumArmorMaterial implements IArmorMaterial{
	TITANIUM("titanium", 35, new int[]{3, 6, 8, 3},	12, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F, 0.0F, () -> {
		return Ingredient.of(ItemInit.TITANIUM_INGOT.get());
		});

	private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] slotProtections;
	private final int enchantmentValue;
	private final SoundEvent sound;
	private final float toughness;
	private final float knockbackResistance;
	private final LazyValue<Ingredient> repairIngredient;

	private TitaniumArmorMaterial(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue,
			SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.slotProtections = slotProtections;
		this.enchantmentValue = enchantmentValue;
		this.sound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = new LazyValue<>(repairIngredient);
	}

	@Override
	public int getDurabilityForSlot(EquipmentSlotType slotType) {
		return HEALTH_PER_SLOT[slotType.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlotType slotType) {
		return this.slotProtections[slotType.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.sound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}

}
