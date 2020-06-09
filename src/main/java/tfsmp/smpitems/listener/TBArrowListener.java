package tfsmp.smpitems.listener;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;
import tfsmp.smpitems.SMPItems;

import java.util.ArrayList;
import java.util.List;

public class TBArrowListener implements Listener
{
    private SMPItems plugin;
    public TBArrowListener(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    private static List<Arrow> arrows = new ArrayList<>();

    @EventHandler
    public void onArrowShoot(EntityShootBowEvent e)
    {
        Entity proj = e.getProjectile();
        ItemStack bow = e.getBow();

        if (!(proj instanceof Arrow))
        {
            return;
        }

        if (bow == null)
        {
            return;
        }

        if (!bow.hasItemMeta())
        {
            return;
        }

        if (!bow.getItemMeta().hasDisplayName())
        {
            return;
        }

        if (bow.getItemMeta().getDisplayName().startsWith(ChatColor.GOLD + "") && bow.getItemMeta().getDisplayName().endsWith("Tree Bow"))
        {
            arrows.add((Arrow) proj);
        }
    }

    @EventHandler
    public void onTreeBowArrowHit(ProjectileHitEvent e)
    {
        Projectile proj = e.getEntity();
        Entity entity = e.getEntity();
        World spawn = Bukkit.getWorld("spawn");

        if (!(proj instanceof Arrow))
        {
            return;
        }

        Arrow arrow = (Arrow) proj;
        for (Arrow a : arrows)
        {
            if (arrow == a)
            {
                Block block = e.getHitBlock();

                if (block == null)
                {
                    return;
                }

                if (!(block.getWorld() == spawn))
                {
                    Location loc = block.getLocation();
                    block.setType(Material.DIRT);
                    block.getWorld().generateTree(loc, TreeType.TREE);
                    for (Entity ent : entity.getNearbyEntities(10, 0, 10))
                    {
                        ent.setVelocity(new Vector(0, 2, 0));
                        ent.playEffect(EntityEffect.HURT);
                    }
                    arrows.remove(a);
                    a.remove();
                    return;
                }
            }
        }
    }
}