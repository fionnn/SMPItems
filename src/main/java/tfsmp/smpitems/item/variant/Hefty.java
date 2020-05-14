package tfsmp.smpitems.item.variant;

import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;

public class Hefty extends Variant
{
    public Hefty()
    {
        super("Hefty");
        super.addAttribute(Attribute.GENERIC_ATTACK_SPEED, -0.5);
        super.addEnchant(Enchantment.KNOCKBACK, 1);
        super.addEnchant(Enchantment.DAMAGE_ALL, 1);
    }
}