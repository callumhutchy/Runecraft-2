package com.callumhutchy.runecraft2.client.gui;

import com.callumhutchy.runecraft2.blocks.containers.ContainerRCFurnace;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityRCFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		 TileEntity tileEntity = world.getTileEntity(x, y, z);
         if(tileEntity instanceof TileEntityRCFurnace){
                 return new ContainerRCFurnace(player.inventory, (TileEntityRCFurnace) tileEntity);
         }
         return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		// TODO Auto-generated method stub
//		if(ID == GuiSpellBook.GUI_ID){
//			
//		}
		switch(ID){
		case GuiSpellBook.GUI_ID:
			return new GuiSpellBook();
		case GuiRCFurnace.GUI_ID:
			return new GuiRCFurnace(null, null);
		default: return null;
		}
		
	}

}
