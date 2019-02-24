package fieryphoenix99.mod.objects.items.tools;

import fieryphoenix99.mod.Main;
import fieryphoenix99.mod.init.ModItems;
import fieryphoenix99.mod.util.interfaces.IHasModel;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {
	public ToolAxe(String name, ToolMaterial material) {
		super(material, 14.0f, -3.4f);
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
