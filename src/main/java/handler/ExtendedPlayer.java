package handler;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import com.callumhutchy.runecraft2.proxy.CommonProxy;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedPlayer implements IExtendedEntityProperties {

	public final static String	EXT_PROP_NAME				= "ExtendedPlayer";
	public static final int		MAGIC_EXP_WATCHER			= 20;
	// public static final int STRENGTH_EXP_WATCHER = 21;
	// public static final int VITALITY_EXP_WATCHER = 22;
	// public static final int DEFENSE_EXP_WATCHER = 23;
	// public static final int COOKING_EXP_WATCHER = 24;
	public static final int		RUNECRAFTING_EXP_WATCHER	= 25;
	// public static final int MINING_EXP_WATCHER = 26;
	// public static final int SMELTING_EXP_WATCHER = 27;
	public static String		currentSpell;

	public static int			currentHomeTPx, currentHomeTPy, currentHomeTPz;

	public int					currentMagicLevel, currentStrengthLevel,
			currentVitalityLevel, currentDefenseLevel, currentCookingLevel,
			currentRunecraftingLevel, currentMiningLevel, currentSmithingLevel;
	public int					currentMagicExp, currentStrengthExp,
			currentVitalityExp, currentDefenseExp, currentCookingExp,
			currentRunecraftingExp, currentMiningExp, currentSmithingExp;
	public int					currentMagicMaxExp, currentStrengthMaxExp,
			currentVitalityMaxExp, currentDefenseMaxExp, currentCookingMaxExp,
			currentRunecraftingMaxExp, currentMiningMaxExp,
			currentSmithingMaxExp;
	
	public boolean suppressExpMessages;

	public int					maxSkill					= 99;
	private final EntityPlayer	player;

	public ExtendedPlayer(EntityPlayer player) {
		this.player = player;

		this.currentMagicLevel = this.currentStrengthLevel = this.currentVitalityLevel = this.currentCookingLevel = this.currentDefenseLevel = this.currentRunecraftingLevel = this.currentMiningLevel = this.currentSmithingLevel = 1;
		this.currentMagicExp = this.currentRunecraftingExp = this.currentStrengthExp = this.currentVitalityExp = this.currentDefenseExp = this.currentCookingExp = this.currentMiningExp = this.currentSmithingExp = 0;
		this.currentMagicMaxExp = this.currentRunecraftingMaxExp = this.currentStrengthMaxExp = this.currentVitalityMaxExp = this.currentDefenseMaxExp = this.currentCookingMaxExp = this.currentMiningMaxExp = this.currentSmithingMaxExp = 0;
		this.suppressExpMessages = false;
		this.currentSpell = "";

		//
	}

	public static final void register(EntityPlayer player) {
		player.registerExtendedProperties(ExtendedPlayer.EXT_PROP_NAME, new ExtendedPlayer(player));
	}

	public static final ExtendedPlayer get(EntityPlayer player) {
		return (ExtendedPlayer) player.getExtendedProperties(EXT_PROP_NAME);
	}

	@Override
	public void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = new NBTTagCompound();
		// Levels
		properties.setInteger("CurrentMagicLevel", this.currentMagicLevel);
		properties.setInteger("CurrentStrengthLevel", this.currentStrengthLevel);
		properties.setInteger("CurrentVitalityLevel", this.currentVitalityLevel);
		properties.setInteger("CurrentDefenseLevel", this.currentDefenseLevel);
		properties.setInteger("CurrentCookingLevel", this.currentCookingLevel);
		properties.setInteger("CurrentRunecraftingLevel", this.currentRunecraftingLevel);
		properties.setInteger("CurrentMiningLevel", this.currentMiningLevel);
		properties.setInteger("CurrentSmithingLevel", this.currentSmithingLevel);

		// Exp

		properties.setInteger("CurrentMagicExp", this.currentMagicExp);
		properties.setInteger("CurrentStrengthExp", this.currentStrengthExp);
		properties.setInteger("CurrentVitalityExp", this.currentVitalityExp);
		properties.setInteger("CurrentDefenseExp", this.currentDefenseExp);
		properties.setInteger("CurrentCookingExp", this.currentCookingExp);
		properties.setInteger("CurrentRunecraftingExp", this.currentRunecraftingExp);
		properties.setInteger("CurrentMiningExp", this.currentMiningExp);
		properties.setInteger("CurrentSmithingExp", this.currentSmithingExp);

		// Spells
		properties.setString("CurrentSpell", this.currentSpell);
		compound.setTag(EXT_PROP_NAME, properties);
		System.out.println("[TUT PROPS] Magic from NBT: " + this.currentMagicLevel + "/" + this.maxSkill);

		properties.setBoolean("SuppressExpMessage", this.suppressExpMessages);
		
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
		// Levels
		this.currentMagicLevel = properties.getInteger("CurrentMagicLevel");
		this.currentStrengthLevel = properties.getInteger("CurrentStrengthLevel");
		this.currentVitalityLevel = properties.getInteger("CurrentVitalityLevel");
		this.currentDefenseLevel = properties.getInteger("CurrentDefenseLevel");
		this.currentCookingLevel = properties.getInteger("CurrentCookingLevel");
		this.currentRunecraftingLevel = properties.getInteger("CurrentRunecraftingLevel");
		this.currentMiningLevel = properties.getInteger("CurrentMiningLevel");
		this.currentSmithingLevel = properties.getInteger("CurrentSmithingLevel");

		// Exp

		this.currentMagicExp = properties.getInteger("CurrentMagicExp");
		this.currentRunecraftingExp = properties.getInteger("CurrentRunecraftingExp");
		this.currentStrengthExp = properties.getInteger("CurrentStrengthExp");
		this.currentVitalityExp = properties.getInteger("CurrentVitalityExp");
		this.currentDefenseExp = properties.getInteger("CurrentDefenseExp");
		this.currentCookingExp = properties.getInteger("CurrentCookingExp");
		this.currentMiningExp = properties.getInteger("CurrentMiningExp");
		this.currentSmithingExp = properties.getInteger("CurrentSmithingExp");
		// Spells
		this.currentSpell = properties.getString("CurrentSpell");
		
		
		this.suppressExpMessages = properties.getBoolean("SuppressExpMessages");

	}

	@Override
	public void init(Entity entity, World world) {

	}

	public boolean isSkillHighEnough(String string, int amount) {
		switch (string) {
		case "magic":
			if (this.currentMagicLevel >= amount) {
				return true;
			}
		case "strength":
			if (this.currentStrengthLevel >= amount) {
				return true;
			}
		case "vitality":
			if (this.currentVitalityLevel >= amount) {
				return true;
			}
		case "defense":
			if (this.currentDefenseLevel >= amount) {
				return true;
			}
		case "cooking":
			if (this.currentCookingLevel >= amount) {
				return true;
			}
		case "runecrafting":
			if (this.currentRunecraftingLevel >= amount) {
				return true;
			}
		case "mining":
			if (this.currentMiningLevel >= amount) {
				return true;
			}
		case "smithing":
			if (this.currentSmithingLevel >= amount) {
				return true;
			}
		default:
			return false;
		}
	}

	public void increaseSkill(String string) {
		switch (string) {
		case "magic":
			this.currentMagicLevel++;
		case "strength":
			this.currentStrengthLevel++;
		case "vitality":
			this.currentVitalityLevel++;
		case "defense":
			this.currentDefenseLevel++;
		case "cooking":
			this.currentCookingLevel++;
		case "runecrafting":
			this.currentRunecraftingLevel++;
		case "mining":
			this.currentMiningLevel++;
		case "smithing":
			this.currentSmithingLevel++;
		}

	}

	public void syncProperties() {

	}

	public static void saveProxyData(EntityPlayer player) {
		ExtendedPlayer playerData = ExtendedPlayer.get(player);
		NBTTagCompound savedData = new NBTTagCompound();

		playerData.saveNBTData(savedData);
		// Note that we made the CommonProxy method storeEntityData static,
		// so now we don't need an instance of CommonProxy to use it! Great!
		CommonProxy.storeEntityData(getSaveKey(player), savedData);
	}

	private static String getSaveKey(EntityPlayer player) {
		String username = player.getCommandSenderName();
		return username + ":" + EXT_PROP_NAME;
	}

	public static void loadProxyData(EntityPlayer player) {
		ExtendedPlayer playerData = ExtendedPlayer.get(player);
		NBTTagCompound savedData = CommonProxy.getEntityData(getSaveKey(player));

		if (savedData != null) {
			playerData.loadNBTData(savedData);
		}
		// note we renamed 'syncExtendedProperties' to 'syncProperties' because
		// yay, it's shorter
		playerData.syncProperties();
	}
}
