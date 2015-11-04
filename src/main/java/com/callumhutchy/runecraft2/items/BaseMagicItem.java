package com.callumhutchy.runecraft2.items;

import com.callumhutchy.runecraft2.Runecraft2;

public class BaseMagicItem extends BaseItem {
	public BaseMagicItem(String unlocalisedName, int maxSize) {
	    super(unlocalisedName);
		this.setMaxStackSize(maxSize);
		this.setCreativeTab(Runecraft2.tabRunecraft2Magic);
		
	}
}
