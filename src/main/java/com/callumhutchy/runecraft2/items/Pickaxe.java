package com.callumhutchy.runecraft2.items;

import com.callumhutchy.runecraft2.Runecraft2;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;

public class Pickaxe extends ItemPickaxe{

	protected Pickaxe(ToolMaterial p_i45347_1_, String unlocalname) {
		super(p_i45347_1_);
		this.setUnlocalizedName(unlocalname);
		this.setMaxStackSize(1);
		this.setCreativeTab(Runecraft2.tabRunecraft2Tools);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
	itemIcon = iconRegister.registerIcon("runecraft2:" + getUnlocalizedName().substring(5).toLowerCase());
	}
	
}
