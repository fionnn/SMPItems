package me.totalfreedom.smpitems.command;

import me.totalfreedom.smpitems.SBase;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Command_toggletubby extends SBase implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String c, String[] args)
    {
        if (sender instanceof ConsoleCommandSender)
        {
            sender.sendMessage(ChatColor.RED + "You cannot send this command from console.");
            return true;
        }
        if (args.length != 0)
        {
            return false;
        }
        Player player = (Player) sender;
        boolean toggle = true;
        if (plugin.players.contains(player.getName().toLowerCase()))
        {
            toggle = !plugin.players.getBoolean(player.getName().toLowerCase() + ".tubby");
        }
        plugin.players.set(player.getName().toLowerCase() + ".tubby", toggle);
        plugin.players.save();
        sender.sendMessage(ChatColor.GRAY + (plugin.players.getBoolean(player.getName().toLowerCase() + ".tubby") ? "Enabled" : "Disabled") + " tubby message.");
        return true;
    }
}