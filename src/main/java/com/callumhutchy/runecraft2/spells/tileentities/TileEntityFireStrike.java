package com.callumhutchy.runecraft2.spells.tileentities;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class TileEntityFireStrike extends EntityArrow{

	public TileEntityFireStrike(World worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
	}
	public TileEntityFireStrike(World worldIn, EntityLivingBase player, float var){
		super(worldIn, player, var );
		
	}
}
