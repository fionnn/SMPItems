package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;

public class Axe extends CustomItem
{
    public Axe()
    {
        super(ChatColor.GRAY + "Axe!", Material.IRON_AXE, Rarity.COMMON);
        super.addLoreLine("+100% speed");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 1.0);
        super.applyMetaToStack();
    }
}