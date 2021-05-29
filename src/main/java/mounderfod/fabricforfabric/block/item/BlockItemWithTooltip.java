package mounderfod.fabricforfabric.block.item;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BlockItemWithTooltip extends BlockItem {

    public TranslatableText[] tooltipText;

    public BlockItemWithTooltip(Block block, Settings settings, TranslatableText[] tooltipText) {
        super(block, settings);
        this.tooltipText = tooltipText;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        for (TranslatableText i : tooltipText) {
            tooltip.add(i.formatted(Formatting.GRAY));
        }
    }
}
