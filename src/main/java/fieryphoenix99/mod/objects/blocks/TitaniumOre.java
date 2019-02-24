package fieryphoenix99.mod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TitaniumOre extends BlockBase {

	public TitaniumOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0f);
		setResistance(23.0f);
		setHarvestLevel("pickaxe", 3);
	}
	
}
