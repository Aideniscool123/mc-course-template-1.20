package net.aiden.mccourse;

import net.aiden.mccourse.Item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LoggerFactory.getLogger("mccourse");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}