package com.callumhutchy.runecraft2.blocks;

import handler.ExtendedPlayer;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.callumhutchy.runecraft2.Runecraft2;
import com.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityAdamantiteOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityCoalOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityCopperOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityGoldOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityIronOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityMithrilOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityPureEssenceOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityRuneEssenceOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityRuniteOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntitySilverOre;
import com.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityTinOre;
import com.callumhutchy.runecraft2.items.Items;

public class OreBlock extends BlockContainer {

	private int				blockID;
	public Item				itemToBeDropped;

	public String			tileEntityClass;

	public OreBlock(Material p_i45394_1_, String resourceLocation, String unlocalisedName, Item item, String tileEntity) {
		super(p_i45394_1_);
		if(unlocalisedName.contains("essence")){
		    //Nothing
		}else{
		    this.setCreativeTab(Runecraft2.tabRunecraft2Metal);
		}
		
		this.setBlockBounds(0.0625F, 0F, 0.0625F, 0.9375F, 0.8125F, 0.9375F);
		this.setHardness(3F);
		this.setHarvestLevel("pickaxe", 1);
		this.setUnlocalizedName(unlocalisedName);
		itemToBeDropped = item;
		this.setDefaultState(this.blockState.getBaseState());
		tileEntityClass = tileEntity;

	}

	// You don't want the normal render type, or it wont render properly.
	@Override
	public int getRenderType() {
		return 3;
	}

	public int quantityDropped(Random rand) {
		switch (tileEntityClass) {
		case "adamantite":
			return 1;
		case "coal":
			return 1;
		case "copper":
			return 1;
		case "gold":
			return 1;
		case "iron":
			return 1;
		case "mithril":
			return 1;
		case "runite":
			return 1;
		case "silver":
			return 1;
		case "tin":
			return 1;
		case "runeessence":

			return randInt(2, 4);
		case "pureessence":
			return randInt(2, 4);
		default:
			return 1;
		}

	}

	public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l) {
		return false;
	}

	// And this tell it that you can see through this block, and neighbour blocks
	// should be rendered.
	public boolean isOpaqueCube() {
		return false;
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		switch (tileEntityClass) {
		case "adamantite":
			return Items.adamantiteOre;
		case "coal":
			return Items.coalOre;
		case "copper":
			return Items.copperOre;
		case "gold":
			return Items.goldOre;
		case "iron":
			return Items.ironOre;
		case "mithril":
			return Items.mithrilOre;
		case "runite":
			return Items.runiteOre;
		case "silver":
			return Items.silverOre;
		case "tin":
			return Items.tinOre;
		case "runeessence":

			return Items.runeEssence;
		case "pureessence":
			return Items.pureEssence;
		default:
			return null;
		}

	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {

		switch (tileEntityClass) {
		case "adamantite":
			return new TileEntityAdamantiteOre();
		case "coal":
			return new TileEntityCoalOre();
		case "copper":
			return new TileEntityCopperOre();
		case "gold":
			return new TileEntityGoldOre();
		case "iron":
			return new TileEntityIronOre();
		case "mithril":
			return new TileEntityMithrilOre();
		case "runite":
			return new TileEntityRuniteOre();
		case "silver":
			return new TileEntitySilverOre();
		case "tin":
			return new TileEntityTinOre();
		case "runeessence":

			return new TileEntityRuneEssenceOre();
		case "pureessence":
			return new TileEntityPureEssenceOre();
		default:
			return null;
		}
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

	public void onBlockDestroyedByPlayer(World world, int varx, int vary, int varz, int p_149664_5_) {
		

		}

	

	public boolean removedByPlayer(World world, EntityPlayer player, int x, int y, int z, boolean willHarvest) {
		
		ExtendedPlayer props = ExtendedPlayer.get(player);
		switch (tileEntityClass) {
		case "adamantite":
			props.currentMiningExp = props.currentMiningExp + 95;
			
			break;
		case "coal":
			props.currentMiningExp = props.currentMiningExp + 50;
			break;
		case "copper":
			props.currentMiningExp = props.currentMiningExp + 17;
			break;
		case "gold":
			props.currentMiningExp = props.currentMiningExp + 65;
			break;
		case "iron":
			props.currentMiningExp = props.currentMiningExp + 35;
			break;
		case "mithril":
			props.currentMiningExp = props.currentMiningExp + 80;
			break;
		case "runite":
			props.currentMiningExp = props.currentMiningExp + 125;
			break;
		case "silver":
			props.currentMiningExp = props.currentMiningExp + 40;
			break;
		case "tin":
			props.currentMiningExp = props.currentMiningExp + 17;
			break;
		case "runeessence":
			int rand = randInt(1, 10);
			if (rand == 1) {
				if (!world.isRemote) {
					world.spawnEntityInWorld(new EntityItem(world, x, y + 1, z, new ItemStack(Items.airRune, 1)));
				}
			}
			props.currentMiningExp = props.currentMiningExp + 5;
			break;
		case "pureessence":
			props.currentMiningExp = props.currentMiningExp + 5;
			break;

		}
		//super.removedByPlayer(world, player, x, y, z, true);
		return true;
	}

}
