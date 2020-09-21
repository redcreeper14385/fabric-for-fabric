package mounderfod.fabricforfabric.registry;

import mounderfod.fabricforfabric.FightersGloves;
import mounderfod.fabricforfabric.HeartRing;
import mounderfod.fabricforfabric.LuckRing;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TrinketItems {
    public static void RegisterItems() {
        // Fighter's Gloves
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "fighters_gloves"), new FightersGloves());
        // Heart and Luck Rings
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "heart_ring"), new HeartRing());
        Registry.register(Registry.ITEM, new Identifier("fabricforfabric", "luck_ring"), new LuckRing());
    }
}
