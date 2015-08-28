package utility.commands;

import handler.ExtendedPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class SuppressExpMessagesCMD extends CommandBase {

	@Override
	public String getName() {
		
		return "suppressexp";
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		// TODO Auto-generated method stub
		return "This will stop the exp messahes from appearing, retype to undo.";
	}

	@Override
	public void execute(ICommandSender icommandsender, String[] string) {
		if(icommandsender instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) icommandsender;
			ExtendedPlayer props = ExtendedPlayer.get(player);
			props.suppressExpMessages = !props.suppressExpMessages;
			
		if(props.suppressExpMessages){
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Exp messages turned off."));
		}
		if(!props.suppressExpMessages){
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Exp messages turned on."));
		}
		}
		
	}

}