package com.callumhutchy.runecraft2.blocks;

import handler.ExtendedPlayer;

import com.callumhutchy.runecraft2.Runecraft2;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityRCFurnace;
import com.callumhutchy.runecraft2.client.gui.GuiRCFurnace;
import com.callumhutchy.runecraft2.client.gui.GuiSpellBook;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
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
		ExtendedPlayer props = ExtendedPlayer.get(entity);
		props.currentRCFurnace = tileEntity;
		entity.openGui(Runecraft2.instance, GuiRCFurnace.GUI_ID, world,0, 0, 0);
		
		return true;
		
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
	{
	if (entity == null)
	{
	return;
	}

	TileEntityRCFurnace tile = (TileEntityRCFurnace) world.getTileEntity(x, y, z);
	
	int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.F) + 0.5D) & 3;


	if(l == 0) {
	world.setBlockMetadataWithNotify(x, y, z, 0, 2);
	tile.direction =0;
	}


	if(l == 1) {
	world.setBlockMetadataWithNotify(x, y, z, 1, 2);
	tile.direction =1;
	}


	if(l == 2) {
	world.setBlockMetadataWithNotify(x, y, z, 2, 2);
	tile.direction =2;
	}


	if(l == 3) {
	world.setBlockMetadataWithNotify(x, y, z, 3, 2);
	tile.direction =3;
	}


//	if(stack.hasDisplayName()) {
//	((TileEntityRCFurnace)world.getTileEntity(x, y, z)).setGuiDisplayName(stack.getDisplayName());
//	}
	}
	
	
	private void setDefaultDirection(World world, int x, int y, int z) {
		if(!world.isRemote) {
		Block b1 = world.getBlock(x, y, z - 1);
		Block b2 = world.getBlock(x, y, z + 1);
		Block b3 = world.getBlock(x - 1, y, z);
		Block b4 = world.getBlock(x + 1, y, z);


		byte b0 = 3;


		if(b1.func_149730_j() && !b2.func_149730_j()) {
		b0 = 3; 
		
		}


		if(b2.func_149730_j() && !b1.func_149730_j()) {
		b0 = 2; 
		}


		if(b3.func_149730_j() && !b4.func_149730_j()) {
		b0 = 5; 
		}


		if(b4.func_149730_j() && !b3.func_149730_j()) {
		b0 = 4; 
		}


		world.setBlockMetadataWithNotify(x, y, x, b0, 2);
		}


		} 
	
	public void onBlockAdded(World world, int x, int y, int z){
	super.onBlockAdded(world, x, y, z);
		this.setDefaultDirection(world, x, y, z);
	}
		
	
}
