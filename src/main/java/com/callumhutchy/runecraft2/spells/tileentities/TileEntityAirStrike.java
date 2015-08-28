package com.callumhutchy.runecraft2.spells.tileentities;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class TileEntityAirStrike extends EntityThrowable{

    public TileEntityAirStrike(World worldIn, double x, double y, double p_i1778_6_) {
	super(worldIn, x, y, p_i1778_6_);
	// TODO Auto-generated constructor stub
    }

    @Override
    protected void onImpact(MovingObjectPosition p_70184_1_) {
	// TODO Auto-generated method stub
	
    }
  
}
