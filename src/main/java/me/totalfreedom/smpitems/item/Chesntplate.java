package me.totalfreedom.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;

public class Chesntplate extends CustomItem
{
    public Chesntplate()
    {
        super("Chesntplate", Material.IRON_CHESTPLATE, Rarity.UNCOMMON, ItemType.ARMOR);
        super.addLoreLine("&a+5 Health");
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 5);
        super.applyMetaToStack();
    }
}