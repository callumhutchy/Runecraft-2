package com.callumhutchy.runecraft2.proxy;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class CommonProxy implements IProxy, IGuiHandler {

    private static final Map<String, NBTTagCompound> extendedEntityData = new HashMap<String, NBTTagCompound>();
    public static final String GameRegistry = null;


    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

	return null;
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	// TODO Auto-generated method stub
	return null;
    }

    /**
     * Adds an entity's custom data to the map for temporary storage
     * 
     * @param compound
     *            An NBT Tag Compound that stores the IExtendedEntityProperties
     *            data only
     */
    public static void storeEntityData(String name, NBTTagCompound compound) {
	extendedEntityData.put(name, compound);
    }

    /**
     * Removes the compound from the map and returns the NBT tag stored for name
     * or null if none exists
     */
    public static NBTTagCompound getEntityData(String name) {
	return extendedEntityData.remove(name);
    }

    @Override
    public void registerRenderThings() {
	// TODO Auto-generated method stub
	
    }

}
