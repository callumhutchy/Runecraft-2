package uk.co.callumhutchy.runecraft2.items;

import uk.co.callumhutchy.runecraft2.Runecraft2;

public class Bar extends BaseItem{

    public Bar(String unlocalisedName) {
	super(unlocalisedName);
	this.setMaxStackSize(64);
	this.setCreativeTab(Runecraft2.tabRunecraft2Metal);
    }
	
}
