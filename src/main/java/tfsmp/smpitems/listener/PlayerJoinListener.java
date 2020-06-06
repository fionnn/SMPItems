package tfsmp.smpitems.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.util.SUtil;

public class PlayerJoinListener implements Listener
{
    private SMPItems plugin;

    public PlayerJoinListener(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e)
    {
        Player player = e.getPlayer();

        if (!player.hasPlayedBefore())
        {
            player.sendMessage(SUtil.color("&6SMPItems » &eFor more information about SMPItems, you can visit the wiki: https://smp-items.fandom.com/wiki/SMP_Items_Wiki"));
        }
    }
}