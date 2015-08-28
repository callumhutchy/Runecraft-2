package com.callumhutchy.runecraft2.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.callumhutchy.runecraft2.blocks.Blocks;

public class WorldGenAirAltar extends WorldGenerator {

	//@Override
	public boolean generate(World world, Random random, BlockPos blockPos, Block altar) {

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

		//Ground
		world.setBlockState(new BlockPos(varX, varY-1, varZ + 5), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX+1, varY-1, varZ + 5), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX+2, varY-1, varZ + 3), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+2, varY-1, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+2, varY-1, varZ + 5), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+2, varY-1, varZ + 6), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+2, varY-1, varZ + 7), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX+3, varY-1, varZ + 2), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+3, varY-1, varZ + 3), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+3, varY-1, varZ + 7), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+3, varY-1, varZ + 8), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX+4, varY-1, varZ + 2), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+4, varY-1, varZ + 8), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX+5, varY-1, varZ + 0), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+5, varY-1, varZ + 1), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+5, varY-1, varZ + 2), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+5, varY-1, varZ + 8), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+5, varY-1, varZ + 9), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+5, varY-1, varZ + 10), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX+6, varY-1, varZ + 2), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+6, varY-1, varZ + 8), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX+7, varY-1, varZ + 2), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+7, varY-1, varZ + 3), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+7, varY-1, varZ + 7), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+7, varY-1, varZ + 8), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX+8, varY-1, varZ + 3), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+8, varY-1, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+8, varY-1, varZ + 5), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+8, varY-1, varZ + 6), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX+8, varY-1, varZ + 7), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX+9, varY-1, varZ + 5), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX+10, varY-1, varZ + 5), getRandomStoneBlock());
		
		
		
		//Level 1
		world.setBlockState(new BlockPos(varX, varY, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX, varY, varZ + 6), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 1, varY, varZ + 3), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 1, varY, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 1, varY, varZ + 6), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 1, varY, varZ + 7), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 2, varY, varZ + 2), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 2, varY, varZ + 8), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 3, varY, varZ + 1), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 3, varY, varZ + 4), net.minecraft.init.Blocks.stone_slab.getStateFromMeta(5));
		world.setBlockState(new BlockPos(varX + 3, varY, varZ + 5), net.minecraft.init.Blocks.stone_slab.getStateFromMeta(5));
		world.setBlockState(new BlockPos(varX + 3, varY, varZ + 6), net.minecraft.init.Blocks.stone_slab.getStateFromMeta(5));
		world.setBlockState(new BlockPos(varX + 3, varY, varZ + 9), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 4, varY, varZ), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 4, varY, varZ + 1), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 4, varY, varZ + 3), net.minecraft.init.Blocks.stone_slab.getStateFromMeta(5));
		world.setBlockState(new BlockPos(varX + 4, varY, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 4, varY, varZ + 5), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 4, varY, varZ + 6), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 4, varY, varZ + 7), net.minecraft.init.Blocks.stone_slab.getStateFromMeta(5));
		world.setBlockState(new BlockPos(varX + 4, varY, varZ + 9), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 4, varY, varZ + 10), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 5, varY, varZ + 3), net.minecraft.init.Blocks.stone_slab.getStateFromMeta(5));
		world.setBlockState(new BlockPos(varX + 5, varY, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 5, varY, varZ + 5), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 5, varY, varZ + 6), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 5, varY, varZ + 7), net.minecraft.init.Blocks.stone_slab.getStateFromMeta(5));
		
		world.setBlockState(new BlockPos(varX + 6, varY, varZ), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 6, varY, varZ + 1), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 6, varY, varZ + 3), net.minecraft.init.Blocks.stone_slab.getStateFromMeta(5));
		world.setBlockState(new BlockPos(varX + 6, varY, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 6, varY, varZ + 5), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 6, varY, varZ + 6), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 6, varY, varZ + 7), net.minecraft.init.Blocks.stone_slab.getStateFromMeta(5));
		world.setBlockState(new BlockPos(varX + 6, varY, varZ + 9), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 6, varY, varZ + 10), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 7, varY, varZ + 1), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 7, varY, varZ + 4), net.minecraft.init.Blocks.stone_slab.getStateFromMeta(5));
		world.setBlockState(new BlockPos(varX + 7, varY, varZ + 5), net.minecraft.init.Blocks.stone_slab.getStateFromMeta(5));
		world.setBlockState(new BlockPos(varX + 7, varY, varZ + 6), net.minecraft.init.Blocks.stone_slab.getStateFromMeta(5));
		world.setBlockState(new BlockPos(varX + 7, varY, varZ + 9), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 8, varY, varZ + 2), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 8, varY, varZ + 8), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 9, varY, varZ + 3), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 9, varY, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 9, varY, varZ + 6), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 9, varY, varZ + 7), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 10, varY, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 10, varY, varZ + 6), getRandomStoneBlock());
		
		//Level 2
		world.setBlockState(new BlockPos(varX, varY+1, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX, varY+1, varZ + 6), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 1, varY+1, varZ + 3), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 1, varY+1, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 1, varY+1, varZ + 6), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 1, varY+1, varZ + 7), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 2, varY+1, varZ + 2), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 2, varY+1, varZ + 8), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 3, varY+1, varZ + 1), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 3, varY+1, varZ + 9), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 4, varY+1, varZ), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 4, varY+1, varZ + 1), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 4, varY+1, varZ + 9), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 4, varY+1, varZ + 10), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 5, varY+1, varZ + 5),altar.getDefaultState());
		
		world.setBlockState(new BlockPos(varX + 6, varY+1, varZ), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 6, varY+1, varZ + 1), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 6, varY+1, varZ + 9), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 6, varY+1, varZ + 10), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 7, varY+1, varZ + 1), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 7, varY+1, varZ + 9), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 8, varY+1, varZ + 2), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 8, varY+1, varZ + 8), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 9, varY+1, varZ + 3), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 9, varY+1, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 9, varY+1, varZ + 6), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 9, varY+1, varZ + 7), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 10, varY+1, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 10, varY+1, varZ + 6), getRandomStoneBlock());
		
		//Level 3
		world.setBlockState(new BlockPos(varX + 1, varY+2, varZ + 3), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 1, varY+2, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 1, varY+2, varZ + 5), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 1, varY+2, varZ + 6), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 1, varY+2, varZ + 7), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 2, varY+2, varZ + 2), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 2, varY+2, varZ + 8), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 3, varY+2, varZ + 1), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 3, varY+2, varZ + 9), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 4, varY+2, varZ + 1), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 4, varY+2, varZ + 9), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 5, varY+2, varZ + 1), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 5, varY+2, varZ + 9), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 6, varY+2, varZ + 1), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 6, varY+2, varZ + 9), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 7, varY+2, varZ + 1), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 7, varY+2, varZ + 9), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 8, varY+2, varZ + 2), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 8, varY+2, varZ + 8), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 9, varY+2, varZ + 3), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 9, varY+2, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 9, varY+2, varZ + 5), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 9, varY+2, varZ + 6), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 9, varY+2, varZ + 7), getRandomStoneBlock());
		
		//Level 4
		world.setBlockState(new BlockPos(varX + 2, varY+3, varZ + 3), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 2, varY+3, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 2, varY+3, varZ + 5), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 2, varY+3, varZ + 6), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 2, varY+3, varZ + 7), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 3, varY+3, varZ + 2), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 3, varY+3, varZ + 3), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 3, varY+3, varZ + 7), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 3, varY+3, varZ + 8), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 4, varY+3, varZ + 2), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 4, varY+3, varZ + 8), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 5, varY+3, varZ + 2), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 5, varY+3, varZ + 8), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 6, varY+3, varZ + 2), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 6, varY+3, varZ + 8), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 7, varY+3, varZ + 2), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 7, varY+3, varZ + 3), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 7, varY+3, varZ + 7), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 7, varY+3, varZ + 8), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 8, varY+3, varZ + 3), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 8, varY+3, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 8, varY+3, varZ + 5), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 8, varY+3, varZ + 6), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 8, varY+3, varZ + 7), getRandomStoneBlock());
		
		//Level 5
		world.setBlockState(new BlockPos(varX + 3, varY+4, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 3, varY+4, varZ + 5), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 3, varY+4, varZ + 6), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 4, varY+4, varZ + 3), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 4, varY+4, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 4, varY+4, varZ + 5), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 4, varY+4, varZ + 6), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 4, varY+4, varZ + 7), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 5, varY+4, varZ + 3), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 5, varY+4, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 5, varY+4, varZ + 6), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 5, varY+4, varZ + 7), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 6, varY+4, varZ + 3), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 6, varY+4, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 6, varY+4, varZ + 5), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 6, varY+4, varZ + 6), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 6, varY+4, varZ + 7), getRandomStoneBlock());
		
		world.setBlockState(new BlockPos(varX + 7, varY+4, varZ + 4), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 7, varY+4, varZ + 5), getRandomStoneBlock());
		world.setBlockState(new BlockPos(varX + 7, varY+4, varZ + 6), getRandomStoneBlock());
		
		
		
		
		//world.setBlockState(new BlockPos(varX + 3, varY, varZ + 3), altar.getDefaultState());
		
		return true;
	}

	@Override
	public boolean generate(World worldIn, Random p_180709_2_, BlockPos p_180709_3_) {
	    // TODO Auto-generated method stub
	    return false;
	}

	IBlockState getRandomStoneBlock(){
	    int whichBlock = randInt(1, 3);
	    switch(whichBlock){
	    case 1:
		return net.minecraft.init.Blocks.stonebrick.getDefaultState();
	    case 2:
		return net.minecraft.init.Blocks.stonebrick.getStateFromMeta(1);
	    case 3:
		return net.minecraft.init.Blocks.stonebrick.getStateFromMeta(2);
	
	    default:
		    return net.minecraft.init.Blocks.stonebrick.getDefaultState();
	    
	    }
	   
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
	

