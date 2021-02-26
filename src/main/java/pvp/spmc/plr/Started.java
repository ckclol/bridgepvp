package pvp.spmc.plr;

import org.bukkit.*;
import org.bukkit.block.*;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;
import pvp.spmc.arena.ArenaManager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Started implements Listener {
    @EventHandler
    public void start(PlayerJoinEvent e) {
        List<Player> p = Bukkit.getServer().getWorld("pvpbridge").getPlayers();
        Player p1 = p.get(0);
        Player p2 = p.get(1);
        ItemStack itema = new ItemStack(Material.IRON_HELMET);
        ItemStack itemb = new ItemStack(Material.IRON_CHESTPLATE);
        ItemStack itemc = new ItemStack(Material.IRON_LEGGINGS);
        ItemStack itemd = new ItemStack(Material.IRON_BOOTS);
        if (JoinEvent.plrcount == 2) {
            p1.sendTitle(ChatColor.GREEN + "3", "", 1, 20, 1);
            p2.sendTitle(ChatColor.GREEN + "3", "", 1, 20, 1);
            p1.sendTitle(ChatColor.YELLOW + "2", "", 1, 20, 1);
            p2.sendTitle(ChatColor.YELLOW + "2", "", 1, 20, 1);
            p1.sendTitle(ChatColor.DARK_RED + "1", "", 1, 20, 1);
            p2.sendTitle(ChatColor.DARK_RED + "1", "", 1, 20, 1);
            p1.sendTitle(ChatColor.WHITE + "Go", "", 1, 20, 1);
            p2.sendTitle(ChatColor.WHITE + "Go", "", 1, 20, 1);
            p1.playSound(p1.getLocation(), Sound.ENTITY_WITHER_DEATH, 1.0f, 1.0f);
            p2.playSound(p2.getLocation(), Sound.ENTITY_WITHER_DEATH, 1.0f, 1.0f);
            p2.teleport(ArenaManager.rspawn);
            p1.teleport(ArenaManager.bspawn);
            p1.getInventory().setArmorContents(new ItemStack[]{itema, itemb, itemc, itemd});
            p2.getInventory().setArmorContents(new ItemStack[]{itema, itemb, itemc, itemd});
            p1.getInventory().addItem(new ItemStack(Material.BLUE_WOOL, 64));
            p1.getInventory().addItem(new ItemStack(Material.BLUE_WOOL, 64));
            p2.getInventory().addItem(new ItemStack(Material.BLUE_WOOL, 64));
            p2.getInventory().addItem(new ItemStack(Material.BLUE_WOOL, 64));
            p1.getInventory().addItem(new ItemStack(Material.IRON_PICKAXE, 1));
            p2.getInventory().addItem(new ItemStack(Material.IRON_PICKAXE, 1));
            p1.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
            p2.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
            Location rb = ArenaManager.rspawn.add(-1, 0, 0);
            Location bb = ArenaManager.bspawn.add(1, 0, 0);
            rb.getBlock().setType(Material.RED_CONCRETE);
            bb.getBlock().setType(Material.BLUE_CONCRETE);
        }
    }
}
