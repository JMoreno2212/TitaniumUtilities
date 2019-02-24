package fieryphoenix99.mod.entity.register;

import fieryphoenix99.mod.entity.TitaniumGolem;
import fieryphoenix99.mod.entity.model.ModelTitaniumGolem;
import fieryphoenix99.mod.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTitaniumGolem extends RenderLiving<TitaniumGolem>{
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/titaniumgolem.png");
	
	public RenderTitaniumGolem(RenderManager manager) {
		super(manager, new ModelTitaniumGolem(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(TitaniumGolem entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(TitaniumGolem entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
