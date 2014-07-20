package com.callumhutchy.runecraft2.blocks.ore;

import java.util.Random;

import com.callumhutchy.runecraft2.Runecraft2;
import com.callumhutchy.runecraft2.blocks.renderer.ore.OreRenderer;
import com.callumhutchy.runecraft2.items.Items;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;

public abstract class OreBlock extends BlockContainer implements IItemRenderer{

	

	private int blockID;
	public Item itemToBeDropped;
	

	public OreBlock(Material p_i45394_1_, String resourceLocation) {
		super(p_i45394_1_);
		this.setCreativeTab(Runecraft2.tabRunecraft2Metal);
        this.setBlockBounds(0.0625F, 0F, 0.0625F, 0.9375F, 0.8125F, 0.9375F);
        this.setHardness(3F);
        this.setHarvestLevel("pickaxe", 1);
        
	}

	 

	//You don't want the normal render type, or it wont render properly.
	@Override
	public int getRenderType() {
	        return -1;
	}
	
	
	
	public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
	{
	   return false;
	}

	//And this tell it that you can see through this block, and neighbor blocks should be rendered.
	public boolean isOpaqueCube()
	{
	   return false;
	}



	

	
	



}
