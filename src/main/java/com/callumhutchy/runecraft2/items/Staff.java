package com.callumhutchy.runecraft2.items;

import handler.ExtendedPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import reference.ExpChart;

import com.callumhutchy.runecraft2.spells.tileentities.TileEntityAirStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityEarthStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityFireStrike;
import com.callumhutchy.runecraft2.spells.tileentities.TileEntityWaterStrike;

public class Staff extends BaseMagicItem {

    public String staffElement;
    public int runesProvided;

    public Staff(String unlocalisedName, int maxSize, String type, int numberOfRunesProvided, boolean isTalismanStaff) {
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

		    world.spawnEntityInWorld(new TileEntityAirStrike(world, runesProvided, runesProvided, runesProvided));
		    props.currentMagicExp += ExpChart.AIR_STRIKE_EXP;

		    if (!props.suppressExpMessages) {
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Your Magic increased by " + ExpChart.AIR_STRIKE_EXP));
		    }
		}
	    }

	}
	if (props.currentSpell == "hometeleport") {
	    player.setLocationAndAngles(props.currentHomeTPx, props.currentHomeTPy, props.currentHomeTPz, 1.0f, 1.0f);

	    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You have been teleported home."));

	}
	if (props.currentSpell == "waterstrike") {
	    if (player.capabilities.isCreativeMode || runesProvided >= 1 && staffElement == "water" || player.inventory.consumeInventoryItem(Items.waterRune)) {
		world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		if (!world.isRemote) {

		    world.spawnEntityInWorld(new TileEntityWaterStrike(world, player, 1));
		    props.currentMagicExp++;
		    if (!props.suppressExpMessages) {
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Your Magic increased by " + ExpChart.WATER_STRIKE_EXP));
		    }

		}
	    }

	}
	if (props.currentSpell == "earthstrike") {
	    if (player.capabilities.isCreativeMode || runesProvided >= 1 && staffElement == "earth" || player.inventory.consumeInventoryItem(Items.earthRune)) {
		world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		if (!world.isRemote) {

		    world.spawnEntityInWorld(new TileEntityEarthStrike(world, player, 1));
		    props.currentMagicExp++;
		    if (!props.suppressExpMessages) {
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Your Magic increased by " + ExpChart.EARTH_STRIKE_EXP));
		    }
		}
	    }

	}
	if (props.currentSpell == "firestrike") {
	    if (player.capabilities.isCreativeMode || runesProvided >= 1 && staffElement == "fire" || player.inventory.consumeInventoryItem(Items.fireRune)) {
		world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		if (!world.isRemote) {

		    world.spawnEntityInWorld(new TileEntityFireStrike(world, player, 1));
		    props.currentMagicExp++;
		    if (!props.suppressExpMessages) {
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Your Magic increased by " + ExpChart.FIRE_STRIKE_EXP));
		    }
		}
	    }

	}

	return item;
    }

    public boolean onItemUse(ItemStack itemStack, EntityPlayer entity, World world, int varx, int vary, int varz, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
	ExtendedPlayer props = ExtendedPlayer.get(entity);

	if (props.currentSpell == "earthpillar") {
	    if (entity.capabilities.isCreativeMode || runesProvided >= 1 && staffElement == "earth" || entity.inventory.consumeInventoryItem(Items.earthRune)) {
		world.playSoundAtEntity(entity, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		if (!world.isRemote) {

		    world.setBlockState(new BlockPos(varx, vary, varz), Blocks.stone.getDefaultState());
		    world.setBlockState(new BlockPos(varx, vary + 1, varz), Blocks.stone.getDefaultState());
		    world.setBlockState(new BlockPos(varx, vary + 2, varz), Blocks.stone.getDefaultState());

		    props.currentMagicExp++;
		    if (!props.suppressExpMessages) {
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Your Magic increased by " + ExpChart.FIRE_STRIKE_EXP));
		    }
		}
	    }

	}

	return true;

    }

}
