package pvp.spmc.arena;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.boss.BarColor;
import pvp.spmc.display.BossBarDisplay;
import pvp.spmc.status.GameStatus;

import java.util.ArrayList;
import java.util.UUID;

public class ArenaManager {
    private static String name;
    private int id;
    private GameStatus status;
    private boolean mapdone;
    private ArrayList<UUID> plrs;
    private Location lbyspawn;
    private Location bspawn;
    private Location rspawn;
    public ArenaManager(String name, int id, boolean mapdone, ArrayList<UUID> plrs, Location lby, Location blue, Location red) {
        this.name = name;
        this.id = id;
        this.mapdone = mapdone;
        this.plrs = plrs;
        this.lbyspawn = lby;
        this.rspawn = red;
        this.bspawn = blue;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public ArrayList<UUID> getPlrs() {
        return plrs;
    }

    public void setPlrs(ArrayList<UUID> plrs) {
        this.plrs = plrs;
    }

    public Location getLbyspawn() {
        return lbyspawn;
    }

    public void setLbyspawn(Location lbyspawn) {
        this.lbyspawn = lbyspawn;
    }

    public Location getBspawn() {
        return bspawn;
    }

    public void setBspawn(Location bspawn) {
        this.bspawn = bspawn;
    }

    public Location getRspawn() {
        return rspawn;
    }

    public void setRspawn(Location rspawn) {
        this.rspawn = rspawn;
    }

    public boolean isMapdone() {
        return mapdone;
    }

    public void setMapdone(boolean mapdone) {
        this.mapdone = mapdone;
        switch(status) {
            case STARTING:
                World world = Bukkit.getWorld(getName());
                int x1 = 30;
                int y1 = 50;
                int z1 = 10;
                int x2 = -30;
                int y2 = 0;
                int z2 = -10;{
                for (int x = x1; x <= x2; x++) {
                    for (int y = y1; y <= y2; y++) {
                        for (int z = z1; z <= z2; z++) {
                            Block n = world.getBlockAt(x, y, z);
                            n.setType(Material.AIR);
                        }
                    }
                }
                BossBarDisplay.bar.setTitle("Bridge");
                BossBarDisplay.bar.setProgress(6.0);
                BossBarDisplay.bar.setColor(BarColor.WHITE);
            }
                break;
            case B1:
                BossBarDisplay.bar.setTitle("Blue");
                BossBarDisplay.bar.setProgress(2.0);
                BossBarDisplay.bar.setColor(BarColor.BLUE);
                break;
            case B2:
                BossBarDisplay.bar.setTitle("Blue");
                BossBarDisplay.bar.setProgress(4.0);
                BossBarDisplay.bar.setColor(BarColor.BLUE);
                break;
            case B3:
                BossBarDisplay.bar.setTitle("Blue");
                BossBarDisplay.bar.setProgress(6.0);
                BossBarDisplay.bar.setColor(BarColor.BLUE);
                break;
            case R1:
                BossBarDisplay.bar.setTitle("Red");
                BossBarDisplay.bar.setProgress(2.0);
                BossBarDisplay.bar.setColor(BarColor.RED);
                break;
            case R2:
                BossBarDisplay.bar.setTitle("Red");
                BossBarDisplay.bar.setProgress(4.0);
                BossBarDisplay.bar.setColor(BarColor.RED);
                break;
            case R3:
                BossBarDisplay.bar.setTitle("Red");
                BossBarDisplay.bar.setProgress(6.0);
                BossBarDisplay.bar.setColor(BarColor.RED);
                break;
            case RWIN:
                BossBarDisplay.bar.setTitle("Red Wins");
                BossBarDisplay.bar.setProgress(6.0);
                BossBarDisplay.bar.setColor(BarColor.RED);
                break;
            case BWIN:
                BossBarDisplay.bar.setTitle("Blue Wins");
                BossBarDisplay.bar.setProgress(6.0);
                BossBarDisplay.bar.setColor(BarColor.BLUE);
                break;
        }
    }
}

