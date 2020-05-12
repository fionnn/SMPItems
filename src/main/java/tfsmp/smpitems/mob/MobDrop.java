package tfsmp.smpitems.mob;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.item.BoneSword;
import tfsmp.smpitems.item.CustomItem;
import tfsmp.smpitems.item.FreedomAxe;
import tfsmp.smpitems.item.WitherAxe;

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
            if (gotRandom(5))
            {
                e.getDrops().clear();
                e.getDrops().add(new FreedomAxe().getStack());
            }
        }
    }

    private void skeleton(EntityDeathEvent e)
    {
        if (e.getEntity().hasMetadata("Tubby Skeleton"))
        {
            if (gotRandom(7))
            {
                e.getDrops().clear();
                e.getDrops().add(new BoneSword().getStack());
            }
        }
    }

    private void witherskeleton(EntityDeathEvent e)
    {
        if (e.getEntity().hasMetadata("Tubby Wither Skeleton"))
        {
            if (gotRandom(3))
            {
                e.getDrops().clear();
                e.getDrops().add(new WitherAxe().getStack());
            }
        }
    }

    private boolean gotRandom(int chance)
    {
        return r.nextInt(chance) == 1;
    }
}