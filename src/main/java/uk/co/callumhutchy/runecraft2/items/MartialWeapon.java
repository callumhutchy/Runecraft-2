package uk.co.callumhutchy.runecraft2.items;

import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import uk.co.callumhutchy.runecraft2.Runecraft2;

public class MartialWeapon extends ItemSword{

    public MartialWeapon(ToolMaterial material, String unlocalisedName) {
	super(material);
	this.setUnlocalizedName(unlocalisedName);
	this.setMaxStackSize(1);
	this.setCreativeTab(Runecraft2.tabRunecraft2Tools);
    }

    
    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
	return true;
    }
}
