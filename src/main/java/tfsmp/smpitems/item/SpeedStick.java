package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;

public class SpeedStick extends CustomItem
{
    public SpeedStick()
    {
        super("speed stick!!!", Material.STICK, Rarity.EPIC, ItemType.OTHER);
        super.setColor(ChatColor.DARK_PURPLE);
        super.addLoreLine("&f+500% Speed");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 5);
        super.applyMetaToStack();
    }
}