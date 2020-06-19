package me.totalfreedom.smpitems.mob;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class TubbySpider extends CustomMob
{
    public TubbySpider()
    {
        super(EntityType.SPIDER, ChatColor.GOLD + "Tubby Spider");
        super.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 9999999, 2));
        super.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 9999999, 5));
        super.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 2));
    }
}