package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;

public class Square extends CustomItem
{
    public Square()
    {
        super(ChatColor.YELLOW + "shape", Material.QUARTZ_BLOCK, Rarity.SPECIAL);
        super.addLoreLine("&cthis is a cube not a square");
        super.addEnchant(Enchantment.KNOCKBACK, 10);
        super.applyMetaToStack();
    }
}