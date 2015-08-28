package utility.commands;

import handler.ExtendedPlayer;
import handler.Runecraft2EventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import reference.ExpChart;

public class SkillsCMD extends CommandBase{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "skills";
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		// TODO Auto-generated method stub
		return "Displays your current skills progress.";
	}

	@Override
	public void execute(ICommandSender icommandsender, String[] string) {
		
		if(icommandsender instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) icommandsender;
			ExtendedPlayer props = ExtendedPlayer.get(player);
			
			
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Your Magic level is " + props.currentMagicLevel + "/" + props.maxSkill + " Your Magic exp is " + props.currentMagicExp + "/" + ExpChart.exparray[1][Runecraft2EventHandler.currentMagicLevel]));
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Your Runecrafting level is " + props.currentRunecraftingLevel + "/" + props.maxSkill + " Your Runecrafting exp is " + props.currentRunecraftingExp + "/" + ExpChart.exparray[1][Runecraft2EventHandler.currentRunecraftingLevel]));
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Your Mining level is " + props.currentMiningLevel + "/" + props.maxSkill + " Your Mining exp is " + props.currentMiningExp + "/" + ExpChart.exparray[1][Runecraft2EventHandler.currentMiningLevel]));

		
		}
		
		
	}

}
