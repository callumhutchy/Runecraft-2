package com.callumhutchy.runecraft2.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import reference.ItemNames;
import net.minecraft.item.Item;

public class Items {

	public static Item airRune;
	
	public static void init(){
		airRune = new Rune().setUnlocalizedName(ItemNames.AirRune_Unlo);
		
		
		
	}
	
	
	@SuppressWarnings("deprecation")
	public static void addNames(){
		//Runes
		LanguageRegistry.addName(airRune, ItemNames.AirRune_Lo);
		
		
	}
	
	
	public static void gameRegistery(){
		//Runes
		GameRegistry.registerItem(airRune, airRune.getUnlocalizedName());
		
	}
	
	
	public static void craftingRecipes(){
		
		
		
	}
	
}
