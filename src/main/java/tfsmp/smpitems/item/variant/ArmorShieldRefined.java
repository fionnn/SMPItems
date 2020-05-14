package tfsmp.smpitems.item.variant;

import org.bukkit.attribute.Attribute;

public class ArmorShieldRefined extends Variant
{
    public ArmorShieldRefined()
    {
        super("Refined");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 0.5);
        super.addAttribute(Attribute.GENERIC_ARMOR_TOUGHNESS, 1);
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 22);
    }
}