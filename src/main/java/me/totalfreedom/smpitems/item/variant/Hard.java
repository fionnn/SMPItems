package me.totalfreedom.smpitems.item.variant;

import org.bukkit.attribute.Attribute;

public class Hard extends Variant
{
    public Hard()
    {
        super("Hard");
        super.addAttribute(Attribute.GENERIC_ARMOR_TOUGHNESS, 1);
    }
}