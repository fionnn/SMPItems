package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;

public class TurtleShield extends CustomItem
{
    public TurtleShield()
    {
        super("Turtle Shield", Material.SHIELD, Rarity.LEGENDARY, ItemType.SHIELD);
        super.addLoreLine("&cThe strength of a turtle, the speed of a hare.");
        super.addLoreLine("&b+75% Knockback Resistance");
        super.addLoreLine("&a+20 Health");
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 20);
        super.addAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE, 0.75, AttributeModifier.Operation.ADD_SCALAR);
        super.applyMetaToStack();
    }
}