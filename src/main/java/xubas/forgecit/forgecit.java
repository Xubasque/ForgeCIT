package xubas.forgecit;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xubas.forgecit.proxy.CommonProxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
	modid = forgecit.MODID,
	name = forgecit.NAME,
	version = forgecit.VERSION,
	dependencies = "required-after:Forge@[14.23.5.2860,)"
)
public class forgecit {
	public static final String MODID = "forgecit";
	public static final String NAME = "Forge CIT";
	public static final String VERSION = "0.1";
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent preinit) {
		LOGGER.info("ForgeCIT is loading!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent init){

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent postInit){

	}

	@SidedProxy(serverSide = "xubas.forgecit.proxy.CommonProxy", clientSide = "xubas.forgecit.proxy.CommonProxy")
	public static CommonProxy proxy;
}