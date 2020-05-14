package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import tfsmp.smpitems.util.Groups;

public class FreedomSword extends CustomItem
{
    public FreedomSword()
    {
        super(ChatColor.BLUE + "Freedom Sword", Groups.VANILLA_SWORDS, Rarity.RARE);
        super.addLoreLine("&f+200% Speed");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 2.0);
        super.applyMetaToStack();
    }
}