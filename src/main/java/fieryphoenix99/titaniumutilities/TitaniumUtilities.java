package fieryphoenix99.titaniumutilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fieryphoenix99.titaniumutilities.core.init.BlockInit;
import fieryphoenix99.titaniumutilities.core.init.ItemInit;
import fieryphoenix99.titaniumutilities.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TitaniumUtilities.MOD_ID)
public class TitaniumUtilities {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "titanutil";
    public static final ItemGroup TITANIUM_UTILITIES_GROUP = new TitaniumUtilitiesGroup("titaniumUtilitiesGroup");
    
    public TitaniumUtilities() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }
    
    public static class TitaniumUtilitiesGroup extends ItemGroup {

		public TitaniumUtilitiesGroup(String label) {
			super(label);
		}

		@Override
		public ItemStack makeIcon() {
			return ItemInit.TITANIUM_INGOT.get().getDefaultInstance();
		}
    	
    	
    }
}
