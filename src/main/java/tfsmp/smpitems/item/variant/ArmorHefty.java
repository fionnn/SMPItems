package tfsmp.smpitems.item.variant;

import org.bukkit.attribute.Attribute;

public class ArmorHefty extends Variant
{
    public ArmorHefty()
    {
        super("Hefty");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, -0.5);
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 26);
        super.addAttribute(Attribute.GENERIC_ARMOR_TOUGHNESS, 1);
    }
}