package com.callumhutchy.runecraft2.items.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

public class ItemRender implements IItemRenderer {

	TileEntitySpecialRenderer render;

	public TileEntity entity;
	public String typeOfItem;

	public ItemRender(TileEntitySpecialRenderer render, TileEntity entity,
			String typeOfItemvar) {
		this.entity = entity;
		this.render = render;
		typeOfItem = typeOfItemvar;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {

		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {

		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

		boolean mustundotranslate = false;

		if (typeOfItem == "ore") {

			if (type == IItemRenderer.ItemRenderType.INVENTORY) {
				GL11.glTranslatef(-0.5f, -0.3f, -0.5f);
				this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D,
						0.0F, 0);
				mustundotranslate = true;
			}
			if (type == IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON) {
				GL11.glTranslatef(0.5f, 0.2f, 0.0f);
				this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D,
						0.0F, 0);
				mustundotranslate = true;
			}
			if (type == IItemRenderer.ItemRenderType.EQUIPPED) {
				GL11.glTranslatef(0.5f, 0.2f, 0.0f);
				this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D,
						0.0F, 0);
				mustundotranslate = true;
			}
			if (type == IItemRenderer.ItemRenderType.ENTITY) {
				GL11.glTranslatef(0.5f, 0.2f, 0.0f);
				this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D,
						0.0F, 0);
				mustundotranslate = true;
			}
			
		}

		if (typeOfItem == "altar") {

			if (type == IItemRenderer.ItemRenderType.INVENTORY) {
				GL11.glTranslatef(-0.5f, -0.5f, -0.5f);
				this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D,
						0.0F, 0);
				mustundotranslate = true;
			}
			if (type == IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON) {
				GL11.glTranslatef(0.5f, 0.2f, 0.0f);
				this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D,
						0.0F, 0);
				mustundotranslate = true;
			}
			if (type == IItemRenderer.ItemRenderType.EQUIPPED) {
				GL11.glTranslatef(0.5f, 0.2f, 0.0f);
				this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D,
						0.0F, 0);
				mustundotranslate = true;
			}
			if (type == IItemRenderer.ItemRenderType.ENTITY) {
				GL11.glTranslatef(0.5f, 0.2f, 0.0f);
				this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D,
						0.0F, 0);
				mustundotranslate = true;
			}

		}

		if (mustundotranslate)
			GL11.glTranslatef(0.5F, 0.5F, 0.5F);

	}

}
