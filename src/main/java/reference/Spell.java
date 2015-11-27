package reference;

import java.util.ArrayList;

import uk.co.callumhutchy.runecraft2.items.Rune;

public class Spell {
	protected int spellExp;
	protected int spellLevelRequirement;
	protected float spellDamage;
	protected ArrayList<Rune> runeCost;
	protected Element spellElement;
	/**
	 * 
	 *
	 * @param levelReq
	 * @param exp
	 * @param damage
	 */
	public Spell(int levelReq, int exp, int damage, ArrayList<Rune> rune, Element element){
		this.setSpellLevelRequirement(levelReq);
		this.setSpellExp(exp);
		this.setSpellDamage(damage); 
		this.setRuneCost(rune);
		this.setSpellElement(element);
		//System.out.println(runeCost.toString());
	}
/**
	 * @return the spellElement
	 */
	public Element getSpellElement() {
		return spellElement;
	}
	/**
	 * @param spellElement the spellElement to set
	 */
	public void setSpellElement(Element spellElement) {
		this.spellElement = spellElement;
	}
/**
	 * @return the runeCost
	 */
	public ArrayList<Rune> getRuneCost() {
		return runeCost;
	}
	/**
	 * @param runeCost the runeCost to set
	 */
	public Spell setRuneCost(ArrayList<Rune> runeCost) {
		this.runeCost = runeCost;
		return this;
	}
/**
 * 
 * @param levelReq
 * @param exp
 */
	public Spell(int levelReq, int exp, ArrayList<Rune> rune, Element element){
		this.setSpellLevelRequirement(levelReq);
		this.setSpellExp(exp);
		this.setRuneCost(rune);
		this.setSpellElement(element);
		
	}
	
	public Spell(int levelReq, int exp){
		this.spellLevelRequirement = levelReq;
		this.spellExp = exp;
		
	}
	
	/**
	 * @return the spellExp
	 */
	public int getSpellExp() {
		return spellExp;
	}

	/**
	 * @param spellExp the spellExp to set
	 */
	public Spell setSpellExp(int spellExp) {
		this.spellExp = spellExp;
		return this;
	}

	/**
	 * @return the spellLevelRequirement
	 */
	public int getSpellLevelRequirement() {
		return spellLevelRequirement;
	}

	/**
	 * @param spellLevelRequirement the spellLevelRequirement to set
	 */
	public Spell setSpellLevelRequirement(int spellLevelRequirement) {
		this.spellLevelRequirement = spellLevelRequirement;
		return this;
	}

	/**
	 * @return the spellDamage
	 */
	public float getSpellDamage() {
		return spellDamage;
	}

	/**
	 * @param spellDamage the spellDamage to set
	 */
	public Spell setSpellDamage(float spellDamage) {
		this.spellDamage = spellDamage;
		return this;
	}
	
}
