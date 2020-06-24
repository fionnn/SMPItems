package me.totalfreedom.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;

public class Shield extends CustomItem
{
    public Shield()
    {
        super("Shield", Material.SHIELD, Rarity.COMMON, ItemType.SHIELD);
        super.addLoreLine("&a+3 Health");
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 3);
        super.applyMetaToStack();
    }
}