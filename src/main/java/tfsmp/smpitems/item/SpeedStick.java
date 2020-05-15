package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;

public class SpeedStick extends CustomItem
{
    public SpeedStick()
    {
        super("speed stick!!!", Material.STICK, Rarity.EPIC, ItemType.OTHER);
        super.addLoreLine("&d+300% Speed");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 3, AttributeModifier.Operation.ADD_SCALAR);
        super.applyMetaToStack();
    }
}