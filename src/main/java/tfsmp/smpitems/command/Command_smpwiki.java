package tfsmp.smpitems.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import tfsmp.smpitems.util.SUtil;

public class Command_smpwiki implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        sender.sendMessage(SUtil.color("&6SMPItems » &eFor more information about SMPItems, you can visit the wiki: https://smp.totalfreedom.me/w/index.php?title=Main_Page"));
        return true;
    }
}
