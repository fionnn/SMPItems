package tfsmp.smpitems.listener;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.item.*;
import tfsmp.smpitems.util.SUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InteractListener implements Listener
{
    private SMPItems plugin;

    private List<Player> fluxCooldown = new ArrayList<>();

    private List<Player> superfoodCooldown = new ArrayList<>();

    private List<Player> landscaperCooldown = new ArrayList<>();

    private List<Player> phaserCooldown = new ArrayList<>();

    private List<Player> summonCooldown = new ArrayList<>();

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
                int ifbattery = BatteryUsage.IfUsage(player);
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
                    }.runTaskLater(plugin, (60* 20)/ifbattery);
                }

                if (SUtil.isItemValid(stack, new SuperFood()))
                {
                    if (superfoodCooldown.contains(player))
                    {
                        player.sendMessage(SUtil.color("&6&lSUPER FOOD &6Currently on cooldown."));
                        return;
                    }

                    player.setFoodLevel(20);
                    player.setSaturation(player.getSaturation() + 12.8f);
                    player.sendMessage(SUtil.color("&6&lSUPER FOOD &6Your hunger has been fully restored!"));
                    superfoodCooldown.add(player);
                    new BukkitRunnable()
                    {
                        @Override
                        public void run()
                        {
                            superfoodCooldown.remove(player);
                            player.sendMessage(SUtil.color("&6&lSUPER FOOD &6Ready to be eaten again!"));
                        }
                    }.runTaskLater(plugin, (60* 20)/ifbattery);
                }

                if (SUtil.isItemValid(stack, new Landscaper()))
                {
                    if (landscaperCooldown.contains(player))
                    {
                        player.sendMessage(SUtil.color("&6&lLANDSCAPER &6Currently on cooldown."));
                        return;
                    }

                    Block block = player.getTargetBlock(null, 30);
                    landscaperCooldown.add(player);
                    TNTPrimed tnt = (TNTPrimed) block.getWorld().spawnEntity(block.getLocation().add(0, 20, 0), EntityType.PRIMED_TNT);
                    tnt.setYield(20);
                    new BukkitRunnable()
                    {
                        @Override
                        public void run()
                        {
                            landscaperCooldown.remove(player);
                            player.sendMessage(SUtil.color("&6&lLANDSCAPER &6Ready to be used again!"));
                        }
                    }.runTaskLater(plugin, (60* 5)/ifbattery);
                }

                if (SUtil.isItemValid(stack, new Phaser()))
                {
                    if (phaserCooldown.contains(player))
                    {
                        player.sendMessage(SUtil.color("&6&lPHASER &6Currently on cooldown."));
                        return;
                    }

                    Block block = player.getTargetBlock(null, 20);
                    float yaw = player.getLocation().getYaw();
                    float pitch = player.getLocation().getPitch();

                    Location location = new Location(player.getWorld(), block.getX(), block.getY(), block.getZ(), yaw, pitch);
                    player.teleport(location);
                    phaserCooldown.add(player);

                    new BukkitRunnable()
                    {
                        @Override
                        public void run()
                        {
                            phaserCooldown.remove(player);
                            player.sendMessage(SUtil.color("&6&lPHASER &6Ready to be used again!"));
                        }
                    }.runTaskLater(plugin, (60* 1)/ifbattery);
                }

                if (SUtil.isItemValid(stack, new SummoningScythe()))
                {
                    if (summonCooldown.contains(player))
                    {
                        player.sendMessage(SUtil.color("&b&lSUMMON &bCurrently on cooldown."));
                        return;
                    }

                    Block block = player.getTargetBlock(null, 20);
                    for (int i = 0; i < 30; i++)
                    {
                        new BukkitRunnable()
                        {
                            @Override
                            public void run()
                            {
                                Random random = new Random();
                                Zombie zombie = block.getLocation().getWorld().spawn(block.getLocation().add(random.nextInt(7), 0, random.nextInt(7)), Zombie.class);
                                zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 9999999, 5));
                                zombie.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 2));
                                zombie.setCustomName(ChatColor.DARK_RED + "Summoned Zombie");
                            }
                        }.runTaskLater(plugin, 10 * 1);
                    }
                    summonCooldown.add(player);

                    new BukkitRunnable()
                    {
                        @Override
                        public void run()
                        {
                            summonCooldown.remove(player);
                            player.sendMessage(SUtil.color("&b&lSUMMON &bReady to be used again!"));
                        }
                    }.runTaskLater(plugin, (60* 10)/ifbattery);
                }
                break;
            }
        }
    }
}