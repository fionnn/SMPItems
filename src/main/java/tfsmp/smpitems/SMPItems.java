package tfsmp.smpitems;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import tfsmp.smpitems.mob.ZombieMob;

public final class SMPItems extends JavaPlugin
{
    public static SMPItems plugin;

    @Override
    public void onEnable()
    {
        plugin = this;
        enableListeners();
    }

    private void enableListeners()
    {
        PluginManager manager = this.getServer().getPluginManager();
        manager.registerEvents(new ZombieMob(this), this);
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
    }
}