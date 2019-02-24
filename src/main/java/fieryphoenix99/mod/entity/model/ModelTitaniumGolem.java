package fieryphoenix99.mod.entity.model;

import fieryphoenix99.mod.entity.TitaniumGolem;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;


public class ModelTitaniumGolem extends ModelBase {
    public ModelRenderer GolemUpperBody;
    public ModelRenderer GolemLowerBody;
    public ModelRenderer GolemLeftArm;
    public ModelRenderer GolemRightArm;
    public ModelRenderer GolemRightLeg;
    public ModelRenderer GolemHead;
    public ModelRenderer GolemNose;
    public ModelRenderer GolemLeftLeg;

    public ModelTitaniumGolem() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.GolemNose = new ModelRenderer(this, 24, 0);
        this.GolemNose.setRotationPoint(0.0F, -7.0F, -2.0F);
        this.GolemNose.addBox(-1.0F, -5.0F, -7.5F, 2, 4, 2, 0.0F);
        this.GolemLowerBody = new ModelRenderer(this, 0, 70);
        this.GolemLowerBody.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.GolemLowerBody.addBox(-4.5F, 10.0F, -3.0F, 9, 5, 6, 0.5F);
        this.GolemLeftArm = new ModelRenderer(this, 60, 58);
        this.GolemLeftArm.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.GolemLeftArm.addBox(9.0F, -2.5F, -3.0F, 4, 30, 6, 0.0F);
        this.GolemRightArm = new ModelRenderer(this, 60, 21);
        this.GolemRightArm.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.GolemRightArm.addBox(-13.0F, -2.5F, -3.0F, 4, 30, 6, 0.0F);
        this.GolemUpperBody = new ModelRenderer(this, 0, 40);
        this.GolemUpperBody.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.GolemUpperBody.addBox(-9.0F, -2.0F, -6.0F, 18, 12, 11, 0.0F);
        this.GolemRightLeg = new ModelRenderer(this, 37, 0);
        this.GolemRightLeg.setRotationPoint(-4.0F, 11.0F, 0.0F);
        this.GolemRightLeg.addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, 0.0F);
        this.GolemLeftLeg = new ModelRenderer(this, 60, 0);
        this.GolemLeftLeg.mirror = true;
        this.GolemLeftLeg.setRotationPoint(5.0F, 11.0F, 0.0F);
        this.GolemLeftLeg.addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, 0.0F);
        this.GolemHead = new ModelRenderer(this, 0, 0);
        this.GolemHead.setRotationPoint(0.0F, -7.0F, -2.0F);
        this.GolemHead.addBox(-4.0F, -12.0F, -5.5F, 8, 10, 8, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.GolemNose.render(f5);
        this.GolemLowerBody.render(f5);
        this.GolemLeftArm.render(f5);
        this.GolemRightArm.render(f5);
        this.GolemUpperBody.render(f5);
        this.GolemRightLeg.render(f5);
        this.GolemLeftLeg.render(f5);
        this.GolemHead.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        this.GolemHead.rotateAngleY = netHeadYaw * 0.017453292F;
        this.GolemHead.rotateAngleX = headPitch * 0.017453292F;
        this.GolemLeftLeg.rotateAngleX = -1.5F * this.triangleWave(limbSwing, 13.0F) * limbSwingAmount;
        this.GolemRightLeg.rotateAngleX = 1.5F * this.triangleWave(limbSwing, 13.0F) * limbSwingAmount;
        this.GolemLeftLeg.rotateAngleY = 0.0F;
        this.GolemRightLeg.rotateAngleY = 0.0F;
    }
    
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime)
    {
        TitaniumGolem entitytitaniumgolem = (TitaniumGolem)entitylivingbaseIn;
        int i = entitytitaniumgolem.getAttackTimer();

        if (i > 0)
        {
            this.GolemRightArm.rotateAngleX = -2.0F + 1.5F * this.triangleWave((float)i - partialTickTime, 10.0F);
            this.GolemLeftArm.rotateAngleX = -2.0F + 1.5F * this.triangleWave((float)i - partialTickTime, 10.0F);
        }
        else
        {
            int j = entitytitaniumgolem.getHoldRoseTick();

            if (j > 0)
            {
                this.GolemRightArm.rotateAngleX = -0.8F + 0.025F * this.triangleWave((float)j, 70.0F);
                this.GolemLeftArm.rotateAngleX = 0.0F;
            }
            else
            {
                this.GolemRightArm.rotateAngleX = (-0.2F + 1.5F * this.triangleWave(limbSwing, 13.0F)) * limbSwingAmount;
                this.GolemLeftArm.rotateAngleX = (-0.2F - 1.5F * this.triangleWave(limbSwing, 13.0F)) * limbSwingAmount;
            }
        }
    }
    
    private float triangleWave(float p_78172_1_, float p_78172_2_)
    {
        return (Math.abs(p_78172_1_ % p_78172_2_ - p_78172_2_ * 0.5F) - p_78172_2_ * 0.25F) / (p_78172_2_ * 0.25F);
    }
}
