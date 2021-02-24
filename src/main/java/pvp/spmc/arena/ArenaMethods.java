package pvp.spmc.arena;

import pvp.spmc.Bridge;

public class ArenaMethods {
    public static void setup() {
        Bridge plugin;
        plugin = Bridge.plugin;
        for (ArenaManager arena : plugin.arenaManagerHashMap.values()) {
            plugin.getConfig().set(arena.getName(), String.valueOf(arena.getId()));
            plugin.saveConfig();
        }
    }
}
