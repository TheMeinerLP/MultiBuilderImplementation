package dev.thmeinerlp.builder;

public sealed interface PlayerText extends Text permits BukkitPlayerText {

    void displayToPlayer();

    sealed interface Builder extends Text.Builder<Builder> permits BukkitPlayerTextBuilder {

        @Override
        Builder append(String text);

        @Override
        Builder appendLabel(LabelLibrary labelLibrary);

        @Override
        Builder appendNotAuthorized();

        PlayerText build();

    }

}
