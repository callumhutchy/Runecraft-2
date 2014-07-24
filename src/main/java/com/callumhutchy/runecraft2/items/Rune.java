package com.callumhutchy.runecraft2.items;

import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.callumhutchy.runecraft2.Runecraft2;

public class Rune extends BaseItem{

	public Rune(String unlocalisedName){
		this.setMaxStackSize(64);
		this.setCreativeTab(Runecraft2.tabRunecraft2Magic);
		this.setUnlocalizedName(unlocalisedName);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		
	}
	
}
