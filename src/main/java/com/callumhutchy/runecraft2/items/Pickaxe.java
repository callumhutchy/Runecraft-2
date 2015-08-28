package com.callumhutchy.runecraft2.items;

import net.minecraft.item.ItemPickaxe;

import com.callumhutchy.runecraft2.Runecraft2;

public class Pickaxe extends ItemPickaxe{

	protected Pickaxe(ToolMaterial p_i45347_1_, String unlocalname) {
		super(p_i45347_1_);
		this.setUnlocalizedName(unlocalname);
		this.setMaxStackSize(1);
		this.setCreativeTab(Runecraft2.tabRunecraft2Tools);
	}
	
	
}
