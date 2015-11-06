package uk.co.callumhutchy.runecraft2.client.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import uk.co.callumhutchy.runecraft2.blocks.containers.ContainerRCFurnace;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityRCFurnace;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		 TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
         if(tileEntity instanceof TileEntityRCFurnace){
                 return new ContainerRCFurnace(player);
         }
         return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		// TODO Auto-generated method stub
//		if(ID == GuiSpellBook.GUI_ID){
//			
//		}
		TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
		switch(ID){
		case GuiSpellBook.GUI_ID:
			return new GuiSpellBook();
		case GuiRCFurnace.GUI_ID:
			return new GuiRCFurnace(player);
		default: return null;
		}
		
	}

}
