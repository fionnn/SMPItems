package tfsmp.smpitems.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.PlayerInventory;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.item.UltimatiumBoots;
import tfsmp.smpitems.item.UltimatiumChest;
import tfsmp.smpitems.item.UltimatiumHelmet;
import tfsmp.smpitems.item.UltimatiumLeggings;
import tfsmp.smpitems.util.SLog;
import tfsmp.smpitems.util.SUtil;

public class InventoryListener implements Listener
{
    private SMPItems plugin;
    public InventoryListener(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void onInventoryInteract(InventoryCloseEvent e)
    {
        Player player = (Player) e.getPlayer();
        PlayerInventory inv = player.getInventory();
        if (inv.getHelmet() == null || inv.getChestplate() == null || inv.getLeggings() == null || inv.getBoots() == null)
        {
            player.setAllowFlight(false);
            return;
        }
        if (SUtil.isItemValid(inv.getHelmet(), new UltimatiumHelmet()) &&
                SUtil.isItemValid(inv.getChestplate(), new UltimatiumChest()) &&
                SUtil.isItemValid(inv.getLeggings(), new UltimatiumLeggings()) &&
                SUtil.isItemValid(inv.getBoots(), new UltimatiumBoots()))
        {
            player.setAllowFlight(true);
            return;
        }
        player.setAllowFlight(false);
    }
}