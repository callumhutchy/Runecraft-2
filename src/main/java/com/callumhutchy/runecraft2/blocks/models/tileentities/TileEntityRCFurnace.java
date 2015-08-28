package com.callumhutchy.runecraft2.blocks.models.tileentities;

import java.util.Timer;

import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;

public class TileEntityRCFurnace extends TileEntity implements IUpdatePlayerListBox {
	
	public Item					furnaceProduct;
	public int					amountOfProduct;
	public boolean				doneCooking		= false;
	public boolean				itemsToReturn	= false;
	public int					time			= 0;
	private static Timer		timer;
	public static int			interval;
	public static boolean		openDoors		= false;
	public int					direction;

	public boolean canUpdate() {
		return true;
	}

	

	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		NBTTagCompound properties = new NBTTagCompound();
		nbt.setInteger("direction", this.direction);
		System.out.println("Writing direction as " + this.direction);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		NBTTagCompound properties = (NBTTagCompound) nbt.getTag("furnace");
		System.out.println("READING");
		this.direction = nbt.getInteger("direction");
		System.out.println("Reading direction as " + this.direction);
	}

	@Override
	public void update() {
		if (time != 0) {
			openDoors = true;
			interval++;
			if (interval == 20) {
				time--;
				interval = 0;
			}
			// System.out.println(time);
			if (time == 0) {
				System.out.println("Reached method 3");

				doneCooking = true;
				if (doneCooking) {
					doneCooking = false;
					openDoors = false;
					time = 0;
					itemsToReturn = true;
					System.out.println("Its reached method 1");

				}
			}

		}
	}

}
