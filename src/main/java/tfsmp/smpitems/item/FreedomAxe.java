package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;

public class FreedomAxe extends CustomItem
{
    public FreedomAxe()
    {
        super("Freedom Axe", Material.DIAMOND_AXE, Rarity.RARE);
        super.addLoreLine("+200% Speed");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 2.0);
        super.applyMetaToStack();
    }
}