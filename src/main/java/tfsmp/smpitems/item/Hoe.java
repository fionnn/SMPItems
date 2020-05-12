package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class Hoe extends CustomItem
{
    public Hoe()
    {
        super("hoe", Material.IRON_HOE, Rarity.COMMON);
        super.addLoreLine("&f2 Efficiency")
        super.addEnchant(Enchantment.DIG_SPEED, 2);
        super.applyMetaToStack();
    }
}