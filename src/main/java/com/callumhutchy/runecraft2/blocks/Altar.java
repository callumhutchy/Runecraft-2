package com.callumhutchy.runecraft2.blocks;

import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityAltar;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Altar extends BlockContainer {

	protected Altar(Material p_i45386_1_) {
		super(p_i45386_1_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		// TODO Auto-generated method stub
		return new TileEntityAltar();
	}

	@Override
    public int getRenderType() {
            return -1;
    }
    
    //It's not an opaque cube, so you need this.
    @Override
    public boolean isOpaqueCube() {
            return false;
    }
    
    //It's not a normal block, so you need this too.
    public boolean renderAsNormalBlock() {
            return false;
    }
    
    //This is the icon to use for showing the block in your hand.
    public void registerIcons(IIconRegister icon) {
            this.blockIcon = icon.registerIcon("runecraft2:AltarTexture");
    }
	
}
