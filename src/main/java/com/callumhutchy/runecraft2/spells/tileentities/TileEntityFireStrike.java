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

public class TileEntityFireStrike extends TileEntitySpellStrike {

	
	public TileEntityFireStrike(World par1World)
    {
        super(par1World);
    }

    public TileEntityFireStrike(World par1World, EntityLivingBase par2EntityLivingBase, String strike)
    {
        super(par1World, par2EntityLivingBase, strike);
    }

    public TileEntityFireStrike(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
}
