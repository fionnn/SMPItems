package me.totalfreedom.smpitems.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import java.util.Objects;

public class Command_smpkilltubbies implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {

        if (!sender.isOp())
        {
            sender.sendMessage(ChatColor.RED + "No permission.");
            return true;
        }

        int count = 0;
        for (Entity entity : Bukkit.getWorld("world").getEntities())
        {
            if (!(entity instanceof Player) && entity instanceof LivingEntity &&
                    (Objects.equals(entity.getCustomName(), ChatColor.RED + "Tubby Creeper") ||
                            Objects.equals(entity.getCustomName(), ChatColor.RED + "Tubby Enderman") ||
                            Objects.equals(entity.getCustomName(), ChatColor.GOLD + "Tubby Skeleton") ||
                            Objects.equals(entity.getCustomName(), ChatColor.LIGHT_PURPLE + "Tubby Loot Midget") ||
                            Objects.equals(entity.getCustomName(), ChatColor.GOLD + "Tubby Spider") ||
                            Objects.equals(entity.getCustomName(), ChatColor.LIGHT_PURPLE + "Tubby Stray") ||
                            Objects.equals(entity.getCustomName(), ChatColor.LIGHT_PURPLE + "Tubby Wither Skeleton") ||
                            Objects.equals(entity.getCustomName(), ChatColor.GOLD + "Tubby Zombie")))
            {
                ((LivingEntity) entity).setHealth(0.0);
                count++;
            }
        }
        sender.sendMessage(ChatColor.GRAY + "Killed " + count + " tubbies.");
        return true;
    }
}
