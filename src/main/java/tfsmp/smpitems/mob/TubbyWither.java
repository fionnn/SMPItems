package tfsmp.smpitems.mob;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class TubbyWither extends CustomMob
{
    public TubbyWither()
    {
        super(EntityType.WITHER, ChatColor.DARK_RED + "Tubby Wither");
        super.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 25));
    }

    public void init()
    {
        getEntity().setMaxHealth(1000.0);
        getEntity().setHealth(getEntity().getMaxHealth());
    }
}