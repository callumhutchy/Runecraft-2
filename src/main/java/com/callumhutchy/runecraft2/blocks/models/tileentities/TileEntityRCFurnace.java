package com.callumhutchy.runecraft2.blocks.models.tileentities;

import java.util.Timer;
import java.util.TimerTask;

import com.callumhutchy.runecraft2.blocks.models.FurnaceModel;

import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;

public class TileEntityRCFurnace extends TileEntity{
public static FurnaceModel model;
public Item furnaceProduct;
public int amountOfProduct;
public boolean doneCooking = false;
public boolean itemsToReturn = false;
public int time = 0;
private static Timer timer;
private static int interval;

public boolean canUpdate() {
	return true;
}

@Override
public void updateEntity() {
if(time != 0){
	interval++;
	if(interval == 20){
		time--;
		interval = 0;
	}
	System.out.println(time);
	if(time == 0){
		System.out.println("Reached method 3");
		doneCooking = true;
		if(doneCooking){
			doneCooking = false;
			
				itemsToReturn = true;
				System.out.println("Its reached method 1");
			
		}
	}
    
}



}
private static final int setInterval() {
    if (interval == 1)
        timer.cancel();
    return --interval;
}

}
