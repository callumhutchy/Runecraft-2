package com.callumhutchy.runecraft2.proxy;

import com.callumhutchy.runecraft2.spells.render.RenderAirStrike;
import com.callumhutchy.runecraft2.spells.render.RenderEarthStrike;
import com.callumhutchy.runecraft2.spells.render.RenderFireStrike;
import com.callumhutchy.runecraft2.spells.render.RenderWaterStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityAirStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityEarthStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityFireStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntitySpellStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityWaterStrike;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

   
    public void registerRenderThings() {
	
	
	RenderingRegistry.registerEntityRenderingHandler(TileEntityAirStrike.class, new RenderAirStrike(Minecraft.getMinecraft().getRenderManager()));
	RenderingRegistry.registerEntityRenderingHandler(TileEntityEarthStrike.class, new RenderEarthStrike(Minecraft.getMinecraft().getRenderManager()));
	RenderingRegistry.registerEntityRenderingHandler(TileEntityFireStrike.class, new RenderFireStrike(Minecraft.getMinecraft().getRenderManager()));
	RenderingRegistry.registerEntityRenderingHandler(TileEntityWaterStrike.class, new RenderWaterStrike(Minecraft.getMinecraft().getRenderManager()));
	
	
	

}
    
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
	if (tileEntity != null) {
	    switch (ID) {
	    case 0: /* your GUIs go here */
	    }
	}
	return null;
    }

}
