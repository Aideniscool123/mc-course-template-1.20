package net.aiden.mccourse;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LoggerFactory.getLogger("mccourse");
	//Test
	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}