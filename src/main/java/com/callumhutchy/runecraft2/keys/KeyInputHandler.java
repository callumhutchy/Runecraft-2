package com.callumhutchy.runecraft2.keys;

import com.callumhutchy.runecraft2.Runecraft2;
import com.callumhutchy.runecraft2.client.gui.tileentities.TileEntitySkills;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputHandler {


	
	@SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if(KeyBindings.skillGui.isPressed())
        {
        	
        }
        	
            
        
    }
	
}
