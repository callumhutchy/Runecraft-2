package com.callumhutchy.runecraft2.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class OreModel extends ModelBase {
	//fields
    ModelRenderer Rock_1;
    ModelRenderer Rock_2;
    ModelRenderer Rock_3;
    ModelRenderer Rock_4;
    ModelRenderer Rock_5;
    ModelRenderer Rock_6;
    ModelRenderer Rock_7;
    ModelRenderer Rock_8;
    ModelRenderer Rock_9;
    ModelRenderer Ore_1;
    ModelRenderer Ore_2;
    ModelRenderer Ore_3;
    ModelRenderer Ore_4;
    ModelRenderer Ore_5;
    ModelRenderer Ore_6;
    ModelRenderer Ore_7;
  
  public OreModel()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Rock_1 = new ModelRenderer(this, 0, 0);
      Rock_1.addBox(0F, 0F, 0F, 14, 2, 14);
      Rock_1.setRotationPoint(-7F, 22F, -7F);
      Rock_1.setTextureSize(64, 32);
      Rock_1.mirror = true;
      setRotation(Rock_1, 0F, 0F, 0F);
      Rock_2 = new ModelRenderer(this, 0, 0);
      Rock_2.addBox(0F, 0F, 0F, 12, 2, 12);
      Rock_2.setRotationPoint(-6F, 20F, -6F);
      Rock_2.setTextureSize(64, 32);
      Rock_2.mirror = true;
      setRotation(Rock_2, 0F, 0F, 0F);
      Rock_3 = new ModelRenderer(this, 0, 0);
      Rock_3.addBox(0F, 0F, 0F, 10, 2, 10);
      Rock_3.setRotationPoint(-5F, 18F, -5F);
      Rock_3.setTextureSize(64, 32);
      Rock_3.mirror = true;
      setRotation(Rock_3, 0F, 0F, 0F);
      Rock_4 = new ModelRenderer(this, 0, 0);
      Rock_4.addBox(0F, 0F, 0F, 8, 2, 8);
      Rock_4.setRotationPoint(-3F, 16F, -3F);
      Rock_4.setTextureSize(64, 32);
      Rock_4.mirror = true;
      setRotation(Rock_4, 0F, 0F, 0F);
      Rock_5 = new ModelRenderer(this, 0, 0);
      Rock_5.addBox(0F, 0F, 0F, 5, 2, 2);
      Rock_5.setRotationPoint(-3F, 16F, -5F);
      Rock_5.setTextureSize(64, 32);
      Rock_5.mirror = true;
      setRotation(Rock_5, 0F, 0F, 0F);
      Rock_6 = new ModelRenderer(this, 0, 0);
      Rock_6.addBox(0F, 0F, 0F, 3, 2, 2);
      Rock_6.setRotationPoint(-2F, 14F, -5F);
      Rock_6.setTextureSize(64, 32);
      Rock_6.mirror = true;
      setRotation(Rock_6, 0F, 0F, 0F);
      Rock_7 = new ModelRenderer(this, 0, 0);
      Rock_7.addBox(0F, 0F, 0F, 7, 1, 7);
      Rock_7.setRotationPoint(-3F, 15F, -2F);
      Rock_7.setTextureSize(64, 32);
      Rock_7.mirror = true;
      setRotation(Rock_7, 0F, 0F, 0F);
      Rock_8 = new ModelRenderer(this, 0, 0);
      Rock_8.addBox(0F, 0F, 0F, 5, 2, 5);
      Rock_8.setRotationPoint(-2F, 13F, 0F);
      Rock_8.setTextureSize(64, 32);
      Rock_8.mirror = true;
      setRotation(Rock_8, 0F, 0F, 0F);
      Rock_9 = new ModelRenderer(this, 0, 0);
      Rock_9.addBox(0F, 0F, 0F, 3, 2, 3);
      Rock_9.setRotationPoint(-1F, 11F, 1F);
      Rock_9.setTextureSize(64, 32);
      Rock_9.mirror = true;
      setRotation(Rock_9, 0F, 0F, 0F);
      Ore_1 = new ModelRenderer(this, 8, 23);
      Ore_1.addBox(0F, 0F, 0F, 3, 2, 1);
      Ore_1.setRotationPoint(1F, 20F, -7F);
      Ore_1.setTextureSize(64, 32);
      Ore_1.mirror = true;
      setRotation(Ore_1, 0F, 0F, 0F);
      Ore_2 = new ModelRenderer(this, 5, 22);
      Ore_2.addBox(0F, 0F, 0F, 3, 1, 1);
      Ore_2.setRotationPoint(-3F, 18F, -6F);
      Ore_2.setTextureSize(64, 32);
      Ore_2.mirror = true;
      setRotation(Ore_2, 0F, 0F, 0F);
      Ore_3 = new ModelRenderer(this, 5, 23);
      Ore_3.addBox(0F, 0F, 0F, 1, 1, 3);
      Ore_3.setRotationPoint(-6F, 19F, 0F);
      Ore_3.setTextureSize(64, 32);
      Ore_3.mirror = true;
      setRotation(Ore_3, 0F, 0F, 0F);
      Ore_4 = new ModelRenderer(this, 5, 22);
      Ore_4.addBox(0F, 0F, 0F, 1, 1, 3);
      Ore_4.setRotationPoint(-4F, 16F, 1F);
      Ore_4.setTextureSize(64, 32);
      Ore_4.mirror = true;
      setRotation(Ore_4, 0F, 0F, 0F);
      Ore_5 = new ModelRenderer(this, 5, 23);
      Ore_5.addBox(0F, 0F, 0F, 3, 2, 1);
      Ore_5.setRotationPoint(0F, 18F, 5F);
      Ore_5.setTextureSize(64, 32);
      Ore_5.mirror = true;
      setRotation(Ore_5, 0F, 0F, 0F);
      Ore_6 = new ModelRenderer(this, 6, 23);
      Ore_6.addBox(0F, 0F, 0F, 3, 1, 1);
      Ore_6.setRotationPoint(0F, 14F, -1F);
      Ore_6.setTextureSize(64, 32);
      Ore_6.mirror = true;
      setRotation(Ore_6, 0F, 0F, 0F);
      Ore_7 = new ModelRenderer(this, 6, 23);
      Ore_7.addBox(0F, 0F, 0F, 1, 1, 3);
      Ore_7.setRotationPoint(5F, 18F, -2F);
      Ore_7.setTextureSize(64, 32);
      Ore_7.mirror = true;
      setRotation(Ore_7, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Rock_1.render(f5);
    Rock_2.render(f5);
    Rock_3.render(f5);
    Rock_4.render(f5);
    Rock_5.render(f5);
    Rock_6.render(f5);
    Rock_7.render(f5);
    Rock_8.render(f5);
    Rock_9.render(f5);
    Ore_1.render(f5);
    Ore_2.render(f5);
    Ore_3.render(f5);
    Ore_4.render(f5);
    Ore_5.render(f5);
    Ore_6.render(f5);
    Ore_7.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
}
