package me.totalfreedom.smpitems.listener;

import me.totalfreedom.smpitems.item.UltimatiumBoots;
import me.totalfreedom.smpitems.item.UltimatiumChest;
import me.totalfreedom.smpitems.item.UltimatiumHelmet;
import me.totalfreedom.smpitems.item.UltimatiumLeggings;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.PlayerInventory;
import me.totalfreedom.smpitems.SMPItems;
import me.totalfreedom.smpitems.util.SUtil;

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

        if (player.getGameMode() == GameMode.CREATIVE)
        {
            player.setAllowFlight(true);
            return;
        }

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