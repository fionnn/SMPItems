package tfsmp.smpitems.item.variant;

import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;

public class Smooth extends Variant
{
    public Smooth()
    {
        super("Smooth");
        super.addAttribute(Attribute.GENERIC_ATTACK_DAMAGE, 2.0);
    }
}