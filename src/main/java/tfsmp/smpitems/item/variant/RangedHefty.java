package tfsmp.smpitems.item.variant;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;

public class RangedHefty extends Variant
{
    public RangedHefty()
    {
        super("Hefty");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, -0.2, AttributeModifier.Operation.ADD_SCALAR);
        super.addEnchant(Enchantment.ARROW_KNOCKBACK, 1);
        super.addEnchant(Enchantment.ARROW_DAMAGE, 1);
    }
}