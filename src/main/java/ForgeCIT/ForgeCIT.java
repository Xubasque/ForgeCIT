package ForgeCIT;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
	modid = ForgeCIT.MODID,
	name = ForgeCIT.NAME,
	version = ForgeCIT.VERSION
)
public class ForgeCIT {
	public static final String MODID = "forgecit";
	public static final String NAME = "Forge CIT";
	public static final String VERSION = "0.1";
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent preinit) {
		LOGGER.info("Hello, world!");
	}
}