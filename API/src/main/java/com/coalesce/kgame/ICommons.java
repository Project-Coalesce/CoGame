package com.coalesce.kgame;

import com.coalesce.kgame.utilities.BukkitUtils;

/**
 * Common methods which has to be implemented by pretty much all parts of the library.
 *
 * @since 1.0
 */
public interface ICommons {
    /**
     * Gets the KGame framework.
     *
     * @return The KGame framework.
     * @since 1.0
     */
    default KGame getFramework() {
        return BukkitUtils.getService(KGame.class);
    }
}
