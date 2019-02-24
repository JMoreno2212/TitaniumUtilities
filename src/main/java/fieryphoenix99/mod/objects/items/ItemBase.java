package fieryphoenix99.mod.objects.items;

import fieryphoenix99.mod.Main;
import fieryphoenix99.mod.init.ModItems;
import fieryphoenix99.mod.util.interfaces.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.TITANIUM_UTILITIES_TAB);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}
