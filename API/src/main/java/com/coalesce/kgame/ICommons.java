package com.coalesce.kgame;

import org.bukkit.Bukkit;

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
        return Bukkit.getServicesManager().getRegistration(KGame.class).getProvider();
    }
}
