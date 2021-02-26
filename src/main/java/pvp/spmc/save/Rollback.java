package pvp.spmc.save;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.List;

public class Rollback {
    World world = Bukkit.getWorld("bridgepvp"); {
        List<Player> players = world.getPlayers();
        Integer size = players.size();
        if (size == 0) {
            WorldManagement.rollback(world.getName());
        }
    }
}

