package fieryphoenix99.mod.tabs;

import fieryphoenix99.mod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TitaniumUtilitiesTab extends CreativeTabs {
	
	public TitaniumUtilitiesTab(String name) {
		super("titaniumUtilitiesTab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.TITANIUM_INGOT);
	}
}
