package uk.co.callumhutchy.runecraft2.spells.tileentities;

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

public class TileEntitySpellStrike extends EntityThrowable {
	private static final String __OBFID = "CL_00001722";
	private String typeOfStrike = "air";

    public TileEntitySpellStrike(World par1World)
    {
        super(par1World);
    }

    public TileEntitySpellStrike(World par1World, EntityLivingBase par2EntityLivingBase, String strike)
    {
        super(par1World, par2EntityLivingBase);
        typeOfStrike = strike;
    }

    public TileEntitySpellStrike(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
        if (par1MovingObjectPosition.entityHit != null)
        {
            
        	byte b0 = 0;
        	
        	switch(typeOfStrike){
        	case "air":
        		b0 = 8;
        		break;
        	case "water":
        		b0 = 12;
        		break;
        	case "earth":
        		b0 = 16;
        		break;
        	case "fire":
        		b0 = 16;
        		break;
        		
        	}
            
            

            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)b0);
            if(typeOfStrike == "fire"){
            par1MovingObjectPosition.entityHit.setFire(5);
            }
        }

        for (int i = 0; i < 8; ++i)
        {
            //this.worldObj.spawnParticle("crit", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
    
    protected float getGravityVelocity()
    {
        return 0F;
    }
}
