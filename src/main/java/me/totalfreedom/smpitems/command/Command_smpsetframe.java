package me.totalfreedom.smpitems.command;

import me.totalfreedom.smpitems.SBase;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import me.totalfreedom.smpitems.util.SUtil;

public class Command_smpsetframe extends SBase implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String c, String[] args)
    {
        if (!sender.isOp())
        {
            sender.sendMessage(ChatColor.RED + "No permission.");
            return true;
        }

        if (args.length != 4)
        {
            return false;
        }

        int frameID, x, y, z;

        try
        {
            frameID = Integer.parseInt(args[0]);
            x = Integer.parseInt(args[1]);
            y = Integer.parseInt(args[2]);
            z = Integer.parseInt(args[3]);
        }
        catch (Exception ex)
        {
            sender.sendMessage(ChatColor.GRAY + "One of the numbers you entered was invalid.");
            return true;
        }

        if (frameID < 1 || frameID > 4)
        {
            sender.sendMessage(ChatColor.RED + "That frame does not exist.");
            return true;
        }

        World endWorld = SUtil.endWorld;

        if (endWorld == null)
        {
            sender.sendMessage(ChatColor.RED + "The end world cannot be found.");
            return true;
        }

        if (endWorld.getBlockAt(x, y, z).getType() != Material.END_PORTAL_FRAME)
        {
            sender.sendMessage(ChatColor.RED + "The block at that location does not seem to be a portal frame.");
            return true;
        }

        plugin.config.set("server.ender_dragon.frame" + frameID + ".x", x);
        plugin.config.set("server.ender_dragon.frame" + frameID + ".y", y);
        plugin.config.set("server.ender_dragon.frame" + frameID + ".z", z);
        plugin.config.save();
        sender.sendMessage(SUtil.color("&aFrame " + frameID + " set to &2" + x + "&a, &2" + y + "&a, &2" + z + "&a."));
        return true;
    }
}