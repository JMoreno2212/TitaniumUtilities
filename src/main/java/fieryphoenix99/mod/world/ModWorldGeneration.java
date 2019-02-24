package fieryphoenix99.mod.world;

import java.util.Random;

import fieryphoenix99.mod.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGeneration implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, 
			IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if(world.provider.getDimension() == 0) {
			
			generateOverWorld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverWorld(Random random, int chunkX, int chunkZ, World world, 
			IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
		generateOre(ModBlocks.TITANIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16,
				7, 15, random.nextInt(3), 4);
		
		generateOre(ModBlocks.TITANIUM_POOR_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16,
				7, 15, random.nextInt(5), 4);
	}
		
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		
		if(minY > maxY || minY < 0 || maxY > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int deltaY = maxY - minY;
		
		for(int i = 0; i < chances; i++) {
			BlockPos position = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, position);
		}
	}
}
