package me.totalfreedom.smpitems.item.variant;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;

public class Refined extends Variant
{
    public Refined()
    {
        super("Refined");
        super.addAttribute(Attribute.GENERIC_ATTACK_SPEED, 0.5);
        super.addAttribute(Attribute.GENERIC_ATTACK_DAMAGE, 0.5, AttributeModifier.Operation.ADD_SCALAR);
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 0.2, AttributeModifier.Operation.ADD_SCALAR);
    }
}