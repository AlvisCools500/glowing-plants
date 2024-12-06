package io.github.thebluetropics.examplemod;

import io.github.thebluetropics.examplemod.Blocks.BlockingBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.block.Block;

public class azureblocks {
    // Blocks
    public static final Block NEON_BLOCK = quickRegistery.registerBlock(
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.NETHERRACK)),
            "neon_block",
            true
    );

    public static final Block BLOCKING_BLOCK = quickRegistery.registerBlock(
            new BlockingBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                    .strength(1.5f)
                    .luminance(state -> 5)
            ),
            "blocking_block",
            true
    );

    public static void initialize() {}

}
