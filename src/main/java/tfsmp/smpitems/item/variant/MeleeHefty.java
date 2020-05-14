package tfsmp.smpitems.item.variant;

import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;

public class MeleeHefty extends Variant
{
    public MeleeHefty()
    {
        super("Hefty");
        super.addAttribute(Attribute.GENERIC_ATTACK_SPEED, -0.5);
        super.addEnchant(Enchantment.KNOCKBACK, 1);
        super.addEnchant(Enchantment.DAMAGE_ALL, 1);
    }
}