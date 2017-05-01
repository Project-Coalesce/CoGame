package com.coalesce.kgame;

import org.bukkit.plugin.java.JavaPlugin;

public interface ICommons {
    default IKGame getFramework() {
        return (IKGame) JavaPlugin.getProvidingPlugin(IKGame.class);
    }
}
