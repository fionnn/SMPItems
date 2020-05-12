package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class FreedomSword extends CustomItem
{
    public FreedomSword()
    {
        super("Freedom Sword", Material.DIAMOND_SWORD, Rarity.RARE);
        super.addLoreLine("+200% Speed")
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 2.0);
        super.applyMetaToStack();
    }
}