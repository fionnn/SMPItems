package tfsmp.smpitems.listener;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.util.SUtil;

import java.util.ArrayList;
import java.util.List;

public class InteractListener implements Listener
{
    private SMPItems plugin;
    public InteractListener(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    private List<Player> fluxCooldown = new ArrayList<>();

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
                }
                if (stack.getItemMeta().getDisplayName().startsWith(ChatColor.AQUA + "") && stack.getItemMeta().getDisplayName().endsWith("Flux"))
                {
                    e.setCancelled(true);
                    if (fluxCooldown.contains(player))
                    {
                        player.sendMessage(SUtil.color("&b&lFLUX &bCurrently on cooldown."));
                        return;
                    }
                    player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 200, 3));
                    for (Entity entity : player.getNearbyEntities(5, 5, 5))
                    {
                        if (entity instanceof Player)
                        {
                            ((Player) entity).addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 200, 3));
                        }
                    }
                    player.sendMessage(SUtil.color("&b&lFLUX &bYou and others around you have been graced with health!"));
                    fluxCooldown.add(player);
                    new BukkitRunnable()
                    {
                        @Override
                        public void run()
                        {
                            fluxCooldown.remove(player);
                            player.sendMessage(SUtil.color("&b&lFLUX &bYour ability is ready!"));
                        }
                    }.runTaskLater(plugin, 60 * 20);
                }
                break;
            }
        }
    }
}