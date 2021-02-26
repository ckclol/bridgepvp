package pvp.spmc.cmd;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pvp.spmc.arena.ArenaManager;
import pvp.spmc.status.GameStatus;

public class StartGame implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings[0] == "start") {
            Player p = (Player) commandSender;
            p.teleport(new Location(Bukkit.getWorld("bridgepvp"), 0, 100, 0));
            ArenaManager.status = GameStatus.STARTING;
        }
        return true;
    }
}
