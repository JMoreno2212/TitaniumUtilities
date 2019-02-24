package fieryphoenix99.mod;

import fieryphoenix99.mod.init.ModEntities;
import fieryphoenix99.mod.init.ModRecipes;
import fieryphoenix99.mod.proxy.CommonProxy;
import fieryphoenix99.mod.tabs.TitaniumUtilitiesTab;
import fieryphoenix99.mod.util.Reference;
import fieryphoenix99.mod.util.handlers.RegistryHandler;
import fieryphoenix99.mod.util.handlers.RenderHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	public static final CreativeTabs TITANIUM_UTILITIES_TAB = new TitaniumUtilitiesTab("titaniumUtilitiesTab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		RegistryHandler.otherRegistries();
		ModEntities.registerEntities();
		RenderHandler.registerEntityRenders();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}
	
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
	
}
