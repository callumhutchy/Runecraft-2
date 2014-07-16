package com.callumhutchy.runecraft2.items;

import com.callumhutchy.runecraft2.Runecraft2;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import reference.ItemNames;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Items {

	
	//Runes
	public static Item airRune;
	public static Item armadylRune;
	public static Item astralRune;
	public static Item bloodRune;
	public static Item bodyRune;
	public static Item chaosRune;
	public static Item cosmicRune;
	public static Item deathRune;
	public static Item dustRune;
	public static Item earthRune;
	public static Item fireRune;
	public static Item lavaRune;
	public static Item lawRune;
	public static Item mindRune;
	public static Item mistRune;
	public static Item mudRune;
	public static Item natureRune;
	public static Item smokeRune;
	public static Item soulRune;
	public static Item steamRune;
	public static Item waterRune;
	
	
	//Talismans
	public static Item airTalisman;
	
	//Ores
	public static Item adamantiteOre;
	public static Item coalOre;
	public static Item copperOre;
	public static Item goldOre;
	public static Item ironOre;
	public static Item mithrilOre;
	public static Item runiteOre;
	public static Item silverOre;
	public static Item tinOre;
	
	
	
	
	public static void init(){
		//Runes
		airRune = new Rune().setUnlocalizedName(ItemNames.AirRune_Unlo);
		armadylRune = new Rune().setUnlocalizedName(ItemNames.ArmadylRune_Unlo);
		astralRune = new Rune().setUnlocalizedName(ItemNames.AstralRune_Unlo);
		bloodRune = new Rune().setUnlocalizedName(ItemNames.BloodRune_Unlo);
		bodyRune = new Rune().setUnlocalizedName(ItemNames.BodyRune_Unlo);
		chaosRune = new Rune().setUnlocalizedName(ItemNames.ChaosRune_Unlo);
		cosmicRune = new Rune().setUnlocalizedName(ItemNames.CosmicRune_Unlo);
		deathRune = new Rune().setUnlocalizedName(ItemNames.DeathRune_Unlo);
		dustRune = new Rune().setUnlocalizedName(ItemNames.DustRune_Unlo);
		earthRune = new Rune().setUnlocalizedName(ItemNames.EarthRune_Unlo);
		fireRune = new Rune().setUnlocalizedName(ItemNames.FireRune_Unlo);
		lavaRune = new Rune().setUnlocalizedName(ItemNames.LavaRune_Unlo);
		lawRune = new Rune().setUnlocalizedName(ItemNames.LawRune_Unlo);
		mindRune = new Rune().setUnlocalizedName(ItemNames.MindRune_Unlo);
		mistRune = new Rune().setUnlocalizedName(ItemNames.MistRune_Unlo);
		mudRune = new Rune().setUnlocalizedName(ItemNames.MudRune_Unlo);
		natureRune = new Rune().setUnlocalizedName(ItemNames.NatureRune_Unlo);
		smokeRune = new Rune().setUnlocalizedName(ItemNames.SmokeRune_Unlo);
		soulRune = new Rune().setUnlocalizedName(ItemNames.SoulRune_Unlo);
		steamRune = new Rune().setUnlocalizedName(ItemNames.SteamRune_Unlo);
		waterRune = new Rune().setUnlocalizedName(ItemNames.WaterRune_Unlo);
		//Talismans
		airTalisman = new BaseItem().setUnlocalizedName(ItemNames.AirTalisman_Unlo).setCreativeTab(Runecraft2.tabRunecraft2Magic);
		
		
		//Ores
		adamantiteOre = new Ore().setUnlocalizedName(ItemNames.AdamantiteOre_Unlo);
		coalOre = new Ore().setUnlocalizedName(ItemNames.CoalOre_Unlo);
		copperOre = new Ore().setUnlocalizedName(ItemNames.CopperOre_Unlo);
		goldOre = new Ore().setUnlocalizedName(ItemNames.GoldOre_Unlo);
		ironOre = new Ore().setUnlocalizedName(ItemNames.IronOre_Unlo);
		mithrilOre = new Ore().setUnlocalizedName(ItemNames.MithrilOre_Unlo);
		runiteOre = new Ore().setUnlocalizedName(ItemNames.RuniteOre_Unlo);
		silverOre = new Ore().setUnlocalizedName(ItemNames.SilverOre_Unlo);
		tinOre = new Ore().setUnlocalizedName(ItemNames.TinOre_Unlo);
		
	}
	

	
	
	public static void gameRegistery(){
		//Runes
		GameRegistry.registerItem(airRune, airRune.getUnlocalizedName());
		GameRegistry.registerItem(armadylRune, armadylRune.getUnlocalizedName());
		GameRegistry.registerItem(astralRune, astralRune.getUnlocalizedName());
		GameRegistry.registerItem(bloodRune, bloodRune.getUnlocalizedName());
		GameRegistry.registerItem(bodyRune, bodyRune.getUnlocalizedName());
		GameRegistry.registerItem(chaosRune, chaosRune.getUnlocalizedName());
		GameRegistry.registerItem(cosmicRune, cosmicRune.getUnlocalizedName());
		GameRegistry.registerItem(deathRune, deathRune.getUnlocalizedName());
		GameRegistry.registerItem(dustRune, dustRune.getUnlocalizedName());
		GameRegistry.registerItem(earthRune, earthRune.getUnlocalizedName());
		GameRegistry.registerItem(fireRune, fireRune.getUnlocalizedName());
		GameRegistry.registerItem(lavaRune, lavaRune.getUnlocalizedName());
		GameRegistry.registerItem(lawRune, lawRune.getUnlocalizedName());
		GameRegistry.registerItem(mindRune, mindRune.getUnlocalizedName());
		GameRegistry.registerItem(mistRune, mistRune.getUnlocalizedName());
		GameRegistry.registerItem(mudRune, mudRune.getUnlocalizedName());
		GameRegistry.registerItem(natureRune, natureRune.getUnlocalizedName());
		GameRegistry.registerItem(smokeRune, smokeRune.getUnlocalizedName());
		GameRegistry.registerItem(soulRune, soulRune.getUnlocalizedName());
		GameRegistry.registerItem(steamRune, steamRune.getUnlocalizedName());
		GameRegistry.registerItem(waterRune, waterRune.getUnlocalizedName());
		
		
		//Talismans
		GameRegistry.registerItem(airTalisman, airTalisman.getUnlocalizedName());
		
		//Ores
		GameRegistry.registerItem(adamantiteOre, adamantiteOre.getUnlocalizedName());
		GameRegistry.registerItem(coalOre, coalOre.getUnlocalizedName());
		GameRegistry.registerItem(copperOre, copperOre.getUnlocalizedName());
		GameRegistry.registerItem(goldOre, goldOre.getUnlocalizedName());
		GameRegistry.registerItem(ironOre, ironOre.getUnlocalizedName());
		GameRegistry.registerItem(mithrilOre, mithrilOre.getUnlocalizedName());
		GameRegistry.registerItem(runiteOre, runiteOre.getUnlocalizedName());
		GameRegistry.registerItem(silverOre, silverOre.getUnlocalizedName());
		GameRegistry.registerItem(tinOre, tinOre.getUnlocalizedName());
		
		
	}
	
	
	public static void craftingRecipes(){
		GameRegistry.addShapelessRecipe(new ItemStack(airTalisman), airRune, Item.getItemById(280));
		
		
	}
	
}
