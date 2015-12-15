package uk.co.callumhutchy.runecraft2.blocks.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityRCFurnace;

public class ContainerRCFurnace extends Container {
	TileEntityRCFurnace	tileEntity;

	public ContainerRCFurnace(EntityPlayer player) {
		
		
	}

	@Override
	public boolean canInteractWith(EntityPlayer p_75145_1_) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void changeDoneCooking(){
		tileEntity.doneCooking = !tileEntity.doneCooking;
	}
	
	public void changeAmountToCraft(int var1){
		tileEntity.amountOfProduct = var1;
	}
	
	public void changeProduct(Item item){
		tileEntity.furnaceProduct = item;
	}

}