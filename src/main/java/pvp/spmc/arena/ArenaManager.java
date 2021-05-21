package pvp.spmc.arena;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.boss.BarColor;
import org.bukkit.scoreboard.Score;
import pvp.spmc.display.BossBarDisplay;
import pvp.spmc.display.ScoreboardDisplay;
import pvp.spmc.status.GameStatus;

import java.util.ArrayList;
import java.util.UUID;

public class ArenaManager {
    private static String name;
    private int id;
    public static GameStatus status;
    private boolean mapdone;
    private ArrayList<UUID> plrs;
    private Location lbyspawn;
    public static Location bspawn;
    public static Location rspawn;
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

