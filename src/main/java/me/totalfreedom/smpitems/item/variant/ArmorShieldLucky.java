package me.totalfreedom.smpitems.item.variant;

import org.bukkit.attribute.Attribute;

public class ArmorShieldLucky extends Variant
{
    public ArmorShieldLucky()
    {
        super("Lucky");
        super.addAttribute(Attribute.GENERIC_LUCK, 2);
    }
}