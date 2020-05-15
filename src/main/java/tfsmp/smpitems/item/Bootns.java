package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;

public class Bootns extends CustomItem
{
    public Bootns()
    {
        super("Bootns", Material.IRON_BOOTS, Rarity.UNCOMMON, ItemType.ARMOR);
        super.addLoreLine("&a+5 Health");
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 5);
        super.applyMetaToStack();
    }
}