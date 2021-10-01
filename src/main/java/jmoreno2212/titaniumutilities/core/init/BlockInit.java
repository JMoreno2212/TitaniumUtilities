package jmoreno2212.titaniumutilities.core.init;

import jmoreno2212.titaniumutilities.TitaniumUtilities;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TitaniumUtilities.MOD_ID);
	
	public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore",
			() -> new OreBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops().sound(SoundType.STONE).strength(5.0f, 15.0f)));
	
	public static final RegistryObject<Block> TITANIUM_LUMP = BLOCKS.register("titanium_lump",
			() -> new OreBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops().sound(SoundType.STONE).strength(3.5f, 13.0f)));
	
	public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.METAL).harvestLevel(3).harvestTool(ToolType.PICKAXE)
					.requiresCorrectToolForDrops().sound(SoundType.METAL).strength(5.0f, 25.0f)));
}
