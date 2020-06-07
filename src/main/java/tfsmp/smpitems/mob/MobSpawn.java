package tfsmp.smpitems.mob;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.data.type.EndPortalFrame;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.item.PowerEye;
import tfsmp.smpitems.item.TubbyWitherSkeletonSkull;
import tfsmp.smpitems.util.SUtil;

import java.util.ArrayList;
import java.util.List;

public class MobSpawn implements Listener
{
    private SMPItems plugin;

    private static List<Location> tubbyWitherSkullLocations = new ArrayList<>();

    private static List<Player> doubleClickPrevent = new ArrayList<>();

    public static TubbyEnderDragon activeDragon;

    public static boolean dragonSpawned;

    public MobSpawn(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void onEntitySpawn(EntitySpawnEvent event)
    {
        Entity entity = event.getEntity();

        int midgetSpawnRate = plugin.config.getInt("server.mobs.spawnrate.midget");
        int zombieSpawnRate = plugin.config.getInt("server.mobs.spawnrate.zombie");
        int skeletonSpawnRate = plugin.config.getInt("server.mobs.spawnrate.skeleton");
        int endermanSpawnRate = plugin.config.getInt("server.mobs.spawnrate.enderman");
        int witherskeletonSpawnRate = plugin.config.getInt("server.mobs.spawnrate.witherskeleton");
        int straySpawnRate = plugin.config.getInt("server.mobs.spawnrate.stray");
        int creeperSpawnRate = plugin.config.getInt("server.mobs.spawnrate.creeper");
        int spiderSpawnRate = plugin.config.getInt("server.mobs.spawnrate.spider");
        int pillagerSpawnRate = plugin.config.getInt("server.mobs.spawnrate.pillager");

        // Mobs that are able to spawn in the overworld
        if (entity.getWorld().getEnvironment().equals(World.Environment.NORMAL))
        {
            if (entity instanceof ZombieVillager && SUtil.gotRandom(midgetSpawnRate))
            {
                new TubbyLootMidget().spawn(entity, true);
                return;
            }
            if (entity instanceof Zombie && SUtil.gotRandom(zombieSpawnRate))
            {
                new TubbyZombie().spawn(entity, true);
                return;
            }
            if (entity instanceof Skeleton && SUtil.gotRandom(skeletonSpawnRate))
            {
                new TubbySkeleton().spawn(entity, true);
                return;
            }
            if (entity instanceof Enderman && SUtil.gotRandom(endermanSpawnRate))
            {
                new TubbyEnderman().spawn(entity, true);
                return;
            }
            if (entity instanceof Stray && SUtil.gotRandom(straySpawnRate))
            {
                new TubbyStray().spawn(entity, true);
                return;
            }
            if (entity instanceof Creeper && SUtil.gotRandom(creeperSpawnRate))
            {
                new TubbyCreeper().spawn(entity, true);
            }
            if (entity instanceof Spider && SUtil.gotRandom(spiderSpawnRate))
            {
                new TubbySpider().spawn(entity, true);
            }
            if (entity instanceof Pillager && SUtil.gotRandom(pillagerSpawnRate))
            {
                new TubbyPillager().spawn(entity, true);
            }
        }

        // Mobs that are able to spawn in the Nether
        if (entity.getWorld().getEnvironment().equals(World.Environment.NETHER))
        {
            if (entity instanceof WitherSkeleton && SUtil.gotRandom(witherskeletonSpawnRate))
            {
                new TubbyWitherSkeleton().spawn(entity, true);
            }
            if (entity instanceof Enderman && SUtil.gotRandom(endermanSpawnRate))
            {
                new TubbyEnderman().spawn(entity, true);
            }
        }
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e)
    {
        Block block = e.getBlockPlaced();
        switch (block.getType())
        {
            case GOLD_BLOCK:
            {
                Location loc = block.getLocation();
                World world = loc.getWorld();

                if (world == null)
                {
                    return;
                }

                loc.add(0, 0, 0);
                Block rightOb = loc.add(1, 0, 0).getBlock();
                Block leftOb = loc.subtract(2, 0, 0).getBlock();
                Block downOb = loc.add(1, -1, 0).getBlock();
                Block leftSk = loc.add(-1, 2, 0).getBlock();
                Block rightSk = loc.add(2, 0, 0).getBlock();
                if (rightOb.getType() == Material.OBSIDIAN &&
                        leftOb.getType() == Material.OBSIDIAN &&
                        downOb.getType() == Material.OBSIDIAN &&
                        (leftSk.getType() == Material.WITHER_SKELETON_SKULL && tubbyWitherSkullLocations.contains(leftSk.getLocation())) &&
                        (rightSk.getType() == Material.WITHER_SKELETON_SKULL && tubbyWitherSkullLocations.contains(rightSk.getLocation())))
                {
                    rightOb.setType(Material.AIR);
                    leftOb.setType(Material.AIR);
                    downOb.setType(Material.AIR);
                    leftSk.setType(Material.AIR);
                    rightSk.setType(Material.AIR);
                    block.setType(Material.AIR);
                    tubbyWitherSkullLocations.remove(leftSk.getLocation());
                    tubbyWitherSkullLocations.remove(rightSk.getLocation());
                    Bukkit.broadcastMessage(SUtil.color(String.format("&c&lWARNING &cA &4Tubby Wither &chas been spawned at &4%s&c, &4%s&c, &4%s &cin world &4%s&c! Go help out!",
                            loc.getBlockX(),
                            loc.getBlockY(),
                            loc.getBlockZ(),
                            loc.getWorld().getName())));
                    TubbyWither wither = new TubbyWither();
                    wither.spawn(loc, false);
                    wither.init();
                }
                break;
            }
            case WITHER_SKELETON_SKULL:
            {
                ItemStack hand = e.getPlayer().getInventory().getItemInMainHand();
                if (SUtil.isItemValid(hand, new TubbyWitherSkeletonSkull()))
                {
                    tubbyWitherSkullLocations.add(block.getLocation());
                }
            }
        }
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e)
    {
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK)
        {
            if (doubleClickPrevent.contains(e.getPlayer()))
            {
                doubleClickPrevent.remove(e.getPlayer());
                return;
            }

            Block block = e.getClickedBlock();
            ItemStack hand = e.getPlayer().getInventory().getItemInMainHand();
            World endWorld = SUtil.endWorld;

            if (block == null)
            {
                return;
            }

            if (!(block.getBlockData() instanceof EndPortalFrame))
            {
                return;
            }

            EndPortalFrame frame = (EndPortalFrame) block.getBlockData();
            int frameID = getFrameID(block.getLocation());

            if (frameID != -1)
            {
                e.setCancelled(true);
            }

            int occupied = SUtil.getFrameOccupiedCount();

            if (frame.hasEye() && frameID != -1)
            {
                if (hand.getType() != Material.AIR)
                {
                    return;
                }

                String playerName = plugin.config.getString("server.ender_dragon.frame" + frameID + ".occupier");

                if (playerName == null)
                {
                    return;
                }

                Player player = Bukkit.getPlayer(playerName);

                if (player == e.getPlayer())
                {
                    if (dragonSpawned)
                    {
                        e.getPlayer().sendMessage(ChatColor.RED + "You cannot remove the eyes once the dragon has been spawned!");
                        doubleClickPrevent.add(e.getPlayer());
                        return;
                    }

                    if (SUtil.isItemValid(hand, new PowerEye()))
                    {
                        hand.setAmount(hand.getAmount() + 1);
                    }
                    else
                    {
                        e.getPlayer().getInventory().setItemInMainHand(new PowerEye().getStack());
                        plugin.config.set("server.ender_dragon.frame" + frameID + ".occupier", null);
                        plugin.config.set("server.ender_dragon.frame" + frameID + ".occupied", false);
                        plugin.config.save();
                        e.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "You have retrieved your Power Eye!");
                        Bukkit.broadcastMessage(SUtil.color("&d&lTUBBY ENDER DRAGON &dCurrent Eye Count: &5" + (occupied - 1) + "/&54"));
                        frame.setEye(false);
                        block.setBlockData(frame);
                        doubleClickPrevent.add(e.getPlayer());
                        return;
                    }
                }
                e.getPlayer().sendMessage(ChatColor.RED + "This is not your Power Eye!");
                return;
            }

            if (!SUtil.isItemValid(hand, new PowerEye()))
            {
                return;
            }

            hand.setAmount(hand.getAmount() - 1);
            frame.setEye(true);
            block.setBlockData(frame);
            Bukkit.broadcastMessage(SUtil.color("&d&lTUBBY ENDER DRAGON &dCurrent Eye Count: &5" + (occupied + 1) + "/4"));

            plugin.config.set("server.ender_dragon.frame" + frameID + ".occupier", e.getPlayer().getName());
            plugin.config.set("server.ender_dragon.frame" + frameID + ".occupied", true);

            if (occupied + 1 == 4)
            {
                dragonSpawned = true;
                Bukkit.broadcastMessage(SUtil.color("&d&lTUBBY ENDER DRAGON &dSpawning..."));
                Location spawn = new Location(endWorld, 0, 100, 0);
                new BukkitRunnable()
                {
                    @Override
                    public void run()
                    {
                        endWorld.createExplosion(new Location(endWorld, 0, 80, 0), 1F);
                        for (int i = 1; i < 5; i++)
                        {
                            endWorld.strikeLightning(SUtil.getFrameLocation(i));
                        }
                    }
                }.runTaskLater(plugin, 3 * 20);
                new BukkitRunnable()
                {
                    @Override
                    public void run()
                    {
                        endWorld.createExplosion(new Location(endWorld, 0, 80, 0), 2F);
                        for (int i = 1; i < 5; i++)
                        {
                            endWorld.strikeLightning(SUtil.getFrameLocation(i));
                        }
                    }
                }.runTaskLater(plugin, 4 * 20);
                new BukkitRunnable()
                {
                    @Override
                    public void run()
                    {
                        endWorld.createExplosion(new Location(endWorld, 0, 90, 0), 4F);
                        for (int i = 1; i < 5; i++)
                        {
                            endWorld.strikeLightning(SUtil.getFrameLocation(i));
                        }
                    }
                }.runTaskLater(plugin, 5 * 20);
                new BukkitRunnable()
                {
                    @Override
                    public void run()
                    {
                        endWorld.createExplosion(new Location(endWorld, 0, 100, 0), 8F);
                        for (int i = 1; i < 5; i++)
                        {
                            endWorld.strikeLightning(SUtil.getFrameLocation(i));
                            endWorld.createExplosion(SUtil.getFrameLocation(i), 2F);
                        }
                        activeDragon = new TubbyEnderDragon();
                        activeDragon.spawn(spawn, false);
                        activeDragon.init();
                        Bukkit.broadcastMessage(SUtil.color("&5Tubby Ender Dragon&d: Good luck..."));
                    }
                }.runTaskLater(plugin, 6 * 20);
            }
            plugin.config.save();
        }
    }

    private int getFrameID(Location loc)
    {
        for (int i = 1; i < 5; i++)
        {
            if (plugin.config.getInt("server.ender_dragon.frame" + i + ".x") == loc.getX() &&
                    plugin.config.getInt("server.ender_dragon.frame" + i + ".y") == loc.getY() &&
                        plugin.config.getInt("server.ender_dragon.frame" + i + ".z") == loc.getZ())
            {
                return i;
            }
        }
        return -1;
    }
}