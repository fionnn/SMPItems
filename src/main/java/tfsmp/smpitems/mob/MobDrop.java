package tfsmp.smpitems.mob;

import org.bukkit.entity.Enderman;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.item.*;

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

        if (e.getEntity() instanceof Enderman)
        {
            enderman(e);
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
            for (int i = 0; i < 2; i++)
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

    private void enderman(EntityDeathEvent e)
    {
        if (e.getEntity().getCustomName().contains("Tubby Enderman"))
        {
            for (int i = 0; i < 2; i++)
            {
                RandomCollection<CustomItem> items = new RandomCollection<>();
                items.add(3, new End());
                items.add(7, new ObsidianPick());
                items.add(10, new WitherAxe());
                items.add(30, new BoneSword());
                items.add(50, new Axe());
                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }
    }
}