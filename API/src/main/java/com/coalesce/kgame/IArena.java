package com.coalesce.kgame;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.Set;

public interface IArena extends ICommons {
    Plugin getOwner();

    IGame getGame();

    Location getMin();

    Location getMax();

    Set<Location> allLocations();

    Set<Player> participators();
}
