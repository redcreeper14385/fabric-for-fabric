package mounderfod.fabricforfabric.api.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name="fabricforfabric")
public class F4FConfig implements ConfigData {
    public boolean machines = true;
    public boolean grippedTools = true;
    public boolean utilityItems = true;
    public int bandageDuration = 5;
}
