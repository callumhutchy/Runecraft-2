package com.callumhutchy.runecraft2.blocks;

import java.util.Random;

import reference.Reference;

import com.callumhutchy.runecraft2.Runecraft2;
import com.callumhutchy.runecraft2.blocks.models.AltarModel;
import com.callumhutchy.runecraft2.blocks.models.AltarRuneModel;
import com.callumhutchy.runecraft2.blocks.models.OreModel;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityAltar;
import com.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityAltarRune;
import com.callumhutchy.runecraft2.items.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockRedstoneOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Altar extends BlockContainer {

	public Item			itemToBeDropped;
	public Item			item;
	public String		tileEntityClass;
	public static int	numberOfRuneEssences;
	public Random		random;

	protected Altar(Material p_i45386_1_, String textureName, String unlocalisedName, String tileEntity) {
		super(p_i45386_1_);
		this.setCreativeTab(Runecraft2.tabRunecraft2Magic);
		this.setHardness(3F);
        this.setHarvestLevel("pickaxe", 1);
		this.setBlockName(unlocalisedName);
		this.setBlockTextureName(textureName);
		
		
		tileEntityClass = tileEntity;

	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		switch (tileEntityClass) {
		case "altar":
			return new TileEntityAltar();
		case "altarrune":
			return new TileEntityAltarRune();
		default:
			return new TileEntityAltar();
		}

	}

	@Override
	public int getRenderType() {
		return -1;
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

	

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":"
				+ this.getUnlocalizedName().substring(5));
	}

	public boolean onBlockActivated(World world, int varx, int vary, int varz,
			EntityPlayer entity, int p_149727_6_, float p_149727_7_,
			float p_149727_8_, float p_149727_9_) {

		if (entity.inventory.getCurrentItem() != null) {
			item = entity.inventory.getCurrentItem().getItem();
		}
		if (item == Items.runeEssence && tileEntityClass == "altar") {
			numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
			System.out.println(numberOfRuneEssences);
			world.setBlockToAir(varx, vary, varz);
			world.setBlock(varx, vary, varz, Blocks.AltarRune);
		}

		if (tileEntityClass == "altarrune") {
			if (!world.isRemote) {
				if (item == Items.airTalisman) {
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.Altar);
					world.spawnEntityInWorld(new EntityItem(world, varx,
							vary + 1, varz, new ItemStack(Items.airRune,
									numberOfRuneEssences)));

					if (numberOfRuneEssences >= 5) {
						int randomint = randInt(1, 5);
						if (randomint == 1) {
							int randomRune = randInt(0, 2);
							switch (randomRune) {
							case 0:
								world.spawnEntityInWorld(new EntityItem(world,
										varx, vary + 1, varz, new ItemStack(
												Items.waterRune, 1)));
								break;
							case 1:
								world.spawnEntityInWorld(new EntityItem(world,
										varx, vary + 1, varz, new ItemStack(
												Items.fireRune, 1)));
								break;
							case 2:
								world.spawnEntityInWorld(new EntityItem(world,
										varx, vary + 1, varz, new ItemStack(
												Items.earthRune, 1)));
								break;
							}
						}
						randomint = 10;

					}
				}
				if (item == Items.waterTalisman) {
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.Altar);
					world.spawnEntityInWorld(new EntityItem(world, varx,
							vary + 1, varz, new ItemStack(Items.waterRune,
									numberOfRuneEssences)));
					
					if (numberOfRuneEssences >= 5) {
						int randomint = randInt(1, 5);
						if (randomint == 1) {
							int randomRune = randInt(0, 1);
							switch (randomRune) {
							case 0:
								world.spawnEntityInWorld(new EntityItem(world,
										varx, vary + 1, varz, new ItemStack(
												Items.mindRune, 1)));
								break;
							case 1:
								world.spawnEntityInWorld(new EntityItem(world,
										varx, vary + 1, varz, new ItemStack(
												Items.bodyRune, 1)));
								break;
							}
						}
						randomint = 10;

					}
				}
				if (item == Items.fireTalisman) {
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.Altar);
					world.spawnEntityInWorld(new EntityItem(world, varx,
							vary + 1, varz, new ItemStack(Items.fireRune,
									numberOfRuneEssences)));
					
					if (numberOfRuneEssences >= 5) {
						int randomint = randInt(1, 5);
						if (randomint == 1) {
							int randomRune = randInt(0, 1);
							switch (randomRune) {
							case 0:
								world.spawnEntityInWorld(new EntityItem(world,
										varx, vary + 1, varz, new ItemStack(
												Items.mindRune, 1)));
								break;
							case 1:
								world.spawnEntityInWorld(new EntityItem(world,
										varx, vary + 1, varz, new ItemStack(
												Items.bodyRune, 1)));
								break;
							}
						}
						randomint = 10;

					}
				}
				if (item == Items.earthTalisman) {
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.Altar);
					world.spawnEntityInWorld(new EntityItem(world, varx,
							vary + 1, varz, new ItemStack(Items.earthRune,
									numberOfRuneEssences)));
					
					if (numberOfRuneEssences >= 5) {
						int randomint = randInt(1, 5);
						if (randomint == 1) {
							int randomRune = randInt(0, 1);
							switch (randomRune) {
							case 0:
								world.spawnEntityInWorld(new EntityItem(world,
										varx, vary + 1, varz, new ItemStack(
												Items.mindRune, 1)));
								break;
							case 1:
								world.spawnEntityInWorld(new EntityItem(world,
										varx, vary + 1, varz, new ItemStack(
												Items.bodyRune, 1)));
								break;
							}
						}
						randomint = 10;

					}
				}
				if (item == Items.mindTalisman) {
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.Altar);
					world.spawnEntityInWorld(new EntityItem(world, varx,
							vary + 1, varz, new ItemStack(Items.mindRune,
									numberOfRuneEssences)));
					
					if (numberOfRuneEssences >= 5) {
						int randomint = randInt(1, 10);
						if (randomint == 1) {
							int randomRune = randInt(0, 4);
							switch (randomRune) {
							case 0:
								world.spawnEntityInWorld(new EntityItem(world,
										varx, vary + 1, varz, new ItemStack(
												Items.cosmicRune, 1)));
								break;
							case 1:
								world.spawnEntityInWorld(new EntityItem(world,
										varx, vary + 1, varz, new ItemStack(
												Items.chaosRune, 1)));
								break;
							case 2: world.spawnEntityInWorld(new EntityItem(world,
									varx, vary + 1, varz, new ItemStack(
											Items.natureRune, 1)));
								break;
							case 3: world.spawnEntityInWorld(new EntityItem(world,
									varx, vary + 1, varz, new ItemStack(
											Items.lawRune, 1)));
								break;
							case 4: world.spawnEntityInWorld(new EntityItem(world,
									varx, vary + 1, varz, new ItemStack(
											Items.deathRune, 1)));
								break;
							}
						}
						randomint = 10;

					}
				}
				if (item == Items.bodyTalisman) {
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.Altar);
					world.spawnEntityInWorld(new EntityItem(world, varx,
							vary + 1, varz, new ItemStack(Items.bodyRune,
									numberOfRuneEssences)));
					
					if (numberOfRuneEssences >= 5) {
						int randomint = randInt(1, 10);
						if (randomint == 1) {
							int randomRune = randInt(0, 4);
							switch (randomRune) {
							case 0:
								world.spawnEntityInWorld(new EntityItem(world,
										varx, vary + 1, varz, new ItemStack(
												Items.cosmicRune, 1)));
								break;
							case 1:
								world.spawnEntityInWorld(new EntityItem(world,
										varx, vary + 1, varz, new ItemStack(
												Items.chaosRune, 1)));
								break;
							case 2: world.spawnEntityInWorld(new EntityItem(world,
									varx, vary + 1, varz, new ItemStack(
											Items.natureRune, 1)));
								break;
							case 3: world.spawnEntityInWorld(new EntityItem(world,
									varx, vary + 1, varz, new ItemStack(
											Items.lawRune, 1)));
								break;
							case 4: world.spawnEntityInWorld(new EntityItem(world,
									varx, vary + 1, varz, new ItemStack(
											Items.deathRune, 1)));
								break;
							}
						}
						randomint = 10;

					}
				}
				if (item == Items.cosmicTalisman) {
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.Altar);
					world.spawnEntityInWorld(new EntityItem(world, varx,
							vary + 1, varz, new ItemStack(Items.cosmicRune,
									numberOfRuneEssences)));
				}
				if (item == Items.chaosTalisman) {
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.Altar);
					world.spawnEntityInWorld(new EntityItem(world, varx,
							vary + 1, varz, new ItemStack(Items.chaosRune,
									numberOfRuneEssences)));
				}
				if (item == Items.natureTalisman) {
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.Altar);
					world.spawnEntityInWorld(new EntityItem(world, varx,
							vary + 1, varz, new ItemStack(Items.natureRune,
									numberOfRuneEssences)));
				}
				if (item == Items.lawTalisman) {
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.Altar);
					world.spawnEntityInWorld(new EntityItem(world, varx,
							vary + 1, varz, new ItemStack(Items.lawRune,
									numberOfRuneEssences)));
				}
				if (item == Items.deathTalisman) {
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.Altar);
					world.spawnEntityInWorld(new EntityItem(world, varx,
							vary + 1, varz, new ItemStack(Items.deathRune,
									numberOfRuneEssences)));
				}

			}
		}
		item = null;
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
