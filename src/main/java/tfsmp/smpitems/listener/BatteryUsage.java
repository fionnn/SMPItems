package tfsmp.smpitems.listener;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class BatteryUsage {
    private static List<Player> BatteryList = new ArrayList<>();
    private static int BatteryEfficiency = 3;

    public static int IfUsage(Player player) {
        if (BatteryList.contains(player)) {
            return BatteryEfficiency;
        }
        return 1;
    }

    public BatteryUsage(boolean BatteryToggle, Player player) {
        BatteryList.add(player);
        if (!BatteryToggle) {
            BatteryList.remove(player);
        }
        return;
    }
}

