package uk.co.callumhutchy.runecraft2.worldgen;

import java.util.Random;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import uk.co.callumhutchy.runecraft2.blocks.Blocks;

public class WorldGenOre extends WorldGenerator {
	@Override
	public boolean generate(World world, Random random, BlockPos blockPos) {

		int varX = blockPos.getX();
		int varY = blockPos.getY();
		int varZ = blockPos.getZ();
		
		while (world.isAirBlock(new BlockPos(varX, varY, varZ)) && varY > 2) {
			--varY;
		}

		varY++;
		int Xreset = varX;
		int Yreset = varY;
		int Zreset = varZ;
		if(world.getBlockState(new BlockPos(varX, varY - 1, varZ)) != net.minecraft.init.Blocks.water){
			if(world.getBlockState(new BlockPos(varX, varY - 1, varZ)) == net.minecraft.init.Blocks.tallgrass){
				varY--;
			}
			if(world.getBlockState(new BlockPos(varX, varY - 1, varZ)) == net.minecraft.init.Blocks.snow_layer){
				varY--;
			}
			world.setBlockState(new BlockPos(varX, varY, varZ), Blocks.RuneEssenceOre.getDefaultState());
		}
		
		

		
		return true;
	}
}
