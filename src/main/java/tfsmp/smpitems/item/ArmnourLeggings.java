package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;

public class ArmnourLeggings extends CustomItem
{
    public ArmnourLeggings()
    {
        super("Leggingns", Material.IRON_LEGGINGS, Rarity.UNCOMMON, ItemType.ARMOR);
        super.addLoreLine("&a+5 Health");
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 25);
        super.applyMetaToStack();
    }
}