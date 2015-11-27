package utility.commands;

import handler.ExtendedPlayer;
import handler.Runecraft2EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import reference.ExpChart;

public class Runecraft2Help extends CommandBase{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "helprc";
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		// TODO Auto-generated method stub
		return "Displays commands provided by Runecraft 2";
	}

	@Override
	public void execute(ICommandSender icommandsender, String[] string) {
		
		if(icommandsender instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) icommandsender;
			ExtendedPlayer props = ExtendedPlayer.get(player);
			
			
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("/skills - This will display the current progress of your skills."));
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("/suppressexp - This will toggle the possibly annoying exp spam that will occur when casting spells."));
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("/sethometeleport - Used for the Home Teleport spell, the spell book will tell you more."));
		}
		
		
	}

}
