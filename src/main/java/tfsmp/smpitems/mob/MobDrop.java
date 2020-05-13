package tfsmp.smpitems.mob;

import org.bukkit.ChatColor;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.entity.ZombieVillager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.item.*;
import tfsmp.smpitems.util.SLog;


import java.util.Random;

public class MobDrop implements Listener
{
    private SMPItems plugin;

    public MobDrop(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    private final Random r = new Random();

    @EventHandler
    public void onEntityDeath(EntityDeathEvent e)
    {
        if (e.getEntity().getCustomName() == null)
            return;

        if (e.getEntity() instanceof Zombie)
        {
            zombie(e);
            return;
        }

        if (e.getEntity() instanceof Skeleton)
        {
            skeleton(e);
            return;
        }
    }

    private void zombie(EntityDeathEvent e)
    {
        if (e.getEntity().getCustomName().contains("Tubby Zombie"))
        {
            for (int i = 0; i < 2; i++)
            {
                RandomCollection<CustomItem> items = new RandomCollection<>();
                items.add(40, new Axe());
                items.add(60, new BoneSword());
                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }
        if (e.getEntity().getCustomName().contains("Tubby Loot Midget"))
        {
            for (int i = 0; i < 5; i++)
            {
                RandomCollection<CustomItem> items = new RandomCollection<>();
                items.add(50, new Axe());
                items.add(10, new BoneSword());
                items.add(40, new FleshSword());
                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }
    }

    private void skeleton(EntityDeathEvent e)
    {
        if (e.getEntity().getCustomName().contains("Tubby Skeleton"))
        {
            for (int i = 0; i < 2; i++)
            {
                RandomCollection<CustomItem> items = new RandomCollection<>();
                items.add(20, new Axe());
                items.add(80, new BoneSword());
                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
                }
        }
        if (e.getEntity().getCustomName().contains("Tubby Wither Skeleton"))
        {
            // issue dropping, doesn't drop
            for (int i = 0; i < 2; i++)
            {
                RandomCollection<CustomItem> items = new RandomCollection<>();
                items.add(5, new WitherAxe());
                items.add(95, new BoneSword());
                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }
    }
}