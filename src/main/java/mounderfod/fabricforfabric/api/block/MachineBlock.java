package mounderfod.fabricforfabric.api.block;

import mounderfod.fabricforfabric.registry.UtilityItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MachineBlock extends Block {
    public MachineBlock() {
        super(Settings.copy(Blocks.IRON_BLOCK).requiresTool());
    }
}
