package com.coalesce.kgame;

import org.bukkit.plugin.Plugin;

public interface IGame extends ICommons {
    Plugin getOwner();

    boolean usesArenas();
}
