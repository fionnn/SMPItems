package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import tfsmp.smpitems.util.Groups;

public class FreedomAxe extends CustomItem
{
    public FreedomAxe()
    {
        super(ChatColor.BLUE + "Freedom Axe", Groups.VANILLA_AXES, Rarity.RARE);
        super.addLoreLine("&f+200% Speed");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 2.0);
        super.applyMetaToStack();
    }
}