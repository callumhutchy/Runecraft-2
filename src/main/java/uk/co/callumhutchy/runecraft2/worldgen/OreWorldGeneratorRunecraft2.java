package uk.co.callumhutchy.runecraft2.worldgen;

import java.util.Random;

import handler.ConfigurationHandler;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import uk.co.callumhutchy.runecraft2.blocks.Blocks;

public class OreWorldGeneratorRunecraft2 implements IWorldGenerator{
	Random	rand	= new Random();
	
	private WorldGenerator gen_adamantite_ore; //Generates Rune Essence (Used in Overworld)		4
	private WorldGenerator gen_coal_ore; //Generates Rune Essence (Used in Overworld)			1
	private WorldGenerator gen_copper_ore; //Generates Rune Essence (Used in Overworld) 		1
	private WorldGenerator gen_gold_ore; //Generates Rune Essence (Used in Overworld)			3
	private WorldGenerator gen_iron_ore; //Generates Rune Essence (Used in Overworld)			2
	private WorldGenerator gen_mithril_ore; //Generates Rune Essence (Used in Overworld)		3
	private WorldGenerator gen_runite_ore; //Generates Rune Essence (Used in Overworld)			5
	private WorldGenerator gen_silver_ore; //Generates Rune Essence (Used in Overworld)			2
	private WorldGenerator gen_tin_ore; //Generates Rune Essence (Used in Overworld)			1
	
	private WorldGenerator gen_runeessence_ore; //Generates Rune Essence (Used in Overworld)
	private WorldGenerator gen_pureessence_ore; //Generates Pure Essence (Used in Overworld)
	public OreWorldGeneratorRunecraft2(){

		this.gen_adamantite_ore = new WorldGenMinable(Blocks.AdamantiteOre.getDefaultState(), 4);
		this.gen_mithril_ore = new WorldGenMinable(Blocks.MithrilOre.getDefaultState(), 4);
		this.gen_runite_ore = new WorldGenMinable(Blocks.RuniteOre.getDefaultState(), 4);
		this.gen_iron_ore = new WorldGenMinable(Blocks.IronOre.getDefaultState(), 8);
		this.gen_copper_ore = new WorldGenMinable(Blocks.CopperOre.getDefaultState(), 8);
		this.gen_tin_ore = new WorldGenMinable(Blocks.TinOre.getDefaultState(), 8);
		this.gen_gold_ore = new WorldGenMinable(Blocks.GoldOre.getDefaultState(), 4);
		this.gen_silver_ore = new WorldGenMinable(Blocks.SilverOre.getDefaultState(), 4);
		
		this.gen_coal_ore = new WorldGenMinable(Blocks.CoalOre.getDefaultState(), 10);
		
		
		this.gen_runeessence_ore = new WorldGenMinable(Blocks.RuneEssenceOre.getDefaultState(), 8);
		this.gen_pureessence_ore = new WorldGenMinable(Blocks.PureEssenceOre.getDefaultState(), 4);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		int multiplier = rand.nextInt(ConfigurationHandler.WorldGenMultiplier);
		switch (world.provider.getDimensionId()) {
		case -1: //Nether
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1: //End
			
			break;
		case 0: //Overworld
			this.runGenerator(this.gen_runeessence_ore, world, random, chunkX,chunkZ, 20, 30, 64);
			this.runGenerator(this.gen_pureessence_ore, world, random, chunkX, chunkZ, 15, 10, 40);
			
			this.runGenerator(this.gen_adamantite_ore, world, random, chunkX, chunkZ, 10, 10, 25);
			this.runGenerator(this.gen_mithril_ore, world, random, chunkX, chunkZ, 15, 15, 35);
			this.runGenerator(this.gen_runite_ore, world, random, chunkX, chunkZ, 2, 3, 10);
			this.runGenerator(this.gen_iron_ore, world, random, chunkX, chunkZ, 20, 10, 40);
			this.runGenerator(this.gen_copper_ore, world, random, chunkX, chunkZ, 25, 10, 40);
			this.runGenerator(this.gen_tin_ore, world, random, chunkX, chunkZ, 25, 10, 40);
			this.runGenerator(this.gen_gold_ore, world, random, chunkX, chunkZ, 10, 10, 40);
			this.runGenerator(this.gen_silver_ore, world, random, chunkX, chunkZ, 15, 10, 40);
			
			this.runGenerator(this.gen_coal_ore, world, random, chunkX, chunkZ, 25, 10, 40);
			//generateSurface(world, random, chunkX * 16 * multiplier, chunkZ * 16 * multiplier);
			break;
		}

	}
	
	private void generateSurface(World world, Random random, int blockX, int blockZ) {
		int Xcoord = blockX + random.nextInt(16);
		int Ycoord = random.nextInt(90);
		int Zcoord = blockZ + random.nextInt(16);
		if (ConfigurationHandler.oreWorldGen) {
			int rand = randInt(1, 5);
			if(rand == 1){
				(new WorldGenOre()).generate(world, random, new BlockPos( Xcoord, Ycoord, Zcoord));
				
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

	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight){
		if(minHeight < 0 || maxHeight > 256 || minHeight > maxHeight){
			throw new IllegalArgumentException("Runecraft2: Illegal Height Arguments for WorldGenerator");
		}
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chancesToSpawn; i++){
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x,y,z));
		}
		
	}

}
