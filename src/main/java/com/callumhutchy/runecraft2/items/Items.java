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
	
	public static Item runeEssence;
	public static Item pureEssence;
	
	//Talismans
	public static Item airTalisman;
	public static Item waterTalisman;
	public static Item fireTalisman;
	public static Item earthTalisman;
	public static Item mindTalisman;
	public static Item bodyTalisman;
	public static Item cosmicTalisman;
	public static Item chaosTalisman;
	public static Item natureTalisman;
	public static Item lawTalisman;
	public static Item deathTalisman;
	
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
		airRune = new Rune(ItemNames.AirRune_Unlo);
		armadylRune = new Rune(ItemNames.ArmadylRune_Unlo);
		astralRune = new Rune(ItemNames.AstralRune_Unlo);
		bloodRune = new Rune(ItemNames.BloodRune_Unlo);
		bodyRune = new Rune(ItemNames.BodyRune_Unlo);
		chaosRune = new Rune(ItemNames.ChaosRune_Unlo);
		cosmicRune = new Rune(ItemNames.CosmicRune_Unlo);
		deathRune = new Rune(ItemNames.DeathRune_Unlo);
		dustRune = new Rune(ItemNames.DustRune_Unlo);
		earthRune = new Rune(ItemNames.EarthRune_Unlo);
		fireRune = new Rune(ItemNames.FireRune_Unlo);
		lavaRune = new Rune(ItemNames.LavaRune_Unlo);
		lawRune = new Rune(ItemNames.LawRune_Unlo);
		mindRune = new Rune(ItemNames.MindRune_Unlo);
		mistRune = new Rune(ItemNames.MistRune_Unlo);
		mudRune = new Rune(ItemNames.MudRune_Unlo);
		natureRune = new Rune(ItemNames.NatureRune_Unlo);
		smokeRune = new Rune(ItemNames.SmokeRune_Unlo);
		soulRune = new Rune(ItemNames.SoulRune_Unlo);
		steamRune = new Rune(ItemNames.SteamRune_Unlo);
		waterRune = new Rune(ItemNames.WaterRune_Unlo);
		
		runeEssence = new Rune(ItemNames.RuneEssence_Unlo);
		pureEssence = new Rune(ItemNames.PureEssence_Unlo);
		//Talismans
		airTalisman = new BaseMagicItem(ItemNames.AirTalisman_Unlo, 1);
		waterTalisman = new BaseMagicItem(ItemNames.WaterTalisman_Unlo, 1);
		fireTalisman = new BaseMagicItem(ItemNames.FireTalisman_Unlo, 1);
		earthTalisman = new BaseMagicItem(ItemNames.EarthTalisman_Unlo, 1);
		mindTalisman = new BaseMagicItem(ItemNames.MindTalisman_Unlo, 1);
		bodyTalisman = new BaseMagicItem(ItemNames.BodyTalisman_Unlo, 1);
		cosmicTalisman = new BaseMagicItem(ItemNames.CosmicTalisman_Unlo, 1);
		chaosTalisman = new BaseMagicItem(ItemNames.ChaosTalisman_Unlo, 1);
		natureTalisman = new BaseMagicItem(ItemNames.NatureTalisman_Unlo, 1);
		lawTalisman = new BaseMagicItem(ItemNames.LawTalisman_Unlo, 1);
		deathTalisman = new BaseMagicItem(ItemNames.DeathTalisman_Unlo, 1);
		
		
		
		
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
		
		GameRegistry.registerItem(runeEssence, runeEssence.getUnlocalizedName());
		GameRegistry.registerItem(pureEssence, pureEssence.getUnlocalizedName());
		
		//Talismans
		GameRegistry.registerItem(airTalisman, airTalisman.getUnlocalizedName());
		GameRegistry.registerItem(waterTalisman, waterTalisman.getUnlocalizedName());
		GameRegistry.registerItem(fireTalisman, fireTalisman.getUnlocalizedName());
		GameRegistry.registerItem(earthTalisman, earthTalisman.getUnlocalizedName());
		GameRegistry.registerItem(mindTalisman, mindTalisman.getUnlocalizedName());
		GameRegistry.registerItem(bodyTalisman, bodyTalisman.getUnlocalizedName());
		GameRegistry.registerItem(cosmicTalisman, cosmicTalisman.getUnlocalizedName());
		GameRegistry.registerItem(chaosTalisman, chaosTalisman.getUnlocalizedName());
		GameRegistry.registerItem(natureTalisman, natureTalisman.getUnlocalizedName());
		GameRegistry.registerItem(lawTalisman, lawTalisman.getUnlocalizedName());
		GameRegistry.registerItem(deathTalisman, deathTalisman.getUnlocalizedName());
		
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
		//Talismans
		GameRegistry.addShapelessRecipe(new ItemStack(airTalisman), airRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(waterTalisman), waterRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(fireTalisman), fireRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(earthTalisman), earthRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(mindTalisman), mindRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(bodyTalisman), bodyRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(cosmicTalisman), cosmicRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(chaosTalisman), chaosRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(natureTalisman), natureRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(lawTalisman), lawRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(deathTalisman), deathRune, Item.getItemById(280));
		
	}
	
}
