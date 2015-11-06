package uk.co.callumhutchy.runecraft2.worldgen;

import handler.ConfigurationHandler;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;
import uk.co.callumhutchy.runecraft2.blocks.Blocks;

public class AltarWorldGeneratorRunecraft2 implements IWorldGenerator {
	Random	rand	= new Random();

	public AltarWorldGeneratorRunecraft2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		int multiplier = rand.nextInt(ConfigurationHandler.WorldGenMultiplier);
		switch (world.provider.getDimensionId()) {
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16 * multiplier, chunkZ * 16 * multiplier);
		}

	}

	private void generateSurface(World world, Random random, int blockX, int blockZ) {
		boolean air, earth, fire, water;
		air = earth = fire = water = false;
		int Xcoord = blockX + random.nextInt(16);
		int Ycoord = random.nextInt(90);
		int Zcoord = blockZ + random.nextInt(16);
		
		
		
		int rand = randInt(1, 6);
		if (ConfigurationHandler.altarWorldGen) {
			if (rand == 1) {
				int whichAltar = randInt(1, 4);
				Block altar;
				switch(whichAltar){
				case 1:
				    altar = Blocks.AirAltar;
				    break;
				case 2:
				    altar = Blocks.EarthAltar;
				    break;
				case 3:
				    altar = Blocks.FireAltar;
				    break;
				case 4:
				    altar = Blocks.WaterAltar;
				    break;
				  default:
				      altar = Blocks.AirAltar;
				}
				(new WorldGenAirAltar()).generate(world, random,new BlockPos( Xcoord, Ycoord, Zcoord), altar);
				
				
			}
		}

	}

	private void generateNether(World world, Random random, int blockX, int blockZ) {
		int Xcoord = blockX + random.nextInt(16);
		int Ycoord = random.nextInt(60);
		int Zcoord = blockZ + random.nextInt(16);

	}

	public static int randInt(int min, int max) {

		// NOTE: Usually this should be a field rather than a method
		// variable so that it is not re-seeded every call.
		Random rand = new Random();

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}
}
