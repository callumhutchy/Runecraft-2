package com.callumhutchy.runecraft2.spells.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.callumhutchy.runecraft2.spells.models.StrikeModel;

public class RenderFireStrike extends Render  {
	private StrikeModel						model;

	public final ResourceLocation	firestrikeTextures	= new ResourceLocation("runecraft2:textures/entity/FireStrikeTexture.png");
	

	public RenderFireStrike(RenderManager renderManager) {
		super(renderManager);
		model = new StrikeModel();
	}

	@Override
	public void doRender(Entity entity, double x, double y, double z, float rx, float ry) {
		GL11.glPushMatrix();

		// bind your texture:
		bindTexture(firestrikeTextures);

		// do whatever transformations you need, then render

		// typically you will at least want to translate for x/y/z position:
		GL11.glTranslated(x, y -1, z);

		// if you are using a model, you can do so like this:
		//GL11.glRotatef(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * ry, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * ry - 180f, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * rx, 1.0F, 0.0F,0.0F );
		model.setRotationAngles(0.0F, 0.0F, 0.0F, entity.rotationPitch, entity.rotationPitch, 0.0625F, entity);
		model.render(entity, 0.0F, 0.0F, 0.0F,entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * rx ,entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * ry, 0.0625F);
		// note all the values are 0 except the final argument, which is scale
		// vanilla Minecraft almost excusively uses 0.0625F, but you can change it to whatever works

		GL11.glPopMatrix();
		
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		
		return firestrikeTextures;
	}
}
