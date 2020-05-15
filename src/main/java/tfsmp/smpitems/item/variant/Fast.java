package tfsmp.smpitems.item.variant;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;

public class Fast extends Variant
{
    public Fast()
    {
        super("Fast");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 0.4, AttributeModifier.Operation.ADD_SCALAR);
    }
}