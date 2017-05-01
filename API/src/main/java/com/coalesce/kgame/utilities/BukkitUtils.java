package com.coalesce.kgame.utilities;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class BukkitUtils {
    public static <T> T getService(Class<T> clazz) {
        return Bukkit.getServicesManager().getRegistration(clazz).getProvider();
    }

    public static boolean within(Location where, Location min, Location max) {
        double minX = Math.min(min.getX(), max.getX());
        double minY = Math.min(min.getY(), max.getY());
        double minZ = Math.min(min.getZ(), max.getZ());
        if (where.getZ() < minZ || where.getY() < minY || where.getX() < minX) {
            return false;
        }
        double maxX = Math.max(min.getX(), max.getX());
        double maxY = Math.max(min.getY(), max.getY());
        double maxZ = Math.max(min.getZ(), max.getZ());
        return where.getX() <= maxX && where.getY() <= maxY && where.getZ() <= maxZ;
    }
}
