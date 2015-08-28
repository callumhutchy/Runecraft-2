package com.callumhutchy.runecraft2.items;

import com.callumhutchy.runecraft2.Runecraft2;

public class Rune extends BaseItem {

    private String name = "defaultName";

    public Rune(String unlocalisedName) {
	super(unlocalisedName);

	this.setMaxStackSize(64);
	this.setCreativeTab(Runecraft2.tabRunecraft2Magic);

	this.setHasSubtypes(true);
	this.setMaxDamage(0);
	name = unlocalisedName;

    }

    public String getName() {

	return name;
    }

}
