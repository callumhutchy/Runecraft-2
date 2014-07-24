package com.callumhutchy.runecraft2.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import reference.Reference;

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

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Altar extends BlockContainer {

	public Item			item;
	public String		tileEntityClass;
	public static int	numberOfRuneEssences;
	public String		altarName;

	protected Altar(Material p_i45386_1_, String textureName, String unlocalisedName, String tileEntity) {
		super(p_i45386_1_);

		if (tileEntity.contains("runealtar")) {

		} else {
			this.setCreativeTab(Runecraft2.tabRunecraft2Magic);
		}
		this.setHardness(3F);
		this.setHarvestLevel("pickaxe", 1);
		this.setBlockName(unlocalisedName);
		this.setBlockTextureName(textureName);

		tileEntityClass = tileEntity;
		altarName = unlocalisedName;

	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		
		switch(altarName){
		case"airaltar":return new TileEntityAirAltar();
		case"airrunealtar":return new TileEntityAirRuneAltar();
		case"wateraltar":return new TileEntityWaterAltar();
		case"waterrunealtar":return new TileEntityWaterRuneAltar();
		case"firealtar":return new TileEntityFireAltar();
		case"firerunealtar":return new TileEntityFireRuneAltar();
		case"earthaltar":return new TileEntityEarthAltar();
		case"earthrunealtar":return new TileEntityEarthRuneAltar();
		case"mindaltar":return new TileEntityMindAltar();
		case"mindrunealtar":return new TileEntityMindRuneAltar();
		case"bodyaltar":return new TileEntityBodyAltar();
		case"bodyrunealtar":return new TileEntityBodyRuneAltar();
		case"cosmicaltar":return new TileEntityCosmicAltar();
		case"cosmicrunealtar":return new TileEntityCosmicRuneAltar();
		case"chaosaltar":return new TileEntityChaosAltar();
		case"chaosrunealtar":return new TileEntityChaosRuneAltar();
		case"naturealtar":return new TileEntityNatureAltar();
		case"naturerunealtar":return new TileEntityNatureRuneAltar();
		case"lawaltar":return new TileEntityLawAltar();
		case"lawrunealtar":return new TileEntityLawRuneAltar();
		case"deathaltar":return new TileEntityDeathAltar();
		case"deathrunealtar":return new TileEntityDeathRuneAltar();
		case"bloodaltar":return new TileEntityBloodAltar();
		case"bloodrunealtar":return new TileEntityBloodRuneAltar();
		case"astralaltar":return new TileEntityAstralAltar();
		case"astralrunealtar":return new TileEntityAstralRuneAltar();
		
		
		default: return new TileEntityAirAltar();
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

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}

	public boolean onBlockActivated(World world, int varx, int vary, int varz, EntityPlayer entity, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {

		String altarType = altarName;

		if (entity.inventory.getCurrentItem() != null) {
			item = entity.inventory.getCurrentItem().getItem();
		}
System.out.println(altarType);
		
		switch (altarType) {
		case "airaltar":
			if (item == Items.runeEssence) {
				numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
				System.out.println(numberOfRuneEssences);
				world.setBlockToAir(varx, vary, varz);
				world.setBlock(varx, vary, varz, Blocks.AirRuneAltar);
				entity.getHeldItem().stackSize = 0;
				TileEntityAirRuneAltar tileEntity = (TileEntityAirRuneAltar) world.getTileEntity(varx, vary, varz);
				tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
				item = null;
			}
		case "wateraltar":
			if (item == Items.runeEssence) {
				numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
				System.out.println(numberOfRuneEssences);
				world.setBlockToAir(varx, vary, varz);
				world.setBlock(varx, vary, varz, Blocks.WaterRuneAltar);
				entity.getHeldItem().stackSize = 0;
				TileEntityWaterRuneAltar tileEntity = (TileEntityWaterRuneAltar) world.getTileEntity(varx, vary, varz);
				tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
				item = null;
			}
		case "firealtar":
			if (item == Items.runeEssence) {
				numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
				System.out.println(numberOfRuneEssences);
				world.setBlockToAir(varx, vary, varz);
				world.setBlock(varx, vary, varz, Blocks.FireRuneAltar);
				entity.getHeldItem().stackSize = 0;
				TileEntityFireRuneAltar tileEntity = (TileEntityFireRuneAltar) world.getTileEntity(varx, vary, varz);
				tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
				item = null;
			}
		case "earthaltar":
			if (item == Items.runeEssence) {
				numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
				System.out.println(numberOfRuneEssences);
				world.setBlockToAir(varx, vary, varz);
				world.setBlock(varx, vary, varz, Blocks.EarthRuneAltar);
				entity.getHeldItem().stackSize = 0;
				TileEntityEarthRuneAltar tileEntity = (TileEntityEarthRuneAltar) world.getTileEntity(varx, vary, varz);
				tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
				item = null;
			}
		case "mindaltar":
			if (item == Items.runeEssence) {
				numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
				System.out.println(numberOfRuneEssences);
				world.setBlockToAir(varx, vary, varz);
				world.setBlock(varx, vary, varz, Blocks.MindRuneAltar);
				entity.getHeldItem().stackSize = 0;
				TileEntityMindRuneAltar tileEntity = (TileEntityMindRuneAltar) world.getTileEntity(varx, vary, varz);
				tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
				item = null;
			}
		case "bodyaltar":
			if (item == Items.runeEssence) {
				numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
				System.out.println(numberOfRuneEssences);
				world.setBlockToAir(varx, vary, varz);
				world.setBlock(varx, vary, varz, Blocks.BodyRuneAltar);
				entity.getHeldItem().stackSize = 0;
				TileEntityBodyRuneAltar tileEntity = (TileEntityBodyRuneAltar) world.getTileEntity(varx, vary, varz);
				tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
				item = null;
			}
		case "cosmicaltar":
			if (item == Items.runeEssence) {
				numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
				System.out.println(numberOfRuneEssences);
				world.setBlockToAir(varx, vary, varz);
				world.setBlock(varx, vary, varz, Blocks.CosmicRuneAltar);
				entity.getHeldItem().stackSize = 0;
				TileEntityCosmicRuneAltar tileEntity = (TileEntityCosmicRuneAltar) world.getTileEntity(varx, vary, varz);
				tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
				item = null;
			}
		case "chaosaltar":
			if (item == Items.runeEssence) {
				numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
				System.out.println(numberOfRuneEssences);
				world.setBlockToAir(varx, vary, varz);
				world.setBlock(varx, vary, varz, Blocks.ChaosRuneAltar);
				entity.getHeldItem().stackSize = 0;
				TileEntityChaosRuneAltar tileEntity = (TileEntityChaosRuneAltar) world.getTileEntity(varx, vary, varz);
				tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
				item = null;
			}
		case "naturealtar":
			if (item == Items.runeEssence) {
				numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
				System.out.println(numberOfRuneEssences);
				world.setBlockToAir(varx, vary, varz);
				world.setBlock(varx, vary, varz, Blocks.NatureRuneAltar);
				entity.getHeldItem().stackSize = 0;
				TileEntityNatureRuneAltar tileEntity = (TileEntityNatureRuneAltar) world.getTileEntity(varx, vary, varz);
				tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
				item = null;
			}
		case "lawaltar":
			if (item == Items.runeEssence) {
				numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
				System.out.println(numberOfRuneEssences);
				world.setBlockToAir(varx, vary, varz);
				world.setBlock(varx, vary, varz, Blocks.LawRuneAltar);
				entity.getHeldItem().stackSize = 0;
				TileEntityLawRuneAltar tileEntity = (TileEntityLawRuneAltar) world.getTileEntity(varx, vary, varz);
				tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
				item = null;
			}
		case "deathaltar":
			if (item == Items.runeEssence) {
				numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
				System.out.println(numberOfRuneEssences);
				world.setBlockToAir(varx, vary, varz);
				world.setBlock(varx, vary, varz, Blocks.DeathRuneAltar);
				entity.getHeldItem().stackSize = 0;
				TileEntityDeathRuneAltar tileEntity = (TileEntityDeathRuneAltar) world.getTileEntity(varx, vary, varz);
				tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
				item = null;
			}
		case "bloodaltar":
			if (item == Items.runeEssence) {
				numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
				System.out.println(numberOfRuneEssences);
				world.setBlockToAir(varx, vary, varz);
				world.setBlock(varx, vary, varz, Blocks.BloodRuneAltar);
				entity.getHeldItem().stackSize = 0;
				TileEntityBloodRuneAltar tileEntity = (TileEntityBloodRuneAltar) world.getTileEntity(varx, vary, varz);
				tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
				item = null;
			}
		case "astralaltar":
			if (item == Items.runeEssence) {
				numberOfRuneEssences = entity.inventory.getCurrentItem().stackSize;
				System.out.println(numberOfRuneEssences);
				world.setBlockToAir(varx, vary, varz);
				world.setBlock(varx, vary, varz, Blocks.AstralRuneAltar);
				entity.getHeldItem().stackSize = 0;
				TileEntityAstralRuneAltar tileEntity = (TileEntityAstralRuneAltar) world.getTileEntity(varx, vary, varz);
				tileEntity.quantityOfRuneEssence = numberOfRuneEssences;
				item = null;
			}

		case "airrunealtar":
			if (!world.isRemote) {
				if (item == Items.airTalisman) {
			
					TileEntityAirRuneAltar tileEntity = (TileEntityAirRuneAltar) world.getTileEntity(varx, vary, varz);
					world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.airRune,tileEntity.quantityOfRuneEssence)));
					
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
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.AirAltar);
					
				}
			}
		case "waterrunealtar":
			if (!world.isRemote) {
				if (item == Items.waterTalisman) {
					
					TileEntityAirRuneAltar tileEntity = (TileEntityAirRuneAltar) world.getTileEntity(varx, vary, varz);
					world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.waterRune,tileEntity.quantityOfRuneEssence)));
					
					if (numberOfRuneEssences >= 5) {
						int randomint = randInt(1, 10);
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
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.WaterAltar);
				}
			}
		case "firerunealtar":
			if (!world.isRemote) {
				if (item == Items.fireTalisman) {
					
					TileEntityFireRuneAltar tileEntity = (TileEntityFireRuneAltar) world.getTileEntity(varx, vary, varz);
					world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.fireRune,tileEntity.quantityOfRuneEssence)));
					if (numberOfRuneEssences >= 5) {
						int randomint = randInt(1, 10);
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
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.FireAltar);
				}
			}
		case "earthrunealtar":
			if (!world.isRemote) {
				if (item == Items.earthTalisman) {
					TileEntityEarthRuneAltar tileEntity = (TileEntityEarthRuneAltar) world.getTileEntity(varx, vary, varz);
					world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.earthRune,tileEntity.quantityOfRuneEssence)));
				
					if (numberOfRuneEssences >= 5) {
						int randomint = randInt(1, 10);
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
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.EarthAltar);
					
				}
			}
		case "mindrunealtar":

			if (!world.isRemote) {
				if (item == Items.mindTalisman) {
					TileEntityMindRuneAltar tileEntity = (TileEntityMindRuneAltar) world.getTileEntity(varx, vary, varz);
					world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.mindRune,tileEntity.quantityOfRuneEssence)));
				
					if (numberOfRuneEssences >= 5) {
						int randomint = randInt(1, 10);
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
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.MindAltar);
					
				}
			}
		case "bodyrunealtar":
			if (!world.isRemote) {
				if (item == Items.bodyTalisman) {
					TileEntityBodyRuneAltar tileEntity = (TileEntityBodyRuneAltar) world.getTileEntity(varx, vary, varz);
					world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.bodyRune,tileEntity.quantityOfRuneEssence)));
				
					if (numberOfRuneEssences >= 5) {
						int randomint = randInt(1, 10);
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
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.BodyAltar);
					
				}
			}
		case "cosmicrunealtar":
			if (!world.isRemote) {
				if (item == Items.cosmicTalisman) {
					TileEntityCosmicRuneAltar tileEntity = (TileEntityCosmicRuneAltar) world.getTileEntity(varx, vary, varz);
					world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.cosmicRune,tileEntity.quantityOfRuneEssence)));
				
					if (numberOfRuneEssences >= 5) {
						int randomint = randInt(1, 20);
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
					world.setBlockToAir(varx, vary, varz);
					world.setBlock(varx, vary, varz, Blocks.CosmicAltar);
					
				}
			}
		case "chaosrunealtar":
			if (!world.isRemote) {
				if (item == Items.chaosTalisman) {
					TileEntityChaosRuneAltar tileEntity = (TileEntityChaosRuneAltar) world.getTileEntity(varx, vary, varz);
					world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.chaosRune,tileEntity.quantityOfRuneEssence)));
				item = null;
				world.setBlockToAir(varx, vary, varz);
				world.setBlock(varx, vary, varz, Blocks.ChaosAltar);
				}
				
				
			}
		case "naturerunealtar":
			if (!world.isRemote) {
				if (item == Items.natureTalisman) {
					TileEntityNatureRuneAltar tileEntity = (TileEntityNatureRuneAltar) world.getTileEntity(varx, vary, varz);
					world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.natureRune,tileEntity.quantityOfRuneEssence)));
				
					if (numberOfRuneEssences >= 5) {
						int randomint = randInt(1, 20);
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
						world.setBlockToAir(varx, vary, varz);
						world.setBlock(varx, vary, varz, Blocks.NatureAltar);
					}
					
					
				}
			}
		case "lawrunealtar":
			if (!world.isRemote) {
				if (item == Items.lawTalisman) {
					TileEntityLawRuneAltar tileEntity = (TileEntityLawRuneAltar) world.getTileEntity(varx, vary, varz);
					world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.lawRune,tileEntity.quantityOfRuneEssence)));
				
					if (numberOfRuneEssences >= 5) {
						int randomint = randInt(1, 20);
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
						world.setBlockToAir(varx, vary, varz);
						world.setBlock(varx, vary, varz, Blocks.LawAltar);
					}
					
					
				}
			}
		case "deathrunealtar":
			if (!world.isRemote) {
				if (item == Items.deathTalisman) {
					TileEntityDeathRuneAltar tileEntity = (TileEntityDeathRuneAltar) world.getTileEntity(varx, vary, varz);
					world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.deathRune,tileEntity.quantityOfRuneEssence)));
				item = null;
				world.setBlockToAir(varx, vary, varz);
				world.setBlock(varx, vary, varz, Blocks.DeathAltar);
				}
				
				
			}
		case "bloodrunealtar":
			if (!world.isRemote) {
				if (item == Items.bloodTalisman) {
					TileEntityBloodRuneAltar tileEntity = (TileEntityBloodRuneAltar) world.getTileEntity(varx, vary, varz);
					world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.bloodRune,tileEntity.quantityOfRuneEssence)));
				item = null;
				world.setBlockToAir(varx, vary, varz);
				world.setBlock(varx, vary, varz, Blocks.BloodAltar);
				}
				
				
			}
		case "astralrunealtar":
			if (!world.isRemote) {
				if (item == Items.astralTalisman) {
						TileEntityAstralRuneAltar tileEntity = (TileEntityAstralRuneAltar) world.getTileEntity(varx, vary, varz);
					world.spawnEntityInWorld(new EntityItem(world, varx, vary + 1, varz, new ItemStack(Items.astralRune,tileEntity.quantityOfRuneEssence)));
				item = null;
				world.setBlockToAir(varx, vary, varz);
				world.setBlock(varx, vary, varz, Blocks.AstralAltar);
				}
				
			
			}
			
			default: System.out.println("oh no");
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
