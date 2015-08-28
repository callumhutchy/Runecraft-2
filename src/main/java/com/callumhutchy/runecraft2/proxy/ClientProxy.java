package com.callumhutchy.runecraft2.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import com.callumhutchy.runecraft2.spells.render.RenderAirStrike;
import com.callumhutchy.runecraft2.spells.render.RenderEarthStrike;
import com.callumhutchy.runecraft2.spells.render.RenderFireStrike;
import com.callumhutchy.runecraft2.spells.render.RenderWaterStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityAirStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityEarthStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityFireStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityWaterStrike;

public class ClientProxy extends CommonProxy {

   
    public void registerRenderThings() {
	// Block Rendering
	// Altars

	/*ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAirAltar.class, new AltarRenderer("runecraft2:textures/blocks/airaltar.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWaterAltar.class, new AltarRenderer("runecraft2:textures/blocks/wateraltar.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFireAltar.class, new AltarRenderer("runecraft2:textures/blocks/firealtar.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEarthAltar.class, new AltarRenderer("runecraft2:textures/blocks/earthaltar.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMindAltar.class, new AltarRenderer("runecraft2:textures/blocks/mindaltar.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBodyAltar.class, new AltarRenderer("runecraft2:textures/blocks/bodyaltar.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCosmicAltar.class, new AltarRenderer("runecraft2:textures/blocks/cosmicaltar.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChaosAltar.class, new AltarRenderer("runecraft2:textures/blocks/chaosaltar.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityNatureAltar.class, new AltarRenderer("runecraft2:textures/blocks/naturealtar.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLawAltar.class, new AltarRenderer("runecraft2:textures/blocks/lawaltar.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDeathAltar.class, new AltarRenderer("runecraft2:textures/blocks/deathaltar.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBloodAltar.class, new AltarRenderer("runecraft2:textures/blocks/bloodaltar.png"));
	 ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAstralAltar.class, new AltarRenderer("runecraft2:textures/blocks/astralaltar.png"));
	// new
	// AltarRenderer("runecraft2:textures/blocks/AstralAltarTexture.png"));

	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAirRuneAltar.class, new AltarRuneRenderer("runecraft2:textures/blocks/AirRuneAltarTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWaterRuneAltar.class, new AltarRuneRenderer("runecraft2:textures/blocks/WaterRuneAltarTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFireRuneAltar.class, new AltarRuneRenderer("runecraft2:textures/blocks/FireRuneAltarTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEarthRuneAltar.class, new AltarRuneRenderer("runecraft2:textures/blocks/EarthRuneAltarTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMindRuneAltar.class, new AltarRuneRenderer("runecraft2:textures/blocks/MindRuneAltarTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBodyRuneAltar.class, new AltarRuneRenderer("runecraft2:textures/blocks/BodyRuneAltarTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCosmicRuneAltar.class, new AltarRuneRenderer("runecraft2:textures/blocks/CosmicRuneAltarTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChaosRuneAltar.class, new AltarRuneRenderer("runecraft2:textures/blocks/ChaosRuneAltarTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityNatureRuneAltar.class, new AltarRuneRenderer("runecraft2:textures/blocks/NatureRuneAltarTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLawRuneAltar.class, new AltarRuneRenderer("runecraft2:textures/blocks/LawRuneAltarTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDeathRuneAltar.class, new AltarRuneRenderer("runecraft2:textures/blocks/DeathRuneAltarTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBloodRuneAltar.class, new AltarRuneRenderer("runecraft2:textures/blocks/BloodRuneAltarTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAstralRuneAltar.class, new AltarRuneRenderer("runecraft2:textures/blocks/AstralRuneAltarTexture.png"));

	// Ores
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTinOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelTinTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCopperOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelCopperTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAdamantiteOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelAdamantiteTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCoalOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelCoalTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoldOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelGoldTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIronOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelIronTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMithrilOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelMithrilTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRuniteOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelRuniteTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySilverOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelSilverTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRuneEssenceOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelRuneEssenceTexture.png"));
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPureEssenceOre.class, new OreRenderer("runecraft2:textures/blocks/OreModelPureEssenceTexture.png"));

	
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRCFurnace.class, new RCFurnaceRenderer());
	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAnvil.class, new AnvilRenderer());*/
	// Item Rendering
	// Altars

	/*MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.AirAltar), new ItemRender(new AltarRenderer("runecraft2:textures/blocks/AirAltarTexture.png"), new TileEntityAirAltar(), "altar"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.WaterAltar), new ItemRender(new AltarRenderer("runecraft2:textures/blocks/WaterAltarTexture.png"), new TileEntityWaterAltar(), "altar"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.FireAltar), new ItemRender(new AltarRenderer("runecraft2:textures/blocks/FireAltarTexture.png"), new TileEntityFireAltar(), "altar"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.EarthAltar), new ItemRender(new AltarRenderer("runecraft2:textures/blocks/EarthAltarTexture.png"), new TileEntityEarthAltar(), "altar"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.MindAltar), new ItemRender(new AltarRenderer("runecraft2:textures/blocks/MindAltarTexture.png"), new TileEntityMindAltar(), "altar"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.BodyAltar), new ItemRender(new AltarRenderer("runecraft2:textures/blocks/BodyAltarTexture.png"), new TileEntityBodyAltar(), "altar"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.CosmicAltar), new ItemRender(new AltarRenderer("runecraft2:textures/blocks/CosmicAltarTexture.png"), new TileEntityCosmicAltar(), "altar"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.ChaosAltar), new ItemRender(new AltarRenderer("runecraft2:textures/blocks/ChaosAltarTexture.png"), new TileEntityChaosAltar(), "altar"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.NatureAltar), new ItemRender(new AltarRenderer("runecraft2:textures/blocks/NatureAltarTexture.png"), new TileEntityNatureAltar(), "altar"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.LawAltar), new ItemRender(new AltarRenderer("runecraft2:textures/blocks/LawAltarTexture.png"), new TileEntityLawAltar(), "altar"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.DeathAltar), new ItemRender(new AltarRenderer("runecraft2:textures/blocks/DeathAltarTexture.png"), new TileEntityDeathAltar(), "altar"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.BloodAltar), new ItemRender(new AltarRenderer("runecraft2:textures/blocks/BloodAltarTexture.png"), new TileEntityBloodAltar(), "altar"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.AstralAltar), new ItemRender(new AltarRenderer("runecraft2:textures/blocks/AstralAltarTexture.png"), new TileEntityAstralAltar(), "altar"));

	// Ores
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.AdamantiteOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelAdamantiteTexture.png"), new TileEntityAdamantiteOre(), "ore"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.TinOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelTinTexture.png"), new TileEntityTinOre(), "ore"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.CopperOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelCopperTexture.png"), new TileEntityCopperOre(), "ore"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.GoldOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelGoldTexture.png"), new TileEntityGoldOre(), "ore"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.CoalOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelCoalTexture.png"), new TileEntityCoalOre(), "ore"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.IronOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelIronTexture.png"), new TileEntityIronOre(), "ore"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.MithrilOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelMithrilTexture.png"), new TileEntityMithrilOre(), "ore"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.RuniteOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelRuniteTexture.png"), new TileEntityRuniteOre(), "ore"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.SilverOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelSilverTexture.png"), new TileEntitySilverOre(), "ore"));

	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.RuneEssenceOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelRuneEssenceTexture.png"), new TileEntityRuneEssenceOre(), "ore"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.PureEssenceOre), new ItemRender(new OreRenderer("runecraft2:textures/blocks/OreModelPureEssenceTexture.png"), new TileEntityPureEssenceOre(), "ore"));

	MinecraftForgeClient.registerItemRenderer(Items.staff, (IItemRenderer) new ItemStaffRenderer());
	
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.RCFurnace), new ItemRender(new RCFurnaceRenderer(), new TileEntityRCFurnace(), "altar"));
	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.Anvil), new ItemRender(new AnvilRenderer(), new TileEntityAnvil(), "altar"));*/
	
	RenderingRegistry.registerEntityRenderingHandler(TileEntityAirStrike.class, new RenderAirStrike(Minecraft.getMinecraft().getRenderManager()));
	RenderingRegistry.registerEntityRenderingHandler(TileEntityEarthStrike.class, new RenderEarthStrike(Minecraft.getMinecraft().getRenderManager()));
	RenderingRegistry.registerEntityRenderingHandler(TileEntityFireStrike.class, new RenderFireStrike(Minecraft.getMinecraft().getRenderManager()));
	RenderingRegistry.registerEntityRenderingHandler(TileEntityWaterStrike.class, new RenderWaterStrike(Minecraft.getMinecraft().getRenderManager()));
	
	
	

}
    
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
	if (tileEntity != null) {
	    switch (ID) {
	    case 0: /* your GUIs go here */
	    }
	}
	return null;
    }

}
