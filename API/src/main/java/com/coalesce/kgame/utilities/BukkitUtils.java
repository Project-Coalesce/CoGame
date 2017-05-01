package com.coalesce.kgame.utilities;

import org.bukkit.Bukkit;

public class BukkitUtils {
    public static <T> T getService(Class<T> clazz) {
        return Bukkit.getServicesManager().getRegistration(clazz).getProvider();
    }
}
