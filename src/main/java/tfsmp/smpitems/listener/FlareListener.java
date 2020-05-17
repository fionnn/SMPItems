package tfsmp.smpitems.listener;

import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.item.Flare;
import tfsmp.smpitems.util.SLog;
import tfsmp.smpitems.util.SUtil;

import java.util.ArrayList;
import java.util.List;

public class FlareListener implements Listener
{
    private SMPItems plugin;
    public FlareListener(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    private List<Player> flareCooldown = new ArrayList<>();

    @EventHandler
    public void onFlarePlace(BlockPlaceEvent e)
    {
        Player player = e.getPlayer();
        ItemStack hand = player.getInventory().getItemInMainHand();
        ItemStack offhand = player.getInventory().getItemInOffHand();
        if (!SUtil.isItemValid(hand, new Flare()) && !SUtil.isItemValid(offhand, new Flare()))
            return;
        e.setCancelled(true);
        if (flareCooldown.contains(player))
        {
            player.sendMessage(SUtil.color("&b&lFLARE &bCurrently on cooldown."));
            return;
        }
        e.getBlock().getWorld().createExplosion(e.getBlock().getLocation(), 2F, false, false);
        int count = 0;
        for (Entity entity : e.getBlock().getWorld().getEntities())
        {
            if (e.getBlock().getLocation().distance(entity.getLocation()) <= plugin.config.getDouble("server.flare_radius") &&
                    !(entity instanceof Player) &&
                    entity instanceof LivingEntity &&
                    !(entity instanceof EnderDragon) &&
                    !(entity instanceof Wither) &&
                    !(entity instanceof ArmorStand))
            {
                ((LivingEntity) entity).setHealth(0.0);
                count++;
            }
        }
        player.sendMessage(SUtil.color("&b&lFLARE &bFlashed and killed " + count + " creatures!"));
        flareCooldown.add(player);
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                flareCooldown.remove(player);
                player.sendMessage(SUtil.color("&b&lFLARE &bYour ability is ready!"));
            }
        }.runTaskLater(plugin, 20 * 20);
    }
}