package uk.co.callumhutchy.runecraft2.blocks;

import java.util.Random;

import handler.ExtendedPlayer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import uk.co.callumhutchy.runecraft2.Runecraft2;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityAdamantiteOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityCoalOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityCopperOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityGoldOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityIronOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityMithrilOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityPureEssenceOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityRuneEssenceOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityRuniteOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntitySilverOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityTinOre;
import uk.co.callumhutchy.runecraft2.items.Items;

public class OreBlock extends Block {

	private int blockID;
	public String tileEntityClass;
	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;

	protected OreBlock(Material mat, String resourceLocation, String unlocalisedName, Item drop, int meta,
			int least_quantity, int most_quantity, String tileEntity) {
		super(mat);
		this.drop = drop;
		this.meta = meta;
		this.least_quantity = least_quantity;
		this.most_quantity = most_quantity;

		this.setCreativeTab(Runecraft2.tabRunecraft2Metal);

		this.setBlockBounds(0.0625F, 0F, 0.0625F, 0.9375F, 0.8125F, 0.9375F);
		this.setHardness(3F);
		this.setHarvestLevel("pickaxe", 1);
		this.setUnlocalizedName(unlocalisedName);
		this.setDefaultState(this.blockState.getBaseState());
		tileEntityClass = tileEntity;

	}

	// You don't want the normal render type, or it wont render properly.
	@Override
	public int getRenderType() {
		return 3;
	}

	public int quantityDropped(Random rand) {
		return this.least_quantity;
	}

	public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l) {
		return false;
	}

	// And this tell it that you can see through this block, and neighbour
	// blocks
	// should be rendered.
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	 public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
		switch (tileEntityClass) {
		case "adamantiteore":
			return Items.adamantiteOre;
		case "coalore":
			return Items.coalOre;
		case "copperore":
			return Items.copperOre;
		case "goldore":
			return Items.goldOre;
		case "ironore":
			return Items.ironOre;
		case "mithrilore":
			return Items.mithrilOre;
		case "runiteore":
			return Items.runiteOre;
		case "silverore":
			return Items.silverOre;
		case "tinore":
			return Items.tinOre;
		case "runeessenceore":
			return Items.runeEssence;
		case "pureessenceore":
			return Items.pureEssence;
		default:
			return null;
		}
    }

	public TileEntity createNewTileEntity(World var1, int var2) {

		switch (tileEntityClass) {
		case "adamantiteore":
			return new TileEntityAdamantiteOre();
		case "coalore":
			return new TileEntityCoalOre();
		case "copperore":
			return new TileEntityCopperOre();
		case "goldore":
			return new TileEntityGoldOre();
		case "ironore":
			return new TileEntityIronOre();
		case "mithrilore":
			return new TileEntityMithrilOre();
		case "runiteore":
			return new TileEntityRuniteOre();
		case "silverore":
			return new TileEntitySilverOre();
		case "tinore":
			return new TileEntityTinOre();
		case "runeessenceore":
			return new TileEntityRuneEssenceOre();
		case "pureessenceore":
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
		// super.removedByPlayer(world, player, x, y, z, true);
		return true;
	}

}
