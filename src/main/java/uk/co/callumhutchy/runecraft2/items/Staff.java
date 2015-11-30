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
import reference.Element;
import reference.ExpChart;
import reference.Spell;
import uk.co.callumhutchy.runecraft2.spells.Spells;
import uk.co.callumhutchy.runecraft2.spells.tileentities.TileEntityAirStrike;
import uk.co.callumhutchy.runecraft2.spells.tileentities.TileEntityEarthStrike;
import uk.co.callumhutchy.runecraft2.spells.tileentities.TileEntityFireStrike;
import uk.co.callumhutchy.runecraft2.spells.tileentities.TileEntityWaterStrike;

public class Staff extends BaseMagicItem {

	public Element staffElement;
	public int runesProvided;

	public Staff(String unlocalisedName, int maxSize, Element element, int numberOfRunesProvided, boolean isTalismanStaff) {
		super(unlocalisedName, maxSize);
		this.staffElement = element;
		this.runesProvided = numberOfRunesProvided;

	}

	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}

	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer entity) {
		ExtendedPlayer props = ExtendedPlayer.get(entity);
		System.out.println(props.currentSpell);
		if (props.currentSpell == "airstrike") {
			if (creativeCasting(entity) || elementCasting(Spells.airStrike) && hasTheRightRunes(entity, Spells.airStrike) || hasTheRightRunes(entity, Spells.airStrike) ) {
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
			if (creativeCasting(entity) || elementCasting(Spells.waterStrike) && hasTheRightRunes(entity, Spells.waterStrike)  ||hasTheRightRunes(entity, Spells.waterStrike) ) {
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
			if (creativeCasting(entity) || elementCasting(Spells.earthStrike) && hasTheRightRunes(entity, Spells.earthStrike)  || hasTheRightRunes(entity, Spells.earthStrike) ) {
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
			if (creativeCasting(entity) || elementCasting(Spells.fireStrike) && hasTheRightRunes(entity, Spells.fireStrike) || hasTheRightRunes(entity, Spells.fireStrike) ) {
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
			if (creativeCasting(entity) || elementCasting(Spells.earthPillar) && hasTheRightRunes(entity, Spells.earthPillar) || hasTheRightRunes(entity, Spells.earthPillar) ) {
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

	boolean elementCasting(Spell spell) {
		return (staffElement== spell.getSpellElement());
	}

	
	
	boolean hasTheRightRunes(EntityPlayer entity, Spell spell){
		ArrayList<Rune> runeList = spell.getRuneCost();
		Rune[] uniqueValues = new Rune[runeList.size()];
		int[] countValues = new int[runeList.size()];
		
		for(int i = 0; i < runeList.size(); i++){
			
			boolean isNewValue = true;
			
			if(i>0){
				if(uniqueValues[uniqueValues.length-1] == runeList.get(i)	){
					isNewValue = false;
					countValues[uniqueValues.length-1]++;
				}
			}
			
			if(isNewValue){
				uniqueValues = addToArrayRune(uniqueValues, runeList.get(i));
				countValues = addToArrayInt(countValues, 1);
			}
			
		}
		
		System.out.println("Results: ");
		for(int i = 0; i < countValues.length; i++){
			System.out.println(uniqueValues[i] + " = " + countValues[i]);
		}
		
		boolean hasAllRunes = false;
		
		for(int i = 0; i < uniqueValues.length; i++){
			if(uniqueValues[i] != null){
				if(entity.inventory.hasItemStack(new ItemStack(uniqueValues[i], countValues[i])) || uniqueValues[i] == staffElement.getRune()){
					hasAllRunes = true;
				}else{
					return false;
				}
			}
			
		}
	
		return hasAllRunes;
		
	}
	
	public static Rune[] addToArrayRune(Rune[] uniqueValues, Rune rune){
		Rune[] returnArray = new Rune[uniqueValues.length+1];
		for(int i = 0; i < uniqueValues.length; i++){
			returnArray[i] = uniqueValues[i];		
		}
		returnArray[returnArray.length -1] = rune;
		return returnArray;
	}
	
	public static int[] addToArrayInt(int[] countValues, int newValue){
		int[] returnArray = new int[countValues.length+1];
		for(int i = 0; i < countValues.length; i++){
			returnArray[i] = countValues[i];
		}
		returnArray[returnArray.length-1] = newValue;
		return returnArray;
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
		
		wasElementCasting = elementCasting(spell);
		System.out.println(wasElementCasting);
		for (Rune i : spell.getRuneCost()) {
			System.out.println(i.getUnlocalizedName());
			System.out.println(spell.getSpellElement().getRune().getUnlocalizedName());
			
			if(!elementCasting(spell)){
				entity.inventory.consumeInventoryItem(i);
			}else if(elementCasting(spell) && i != staffElement.getRune()){
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
