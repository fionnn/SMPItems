package tfsmp.smpitems.item.variant;

import org.bukkit.attribute.Attribute;

public class Light extends Variant
{
    public Light()
    {
        super("Light");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 1);
    }
}