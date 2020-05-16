package tfsmp.smpitems.listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.data.type.EndPortalFrame;
import org.bukkit.entity.EnderSignal;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.*;
import org.bukkit.inventory.ItemStack;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.item.PowerEye;
import tfsmp.smpitems.mob.MobSpawn;
import tfsmp.smpitems.util.SUtil;

public class EnderDragonListener implements Listener
{
    private SMPItems plugin;
    public EnderDragonListener(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void onEnderDragonDamage(EntityDamageByEntityEvent e)
    {
        update(e);
    }

    @EventHandler
    public void onEnderDragonHeal(EntityRegainHealthEvent e)
    {
        update(e);
    }

    @EventHandler
    public void onEnderDragonDeath(EntityDeathEvent e)
    {
        if (MobSpawn.activeDragon == null)
            return;
        LivingEntity dead = e.getEntity();
        if (dead == MobSpawn.activeDragon.getEntity())
        {
            MobSpawn.dragonSpawned = false;
            MobSpawn.activeDragon.getTitle().remove();
            MobSpawn.activeDragon.getHealth().remove();
            MobSpawn.activeDragon = null;
            for (int i = 1; i < 5; i++)
            {
                plugin.config.set("server.ender_dragon.frame" + i + ".occupier", null);
                plugin.config.set("server.ender_dragon.frame" + i + ".occupied", false);
                plugin.config.save();
                World endWorld = Bukkit.getWorld(plugin.config.getString("server.ender_dragon.end_world"));
                Block b = endWorld.getBlockAt(plugin.config.getInt("server.ender_dragon.frame" + i + ".x"),
                        plugin.config.getInt("server.ender_dragon.frame" + i + ".y"),
                        plugin.config.getInt("server.ender_dragon.frame" + i + ".z"));
                EndPortalFrame f = (EndPortalFrame) b.getBlockData();
                f.setEye(false);
                b.setBlockData(f);
            }
            Bukkit.broadcastMessage(SUtil.color("&5Tubby Ender Dragon&d: I'll get you next time..."));
        }
    }

    @EventHandler
    public void onEyeLaunch(ProjectileLaunchEvent e)
    {
        if (!(e.getEntity() instanceof EnderSignal))
            return;
        if (!(e.getEntity().getShooter() instanceof Player))
            return;
        Player player = (Player) e.getEntity().getShooter();
        ItemStack mainhand = player.getInventory().getItemInMainHand();
        ItemStack offhand = player.getInventory().getItemInOffHand();
        if (SUtil.isItemValid(mainhand, new PowerEye()) || SUtil.isItemValid(offhand, new PowerEye()))
        {
            e.setCancelled(true);
        }
    }

    public void update(EntityEvent e)
    {
        if (MobSpawn.activeDragon == null)
            return;
        if (!(e.getEntity() instanceof LivingEntity))
            return;
        LivingEntity damaged = (LivingEntity) e.getEntity();
        if (damaged == MobSpawn.activeDragon.getEntity())
        {
            MobSpawn.activeDragon.getHealth().setCustomName(SUtil.color("&dHealth: " + (int) damaged.getHealth() + "/" + (int) damaged.getMaxHealth()));
        }
    }
}