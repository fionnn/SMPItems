package tfsmp.smpitems.item.variant;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;

public class Light extends Variant
{
    public Light()
    {
        super("Light");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 0.3, AttributeModifier.Operation.ADD_SCALAR);
    }
}