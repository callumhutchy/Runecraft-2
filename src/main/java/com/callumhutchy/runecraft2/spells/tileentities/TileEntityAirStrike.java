package com.callumhutchy.runecraft2.spells.tileentities;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class TileEntityAirStrike extends EntityFireball{

	public TileEntityAirStrike(World worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
	}
	
	
	public TileEntityAirStrike(World world, EntityLivingBase player){
		super(world, player,0, 0, 0);
		
	}


	@Override
	protected void onImpact(MovingObjectPosition movingObject) {
		// TODO Auto-generated method stub
		
	}
	
  
}
