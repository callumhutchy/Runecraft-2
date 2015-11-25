package uk.co.callumhutchy.runecraft2.items;

import java.util.ArrayList;

import handler.ExtendedPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import reference.ExpChart;
import reference.Spell;
import uk.co.callumhutchy.runecraft2.spells.Spells;
import uk.co.callumhutchy.runecraft2.spells.tileentities.TileEntityAirStrike;
import uk.co.callumhutchy.runecraft2.spells.tileentities.TileEntityEarthStrike;
import uk.co.callumhutchy.runecraft2.spells.tileentities.TileEntityFireStrike;
import uk.co.callumhutchy.runecraft2.spells.tileentities.TileEntityWaterStrike;

public class Staff extends BaseMagicItem {

	public String staffElement;
	public int runesProvided;

	public Staff(String unlocalisedName, int maxSize, String type, int numberOfRunesProvided, boolean isTalismanStaff) {
		super(unlocalisedName, maxSize);
		this.staffElement = type;
		this.runesProvided = numberOfRunesProvided;

	}

	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}

	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer entity) {
		ExtendedPlayer props = ExtendedPlayer.get(entity);
		//System.out.println(props.currentSpell);
		if (props.currentSpell == "airstrike") {
			if (creativeCasting(entity) || elementCasting("air", Spells.airStrike.getRuneCost().size(), entity, Spells.airStrike) || hasEnoughRunes(entity, Items.airRune, 1)) {
				playSpellSound(world, entity);
				if (!creativeCasting(entity)) {
					consumeAllSpellRunes(entity, Spells.airStrike);
				}
				if (!world.isRemote) {
					world.spawnEntityInWorld(new TileEntityAirStrike(world, entity, "air"));
					increaseMagicExp(props, Spells.airStrike.getSpellExp());
					if (!props.suppressExpMessages) {
						outputExpGain(Spells.airStrike.getSpellExp());
					}
				}
			}
		}
		if (props.currentSpell == "hometeleport") {
			entity.setLocationAndAngles(props.currentHomeTPx, props.currentHomeTPy, props.currentHomeTPz, 1.0f, 1.0f);
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You have been teleported home."));
		}
		if (props.currentSpell == "waterstrike") {
			if (creativeCasting(entity) || elementCasting("water", Spells.waterStrike.getRuneCost().size(), entity, Spells.waterStrike) || hasEnoughRunes(entity, Items.waterRune, 1)) {
				playSpellSound(world, entity);
				if (!creativeCasting(entity)) {
					consumeAllSpellRunes(entity, Spells.waterStrike);
				}
				if (!world.isRemote) {
					world.spawnEntityInWorld(new TileEntityWaterStrike(world, entity, "water"));
					increaseMagicExp(props, Spells.waterStrike.getSpellExp());
					if (!props.suppressExpMessages) {
						outputExpGain(Spells.waterStrike.getSpellExp());
					}
				}
			}
		}
		if (props.currentSpell == "earthstrike") {
			if (creativeCasting(entity) || elementCasting("earth", Spells.earthStrike.getRuneCost().size(), entity, Spells.earthStrike) || hasEnoughRunes(entity, Items.earthRune, 1)) {
				playSpellSound(world, entity);
				if (!creativeCasting(entity)) {
					consumeAllSpellRunes(entity, Spells.earthStrike);
				}
				if (!world.isRemote) {
					world.spawnEntityInWorld(new TileEntityEarthStrike(world, entity, "earth"));
					increaseMagicExp(props, Spells.earthStrike.getSpellExp());
					if (!props.suppressExpMessages) {
						outputExpGain(Spells.earthStrike.getSpellExp());
					}
				}
			}
		}
		if (props.currentSpell == "firestrike") {
			if (creativeCasting(entity) || elementCasting("fire", Spells.fireStrike.getRuneCost().size(), entity, Spells.fireStrike) || hasEnoughRunes(entity, Items.fireRune, 1)) {
				playSpellSound(world, entity);
				if (!creativeCasting(entity)) {
					consumeAllSpellRunes(entity, Spells.fireStrike);
				}
				if (!world.isRemote) {
					world.spawnEntityInWorld(new TileEntityFireStrike(world, entity, "fire"));
					increaseMagicExp(props, Spells.fireStrike.getSpellExp());
					if (!props.suppressExpMessages) {
						outputExpGain(Spells.fireStrike.getSpellExp());
					}
				}
			}
		}
		return item;
	}

	public boolean onItemUse(ItemStack stack, EntityPlayer entity, World world, BlockPos pos, EnumFacing side, float varx, float vary, float varz) {
		ExtendedPlayer props = ExtendedPlayer.get(entity);
		if (props.currentSpell == "earthpillar") {
			if (creativeCasting(entity) || elementCasting("earth", Spells.earthPillar.getRuneCost().size(), entity, Spells.earthPillar) || hasEnoughRunes(entity, Items.earthRune, 1) && hasEnoughRunes(entity, Items.airRune, 1) && hasEnoughRunes(entity, Items.waterRune, 1)  ) {
				playSpellSound(world, entity);
				if (!creativeCasting(entity)) {
					consumeAllSpellRunes(entity, Spells.earthPillar);
				}
				if (!world.isRemote) {
					world.setBlockState(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()), Blocks.stone.getDefaultState());
					world.setBlockState(new BlockPos(pos.getX(), pos.getY() + 2, pos.getZ()), Blocks.stone.getDefaultState());
					props.currentMagicExp++;
					if (!props.suppressExpMessages) {
						Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Your Magic increased by " + ExpChart.FIRE_STRIKE_EXP));
					}
				}
			}
		}
		return true;
	}

	boolean creativeCasting(EntityPlayer player) {
		return player.capabilities.isCreativeMode;
	}

	boolean elementCasting(String type, int numberOfRunes, EntityPlayer entity, Spell spell) {
		return (staffElement == spell.getSpellElement().element && (numberOfRunes - runesProvided >= 1 && entity.inventory.hasItemStack(new ItemStack(spell.getSpellElement().rune, 1)) ));
	}

	boolean hasEnoughRunes(EntityPlayer entity, Item rune, int quantity) {
		return entity.inventory.hasItemStack(new ItemStack(rune, quantity));
	}

	void playSpellSound(World world, EntityPlayer entity) {
		world.playSoundAtEntity(entity, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	}


	public void outputExpGain(int exp) {
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Your Magic increased by " + exp));
	}

	protected void increaseMagicExp(ExtendedPlayer props, int exp) {
		props.currentMagicExp += exp;
	}

	public void consumeAllSpellRunes(EntityPlayer entity, Spell spell) {
		ArrayList<Boolean> contain = new ArrayList<Boolean>();
		boolean elementRetrieval = false;
		boolean wasElementCasting = false;
		
		wasElementCasting = elementCasting(spell.getSpellElement().getElement(), spell.getRuneCost().size(), entity, spell);
		System.out.println(wasElementCasting);
		for (Rune i : spell.getRuneCost()) {
			System.out.println(i.getUnlocalizedName());
			
			if(!elementRetrieval && wasElementCasting){
				if(i == spell.getSpellElement().getRune()){
					elementRetrieval = true;
				}
			}else{
				entity.inventory.consumeInventoryItem(i);
			}
			
			

		}
	}

	boolean isValid(ArrayList<Boolean> contains) {
		for (Boolean c : contains) {
			if (c = false)
				return false;
		}
		return true;
	}

}
