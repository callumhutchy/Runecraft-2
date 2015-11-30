package reference;

import net.minecraft.item.Item;
import uk.co.callumhutchy.runecraft2.items.Rune;

public class Element {
	public String element;
	public Rune rune;
	
	public Element(String element, Rune rune){
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
	public Rune getRune() {
		return rune;
	}

	/**
	 * @param rune the rune to set
	 */
	public void setRune(Rune rune) {
		this.rune = rune;
	}
	
}
