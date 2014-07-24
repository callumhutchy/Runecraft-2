package com.callumhutchy.runecraft2.worldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorRunecraft2 implements IWorldGenerator{
	Random rand = new Random();
	public WorldGeneratorRunecraft2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		int multiplier = rand.nextInt(50);
		switch (world.provider.dimensionId)
		  {
		   case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		   case 0: generateSurface(world, random, chunkX*16*multiplier, chunkZ*16*multiplier);
		  }



	}
	private void generateSurface(World world, Random random, int blockX, int blockZ) 
	 {


		  int Xcoord1 = blockX + random.nextInt(16);
		  int Ycoord1 = random.nextInt(90);
		  int Zcoord1 = blockZ + random.nextInt(16);
	  	(new WorldGenAirAltar()).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
	  }


	 private void generateNether(World world, Random random, int blockX, int blockZ) 
	 {
	  int Xcoord = blockX + random.nextInt(16);
	  int Ycoord = random.nextInt(60);
	  int Zcoord = blockZ + random.nextInt(16);


	 }

}
