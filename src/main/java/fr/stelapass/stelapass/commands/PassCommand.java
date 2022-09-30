package fr.stelapass.stelapass.commands;

import fr.stelarys.stelamenuapi.StelaMenuAPI;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PassCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String msg, @NotNull String[] args) {

        // Get command name
        if (cmd.getName().equalsIgnoreCase("pass")) {

            // Check if sender is a player
            if (sender instanceof Player player) {

                // Check permission
                if (!(player.hasPermission("stelapass.use"))) {
                    player.sendMessage(ChatColor.RED + "Vous n'avez pas la permission de faire cette commande !");
                    return false;
                }

                // Open menu

            } else {
                // Return error message
                sender.sendMessage(ChatColor.RED + "Cette commande doit être exécutée en jeu !");
            }
        }
        return false;
    }
}
