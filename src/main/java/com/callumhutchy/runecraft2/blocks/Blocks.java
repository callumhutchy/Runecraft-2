package com.callumhutchy.runecraft2.blocks;

import java.util.Random;

import reference.BlockNames;

import com.callumhutchy.runecraft2.Runecraft2;
import com.callumhutchy.runecraft2.items.Items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;



public class Blocks{

	public static Random random;
	
	//Altar
	public static Block Altar;
	
	//Ore
	public static Block CopperOre;
	public static Block TinOre;

	public static void init(){
		//Altar
		Altar = new Altar(Material.rock).setCreativeTab(Runecraft2.tabRunecraft2Magic).setBlockName("altar");
		
		//Ore
		CopperOre = new CopperOreBlock(Material.rock, "runecraft2:textures/blocks/OreModelCopperTexture.png").setBlockTextureName("runecraft2:OreModelCopperTexture").setBlockName(BlockNames.CopperOre_Unlo);
		TinOre = new TinOreBlock(Material.rock, "runecraft2:textures/blocks/OreModelTinTexture.png").setBlockTextureName("runecraft2:OreModelTinTexture").setBlockName(BlockNames.TinOre_Unlo);
				
		
	}
	
	
	
	public static void gameRegistry(){
		GameRegistry.registerBlock(Altar, BlockNames.Altar_Unlo);
		GameRegistry.registerBlock(CopperOre, BlockNames.CopperOre_Unlo);
		GameRegistry.registerBlock(TinOre, BlockNames.TinOre_Unlo);
	}
	
}
