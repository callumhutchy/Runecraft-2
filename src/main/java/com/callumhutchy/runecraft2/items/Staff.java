package com.callumhutchy.runecraft2.items;

import reference.ExpChart;
import handler.ExtendedPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBook;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import com.callumhutchy.runecraft2.Runecraft2;
import com.callumhutchy.runecraft2.client.gui.GuiSpellBook;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityAirStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityEarthStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityFireStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityWaterStrike;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Staff extends BaseMagicItem {

	public String	staffElement;
	public int		runesProvided;

	public Staff(String unlocalisedName, int maxSize, String type, int numberOfRunesProvided) {
		super(unlocalisedName, maxSize);
		staffElement = type;
		runesProvided = numberOfRunesProvided;

	}

	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}

	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		ExtendedPlayer props = ExtendedPlayer.get(player);
	
		
		
		System.out.println(props.currentSpell);
		if (props.currentSpell == "airstrike") {
			if (player.capabilities.isCreativeMode || runesProvided >= 1 && staffElement == "air" || player.inventory.consumeInventoryItem(Items.airRune)) {
				world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
				if (!world.isRemote) {

					world.spawnEntityInWorld(new TileEntityAirStrike(world,player));
					props.currentMagicExp+= ExpChart.AIR_STRIKE_EXP;
					
if(!props.suppressExpMessages){
					Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Your Magic increased by " + ExpChart.AIR_STRIKE_EXP));
}
				}
			}

		}
		if(props.currentSpell == "hometeleport"){
				player.setLocationAndAngles(props.currentHomeTPx, props.currentHomeTPy, props.currentHomeTPz, 1.0f, 1.0f);

				Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You have been teleported home."));
				
		}
		if (props.currentSpell == "waterstrike") {
			if (player.capabilities.isCreativeMode || runesProvided >= 1 && staffElement == "water" || player.inventory.consumeInventoryItem(Items.waterRune)) {
				world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
				if (!world.isRemote) {

					world.spawnEntityInWorld(new TileEntityWaterStrike(world, player));
					props.currentMagicExp++;
					if(!props.suppressExpMessages){
					Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Your Magic increased by " + ExpChart.WATER_STRIKE_EXP));
					}
				
				}
			}

		}
		if (props.currentSpell == "earthstrike") {
			if (player.capabilities.isCreativeMode || runesProvided >= 1 && staffElement == "earth" || player.inventory.consumeInventoryItem(Items.earthRune)) {
				world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
				if (!world.isRemote) {

					world.spawnEntityInWorld(new TileEntityEarthStrike(world, player));
					props.currentMagicExp++;
					if(!props.suppressExpMessages){
					Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Your Magic increased by " + ExpChart.EARTH_STRIKE_EXP));
					}
				}
			}

		}
		if (props.currentSpell == "firestrike") {
			if (player.capabilities.isCreativeMode || runesProvided >= 1 && staffElement == "fire" || player.inventory.consumeInventoryItem(Items.fireRune)) {
				world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
				if (!world.isRemote) {

					world.spawnEntityInWorld(new TileEntityFireStrike(world, player));
					props.currentMagicExp++;
					if(!props.suppressExpMessages){
					Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Your Magic increased by " + ExpChart.FIRE_STRIKE_EXP));
					}
				}
			}

		}
		
		return item;
	}
	

}
