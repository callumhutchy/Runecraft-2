package uk.co.callumhutchy.runecraft2.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import uk.co.callumhutchy.runecraft2.Runecraft2;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityAnvil;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityRCFurnace;

public class Anvil extends BlockContainer{

	protected Anvil(Material p_i45394_1_, String unlocalisedName) {
		super(p_i45394_1_);
		this.setCreativeTab(Runecraft2.tabRunecraft2Metal);
		this.setUnlocalizedName(unlocalisedName);
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
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityAnvil();
		
	}
}
