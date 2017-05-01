package com.coalesce.kgame;

import org.bukkit.plugin.Plugin;

import java.util.Optional;
import java.util.Set;

/**
 * A game which has to be implemented by a using minigame plugin.
 *
 * @since 1.0
 */
public interface IGame extends ICommons {
    /**
     * Gets the plugin which owns this minigame.
     *
     * @return The owner.
     * @since 1.0
     */
    Plugin getOwner();

    /**
     * Gets whether or not this minigame uses arenas.
     * If it doesn't, it's allowed to return an empty optional at {@link #getArenas()} and to use the entire server.
     *
     * @return Whether or not the minigame uses arenas.
     * @since 1.0
     */
    boolean usesArenas();

    /**
     * Gets the arenas assigned this minigame, no matter if they're used.
     *
     * @return The arenas wrapped in an Optional. See {@link #usesArenas()}.
     * @see #usesArenas()
     * @since 1.0
     */
    Optional<Set<IArena>> getArenas();
}
