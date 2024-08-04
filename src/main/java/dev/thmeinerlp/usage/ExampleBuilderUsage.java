package dev.thmeinerlp.usage;

import dev.thmeinerlp.builder.LabelLibrary;
import dev.thmeinerlp.builder.Text;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ExampleBuilderUsage extends JavaPlugin {

    @Override
    public void onEnable() {
        Text
                .playerBuilder(Bukkit.getPlayer("ExamplePlayer"))
                .append("")
                .appendLabel(LabelLibrary.SERVER)
                .appendNotAuthorized()
                .build()
                .displayToPlayer();
    }
}
