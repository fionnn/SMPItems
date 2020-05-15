package tfsmp.smpitems.listener;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;
import tfsmp.smpitems.SMPItems;

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
            return;
        ItemStack bow = e.getBow();
        if (bow == null)
            return;
        if (!bow.hasItemMeta())
            return;
        if (!bow.getItemMeta().hasDisplayName())
            return;
        if (bow.getItemMeta().getDisplayName().startsWith(ChatColor.GOLD + "") && bow.getItemMeta().getDisplayName().endsWith("POW! Bow"))
            arrows.add((Arrow) proj);
    }

    @EventHandler
    public void onArrowHit(ProjectileHitEvent e)
    {
        Projectile proj = e.getEntity();
        if (!(proj instanceof Arrow))
            return;
        Arrow arrow = (Arrow) proj;
        for (Arrow a : arrows)
        {
            if (arrow == a)
            {
                Block block = e.getHitBlock();
                if (block == null)
                    return;
                block.getWorld().strikeLightning(block.getLocation());
                block.getWorld().createExplosion(block.getLocation(), 4f);
                arrows.remove(a);
                return;
            }
        }
    }
}