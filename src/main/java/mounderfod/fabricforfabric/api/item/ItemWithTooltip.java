package mounderfod.fabricforfabric.api.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ItemWithTooltip extends Item {

    public TranslatableText[] tooltipText;

    public ItemWithTooltip(Settings settings, TranslatableText[] tooltipText) {
        super(settings);
        this.tooltipText = tooltipText;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        for (TranslatableText i : tooltipText) {
            tooltip.add(i.formatted(Formatting.GRAY));
        }
    }
}
