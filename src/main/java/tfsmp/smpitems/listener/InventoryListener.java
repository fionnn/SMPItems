package tfsmp.smpitems.listener;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.item.*;
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
        player.getInventory().all(Material.DRAGON_BREATH).entrySet().forEach(entry ->
        {
            if (SUtil.isItemValid((ItemStack) entry, new Battery())) {
                player.sendMessage(SUtil.color("&6The battery's power has improved your items."));
                new BatteryUsage(true, player);
                return;
            }
            new BatteryUsage(false, player);
        });
    }
}