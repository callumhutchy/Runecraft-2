package uk.co.callumhutchy.runecraft2.spells;

import reference.Element;
import uk.co.callumhutchy.runecraft2.items.Items;;

public class Elements {

	public static Element air;
	public static Element water;
	public static Element earth;
	public static Element fire;
	
	public static void init(){
		air = new Element("air", Items.airRune);
		water = new Element("water", Items.waterRune);
		earth = new Element("earth", Items.earthRune);
		fire = new Element("fire", Items.fireRune);
		
	}
	
	
}
