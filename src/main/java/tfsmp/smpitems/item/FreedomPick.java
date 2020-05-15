package tfsmp.smpitems.item;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import tfsmp.smpitems.util.Groups;

public class FreedomPick extends CustomItem
{
    public FreedomPick()
    {
        super("Freedom Pickaxe", Groups.VANILLA_PICKAXES, Rarity.RARE, ItemType.TOOLS);
        super.addLoreLine("&b+100% Speed");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 1, AttributeModifier.Operation.ADD_SCALAR);
        super.applyMetaToStack();
    }
}