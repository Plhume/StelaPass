package fr.stelapass.stelapass;

import fr.stelapass.stelapass.commands.PassCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Stelapass extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().getPlugin("StelaMenuAPI");
        getCommand("pass").setExecutor(new PassCommand());

        getLogger().info("Plugin enabled!");
    }
}
