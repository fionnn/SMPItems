package tfsmp.smpitems.item.variant;

import org.bukkit.attribute.Attribute;

public class Padded extends Variant
{
    public Padded()
    {
        super("Padded");
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 24);
    }
}