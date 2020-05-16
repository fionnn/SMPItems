package tfsmp.smpitems.listener;

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
import tfsmp.smpitems.item.End;
import tfsmp.smpitems.item.Flux;
import tfsmp.smpitems.item.Superfood;
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
    private List<Player> superfoodCooldown = new ArrayList<>();

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
                if (SUtil.isItemValid(stack, new End()))
                {
                    Block block = player.getTargetBlock(null, 20);
                    block.getWorld().strikeLightning(block.getLocation());
                }
                if (SUtil.isItemValid(stack, new Flux()))
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
                if (SUtil.isItemValid(stack, new Superfood()))
                {
                    if (superfoodCooldown.contains(player))
                    {
                        player.sendMessage(SUtil.color("&9&lSUPERFOOD &9Currently on cooldown."));
                        return;
                    }
                    player.setFoodLevel(20);
                    player.setSaturation(player.getSaturation() + 12.8f);
                    player.sendMessage(SUtil.color("&9&lSUPERFOOD &9Your hunger has been fully restored!"));
                    superfoodCooldown.add(player);
                    new BukkitRunnable()
                    {
                        @Override
                        public void run()
                        {
                            superfoodCooldown.remove(player);
                            player.sendMessage(SUtil.color("&9&lSUPERFOOD &9Ready to be eaten again!"));
                        }
                    }.runTaskLater(plugin, 60 * 20);
                }
                break;
            }
        }
    }
}