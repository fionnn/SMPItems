package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;

public class Boots extends CustomItem
{
    public Boots()
    {
        super("Boots", Material.IRON_BOOTS, Rarity.RARE, ItemType.ARMOR);
        super.addLoreLine("&b+20% Speed");
        super.addLoreLine("&a+3 Health");
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 3);
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 0.2, AttributeModifier.Operation.ADD_SCALAR);
        super.applyMetaToStack();
    }
}