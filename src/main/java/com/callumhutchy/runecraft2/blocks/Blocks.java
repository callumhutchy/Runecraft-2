package com.callumhutchy.runecraft2.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import reference.BlockNames;
import reference.Reference;

import com.callumhutchy.runecraft2.items.Items;

public class Blocks {

	public static Random	random;

	// Altar

	// No soul altar not in RS
	public static Block		AirAltar, WaterAltar, FireAltar, EarthAltar,
			MindAltar, BodyAltar, CosmicAltar, ChaosAltar, NatureAltar,
			LawAltar, DeathAltar, BloodAltar, AstralAltar;

	public static Block		AirRuneAltar, WaterRuneAltar, FireRuneAltar,
			EarthRuneAltar, MindRuneAltar, BodyRuneAltar, CosmicRuneAltar,
			ChaosRuneAltar, NatureRuneAltar, LawRuneAltar, DeathRuneAltar,
			BloodRuneAltar, AstralRuneAltar;

	// Ores
	public static Block		CopperOre, TinOre, AdamantiteOre, CoalOre, GoldOre,
			IronOre, MithrilOre, RuniteOre, SilverOre;

	public static Block		RuneEssenceOre, PureEssenceOre;
	
	public static Block RCFurnace, Anvil;


	public static void init() {
		// Altar

		AirAltar = new Altar(Material.rock, "runecraft2:textures/blocks/airaltar.png", BlockNames.AirAltar_Unlo, "airaltar");
		WaterAltar = new Altar(Material.rock, "runecraft2:textures/blocks/wateraltar.png", BlockNames.WaterAltar_Unlo, "wateraltar");
		FireAltar = new Altar(Material.rock, "runecraft2:textures/blocks/firealtar.png", BlockNames.FireAltar_Unlo, "firealtar");
		EarthAltar = new Altar(Material.rock, "runecraft2:textures/blocks/earthaltar.png", BlockNames.EarthAltar_Unlo, "earthaltar");
		MindAltar = new Altar(Material.rock, "runecraft2:textures/blocks/mindaltar.png", BlockNames.MindAltar_Unlo, "mindaltar");
		BodyAltar = new Altar(Material.rock, "runecraft2:textures/blocks/bodyaltar.png", BlockNames.BodyAltar_Unlo, "bodyaltar");
		CosmicAltar = new Altar(Material.rock, "runecraft2:textures/blocks/cosmicaltar.png", BlockNames.CosmicAltar_Unlo, "cosmicaltar");
		ChaosAltar = new Altar(Material.rock, "runecraft2:textures/blocks/chaosaltar.png", BlockNames.ChaosAltar_Unlo, "chaosaltar");
		NatureAltar = new Altar(Material.rock, "runecraft2:textures/blocks/naturealtar.png", BlockNames.NatureAltar_Unlo, "naturealtar");
		LawAltar = new Altar(Material.rock, "runecraft2:textures/blocks/lawaltar.png", BlockNames.LawAltar_Unlo, "lawaltar");
		DeathAltar = new Altar(Material.rock, "runecraft2:textures/blocks/deathaltar.png", BlockNames.DeathAltar_Unlo, "deathaltar");
		BloodAltar = new Altar(Material.rock, "runecraft2:textures/blocks/bloodaltar.png", BlockNames.BloodAltar_Unlo, "bloodaltar");
		AstralAltar = new Altar(Material.rock, "runecraft2:textures/blocks/astralaltar.png", BlockNames.AstralAltar_Unlo, "astralaltar");

		AirRuneAltar = new Altar(Material.rock, "runecraft2:textures/blocks/airrunealtar.png", BlockNames.AirRuneAltar_Unlo, "airrunealtar");
		WaterRuneAltar = new Altar(Material.rock, "runecraft2:textures/blocks/waterrunealtar.png", BlockNames.WaterRuneAltar_Unlo, "waterrunealtar");
		FireRuneAltar = new Altar(Material.rock, "runecraft2:textures/blocks/firerunealtar.png", BlockNames.FireRuneAltar_Unlo, "firerunealtar");
		EarthRuneAltar = new Altar(Material.rock, "runecraft2:textures/blocks/earthrunealtar.png", BlockNames.EarthRuneAltar_Unlo, "earthrunealtar");
		MindRuneAltar = new Altar(Material.rock, "runecraft2:textures/blocks/mindrunealtar.png", BlockNames.MindRuneAltar_Unlo, "mindrunealtar");
		BodyRuneAltar = new Altar(Material.rock, "runecraft2:textures/blocks/bodyrunealtar.png", BlockNames.BodyRuneAltar_Unlo, "bodyrunealtar");
		CosmicRuneAltar = new Altar(Material.rock, "runecraft2:textures/blocks/cosmicrunealtar.png", BlockNames.CosmicRuneAltar_Unlo, "cosmicrunealtar");
		ChaosRuneAltar = new Altar(Material.rock, "runecraft2:textures/blocks/chaosrunealtar.png", BlockNames.ChaosRuneAltar_Unlo, "chaosrunealtar");
		NatureRuneAltar = new Altar(Material.rock, "runecraft2:textures/blocks/naturerunealtar.png", BlockNames.NatureRuneAltar_Unlo, "naturerunealtar");
		LawRuneAltar = new Altar(Material.rock, "runecraft2:textures/blocks/lawrunealtar.png", BlockNames.LawRuneAltar_Unlo, "lawrunealtar");
		DeathRuneAltar = new Altar(Material.rock, "runecraft2:textures/blocks/deathrunealtar.png", BlockNames.DeathRuneAltar_Unlo, "deathrunealtar");
		BloodRuneAltar = new Altar(Material.rock, "runecraft2:textures/blocks/bloodrunealtar.png", BlockNames.BloodRuneAltar_Unlo, "bloodrunealtar");
		AstralRuneAltar = new Altar(Material.rock, "runecraft2:textures/blocks/astralrunealtar.png", BlockNames.AstralRuneAltar_Unlo, "astralrunealtar");

		// Ores
		CopperOre = new OreBlock(Material.rock, "runecraft2:textures/blocks/copperore.png", BlockNames.CopperOre_Unlo, Items.copperOre, 0, 1, 1, "copperore");
		TinOre = new OreBlock(Material.rock, "runecraft2:textures/blocks/tinore.png", BlockNames.TinOre_Unlo, Items.tinOre, 0,1,1, "tinore");
		AdamantiteOre = new OreBlock(Material.rock, "runecraft2:textures/blocks/adamantiteore.png", BlockNames.AdamantiteOre_Unlo, Items.adamantiteOre, 0,1,1,  "adamantiteore");
		CoalOre = new OreBlock(Material.rock, "runecraft2:textures/blocks/coalore.png", BlockNames.CoalOre_Unlo, Items.coalOre,  0,1,1, "coalore");
		GoldOre = new OreBlock(Material.rock, "runecraft2:textures/blocks/goldore.png", BlockNames.GoldOre_Unlo, Items.goldOre,  0,1,1, "goldore");
		IronOre = new OreBlock(Material.rock, "runecraft2:textures/blocks/ironore.png", BlockNames.IronOre_Unlo, Items.ironOre,  0,1,1, "ironore");
		MithrilOre = new OreBlock(Material.rock, "runecraft2:textures/blocks/mithrilore.png", BlockNames.MithrilOre_Unlo, Items.mithrilOre, 0,1,1,  "mithrilore");
		RuniteOre = new OreBlock(Material.rock, "runecraft2:textures/blocks/runiteore.png", BlockNames.RuniteOre_Unlo, Items.runiteOre, 0,1,1,  "runiteore");
		SilverOre = new OreBlock(Material.rock, "runecraft2:textures/blocks/silverore.png", BlockNames.SilverOre_Unlo, Items.silverOre, 0,1,1,  "silverore");

		RuneEssenceOre = new OreBlock(Material.rock, "runecraft2:textures/blocks/runeessenceore.png", BlockNames.RuneEssenceOre_Unlo, Items.runeEssence, 0,2,4,  "runeessenceore");
		PureEssenceOre = new OreBlock(Material.rock, "runecraft2:textures/blocks/pureessenceore.png", BlockNames.PureEssenceOre_Unlo, Items.pureEssence,  0,2,4, "pureessenceore");

		RCFurnace = new RCFurnace(Material.iron, BlockNames.RCFurnace_Unlo);
		Anvil= new Anvil(Material.iron, BlockNames.Anvil_Unlo);
		
	
	}

