package uk.co.callumhutchy.runecraft2.worldgen;

import java.util.Random;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import uk.co.callumhutchy.runecraft2.blocks.Blocks;

public class WorldGenEarthAltar  extends WorldGenerator {
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

		world.setBlockState(new BlockPos(varX + 3, varY - 1, varZ + 2), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 2, varY - 1, varZ + 3), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 3, varY - 1, varZ + 3), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 4, varY - 1, varZ + 3), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 3, varY - 1, varZ + 4), net.minecraft.init.Blocks.stonebrick.getDefaultState());

		world.setBlockState(new BlockPos(varX, varY, varZ), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 2, varY, varZ), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 4, varY, varZ), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 6, varY, varZ), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		varX = Xreset;
		world.setBlockState(new BlockPos(varX, varY, varZ + 2), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 2, varY, varZ + 2), net.minecraft.init.Blocks.stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(varX + 4, varY, varZ + 2), net.minecraft.init.Blocks.stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(varX + 6, varY, varZ + 2), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		varX = Xreset;
		world.setBlockState(new BlockPos(varX + 3, varY, varZ + 3), Blocks.EarthAltar.getDefaultState());
		varX = Xreset;
		world.setBlockState(new BlockPos(varX, varY, varZ + 4), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 2, varY, varZ + 4), net.minecraft.init.Blocks.stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(varX + 4, varY, varZ + 4), net.minecraft.init.Blocks.stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(varX + 6, varY, varZ + 4), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		varX = Xreset;
		world.setBlockState(new BlockPos(varX, varY, varZ + 6), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 2, varY, varZ + 6), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 4, varY, varZ + 6), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 6, varY, varZ + 6), net.minecraft.init.Blocks.stonebrick.getDefaultState());

		world.setBlockState(new BlockPos(varX, varY + 1, varZ), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 2, varY + 1, varZ), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 4, varY + 1, varZ), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 6, varY + 1, varZ), net.minecraft.init.Blocks.stonebrick.getDefaultState());

		world.setBlockState(new BlockPos(varX, varY + 1, varZ + 2), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 6, varY + 1, varZ + 2), net.minecraft.init.Blocks.stonebrick.getDefaultState());

		world.setBlockState(new BlockPos(varX, varY + 1, varZ + 4), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 6, varY + 1, varZ + 4), net.minecraft.init.Blocks.stonebrick.getDefaultState());

		world.setBlockState(new BlockPos(varX, varY + 1, varZ + 6), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 2, varY + 1, varZ + 6), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 4, varY + 1, varZ + 6), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 6, varY + 1, varZ + 6), net.minecraft.init.Blocks.stonebrick.getDefaultState());

		world.setBlockState(new BlockPos(varX + 2, varY + 2, varZ), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 3, varY + 2, varZ), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 4, varY + 2, varZ), net.minecraft.init.Blocks.stonebrick.getDefaultState());

		world.setBlockState(new BlockPos(varX, varY + 2, varZ + 2), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX, varY + 2, varZ + 3), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX, varY + 2, varZ + 4), net.minecraft.init.Blocks.stonebrick.getDefaultState());

		world.setBlockState(new BlockPos(varX + 6, varY + 2, varZ + 2), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 6, varY + 2, varZ + 3), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 6, varY + 2, varZ + 4), net.minecraft.init.Blocks.stonebrick.getDefaultState());

		world.setBlockState(new BlockPos(varX + 2, varY + 2, varZ + 6), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 3, varY + 2, varZ + 6), net.minecraft.init.Blocks.stonebrick.getDefaultState());
		world.setBlockState(new BlockPos(varX + 4, varY + 2, varZ + 6), net.minecraft.init.Blocks.stonebrick.getDefaultState());

		return true;
	}
}
