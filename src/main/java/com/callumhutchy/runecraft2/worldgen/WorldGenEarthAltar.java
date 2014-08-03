package com.callumhutchy.runecraft2.worldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.callumhutchy.runecraft2.blocks.Blocks;

public class WorldGenEarthAltar  extends WorldGenerator {
	@Override
	public boolean generate(World world, Random random, int varX, int varY, int varZ) {

		while (world.isAirBlock(varX, varY, varZ) && varY > 2) {
			--varY;
		}

		varY++;
		int Xreset = varX;
		int Yreset = varY;
		int Zreset = varZ;

		world.setBlock(varX + 3, varY - 1, varZ + 2, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 2, varY - 1, varZ + 3, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 3, varY - 1, varZ + 3, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 4, varY - 1, varZ + 3, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 3, varY - 1, varZ + 4, net.minecraft.init.Blocks.stonebrick);

		world.setBlock(varX, varY, varZ, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 2, varY, varZ, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 4, varY, varZ, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 6, varY, varZ, net.minecraft.init.Blocks.stonebrick);
		varX = Xreset;
		world.setBlock(varX, varY, varZ + 2, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 2, varY, varZ + 2, net.minecraft.init.Blocks.stone_slab);
		world.setBlock(varX + 4, varY, varZ + 2, net.minecraft.init.Blocks.stone_slab);
		world.setBlock(varX + 6, varY, varZ + 2, net.minecraft.init.Blocks.stonebrick);
		varX = Xreset;
		world.setBlock(varX + 3, varY, varZ + 3, Blocks.EarthAltar);
		varX = Xreset;
		world.setBlock(varX, varY, varZ + 4, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 2, varY, varZ + 4, net.minecraft.init.Blocks.stone_slab);
		world.setBlock(varX + 4, varY, varZ + 4, net.minecraft.init.Blocks.stone_slab);
		world.setBlock(varX + 6, varY, varZ + 4, net.minecraft.init.Blocks.stonebrick);
		varX = Xreset;
		world.setBlock(varX, varY, varZ + 6, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 2, varY, varZ + 6, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 4, varY, varZ + 6, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 6, varY, varZ + 6, net.minecraft.init.Blocks.stonebrick);

		world.setBlock(varX, varY + 1, varZ, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 2, varY + 1, varZ, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 4, varY + 1, varZ, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 6, varY + 1, varZ, net.minecraft.init.Blocks.stonebrick);

		world.setBlock(varX, varY + 1, varZ + 2, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 6, varY + 1, varZ + 2, net.minecraft.init.Blocks.stonebrick);

		world.setBlock(varX, varY + 1, varZ + 4, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 6, varY + 1, varZ + 4, net.minecraft.init.Blocks.stonebrick);

		world.setBlock(varX, varY + 1, varZ + 6, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 2, varY + 1, varZ + 6, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 4, varY + 1, varZ + 6, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 6, varY + 1, varZ + 6, net.minecraft.init.Blocks.stonebrick);

		world.setBlock(varX + 2, varY + 2, varZ, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 3, varY + 2, varZ, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 4, varY + 2, varZ, net.minecraft.init.Blocks.stonebrick);

		world.setBlock(varX, varY + 2, varZ + 2, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX, varY + 2, varZ + 3, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX, varY + 2, varZ + 4, net.minecraft.init.Blocks.stonebrick);

		world.setBlock(varX + 6, varY + 2, varZ + 2, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 6, varY + 2, varZ + 3, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 6, varY + 2, varZ + 4, net.minecraft.init.Blocks.stonebrick);

		world.setBlock(varX + 2, varY + 2, varZ + 6, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 3, varY + 2, varZ + 6, net.minecraft.init.Blocks.stonebrick);
		world.setBlock(varX + 4, varY + 2, varZ + 6, net.minecraft.init.Blocks.stonebrick);

		return true;
	}
}
