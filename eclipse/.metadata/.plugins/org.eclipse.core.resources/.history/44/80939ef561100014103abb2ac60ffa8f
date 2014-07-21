package com.callumhutchy.runecraft2.blocks;

import java.util.Random;

import reference.Reference;

import com.callumhutchy.runecraft2.Runecraft2;
import com.callumhutchy.runecraft2.blocks.models.AltarModel;
import com.callumhutchy.runecraft2.blocks.models.OreModel;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityAltar;
import com.callumhutchy.runecraft2.items.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Altar extends BlockContainer {

	public Item itemToBeDropped;
	private AltarModel model;
	public String tileEntityClass;
	
	protected Altar(Material p_i45386_1_,String textureName, String unlocalisedName, Item item, String tileEntity) {
		super(p_i45386_1_);
		this.setCreativeTab(Runecraft2.tabRunecraft2Magic);
		this.setBlockName(unlocalisedName);
		this.setBlockTextureName(textureName);
		itemToBeDropped = item;
		tileEntityClass = tileEntity;
		this.model = new AltarModel();
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
    
   
    
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
		return itemToBeDropped;
    }
    
    @SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}

	
}
