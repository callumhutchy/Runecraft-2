package com.callumhutchy.runecraft2.items;

import net.minecraft.item.ItemAxe;

import com.callumhutchy.runecraft2.Runecraft2;

public class Hatchet extends ItemAxe {

	protected Hatchet(ToolMaterial p_i45333_2_, String unlocalname) {
		super(p_i45333_2_);

		this.setUnlocalizedName(unlocalname);
		this.setMaxStackSize(1);
		this.setCreativeTab(Runecraft2.tabRunecraft2Tools);
	}



}
