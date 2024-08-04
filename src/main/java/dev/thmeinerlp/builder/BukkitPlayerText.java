package dev.thmeinerlp.builder;

import net.kyori.adventure.text.Component;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

final class BukkitPlayerText implements PlayerText {

    private final Player player;

    public BukkitPlayerText(Player player) {
        this.player = player;
    }

    @Override
    public void displayToPlayer() {
        player.sendMessage(Component.empty());
    }

    @Override
    public void sendToCommandSender(CommandSender sender) {
        sender.sendMessage(Component.empty());
    }
}
