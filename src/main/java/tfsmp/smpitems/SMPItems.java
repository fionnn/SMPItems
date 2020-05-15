package tfsmp.smpitems;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import tfsmp.smpitems.command.Command_smpspawnmob;
import tfsmp.smpitems.config.Config;
import tfsmp.smpitems.listener.*;
import tfsmp.smpitems.mob.MobDrop;
import tfsmp.smpitems.mob.MobSpawn;
import tfsmp.smpitems.util.SLog;

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

    private void enableListeners()
    {
        PluginManager manager = this.getServer().getPluginManager();
        manager.registerEvents(new MobDrop(this), this);
        manager.registerEvents(new MobSpawn(this), this);

        manager.registerEvents(new ArrowListener(this), this);
        manager.registerEvents(new BlockListener(this), this);
        manager.registerEvents(new InteractListener(this), this);
    }

    private void enableCommands()
    {
        this.getCommand("smpspawnmob").setExecutor(new Command_smpspawnmob());
    }

    @Override
    public void onDisable()
    {
        config.save();
        SLog.info("Disabled.");
    }
}