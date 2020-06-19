package me.totalfreedom.smpitems.item.variant;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;

public class ShieldHefty extends Variant
{
    public ShieldHefty()
    {
        super("Hefty");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, -0.2, AttributeModifier.Operation.ADD_SCALAR);
        super.addAttribute(Attribute.GENERIC_ARMOR_TOUGHNESS, 3);
    }
}