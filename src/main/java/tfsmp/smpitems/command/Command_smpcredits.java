package tfsmp.smpitems.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import tfsmp.smpitems.util.SUtil;

public class Command_smpcredits implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        sender.sendMessage(String.format(SUtil.color("&3&oSMPItems v%s"), SUtil.VERSION));
        sender.sendMessage(SUtil.color("&3Project Director&b: super"));
        sender.sendMessage(SUtil.color("&3Programmers&b: square and speed"));
        sender.sendMessage(SUtil.color("&3Inspiration&b: Borderlands Series, Hypixel"));
        sender.sendMessage(SUtil.color("&3Special Thanks&b: fionn for being a sexy beast"));
        return true;
    }
}