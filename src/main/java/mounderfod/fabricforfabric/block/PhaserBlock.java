package mounderfod.fabricforfabric.block;

import mounderfod.fabricforfabric.api.block.MachineBlock;
import mounderfod.fabricforfabric.registry.Machines;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class PhaserBlock extends MachineBlock {

    public static final BooleanProperty PASSTHROUGH;

    public PhaserBlock() {
        super();
        this.setDefaultState(this.getDefaultState().with(PASSTHROUGH, false));
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        if (state.get(PASSTHROUGH) != world.isReceivingRedstonePower(pos)) {
            world.setBlockState(pos, state.cycle(PASSTHROUGH));
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
