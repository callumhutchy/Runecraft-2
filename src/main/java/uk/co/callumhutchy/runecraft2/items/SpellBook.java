package uk.co.callumhutchy.runecraft2.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import uk.co.callumhutchy.runecraft2.Runecraft2;
import uk.co.callumhutchy.runecraft2.client.gui.GuiSpellBook;

public class SpellBook extends BaseMagicItem {

	public SpellBook(String unlocalisedName, int maxSize) {
		super(unlocalisedName, maxSize);
		
	}

	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
    {
		player.openGui(Runecraft2.instance, GuiSpellBook.GUI_ID, world,0, 0, 0);
       
		return item;
    }
	
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		playerIn.inventory.addItemStackToInventory(new ItemStack(Items.airTalisman));	
	}
	
}
