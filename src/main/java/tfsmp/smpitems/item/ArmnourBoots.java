package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;

public class ArmnourBoots extends CustomItem
{
    public ArmnourBoots()
    {
        super("Bootns", Material.IRON_BOOTS, Rarity.UNCOMMON, ItemType.ARMOR);
        super.addLoreLine("&a+5 Health");
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 25);
        super.applyMetaToStack();
    }
}