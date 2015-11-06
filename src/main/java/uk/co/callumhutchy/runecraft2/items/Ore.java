package uk.co.callumhutchy.runecraft2.items;

import uk.co.callumhutchy.runecraft2.Runecraft2;

public class Ore extends BaseItem {
	public Ore(String unlocalisedName) {
	    super(unlocalisedName);
		this.setMaxStackSize(64);
		this.setCreativeTab(Runecraft2.tabRunecraft2Metal);
	}
}
