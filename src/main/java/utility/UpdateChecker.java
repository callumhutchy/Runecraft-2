package utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import reference.Reference;

public class UpdateChecker {
	public static void update(Entity entity) {

		String clientVersion = Reference.VERSION;

		Boolean modOutOfDate = false;
		int clientVersionArray[] = new int[3];
		int latestVersionArray[] = new int[3];

		try {

			URL oracle = new URL(
					"http://users.aber.ac.uk/cgh2/runecraft2_version");
			BufferedReader in = new BufferedReader(new InputStreamReader(
					oracle.openStream()));

			String inputLine;
			String tempVersion = null;
			while ((inputLine = in.readLine()) != null)
				tempVersion += inputLine;
			System.out.println(inputLine);

			in.close();
			String latestVersion = tempVersion.substring(4);
			System.out.println(latestVersion);
			latestVersionArray[0] = Integer.parseInt(latestVersion.substring(0,
					1));
			latestVersionArray[1] = Integer.parseInt(latestVersion.substring(2,
					3));
			latestVersionArray[2] = Integer.parseInt(latestVersion.substring(4,
					5));
			System.out.println(latestVersionArray[0]);
			System.out.println(latestVersionArray[1]);
			System.out.println(latestVersionArray[2]);
			clientVersionArray[0] = Integer.parseInt(clientVersion.substring(0,
					1));
			clientVersionArray[1] = Integer.parseInt(clientVersion.substring(2,
					3));
			clientVersionArray[2] = Integer.parseInt(clientVersion.substring(4,
					5));
			System.out.println(clientVersionArray[0]);
			System.out.println(clientVersionArray[1]);
			System.out.println(clientVersionArray[2]);

			if (latestVersionArray[0] > clientVersionArray[0]) {
				modOutOfDate = true;

			} else if (latestVersionArray[0] == clientVersionArray[0]
					&& latestVersionArray[1] > clientVersionArray[1]) {
				modOutOfDate = true;

			} else if (latestVersionArray[0] == clientVersionArray[0]
					&& latestVersionArray[1] == clientVersionArray[1]
					&& latestVersionArray[2] > clientVersionArray[2]) {
				modOutOfDate = true;
			} else if (latestVersionArray[0] == clientVersionArray[0]
					&& latestVersionArray[1] == clientVersionArray[1]
					&& latestVersionArray[2] == clientVersionArray[2]) {
				modOutOfDate = false;
			} else {
				modOutOfDate = false;
			}

			if (modOutOfDate == true) {
				
				((EntityPlayer) entity).addChatComponentMessage(new ChatComponentText("Runecraft 2 is out of date. The version you are using is verions: "+ clientVersion+ " and the latest version is version: "+ latestVersion));
				((EntityPlayer) entity).addChatComponentMessage(new ChatComponentText("http://tiny.cc/hwpxyx"));
				
			} else {
				LogHelper.info("You are running the latest version of Runecraft 2, version: "+ clientVersion);
			}

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
