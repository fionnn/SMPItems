package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;

public class FreedomBow extends CustomItem
{
    public FreedomBow()
    {
        super("Freedom Bow", Material.BOW, Rarity.RARE, ItemType.RANGED);
        super.addLoreLine("&b+100% Speed");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 1, AttributeModifier.Operation.ADD_SCALAR);
        super.applyMetaToStack();
    }
}