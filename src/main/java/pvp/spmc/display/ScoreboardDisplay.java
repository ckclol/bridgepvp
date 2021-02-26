package pvp.spmc.display;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scoreboard.*;
import pvp.spmc.plr.JoinEvent;

public class ScoreboardDisplay {
     static ScoreboardManager sbm = Bukkit.getScoreboardManager();
     static Scoreboard sb = sbm.getNewScoreboard();
     public static Objective objective = sb.registerNewObjective("bridge", "dummy", ChatColor.BLUE + "BridgePVP"); {
          objective.setDisplaySlot(DisplaySlot.SIDEBAR);
          Score s2 = objective.getScore(JoinEvent.plrcount + "/2");
          s2.setScore(2);
          Score s3 = objective.getScore(ChatColor.GOLD + "spmc.ml");
          s3.setScore(1);
     }
}
