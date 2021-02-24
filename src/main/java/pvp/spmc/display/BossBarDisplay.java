package pvp.spmc.display;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import pvp.spmc.Bridge;
import pvp.spmc.plr.JoinEvent;

public class BossBarDisplay {
    public Bridge plugin;
    public static BossBar bar;
    public int taskID = -1;
    public BossBarDisplay(Bridge plugin) {
        this.plugin = plugin;
    }
    public void addPlayer(Player plr) {
        bar.addPlayer(plr);
    }
    public BossBar getBossBar() {
        return bar;
    }
    public void createBar() {
        bar = Bukkit.createBossBar("Waiting: " + JoinEvent.plrcount + "/2", BarColor.WHITE, BarStyle.SEGMENTED_6);
        bar.setVisible(true);
    }
}