package com.callumhutchy.runecraft2.blocks;

import handler.ExtendedPlayer;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import org.lwjgl.input.Keyboard;

import reference.ExpChart;

import com.callumhutchy.runecraft2.Runecraft2;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityAirAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityAirRuneAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityAstralAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityAstralRuneAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityBloodAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityBloodRuneAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityBodyAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityBodyRuneAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityChaosAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityChaosRuneAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityCosmicAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityCosmicRuneAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityDeathAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityDeathRuneAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityEarthAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityEarthRuneAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityFireAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityFireRuneAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityLawAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityLawRuneAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityMindAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityMindRuneAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityNatureAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityNatureRuneAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityWaterAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityWaterRuneAltar;
import com.callumhutchy.runecraft2.items.Items;
import com.callumhutchy.runecraft2.items.Staff;
import com.callumhutchy.runecraft2.items.Talisman;
import com.callumhutchy.runecraft2.items.TalismanStaff;

public class Altar extends BlockContainer {

    public Item item;
    public String tileEntityClass;
    public static int numberOfRuneEssences;
    public String altarName;
    public static int blocktick = 0;

    protected Altar(Material p_i45386_1_, String textureName, String unlocalisedName, String tileEntity) {
	super(p_i45386_1_);

	if (tileEntity.contains("runealtar")) {

	} else {
	    this.setCreativeTab(Runecraft2.tabRunecraft2Magic);
	}
	this.setHardness(3F);
	this.setHarvestLevel("pickaxe", 1);
	this.setDefaultState(this.blockState.getBaseState());
	this.setUnlocalizedName(unlocalisedName);
	tileEntityClass = tileEntity;
	altarName = unlocalisedName;
	this.needsRandomTick = true;

    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
	switch (altarName) {

	case "airrunealtar":
	    return Item.getItemFromBlock(Blocks.AirAltar);

	case "waterrunealtar":
	    return Item.getItemFromBlock(Blocks.WaterAltar);

	case "firerunealtar":
	    return Item.getItemFromBlock(Blocks.FireAltar);

	case "earthrunealtar":
	    return Item.getItemFromBlock(Blocks.EarthAltar);

	case "mindrunealtar":
	    return Item.getItemFromBlock(Blocks.MindAltar);

	case "bodyrunealtar":
	    return Item.getItemFromBlock(Blocks.BodyAltar);

	case "cosmicrunealtar":
	    return Item.getItemFromBlock(Blocks.CosmicAltar);

	case "chaosrunealtar":
	    return Item.getItemFromBlock(Blocks.ChaosAltar);

	case "naturerunealtar":
	    return Item.getItemFromBlock(Blocks.NatureAltar);

	case "lawrunealtar":
	    return Item.getItemFromBlock(Blocks.LawAltar);

	case "deathrunealtar":
	    return Item.getItemFromBlock(Blocks.DeathAltar);

	case "bloodrunealtar":
	    return Item.getItemFromBlock(Blocks.BloodAltar);

	case "astralrunealtar":
	    return Item.getItemFromBlock(Blocks.AstralAltar);

	default:
	    return Item.getItemFromBlock(Blocks.AirAltar);
	}

    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {

	switch (altarName) {
	case "airaltar":
	    return new TileEntityAirAltar();
	case "airrunealtar":
	    return new TileEntityAirRuneAltar();
	case "wateraltar":
	    return new TileEntityWaterAltar();
	case "waterrunealtar":
	    return new TileEntityWaterRuneAltar();
	case "firealtar":
	    return new TileEntityFireAltar();
	case "firerunealtar":
	    return new TileEntityFireRuneAltar();
	case "earthaltar":
	    return new TileEntityEarthAltar();
	case "earthrunealtar":
	    return new TileEntityEarthRuneAltar();
	case "mindaltar":
	    return new TileEntityMindAltar();
	case "mindrunealtar":
	    return new TileEntityMindRuneAltar();
	case "bodyaltar":
	    return new TileEntityBodyAltar();
	case "bodyrunealtar":
	    return new TileEntityBodyRuneAltar();
	case "cosmicaltar":
	    return new TileEntityCosmicAltar();
	case "cosmicrunealtar":
	    return new TileEntityCosmicRuneAltar();
	case "chaosaltar":
	    return new TileEntityChaosAltar();
	case "chaosrunealtar":
	    return new TileEntityChaosRuneAltar();
	case "naturealtar":
	    return new TileEntityNatureAltar();
	case "naturerunealtar":
	    return new TileEntityNatureRuneAltar();
	case "lawaltar":
	    return new TileEntityLawAltar();
	case "lawrunealtar":
	    return new TileEntityLawRuneAltar();
	case "deathaltar":
	    return new TileEntityDeathAltar();
	case "deathrunealtar":
	    return new TileEntityDeathRuneAltar();
	case "bloodaltar":
	    return new TileEntityBloodAltar();
	case "bloodrunealtar":
	    return new TileEntityBloodRuneAltar();
	case "astralaltar":
	    return new TileEntityAstralAltar();
	case "astralrunealtar":
	    return new TileEntityAstralRuneAltar();

	default:
	    return new TileEntityAirAltar();
	}

    }

    @Override
    public int getRenderType() {
	return 3;
    }

    // It's not an opaque cube, so you need this.
    @Override
    public boolean isOpaqueCube() {
	return false;
    }

    // It's not a normal block, so you need this too.
    public boolean renderAsNormalBlock() {
	return false;
    }

    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumFacing side, float hitX, float hitY, float hitZ) {
	int varx, vary, varz;
	varx = pos.getX();
	vary = pos.getY();
	varz = pos.getZ();

	if (!world.isRemote) {
	    String altarType = altarName;
	    if (blocktick == 0) {
		if (entity.inventory.getCurrentItem() != null) {
		    item = entity.getCurrentEquippedItem().getItem();
		}
		ExtendedPlayer props = ExtendedPlayer.get(entity);
		switch (altarType) {
		case "airaltar":
		    if (item == Items.runeEssence) {
			numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
			world.setBlockToAir(pos);
			world.setBlockState(pos, Blocks.AirRuneAltar.getDefaultState());
			entity.getHeldItem().stackSize = 0;
			TileEntityAirRuneAltar tileEntity = (TileEntityAirRuneAltar) world.getTileEntity(pos);
			tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
			item = null;
			tileEntity.time = 5;
		    } else {
		    }
		    break;
		case "wateraltar":
		    if (item == Items.runeEssence) {
			numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
			world.setBlockToAir(pos);
			world.setBlockState(pos, Blocks.WaterRuneAltar.getDefaultState());
			entity.getHeldItem().stackSize = 0;
			TileEntityWaterRuneAltar tileEntity = (TileEntityWaterRuneAltar) world.getTileEntity(pos);
			tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
			item = null;
		    } else {
		    }
		    break;
		case "firealtar":
		    if (item == Items.runeEssence) {
			numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
			world.setBlockToAir(pos);
			world.setBlockState(pos, Blocks.FireRuneAltar.getDefaultState());
			entity.getHeldItem().stackSize = 0;
			TileEntityFireRuneAltar tileEntity = (TileEntityFireRuneAltar) world.getTileEntity(pos);
			tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
			item = null;
		    } else {
		    }
		    break;
		case "earthaltar":
		    if (item == Items.runeEssence) {
			numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
			world.setBlockToAir(new BlockPos(varx, vary, varz));
			world.setBlockState(new BlockPos(varx, vary, varz), Blocks.EarthRuneAltar.getDefaultState());
			entity.getHeldItem().stackSize = 0;
			TileEntityEarthRuneAltar tileEntity = (TileEntityEarthRuneAltar) world.getTileEntity(pos);
			tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
			item = null;
		    } else {
		    }
		    break;
		case "mindaltar":
		    if (item == Items.runeEssence) {
			numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
			world.setBlockToAir(new BlockPos(varx, vary, varz));
			world.setBlockState(new BlockPos(varx, vary, varz), Blocks.MindRuneAltar.getDefaultState());
			entity.getHeldItem().stackSize = 0;
			TileEntityMindRuneAltar tileEntity = (TileEntityMindRuneAltar) world.getTileEntity(pos);
			tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
			item = null;
		    }
		    break;
		case "bodyaltar":
		    if (item == Items.runeEssence) {
			numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
			world.setBlockToAir(new BlockPos(varx, vary, varz));
			world.setBlockState(new BlockPos(varx, vary, varz), Blocks.BodyRuneAltar.getDefaultState());
			entity.getHeldItem().stackSize = 0;
			TileEntityBodyRuneAltar tileEntity = (TileEntityBodyRuneAltar) world.getTileEntity(pos);
			tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
			item = null;
		    }
		    break;
		case "cosmicaltar":
		    if (item == Items.pureEssence) {
			numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
			world.setBlockToAir(new BlockPos(varx, vary, varz));
			world.setBlockState(new BlockPos(varx, vary, varz), Blocks.CosmicRuneAltar.getDefaultState());
			entity.getHeldItem().stackSize = 0;
			TileEntityCosmicRuneAltar tileEntity = (TileEntityCosmicRuneAltar) world.getTileEntity(pos);
			tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
			item = null;
		    }
		    break;
		case "chaosaltar":
		    if (item == Items.pureEssence) {
			numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
			world.setBlockToAir(new BlockPos(varx, vary, varz));
			world.setBlockState(new BlockPos(varx, vary, varz), Blocks.ChaosRuneAltar.getDefaultState());
			entity.getHeldItem().stackSize = 0;
			TileEntityChaosRuneAltar tileEntity = (TileEntityChaosRuneAltar) world.getTileEntity(pos);
			tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
			item = null;
		    }
		    break;
		case "naturealtar":
		    if (item == Items.pureEssence) {
			numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
			world.setBlockToAir(new BlockPos(varx, vary, varz));
			world.setBlockState(new BlockPos(varx, vary, varz), Blocks.NatureRuneAltar.getDefaultState());
			entity.getHeldItem().stackSize = 0;
			TileEntityNatureRuneAltar tileEntity = (TileEntityNatureRuneAltar) world.getTileEntity(pos);
			tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
			item = null;
		    }
		    break;
		case "lawaltar":
		    if (item == Items.pureEssence) {
			numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
			world.setBlockToAir(new BlockPos(varx, vary, varz));
			world.setBlockState(new BlockPos(varx, vary, varz), Blocks.LawRuneAltar.getDefaultState());
			entity.getHeldItem().stackSize = 0;
			TileEntityLawRuneAltar tileEntity = (TileEntityLawRuneAltar) world.getTileEntity(pos);
			tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
			item = null;
		    }
		    break;
		case "deathaltar":
		    if (item == Items.pureEssence) {
			numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
			world.setBlockToAir(new BlockPos(varx, vary, varz));
			world.setBlockState(new BlockPos(varx, vary, varz), Blocks.DeathRuneAltar.getDefaultState());
			entity.getHeldItem().stackSize = 0;
			TileEntityDeathRuneAltar tileEntity = (TileEntityDeathRuneAltar) world.getTileEntity(pos);
			tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
			item = null;
		    }
		    break;
		case "bloodaltar":
		    if (item == Items.pureEssence) {
			numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
			world.setBlockToAir(new BlockPos(varx, vary, varz));
			world.setBlockState(new BlockPos(varx, vary, varz), Blocks.BloodRuneAltar.getDefaultState());
			entity.getHeldItem().stackSize = 0;
			TileEntityBloodRuneAltar tileEntity = (TileEntityBloodRuneAltar) world.getTileEntity(pos);
			tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
			item = null;
		    }
		    break;
		case "astralaltar":
		    if (item == Items.pureEssence) {
			numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
			world.setBlockToAir(new BlockPos(varx, vary, varz));
			world.setBlockState(new BlockPos(varx, vary, varz), Blocks.AstralRuneAltar.getDefaultState());
			entity.getHeldItem().stackSize = 0;
			TileEntityAstralRuneAltar tileEntity = (TileEntityAstralRuneAltar) world.getTileEntity(pos);
			tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
			item = null;
		    }
		    break;
		// ///////////////////////////////////////////////////////////////////////////////////////////////////
		case "airrunealtar":
		    try {
			if (props.isSkillHighEnough("runecrafting", 1)) {
			    TileEntityAirRuneAltar tileEntity = (TileEntityAirRuneAltar) world.getTileEntity(pos);
			    if (!(item == Items.airTalisman || item == Items.airTalismanStaff) && world.getBlockState(pos) == Blocks.AirRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.runeEssence, tileEntity.quantityOfRuneEssence)));
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.AirAltar.getDefaultState());
			    }
			    if ((item == Items.airTalisman || (item == Items.airTalismanStaff)) && world.getBlockState(pos) == Blocks.AirRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.airRune, tileEntity.quantityOfRuneEssence)));
				props.currentRunecraftingExp = props.currentRunecraftingExp + tileEntity.quantityOfRuneEssence * ExpChart.AIR_RUNE_EXP;
				if (!props.suppressExpMessages) {
				    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You gained " + tileEntity.quantityOfRuneEssence * ExpChart.AIR_RUNE_EXP + " Runecrafting Experience."));
				}
				if (numberOfRuneEssences >= 5) {
				    int randomint = randInt(1, 5);
				    if (randomint == 1) {
					int randomRune = randInt(0, 2);
					switch (randomRune) {
					case 0:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.waterRune, 1)));
					    break;
					case 1:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.fireRune, 1)));
					    break;
					case 2:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.earthRune, 1)));
					    break;
					}
				    }
				    randomint = 10;
				    item = null;
				}
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.AirAltar.getDefaultState());
			    }
			}
		    } catch (Exception e) {
			System.out.println("Altar threw error.");
		    } finally {
		    }
		    break;
		// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		case "waterrunealtar":
		    try {
			if (props.isSkillHighEnough("runecrafting", 1)) {
			    TileEntityWaterRuneAltar tileEntity = (TileEntityWaterRuneAltar) world.getTileEntity(pos);
			    if (!(item == Items.waterTalisman || item == Items.waterTalismanStaff) && world.getBlockState(pos) == Blocks.WaterRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.runeEssence, tileEntity.quantityOfRuneEssence)));
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.WaterAltar.getDefaultState());
			    }
			    if ((item == Items.waterTalisman || (item == Items.waterTalismanStaff)) && world.getBlockState(pos) == Blocks.WaterRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.waterRune, tileEntity.quantityOfRuneEssence)));
				props.currentRunecraftingExp = props.currentRunecraftingExp + tileEntity.quantityOfRuneEssence * ExpChart.WATER_RUNE_EXP;
				if (!props.suppressExpMessages) {
				    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You gained " + tileEntity.quantityOfRuneEssence * ExpChart.WATER_RUNE_EXP + " Runecrafting Experience."));
				}
				if (numberOfRuneEssences >= 5) {
				    int randomint = randInt(1, 5);
				    if (randomint == 1) {
					int randomRune = randInt(0, 2);
					switch (randomRune) {
					case 0:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.waterRune, 1)));
					    break;
					case 1:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.fireRune, 1)));
					    break;
					case 2:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.earthRune, 1)));
					    break;
					}
				    }
				    randomint = 10;
				    item = null;
				}
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.WaterAltar.getDefaultState());
			    }
			}
		    } catch (Exception e) {
			System.out.println("Altar threw error.");
		    } finally {
		    }
		    break;
		case "firerunealtar":
		    try {
			if (props.isSkillHighEnough("runecrafting", 1)) {
			    TileEntityFireRuneAltar tileEntity = (TileEntityFireRuneAltar) world.getTileEntity(pos);
			    if (!(item == Items.fireTalisman || item == Items.fireTalismanStaff) && world.getBlockState(pos) == Blocks.FireRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.runeEssence, tileEntity.quantityOfRuneEssence)));
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.FireAltar.getDefaultState());
			    }
			    if ((item == Items.fireTalisman || (item == Items.fireTalismanStaff)) && world.getBlockState(pos) == Blocks.FireRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.fireRune, tileEntity.quantityOfRuneEssence)));
				props.currentRunecraftingExp = props.currentRunecraftingExp + tileEntity.quantityOfRuneEssence * ExpChart.FIRE_RUNE_EXP;
				if (!props.suppressExpMessages) {
				    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You gained " + tileEntity.quantityOfRuneEssence * ExpChart.FIRE_RUNE_EXP + " Runecrafting Experience."));
				}
				if (numberOfRuneEssences >= 5) {
				    int randomint = randInt(1, 5);
				    if (randomint == 1) {
					int randomRune = randInt(0, 2);
					switch (randomRune) {
					case 0:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.waterRune, 1)));
					    break;
					case 1:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.fireRune, 1)));
					    break;
					case 2:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.earthRune, 1)));
					    break;
					}
				    }
				    randomint = 10;
				    item = null;
				}
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.FireAltar.getDefaultState());
			    }
			}
		    } catch (Exception e) {
			System.out.println("Altar threw error.");
		    } finally {
		    }
		    break;
		case "earthrunealtar":
		    try {
			if (props.isSkillHighEnough("runecrafting", 1)) {
			    TileEntityEarthRuneAltar tileEntity = (TileEntityEarthRuneAltar) world.getTileEntity(pos);
			    if (!(item == Items.earthTalisman || item == Items.earthTalismanStaff) && world.getBlockState(pos) == Blocks.EarthRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.runeEssence, tileEntity.quantityOfRuneEssence)));
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.EarthAltar.getDefaultState());
			    }
			    if ((item == Items.earthTalisman || (item == Items.earthTalismanStaff)) && world.getBlockState(pos) == Blocks.EarthRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.earthRune, tileEntity.quantityOfRuneEssence)));
				props.currentRunecraftingExp = props.currentRunecraftingExp + tileEntity.quantityOfRuneEssence * ExpChart.EARTH_RUNE_EXP;
				if (!props.suppressExpMessages) {
				    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You gained " + tileEntity.quantityOfRuneEssence * ExpChart.EARTH_RUNE_EXP + " Runecrafting Experience."));
				}
				if (numberOfRuneEssences >= 5) {
				    int randomint = randInt(1, 5);
				    if (randomint == 1) {
					int randomRune = randInt(0, 1);
					switch (randomRune) {
					case 0:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.mindRune, 1)));
					    break;
					case 1:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.bodyRune, 1)));
					    break;
					}
				    }
				    randomint = 10;
				    item = null;
				}
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.EarthAltar.getDefaultState());
			    }
			}
		    } catch (Exception e) {
			System.out.println("Altar threw error.");
		    } finally {
		    }
		    break;
		case "mindrunealtar":

		    try {
			if (props.isSkillHighEnough("runecrafting", 1)) {
			    TileEntityMindRuneAltar tileEntity = (TileEntityMindRuneAltar) world.getTileEntity(pos);
			    if (!(item == Items.mindTalisman || item == Items.mindTalismanStaff) && world.getBlockState(pos) == Blocks.MindRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.runeEssence, tileEntity.quantityOfRuneEssence)));
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.MindAltar.getDefaultState());
			    }
			    if ((item == Items.mindTalisman || (item == Items.mindTalismanStaff)) && world.getBlockState(pos) == Blocks.MindRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.mindRune, tileEntity.quantityOfRuneEssence)));
				props.currentRunecraftingExp = props.currentRunecraftingExp + tileEntity.quantityOfRuneEssence * ExpChart.MIND_RUNE_EXP;
				if (!props.suppressExpMessages) {
				    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You gained " + tileEntity.quantityOfRuneEssence * ExpChart.MIND_RUNE_EXP + " Runecrafting Experience."));
				}
				if (numberOfRuneEssences >= 5) {
				    int randomint = randInt(1, 5);
				    if (randomint == 1) {
					int randomRune = randInt(0, 2);
					switch (randomRune) {
					case 0:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.natureRune, 1)));
					    break;
					case 1:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.lawRune, 1)));
					    break;
					case 2:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.cosmicRune, 1)));
					    break;
					}
				    }
				    randomint = 10;
				    item = null;
				}
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.MindAltar.getDefaultState());
			    }
			}
		    } catch (Exception e) {
			System.out.println("Altar threw error.");
		    } finally {
		    }
		    break;
		case "bodyrunealtar":
		    try {
			if (props.isSkillHighEnough("runecrafting", 1)) {
			    TileEntityBodyRuneAltar tileEntity = (TileEntityBodyRuneAltar) world.getTileEntity(pos);
			    if (!(item == Items.bodyTalisman || item == Items.bodyTalismanStaff) && world.getBlockState(pos) == Blocks.BodyRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.runeEssence, tileEntity.quantityOfRuneEssence)));
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.BodyAltar.getDefaultState());
			    }
			    if ((item == Items.bodyTalisman || (item == Items.bodyTalismanStaff)) && world.getBlockState(pos) == Blocks.BodyRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.bodyRune, tileEntity.quantityOfRuneEssence)));
				props.currentRunecraftingExp = props.currentRunecraftingExp + tileEntity.quantityOfRuneEssence * ExpChart.BODY_RUNE_EXP;
				if (!props.suppressExpMessages) {
				    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You gained " + tileEntity.quantityOfRuneEssence * ExpChart.BODY_RUNE_EXP + " Runecrafting Experience."));
				}
				if (numberOfRuneEssences >= 5) {
				    int randomint = randInt(1, 5);
				    if (randomint == 1) {
					int randomRune = randInt(0, 2);
					switch (randomRune) {
					case 0:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.natureRune, 1)));
					    break;
					case 1:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.lawRune, 1)));
					    break;
					case 2:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.cosmicRune, 1)));
					    break;
					}
				    }
				    randomint = 10;
				    item = null;
				}
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.BodyAltar.getDefaultState());
			    }
			}
		    } catch (Exception e) {
			System.out.println("Altar threw error.");
		    } finally {
		    }
		    break;
		case "cosmicrunealtar":
		    try {
			if (props.isSkillHighEnough("runecrafting", 1)) {
			    TileEntityCosmicRuneAltar tileEntity = (TileEntityCosmicRuneAltar) world.getTileEntity(pos);
			    if (!(item == Items.cosmicTalisman || item == Items.cosmicTalismanStaff) && world.getBlockState(pos) == Blocks.CosmicRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.runeEssence, tileEntity.quantityOfRuneEssence)));
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.CosmicAltar.getDefaultState());
			    }
			    if ((item == Items.cosmicTalisman || (item == Items.cosmicTalismanStaff)) && world.getBlockState(pos) == Blocks.CosmicRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.cosmicRune, tileEntity.quantityOfRuneEssence)));
				props.currentRunecraftingExp = props.currentRunecraftingExp + tileEntity.quantityOfRuneEssence * ExpChart.COSMIC_RUNE_EXP;
				if (!props.suppressExpMessages) {
				    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You gained " + tileEntity.quantityOfRuneEssence * ExpChart.COSMIC_RUNE_EXP + " Runecrafting Experience."));
				}
				if (numberOfRuneEssences >= 5) {
				    int randomint = randInt(1, 5);
				    if (randomint == 1) {
					int randomRune = randInt(0, 1);
					switch (randomRune) {
					case 0:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.chaosRune, 1)));
					    break;
					case 1:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.deathRune, 1)));
					    break;
					}
				    }
				    randomint = 10;
				    item = null;
				}
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.CosmicAltar.getDefaultState());
			    }
			}
		    } catch (Exception e) {
			System.out.println("Altar threw error.");
		    } finally {
		    }
		    break;
		case "chaosrunealtar":
		    try {
			if (props.isSkillHighEnough("runecrafting", 1)) {
			    TileEntityChaosRuneAltar tileEntity = (TileEntityChaosRuneAltar) world.getTileEntity(pos);
			    if (!(item == Items.chaosTalisman || item == Items.chaosTalismanStaff) && world.getBlockState(pos) == Blocks.ChaosRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.runeEssence, tileEntity.quantityOfRuneEssence)));
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.ChaosAltar.getDefaultState());
			    }
			    if ((item == Items.chaosTalisman || (item == Items.chaosTalismanStaff)) && world.getBlockState(pos) == Blocks.ChaosRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.chaosRune, tileEntity.quantityOfRuneEssence)));
				props.currentRunecraftingExp = props.currentRunecraftingExp + tileEntity.quantityOfRuneEssence * ExpChart.CHAOS_RUNE_EXP;
				if (!props.suppressExpMessages) {
				    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You gained " + tileEntity.quantityOfRuneEssence * ExpChart.CHAOS_RUNE_EXP + " Runecrafting Experience."));
				}
				    item = null;
				}
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.ChaosAltar.getDefaultState());
			    }
			
		    } catch (Exception e) {
			System.out.println("Altar threw error.");
		    } finally {
		    }
		    break;
		case "naturerunealtar":
		    try {
			if (props.isSkillHighEnough("runecrafting", 1)) {
			    TileEntityNatureRuneAltar tileEntity = (TileEntityNatureRuneAltar) world.getTileEntity(pos);
			    if (!(item == Items.natureTalisman || item == Items.natureTalismanStaff) && world.getBlockState(pos) == Blocks.NatureRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.runeEssence, tileEntity.quantityOfRuneEssence)));
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.NatureAltar.getDefaultState());
			    }
			    if ((item == Items.natureTalisman || (item == Items.natureTalismanStaff)) && world.getBlockState(pos) == Blocks.NatureRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.natureRune, tileEntity.quantityOfRuneEssence)));
				props.currentRunecraftingExp = props.currentRunecraftingExp + tileEntity.quantityOfRuneEssence * ExpChart.NATURE_RUNE_EXP;
				if (!props.suppressExpMessages) {
				    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You gained " + tileEntity.quantityOfRuneEssence * ExpChart.NATURE_RUNE_EXP + " Runecrafting Experience."));
				}
				if (numberOfRuneEssences >= 5) {
				    int randomint = randInt(1, 5);
				    if (randomint == 1) {
					int randomRune = randInt(0, 1);
					switch (randomRune) {
					case 0:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.chaosRune, 1)));
					    break;
					case 1:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.deathRune, 1)));
					    break;
					}
				    }
				    randomint = 10;
				    item = null;
				}
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.NatureAltar.getDefaultState());
			    }
			}
		    } catch (Exception e) {
			System.out.println("Altar threw error.");
		    } finally {
		    }
		    break;
		case "lawrunealtar":
		    try {
			if (props.isSkillHighEnough("runecrafting", 1)) {
			    TileEntityLawRuneAltar tileEntity = (TileEntityLawRuneAltar) world.getTileEntity(pos);
			    if (!(item == Items.lawTalisman || item == Items.lawTalismanStaff) && world.getBlockState(pos) == Blocks.LawRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.runeEssence, tileEntity.quantityOfRuneEssence)));
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.LawAltar.getDefaultState());
			    }
			    if ((item == Items.lawTalisman || (item == Items.lawTalismanStaff)) && world.getBlockState(pos) == Blocks.LawRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.lawRune, tileEntity.quantityOfRuneEssence)));
				props.currentRunecraftingExp = props.currentRunecraftingExp + tileEntity.quantityOfRuneEssence * ExpChart.LAW_RUNE_EXP;
				if (!props.suppressExpMessages) {
				    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You gained " + tileEntity.quantityOfRuneEssence * ExpChart.LAW_RUNE_EXP + " Runecrafting Experience."));
				}
				if (numberOfRuneEssences >= 5) {
				    int randomint = randInt(1, 5);
				    if (randomint == 1) {
					int randomRune = randInt(0, 1);
					switch (randomRune) {
					case 0:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.chaosRune, 1)));
					    break;
					case 1:
					    world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.deathRune, 1)));
					    break;
					}
				    }
				    randomint = 10;
				    item = null;
				}
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.LawAltar.getDefaultState());
			    }
			}
		    } catch (Exception e) {
			System.out.println("Altar threw error.");
		    } finally {
		    }
		    break;
		case "deathrunealtar":
		    try {
			if (props.isSkillHighEnough("runecrafting", 1)) {
			    TileEntityDeathRuneAltar tileEntity = (TileEntityDeathRuneAltar) world.getTileEntity(pos);
			    if (!(item == Items.deathTalisman || item == Items.deathTalismanStaff) && world.getBlockState(pos) == Blocks.DeathRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.runeEssence, tileEntity.quantityOfRuneEssence)));
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.DeathAltar.getDefaultState());
			    }
			    if ((item == Items.deathTalisman || (item == Items.deathTalismanStaff)) && world.getBlockState(pos) == Blocks.DeathRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.deathRune, tileEntity.quantityOfRuneEssence)));
				props.currentRunecraftingExp = props.currentRunecraftingExp + tileEntity.quantityOfRuneEssence * ExpChart.DEATH_RUNE_EXP;
				if (!props.suppressExpMessages) {
				    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You gained " + tileEntity.quantityOfRuneEssence * ExpChart.DEATH_RUNE_EXP + " Runecrafting Experience."));
				}
				    item = null;
				}
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.DeathAltar.getDefaultState());
			    }
		    } catch (Exception e) {
			System.out.println("Altar threw error.");
		    } finally {
		    }
		    break;
		case "bloodrunealtar":
		    try {
			if (props.isSkillHighEnough("runecrafting", 1)) {
			    TileEntityBloodRuneAltar tileEntity = (TileEntityBloodRuneAltar) world.getTileEntity(pos);
			    if (!(item == Items.bloodTalisman || item == Items.bloodTalismanStaff) && world.getBlockState(pos) == Blocks.BloodRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.pureEssence, tileEntity.quantityOfRuneEssence)));
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.BloodAltar.getDefaultState());
			    }
			    if ((item == Items.bloodTalisman || (item == Items.bloodTalismanStaff)) && world.getBlockState(pos) == Blocks.BloodRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.bloodRune, tileEntity.quantityOfRuneEssence)));
				props.currentRunecraftingExp = props.currentRunecraftingExp + tileEntity.quantityOfRuneEssence * ExpChart.BLOOD_RUNE_EXP;
				if (!props.suppressExpMessages) {
				    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You gained " + tileEntity.quantityOfRuneEssence * ExpChart.BLOOD_RUNE_EXP + " Runecrafting Experience."));
				}
				    item = null;
				}
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.BloodAltar.getDefaultState());
			    }
		    } catch (Exception e) {
			System.out.println("Altar threw error.");
		    } finally {
		    }
		    break;
		case "astralrunealtar":
		    try {
			if (props.isSkillHighEnough("runecrafting", 1)) {
			    TileEntityAstralRuneAltar tileEntity = (TileEntityAstralRuneAltar) world.getTileEntity(pos);
			    if (!(item == Items.astralTalisman) && world.getBlockState(pos) == Blocks.AstralRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.pureEssence, tileEntity.quantityOfRuneEssence)));
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.AstralAltar.getDefaultState());
			    }
			    if ((item == Items.astralTalisman) && world.getBlockState(pos) == Blocks.AstralRuneAltar.getDefaultState()) {
				world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.astralRune, tileEntity.quantityOfRuneEssence)));
				props.currentRunecraftingExp = props.currentRunecraftingExp + tileEntity.quantityOfRuneEssence * ExpChart.ASTRAL_RUNE_EXP;
				if (!props.suppressExpMessages) {
				    Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You gained " + tileEntity.quantityOfRuneEssence * ExpChart.ASTRAL_RUNE_EXP + " Runecrafting Experience."));
				}
				
				    item = null;
				}
				world.setBlockToAir(new BlockPos(varx, vary, varz));
				world.setBlockState(new BlockPos(varx, vary, varz), Blocks.AstralAltar.getDefaultState());
			    }
			
		    } catch (Exception e) {
			System.out.println("Altar threw error.");
		    } finally {
		    }
		    break;
		default:
		    ;
		}

		item = null;
		blocktick = 20;
	    }
	}
	return true;
    }

    public static int randInt(int min, int max) {

	// NOTE: Usually this should be a field rather than a method
	// variable so that it is not re-seeded every call.
	Random rand = new Random();

	// nextInt is normally exclusive of the top value,
	// so add 1 to make it inclusive
	int randomNum = rand.nextInt((max - min) + 1) + min;

	return randomNum;
    }

}
