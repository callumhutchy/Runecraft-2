package com.callumhutchy.runecraft2;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import handler.ConfigurationHandler;
import reference.Reference;
import utility.LogHelper;

import com.callumhutchy.runecraft2.blocks.Blocks;
import com.callumhutchy.runecraft2.items.Items;
import com.callumhutchy.runecraft2.proxy.IProxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Runecraft2 {
	
	@Mod.Instance("Runecraft2")
	public static Runecraft2 instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static IProxy proxy;

	
	
	public static CreativeTabs tabRunecraft2Magic = new CreativeTabs("tabRunecraft2Magic") {
		@Override
		public Item getTabIconItem() {
			return Items.airRune;
		}
	};
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		Blocks.init();
		LogHelper.info("Blocks Initialised!");
		Items.init();
		LogHelper.info("Items Initialised!");
		Items.addNames();
		LogHelper.info("Item Names added.");
		Items.gameRegistery();
		LogHelper.info("Items have been registered to the game.");
		Items.craftingRecipes();
		LogHelper.info("Crafting recipes added.");
		
		LogHelper.info("Pre Initialisation Complete!");
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabRunecraft2Magic", "en_US", "Runecraft 2 Magic");
		
		
		
		
		LogHelper.info("Initialisation Complete!");
	}
	
	@Mod.EventHandler
	public void PostInit(FMLPostInitializationEvent event){
		LogHelper.info("Post Initialisation Complete!");
	}
}
