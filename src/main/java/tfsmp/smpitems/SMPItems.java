package tfsmp.smpitems;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import tfsmp.smpitems.mob.MobDrop;
import tfsmp.smpitems.mob.MobSpawn;
import tfsmp.smpitems.util.SLog;

public final class SMPItems extends JavaPlugin
{
    public static SMPItems plugin;

    @Override
    public void onEnable()
    {
        plugin = this;
        enableListeners();
        SLog.info("Enabled.");
    }

    private void enableListeners()
    {
        PluginManager manager = this.getServer().getPluginManager();

        manager.registerEvents(new MobDrop(this), this);
        manager.registerEvents(new MobSpawn(this), this);
    }

    @Override
    public void onDisable()
    {
        SLog.info("Disabled.");
    }
}