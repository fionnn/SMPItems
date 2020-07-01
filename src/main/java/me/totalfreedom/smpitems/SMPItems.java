package me.totalfreedom.smpitems;

import me.totalfreedom.smpitems.command.*;
import me.totalfreedom.smpitems.listener.*;
import me.totalfreedom.smpitems.mob.MobDrop;
import me.totalfreedom.smpitems.mob.MobSpawn;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import me.totalfreedom.smpitems.config.Config;
import me.totalfreedom.smpitems.util.SLog;
import me.totalfreedom.smpitems.util.SUtil;

public final class SMPItems extends JavaPlugin
{
    public static SMPItems plugin;
    public Config config;
    public Config players;

    @Override
    public void onEnable()
    {
        plugin = this;
        config = new Config(plugin, "config.yml");
        players = new Config(plugin, "players.yml");
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
        manager.registerEvents(new InteractListener(this), this);
        manager.registerEvents(new InventoryListener(this), this);
        manager.registerEvents(new DamageListener(this), this);
        manager.registerEvents(new EnderDragonListener(this), this);
        manager.registerEvents(new FlareListener(this), this);
        manager.registerEvents(new TBArrowListener(this), this);
        manager.registerEvents(new RadarListener(this), this);

        manager.registerEvents(new EntityInteractListener(this), this);
        manager.registerEvents(new PlayerJoinListener(this), this);
    }

    private void enableCommands()
    {
        this.getCommand("smpspawnmob").setExecutor(new Command_smpspawnmob());
        this.getCommand("smpgiveitem").setExecutor(new Command_smpgiveitem());
        this.getCommand("smpsetframe").setExecutor(new Command_smpsetframe());
        this.getCommand("smpitems").setExecutor(new Command_smpitems());
        this.getCommand("smpwiki").setExecutor(new Command_smpwiki());
        this.getCommand("smpkilltubbies").setExecutor(new Command_smpkilltubbies());
        this.getCommand("toggletubby").setExecutor(new Command_toggletubby());
    }

    private void handleDragon()
    {
        if (MobSpawn.activeDragon != null || SUtil.getFrameOccupiedCount() == 4)
        {
            World endWorld = SUtil.endWorld;
            MobSpawn.dragonSpawned = false;
            MobSpawn.activeDragon.getBossBar().removeAll();
            MobSpawn.activeDragon = null;

            for (int i = 1; i < 5; i++)
            {
                config.set("server.ender_dragon.frame" + i + ".occupier", null);
                config.set("server.ender_dragon.frame" + i + ".occupied", false);
                config.save();
                Block f = endWorld.getBlockAt(config.getInt("server.ender_dragon.frame" + i + ".x"),
                        config.getInt("server.ender_dragon.frame" + i + ".y"),
                        config.getInt("server.ender_dragon.frame" + i + ".z"));
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