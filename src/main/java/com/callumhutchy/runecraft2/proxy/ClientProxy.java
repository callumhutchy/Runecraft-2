package com.callumhutchy.runecraft2.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.callumhutchy.runecraft2.blocks.Blocks;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityAdamantiteOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityAltarRune;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityCoalOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityCopperOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityGoldOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityIronOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityMithrilOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityRuniteOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntitySilverOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityTinOre;
import com.callumhutchy.runecraft2.blocks.renderer.ore.AltarRenderer;
import com.callumhutchy.runecraft2.blocks.renderer.ore.AltarRuneRenderer;
import com.callumhutchy.runecraft2.blocks.renderer.ore.ItemRender;
import com.callumhutchy.runecraft2.blocks.renderer.ore.OreRenderer;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {

	public void registerRenderThings() {
        //Block Rendering
		//Altars
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltar.class, new AltarRenderer("runecraft2:textures/blocks/AltarTexture.png"));
		
		
        //Ores
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTinOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelTinTexture.png"));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCopperOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelCopperTexture.png"));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAdamantiteOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelAdamantiteTexture.png"));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCoalOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelCoalTexture.png"));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoldOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelGoldTexture.png"));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIronOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelIronTexture.png"));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMithrilOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelMithrilTexture.png"));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRuniteOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelRuniteTexture.png"));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySilverOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelSilverTexture.png"));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarRune.class, new AltarRuneRenderer("runecraft2:textures/blocks/AltarRuneTexture.png"));
        //Item Rendering
        //Altars
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.Altar), new ItemRender(new AltarRenderer("runecraft2:textures/blocks/AltarTexture.png"), new TileEntityAltar(), "altar"));
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.AltarRune), new ItemRender(new AltarRuneRenderer("runecraft2:textures/blocks/AltarRuneTexture.png"), new TileEntityAltarRune(), "altar"));
        
        
        //Ores
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.AdamantiteOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelAdamantiteTexture.png"), new TileEntityAdamantiteOre(), "ore"));
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.TinOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelTinTexture.png"), new TileEntityTinOre(), "ore"));
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.CopperOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelCopperTexture.png"), new TileEntityCopperOre(), "ore"));
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.GoldOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelGoldTexture.png"), new TileEntityGoldOre(), "ore"));
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.CoalOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelCoalTexture.png"), new TileEntityCoalOre(), "ore"));
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.IronOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelIronTexture.png"), new TileEntityIronOre(), "ore"));
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.MithrilOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelMithrilTexture.png"), new TileEntityMithrilOre(), "ore"));
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.RuniteOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelRuniteTexture.png"), new TileEntityRuniteOre(), "ore"));
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.SilverOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelSilverTexture.png"), new TileEntitySilverOre(), "ore"));
	
	
	}
	
}
