package tfsmp.smpitems.mob;

import org.bukkit.entity.Skeleton;
import org.bukkit.entity.WitherSkeleton;
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

        if (e.getEntity() instanceof WitherSkeleton)
        {
            witherskeleton(e);
            return;
        }
    }

    private void zombie(EntityDeathEvent e)
    {
        if (e.getEntity().hasMetadata("Tubby Zombie"))
        {
            for (int i = 0; i < 2; i++){
                RandomCollection<CustomItem> items = new RandomCollection<>();
                items.add(0.1, new Axe());
                items.add(0.9, new BoneSword());
                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }

        }   else if (e.getEntity().hasMetadata("Tubby Loot Midget"))
            {
                for (int i = 0; i < 5; i++){
                    RandomCollection<CustomItem> items = new RandomCollection<>();
                    items.add(0.1, new Axe());
                    items.add(0.9, new BoneSword());
                    CustomItem item = items.next();
                    e.getDrops().add(item.getStack());
                }
            }
    }

    private void skeleton(EntityDeathEvent e)
    {
        if (e.getEntity().hasMetadata("Tubby Skeleton"))
        {
                for (int i = 0; i < 2; i++){
                    RandomCollection<CustomItem> items = new RandomCollection<>();
                    items.add(0.1, new Axe());
                    items.add(0.9, new BoneSword());
                    CustomItem item = items.next();
                    e.getDrops().add(item.getStack());
                }
        }
    }

    private void witherskeleton(EntityDeathEvent e)
    {
        if (e.getEntity().hasMetadata("Tubby Wither Skeleton"))
        {
            // issue dropping, doesn't drop
            for (int i = 0; i < 2; i++){
                RandomCollection<CustomItem> items = new RandomCollection<>();
                items.add(0.1, new WitherAxe());
                items.add(0.9, new BoneSword());
                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }
    }

    private boolean gotRandom(int chance)
    {
        return r.nextInt(chance) == 1;
    }
}