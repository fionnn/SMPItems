package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;

public class FreedomPick extends CustomItem
{
    public FreedomPick()
    {
        super("Freedom Pickaxe", Material.DIAMOND_PICKAXE, Rarity.RARE);
        super.addLoreLine("+200% Speed");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 2.0);
        super.applyMetaToStack();
    }
}