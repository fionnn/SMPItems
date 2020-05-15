package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;

public class ArmnourChest extends CustomItem
{
    public ArmnourChest()
    {
        super("Chesntplate", Material.IRON_CHESTPLATE, Rarity.UNCOMMON, ItemType.ARMOR);
        super.addLoreLine("&a+5 Health");
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 5);
        super.applyMetaToStack();
    }
}