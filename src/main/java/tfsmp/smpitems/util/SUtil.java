package tfsmp.smpitems.util;

import org.bukkit.ChatColor;

import java.util.Random;

public class SUtil
{
    public static String color(String s)
    {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static boolean gotRandom(int chance)
    {
        return new Random().nextInt(chance) == 1;
    }
}