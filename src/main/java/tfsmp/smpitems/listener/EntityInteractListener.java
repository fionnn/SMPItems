package tfsmp.smpitems.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.item.MagicalSaddle;
import tfsmp.smpitems.util.SUtil;

public class EntityInteractListener implements Listener
{
    private SMPItems plugin;
    public EntityInteractListener(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void onEntityInteract(PlayerInteractEntityEvent e)
    {
        if (SUtil.isItemValid(e.getPlayer().getInventory().getItemInMainHand(), new MagicalSaddle()) ||
                SUtil.isItemValid(e.getPlayer().getInventory().getItemInOffHand(), new MagicalSaddle()))
            e.getRightClicked().addPassenger(e.getPlayer());
    }
}