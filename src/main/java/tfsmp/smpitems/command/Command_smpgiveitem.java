package tfsmp.smpitems.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import tfsmp.smpitems.item.CustomItem;
import tfsmp.smpitems.item.CustomItemType;

public class Command_smpgiveitem implements CommandExecutor
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
        CustomItemType customItemType;

        try
        {
            customItemType = CustomItemType.findItemType(args[0]);
        }

        catch (IllegalArgumentException ex)
        {
            sender.sendMessage(ChatColor.GRAY + "That item does not exist.");
            return true;
        }

        try
        {
            CustomItem item = customItemType.getCustomItemClass().newInstance();
            if (player.getInventory().firstEmpty() == -1)
            {
                sender.sendMessage(ChatColor.GRAY + "No space in inventory for item.");
                return true;
            }
            int empty = player.getInventory().firstEmpty();
            player.getInventory().setItem(empty, item.getStack());
            sender.sendMessage(ChatColor.GRAY + "Gave you a(n) " + item.getName() + ChatColor.GRAY + ".");
        }
        catch (InstantiationException | IllegalAccessException e)
        {
            e.fillInStackTrace();
        }
        return true;
    }
}
