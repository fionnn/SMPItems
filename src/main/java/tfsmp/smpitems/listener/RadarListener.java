package tfsmp.smpitems.listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.item.Radar;
import tfsmp.smpitems.util.SUtil;
import java.util.ArrayList;
import java.util.List;

public class RadarListener implements Listener
{
    private SMPItems plugin;
    public RadarListener(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    private List<Player> radarCooldown = new ArrayList<>();

    @EventHandler
    public void onRadarPlace(BlockPlaceEvent e)
    {
        Player player = e.getPlayer();
        ItemStack hand = player.getInventory().getItemInMainHand();
        ItemStack offhand = player.getInventory().getItemInOffHand();
        if (!SUtil.isItemValid(hand, new Radar()) && !SUtil.isItemValid(offhand, new Radar()))
            return;
        e.setCancelled(true);
        if (radarCooldown.contains(player))
        {
            player.sendMessage(SUtil.color("&6&lRADAR &6Currently on cooldown."));
            return;
        }
        int count = 0;
        for (Entity entity : e.getBlock().getWorld().getEntities())
        {
            if (e.getBlock().getLocation().distance(entity.getLocation()) <= plugin.config.getDouble("server.radar_radius") &&
                    !(entity instanceof Player) &&
                    entity instanceof LivingEntity &&
                    (entity.getCustomName().equals(ChatColor.RED + "Tubby Creeper") ||
                    entity.getCustomName().equals(ChatColor.RED + "Tubby Enderman") ||
                    entity.getCustomName().equals(ChatColor.GOLD + "Tubby Skeleton") ||
                    entity.getCustomName().equals(ChatColor.LIGHT_PURPLE + "Tubby Loot Midget") ||
                    entity.getCustomName().equals(ChatColor.GOLD + "Tubby Spider") ||
                    entity.getCustomName().equals(ChatColor.LIGHT_PURPLE + "Tubby Stray") ||
                    entity.getCustomName().equals(ChatColor.LIGHT_PURPLE + "Tubby Wither Skeleton") ||
                    entity.getCustomName().equals(ChatColor.GOLD + "Tubby Zombie"))

            );
            {
                ((LivingEntity) entity).addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 500, 1));
                ((LivingEntity) entity).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 5));
                count++;
            }
        }
        player.sendMessage(SUtil.color("&6&lRADAR &6Found " + count + " tubbies!"));
        radarCooldown.add(player);
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                radarCooldown.remove(player);
                player.sendMessage(SUtil.color("&6&lRADAR &6Your ability is ready!"));
            }
        }.runTaskLater(plugin, 20 * 20);
    }
}