/**
 * 
 */
package uk.co.callumhutchy.runecraft2.spells;

import java.util.ArrayList;

import com.google.common.util.concurrent.Runnables;

import reference.Element;
import reference.Spell;
import uk.co.callumhutchy.runecraft2.items.Items;
import uk.co.callumhutchy.runecraft2.items.Rune;

/**
 * @author Callum
 *
 */
public class Spells {

	// Strike
	public static Spell airStrike;
	public static Spell waterStrike;
	public static Spell earthStrike;
	public static Spell fireStrike;

	// Bolt
	public static Spell airBolt;
	public static Spell waterBolt;
	public static Spell earthBolt;
	public static Spell fireBolt;

	// Blast
	public static Spell airBlast;
	public static Spell waterBlast;
	public static Spell earthBlast;
	public static Spell fireBlast;

	// Wave
	public static Spell airWave;
	public static Spell waterWave;
	public static Spell earthWave;
	public static Spell fireWave;

	// Surge
	public static Spell airSurge;
	public static Spell waterSurge;
	public static Spell earthSurge;
	public static Spell fireSurge;

	// Teleport
	public static Spell homeTeleport;
	
	//Misc
	public static Spell earthPillar;

	public static void init() {

		// Strike
		airStrike = new Spell(1, 5, 48, addRuneToArray((Rune) Items.airRune, new ArrayList<Rune>()), Elements.air);
		waterStrike = new Spell(5, 7, 48, addRuneToArray((Rune) Items.waterRune, new ArrayList<Rune>()), Elements.water);
		earthStrike = new Spell(9, 9, 86, addRuneToArray((Rune) Items.earthRune, new ArrayList<Rune>()), Elements.earth);
		fireStrike = new Spell(13, 11, 124, addRuneToArray((Rune) Items.fireRune, new ArrayList<Rune>()), Elements.fire);
		// Bolt
		airBolt = new Spell(17, 13, 163, addRuneToArray((Rune) Items.airRune, addRuneToArray((Rune) Items.airRune, new ArrayList<Rune>())), Elements.air);
		waterBolt = new Spell(23, 16, 220, addRuneToArray((Rune) Items.waterRune, addRuneToArray((Rune) Items.waterRune, new ArrayList<Rune>())), Elements.water);
		earthBolt = new Spell(29, 19, 278, addRuneToArray((Rune) Items.earthRune, addRuneToArray((Rune) Items.earthRune, new ArrayList<Rune>())), Elements.earth);
		fireBolt = new Spell(35, 22, 336, addRuneToArray((Rune) Items.fireRune, addRuneToArray((Rune) Items.fireRune, new ArrayList<Rune>())), Elements.fire);
		// Blast
		airBlast = new Spell(41, 25, 393, addRuneToArray((Rune) Items.airRune, addRuneToArray((Rune) Items.airRune, addRuneToArray((Rune) Items.airRune, new ArrayList<Rune>()))), Elements.air);
		waterBlast = new Spell(47, 28, 451, addRuneToArray((Rune) Items.waterRune, addRuneToArray((Rune) Items.waterRune, addRuneToArray((Rune) Items.waterRune, new ArrayList<Rune>()))), Elements.water);
		earthBlast = new Spell(53, 31, 508, addRuneToArray((Rune) Items.earthRune, addRuneToArray((Rune) Items.earthRune, addRuneToArray((Rune) Items.earthRune, new ArrayList<Rune>()))), Elements.earth);
		fireBlast = new Spell(59, 34, 566, addRuneToArray((Rune) Items.fireRune, addRuneToArray((Rune) Items.fireRune, addRuneToArray((Rune) Items.fireRune, new ArrayList<Rune>()))), Elements.fire);
		// Wave
		airWave = new Spell(62, 36, 595,
			addRuneToArray((Rune) Items.airRune, addRuneToArray((Rune) Items.airRune, addRuneToArray((Rune) Items.airRune, addRuneToArray((Rune) Items.airRune, new ArrayList<Rune>())))), Elements.air);
		waterWave = new Spell(65, 37, 624,
			addRuneToArray((Rune) Items.waterRune, addRuneToArray((Rune) Items.waterRune, addRuneToArray((Rune) Items.waterRune, addRuneToArray((Rune) Items.waterRune, new ArrayList<Rune>())))), Elements.water);
		earthWave = new Spell(70, 40, 672,
			addRuneToArray((Rune) Items.earthRune, addRuneToArray((Rune) Items.earthRune, addRuneToArray((Rune) Items.earthRune, addRuneToArray((Rune) Items.earthRune, new ArrayList<Rune>())))), Elements.earth);
		fireWave = new Spell(75, 42, 720,
			addRuneToArray((Rune) Items.fireRune, addRuneToArray((Rune) Items.fireRune, addRuneToArray((Rune) Items.fireRune, addRuneToArray((Rune) Items.fireRune, new ArrayList<Rune>())))), Elements.fire);
		// Surge
		airSurge = new Spell(81, 75, 864, addRuneToArray((Rune) Items.airRune,
			addRuneToArray((Rune) Items.airRune, addRuneToArray((Rune) Items.airRune, addRuneToArray((Rune) Items.airRune, addRuneToArray((Rune) Items.airRune, new ArrayList<Rune>()))))), Elements.air);
		waterSurge = new Spell(85, 80, 768, addRuneToArray((Rune) Items.waterRune,
			addRuneToArray((Rune) Items.waterRune, addRuneToArray((Rune) Items.waterRune, addRuneToArray((Rune) Items.waterRune, addRuneToArray((Rune) Items.waterRune, new ArrayList<Rune>()))))), Elements.water);
		earthSurge = new Spell(90, 85, 768, addRuneToArray((Rune) Items.earthRune,
			addRuneToArray((Rune) Items.earthRune, addRuneToArray((Rune) Items.earthRune, addRuneToArray((Rune) Items.earthRune, addRuneToArray((Rune) Items.earthRune, new ArrayList<Rune>()))))), Elements.earth);
		fireSurge = new Spell(95, 90, 768, addRuneToArray((Rune) Items.fireRune,
			addRuneToArray((Rune) Items.fireRune, addRuneToArray((Rune) Items.fireRune, addRuneToArray((Rune) Items.fireRune, addRuneToArray((Rune) Items.fireRune, new ArrayList<Rune>()))))), Elements.fire);
		// Teleport
		homeTeleport = new Spell(0, 0);

		//Misc
		earthPillar = new Spell(15, 12, addRuneToArray((Rune) Items.earthRune, addRuneToArray((Rune) Items.earthRune, addRuneToArray((Rune) Items.earthRune, new ArrayList<Rune>()))), Elements.earth);
		
	}

	public static ArrayList<Rune> addRuneToArray(Rune rune, ArrayList<Rune> currentArray) {
		//System.out.println("Adding " + rune.toString());
		currentArray.add(rune);
		return currentArray;
	}

}
