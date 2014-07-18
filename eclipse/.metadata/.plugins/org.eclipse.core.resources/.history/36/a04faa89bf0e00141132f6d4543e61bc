package com.callumhutchy.runecraft2.proxy;

import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityCopperOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityTinOre;
import com.callumhutchy.runecraft2.blocks.renderer.AltarRenderer;
import com.callumhutchy.runecraft2.blocks.renderer.CopperOreRenderer;
import com.callumhutchy.runecraft2.blocks.renderer.OreRenderer;
import com.callumhutchy.runecraft2.blocks.renderer.TinOreRenderer;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {

	public void registerRenderThings() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltar.class, new AltarRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTinOre.class, new TinOreRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCopperOre.class, new CopperOreRenderer());
        
}
	
}
