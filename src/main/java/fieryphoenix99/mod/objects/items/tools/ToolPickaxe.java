package fieryphoenix99.mod.objects.items.tools;

import fieryphoenix99.mod.Main;
import fieryphoenix99.mod.init.ModItems;
import fieryphoenix99.mod.util.interfaces.IHasModel;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {
	public ToolPickaxe(String name, ToolMaterial material) {
		super(material);
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
