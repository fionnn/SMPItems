package me.totalfreedom.smpitems.listener;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import me.totalfreedom.smpitems.SMPItems;

public class BlockListener implements Listener
{
    private SMPItems plugin;
    public BlockListener(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e)
    {
        Location bloc = e.getBlock().getLocation();
        ItemStack broke = e.getPlayer().getInventory().getItemInMainHand();
        /*
        if (!broke.hasItemMeta())
            return;
        if (!broke.getItemMeta().hasDisplayName())
            return;
        if (!broke.getItemMeta().getDisplayName().startsWith(ChatColor.GOLD + "") && !broke.getItemMeta().getDisplayName().endsWith("POW! Bow"))
            return;
            */
    }
}