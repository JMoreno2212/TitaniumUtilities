package fieryphoenix99.mod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.TITANIUM_POOR_ORE, new ItemStack(ModItems.TITANIUM_NUGGET, 1), 4.0f);
		GameRegistry.addSmelting(ModBlocks.TITANIUM_ORE, new ItemStack(ModItems.TITANIUM_INGOT, 1), 6.0f);
	}
}
