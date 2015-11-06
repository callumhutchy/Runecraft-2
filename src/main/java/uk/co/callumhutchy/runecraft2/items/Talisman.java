package uk.co.callumhutchy.runecraft2.items;

public class Talisman extends BaseMagicItem{

	public Talisman(String unlocalisedName, int maxSize) {
		super(unlocalisedName, maxSize);
		this.setMaxStackSize(maxSize);
		this.setUnlocalizedName(unlocalisedName);
	}

}
