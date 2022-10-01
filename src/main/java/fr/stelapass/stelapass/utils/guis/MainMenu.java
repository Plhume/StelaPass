package fr.stelapass.stelapass.utils.guis;

import fr.stelarys.stelamenuapi.gui.Menu;
import fr.stelarys.stelamenuapi.managers.MenuManager;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;

public class MainMenu extends Menu {

    public MainMenu(MenuManager menuManager) {
        super(menuManager);
    }

    @Override
    public TextComponent getMenuTitle() {
        return Component.text("§6§lPass Aventure");
    }

    @Override
    public int getRows() {
        return 7;
    }

    @Override
    public void handleMenu(InventoryClickEvent inventoryClickEvent) {

    }

    @Override
    public void setMenuItems() {

        // Adventure item
        ItemStack adv = new ItemStack(Material.BEACON, 1);
        ItemMeta adv_meta = adv.getItemMeta();
        ArrayList<String> adv_lore = new ArrayList<>();

        adv_meta.setDisplayName("§a§lAventure");

        adv_lore.add(ChatColor.GRAY + "Suivez votre aventure partout !");

        adv_meta.setLore(adv_lore);
        adv.setItemMeta(adv_meta);

        // Quests item
        ItemStack qts = new ItemStack(Material.BOOK, 1);
        ItemMeta qts_meta = qts.getItemMeta();
        ArrayList<String> qts_lore = new ArrayList<>();

        qts_meta.setDisplayName("§3§lQuêtes");

        qts_lore.add(ChatColor.GRAY + "Effectuez des quêtes");
        qts_lore.add(ChatColor.GRAY + "Et gagnez des récompenses !");

        qts_meta.setLore(qts_lore);
        qts.setItemMeta(qts_meta);

        // Player item
        ItemStack ply = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta ply_meta = (SkullMeta) ply.getItemMeta();
        ArrayList<String> ply_lore = new ArrayList<>();

        ply_meta.setDisplayName("§d§l" + menuManager.getMenuOwner().getName());

        ply_lore.add(ChatColor.GRAY + "Informations sur votre profil");

        ply_meta.setOwningPlayer(menuManager.getMenuOwner());

        ply_meta.setLore(ply_lore);
        ply.setItemMeta(ply_meta);

        // Set items in gui
        inventory.setItem(23, adv);
        inventory.setItem(39, qts);
        inventory.setItem(43, ply);

    }
}
