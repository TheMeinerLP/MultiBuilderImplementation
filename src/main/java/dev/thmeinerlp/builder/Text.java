package dev.thmeinerlp.builder;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public interface Text {

    void sendToCommandSender(CommandSender sender);

    interface Builder<T extends Builder<T>> {

        T append(String text);

        T appendLabel(LabelLibrary labelLibrary);

        T appendNotAuthorized();
    }

    static PlayerText.Builder playerBuilder(Player player) {
        return new BukkitPlayerTextBuilder(player);
    }
}
