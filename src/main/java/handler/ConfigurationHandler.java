package handler;

import java.io.File;

import reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class ConfigurationHandler {
	
	public static Configuration configuration;
	public static boolean testValue = false;

	public static void init(File configFile){
		//Create config object from the given config file
		if(configuration == null){
		configuration = new Configuration(configFile);
		loadConfiguration();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
		
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID)){
			//Resync Configs
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration(){
		testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example value");
		
		if(configuration.hasChanged()){
			configuration.save();
		}
	
	
	
	}
	
	
	
}
