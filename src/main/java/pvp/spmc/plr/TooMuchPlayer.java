package pvp.spmc.plr;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class TooMuchPlayer implements Listener {
    @EventHandler
    public void tmuchplr(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        World w = p.getWorld();
        if (w.getName() == "bridgepvp" || JoinEvent.plrcount == 2) {
            Location loc = new Location(Bukkit.getWorld("lobby"), 0, 50, 0);
            p.teleport(loc);
            p.sendMessage(ChatColor.RED + "The server is maxed.");
        }
    }
}
