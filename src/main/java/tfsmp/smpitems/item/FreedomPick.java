package tfsmp.smpitems.item;

import org.bukkit.attribute.Attribute;
import tfsmp.smpitems.util.Groups;

public class FreedomPick extends CustomItem
{
    public FreedomPick()
    {
        super("Freedom Pickaxe", Groups.VANILLA_PICKAXES, Rarity.RARE, ItemType.TOOLS);
        super.addLoreLine("+200% Speed");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 2.0);
        super.applyMetaToStack();
    }
}