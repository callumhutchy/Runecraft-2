package com.callumhutchy.runecraft2.items;

import com.callumhutchy.runecraft2.Runecraft2;

public class Rune extends BaseItem{

	public Rune(String unlocalisedName){
		this.setMaxStackSize(64);
		this.setCreativeTab(Runecraft2.tabRunecraft2Magic);
		this.setUnlocalizedName(unlocalisedName);
	}
	
}
