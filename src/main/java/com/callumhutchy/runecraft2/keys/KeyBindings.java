package com.callumhutchy.runecraft2.keys;


import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class KeyBindings {

	public static KeyBinding skillGui;
	
	public static void init(){
		skillGui = new KeyBinding("key.skillGui", Keyboard.KEY_K, "key.categories.misc");
	
		ClientRegistry.registerKeyBinding(skillGui);
		
		
	}
	
}
