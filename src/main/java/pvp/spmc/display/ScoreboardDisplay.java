package pvp.spmc.display;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class ScoreboardDisplay {
     ScoreboardManager sbm = Bukkit.getScoreboardManager();
     Scoreboard sb = sbm.getNewScoreboard();
     Objective objective = sb.registerNewObjective("test", "dummy", ChatColor.BLUE + "BridgePVP");
     objective.setDisplaySlot(DisplaySlot.SIDEBAR);
}