	public static void registerRenders(){
		registerRender(CopperOre);
		registerRender(TinOre);
		registerRender(AdamantiteOre);
		registerRender(CoalOre);
		registerRender(GoldOre);
		registerRender(IronOre);
		registerRender(MithrilOre);
		registerRender(RuniteOre);
		registerRender(SilverOre);
		
		registerRender(RuneEssenceOre);
		registerRender(PureEssenceOre);
		
		registerRender(RCFurnace);
		registerRender(Anvil);
		
		registerRender(AirAltar);
		registerRender(WaterAltar);
		registerRender(FireAltar);
		registerRender(EarthAltar);
		registerRender(MindAltar);
		registerRender(BodyAltar);
		registerRender(CosmicAltar);
		registerRender(ChaosAltar);
		registerRender(NatureAltar);
		registerRender(LawAltar);
		registerRender(DeathAltar);
		registerRender(BloodAltar);
		registerRender(AstralAltar);
		
		registerRender(AirRuneAltar);
		registerRender(WaterRuneAltar);
		registerRender(FireRuneAltar);
		registerRender(EarthRuneAltar);
		registerRender(MindRuneAltar);
		registerRender(BodyRuneAltar);
		registerRender(CosmicRuneAltar);
		registerRender(ChaosRuneAltar);
		registerRender(NatureRuneAltar);
		registerRender(LawRuneAltar);
		registerRender(DeathRuneAltar);
		registerRender(BloodRuneAltar);
		registerRender(AstralRuneAltar);
		
	}
	
