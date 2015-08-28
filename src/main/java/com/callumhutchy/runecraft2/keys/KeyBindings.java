package com.callumhutchy.runecraft2.keys;


import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

import org.lwjgl.input.Keyboard;

public class KeyBindings {

	public static KeyBinding skillGui;
	
	public static void init(){
		skillGui = new KeyBinding("key.skillGui", Keyboard.KEY_K, "key.categories.misc");
	
		ClientRegistry.registerKeyBinding(skillGui);
		
		
	}
	
}
