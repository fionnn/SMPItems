package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import tfsmp.smpitems.util.Groups;

public class Axe extends CustomItem
{
    public Axe()
    {
        super(ChatColor.BLUE + "Axe!", Groups.VANILLA_AXES, Rarity.RARE);
        super.addLoreLine("&f+150% Speed");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 1.5);
        super.applyMetaToStack();
    }
}