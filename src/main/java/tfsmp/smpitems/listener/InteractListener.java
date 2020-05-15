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
                        player.sendMessage(ChatColor.GRAY + "Your flux is currently on cooldown.");
                        return;
                    }
                    player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 200, 3));
                    for (Entity entity : player.getNearbyEntities(10, 10, 10))
                    {
                        if (entity instanceof Player)
                        {
                            ((Player) entity).addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 3));
                        }
                    }
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "You have used your flux's power to give you and others around you a temporary healing effect!");
                    fluxCooldown.add(player);
                    new BukkitRunnable()
                    {
                        @Override
                        public void run()
                        {
                            fluxCooldown.remove(player);
                            player.sendMessage(ChatColor.GRAY + "You may now use your flux again.");
                        }
                    }.runTaskLater(plugin, 60 * 20);
                }
                break;
            }
        }
    }
}