package fieryphoenix99.mod.init;

import fieryphoenix99.mod.Main;
import fieryphoenix99.mod.entity.TitaniumGolem;
import fieryphoenix99.mod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	
	public static void registerEntities() {
		registerEntity("titanium_golem", TitaniumGolem.class, Reference.ENTITY_TITANIUM_GOLEM, 40, 11459288, 8758952);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
