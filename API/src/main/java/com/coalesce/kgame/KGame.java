package com.coalesce.kgame;

import com.coalesce.plugin.CoPlugin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.ServicePriority;

public abstract class KGame extends CoPlugin {
    @Override
    public void onPluginEnable() throws Exception {
        Bukkit.getServicesManager().register(KGame.class, this, this, ServicePriority.Highest); // This provider should always be highest
    }
}
