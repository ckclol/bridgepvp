package pvp.spmc;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.plugin.java.JavaPlugin;
import pvp.spmc.arena.ArenaManager;
import pvp.spmc.arena.ArenaMethods;
import pvp.spmc.cmd.ArenaCreate;

import java.util.HashMap;

public final class Bridge extends JavaPlugin {
    public static Bridge plugin;
    public HashMap<String, ArenaManager> arenaManagerHashMap = new HashMap<>();
    @Override
    public void onEnable() {
        plugin = this;
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
        this.getCommand("arena").setExecutor(new ArenaCreate());
    }

    @Override
    public void onDisable() {
        ArenaMethods.setup();
    }
}
