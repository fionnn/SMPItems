package tfsmp.smpitems.mob;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.item.CustomItem;

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
    }

    private void zombie(EntityDeathEvent e)
    {
        if (e.getEntity().hasMetadata("Tubby Zombie"))
        {
            if (gotRandom(5))
            {
                CustomItem freedomAxe = new CustomItem(ChatColor.AQUA + "Axe!", Material.IRON_AXE);
                freedomAxe.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 1.0);
                freedomAxe.applyMetaToStack();
                e.getDrops().clear();
                e.getDrops().add(freedomAxe.getStack());
            }
        }
    }

    private void skeleton(EntityDeathEvent e)
    {
        if (e.getEntity().hasMetadata("Tubby Skeleton"))
        {
            if (gotRandom(7))
            {
                CustomItem boneSword = new CustomItem(ChatColor.GRAY + "Bone Sword", Material.IRON_SWORD);
                boneSword.addAttribute(Attribute.GENERIC_ATTACK_DAMAGE, 5.0);
                boneSword.applyMetaToStack();
                e.getDrops().clear();
                e.getDrops().add(boneSword.getStack());
            }
        }
    }

    private boolean gotRandom(int chance)
    {
        return r.nextInt(chance) == 1;
    }
}