	public static void registerRender(Block block){
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	
	
	}
	
	public static void gameRegistry() {
		// Altars

		GameRegistry.registerBlock(AirAltar, BlockNames.AirAltar_Unlo);
		GameRegistry.registerBlock(WaterAltar, BlockNames.WaterAltar_Unlo);
		GameRegistry.registerBlock(FireAltar, BlockNames.FireAltar_Unlo);
		GameRegistry.registerBlock(EarthAltar, BlockNames.EarthAltar_Unlo);
		GameRegistry.registerBlock(MindAltar, BlockNames.MindAltar_Unlo);
		GameRegistry.registerBlock(BodyAltar, BlockNames.BodyAltar_Unlo);
		GameRegistry.registerBlock(CosmicAltar, BlockNames.CosmicAltar_Unlo);
		GameRegistry.registerBlock(ChaosAltar, BlockNames.ChaosAltar_Unlo);
		GameRegistry.registerBlock(NatureAltar, BlockNames.NatureAltar_Unlo);
		GameRegistry.registerBlock(LawAltar, BlockNames.LawAltar_Unlo);
		GameRegistry.registerBlock(DeathAltar, BlockNames.DeathAltar_Unlo);
		GameRegistry.registerBlock(BloodAltar, BlockNames.BloodAltar_Unlo);
		GameRegistry.registerBlock(AstralAltar, BlockNames.AstralAltar_Unlo);

		GameRegistry.registerBlock(AirRuneAltar, BlockNames.AirRuneAltar_Unlo);
		GameRegistry.registerBlock(WaterRuneAltar, BlockNames.WaterRuneAltar_Unlo);
		GameRegistry.registerBlock(FireRuneAltar, BlockNames.FireRuneAltar_Unlo);
		GameRegistry.registerBlock(EarthRuneAltar, BlockNames.EarthRuneAltar_Unlo);
		GameRegistry.registerBlock(MindRuneAltar, BlockNames.MindRuneAltar_Unlo);
		GameRegistry.registerBlock(BodyRuneAltar, BlockNames.BodyRuneAltar_Unlo);
		GameRegistry.registerBlock(CosmicRuneAltar, BlockNames.CosmicRuneAltar_Unlo);
		GameRegistry.registerBlock(ChaosRuneAltar, BlockNames.ChaosRuneAltar_Unlo);
		GameRegistry.registerBlock(NatureRuneAltar, BlockNames.NatureRuneAltar_Unlo);
		GameRegistry.registerBlock(LawRuneAltar, BlockNames.LawRuneAltar_Unlo);
		GameRegistry.registerBlock(DeathRuneAltar, BlockNames.DeathRuneAltar_Unlo);
		GameRegistry.registerBlock(BloodRuneAltar, BlockNames.BloodRuneAltar_Unlo);
		GameRegistry.registerBlock(AstralRuneAltar, BlockNames.AstralRuneAltar_Unlo);

		// Ores
		GameRegistry.registerBlock(CopperOre, BlockNames.CopperOre_Unlo);
		GameRegistry.registerBlock(TinOre, BlockNames.TinOre_Unlo);
		GameRegistry.registerBlock(AdamantiteOre, BlockNames.AdamantiteOre_Unlo);
		GameRegistry.registerBlock(CoalOre, BlockNames.CoalOre_Unlo);
		GameRegistry.registerBlock(GoldOre, BlockNames.GoldOre_Unlo);
		GameRegistry.registerBlock(IronOre, BlockNames.IronOre_Unlo);
		GameRegistry.registerBlock(MithrilOre, BlockNames.MithrilOre_Unlo);
		GameRegistry.registerBlock(RuniteOre, BlockNames.RuniteOre_Unlo);
		GameRegistry.registerBlock(SilverOre, BlockNames.SilverOre_Unlo);
		
		GameRegistry.registerBlock(RuneEssenceOre, BlockNames.RuneEssenceOre_Unlo);
		GameRegistry.registerBlock(PureEssenceOre, BlockNames.PureEssenceOre_Unlo);
		
		GameRegistry.registerBlock(RCFurnace, BlockNames.RCFurnace_Unlo);
		GameRegistry.registerBlock(Anvil, BlockNames.Anvil_Unlo);
		
	
	}

}
