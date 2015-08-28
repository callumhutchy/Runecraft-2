package com.callumhutchy.runecraft2;

import handler.ConfigurationHandler;
import handler.Runecraft2EventHandler;
import net.minecraft.client.Minecraft;
//import mods.mud.ModUpdateDetector;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import reference.Materials;
import reference.Reference;
import reference.TileEntities;
import utility.LogHelper;
import utility.commands.HomeTeleportCMD;
import utility.commands.SkillsCMD;
import utility.commands.SuppressExpMessagesCMD;

import com.callumhutchy.runecraft2.blocks.Blocks;
import com.callumhutchy.runecraft2.client.gui.GuiHandler;
import com.callumhutchy.runecraft2.items.Items;
import com.callumhutchy.runecraft2.keys.KeyBindings;
import com.callumhutchy.runecraft2.keys.KeyInputHandler;
import com.callumhutchy.runecraft2.proxy.CommonProxy;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityAirStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityEarthStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityFireStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityWaterStrike;
import com.callumhutchy.runecraft2.worldgen.AltarWorldGeneratorRunecraft2;
import com.callumhutchy.runecraft2.worldgen.OreWorldGeneratorRunecraft2;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Runecraft2 {
	
	@Mod.Instance("Runecraft2")
	public static Runecraft2 instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;

	@EventHandler
    public void serverStart(FMLServerStartingEvent event)
    {
		MinecraftServer server = MinecraftServer.getServer();
		ICommandManager command = server.getCommandManager();
		ServerCommandManager manager = (ServerCommandManager) command;
		manager.registerCommand(new HomeTeleportCMD());
		manager.registerCommand(new SkillsCMD());
		manager.registerCommand(new SuppressExpMessagesCMD());
    }

	
	
	public static CreativeTabs tabRunecraft2Magic = new CreativeTabs("tabRunecraft2Magic") {
		@Override
		public Item getTabIconItem() {
			return Items.airRune;
		}
	};
	
	public static CreativeTabs tabRunecraft2Metal = new CreativeTabs("tabRunecraft2Metal") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(Blocks.RuniteOre);
		}
	};
	
	public static CreativeTabs tabRunecraft2Tools = new CreativeTabs("tabRunecraft2Tools") {
		@Override
		public Item getTabIconItem() {
			return Items.blackhatchet;
		}
	};
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
//		try {
//			ModUpdateDetector.registerMod(FMLCommonHandler.instance().findContainerFor(this), new URL("https://raw.githubusercontent.com/callumhutchy/Runecraft-2/master/runecraft2updates.xml"),new URL( "https://raw.githubusercontent.com/callumhutchy/Runecraft-2/master/runecraft2changelog.xml"));
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Materials.init();
		
		Blocks.init();
		LogHelper.info("Blocks Initialised!");
		
		Blocks.gameRegistry();
		LogHelper.info("Blocks have been registered with the game.");
		Items.init();
		LogHelper.info("Items Initialised!");
		
		Items.gameRegistery();
		
		LogHelper.info("Items have been registered to the game.");
		
		
		LogHelper.info("Pre Initialisation Complete!");
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
		
		int modEntityID = 0;

		proxy.registerRenderThings();
		Blocks.registerRenders();
		Items.registerRenders();
		GameRegistry.registerWorldGenerator(new AltarWorldGeneratorRunecraft2(), 50);
		GameRegistry.registerWorldGenerator(new OreWorldGeneratorRunecraft2(), 50);
		TileEntities.init();
		MinecraftForge.EVENT_BUS.register(new Runecraft2EventHandler());
		KeyBindings.init();
		 NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		 EntityRegistry.registerModEntity(TileEntityAirStrike.class, "Air Strike", ++modEntityID, this, 64, 10, true);
		 EntityRegistry.registerModEntity(TileEntityWaterStrike.class, "Water Strike", ++modEntityID, this, 64, 10, true);
		 EntityRegistry.registerModEntity(TileEntityEarthStrike.class, "Earth Strike", ++modEntityID, this, 64, 10, true);
		 EntityRegistry.registerModEntity(TileEntityFireStrike.class, "Fire Strike", ++modEntityID, this, 64, 10, true);
		FMLCommonHandler.instance().bus().register(new KeyInputHandler());
		FMLCommonHandler.instance().bus().register(new Runecraft2EventHandler());
		FMLCommonHandler.instance().bus().register(new GuiHandler());

		Items.craftingRecipes();
		LogHelper.info("Crafting recipes added.");
		
		LogHelper.info("Initialisation Complete!");

	}
	
	@Mod.EventHandler
	public void PostInit(FMLPostInitializationEvent event){
		LogHelper.info("Post Initialisation Complete!");
	}
}
