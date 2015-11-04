package com.callumhutchy.runecraft2.blocks.models.tileentities.altars;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityMindRuneAltar extends TileEntity{
	public int	quantityOfRuneEssence;

	public TileEntityMindRuneAltar() {
		
	}
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		this.quantityOfRuneEssence = nbt.getInteger("QuantityOfRuneEssence");

	}

	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setInteger("QuantityOfRuneEssence", this.quantityOfRuneEssence);

	}
}
