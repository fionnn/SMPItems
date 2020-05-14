package tfsmp.smpitems.util;

import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;

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

    public static String getStringAttribute(Attribute attr)
    {
        switch (attr)
        {
            case GENERIC_MAX_HEALTH: return "generic.maxHealth";
            case GENERIC_MOVEMENT_SPEED: return "generic.movementSpeed";
            case GENERIC_ATTACK_DAMAGE: return "generic.attackDamage";
            case GENERIC_LUCK: return "generic.luck";
            case GENERIC_FOLLOW_RANGE: return "generic.followRange";
            case GENERIC_ARMOR: return "generic.armor";
            case HORSE_JUMP_STRENGTH: return "horse.jumpStrength";
            case GENERIC_ATTACK_SPEED: return "generic.attackSpeed";
            case GENERIC_FLYING_SPEED: return "generic.flyingSpeed";
            case GENERIC_ARMOR_TOUGHNESS: return "generic.armorToughness";
            case ZOMBIE_SPAWN_REINFORCEMENTS: return "zombie.spawnReinforcements";
            case GENERIC_KNOCKBACK_RESISTANCE: return "generic.knockbackResistance";
            default: return "";
        }
    }
}