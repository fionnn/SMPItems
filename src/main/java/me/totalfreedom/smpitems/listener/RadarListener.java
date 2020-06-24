package me.totalfreedom.smpitems.listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import me.totalfreedom.smpitems.SMPItems;
import me.totalfreedom.smpitems.item.Radar;
import me.totalfreedom.smpitems.util.SUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
                    !(entity instanceof Player) && entity instanceof LivingEntity &&
                    (Objects.equals(entity.getCustomName(), ChatColor.RED + "Tubby Creeper") ||
                    Objects.equals(entity.getCustomName(), ChatColor.RED + "Tubby Enderman") ||
                    Objects.equals(entity.getCustomName(), ChatColor.GOLD + "Tubby Skeleton") ||
                    Objects.equals(entity.getCustomName(), ChatColor.LIGHT_PURPLE + "Tubby Loot Midget") ||
                    Objects.equals(entity.getCustomName(), ChatColor.GOLD + "Tubby Spider") ||
                    Objects.equals(entity.getCustomName(), ChatColor.LIGHT_PURPLE + "Tubby Stray") ||
                    Objects.equals(entity.getCustomName(), ChatColor.LIGHT_PURPLE + "Tubby Wither Skeleton") ||
                    Objects.equals(entity.getCustomName(), ChatColor.GOLD + "Tubby Zombie")))
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