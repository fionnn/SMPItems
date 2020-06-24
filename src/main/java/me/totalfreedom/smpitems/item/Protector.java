package me.totalfreedom.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;

public class Protector extends CustomItem
{
    public Protector()
    {
        super("Protector", Material.SHIELD, Rarity.UNCOMMON, ItemType.SHIELD);
        super.addLoreLine("&a+5 Health");
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 5);
        super.applyMetaToStack();
    }
}