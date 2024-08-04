package dev.thmeinerlp.builder;

import org.bukkit.entity.Player;

final class BukkitPlayerTextBuilder implements PlayerText.Builder {

    private final Player player;

    public BukkitPlayerTextBuilder(Player player) {
        this.player = player;
    }

    @Override
    public BukkitPlayerTextBuilder append(String text) {
        //TODO: Logik
        return this;
    }

    @Override
    public BukkitPlayerTextBuilder appendLabel(LabelLibrary labelLibrary) {
        //TODO: Logik
        return this;
    }

    @Override
    public BukkitPlayerTextBuilder appendNotAuthorized() {
        //TODO: Logik
        return this;
    }

    @Override
    public PlayerText build() {
        return new BukkitPlayerText(player);
    }
}
