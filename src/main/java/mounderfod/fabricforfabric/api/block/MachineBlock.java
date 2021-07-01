package mounderfod.fabricforfabric.api.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class MachineBlock extends Block {
    public MachineBlock() {
        super(Settings.copy(Blocks.IRON_BLOCK).requiresTool());
    }
}
