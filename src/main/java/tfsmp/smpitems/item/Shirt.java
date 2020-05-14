package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;

public class Shirt extends CustomItem
{
    public Shirt()
    {
        super("Shirt", Material.IRON_CHESTPLATE, Rarity.RARE, ItemType.ARMOR);
        super.addLoreLine("&b+20% Speed");
        super.addLoreLine("&a+3 Health");
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 23);
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 2);
        super.applyMetaToStack();
    }
}