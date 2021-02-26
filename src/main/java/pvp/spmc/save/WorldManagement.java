package pvp.spmc.save;

import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;
import pvp.spmc.Bridge;

public class WorldManagement {
    public static void unloadMap(String mapname) {
        if (Bukkit.getServer().unloadWorld(Bukkit.getServer().getWorld(mapname), false)) {
            Bridge.plugin.getLogger().info("Successfully unloaded " + mapname);
        } else {
            Bridge.plugin.getLogger().severe("COULD NOT UNLOAD " + mapname);
        }
    }
    public static void loadMap(String mapname) {
        Bukkit.getServer().createWorld(new WorldCreator(mapname));
    }
    public static void rollback(String mapname) {
        unloadMap(mapname);
        loadMap(mapname);
    }
}