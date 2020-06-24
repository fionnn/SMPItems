package me.totalfreedom.smpitems.mob;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class TubbyEnderman extends CustomMob
{
    public TubbyEnderman()
    {
        super(EntityType.ENDERMAN, ChatColor.RED + "Tubby Enderman");
        super.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 3));
        super.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 9999999, 2));
        super.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 9999999, 1));
    }
}