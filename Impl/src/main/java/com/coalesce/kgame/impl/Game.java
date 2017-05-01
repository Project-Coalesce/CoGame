package com.coalesce.kgame.impl;

import com.coalesce.kgame.KGame;
import com.coalesce.kgame.utilities.BukkitUtils;

public class Game extends KGame {
    /**
     * Gets the instance using the services manager.
     *
     * @return The instance of this.
     * @deprecated Rather use the services manager directly.
     */
    @Deprecated
    public static Game getInstance() {
        return (Game) BukkitUtils.getService(KGame.class);
    }
}
