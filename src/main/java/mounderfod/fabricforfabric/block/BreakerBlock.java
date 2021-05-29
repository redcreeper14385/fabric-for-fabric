package mounderfod.fabricforfabric.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BreakerBlock extends Block {
    public BreakerBlock() {
        super(Settings.copy(Blocks.IRON_BLOCK).requiresTool());
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        if (world.isReceivingRedstonePower(pos)) {
            world.getBlockTickScheduler().schedule(pos, this, 4);
        }
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        world.breakBlock(new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()), true);
    }
}
