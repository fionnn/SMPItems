package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;

public class FreedomBow extends CustomItem
{
    public FreedomBow()
    {
        super("Freedom Bow", Material.BOW, Rarity.RARE, ItemType.RANGED);
        super.setColor(ChatColor.BLUE);
        super.addLoreLine("&f+200% Speed");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 2.0);
        super.applyMetaToStack();
    }
}