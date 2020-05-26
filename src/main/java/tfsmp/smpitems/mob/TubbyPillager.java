package tfsmp.smpitems.mob;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import tfsmp.smpitems.item.FleshSword;

public class TubbyPillager extends CustomMob
{
    public TubbyPillager()
    {
        super(EntityType.PILLAGER, ChatColor.LIGHT_PURPLE + "Tubby Pillager");
        super.setHoldableItem(new FleshSword());
        super.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 2));
        super.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 9999999, 2));
    }
}
