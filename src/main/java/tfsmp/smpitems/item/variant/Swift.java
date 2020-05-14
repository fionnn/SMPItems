package tfsmp.smpitems.item.variant;

import org.bukkit.attribute.Attribute;

public class Swift extends Variant
{
    public Swift()
    {
        super("Swift");
        super.addAttribute(Attribute.GENERIC_ATTACK_SPEED, 1.5);
    }
}