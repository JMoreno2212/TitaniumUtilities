package jmoreno2212.titaniumutilities.core.init;

import jmoreno2212.titaniumutilities.TitaniumUtilities;
import jmoreno2212.titaniumutilities.common.items.DenseBlockItem;
import jmoreno2212.titaniumutilities.core.enums.TitaniumArmorMaterial;
import jmoreno2212.titaniumutilities.core.enums.TitaniumToolMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TitaniumUtilities.MOD_ID);
	
	// Items
	public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", 
			() -> new Item(new Item.Properties().tab(TitaniumUtilities.TITANIUM_UTILITIES_GROUP)));
	
	public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget", 
			() -> new Item(new Item.Properties().tab(TitaniumUtilities.TITANIUM_UTILITIES_GROUP)));

	// Block - Items
	public static final RegistryObject<BlockItem> TITANIUM_ORE = ITEMS.register("titanium_ore", 
			() -> new DenseBlockItem(BlockInit.TITANIUM_ORE.get(), new Item.Properties().tab(TitaniumUtilities.TITANIUM_UTILITIES_GROUP)));
	
	public static final RegistryObject<BlockItem> TITANIUM_LUMP = ITEMS.register("titanium_lump", 
			() -> new DenseBlockItem(BlockInit.TITANIUM_LUMP.get(), new Item.Properties().tab(TitaniumUtilities.TITANIUM_UTILITIES_GROUP)));
	
	public static final RegistryObject<BlockItem> TITANIUM_BLOCK = ITEMS.register("titanium_block", 
			() -> new BlockItem(BlockInit.TITANIUM_BLOCK.get(), new Item.Properties().tab(TitaniumUtilities.TITANIUM_UTILITIES_GROUP)));

	// Armor
	public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet",
			() -> new ArmorItem(TitaniumArmorMaterial.TITANIUM, EquipmentSlotType.HEAD,
					new Item.Properties().tab(TitaniumUtilities.TITANIUM_UTILITIES_GROUP)));
	
	public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",
			() -> new ArmorItem(TitaniumArmorMaterial.TITANIUM, EquipmentSlotType.CHEST,
					new Item.Properties().tab(TitaniumUtilities.TITANIUM_UTILITIES_GROUP)));
	
	public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings",
			() -> new ArmorItem(TitaniumArmorMaterial.TITANIUM, EquipmentSlotType.LEGS,
					new Item.Properties().tab(TitaniumUtilities.TITANIUM_UTILITIES_GROUP)));
	
	public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots",
			() -> new ArmorItem(TitaniumArmorMaterial.TITANIUM, EquipmentSlotType.FEET,
					new Item.Properties().tab(TitaniumUtilities.TITANIUM_UTILITIES_GROUP)));
	
	// Tools and Weapons
	public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword",
			() -> new SwordItem(TitaniumToolMaterial.TITANIUM, 3, -2.4F,
					new Item.Properties().tab(TitaniumUtilities.TITANIUM_UTILITIES_GROUP)));

	public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
			() -> new ShovelItem(TitaniumToolMaterial.TITANIUM, 1.5F, -3.0F,
					new Item.Properties().tab(TitaniumUtilities.TITANIUM_UTILITIES_GROUP)));
	
	public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
			() -> new PickaxeItem(TitaniumToolMaterial.TITANIUM, 1, -2.8F,
					new Item.Properties().tab(TitaniumUtilities.TITANIUM_UTILITIES_GROUP)));
	
	public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe",
			() -> new AxeItem(TitaniumToolMaterial.TITANIUM, 5.0F, -3.0F,
					new Item.Properties().tab(TitaniumUtilities.TITANIUM_UTILITIES_GROUP)));
	
	public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe",
			() -> new HoeItem(TitaniumToolMaterial.TITANIUM, -4, -0.0F,
					new Item.Properties().tab(TitaniumUtilities.TITANIUM_UTILITIES_GROUP)));
	
}
