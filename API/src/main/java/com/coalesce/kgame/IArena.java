package com.coalesce.kgame;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

import java.util.HashSet;
import java.util.Set;

/**
 * An arena which is being used by a minigame.
 *
 * @since 1.0
 */
public interface IArena extends ICommons, Listener {
    /**
     * Gets the plugin which owns this arena.
     *
     * @return The plugin which owns the arena.
     * @since 1.0
     */
    default Plugin getOwner() {
        return getGame().getOwner();
    }

    /**
     * Gets the game which owns the arena.
     *
     * @return The game which owns the arena.
     * @since 1.0
     */
    IGame getGame();

    /**
     * Gets the minimum location of the arenas total area.
     *
     * @return The minimum location.
     * @since 1.0
     */
    Location getMin();

    /**
     * Gets the maximum location of the arenas total area.
     *
     * @return The maximum location.
     * @since 1.0
     */
    Location getMax();

    /**
     * Gets the maximum players the arena can have before it's full.
     *
     * @return The max player amount.
     * @since 1.0
     */
    int maxPlayers();

    /**
     * Gets the minimum players before the arena has the ability to start.
     *
     * @return The min player amount.
     * @since 1.0
     */
    int minPlayers();

    /**
     * Starts the game and applies all effects and such to the arena.
     *
     * @since 1.0
     */
    void startGame();

    /**
     * Gets all locations between {@link #getMin()} and {@link #getMax()}.
     * It's recommended to make this method lazy.
     *
     * @return All locations between {@link #getMin()} and {@link #getMax()}.
     * @since 1.0
     */
    default Set<Location> allLocations() {
        Set<Location> locations = new HashSet<>();
        if (getMin().getWorld() != getMax().getWorld()) {
            throw new IllegalStateException("Min world cannot be in a different world from max.");
        }
        for (double x = Math.min(getMin().getX(), getMax().getX()); x < Math.max(getMin().getX(), getMax().getX()); x++) {
            for (double y = Math.min(getMin().getY(), getMax().getY()); y < Math.max(getMin().getY(), getMax().getY()); y++) {
                for (double z = Math.min(getMin().getZ(), getMax().getZ()); z < Math.max(getMin().getZ(), getMax().getZ()); z++) {
                    locations.add(new Location(getMin().getWorld(), x, y, z));
                }
            }
        }
        return locations;
    }

    /**
     * Gets all participators in this arena.
     * The Player references aren't weak, and should be handled correctly.
     *
     * @return The arena participators.
     * @since 1.0
     */
    Set<Player> participators();
}
