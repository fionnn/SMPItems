package me.totalfreedom.smpitems.listener;

import me.totalfreedom.smpitems.SMPItems;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class ArrowListener implements Listener
{
    private SMPItems plugin;
    public ArrowListener(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    private static List<Arrow> arrows = new ArrayList<>();

    @EventHandler
    public void onArrowShoot(EntityShootBowEvent e)
    {
        Entity proj = e.getProjectile();
        if (!(proj instanceof Arrow))
        {
            return;
        }

        ItemStack bow = e.getBow();

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

        if (bow.getItemMeta().getDisplayName().startsWith(ChatColor.GOLD + "") && bow.getItemMeta().getDisplayName().endsWith("POW! Bow"))
        {
            arrows.add((Arrow) proj);
        }
    }

    @EventHandler
    public void onArrowHit(ProjectileHitEvent e)
    {
        Projectile proj = e.getEntity();
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

                block.getWorld().strikeLightning(block.getLocation());
                block.getWorld().createExplosion(block.getLocation(), 4f);
                arrows.remove(a);
                a.remove();
                return;
            }
        }
    }

    @EventHandler
    public void onEntityDamage(EntityDamageByEntityEvent e)
    {
        Entity damager = e.getDamager();
        if (!(damager instanceof Arrow))
        {
            return;
        }

        Arrow arrow = (Arrow) damager;
        for (Arrow a : arrows)
        {
            if (arrow == a)
            {
                Entity damaged = e.getEntity();
                if (damaged.isDead())
                {
                    return;
                }

                damaged.getWorld().strikeLightning(damaged.getLocation());
                damaged.getWorld().createExplosion(damaged.getLocation(), 4f);
                arrows.remove(a);
                return;
            }
        }
    }
}