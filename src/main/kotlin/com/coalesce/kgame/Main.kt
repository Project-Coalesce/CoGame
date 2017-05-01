package com.coalesce.kgame

import org.bukkit.plugin.java.JavaPlugin

@Suppress("unused") // It's being used by Bukkit's classloader, but reflectively.
class KGame : JavaPlugin() {
    override fun onEnable() {

    }

    override fun onDisable() {

    }
}

fun main(args: Array<String>) {
    println("You should rather plop this in your plugins folder. You won't get far with this.")
    Thread.sleep(5000L) // In case they run it in a bat
    System.exit(0)
}