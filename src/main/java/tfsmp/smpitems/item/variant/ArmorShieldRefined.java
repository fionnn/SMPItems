package tfsmp.smpitems.item.variant;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;

public class ArmorShieldRefined extends Variant
{
    public ArmorShieldRefined()
    {
        super("Refined");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 0.2, AttributeModifier.Operation.ADD_SCALAR);
        super.addAttribute(Attribute.GENERIC_ARMOR_TOUGHNESS, 1);
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 2);
    }
}