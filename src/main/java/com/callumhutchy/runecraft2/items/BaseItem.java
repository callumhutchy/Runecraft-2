package com.callumhutchy.runecraft2.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class BaseItem extends Item {

	public BaseItem(){
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
	itemIcon = iconRegister.registerIcon("runecraft2:" + getUnlocalizedName().substring(5).toLowerCase());
	}
}
