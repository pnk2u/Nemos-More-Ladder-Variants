package de.pnku.nemosmoreladdervariants.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.ArrayList;
import java.util.List;

import static de.pnku.nemosmoreladdervariants.NemosMoreLadderVariants.asNemoId;
import static de.pnku.nemosmoreladdervariants.NemosMoreLadderVariants.isNemosCarpentryLoaded;

public class NmlvBlocks {
    public static List<Block> more_ladders = new ArrayList<>();

    private static Block registerLadderBlock(String name) {
        if (isNemosCarpentryLoaded){return null;}
        Block ladderBlock = new LadderBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).setId(ResourceKey.create(Registries.BLOCK, asNemoId(name))));
        more_ladders.add(ladderBlock);
        return Registry.register(BuiltInRegistries.BLOCK, asNemoId(name), ladderBlock);
    }
    private static Block registerLadderBlock(String name, SoundType soundType) {
        if (isNemosCarpentryLoaded){return null;}
        Block ladderBlock = new LadderBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).setId(ResourceKey.create(Registries.BLOCK, asNemoId(name))).sound(soundType));
        more_ladders.add(ladderBlock);
        return Registry.register(BuiltInRegistries.BLOCK, asNemoId(name), ladderBlock);
    }

    public static void register() {}

    // Ladder Variant Blocks (Reverse Order)
    public static final Block WARPED_LADDER = registerLadderBlock("warped_ladder", SoundType.NETHER_WOOD);

    public static final Block CRIMSON_LADDER = registerLadderBlock("crimson_ladder", SoundType.NETHER_WOOD);

    public static final Block BOUND_BAMBOO_LADDER = registerLadderBlock("bound_bamboo_ladder", SoundType.BAMBOO_WOOD);

    public static final Block BAMBOO_LADDER = registerLadderBlock("bamboo_ladder", SoundType.BAMBOO_WOOD);

    public static final Block CHERRY_LADDER = registerLadderBlock("cherry_ladder", SoundType.CHERRY_WOOD);

    public static final Block MANGROVE_LADDER = registerLadderBlock("mangrove_ladder");

    public static final Block DARK_OAK_LADDER = registerLadderBlock("dark_oak_ladder");

    public static final Block PALE_OAK_LADDER = registerLadderBlock("pale_oak_ladder");

    public static final Block ACACIA_LADDER = registerLadderBlock("acacia_ladder");

    public static final Block JUNGLE_LADDER = registerLadderBlock("jungle_ladder");

    public static final Block BIRCH_LADDER = registerLadderBlock("birch_ladder");

    public static final Block SPRUCE_LADDER = registerLadderBlock("spruce_ladder");

}
