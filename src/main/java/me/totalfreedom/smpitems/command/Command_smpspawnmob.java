package me.totalfreedom.smpitems.command;

import me.totalfreedom.smpitems.mob.CustomMob;
import me.totalfreedom.smpitems.mob.CustomMobType;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Command_smpspawnmob implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String c, String[] args)
    {
        if (!sender.isOp())
        {
            sender.sendMessage(ChatColor.RED + "No permission.");
            return true;
        }

        if (sender instanceof ConsoleCommandSender)
        {
            sender.sendMessage(ChatColor.RED + "You cannot send this command from console.");
            return true;
        }

        if (args.length != 1)
        {
            return false;
        }

        Player player = (Player) sender;
        CustomMobType mobType;
        try
        {
            mobType = CustomMobType.findMobType(args[0]);
        }
        catch (IllegalArgumentException ex)
        {
            sender.sendMessage(ChatColor.GRAY + "That mob does not exist.");
            return true;
        }
        try
        {
            CustomMob mob = mobType.getCustomMobClass().newInstance();
            mob.spawn(player, false);
            sender.sendMessage(ChatColor.GRAY + "Spawned a(n) " + mob.getName() + ChatColor.GRAY + ".");
        }
        catch (InstantiationException | IllegalAccessException e)
        {
            e.fillInStackTrace();
        }
        return true;
    }
}