package tfsmp.smpitems.mob;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class TubbyCreeper extends CustomMob
{
    public TubbyCreeper()
    {
        super(EntityType.CREEPER, ChatColor.RED + "Tubby Creeper");
        super.setPowered(true);
        super.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 999, 1));
        super.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 9999999, 5));
        super.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 9999999, 1));
    }
}