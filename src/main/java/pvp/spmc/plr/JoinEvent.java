package pvp.spmc.plr;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {
    public static int plrcount = 0;
    @EventHandler
    public void plrjoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        World w = p.getWorld();
        if (w.getName() == "bridgepvp") {
            plrcount = plrcount + 1;
        }
    }
}
