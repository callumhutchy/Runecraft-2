package com.callumhutchy.runecraft2.items;

import java.util.Set;

import com.callumhutchy.runecraft2.Runecraft2;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemTool;

public class Hatchet extends ItemAxe{

	protected Hatchet(ToolMaterial p_i45333_2_, String unlocalname) {
		super(p_i45333_2_);
		
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
