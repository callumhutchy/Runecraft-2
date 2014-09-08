package com.callumhutchy.runecraft2.keys;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.callumhutchy.runecraft2.Runecraft2;
import com.callumhutchy.runecraft2.client.gui.tileentities.TileEntitySkills;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;


public class KeyInputHandler implements KeyListener {
	public boolean isSneakPressed;

	
	@SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if(KeyBindings.skillGui.isPressed())
        {
        	
        }
        
            
        
    }

	@Override
	public void keyPressed(KeyEvent arg0) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
