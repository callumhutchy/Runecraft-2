package com.callumhutchy.runecraft2.blocks;

import java.util.Random;

import reference.BlockNames;

import com.callumhutchy.runecraft2.Runecraft2;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityCopperOre;
import com.callumhutchy.runecraft2.items.Items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Blocks {

	public static Random	random;

	// Altar
	public static Block		Altar;

	public static Block		AltarRune;

	// Ores
	public static Block		CopperOre;
	public static Block		TinOre;
	public static Block		AdamantiteOre;
	public static Block		CoalOre;
	public static Block		GoldOre;
	public static Block		IronOre;
	public static Block		MithrilOre;
	public static Block		RuniteOre;
	public static Block		SilverOre;

	public static void init() {
		// Altar

		Altar = new Altar(Material.ground, "runecraft2:textures/blocks/AltarTexture.png", BlockNames.Altar_Unlo, "altar");

		AltarRune = new Altar(Material.rock, "runecraft2:textures/blocks/AltarRuneTexture.png", BlockNames.AltarRune_Unlo, "altarrune");
		// Ores
		CopperOre = new OreBlock(Material.rock, "runecraft2:OreModelCopperTexture", BlockNames.CopperOre_Unlo, Items.copperOre, "copper");
		TinOre = new OreBlock(Material.rock, "runecraft2:OreModelTinTexture", BlockNames.TinOre_Unlo, Items.tinOre, "tin");
		AdamantiteOre = new OreBlock(Material.rock, "runecraft2:reModelAdamantiteTexture", BlockNames.AdamantiteOre_Unlo, Items.adamantiteOre, "adamantite");
		CoalOre = new OreBlock(Material.rock, "runecraft2:OreModelCoalTexture", BlockNames.CoalOre_Unlo, Items.coalOre, "coal");
		GoldOre = new OreBlock(Material.rock, "runecraft2:OreModelGoldTexture", BlockNames.GoldOre_Unlo, Items.goldOre, "gold");
		IronOre = new OreBlock(Material.rock, "runecraft2:OreModelIronTexture", BlockNames.IronOre_Unlo, Items.ironOre, "iron");
		MithrilOre = new OreBlock(Material.rock, "runecraft2:OreModelMithrilTexture", BlockNames.MithrilOre_Unlo, Items.mithrilOre, "mithril");
		RuniteOre = new OreBlock(Material.rock, "runecraft2:OreModelRuniteTexture", BlockNames.RuniteOre_Unlo, Items.runiteOre, "runite");
		SilverOre = new OreBlock(Material.rock, "runecraft2:OreModelSilverTexture", BlockNames.SilverOre_Unlo, Items.silverOre, "silver");
	}

	public static void gameRegistry() {
		// Altars
		GameRegistry.registerBlock(Altar, BlockNames.Altar_Unlo);

		GameRegistry.registerBlock(AltarRune, BlockNames.AltarRune_Unlo);

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
	}

}
