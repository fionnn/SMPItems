package tfsmp.smpitems;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import tfsmp.smpitems.command.Command_smpgiveitem;
import tfsmp.smpitems.command.Command_smpsetframe;
import tfsmp.smpitems.command.Command_smpspawnmob;
import tfsmp.smpitems.config.Config;
import tfsmp.smpitems.listener.*;
import tfsmp.smpitems.mob.MobDrop;
import tfsmp.smpitems.mob.MobSpawn;
import tfsmp.smpitems.util.SLog;
import tfsmp.smpitems.util.SUtil;

public final class SMPItems extends JavaPlugin
{
    public static SMPItems plugin;
    public Config config;

    @Override
    public void onEnable()
    {
        plugin = this;
        config = new Config(plugin, "config.yml");
        enableListeners();
        enableCommands();
        SLog.info("Enabled.");
    }

    @Override
    public void onDisable()
    {
        config.save();
        handleDragon();
        SLog.info("Disabled.");
    }

    private void enableListeners()
    {
        PluginManager manager = this.getServer().getPluginManager();
        manager.registerEvents(new MobDrop(this), this);
        manager.registerEvents(new MobSpawn(this), this);

        manager.registerEvents(new ArrowListener(this), this);
        manager.registerEvents(new BlockListener(this), this);
        manager.registerEvents(new InteractListener(this), this);
        manager.registerEvents(new InventoryListener(this), this);
        manager.registerEvents(new DamageListener(this), this);
        manager.registerEvents(new EnderDragonListener(this), this);
    }

    private void enableCommands()
    {
        this.getCommand("smpspawnmob").setExecutor(new Command_smpspawnmob());
        this.getCommand("smpgiveitem").setExecutor(new Command_smpgiveitem());
        this.getCommand("smpsetframe").setExecutor(new Command_smpsetframe());
    }

    private void handleDragon()
    {
        if (MobSpawn.activeDragon != null || SUtil.getFrameOccupiedCount() == 4)
        {
            World endWorld = Bukkit.getWorld(plugin.config.getString("server.ender_dragon.end_world"));
            MobSpawn.dragonSpawned = false;
            MobSpawn.activeDragon.getTitle().remove();
            MobSpawn.activeDragon.getHealth().remove();
            MobSpawn.activeDragon = null;
            for (int i = 1; i < 5; i++)
            {
                plugin.config.set("server.ender_dragon.frame" + i + ".occupier", null);
                plugin.config.set("server.ender_dragon.frame" + i + ".occupied", false);
                plugin.config.save();
                Block f = endWorld.getBlockAt(plugin.config.getInt("server.ender_dragon.frame" + i + ".x"),
                        plugin.config.getInt("server.ender_dragon.frame" + i + ".y"),
                        plugin.config.getInt("server.ender_dragon.frame" + i + ".z"));
                f.setType(Material.END_PORTAL_FRAME);
            }
            for (Entity entity : endWorld.getEntities())
            {
                if (entity instanceof EnderDragon)
                {
                    entity.remove();
                }
            }
        }
    }
}