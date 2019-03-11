package fieryphoenix99.mod.init;

import java.util.ArrayList;
import java.util.List;

import fieryphoenix99.mod.objects.blocks.TitaniumBlock;
import fieryphoenix99.mod.objects.blocks.TitaniumOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block TITANIUM_ORE = new TitaniumOre("titanium_ore", Material.ROCK);
	public static final Block TITANIUM_POOR_ORE = new TitaniumOre("titanium_poor_ore", Material.ROCK);
	public static final Block TITANIUM_BLOCK = new TitaniumBlock("titanium_block", Material.IRON);
	//public static final Block TITANIUM_FURNACE = new TitaniumFurnace("titanium_furnace");
}
