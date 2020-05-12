package tfsmp.smpitems.mob;

import org.bukkit.entity.Skeleton;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.item.Axe;
import tfsmp.smpitems.item.BoneSword;
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
                e.getDrops().add(new Axe().getStack());
            }
        }   else if (e.getEntity().hasMetadata("Tubby Loot Midget"))
            {
                CustomItem freedomAxe = new CustomItem(ChatColor.AQUA + "Pick!", Material.IRON_PICKAXE);
                freedomAxe.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 1.0);
                freedomAxe.applyMetaToStack();
                e.getDrops().clear();
                e.getDrops().add(new ItemStack(freedomAxe.getStack()));
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