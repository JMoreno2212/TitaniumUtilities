package fieryphoenix99.mod.util.handlers;

import fieryphoenix99.mod.entity.TitaniumGolem;
import fieryphoenix99.mod.entity.register.RenderTitaniumGolem;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	
	public static void registerEntityRenders() {
		
		RenderingRegistry.registerEntityRenderingHandler(TitaniumGolem.class, new IRenderFactory<TitaniumGolem>() {

			@Override
			public Render<? super TitaniumGolem> createRenderFor(RenderManager manager) {
				return new RenderTitaniumGolem(manager);
			}
			
		});
	}
}
