package me.totalfreedom.smpitems.item.variant;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;

public class Smooth extends Variant
{
    public Smooth()
    {
        super("Smooth");
        super.addAttribute(Attribute.GENERIC_ATTACK_DAMAGE, 2.0, AttributeModifier.Operation.ADD_SCALAR);
    }
}