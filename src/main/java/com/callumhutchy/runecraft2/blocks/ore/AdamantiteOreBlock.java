package com.callumhutchy.runecraft2.blocks.ore;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import com.callumhutchy.runecraft2.blocks.models.OreModel;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityAdamantiteOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityCopperOre;
import com.callumhutchy.runecraft2.items.Items;

import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class AdamantiteOreBlock extends OreBlock{

	private final OreModel model;
	
	
	public AdamantiteOreBlock(Material p_i45394_1_, String resourceLocation) {
		super(p_i45394_1_, resourceLocation);
		this.model = new OreModel();
	}
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		 return new TileEntityAdamantiteOre();
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Items.adamantiteOre;
    }
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch (type) {
	      case ENTITY:
	      case EQUIPPED:
	      case EQUIPPED_FIRST_PERSON:
	      case INVENTORY:
	        return true;
	      default:
	        return false;
	    }
	}
	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		 switch (type) {
	      case ENTITY: {
	        return (helper == ItemRendererHelper.ENTITY_BOBBING ||
	                helper == ItemRendererHelper.ENTITY_ROTATION ||
	                helper == ItemRendererHelper.BLOCK_3D);
	      }
	      case EQUIPPED: {
	        return (helper == ItemRendererHelper.BLOCK_3D ||
	                helper == ItemRendererHelper.EQUIPPED_BLOCK);
	      }
	      case EQUIPPED_FIRST_PERSON: {
	        return (helper == ItemRendererHelper.EQUIPPED_BLOCK);
	      }
	      case INVENTORY: {
	        return (helper == ItemRendererHelper.INVENTORY_BLOCK);
	      }
	      default: {
	        return false;
	      }
	    }
	}
	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		
		
	}
}
