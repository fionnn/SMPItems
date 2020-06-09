package tfsmp.smpitems.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import tfsmp.smpitems.SBase;
import tfsmp.smpitems.util.SLog;
import tfsmp.smpitems.util.SUtil;

public class Command_smpitems extends SBase implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if (args.length == 0)
        {
            sender.sendMessage(SUtil.color("&bSMPItems &3is a plugin which provides custom mobs, items, and effects. It is made for the TotalFreedom SMP Server."));
            sender.sendMessage(String.format(SUtil.color("&3Version &bv%s"), plugin.getDescription().getVersion()));
            sender.sendMessage(" ");
            sender.sendMessage(SUtil.color("&3Project Director&b: super"));
            sender.sendMessage(SUtil.color("&3Developers&b: square and speed"));
            sender.sendMessage(SUtil.color("&3Inspiration&b: Borderlands Series, Hypixel"));
            sender.sendMessage(SUtil.color("&3Special Thanks&b: fionn"));
            return true;
        }

        if (args[0].toLowerCase().equals("reload"))
        {
            if (!sender.isOp())
            {
                sender.sendMessage(SUtil.color("&cNo permission."));
                return true;
            }

            try
            {
                plugin.config.load();
                SLog.info("Reloaded successfully");
                sender.sendMessage(SUtil.color("&7The configuration file was reloaded successfully."));
                return true;
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
            return true;
        }
        return false;
    }
}