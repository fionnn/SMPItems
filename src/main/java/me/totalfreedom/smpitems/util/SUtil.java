package me.totalfreedom.smpitems.util;

import me.totalfreedom.smpitems.SMPItems;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.inventory.ItemStack;
import me.totalfreedom.smpitems.item.CustomItem;

import java.util.Random;

public class SUtil
{
    private static SMPItems plugin = SMPItems.plugin;

    public static World endWorld = Bukkit.getWorld(plugin.config.getString("server.ender_dragon.end_world"));

    public static String color(String s)
    {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static boolean gotRandom(int chance)
    {
        return new Random().nextInt(chance) == 1;
    }

    public static String getStringAttribute(Attribute attr)
    {
        switch (attr)
        {
            case GENERIC_MAX_HEALTH: return "generic.max_health";
            case GENERIC_MOVEMENT_SPEED: return "generic.movement_speed";
            case GENERIC_ATTACK_DAMAGE: return "generic.attack_damage";
            case GENERIC_LUCK: return "generic.luck";
            case GENERIC_FOLLOW_RANGE: return "generic.follow_range";
            case GENERIC_ARMOR: return "generic.armor";
            case HORSE_JUMP_STRENGTH: return "horse.jump_strength";
            case GENERIC_ATTACK_SPEED: return "generic.attack_speed";
            case GENERIC_FLYING_SPEED: return "generic.flying_speed";
            case GENERIC_ARMOR_TOUGHNESS: return "generic.armor_toughness";
            case ZOMBIE_SPAWN_REINFORCEMENTS: return "zombie.spawn_reinforcements";
            case GENERIC_KNOCKBACK_RESISTANCE: return "generic.knockback_resistance";
            default: return "";
        }
    }

    public static boolean isItemValid(ItemStack check, CustomItem compare)
    {
        if (!check.hasItemMeta())
        {
            return false;
        }

        if (!check.getItemMeta().hasDisplayName())
        {
            return false;
        }
        return check.getItemMeta().getDisplayName().startsWith(compare.getColor() + "") &&
                check.getItemMeta().getDisplayName().endsWith(compare.getRawName());
    }

    public static int getFrameOccupiedCount()
    {
        int count = 0;
        for (int i = 1; i < 5; i++)
        {
            if (plugin.config.getBoolean("server.ender_dragon.frame" + i + ".occupied"))
            {
                count++;
            }
        }
        return count;
    }

    public static Location getFrameLocation(int frameID)
    {
        return new Location(endWorld, plugin.config.getInt("server.ender_dragon.frame" + frameID + ".x"),
                plugin.config.getInt("server.ender_dragon.frame" + frameID + ".y"),
                    plugin.config.getInt("server.ender_dragon.frame" + frameID + ".z"));
    }
}