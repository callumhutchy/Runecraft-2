package reference;

import net.minecraft.item.Item;

public class Element {
	public String element;
	public Item rune;
	
	public Element(String element, Item rune){
		this.element = element;
		this.rune = rune;
	}

	/**
	 * @return the element
	 */
	public String getElement() {
		return element;
	}

	/**
	 * @param element the element to set
	 */
	public void setElement(String element) {
		this.element = element;
	}

	/**
	 * @return the rune
	 */
	public Item getRune() {
		return rune;
	}

	/**
	 * @param rune the rune to set
	 */
	public void setRune(Item rune) {
		this.rune = rune;
	}
	
}
