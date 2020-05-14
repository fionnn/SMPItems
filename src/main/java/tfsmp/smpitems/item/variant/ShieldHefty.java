package tfsmp.smpitems.item.variant;

import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;

public class ShieldHefty extends Variant
{
    public ShieldHefty()
    {
        super("Hefty");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, -0.5);
        super.addAttribute(Attribute.GENERIC_ARMOR_TOUGHNESS, 3);
    }
}