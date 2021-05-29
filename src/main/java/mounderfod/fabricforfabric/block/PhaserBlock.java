package mounderfod.fabricforfabric.block;

import mounderfod.fabricforfabric.registry.Machines;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

public class PhaserBlock extends Block {

    public static final BooleanProperty PASSTHROUGH;

    public PhaserBlock() {
        super(Settings.copy(Blocks.IRON_BLOCK).requiresTool());
        this.setDefaultState((BlockState) this.getDefaultState().with(PASSTHROUGH, false));

    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        if ((Boolean) state.get(PASSTHROUGH) != world.isReceivingRedstonePower(pos)) {
            world.setBlockState(pos, (BlockState) state.cycle(PASSTHROUGH));
        }
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.get(PASSTHROUGH)) {
            return VoxelShapes.empty();
        }
        else {
            return VoxelShapes.fullCube();
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(PASSTHROUGH);
    }

    static {
        PASSTHROUGH = Machines.PASSTHROUGH;
    }
}
