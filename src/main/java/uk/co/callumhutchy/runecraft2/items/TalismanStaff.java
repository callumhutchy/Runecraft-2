package uk.co.callumhutchy.runecraft2.items;

import handler.ExtendedPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import reference.Element;
import reference.ExpChart;
import uk.co.callumhutchy.runecraft2.spells.tileentities.TileEntityAirStrike;
import uk.co.callumhutchy.runecraft2.spells.tileentities.TileEntityEarthStrike;
import uk.co.callumhutchy.runecraft2.spells.tileentities.TileEntityFireStrike;
import uk.co.callumhutchy.runecraft2.spells.tileentities.TileEntitySpellStrike;
import uk.co.callumhutchy.runecraft2.spells.tileentities.TileEntityWaterStrike;

public class TalismanStaff extends Staff {
	
	public int		runesProvided;
	

	public TalismanStaff(String unlocalisedName, int maxSize, Element element, int numberOfRunesProvided, boolean isTalismanStaff) {
		super(unlocalisedName, maxSize, element, numberOfRunesProvided, isTalismanStaff);
		
		runesProvided = numberOfRunesProvided;
	}

	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}

	/*public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		ExtendedPlayer props = ExtendedPlayer.get(player);
		
			System.out.println(props.currentSpell);
			if (props.currentSpell == "airstrike") {
				if (player.capabilities.isCreativeMode || runesProvided >= 1 && staffElement == "air" || player.inventory.consumeInventoryItem(Items.airRune)) {
					world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
					if (!world.isRemote) {
						world.spawnEntityInWorld(new TileEntitySpellStrike(world, player, "air"));
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

						world.spawnEntityInWorld(new TileEntitySpellStrike(world, player, "water" ));
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

						world.spawnEntityInWorld(new TileEntitySpellStrike(world, player, "earth" ));
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

						world.spawnEntityInWorld(new TileEntitySpellStrike(world, player, "fire"));
						props.currentMagicExp++;
						if (!props.suppressExpMessages) {
							Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Your Magic increased by " + ExpChart.FIRE_STRIKE_EXP));
						}
					}
				}

			}
		
		
		return item;
	}*/

}
