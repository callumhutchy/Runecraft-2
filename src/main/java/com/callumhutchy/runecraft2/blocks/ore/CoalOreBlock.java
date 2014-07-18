package com.callumhutchy.runecraft2.blocks.ore;

import java.util.Random;

import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityAdamantiteOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityCoalOre;
import com.callumhutchy.runecraft2.items.Items;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class CoalOreBlock extends OreBlock {

	public CoalOreBlock(Material p_i45394_1_, String resourceLocation) {
		super(p_i45394_1_, resourceLocation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		 return new TileEntityCoalOre();
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_, Item itemDropped)
    {
        return Items.coalOre;
    }
}