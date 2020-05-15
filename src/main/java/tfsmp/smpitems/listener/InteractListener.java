package tfsmp.smpitems.listener;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import tfsmp.smpitems.SMPItems;

public class InteractListener implements Listener
{
    private SMPItems plugin;
    public InteractListener(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e)
    {
        switch (e.getAction())
        {
            case RIGHT_CLICK_BLOCK:
            case RIGHT_CLICK_AIR:
            {
                Player player = e.getPlayer();
                ItemStack stack = player.getInventory().getItemInMainHand();
                if (!stack.hasItemMeta())
                    return;
                if (!stack.getItemMeta().hasDisplayName())
                    return;
                if (stack.getItemMeta().getDisplayName().startsWith(ChatColor.GOLD + "") && stack.getItemMeta().getDisplayName().endsWith("End?"))
                {
                    Block block = player.getTargetBlock(null, 20);
                    block.getWorld().strikeLightning(block.getLocation());
                    break;
                }
            }
        }
    }
}