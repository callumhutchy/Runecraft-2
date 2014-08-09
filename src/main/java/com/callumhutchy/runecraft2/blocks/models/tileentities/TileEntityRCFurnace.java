package com.callumhutchy.runecraft2.blocks.models.tileentities;

import java.util.Timer;
import java.util.TimerTask;

import com.callumhutchy.runecraft2.blocks.models.FurnaceModel;

import net.minecraft.block.BlockFurnace;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityRCFurnace extends TileEntity {
	public static FurnaceModel	model;
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
	public void updateEntity() {

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

	public void readFromNBT(NBTTagCompound p_145839_1_) {
		super.readFromNBT(p_145839_1_);
		this.direction = p_145839_1_.getInteger("direction");
		

	}

	public void writeToNBT(NBTTagCompound p_145841_1_) {
		super.writeToNBT(p_145841_1_);
		p_145841_1_.setInteger("direction", this.direction);
		

	}

}
