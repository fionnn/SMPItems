package tfsmp.smpitems.item.variant;

import org.bukkit.attribute.Attribute;

public class Fast extends Variant
{
    public Fast()
    {
        super("Fast");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 0.4);
    }
}