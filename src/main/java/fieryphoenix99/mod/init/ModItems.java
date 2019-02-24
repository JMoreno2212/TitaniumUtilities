package fieryphoenix99.mod.init;

import java.util.ArrayList;
import java.util.List;

import fieryphoenix99.mod.objects.items.ItemBase;
import fieryphoenix99.mod.objects.items.armor.ArmorBase;
import fieryphoenix99.mod.objects.items.tools.ToolAxe;
import fieryphoenix99.mod.objects.items.tools.ToolHoe;
import fieryphoenix99.mod.objects.items.tools.ToolPickaxe;
import fieryphoenix99.mod.objects.items.tools.ToolSpade;
import fieryphoenix99.mod.objects.items.tools.ToolSword;
import fieryphoenix99.mod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	//Materials
	public static final ToolMaterial TOOL_MATERIAL_TITANIUM = EnumHelper.addToolMaterial("material_titanium",3, 2342, 12.0F, 7.0F, 7);
	public static final ArmorMaterial ARMOR_MATERIAL_TITANIUM = EnumHelper.addArmorMaterial("armor_material_titanium", 
			Reference.MOD_ID + ":titanium", 50, new int[] {4,7,9,4}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0f);
	
	//Items
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final Item TITANIUM_INGOT= new ItemBase("titanium_ingot");
	public static final Item TITANIUM_NUGGET = new ItemBase("titanium_nugget");
	
	//Tools
	public static final ItemSword TITANIUM_SWORD = new ToolSword("titanium_sword", TOOL_MATERIAL_TITANIUM);
	public static final ItemSpade TITANIUM_SHOVEL = new ToolSpade("titanium_shovel", TOOL_MATERIAL_TITANIUM);
	public static final ItemPickaxe TITANIUM_PICKAXE = new ToolPickaxe("titanium_pickaxe", TOOL_MATERIAL_TITANIUM);
	public static final ItemAxe TITANIUM_AXE = new ToolAxe("titanium_axe", TOOL_MATERIAL_TITANIUM);
	public static final ItemHoe TITANIUM_HOE = new ToolHoe("titanium_hoe", TOOL_MATERIAL_TITANIUM);
	
	//Armor
	public static final Item TITANIUM_HELMET = new ArmorBase("titanium_helmet", ARMOR_MATERIAL_TITANIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item TITANIUM_CHESTPLATE = new ArmorBase("titanium_chestplate", ARMOR_MATERIAL_TITANIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item TITANIUM_LEGGINGS = new ArmorBase("titanium_leggings", ARMOR_MATERIAL_TITANIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item TITANIUM_BOOTS = new ArmorBase("titanium_boots", ARMOR_MATERIAL_TITANIUM, 1, EntityEquipmentSlot.FEET);
}
