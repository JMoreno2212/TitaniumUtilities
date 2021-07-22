package fieryphoenix99.titaniumutilities.core.init;

import fieryphoenix99.titaniumutilities.TitaniumUtilities;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
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
			() -> new BlockItem(BlockInit.TITANIUM_ORE.get(), new Item.Properties().tab(TitaniumUtilities.TITANIUM_UTILITIES_GROUP)));
	
	public static final RegistryObject<BlockItem> TITANIUM_LUMP = ITEMS.register("titanium_lump", 
			() -> new BlockItem(BlockInit.TITANIUM_LUMP.get(), new Item.Properties().tab(TitaniumUtilities.TITANIUM_UTILITIES_GROUP)));
	
	public static final RegistryObject<BlockItem> TITANIUM_BLOCK = ITEMS.register("titanium_block", 
			() -> new BlockItem(BlockInit.TITANIUM_BLOCK.get(), new Item.Properties().tab(TitaniumUtilities.TITANIUM_UTILITIES_GROUP)));
}
