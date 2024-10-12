package de.pnku.nemosmoreladdervariants.init;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.*;

import static de.pnku.nemosmoreladdervariants.NemosMoreLadderVariants.asNemoId;
import static de.pnku.nemosmoreladdervariants.NemosMoreLadderVariants.isNemosCarpentryLoaded;


public class NmlvItems {
    private static Item registerLadderBlockItem(String path, Block ladder) {
        if (isNemosCarpentryLoaded) {return null;}
        BlockItem ladderItem = new BlockItem(ladder, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, asNemoId(path))));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(Items.LADDER, ladderItem));

        return Registry.register(BuiltInRegistries.ITEM, asNemoId(path), ladderItem);
    }

    public static void register() {}

    public static final Item WARPED_LADDER = registerLadderBlockItem("warped_ladder", NmlvBlocks.WARPED_LADDER);

    public static final Item CRIMSON_LADDER = registerLadderBlockItem("crimson_ladder", NmlvBlocks.CRIMSON_LADDER);

    public static final Item BOUND_BAMBOO_LADDER = registerLadderBlockItem("bound_bamboo_ladder", NmlvBlocks.BOUND_BAMBOO_LADDER);

    public static final Item BAMBOO_LADDER = registerLadderBlockItem("bamboo_ladder", NmlvBlocks.BAMBOO_LADDER);

    public static final Item CHERRY_LADDER = registerLadderBlockItem("cherry_ladder", NmlvBlocks.CHERRY_LADDER);

    public static final Item MANGROVE_LADDER = registerLadderBlockItem("mangrove_ladder", NmlvBlocks.MANGROVE_LADDER);

    public static final Item DARK_OAK_LADDER = registerLadderBlockItem("dark_oak_ladder", NmlvBlocks.DARK_OAK_LADDER);

    public static final Item ACACIA_LADDER = registerLadderBlockItem("acacia_ladder", NmlvBlocks.ACACIA_LADDER);

    public static final Item JUNGLE_LADDER = registerLadderBlockItem("jungle_ladder", NmlvBlocks.JUNGLE_LADDER);

    public static final Item BIRCH_LADDER = registerLadderBlockItem("birch_ladder", NmlvBlocks.BIRCH_LADDER);

    public static final Item SPRUCE_LADDER = registerLadderBlockItem("spruce_ladder", NmlvBlocks.SPRUCE_LADDER);
}
