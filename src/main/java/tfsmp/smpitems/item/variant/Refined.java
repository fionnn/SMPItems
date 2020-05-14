package tfsmp.smpitems.item.variant;

import org.bukkit.attribute.Attribute;

public class Refined extends Variant
{
    public Refined()
    {
        super("Refined");
        super.addAttribute(Attribute.GENERIC_ATTACK_SPEED, 0.5);
        super.addAttribute(Attribute.GENERIC_ATTACK_DAMAGE, 0.5);
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 0.5);
    }
}