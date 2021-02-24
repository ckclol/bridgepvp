package pvp.spmc.cmd;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pvp.spmc.Bridge;
import pvp.spmc.arena.ArenaManager;
import pvp.spmc.status.GameStatus;

import java.util.ArrayList;
import java.util.UUID;

public class ArenaCreate implements CommandExecutor {
    private Bridge plugin = Bridge.plugin;
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player plr = (Player) sender;
            if (args.length == 2) {
                String name = args[0];
                int id = Integer.parseInt(args[1]);
                boolean done = Boolean.parseBoolean(args[2]);
                plugin.arenaManagerHashMap.put(name, new ArenaManager(name, id, done, new ArrayList<UUID>(), new Location(plr.getWorld(), 15.0, 100.5, 0.0), new Location(plr.getWorld(), -15.0, 25.0, 0.0), new Location(plr.getWorld(), 15.0, 25.0, 0.0)));
                plr.sendMessage(ChatColor.GREEN + "Arena created!");
            } else {
                plr.sendMessage(ChatColor.RED + "Invalid!");
                plr.sendMessage(ChatColor.GREEN + "Usage: /arena <arena> <id> <map done(true / false>");
            }
        }
        return true;
    }
}
