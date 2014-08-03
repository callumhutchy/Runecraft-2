package handler;

import java.io.File;

import reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class ConfigurationHandler {
	
	public static Configuration configuration;
	public static boolean altarWorldGen = true;
	public static boolean oreWorldGen = true;
	
	public static int WorldGenMultiplier = 20;
	
	public static boolean furnaceRequiresSmithing = true;

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
		altarWorldGen = configuration.getBoolean("Altar World Gen", Configuration.CATEGORY_GENERAL, false, "Whether the Altar world gens should be generated.");
		oreWorldGen = configuration.getBoolean("Ore World Gen", Configuration.CATEGORY_GENERAL, false, "Whether the Ore world gens should be generated.");
		WorldGenMultiplier = configuration.getInt("World Gen Multiplier", Configuration.CATEGORY_GENERAL, 20, 0, 100, "For testing purposes atm");
		furnaceRequiresSmithing = configuration.getBoolean("Furnace Requires Smithing", Configuration.CATEGORY_GENERAL, true, "This is whether the furnace will require a certain smithing level for each bar.");
		if(configuration.hasChanged()){
			configuration.save();
		}
	
	
	
	}
	
	
	
}
