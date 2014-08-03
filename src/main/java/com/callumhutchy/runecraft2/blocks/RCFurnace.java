package com.callumhutchy.runecraft2.blocks;

import com.callumhutchy.runecraft2.Runecraft2;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityRCFurnace;
import com.callumhutchy.runecraft2.client.gui.GuiRCFurnace;
import com.callumhutchy.runecraft2.client.gui.GuiSpellBook;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class RCFurnace extends BlockContainer {

	protected RCFurnace(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setCreativeTab(Runecraft2.tabRunecraft2Metal);
	}

	
	@Override
	public int getRenderType() {
		return -1;
	}

	// It's not an opaque cube, so you need this.
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	// It's not a normal block, so you need this too.
	public boolean renderAsNormalBlock() {
		return false;
	}
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityRCFurnace();
		
	}
	
	public boolean onBlockActivated(World world, int varx, int vary, int varz, EntityPlayer entity, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		
		TileEntityRCFurnace tileEntity = (TileEntityRCFurnace) world.getTileEntity(varx, vary, varz);
		
		entity.openGui(Runecraft2.instance, GuiRCFurnace.GUI_ID, world,0, 0, 0);
		
		return true;
		
	}
	
}