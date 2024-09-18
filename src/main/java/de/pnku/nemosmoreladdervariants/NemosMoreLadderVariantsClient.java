package de.pnku.nemosmoreladdervariants;

import de.pnku.nemosmoreladdervariants.init.NmlvBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

import static de.pnku.nemosmoreladdervariants.NemosMoreLadderVariants.isNemosCarpentryLoaded;

@Environment(EnvType.CLIENT)
public class NemosMoreLadderVariantsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        if (!isNemosCarpentryLoaded) {
            for (Block ladderBlock : NmlvBlocks.more_ladders) {
                BlockRenderLayerMap.INSTANCE.putBlock(ladderBlock, RenderType.cutout());
            }
        }
    }
}
