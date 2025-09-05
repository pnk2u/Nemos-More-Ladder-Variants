package de.pnku.nemosmoreladdervariants;

import de.pnku.nemosmoreladdervariants.init.NmlvBlocks;
import de.pnku.nemosmoreladdervariants.init.NmlvItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class NemosMoreLadderVariants implements ModInitializer {

	public static final String MOD_ID = "nemos-moreladdervariants";
	public static final String NEMOS_MOD_ID = "nemos-carpentry";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static Boolean isNemosCarpentryLoaded = false;
	
	@Override
	public void onInitialize() {
		if (FabricLoader.getInstance().isModLoaded(NEMOS_MOD_ID)) {
		isNemosCarpentryLoaded = true;
		}
		if (!isNemosCarpentryLoaded) {
		NmlvBlocks.register();
		NmlvItems.register();
		}
	}

	public static ResourceLocation asNemoId(String path) {
		return ResourceLocation.fromNamespaceAndPath(NEMOS_MOD_ID, path);
	}

}
